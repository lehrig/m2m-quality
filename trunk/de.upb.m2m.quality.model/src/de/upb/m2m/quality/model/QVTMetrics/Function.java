/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QVTMetrics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Function#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Function#getFanOut <em>Fan Out</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Function#getFanIn <em>Fan In</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fan Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan Out</em>' attribute.
	 * @see #setFanOut(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getFunction_FanOut()
	 * @model
	 * @generated
	 */
	int getFanOut();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Function#getFanOut <em>Fan Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan Out</em>' attribute.
	 * @see #getFanOut()
	 * @generated
	 */
	void setFanOut(int value);

	/**
	 * Returns the value of the '<em><b>Fan In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan In</em>' attribute.
	 * @see #setFanIn(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getFunction_FanIn()
	 * @model
	 * @generated
	 */
	int getFanIn();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Function#getFanIn <em>Fan In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan In</em>' attribute.
	 * @see #getFanIn()
	 * @generated
	 */
	void setFanIn(int value);

} // Function
