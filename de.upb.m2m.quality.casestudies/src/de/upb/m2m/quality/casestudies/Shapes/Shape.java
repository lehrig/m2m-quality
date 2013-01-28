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
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.Shapes.Shape#getInArrow <em>In Arrow</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.Shapes.Shape#getOutArrow <em>Out Arrow</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.casestudies.Shapes.ShapesPackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends ModelElement {
	/**
	 * Returns the value of the '<em><b>In Arrow</b></em>' reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.Shapes.Arrow}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.Shapes.Arrow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Arrow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Arrow</em>' reference list.
	 * @see de.upb.m2m.quality.casestudies.Shapes.ShapesPackage#getShape_InArrow()
	 * @see de.upb.m2m.quality.casestudies.Shapes.Arrow#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Arrow> getInArrow();

	/**
	 * Returns the value of the '<em><b>Out Arrow</b></em>' reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.Shapes.Arrow}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.Shapes.Arrow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Arrow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Arrow</em>' reference list.
	 * @see de.upb.m2m.quality.casestudies.Shapes.ShapesPackage#getShape_OutArrow()
	 * @see de.upb.m2m.quality.casestudies.Shapes.Arrow#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Arrow> getOutArrow();

} // Shape
