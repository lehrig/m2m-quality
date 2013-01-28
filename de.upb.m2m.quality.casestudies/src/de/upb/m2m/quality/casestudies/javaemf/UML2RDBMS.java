package de.upb.m2m.quality.casestudies.javaemf;

import java.io.IOException;
import java.util.Collections;
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
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsSchema;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSFactory;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage;
import de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlClass;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlClassifier;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlPackage;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlPackageElement;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlPrimitiveDataType;

/**
 * This class implements the transformation from a SimpleUML to a SimpleRDBMS
 * model via Java plus EMF technology. The main method executes the
 * transformation.
 * 
 * @version 0.1
 * @author Sebastian Lehrig (lehrig@mail.upb.de)
 */
public class UML2RDBMS {
	/**
	 * The Apache logger.
	 */
	private static final Logger LOGGER = Logger.getLogger(UML2RDBMS.class);

	/**
	 * Path to SimpleRDBM's metamodel. Important for setting the nsURI in
	 * SimpleRDBMS model instance.
	 */
	private static final String METAMODEL_PATH_UML2RDBMS = "platform:/resource/"
			+ "de.upb.m2m.quality.casestudies/"
			+ "metamodel/UML2RDBMS/SimpleRDBMS.ecore";

	/**
	 * The UmlPackage representing the primary entry point to the SimpleUML
	 * model instance.
	 */
	private UmlPackage umlPackage;

	/**
	 * The RdbmsSchema representing the primary entry point to the SimpleRDBMS
	 * model instance.
	 */
	private RdbmsSchema rdbmsSchema;

	/**
	 * Factory for creating SimpleRDBMS model elements.
	 */
	private SimpleRDBMSFactory factory;

	/**
	 * URI to which the transformation target is saved to.
	 */
	private URI rdbmsURI;

	/**
	 * Allows to map to the RDBMS tables a class was transformed to.
	 */
	private HashMap<UmlClass, RdbmsTable> class2tableMap = new LinkedHashMap<UmlClass, RdbmsTable>();

	/**
	 * Allows to map to the leaf attributes (attributes flattened to its
	 * primitive types) of a class.
	 */
	private HashMap<UmlClass, List<LeafAttribute>> class2leafAttributesMap = new LinkedHashMap<UmlClass, List<LeafAttribute>>();

	/**
	 * Inner class for leaf attributes.
	 */
	private class LeafAttribute {
		/**
		 * Name of the leaf attribute.
		 */
		private String name;

		/**
		 * Kind of the leaf attribute.
		 */
		private String kind;

		/**
		 * References (possibly complex) uml attribute.
		 */
		private UmlAttribute attr;
	}

	/**
	 * Default constructor. Loads the passed SimpleUML model and an initial
	 * RDBMS model as member variables.
	 * 
	 * @param simpleUMLPath
	 *            Path to the SimpleUML model
	 * @param simpleRDBMSPath
	 *            Path to the SimpleRDBMS model
	 * @throws Exception
	 */
	public UML2RDBMS(String simpleUMLPath, String simpleRDBMSPath) {
		loadSimpleUMLModel(simpleUMLPath);
		initializeSimpleRDBMSModel();
		this.rdbmsURI = URI.createURI(simpleRDBMSPath);
	}

	/**
	 * Loads an existing SimpleUML model.
	 * 
	 * @param modelPath
	 *            Path to the SimpleUML model
	 * @see http://www.vogella.com/articles/EclipseEMFPersistence/article.html
	 */
	private void loadSimpleUMLModel(String modelPath) {
		// Initialize the model
		SimpleUMLPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the .xmi extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createURI(modelPath), true);

