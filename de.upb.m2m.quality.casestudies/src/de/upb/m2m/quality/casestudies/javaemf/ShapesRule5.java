package de.upb.m2m.quality.casestudies.javaemf;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.upb.m2m.quality.casestudies.Shapes.Arrow;
import de.upb.m2m.quality.casestudies.Shapes.Block;
import de.upb.m2m.quality.casestudies.Shapes.RootBlock;
import de.upb.m2m.quality.casestudies.Shapes.Shape;
import de.upb.m2m.quality.casestudies.Shapes.ShapesFactory;
import de.upb.m2m.quality.casestudies.Shapes.ShapesPackage;
import de.upb.m2m.quality.casestudies.Shapes.Triangle;
import de.upb.m2m.quality.casestudies.Shapes.impl.TriangleImpl;

/**
 * This transformation specifies an abstraction that removes all triangles and
 * reconnects arrows belonging to it accordingly.
 * 
 * Implementation time: 35 Minutes.
 * 
 * @see MediniQVT Plugin "Rule5" (original scenario)
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class ShapesRule5 {
	/**
	 * The Apache logger.
	 */
	private static final Logger LOGGER = Logger.getLogger(ShapesRule5.class);

	/**
	 * Path to Shapes' metamodel. Important for setting the nsURI in Shapes
	 * model instance.
	 */
	private static final String METAMODEL_PATH_SHAPES = "platform:/resource/"
			+ "de.upb.m2m.quality.casestudies/"
			+ "metamodel/ShapesTutorial/Shapes.ecore";

	/**
	 * The RootBlock representing the primary entry point to the source Shapes
	 * model instance.
	 */
	private RootBlock sourceRootBlock;

	/**
	 * The RootBlock representing the primary entry point to the target Shapes
	 * model instance.
	 */
	private RootBlock targetRootBlock;

	/**
	 * Factory for creating Shapes model elements.
	 */
	private ShapesFactory factory;

	/**
	 * URI to which the transformation target is saved to.
	 */
	private URI targetURI;

	/**
	 * Default constructor. Loads the passed source Shapes model and an initial
	 * target Shapes model as member variables.
	 * 
	 * @param sourceShapesPath
	 *            Path to the source shapes model
	 * @param targetShapesPath
	 *            Path to the target shapes model
	 */
	public ShapesRule5(String sourceShapesPath, String targetShapesPath) {
		loadShapesModel(sourceShapesPath);
		initializeShapesModel();
		this.targetURI = URI.createURI(targetShapesPath);
	}

	/**
	 * Loads an existing Shapes model.
	 * 
	 * @param modelPath
	 *            Path to the Shapes model
	 * @see http://www.vogella.com/articles/EclipseEMFPersistence/article.html
	 */
	private void loadShapesModel(String modelPath) {
		// Initialize the model
		ShapesPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the .shapes extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("shapes", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createURI(modelPath), true);

		// Get the first model element and cast it to the right type
		EObject obj = resource.getContents().get(0);
		if (obj instanceof RootBlock) {
			sourceRootBlock = (RootBlock) obj;
		} else {
			throw new IllegalArgumentException(
					"RootBlock has to be first element in " + modelPath);
		}

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Loaded Shapes model from " + modelPath);
		}
	}

	/**
	 * Creates a new Shapes model with one RootBlock in its root.
	 */
	private void initializeShapesModel() {
		// Initialize the model
		ShapesPackage.eINSTANCE.eClass();
		ShapesPackage.eINSTANCE.setNsURI(METAMODEL_PATH_SHAPES);

		// Retrieve the default factory singleton
		factory = ShapesFactory.eINSTANCE;

		// Create the content of the model via this program
		targetRootBlock = factory.createRootBlock();
	}

	/**
	 * Saves the contents of the targetRootBlock member variable to the
	 * specified output URI.
	 * 
	 * @see http://www.vogella.com/articles/EclipseEMFPersistence/article.html
	 */
	public void save() {
		// Register the XMI resource factory for the .xmi extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Create a resource
		Resource resource = resSet.createResource(this.targetURI);

		// Get the first model element and cast it to the right type
		resource.getContents().add(targetRootBlock);

		// Now save the content.
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMIResource.OPTION_ENCODING, "UTF-8");
		try {
			resource.save(options);
		} catch (IOException e) {
			LOGGER.error("IOException when trying to save to " + this.targetURI);
		}

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Saved Shapes model to " + this.targetURI);
		}
	}

	/**
	 * Executes the transformation from a Shapes model to a new Shapes model.
	 * First copies the model, then selects every triangle, rewires (links every
	 * source of incoming arrows to every target of outgoing arrows by new
	 * arrows), and finally deletes the triangle.
	 */
	public void transform() {
		this.targetRootBlock = copy(this.sourceRootBlock);

		List<TriangleImpl> triangles = allSubobjectsOfKind(targetRootBlock,
				TriangleImpl.class);

		for (Triangle triangle : triangles) {
			rewire(triangle);
			EcoreUtil.delete(triangle);
		}

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Completed Transformation");
		}
	}

	/**
	 * Returns iteratively all sub objects filtered by a type of an object.
	 * 
	 * @param rootObject
	 *            The object to find the sub objects for
	 * @param type
	 *            The type to filter for
	 * @param <T>
	 *            Any object inheriting from EObject
	 * @return A list of found sub objects
	 */
	@SuppressWarnings("unchecked")
	// caused by instanceof simulation
	private <T extends EObject> List<T> allSubobjectsOfKind(EObject rootObject,
			Class<T> type) {
		List<T> result = new LinkedList<T>();
		TreeIterator<EObject> iterator = rootObject.eAllContents();
		while (iterator.hasNext()) {
			EObject eObj = iterator.next();
			if (eObj.getClass() == type) { // simulates instanceof
				result.add((T) eObj);
			}
		}
		return result;
	}

	/**
	 * Rewires the given shape, i.e., the helper links every source of incoming
	 * arrows to every target of outgoing arrows by new arrows. The original
	 * arrows are deleted afterwards.
	 * 
	 * @param shape
	 *            The shape to be rewired
	 */
	private void rewire(Shape shape) {
		List<Arrow> inArrows = shape.getInArrow();
		List<Arrow> outArrows = shape.getOutArrow();

		for (Arrow inArrow : inArrows) {
			for (Arrow outArrow : outArrows) {
				createArrow(inArrow.getSource(), outArrow.getTarget(),
						getArrowName(inArrow, outArrow), shape.getBlock());
			}
		}

		// the following two loops need arrays instead of lists due to
		// synchronization when using the "EcoreUtil.delete" method
		for (Arrow inArrow : inArrows.toArray(new Arrow[0])) {
			EcoreUtil.delete(inArrow);
		}

		for (Arrow outArrow : outArrows.toArray(new Arrow[0])) {
			EcoreUtil.delete(outArrow);
		}
	}

	/**
	 * Creates the name for an arrow. If the given (a) source arrows' source is
	 * a triangle, or (b) target arrows' target is a triangle, then these the
	 * respective arrow does not contribute to the new arrow name.
	 * 
	 * @param src
	 *            A source arrow may contributing to the new name
	 * @param tgt
	 *            A target arrow may contributing to the new name
	 * @return The new arrow name
	 */
	private String getArrowName(Arrow src, Arrow tgt) {
		String arrowName = "";

		if (!(src.getSource() instanceof Triangle)) {
			arrowName = src.getName();
			if (!(tgt.getTarget() instanceof Triangle)) {
				arrowName += "_" + tgt.getName();
			}
		} else {
			if (!(tgt.getTarget() instanceof Triangle)) {
				arrowName = tgt.getName();
			}
		}

		return arrowName;
	}

	/**
	 * Creates a new arrow.
	 * 
	 * @param src
	 *            The source of the Arrow
	 * @param tgt
	 *            The target of the Arrow
	 * @param name
	 *            The name of the Arrow
	 * @param block
	 *            The block the Arrow belongs to
	 */
	private void createArrow(Shape src, Shape tgt, String name, Block block) {
		Arrow arrow = factory.createArrow();
		arrow.setName(name);
		arrow.setBlock(block);
		arrow.setSource(src);
		arrow.setTarget(tgt);
	}

	/**
	 * Returns a copy of the given sourceRootBlock.
	 * 
	 * @param sourceRootBlock
	 *            The source root block to copy
	 * @return A copy of sourceRootBlock
	 */
	private RootBlock copy(RootBlock sourceRootBlock) {
		Copier copier = new Copier(true);
		RootBlock result = (RootBlock) copier.copy(sourceRootBlock);
		copier.copyReferences();
		return result;
	}

	/**
	 * Transformation entry point.
	 * 
	 * @param modelPaths
	 *            Array including paths to model instances involved in the
	 *            transformation
	 */
	public static void main(String[] modelPaths) {
		ShapesRule5 shapesRule5;
		try {
			shapesRule5 = new ShapesRule5(modelPaths[0], modelPaths[1]);
			shapesRule5.transform();
			shapesRule5.save();
		} catch (Exception e) {
			LOGGER.error("Transformation aborted. Reason: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
