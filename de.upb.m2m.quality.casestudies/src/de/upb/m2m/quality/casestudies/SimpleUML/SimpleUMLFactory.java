/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage
 * @generated
 */
public interface SimpleUMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleUMLFactory eINSTANCE = de.upb.m2m.quality.casestudies.SimpleUML.impl.SimpleUMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Uml Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uml Association</em>'.
	 * @generated
	 */
	UmlAssociation createUmlAssociation();

	/**
	 * Returns a new object of class '<em>Uml Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uml Attribute</em>'.
	 * @generated
	 */
	UmlAttribute createUmlAttribute();

	/**
	 * Returns a new object of class '<em>Uml Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uml Class</em>'.
	 * @generated
	 */
	UmlClass createUmlClass();

	/**
	 * Returns a new object of class '<em>Uml Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uml Classifier</em>'.
	 * @generated
	 */
	UmlClassifier createUmlClassifier();

	/**
	 * Returns a new object of class '<em>Uml Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uml Model Element</em>'.
	 * @generated
	 */
	UmlModelElement createUmlModelElement();

	/**
	 * Returns a new object of class '<em>Uml Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uml Package</em>'.
	 * @generated
	 */
	UmlPackage createUmlPackage();

	/**
	 * Returns a new object of class '<em>Uml Package Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uml Package Element</em>'.
	 * @generated
	 */
	UmlPackageElement createUmlPackageElement();

	/**
	 * Returns a new object of class '<em>Uml Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uml Primitive Data Type</em>'.
	 * @generated
	 */
	UmlPrimitiveDataType createUmlPrimitiveDataType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimpleUMLPackage getSimpleUMLPackage();

} //SimpleUMLFactory
