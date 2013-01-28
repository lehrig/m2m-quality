/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation#getUmlDestination <em>Uml Destination</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation#getUmlSource <em>Uml Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlAssociation()
 * @model
 * @generated
 */
public interface UmlAssociation extends UmlPackageElement {
	/**
	 * Returns the value of the '<em><b>Uml Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlForward <em>Uml Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Destination</em>' reference.
	 * @see #setUmlDestination(UmlClass)
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlAssociation_UmlDestination()
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlForward
	 * @model opposite="umlForward" required="true"
	 * @generated
	 */
	UmlClass getUmlDestination();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation#getUmlDestination <em>Uml Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Destination</em>' reference.
	 * @see #getUmlDestination()
	 * @generated
	 */
	void setUmlDestination(UmlClass value);

	/**
	 * Returns the value of the '<em><b>Uml Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlReverse <em>Uml Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Source</em>' reference.
	 * @see #setUmlSource(UmlClass)
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlAssociation_UmlSource()
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlReverse
	 * @model opposite="umlReverse" required="true"
	 * @generated
	 */
	UmlClass getUmlSource();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation#getUmlSource <em>Uml Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Source</em>' reference.
	 * @see #getUmlSource()
	 * @generated
	 */
	void setUmlSource(UmlClass value);

} // UmlAssociation
