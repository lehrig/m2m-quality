/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.Shapes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.Shapes.Arrow#getSource <em>Source</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.Shapes.Arrow#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.casestudies.Shapes.ShapesPackage#getArrow()
 * @model
 * @generated
 */
public interface Arrow extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.Shapes.Shape#getOutArrow <em>Out Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Shape)
	 * @see de.upb.m2m.quality.casestudies.Shapes.ShapesPackage#getArrow_Source()
	 * @see de.upb.m2m.quality.casestudies.Shapes.Shape#getOutArrow
	 * @model opposite="outArrow"
	 * @generated
	 */
	Shape getSource();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.Shapes.Arrow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Shape value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.Shapes.Shape#getInArrow <em>In Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Shape)
	 * @see de.upb.m2m.quality.casestudies.Shapes.ShapesPackage#getArrow_Target()
	 * @see de.upb.m2m.quality.casestudies.Shapes.Shape#getInArrow
	 * @model opposite="inArrow"
	 * @generated
	 */
	Shape getTarget();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.Shapes.Arrow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Shape value);

} // Arrow
