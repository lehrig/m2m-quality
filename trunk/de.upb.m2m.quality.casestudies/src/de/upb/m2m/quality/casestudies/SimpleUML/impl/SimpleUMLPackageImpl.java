/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML.impl;

import de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLFactory;
import de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlClass;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlClassifier;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlPackage;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlPackageElement;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlPrimitiveDataType;

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
public class SimpleUMLPackageImpl extends EPackageImpl implements SimpleUMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlPackageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlPrimitiveDataTypeEClass = null;

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
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimpleUMLPackageImpl() {
		super(eNS_URI, SimpleUMLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SimpleUMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimpleUMLPackage init() {
		if (isInited) return (SimpleUMLPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleUMLPackage.eNS_URI);

		// Obtain or create and register package
		SimpleUMLPackageImpl theSimpleUMLPackage = (SimpleUMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimpleUMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimpleUMLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSimpleUMLPackage.createPackageContents();

		// Initialize created meta-data
		theSimpleUMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimpleUMLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimpleUMLPackage.eNS_URI, theSimpleUMLPackage);
		return theSimpleUMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUmlAssociation() {
		return umlAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlAssociation_UmlDestination() {
		return (EReference)umlAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlAssociation_UmlSource() {
		return (EReference)umlAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUmlAttribute() {
		return umlAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlAttribute_UmlOwner() {
		return (EReference)umlAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlAttribute_UmlType() {
		return (EReference)umlAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUmlClass() {
		return umlClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlClass_UmlForward() {
		return (EReference)umlClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlClass_UmlReverse() {
		return (EReference)umlClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlClass_UmlAttribute() {
		return (EReference)umlClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlClass_UmlGeneral() {
		return (EReference)umlClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlClass_UmlSpecific() {
		return (EReference)umlClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUmlClassifier() {
		return umlClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlClassifier_UmlAttribute1() {
		return (EReference)umlClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUmlModelElement() {
		return umlModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUmlModelElement_UmlName() {
		return (EAttribute)umlModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUmlModelElement_UmlKind() {
		return (EAttribute)umlModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUmlModelElement_Id() {
		return (EAttribute)umlModelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUmlPackage() {
		return umlPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlPackage_UmlOwnedElement() {
		return (EReference)umlPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUmlPackageElement() {
		return umlPackageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlPackageElement_UmlNamespace() {
		return (EReference)umlPackageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUmlPrimitiveDataType() {
		return umlPrimitiveDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleUMLFactory getSimpleUMLFactory() {
		return (SimpleUMLFactory)getEFactoryInstance();
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
		umlAssociationEClass = createEClass(UML_ASSOCIATION);
		createEReference(umlAssociationEClass, UML_ASSOCIATION__UML_DESTINATION);
		createEReference(umlAssociationEClass, UML_ASSOCIATION__UML_SOURCE);

		umlAttributeEClass = createEClass(UML_ATTRIBUTE);
		createEReference(umlAttributeEClass, UML_ATTRIBUTE__UML_OWNER);
		createEReference(umlAttributeEClass, UML_ATTRIBUTE__UML_TYPE);

		umlClassEClass = createEClass(UML_CLASS);
		createEReference(umlClassEClass, UML_CLASS__UML_FORWARD);
		createEReference(umlClassEClass, UML_CLASS__UML_REVERSE);
		createEReference(umlClassEClass, UML_CLASS__UML_ATTRIBUTE);
		createEReference(umlClassEClass, UML_CLASS__UML_GENERAL);
		createEReference(umlClassEClass, UML_CLASS__UML_SPECIFIC);

		umlClassifierEClass = createEClass(UML_CLASSIFIER);
		createEReference(umlClassifierEClass, UML_CLASSIFIER__UML_ATTRIBUTE1);

		umlModelElementEClass = createEClass(UML_MODEL_ELEMENT);
		createEAttribute(umlModelElementEClass, UML_MODEL_ELEMENT__UML_NAME);
		createEAttribute(umlModelElementEClass, UML_MODEL_ELEMENT__UML_KIND);
		createEAttribute(umlModelElementEClass, UML_MODEL_ELEMENT__ID);

		umlPackageEClass = createEClass(UML_PACKAGE);
		createEReference(umlPackageEClass, UML_PACKAGE__UML_OWNED_ELEMENT);

		umlPackageElementEClass = createEClass(UML_PACKAGE_ELEMENT);
		createEReference(umlPackageElementEClass, UML_PACKAGE_ELEMENT__UML_NAMESPACE);

		umlPrimitiveDataTypeEClass = createEClass(UML_PRIMITIVE_DATA_TYPE);
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
		umlAssociationEClass.getESuperTypes().add(this.getUmlPackageElement());
		umlAttributeEClass.getESuperTypes().add(this.getUmlModelElement());
		umlClassEClass.getESuperTypes().add(this.getUmlClassifier());
		umlClassifierEClass.getESuperTypes().add(this.getUmlPackageElement());
		umlPackageEClass.getESuperTypes().add(this.getUmlModelElement());
		umlPackageElementEClass.getESuperTypes().add(this.getUmlModelElement());
		umlPrimitiveDataTypeEClass.getESuperTypes().add(this.getUmlClassifier());

		// Initialize classes and features; add operations and parameters
		initEClass(umlAssociationEClass, UmlAssociation.class, "UmlAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlAssociation_UmlDestination(), this.getUmlClass(), this.getUmlClass_UmlForward(), "umlDestination", null, 1, 1, UmlAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlAssociation_UmlSource(), this.getUmlClass(), this.getUmlClass_UmlReverse(), "umlSource", null, 1, 1, UmlAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlAttributeEClass, UmlAttribute.class, "UmlAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlAttribute_UmlOwner(), this.getUmlClass(), this.getUmlClass_UmlAttribute(), "umlOwner", null, 0, 1, UmlAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlAttribute_UmlType(), this.getUmlClassifier(), this.getUmlClassifier_UmlAttribute1(), "umlType", null, 0, 1, UmlAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlClassEClass, UmlClass.class, "UmlClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlClass_UmlForward(), this.getUmlAssociation(), this.getUmlAssociation_UmlDestination(), "umlForward", null, 0, -1, UmlClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlClass_UmlReverse(), this.getUmlAssociation(), this.getUmlAssociation_UmlSource(), "umlReverse", null, 0, -1, UmlClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlClass_UmlAttribute(), this.getUmlAttribute(), this.getUmlAttribute_UmlOwner(), "umlAttribute", null, 0, -1, UmlClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlClass_UmlGeneral(), this.getUmlClass(), this.getUmlClass_UmlSpecific(), "umlGeneral", null, 0, -1, UmlClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlClass_UmlSpecific(), this.getUmlClass(), this.getUmlClass_UmlGeneral(), "umlSpecific", null, 0, -1, UmlClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlClassifierEClass, UmlClassifier.class, "UmlClassifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlClassifier_UmlAttribute1(), this.getUmlAttribute(), this.getUmlAttribute_UmlType(), "umlAttribute1", null, 0, -1, UmlClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlModelElementEClass, UmlModelElement.class, "UmlModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUmlModelElement_UmlName(), ecorePackage.getEString(), "umlName", null, 1, 1, UmlModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUmlModelElement_UmlKind(), ecorePackage.getEString(), "umlKind", null, 1, 1, UmlModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUmlModelElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, UmlModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlPackageEClass, UmlPackage.class, "UmlPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlPackage_UmlOwnedElement(), this.getUmlPackageElement(), this.getUmlPackageElement_UmlNamespace(), "umlOwnedElement", null, 0, -1, UmlPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlPackageElementEClass, UmlPackageElement.class, "UmlPackageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlPackageElement_UmlNamespace(), this.getUmlPackage(), this.getUmlPackage_UmlOwnedElement(), "umlNamespace", null, 0, 1, UmlPackageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlPrimitiveDataTypeEClass, UmlPrimitiveDataType.class, "UmlPrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SimpleUMLPackageImpl
