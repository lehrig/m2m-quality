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
import de.upb.m2m.quality.casestudies.Shapes.Circle;
import de.upb.m2m.quality.casestudies.Shapes.RootBlock;
import de.upb.m2m.quality.casestudies.Shapes.ShapesFactory;
import de.upb.m2m.quality.casestudies.Shapes.ShapesPackage;
import de.upb.m2m.quality.casestudies.Shapes.Square;
import de.upb.m2m.quality.casestudies.Shapes.impl.CircleImpl;

/**
 * This transformation specifies refinement that transforms each circle to a
 * square-arrow-circle combination.
 * 
 * Implementation time: 10 Minutes.
 * 
 * @see MediniQVT Plugin "Rule10" (original scenario)
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class ShapesRule10 {
	/**
	 * The Apache logger.
	 */
	private static final Logger LOGGER = Logger.getLogger(ShapesRule10.class);

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
	public ShapesRule10(String sourceShapesPath, String targetShapesPath) {
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
	 * First copies the model, then selects every circle, creates a
	 * square-arrow-circle combination for it, and deletes it finally.
	 */
	public void transform() {
		this.targetRootBlock = copy(this.sourceRootBlock);

		List<CircleImpl> circles = allSubobjectsOfKind(targetRootBlock,
				CircleImpl.class);

		for (Circle circle : circles) {
			Square newSquare = createSquare(circle);
			Circle newCircle = createCircle(circle);
			createArrow(circle, newSquare, newCircle);
			EcoreUtil.delete(circle);
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
	 * Creates a new square by using information from a given circle.
	 * 
	 * @param circle
	 *            The circle to be used as a template
	 * @return The newly created square
	 */
	private Square createSquare(Circle circle) {
		Square square = factory.createSquare();
		square.setName(circle.getName() + " square");
		square.setBlock(circle.getBlock());
		square.getInArrow().addAll(circle.getInArrow());
		return square;
	}

	/**
	 * Creates a new circle by using information from a given circle.
	 * 
	 * @param circle
	 *            The circle to be used as a template
	 * @return The newly created circle
	 */
	private Circle createCircle(Circle circle) {
		Circle newCircle = factory.createCircle();
		newCircle.setName(circle.getName() + " circle");
		newCircle.setBlock(circle.getBlock());
		newCircle.getOutArrow().addAll(circle.getOutArrow());
		return newCircle;
	}

	/**
	 * Creates a new arrow between a given square and a circle. Another given
	 * circle provides information for the name and block of the new arrow.
	 * 
	 * @param circle
	 *            The circle to be used for name and block calculation
	 * @param sourceSquare
	 *            The square to be connected from
	 * @param targetCircle
	 *            The circle to be connected to
	 */
	private void createArrow(Circle circle, Square sourceSquare,
			Circle targetCircle) {
		Arrow newArrow = factory.createArrow();
		newArrow.setName(circle.getName() + " arrow");
		newArrow.setBlock(circle.getBlock());
		newArrow.setSource(sourceSquare);
		newArrow.setTarget(targetCircle);
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
		ShapesRule10 shapesRule10;
		try {
			shapesRule10 = new ShapesRule10(modelPaths[0], modelPaths[1]);
			shapesRule10.transform();
			shapesRule10.save();
		} catch (Exception e) {
			LOGGER.error("Transformation aborted. Reason: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
