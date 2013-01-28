/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlForward <em>Uml Forward</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlReverse <em>Uml Reverse</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlAttribute <em>Uml Attribute</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlGeneral <em>Uml General</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlSpecific <em>Uml Specific</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlClass()
 * @model
 * @generated
 */
public interface UmlClass extends UmlClassifier {
	/**
	 * Returns the value of the '<em><b>Uml Forward</b></em>' reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation#getUmlDestination <em>Uml Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Forward</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Forward</em>' reference list.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlClass_UmlForward()
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation#getUmlDestination
	 * @model opposite="umlDestination"
	 * @generated
	 */
	EList<UmlAssociation> getUmlForward();

	/**
	 * Returns the value of the '<em><b>Uml Reverse</b></em>' reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation#getUmlSource <em>Uml Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Reverse</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Reverse</em>' reference list.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlClass_UmlReverse()
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation#getUmlSource
	 * @model opposite="umlSource"
	 * @generated
	 */
	EList<UmlAssociation> getUmlReverse();

	/**
	 * Returns the value of the '<em><b>Uml Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute#getUmlOwner <em>Uml Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Attribute</em>' containment reference list.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlClass_UmlAttribute()
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute#getUmlOwner
	 * @model opposite="umlOwner" containment="true"
	 * @generated
	 */
	EList<UmlAttribute> getUmlAttribute();

	/**
	 * Returns the value of the '<em><b>Uml General</b></em>' reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlSpecific <em>Uml Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml General</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml General</em>' reference list.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlClass_UmlGeneral()
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlSpecific
	 * @model opposite="umlSpecific"
	 * @generated
	 */
	EList<UmlClass> getUmlGeneral();

	/**
	 * Returns the value of the '<em><b>Uml Specific</b></em>' reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlGeneral <em>Uml General</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Specific</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Specific</em>' reference list.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlClass_UmlSpecific()
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlClass#getUmlGeneral
	 * @model opposite="umlGeneral"
	 * @generated
	 */
	EList<UmlClass> getUmlSpecific();

} // UmlClass
