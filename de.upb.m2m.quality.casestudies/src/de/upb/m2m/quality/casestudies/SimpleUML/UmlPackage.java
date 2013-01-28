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
 * A representation of the model object '<em><b>Uml Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlPackage#getUmlOwnedElement <em>Uml Owned Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlPackage()
 * @model
 * @generated
 */
public interface UmlPackage extends UmlModelElement {
	/**
	 * Returns the value of the '<em><b>Uml Owned Element</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.SimpleUML.UmlPackageElement}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlPackageElement#getUmlNamespace <em>Uml Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Owned Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Owned Element</em>' containment reference list.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlPackage_UmlOwnedElement()
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlPackageElement#getUmlNamespace
	 * @model opposite="umlNamespace" containment="true"
	 * @generated
	 */
	EList<UmlPackageElement> getUmlOwnedElement();

} // UmlPackage
