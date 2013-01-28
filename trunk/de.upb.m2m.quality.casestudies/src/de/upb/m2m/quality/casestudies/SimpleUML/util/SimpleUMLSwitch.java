/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML.util;

import de.upb.m2m.quality.casestudies.SimpleUML.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage
 * @generated
 */
public class SimpleUMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimpleUMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleUMLSwitch() {
		if (modelPackage == null) {
			modelPackage = SimpleUMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SimpleUMLPackage.UML_ASSOCIATION: {
				UmlAssociation umlAssociation = (UmlAssociation)theEObject;
				T result = caseUmlAssociation(umlAssociation);
				if (result == null) result = caseUmlPackageElement(umlAssociation);
				if (result == null) result = caseUmlModelElement(umlAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleUMLPackage.UML_ATTRIBUTE: {
				UmlAttribute umlAttribute = (UmlAttribute)theEObject;
				T result = caseUmlAttribute(umlAttribute);
				if (result == null) result = caseUmlModelElement(umlAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleUMLPackage.UML_CLASS: {
				UmlClass umlClass = (UmlClass)theEObject;
				T result = caseUmlClass(umlClass);
				if (result == null) result = caseUmlClassifier(umlClass);
				if (result == null) result = caseUmlPackageElement(umlClass);
				if (result == null) result = caseUmlModelElement(umlClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleUMLPackage.UML_CLASSIFIER: {
				UmlClassifier umlClassifier = (UmlClassifier)theEObject;
				T result = caseUmlClassifier(umlClassifier);
				if (result == null) result = caseUmlPackageElement(umlClassifier);
				if (result == null) result = caseUmlModelElement(umlClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleUMLPackage.UML_MODEL_ELEMENT: {
				UmlModelElement umlModelElement = (UmlModelElement)theEObject;
				T result = caseUmlModelElement(umlModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleUMLPackage.UML_PACKAGE: {
				UmlPackage umlPackage = (UmlPackage)theEObject;
				T result = caseUmlPackage(umlPackage);
				if (result == null) result = caseUmlModelElement(umlPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleUMLPackage.UML_PACKAGE_ELEMENT: {
				UmlPackageElement umlPackageElement = (UmlPackageElement)theEObject;
				T result = caseUmlPackageElement(umlPackageElement);
				if (result == null) result = caseUmlModelElement(umlPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleUMLPackage.UML_PRIMITIVE_DATA_TYPE: {
				UmlPrimitiveDataType umlPrimitiveDataType = (UmlPrimitiveDataType)theEObject;
				T result = caseUmlPrimitiveDataType(umlPrimitiveDataType);
				if (result == null) result = caseUmlClassifier(umlPrimitiveDataType);
				if (result == null) result = caseUmlPackageElement(umlPrimitiveDataType);
				if (result == null) result = caseUmlModelElement(umlPrimitiveDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlAssociation(UmlAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlAttribute(UmlAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlClass(UmlClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlClassifier(UmlClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlModelElement(UmlModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlPackage(UmlPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Package Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Package Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlPackageElement(UmlPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Primitive Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlPrimitiveDataType(UmlPrimitiveDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SimpleUMLSwitch
