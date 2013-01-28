/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement#getUmlName <em>Uml Name</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement#getUmlKind <em>Uml Kind</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlModelElement()
 * @model
 * @generated
 */
public interface UmlModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Uml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Name</em>' attribute.
	 * @see #setUmlName(String)
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlModelElement_UmlName()
	 * @model required="true"
	 * @generated
	 */
	String getUmlName();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement#getUmlName <em>Uml Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Name</em>' attribute.
	 * @see #getUmlName()
	 * @generated
	 */
	void setUmlName(String value);

	/**
	 * Returns the value of the '<em><b>Uml Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Kind</em>' attribute.
	 * @see #setUmlKind(String)
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlModelElement_UmlKind()
	 * @model required="true"
	 * @generated
	 */
	String getUmlKind();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement#getUmlKind <em>Uml Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Kind</em>' attribute.
	 * @see #getUmlKind()
	 * @generated
	 */
	void setUmlKind(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlModelElement_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // UmlModelElement
