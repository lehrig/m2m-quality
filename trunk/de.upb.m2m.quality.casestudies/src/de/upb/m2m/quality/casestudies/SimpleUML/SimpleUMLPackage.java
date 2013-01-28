/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleUMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SimpleUML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://m2m.upb.de/SimpleUML/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SimpleUML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleUMLPackage eINSTANCE = de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlModelElementImpl <em>Uml Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlModelElementImpl
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl#getUmlModelElement()
	 * @generated
	 */
	int UML_MODEL_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Uml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MODEL_ELEMENT__UML_NAME = 0;

	/**
	 * The feature id for the '<em><b>Uml Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MODEL_ELEMENT__UML_KIND = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MODEL_ELEMENT__ID = 2;

	/**
	 * The number of structural features of the '<em>Uml Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MODEL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlPackageElementImpl <em>Uml Package Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlPackageElementImpl
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl#getUmlPackageElement()
	 * @generated
	 */
	int UML_PACKAGE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Uml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE_ELEMENT__UML_NAME = UML_MODEL_ELEMENT__UML_NAME;

	/**
	 * The feature id for the '<em><b>Uml Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE_ELEMENT__UML_KIND = UML_MODEL_ELEMENT__UML_KIND;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE_ELEMENT__ID = UML_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Uml Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE_ELEMENT__UML_NAMESPACE = UML_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uml Package Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE_ELEMENT_FEATURE_COUNT = UML_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlAssociationImpl <em>Uml Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlAssociationImpl
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl#getUmlAssociation()
	 * @generated
	 */
	int UML_ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Uml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION__UML_NAME = UML_PACKAGE_ELEMENT__UML_NAME;

	/**
	 * The feature id for the '<em><b>Uml Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION__UML_KIND = UML_PACKAGE_ELEMENT__UML_KIND;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION__ID = UML_PACKAGE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Uml Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION__UML_NAMESPACE = UML_PACKAGE_ELEMENT__UML_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Uml Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION__UML_DESTINATION = UML_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uml Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION__UML_SOURCE = UML_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uml Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION_FEATURE_COUNT = UML_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlAttributeImpl <em>Uml Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlAttributeImpl
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl#getUmlAttribute()
	 * @generated
	 */
	int UML_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Uml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ATTRIBUTE__UML_NAME = UML_MODEL_ELEMENT__UML_NAME;

	/**
	 * The feature id for the '<em><b>Uml Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ATTRIBUTE__UML_KIND = UML_MODEL_ELEMENT__UML_KIND;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ATTRIBUTE__ID = UML_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Uml Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ATTRIBUTE__UML_OWNER = UML_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uml Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ATTRIBUTE__UML_TYPE = UML_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uml Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ATTRIBUTE_FEATURE_COUNT = UML_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlClassifierImpl <em>Uml Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlClassifierImpl
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl#getUmlClassifier()
	 * @generated
	 */
	int UML_CLASSIFIER = 3;

	/**
	 * The feature id for the '<em><b>Uml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER__UML_NAME = UML_PACKAGE_ELEMENT__UML_NAME;

	/**
	 * The feature id for the '<em><b>Uml Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER__UML_KIND = UML_PACKAGE_ELEMENT__UML_KIND;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER__ID = UML_PACKAGE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Uml Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER__UML_NAMESPACE = UML_PACKAGE_ELEMENT__UML_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Uml Attribute1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER__UML_ATTRIBUTE1 = UML_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uml Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_FEATURE_COUNT = UML_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlClassImpl <em>Uml Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlClassImpl
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl#getUmlClass()
	 * @generated
	 */
	int UML_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Uml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__UML_NAME = UML_CLASSIFIER__UML_NAME;

	/**
	 * The feature id for the '<em><b>Uml Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__UML_KIND = UML_CLASSIFIER__UML_KIND;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__ID = UML_CLASSIFIER__ID;

	/**
	 * The feature id for the '<em><b>Uml Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__UML_NAMESPACE = UML_CLASSIFIER__UML_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Uml Attribute1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__UML_ATTRIBUTE1 = UML_CLASSIFIER__UML_ATTRIBUTE1;

	/**
	 * The feature id for the '<em><b>Uml Forward</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__UML_FORWARD = UML_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uml Reverse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__UML_REVERSE = UML_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uml Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__UML_ATTRIBUTE = UML_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uml General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__UML_GENERAL = UML_CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uml Specific</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__UML_SPECIFIC = UML_CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Uml Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_FEATURE_COUNT = UML_CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlPackageImpl <em>Uml Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlPackageImpl
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl#getUmlPackage()
	 * @generated
	 */
	int UML_PACKAGE = 5;

	/**
	 * The feature id for the '<em><b>Uml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__UML_NAME = UML_MODEL_ELEMENT__UML_NAME;

	/**
	 * The feature id for the '<em><b>Uml Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__UML_KIND = UML_MODEL_ELEMENT__UML_KIND;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__ID = UML_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Uml Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__UML_OWNED_ELEMENT = UML_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uml Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE_FEATURE_COUNT = UML_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlPrimitiveDataTypeImpl <em>Uml Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlPrimitiveDataTypeImpl
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl#getUmlPrimitiveDataType()
	 * @generated
	 */
	int UML_PRIMITIVE_DATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Uml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PRIMITIVE_DATA_TYPE__UML_NAME = UML_CLASSIFIER__UML_NAME;

	/**
	 * The feature id for the '<em><b>Uml Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PRIMITIVE_DATA_TYPE__UML_KIND = UML_CLASSIFIER__UML_KIND;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PRIMITIVE_DATA_TYPE__ID = UML_CLASSIFIER__ID;

	/**
	 * The feature id for the '<em><b>Uml Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PRIMITIVE_DATA_TYPE__UML_NAMESPACE = UML_CLASSIFIER__UML_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Uml Attribute1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PRIMITIVE_DATA_TYPE__UML_ATTRIBUTE1 = UML_CLASSIFIER__UML_ATTRIBUTE1;

	/**
	 * The number of structural features of the '<em>Uml Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PRIMITIVE_DATA_TYPE_FEATURE_COUNT = UML_CLASSIFIER_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation <em>Uml Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Association</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation
	 * @generated
	 */
	EClass getUmlAssociation();

	/**
	 * Returns the meta object for the reference '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation#getUmlDestination <em>Uml Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uml Destination</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation#getUmlDestination()
	 * @see #getUmlAssociation()
	 * @generated
	 */
	EReference getUmlAssociation_UmlDestination();

	/**
	 * Returns the meta object for the reference '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation#getUmlSource <em>Uml Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uml Source</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation#getUmlSource()
	 * @see #getUmlAssociation()
	 * @generated
	 */
	EReference getUmlAssociation_UmlSource();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute <em>Uml Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Attribute</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute
	 * @generated
	 */
	EClass getUmlAttribute();

	/**
	 * Returns the meta object for the container reference '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute#getUmlOwner <em>Uml Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Uml Owner</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute#getUmlOwner()
	 * @see #getUmlAttribute()
	 * @generated
	 */
	EReference getUmlAttribute_UmlOwner();

	/**
	 * Returns the meta object for the reference '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute#getUmlType <em>Uml Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uml Type</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute#getUmlType()
	 * @see #getUmlAttribute()
	 * @generated
	 */
	EReference getUmlAttribute_UmlType();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass <em>Uml Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Class</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlClass
	 * @generated
	 */
	EClass getUmlClass();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlForward <em>Uml Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uml Forward</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlForward()
	 * @see #getUmlClass()
	 * @generated
	 */
	EReference getUmlClass_UmlForward();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlReverse <em>Uml Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uml Reverse</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlReverse()
	 * @see #getUmlClass()
	 * @generated
	 */
	EReference getUmlClass_UmlReverse();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlAttribute <em>Uml Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uml Attribute</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlAttribute()
	 * @see #getUmlClass()
	 * @generated
	 */
	EReference getUmlClass_UmlAttribute();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlGeneral <em>Uml General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uml General</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlGeneral()
	 * @see #getUmlClass()
	 * @generated
	 */
	EReference getUmlClass_UmlGeneral();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlSpecific <em>Uml Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uml Specific</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlSpecific()
	 * @see #getUmlClass()
	 * @generated
	 */
	EReference getUmlClass_UmlSpecific();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClassifier <em>Uml Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Classifier</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlClassifier
	 * @generated
	 */
	EClass getUmlClassifier();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClassifier#getUmlAttribute1 <em>Uml Attribute1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uml Attribute1</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlClassifier#getUmlAttribute1()
	 * @see #getUmlClassifier()
	 * @generated
	 */
	EReference getUmlClassifier_UmlAttribute1();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement <em>Uml Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Model Element</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement
	 * @generated
	 */
	EClass getUmlModelElement();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement#getUmlName <em>Uml Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uml Name</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement#getUmlName()
	 * @see #getUmlModelElement()
	 * @generated
	 */
	EAttribute getUmlModelElement_UmlName();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement#getUmlKind <em>Uml Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uml Kind</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement#getUmlKind()
	 * @see #getUmlModelElement()
	 * @generated
	 */
	EAttribute getUmlModelElement_UmlKind();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement#getId()
	 * @see #getUmlModelElement()
	 * @generated
	 */
	EAttribute getUmlModelElement_Id();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlPackage <em>Uml Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Package</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlPackage
	 * @generated
	 */
	EClass getUmlPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlPackage#getUmlOwnedElement <em>Uml Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uml Owned Element</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlPackage#getUmlOwnedElement()
	 * @see #getUmlPackage()
	 * @generated
	 */
	EReference getUmlPackage_UmlOwnedElement();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlPackageElement <em>Uml Package Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Package Element</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlPackageElement
	 * @generated
	 */
	EClass getUmlPackageElement();

	/**
	 * Returns the meta object for the container reference '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlPackageElement#getUmlNamespace <em>Uml Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Uml Namespace</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlPackageElement#getUmlNamespace()
	 * @see #getUmlPackageElement()
	 * @generated
	 */
	EReference getUmlPackageElement_UmlNamespace();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlPrimitiveDataType <em>Uml Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Primitive Data Type</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlPrimitiveDataType
	 * @generated
	 */
	EClass getUmlPrimitiveDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleUMLFactory getSimpleUMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlAssociationImpl <em>Uml Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlAssociationImpl
		 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl#getUmlAssociation()
		 * @generated
		 */
		EClass UML_ASSOCIATION = eINSTANCE.getUmlAssociation();

		/**
		 * The meta object literal for the '<em><b>Uml Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ASSOCIATION__UML_DESTINATION = eINSTANCE.getUmlAssociation_UmlDestination();

		/**
		 * The meta object literal for the '<em><b>Uml Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ASSOCIATION__UML_SOURCE = eINSTANCE.getUmlAssociation_UmlSource();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlAttributeImpl <em>Uml Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlAttributeImpl
		 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl#getUmlAttribute()
		 * @generated
		 */
		EClass UML_ATTRIBUTE = eINSTANCE.getUmlAttribute();

		/**
		 * The meta object literal for the '<em><b>Uml Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ATTRIBUTE__UML_OWNER = eINSTANCE.getUmlAttribute_UmlOwner();

		/**
		 * The meta object literal for the '<em><b>Uml Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ATTRIBUTE__UML_TYPE = eINSTANCE.getUmlAttribute_UmlType();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlClassImpl <em>Uml Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlClassImpl
		 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl#getUmlClass()
		 * @generated
		 */
		EClass UML_CLASS = eINSTANCE.getUmlClass();

		/**
		 * The meta object literal for the '<em><b>Uml Forward</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS__UML_FORWARD = eINSTANCE.getUmlClass_UmlForward();

		/**
		 * The meta object literal for the '<em><b>Uml Reverse</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS__UML_REVERSE = eINSTANCE.getUmlClass_UmlReverse();

		/**
		 * The meta object literal for the '<em><b>Uml Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS__UML_ATTRIBUTE = eINSTANCE.getUmlClass_UmlAttribute();

		/**
		 * The meta object literal for the '<em><b>Uml General</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS__UML_GENERAL = eINSTANCE.getUmlClass_UmlGeneral();

		/**
		 * The meta object literal for the '<em><b>Uml Specific</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS__UML_SPECIFIC = eINSTANCE.getUmlClass_UmlSpecific();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlClassifierImpl <em>Uml Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlClassifierImpl
		 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl#getUmlClassifier()
		 * @generated
		 */
		EClass UML_CLASSIFIER = eINSTANCE.getUmlClassifier();

		/**
		 * The meta object literal for the '<em><b>Uml Attribute1</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASSIFIER__UML_ATTRIBUTE1 = eINSTANCE.getUmlClassifier_UmlAttribute1();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlModelElementImpl <em>Uml Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlModelElementImpl
		 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl#getUmlModelElement()
		 * @generated
		 */
		EClass UML_MODEL_ELEMENT = eINSTANCE.getUmlModelElement();

		/**
		 * The meta object literal for the '<em><b>Uml Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_MODEL_ELEMENT__UML_NAME = eINSTANCE.getUmlModelElement_UmlName();

		/**
		 * The meta object literal for the '<em><b>Uml Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_MODEL_ELEMENT__UML_KIND = eINSTANCE.getUmlModelElement_UmlKind();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_MODEL_ELEMENT__ID = eINSTANCE.getUmlModelElement_Id();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlPackageImpl <em>Uml Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlPackageImpl
		 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl#getUmlPackage()
		 * @generated
		 */
		EClass UML_PACKAGE = eINSTANCE.getUmlPackage();

		/**
		 * The meta object literal for the '<em><b>Uml Owned Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_PACKAGE__UML_OWNED_ELEMENT = eINSTANCE.getUmlPackage_UmlOwnedElement();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlPackageElementImpl <em>Uml Package Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlPackageElementImpl
		 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl#getUmlPackageElement()
		 * @generated
		 */
		EClass UML_PACKAGE_ELEMENT = eINSTANCE.getUmlPackageElement();

		/**
		 * The meta object literal for the '<em><b>Uml Namespace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_PACKAGE_ELEMENT__UML_NAMESPACE = eINSTANCE.getUmlPackageElement_UmlNamespace();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlPrimitiveDataTypeImpl <em>Uml Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlPrimitiveDataTypeImpl
		 * @see de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLPackageImpl#getUmlPrimitiveDataType()
		 * @generated
		 */
		EClass UML_PRIMITIVE_DATA_TYPE = eINSTANCE.getUmlPrimitiveDataType();

	}

} //SimpleUMLPackage
