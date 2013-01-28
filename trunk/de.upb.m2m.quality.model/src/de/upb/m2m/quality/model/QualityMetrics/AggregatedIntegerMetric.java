/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QualityMetrics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated Integer Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getMedian <em>Median</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getAverage <em>Average</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getStandardDeviation <em>Standard Deviation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage#getAggregatedIntegerMetric()
 * @model
 * @generated
 */
public interface AggregatedIntegerMetric extends Metric {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(int)
	 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage#getAggregatedIntegerMetric_Minimum()
	 * @model required="true"
	 * @generated
	 */
	int getMinimum();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(int value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(int)
	 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage#getAggregatedIntegerMetric_Maximum()
	 * @model required="true"
	 * @generated
	 */
	int getMaximum();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(int value);

	/**
	 * Returns the value of the '<em><b>Median</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Median</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Median</em>' attribute.
	 * @see #setMedian(int)
	 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage#getAggregatedIntegerMetric_Median()
	 * @model required="true"
	 * @generated
	 */
	int getMedian();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getMedian <em>Median</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Median</em>' attribute.
	 * @see #getMedian()
	 * @generated
	 */
	void setMedian(int value);

	/**
	 * Returns the value of the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average</em>' attribute.
	 * @see #setAverage(float)
	 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage#getAggregatedIntegerMetric_Average()
	 * @model required="true"
	 * @generated
	 */
	float getAverage();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getAverage <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average</em>' attribute.
	 * @see #getAverage()
	 * @generated
	 */
	void setAverage(float value);

	/**
	 * Returns the value of the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Deviation</em>' attribute.
	 * @see #setStandardDeviation(float)
	 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage#getAggregatedIntegerMetric_StandardDeviation()
	 * @model required="true"
	 * @generated
	 */
	float getStandardDeviation();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getStandardDeviation <em>Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Deviation</em>' attribute.
	 * @see #getStandardDeviation()
	 * @generated
	 */
	void setStandardDeviation(float value);

} // AggregatedIntegerMetric