		// Get the first model element and cast it to the right type
		EObject obj = resource.getContents().get(0);
		if (obj instanceof UmlPackage) {
			umlPackage = (UmlPackage) obj;
		} else {
			throw new IllegalArgumentException(
					"UmlPackage has to be first element in " + modelPath);
		}

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Loaded UML model from " + modelPath);
		}
	}

	/**
	 * Creates a new SimpleRDBMS model with one RDBMSSchema in its root.
	 */
	private void initializeSimpleRDBMSModel() {
		// Initialize the model
		SimpleRDBMSPackage.eINSTANCE.eClass();
		SimpleRDBMSPackage.eINSTANCE.setNsURI(METAMODEL_PATH_UML2RDBMS);

		// Retrieve the default factory singleton
		factory = SimpleRDBMSFactory.eINSTANCE;

		// Create the content of the model via this program
		rdbmsSchema = factory.createRdbmsSchema();
	}

	/**
	 * Saves the contents of the rdbmsSchema member variable to the specified
	 * output URI.
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
		Resource resource = resSet.createResource(this.rdbmsURI);

		// Get the first model element and cast it to the right type
		resource.getContents().add(rdbmsSchema);

		// Now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			LOGGER.error("IOException when trying to save to " + this.rdbmsURI);
		}

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Saved RDBMS model to " + this.rdbmsURI);
		}
	}

	/**
	 * Executes the transformation from a SimpleUML model to a SimpleRDBMS
	 * model.
	 */
	public void transform() {
		this.rdbmsSchema = packageToSchema(this.umlPackage);

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Completed Transformation");
		}
	}

	/**
	 * Maps a package to a schema.
	 * 
	 * @param umlPackage
	 *            Package to be transformed.
	 * @return Created schema.
	 */
	private RdbmsSchema packageToSchema(UmlPackage umlPackage) {
		RdbmsSchema newRdbmsSchema = factory.createRdbmsSchema();

		// name
		newRdbmsSchema.setRdbmsName(umlPackage.getUmlName());

		// get classes respectively associations from source model
		List<UmlClass> umlClasses = new LinkedList<UmlClass>();
		List<UmlAssociation> umlAssociations = new LinkedList<UmlAssociation>();
		for (UmlPackageElement elem : umlPackage.getUmlOwnedElement()) {
			if (elem instanceof UmlClass) {
				umlClasses.add((UmlClass) elem);
			} else if (elem instanceof UmlAssociation) {
				umlAssociations.add((UmlAssociation) elem);
			}
		}

		// tables from classes
		List<RdbmsTable> classTables = new LinkedList<RdbmsTable>();
		for (UmlClass umlClass : umlClasses) {
			RdbmsTable rdbmsTable = class2table(umlClass);
			if (rdbmsTable != null) {
				classTables.add(rdbmsTable);
			}
		}
		newRdbmsSchema.getRdbmsTable().addAll(classTables);

		// tables from associations
		List<RdbmsTable> associationTables = new LinkedList<RdbmsTable>();
		for (UmlAssociation umlAssociation : umlAssociations) {
			RdbmsTable rdbmsTable = asso2table(umlAssociation);
			if (rdbmsTable != null) {
				classTables.add(rdbmsTable);
			}
		}
		newRdbmsSchema.getRdbmsTable().addAll(associationTables);

		return newRdbmsSchema;
	}

	/**
	 * Maps a class to a table, with a column per flattened leaf attribute.
	 * 
	 * @param umlClass
	 *            Class to be transformed.
	 * @return Created table if class is a persistent class and "null"
	 *         otherwise.
	 */
	private RdbmsTable class2table(UmlClass umlClass) {
		if (!umlClass.getUmlKind().equals("Persistent")) {
			return null;
		}

		// derive leaf attributes
		List<LeafAttribute> leafAttributes = new LinkedList<LeafAttribute>();
		List<UmlAttribute> umlAttributes = umlClass.getUmlAttribute();
		for (UmlAttribute umlAttribute : umlAttributes) {
			List<LeafAttribute> leafAttribute = attr2LeafAttrs(umlAttribute,
					"", "");
			leafAttributes.addAll(leafAttribute);
		}
		class2leafAttributesMap.put(umlClass, leafAttributes);

		// create rdbmsTable
		RdbmsTable rdbmsTable = factory.createRdbmsTable();

		// name
		rdbmsTable.setRdbmsName(umlClass.getUmlName());

		// columns for class attributes
		List<RdbmsColumn> columns = class2Columns(umlClass,
				umlClass.getUmlName() + "_");

		// column "table ID" with primary key
		RdbmsColumn tableID = factory.createRdbmsColumn();
		tableID.setRdbmsName(umlClass.getUmlName() + "_tid");
		tableID.setRdbmsType("NUMBER");

		RdbmsKey key = factory.createRdbmsKey();
		key.setRdbmsName(umlClass.getUmlName() + "_pk");
		key.setRdbmsOwner(rdbmsTable);
		tableID.getRdbmsKey().add(key);

		columns.add(tableID);

		rdbmsTable.getRdbmsColumn().addAll(columns);
		class2tableMap.put(umlClass, rdbmsTable);
		return rdbmsTable;
	}

	/**
	 * Mapping that creates the intermediate leaf attributes data, thus,
	 * flattening complex class attributes.
	 * 
	 * @param umlAttribute
	 *            Attribute to be transformed.
	 * @param prefix
	 *            Prefix giving the path from the direct, complex attribute of
	 *            the class to the umlAttribute.
	 * @param pkind
	 *            The parent's umlKind of the considered Attribute.
	 * @return Created list of leaf attributes.
	 */
	private List<LeafAttribute> attr2LeafAttrs(UmlAttribute umlAttribute,
			String prefix, String pkind) {
		List<LeafAttribute> leafAttrs = new LinkedList<LeafAttribute>();

		// get highest umlKind "k" in attribute hierarchy
		String k;
		if (pkind != null && pkind.equals("")) {
			k = umlAttribute.getUmlKind();
		} else {
			k = pkind;
		}

		UmlClassifier classifier = umlAttribute.getUmlType();
		if (classifier instanceof UmlPrimitiveDataType) {
			LeafAttribute leafAttribute = new LeafAttribute();
			leafAttribute.attr = umlAttribute;
			leafAttribute.name = prefix + umlAttribute.getUmlName();
			leafAttribute.kind = k;
			leafAttrs.add(leafAttribute);
		} else {
			UmlClass umlClass = (UmlClass) classifier;
			List<UmlAttribute> subAttributes = umlClass.getUmlAttribute();
			for (UmlAttribute subAttribute : subAttributes) {
				List<LeafAttribute> subLeafs = attr2LeafAttrs(subAttribute,
						umlAttribute.getUmlName() + "_", k);
				leafAttrs.addAll(subLeafs);
			}
		}

		return leafAttrs;
	}

	/**
	 * Mapping that recursively creates columns corresponding to (1) class
	 * attributes and (2) inherited class attributes.
	 * 
	 * @param umlClass
	 *            Class to be transformed.
	 * @param prefix
	 *            Prefix for the leaf attributes.
	 * @return Created list of leaf attributes.
	 */
	private List<RdbmsColumn> class2Columns(UmlClass umlClass, String prefix) {
		// class attributes
		List<RdbmsColumn> selfColumns = new LinkedList<RdbmsColumn>();
		List<LeafAttribute> leafAttributes = class2leafAttributesMap
				.get(umlClass);
		for (LeafAttribute leaf : leafAttributes) {
			RdbmsColumn column = leafAttr2OrdinaryColumn(leaf, prefix);
			selfColumns.add(column);
		}

		// inherited class attributes
		List<RdbmsColumn> superColumns = new LinkedList<RdbmsColumn>();
		List<UmlClass> superClasses = umlClass.getUmlGeneral();
		for (UmlClass superClass : superClasses) {
			List<RdbmsColumn> columns = class2Columns(superClass, prefix);
			superColumns.addAll(columns);
		}

		// unite and return
		selfColumns.addAll(superColumns);
		return selfColumns;
	}

	/**
	 * Mapping that creates an ordinary column from a leaf attribute.
	 * 
	 * @param leaf
	 *            Leaf attribute to be transformed.
	 * @param prefix
	 *            Prefix for the leaf attribute.
	 * @return Created RDBMS column.
	 */
	private RdbmsColumn leafAttr2OrdinaryColumn(LeafAttribute leaf,
			String prefix) {
		RdbmsColumn column = factory.createRdbmsColumn();
		String umlTypeName = leaf.attr.getUmlType().getUmlName();
		column.setRdbmsName(prefix + leaf.name);
		column.setRdbmsKind(leaf.kind);
		column.setRdbmsType(primitiveTypeToSqlType(umlTypeName));

		return column;
	}

	/**
	 * Mapping from UML primitive Types to SQL Types.
	 * 
	 * @param typename
	 *            UML primitive type to be transformed.
	 * @return Created SQL type.
	 */
	private String primitiveTypeToSqlType(String typename) {
		if (typename.equals("INTEGER")) {
			return "NUMBER";
		} else if (typename.equals("BOOLEAN")) {
			return "BOOLEAN";
		} else {
			return "VARCHAR";
		}
	}

	/**
	 * Mapping to update a Table with new columns of foreign keys.
	 * 
	 * @param umlAssociation
	 *            UML association to be transformed.
	 * @return Updated RDBMS table if association is a persistent association
	 *         and "null" otherwise.
	 */
	private RdbmsTable asso2table(UmlAssociation umlAssociation) {
		if (!umlAssociation.getUmlKind().equals("Persistent")) {
			return null;
		}

		// resolve table
		RdbmsTable table = class2tableMap.get(umlAssociation.getUmlSource());

		// set foreign key
		RdbmsForeignKey foreignKey = asso2ForeignKey(umlAssociation);
		table.getRdbmsForeignKey().add(foreignKey);

		// new column for foreign key
		RdbmsColumn column = factory.createRdbmsColumn();
		column.setRdbmsName(umlAssociation.getUmlSource().getUmlName() + "_"
				+ umlAssociation.getUmlName() + "_"
				+ umlAssociation.getUmlDestination().getUmlName() + "_tid");
		column.setRdbmsType("NUMBER");
		column.getRdbmsForeignKey().add(foreignKey);
		table.getRdbmsColumn().add(column);

		return table;
	}

	/**
	 * Mapping to build the foreign keys.
	 * 
	 * @param umlAssociation
	 *            UML Association to build the foreign key for.
	 * @return Created foreign key.
	 */
	private RdbmsForeignKey asso2ForeignKey(UmlAssociation umlAssociation) {
		RdbmsForeignKey foreignKey = factory.createRdbmsForeignKey();

		// name
		foreignKey.setRdbmsName(umlAssociation.getUmlSource().getUmlName()
				+ "_" + umlAssociation.getUmlName() + "_"
				+ umlAssociation.getUmlDestination().getUmlName());
		// refers to
		RdbmsTable destinationTable = class2tableMap.get(umlAssociation
				.getUmlDestination());
		RdbmsKey destinationKey = destinationTable.getRdbmsKey().get(0);
		foreignKey.setRdbmsRefersTo(destinationKey);

		return foreignKey;
	}

	/**
	 * Transformation entry point.
	 * 
	 * @param modelPaths
	 *            Array including paths to model instances involved in the
	 *            transformation
	 */
	public static void main(String[] modelPaths) {
		UML2RDBMS uml2rdbms;
		try {
			uml2rdbms = new UML2RDBMS(modelPaths[0], modelPaths[1]);
			uml2rdbms.transform();
			uml2rdbms.save();
		} catch (Exception e) {
			LOGGER.error("Transformation aborted. Reason: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
