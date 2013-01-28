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
 * This transformation specifies a 1:1 duality relation by transforming circles
 * to arrows and vice versa. In case a circle has no incoming arrows, it is
 * connected to a new, "initial" square. In case a circle has no outgoing
 * arrows, it is connected to a new, "final" square. Furthermore, the
 * transformation assumes that there are only circles and arrows within the
 * source model.
 * 
 * Implementation time: 45 Minutes.
 * 
 * @see MediniQVT Plugin "Rule7" (original scenario)
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class ShapesRule7 {
	/**
	 * The Apache logger.
	 */
	private static final Logger LOGGER = Logger.getLogger(ShapesRule7.class);

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
	 * Allows to map to the RootBlock a RootBlock was transformed to.
	 */
	private HashMap<RootBlock, RootBlock> root2rootMap = new LinkedHashMap<RootBlock, RootBlock>();

	/**
	 * Allows to map to the Circle an Arrow was transformed to.
	 */
	private HashMap<Arrow, Circle> arrow2circleMap = new LinkedHashMap<Arrow, Circle>();

	/**
	 * Default constructor. Loads the passed source Shapes model and an initial
	 * target Shapes model as member variables.
	 * 
	 * @param sourceShapesPath
	 *            Path to the source shapes model
	 * @param targetShapesPath
	 *            Path to the target shapes model
	 */
	public ShapesRule7(String sourceShapesPath, String targetShapesPath) {
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
	 */
	public void transform() {
		this.targetRootBlock = root2root(this.sourceRootBlock);

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Completed Transformation");
		}
	}

	/**
	 * Maps the source root block to a new root block. First, collects all
	 * arrows and circles. Afterwards, maps arrows to circles and, next, circles
	 * to arrows.
	 * 
	 * @param rootBlock
	 *            The root block to be mapped
	 * @return The newly created root block
	 */
	private RootBlock root2root(RootBlock rootBlock) {
		RootBlock newRootBlock = factory.createRootBlock();
		root2rootMap.put(rootBlock, newRootBlock);

		List<Arrow> arrows = new LinkedList<Arrow>();
		List<Circle> circles = new LinkedList<Circle>();
		for (ModelElement modelElement : rootBlock.getModelElement()) {
			if (modelElement instanceof Arrow) {
				arrows.add((Arrow) modelElement);
			} else if (modelElement instanceof Circle) {
				circles.add((Circle) modelElement);
			}
		}

		for (Arrow arrow : arrows) {
			newRootBlock.getModelElement().add(arrow2circle(arrow));
		}

		for (Circle circle : circles) {
			newRootBlock.getModelElement().add(circle2arrow(circle));
		}

		return newRootBlock;
	}

	/**
	 * Maps arrows to circles. Connections are not resolved.
	 * 
	 * @param arrow
	 *            The arrow to be mapped
	 * @return The newly created circle
	 */
	private Circle arrow2circle(Arrow arrow) {
		Circle circle = factory.createCircle();
		arrow2circleMap.put(arrow, circle);

		circle.setName(arrow.getName());
		circle.setBlock(arrow.getBlock());

		return circle;
	}

	/**
	 * Maps circles to arrows. Also resolves all connections to circles.
	 * 
	 * @param circle
	 *            The circle to be mapped
	 * @return The newly created arrow
	 */
	private Arrow circle2arrow(Circle circle) {
		Arrow arrow = factory.createArrow();
		RootBlock root = root2rootMap.get(circle.getBlock());

		List<Shape> sources = new LinkedList<Shape>();
		if (circle.getInArrow().size() == 0) {
			Square square = createSquare(root, "initial");
			sources.add(square);
		} else {
			for (Arrow inArrow : circle.getInArrow()) {
				sources.add(arrow2circleMap.get(inArrow));
			}
		}
		assert (sources.size() == 1);

		List<Shape> targets = new LinkedList<Shape>();
		if (circle.getOutArrow().size() == 0) {
			Square square = createSquare(root, "final");
			targets.add(square);
		} else {
			for (Arrow outArrow : circle.getOutArrow()) {
				targets.add(arrow2circleMap.get(outArrow));
			}
		}
		assert (targets.size() == 1);

		arrow.setName(circle.getName());
		arrow.setBlock(circle.getBlock());
		arrow.setSource(sources.get(0));
		arrow.setTarget(targets.get(0));

		return arrow;
	}

	/**
	 * Creating a new square.
	 * 
	 * @param root
	 *            The block to assign the square to
	 * @param type
	 *            The type-name of the square
	 * @return The newly created square
	 */
	private Square createSquare(Block root, String type) {
		Square square = factory.createSquare();

		square.setName(type + " square");
		square.setBlock(root);

		return square;
	}

	/**
	 * Transformation entry point.
	 * 
	 * @param modelPaths
	 *            Array including paths to model instances involved in the
	 *            transformation
	 */
	public static void main(String[] modelPaths) {
		ShapesRule7 shapesRule7;
		try {
			shapesRule7 = new ShapesRule7(modelPaths[0], modelPaths[1]);
			shapesRule7.transform();
			shapesRule7.save();
		} catch (Exception e) {
			LOGGER.error("Transformation aborted. Reason: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
