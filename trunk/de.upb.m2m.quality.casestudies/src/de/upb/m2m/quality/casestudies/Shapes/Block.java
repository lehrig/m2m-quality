/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.Shapes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.Shapes.Block#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.casestudies.Shapes.ShapesPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Shape {
	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.Shapes.ModelElement}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.Shapes.ModelElement#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' containment reference list.
	 * @see de.upb.m2m.quality.casestudies.Shapes.ShapesPackage#getBlock_ModelElement()
	 * @see de.upb.m2m.quality.casestudies.Shapes.ModelElement#getBlock
	 * @model opposite="block" containment="true"
	 * @generated
	 */
	EList<ModelElement> getModelElement();

} // Block
