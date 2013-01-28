/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Package Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlPackageElement#getUmlNamespace <em>Uml Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlPackageElement()
 * @model
 * @generated
 */
public interface UmlPackageElement extends UmlModelElement {
	/**
	 * Returns the value of the '<em><b>Uml Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlPackage#getUmlOwnedElement <em>Uml Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Namespace</em>' container reference.
	 * @see #setUmlNamespace(UmlPackage)
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlPackageElement_UmlNamespace()
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlPackage#getUmlOwnedElement
	 * @model opposite="umlOwnedElement" transient="false"
	 * @generated
	 */
	UmlPackage getUmlNamespace();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlPackageElement#getUmlNamespace <em>Uml Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Namespace</em>' container reference.
	 * @see #getUmlNamespace()
	 * @generated
	 */
	void setUmlNamespace(UmlPackage value);

} // UmlPackageElement
