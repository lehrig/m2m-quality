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
 * A representation of the model object '<em><b>Uml Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClassifier#getUmlAttribute1 <em>Uml Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlClassifier()
 * @model
 * @generated
 */
public interface UmlClassifier extends UmlPackageElement {
	/**
	 * Returns the value of the '<em><b>Uml Attribute1</b></em>' reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute#getUmlType <em>Uml Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Attribute1</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Attribute1</em>' reference list.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage#getUmlClassifier_UmlAttribute1()
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute#getUmlType
	 * @model opposite="umlType"
	 * @generated
	 */
	EList<UmlAttribute> getUmlAttribute1();

} // UmlClassifier
