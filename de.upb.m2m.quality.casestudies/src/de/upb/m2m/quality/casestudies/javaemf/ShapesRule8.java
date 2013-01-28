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

/**
 * This transformation specifies a hierarchical clustering that groups fork/join
 * pairs of circles. The transformation assumes that there are only circles and
 * arrows within the source model.
 * 
 * A fork/join pair is defined via two circles (fork and join circle). Every
 * path starting from the fork circle needs to go through the join circle to be
 * a valid fork/join pair. Furthermore, the pair is only valid if join and fork
 * circle have the shortest possible distance over all other fork and join
 * pairs.
 * 
 * The clustering creates one block for each such pair (named after the fork
 * circle) and puts every circle enclosed by the pair inside the block. This
 * process is recursively repeated for the inner circles to create a whole
 * clustering hierarchy. Arrows do not exists anymore in the target model.
 * 
 * Implementation time: 60 Minutes.
 * 
 * @see MediniQVT Plugin "Rule8" (original scenario)
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class ShapesRule8 {
	/**
	 * The Apache logger.
	 */
	private static final Logger LOGGER = Logger.getLogger(ShapesRule8.class);

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
	 * Allows to map to the number of currently collected joins for a given join
	 * circle.
	 */
	private HashMap<Circle, Integer> circle2joinCountMap = new LinkedHashMap<Circle, Integer>();

	/**
	 * Default constructor. Loads the passed source Shapes model and an initial
	 * target Shapes model as member variables.
	 * 
	 * @param sourceShapesPath
	 *            Path to the source shapes model
	 * @param targetShapesPath
	 *            Path to the target shapes model
	 */
	public ShapesRule8(String sourceShapesPath, String targetShapesPath) {
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
	 * Maps the source root block to a new root block. The idea is to find the
	 * starting circle and to follow all its paths to the final circle to add
	 * one circle (respectively block) after the other.
	 * 
	 * @param rootBlock
	 *            The root block to be mapped
	 * @return The newly created root block
	 */
	private RootBlock root2root(RootBlock rootBlock) {
		RootBlock newRootBlock = factory.createRootBlock();

		List<Circle> circles = new LinkedList<Circle>();
		for (ModelElement modelElement : rootBlock.getModelElement()) {
			if (modelElement instanceof Circle) {
				circles.add((Circle) modelElement);
			}
		}

		List<Circle> startingCircles = new LinkedList<Circle>();
		for (Circle circle : circles) {
			if (circle.getInArrow().size() == 0) {
				startingCircles.add(circle);
			}
		}
		assert (startingCircles.size() == 1);
		Circle startingCircle = startingCircles.get(0);

		circle2blockOrCircle(startingCircle, newRootBlock);
		newRootBlock.setName("top level");

		return newRootBlock;
	}

	/**
	 * Maps circles to blocks or circles.
	 * 
	 * @param circle
	 *            The circle to be mapped
	 * @param root
	 *            The block the new circle/block will be nested into
	 */
	private void circle2blockOrCircle(Circle circle, Block root) {
		if (circle.getOutArrow().size() > 1) {
			forkCircle2Block(circle, root);
		} else if (circle.getInArrow().size() > 1) {
			joinCircle2Block(circle, root);
		} else if (circle.getOutArrow().size() == 1) {
			circle2circle(circle, root);
		} else if (circle.getOutArrow().size() == 0) {
			circle2finalCircle(circle, root);
		}
	}

	/**
	 * Mapping for shape initialization.
	 * 
	 * @param circle
	 *            The circle to be mapped
	 * @param root
	 *            The block the shape will be nested into
	 * @param shape
	 *            The shape to be initialized
	 */
	private void circle2shape(Circle circle, Block root, Shape shape) {
		shape.setName(circle.getName());
		shape.setBlock(root);
	}

	/**
	 * Creates a list of circles connected to outgoing arrows of the given
	 * circle.
	 * 
	 * @param circle
	 *            The given circle
	 * @return The created list of circles
	 */
	private List<Circle> getOutCircles(Circle circle) {
		List<Arrow> outArrows = circle.getOutArrow();
		List<Circle> outCircles = new LinkedList<Circle>();
		for (Arrow outArrow : outArrows) {
			Shape target = outArrow.getTarget();
			if (target instanceof Circle) {
				outCircles.add((Circle) target);
			}
		}
		return outCircles;
	}

	/**
	 * Maps a circle to a block in case the circle has more than one outgoing
	 * arrow.
	 * 
	 * @param circle
	 *            The circle to be mapped
	 * @param root
	 *            The block the new block will be nested into
	 */
	private void forkCircle2Block(Circle circle, Block root) {
		assert (circle.getOutArrow().size() > 1);
		Block block = factory.createBlock();
		circle2shape(circle, root, block);

		List<Circle> outCircles = getOutCircles(circle);
		for (Circle outCircle : outCircles) {
			circle2blockOrCircle(outCircle, block);
		}
	}

	/**
	 * Moves on to the next circle or block in case the circle has more than one
	 * incoming arrow. The method only maps once per joining circle by counting
	 * the number of calls to this method per circle.
	 * 
	 * @param circle
	 *            The circle to be mapped
	 * @param root
	 *            The block the new block will be nested into
	 */
	private void joinCircle2Block(Circle circle, Block root) {
		assert (circle.getInArrow().size() > 1);

		if (circle2joinCountMap.get(circle) == null) {
			circle2joinCountMap.put(circle, 1);
		} else {
			int currentJoins = circle2joinCountMap.get(circle);
			currentJoins++;

			if (currentJoins == circle.getInArrow().size()) {
				List<Circle> outCircles = getOutCircles(circle);
				for (Circle outCircle : outCircles) {
					circle2blockOrCircle(outCircle, root.getBlock());
				}
			} else {
				circle2joinCountMap.put(circle, currentJoins);
			}
		}
	}

	/**
	 * Maps a circle to a circle and follows its outgoing arrow for further
	 * mappings in case the source circle has at exactly one outgoing arrow.
	 * 
	 * @param circle
	 *            The circle to be mapped
	 * @param root
	 *            The block the new circle will be nested into
	 */
	private void circle2circle(Circle circle, Block root) {
		assert (circle.getOutArrow().size() == 1);
		Circle newCircle = factory.createCircle();
		circle2shape(circle, root, newCircle);

		List<Circle> outCircles = getOutCircles(circle);
		for (Circle outCircle : outCircles) {
			circle2blockOrCircle(outCircle, root);
		}
	}

	/**
	 * Maps a circle to the final circle in case the circle has no outgoing
	 * arrow.
	 * 
	 * @param circle
	 *            The circle to be mapped
	 * @param root
	 *            The block the new circle will be nested into
	 */
	private void circle2finalCircle(Circle circle, Block root) {
		assert (circle.getOutArrow().size() == 0);
		Circle newCircle = factory.createCircle();
		circle2shape(circle, root, newCircle);
	}

	/**
	 * Transformation entry point.
	 * 
	 * @param modelPaths
	 *            Array including paths to model instances involved in the
	 *            transformation
	 */
	public static void main(String[] modelPaths) {
		ShapesRule8 shapesRule8;
		try {
			shapesRule8 = new ShapesRule8(modelPaths[0], modelPaths[1]);
			shapesRule8.transform();
			shapesRule8.save();
		} catch (Exception e) {
			LOGGER.error("Transformation aborted. Reason: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
