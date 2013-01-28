/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QualityMetrics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.model.QualityMetrics.SimpleMetric#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage#getSimpleMetric()
 * @model
 * @generated
 */
public interface SimpleMetric extends Metric {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage#getSimpleMetric_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QualityMetrics.SimpleMetric#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // SimpleMetric
