/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleRDBMS.impl;

import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsSchema;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSFactory;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleRDBMSPackageImpl extends EPackageImpl implements SimpleRDBMSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbmsColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbmsForeignKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbmsKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbmsModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbmsSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbmsTableEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimpleRDBMSPackageImpl() {
		super(eNS_URI, SimpleRDBMSFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SimpleRDBMSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimpleRDBMSPackage init() {
		if (isInited) return (SimpleRDBMSPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleRDBMSPackage.eNS_URI);

		// Obtain or create and register package
		SimpleRDBMSPackageImpl theSimpleRDBMSPackage = (SimpleRDBMSPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimpleRDBMSPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimpleRDBMSPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSimpleRDBMSPackage.createPackageContents();

		// Initialize created meta-data
		theSimpleRDBMSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimpleRDBMSPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimpleRDBMSPackage.eNS_URI, theSimpleRDBMSPackage);
		return theSimpleRDBMSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRdbmsColumn() {
		return rdbmsColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRdbmsColumn_RdbmsType() {
		return (EAttribute)rdbmsColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdbmsColumn_RdbmsOwner() {
		return (EReference)rdbmsColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdbmsColumn_RdbmsKey() {
		return (EReference)rdbmsColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdbmsColumn_RdbmsForeignKey() {
		return (EReference)rdbmsColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRdbmsForeignKey() {
		return rdbmsForeignKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdbmsForeignKey_RdbmsOwner() {
		return (EReference)rdbmsForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdbmsForeignKey_RdbmsRefersTo() {
		return (EReference)rdbmsForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdbmsForeignKey_RdbmsColumn() {
		return (EReference)rdbmsForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRdbmsKey() {
		return rdbmsKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdbmsKey_RdbmsColumn() {
		return (EReference)rdbmsKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdbmsKey_RdbmsRefersToOpposite() {
		return (EReference)rdbmsKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdbmsKey_RdbmsOwner() {
		return (EReference)rdbmsKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRdbmsModelElement() {
		return rdbmsModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRdbmsModelElement_RdbmsName() {
		return (EAttribute)rdbmsModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRdbmsModelElement_RdbmsKind() {
		return (EAttribute)rdbmsModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRdbmsModelElement_Id() {
		return (EAttribute)rdbmsModelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRdbmsSchema() {
		return rdbmsSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdbmsSchema_RdbmsTable() {
		return (EReference)rdbmsSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRdbmsTable() {
		return rdbmsTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdbmsTable_RdbmsColumn() {
		return (EReference)rdbmsTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdbmsTable_RdbmsForeignKey() {
		return (EReference)rdbmsTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdbmsTable_RdbmsKey() {
		return (EReference)rdbmsTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdbmsTable_RdbmsSchema() {
		return (EReference)rdbmsTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRDBMSFactory getSimpleRDBMSFactory() {
		return (SimpleRDBMSFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rdbmsColumnEClass = createEClass(RDBMS_COLUMN);
		createEAttribute(rdbmsColumnEClass, RDBMS_COLUMN__RDBMS_TYPE);
		createEReference(rdbmsColumnEClass, RDBMS_COLUMN__RDBMS_OWNER);
		createEReference(rdbmsColumnEClass, RDBMS_COLUMN__RDBMS_KEY);
		createEReference(rdbmsColumnEClass, RDBMS_COLUMN__RDBMS_FOREIGN_KEY);

		rdbmsForeignKeyEClass = createEClass(RDBMS_FOREIGN_KEY);
		createEReference(rdbmsForeignKeyEClass, RDBMS_FOREIGN_KEY__RDBMS_OWNER);
		createEReference(rdbmsForeignKeyEClass, RDBMS_FOREIGN_KEY__RDBMS_REFERS_TO);
		createEReference(rdbmsForeignKeyEClass, RDBMS_FOREIGN_KEY__RDBMS_COLUMN);

		rdbmsKeyEClass = createEClass(RDBMS_KEY);
		createEReference(rdbmsKeyEClass, RDBMS_KEY__RDBMS_COLUMN);
		createEReference(rdbmsKeyEClass, RDBMS_KEY__RDBMS_REFERS_TO_OPPOSITE);
		createEReference(rdbmsKeyEClass, RDBMS_KEY__RDBMS_OWNER);

		rdbmsModelElementEClass = createEClass(RDBMS_MODEL_ELEMENT);
		createEAttribute(rdbmsModelElementEClass, RDBMS_MODEL_ELEMENT__RDBMS_NAME);
		createEAttribute(rdbmsModelElementEClass, RDBMS_MODEL_ELEMENT__RDBMS_KIND);
		createEAttribute(rdbmsModelElementEClass, RDBMS_MODEL_ELEMENT__ID);

		rdbmsSchemaEClass = createEClass(RDBMS_SCHEMA);
		createEReference(rdbmsSchemaEClass, RDBMS_SCHEMA__RDBMS_TABLE);

		rdbmsTableEClass = createEClass(RDBMS_TABLE);
		createEReference(rdbmsTableEClass, RDBMS_TABLE__RDBMS_COLUMN);
		createEReference(rdbmsTableEClass, RDBMS_TABLE__RDBMS_FOREIGN_KEY);
		createEReference(rdbmsTableEClass, RDBMS_TABLE__RDBMS_KEY);
		createEReference(rdbmsTableEClass, RDBMS_TABLE__RDBMS_SCHEMA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rdbmsColumnEClass.getESuperTypes().add(this.getRdbmsModelElement());
		rdbmsForeignKeyEClass.getESuperTypes().add(this.getRdbmsModelElement());
		rdbmsKeyEClass.getESuperTypes().add(this.getRdbmsModelElement());
		rdbmsSchemaEClass.getESuperTypes().add(this.getRdbmsModelElement());
		rdbmsTableEClass.getESuperTypes().add(this.getRdbmsModelElement());

		// Initialize classes and features; add operations and parameters
		initEClass(rdbmsColumnEClass, RdbmsColumn.class, "RdbmsColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRdbmsColumn_RdbmsType(), ecorePackage.getEString(), "rdbmsType", null, 1, 1, RdbmsColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdbmsColumn_RdbmsOwner(), this.getRdbmsTable(), this.getRdbmsTable_RdbmsColumn(), "rdbmsOwner", null, 1, 1, RdbmsColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdbmsColumn_RdbmsKey(), this.getRdbmsKey(), this.getRdbmsKey_RdbmsColumn(), "rdbmsKey", null, 0, -1, RdbmsColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdbmsColumn_RdbmsForeignKey(), this.getRdbmsForeignKey(), this.getRdbmsForeignKey_RdbmsColumn(), "rdbmsForeignKey", null, 0, -1, RdbmsColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdbmsForeignKeyEClass, RdbmsForeignKey.class, "RdbmsForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRdbmsForeignKey_RdbmsOwner(), this.getRdbmsTable(), this.getRdbmsTable_RdbmsForeignKey(), "rdbmsOwner", null, 1, 1, RdbmsForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdbmsForeignKey_RdbmsRefersTo(), this.getRdbmsKey(), this.getRdbmsKey_RdbmsRefersToOpposite(), "rdbmsRefersTo", null, 1, 1, RdbmsForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdbmsForeignKey_RdbmsColumn(), this.getRdbmsColumn(), this.getRdbmsColumn_RdbmsForeignKey(), "rdbmsColumn", null, 0, -1, RdbmsForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdbmsKeyEClass, RdbmsKey.class, "RdbmsKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRdbmsKey_RdbmsColumn(), this.getRdbmsColumn(), this.getRdbmsColumn_RdbmsKey(), "rdbmsColumn", null, 0, -1, RdbmsKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdbmsKey_RdbmsRefersToOpposite(), this.getRdbmsForeignKey(), this.getRdbmsForeignKey_RdbmsRefersTo(), "rdbmsRefersToOpposite", null, 0, -1, RdbmsKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdbmsKey_RdbmsOwner(), this.getRdbmsTable(), this.getRdbmsTable_RdbmsKey(), "rdbmsOwner", null, 1, 1, RdbmsKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdbmsModelElementEClass, RdbmsModelElement.class, "RdbmsModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRdbmsModelElement_RdbmsName(), ecorePackage.getEString(), "rdbmsName", null, 1, 1, RdbmsModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRdbmsModelElement_RdbmsKind(), ecorePackage.getEString(), "rdbmsKind", null, 1, 1, RdbmsModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRdbmsModelElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, RdbmsModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdbmsSchemaEClass, RdbmsSchema.class, "RdbmsSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRdbmsSchema_RdbmsTable(), this.getRdbmsTable(), this.getRdbmsTable_RdbmsSchema(), "rdbmsTable", null, 0, -1, RdbmsSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdbmsTableEClass, RdbmsTable.class, "RdbmsTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRdbmsTable_RdbmsColumn(), this.getRdbmsColumn(), this.getRdbmsColumn_RdbmsOwner(), "rdbmsColumn", null, 0, -1, RdbmsTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdbmsTable_RdbmsForeignKey(), this.getRdbmsForeignKey(), this.getRdbmsForeignKey_RdbmsOwner(), "rdbmsForeignKey", null, 0, -1, RdbmsTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdbmsTable_RdbmsKey(), this.getRdbmsKey(), this.getRdbmsKey_RdbmsOwner(), "rdbmsKey", null, 0, -1, RdbmsTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdbmsTable_RdbmsSchema(), this.getRdbmsSchema(), this.getRdbmsSchema_RdbmsTable(), "rdbmsSchema", null, 1, 1, RdbmsTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SimpleRDBMSPackageImpl
