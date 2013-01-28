/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute#getUmlOwner <em>Uml Owner</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute#getUmlType <em>Uml Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlAttribute()
 * @model
 * @generated
 */
public interface UmlAttribute extends UmlModelElement {
	/**
	 * Returns the value of the '<em><b>Uml Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlAttribute <em>Uml Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Owner</em>' container reference.
	 * @see #setUmlOwner(UmlClass)
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlAttribute_UmlOwner()
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlAttribute
	 * @model opposite="umlAttribute" transient="false"
	 * @generated
	 */
	UmlClass getUmlOwner();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute#getUmlOwner <em>Uml Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Owner</em>' container reference.
	 * @see #getUmlOwner()
	 * @generated
	 */
	void setUmlOwner(UmlClass value);

	/**
	 * Returns the value of the '<em><b>Uml Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClassifier#getUmlAttribute1 <em>Uml Attribute1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Type</em>' reference.
	 * @see #setUmlType(UmlClassifier)
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlAttribute_UmlType()
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlClassifier#getUmlAttribute1
	 * @model opposite="umlAttribute1"
	 * @generated
	 */
	UmlClassifier getUmlType();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute#getUmlType <em>Uml Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Type</em>' reference.
	 * @see #getUmlType()
	 * @generated
	 */
	void setUmlType(UmlClassifier value);

} // UmlAttribute
