package de.upb.m2m.quality.casestudies.javaemf;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.upb.m2m.quality.casestudies.Shapes.Arrow;
import de.upb.m2m.quality.casestudies.Shapes.Block;
import de.upb.m2m.quality.casestudies.Shapes.Circle;
import de.upb.m2m.quality.casestudies.Shapes.ModelElement;
import de.upb.m2m.quality.casestudies.Shapes.RootBlock;
import de.upb.m2m.quality.casestudies.Shapes.Shape;
import de.upb.m2m.quality.casestudies.Shapes.ShapesFactory;
import de.upb.m2m.quality.casestudies.Shapes.ShapesPackage;
import de.upb.m2m.quality.casestudies.Shapes.Square;

/**
 * This transformation implements a forward as well as a backward
 * transformation. The execution direction can be set via the third command-
 * line parameter. If the parameter equals the string "true", a backward
 * transformation is executed.
 * 
 * User edits are _not_ preserved (in contrast to MediniQVT's original scenario
 * "Rule9"). If this is needed, one has to use a trace model as third input to
 * the transformation and check its trace records for already mapped elements.
 * 
 * Implementation time: 70 Minutes.
 * 
 * @see MediniQVT Plugin "Rule9" (original scenario)
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class ShapesRule9 {
	/**
	 * The Apache logger.
	 */
	private static final Logger LOGGER = Logger.getLogger(ShapesRule9.class);

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
	 * Allows to map to the Block a Block was transformed to.
	 */
	private HashMap<Block, Block> block2blockMap = new LinkedHashMap<Block, Block>();

	/**
	 * Allows to map to the Arrow an Arrow was transformed to.
	 */
	private HashMap<Arrow, Arrow> arrow2arrowMap = new LinkedHashMap<Arrow, Arrow>();

	/**
	 * Default constructor. Loads the passed source Shapes model and an initial
	 * target Shapes model as member variables.
	 * 
	 * @param sourceShapesPath
	 *            Path to the source shapes model
	 * @param targetShapesPath
	 *            Path to the target shapes model
	 * @param backwards
	 *            Indicates whether to transform backwards (true) or not
	 */
	public ShapesRule9(String sourceShapesPath, String targetShapesPath,
			String backwards) {
		if (backwards.equals("true")) {
			loadShapesModel(targetShapesPath);
			initializeShapesModel();
			this.targetURI = URI.createURI(sourceShapesPath);
		} else {
			loadShapesModel(sourceShapesPath);
			initializeShapesModel();
			this.targetURI = URI.createURI(targetShapesPath);
		}
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
	 */
	public void transform() {
		this.targetRootBlock = shape2shape(this.sourceRootBlock);

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Completed Transformation");
		}
	}

	/**
	 * Either maps squares to squares or circles to circles for each model
	 * element of a root block.
	 * 
	 * @param rootBlock
	 *            The root block the mapping is applied on
	 * @return The newly created root block
	 */
	private RootBlock shape2shape(RootBlock rootBlock) {
		RootBlock newRootBlock = factory.createRootBlock();
		block2blockMap.put(rootBlock, newRootBlock);

		List<Shape> shapes = new LinkedList<Shape>();
		for (ModelElement modelElement : rootBlock.getModelElement()) {
			if (modelElement instanceof Shape) {
				shapes.add((Shape) modelElement);
			}
		}

		for (Shape shape : shapes) {
			if (shape instanceof Square) {
				square2square((Square) shape);
			} else if (shape instanceof Circle) {
				circle2circle((Circle) shape);
			}
		}

		return newRootBlock;
	}

	/**
	 * Mapping for shape initialization.
	 * 
	 * @param shape
	 *            The shape to be mapped
	 * @param newShape
	 *            The shape to be initialized
	 */
	private void initShape(Shape shape, Shape newShape) {
		newShape.setName(shape.getName());

		Block block = block2blockMap.get(shape.getBlock());
		if (block != null) {
			newShape.setBlock(block);
		}

		for (Arrow inArrow : shape.getInArrow()) {
			Arrow newInArrow = arrow2arrowMap.get(inArrow);
			if (newInArrow != null) {
				newShape.getInArrow().add(newInArrow);
			}
		}

		for (Arrow outArrow : shape.getOutArrow()) {
			Arrow newOutArrow = arrow2arrowMap.get(outArrow);
			if (newOutArrow != null) {
				newShape.getOutArrow().add(newOutArrow);
			}
		}
	}

	/**
	 * Maps squares to squares.
	 * 
	 * @param square
	 *            The square to be mapped
	 */
	private void square2square(Square square) {
		Square newSquare = factory.createSquare();
		initShape(square, newSquare);
	}

	/**
	 * Maps circles to circles.
	 * 
	 * @param circle
	 *            The square to be mapped
	 */
	private void circle2circle(Circle circle) {
		Circle newCircle = factory.createCircle();
		initShape(circle, newCircle);
	}

	/**
	 * Transformation entry point.
	 * 
	 * @param args
	 *            Array including (1) paths to model instances involved in the
	 *            transformation (args[0] and args[1]) and (2) transformation
	 *            direction (args[2] equals "true" for backward transformation)
	 */
	public static void main(String[] args) {
		ShapesRule9 shapesRule9;
		try {
			shapesRule9 = new ShapesRule9(args[0], args[1], args[2]);
			shapesRule9.transform();
			shapesRule9.save();
		} catch (Exception e) {
			LOGGER.error("Transformation aborted. Reason: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
