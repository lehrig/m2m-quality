/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QualityMetrics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metrics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.model.QualityMetrics.Metrics#getSimpleMetrics <em>Simple Metrics</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QualityMetrics.Metrics#getAggregatedIntegerMetrics <em>Aggregated Integer Metrics</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QualityMetrics.Metrics#getAggregatedRealMetrics <em>Aggregated Real Metrics</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QualityMetrics.Metrics#getTrafoName <em>Trafo Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage#getMetrics()
 * @model
 * @generated
 */
public interface Metrics extends EObject {
	/**
	 * Returns the value of the '<em><b>Simple Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.model.QualityMetrics.SimpleMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Metrics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Metrics</em>' containment reference list.
	 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage#getMetrics_SimpleMetrics()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimpleMetric> getSimpleMetrics();

	/**
	 * Returns the value of the '<em><b>Aggregated Integer Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregated Integer Metrics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated Integer Metrics</em>' containment reference list.
	 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage#getMetrics_AggregatedIntegerMetrics()
	 * @model containment="true"
	 * @generated
	 */
	EList<AggregatedIntegerMetric> getAggregatedIntegerMetrics();

	/**
	 * Returns the value of the '<em><b>Aggregated Real Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregated Real Metrics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated Real Metrics</em>' containment reference list.
	 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage#getMetrics_AggregatedRealMetrics()
	 * @model containment="true"
	 * @generated
	 */
	EList<AggregatedRealMetric> getAggregatedRealMetrics();

	/**
	 * Returns the value of the '<em><b>Trafo Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trafo Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trafo Name</em>' attribute.
	 * @see #setTrafoName(String)
	 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage#getMetrics_TrafoName()
	 * @model required="true"
	 * @generated
	 */
	String getTrafoName();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QualityMetrics.Metrics#getTrafoName <em>Trafo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trafo Name</em>' attribute.
	 * @see #getTrafoName()
	 * @generated
	 */
	void setTrafoName(String value);

} // Metrics
