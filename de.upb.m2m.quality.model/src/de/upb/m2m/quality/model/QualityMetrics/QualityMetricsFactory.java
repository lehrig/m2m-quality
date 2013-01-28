/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QualityMetrics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage
 * @generated
 */
public interface QualityMetricsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QualityMetricsFactory eINSTANCE = de.upb.m2m.quality.model.QualityMetrics.impl.QualityMetricsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Metrics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metrics</em>'.
	 * @generated
	 */
	Metrics createMetrics();

	/**
	 * Returns a new object of class '<em>Simple Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Metric</em>'.
	 * @generated
	 */
	SimpleMetric createSimpleMetric();

	/**
	 * Returns a new object of class '<em>Aggregated Integer Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregated Integer Metric</em>'.
	 * @generated
	 */
	AggregatedIntegerMetric createAggregatedIntegerMetric();

	/**
	 * Returns a new object of class '<em>Aggregated Real Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregated Real Metric</em>'.
	 * @generated
	 */
	AggregatedRealMetric createAggregatedRealMetric();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QualityMetricsPackage getQualityMetricsPackage();

} //QualityMetricsFactory
