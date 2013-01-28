/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QualityMetrics;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsFactory
 * @model kind="package"
 * @generated
 */
public interface QualityMetricsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "QualityMetrics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://m2m.upb.de/QualityMetrics/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QualityMetrics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QualityMetricsPackage eINSTANCE = de.upb.m2m.quality.model.QualityMetrics.impl.QualityMetricsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.model.QualityMetrics.impl.MetricsImpl <em>Metrics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.model.QualityMetrics.impl.MetricsImpl
	 * @see de.upb.m2m.quality.model.QualityMetrics.impl.QualityMetricsPackageImpl#getMetrics()
	 * @generated
	 */
	int METRICS = 0;

	/**
	 * The feature id for the '<em><b>Simple Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS__SIMPLE_METRICS = 0;

	/**
	 * The feature id for the '<em><b>Aggregated Integer Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS__AGGREGATED_INTEGER_METRICS = 1;

	/**
	 * The feature id for the '<em><b>Aggregated Real Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS__AGGREGATED_REAL_METRICS = 2;

	/**
	 * The feature id for the '<em><b>Trafo Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS__TRAFO_NAME = 3;

	/**
	 * The number of structural features of the '<em>Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.model.QualityMetrics.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.model.QualityMetrics.impl.MetricImpl
	 * @see de.upb.m2m.quality.model.QualityMetrics.impl.QualityMetricsPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 1;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__METRIC = 0;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.model.QualityMetrics.impl.SimpleMetricImpl <em>Simple Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.model.QualityMetrics.impl.SimpleMetricImpl
	 * @see de.upb.m2m.quality.model.QualityMetrics.impl.QualityMetricsPackageImpl#getSimpleMetric()
	 * @generated
	 */
	int SIMPLE_METRIC = 2;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METRIC__METRIC = METRIC__METRIC;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METRIC__VALUE = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METRIC_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.model.QualityMetrics.impl.AggregatedIntegerMetricImpl <em>Aggregated Integer Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.model.QualityMetrics.impl.AggregatedIntegerMetricImpl
	 * @see de.upb.m2m.quality.model.QualityMetrics.impl.QualityMetricsPackageImpl#getAggregatedIntegerMetric()
	 * @generated
	 */
	int AGGREGATED_INTEGER_METRIC = 3;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_INTEGER_METRIC__METRIC = METRIC__METRIC;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_INTEGER_METRIC__MINIMUM = METRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_INTEGER_METRIC__MAXIMUM = METRIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Median</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_INTEGER_METRIC__MEDIAN = METRIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_INTEGER_METRIC__AVERAGE = METRIC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_INTEGER_METRIC__STANDARD_DEVIATION = METRIC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Aggregated Integer Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_INTEGER_METRIC_FEATURE_COUNT = METRIC_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.model.QualityMetrics.impl.AggregatedRealMetricImpl <em>Aggregated Real Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.model.QualityMetrics.impl.AggregatedRealMetricImpl
	 * @see de.upb.m2m.quality.model.QualityMetrics.impl.QualityMetricsPackageImpl#getAggregatedRealMetric()
	 * @generated
	 */
	int AGGREGATED_REAL_METRIC = 4;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_REAL_METRIC__METRIC = METRIC__METRIC;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_REAL_METRIC__MINIMUM = METRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_REAL_METRIC__MAXIMUM = METRIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Median</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_REAL_METRIC__MEDIAN = METRIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_REAL_METRIC__AVERAGE = METRIC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_REAL_METRIC__STANDARD_DEVIATION = METRIC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Aggregated Real Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_REAL_METRIC_FEATURE_COUNT = METRIC_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.model.QualityMetrics.Metrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metrics</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.Metrics
	 * @generated
	 */
	EClass getMetrics();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.m2m.quality.model.QualityMetrics.Metrics#getSimpleMetrics <em>Simple Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Metrics</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.Metrics#getSimpleMetrics()
	 * @see #getMetrics()
	 * @generated
	 */
	EReference getMetrics_SimpleMetrics();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.m2m.quality.model.QualityMetrics.Metrics#getAggregatedIntegerMetrics <em>Aggregated Integer Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregated Integer Metrics</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.Metrics#getAggregatedIntegerMetrics()
	 * @see #getMetrics()
	 * @generated
	 */
	EReference getMetrics_AggregatedIntegerMetrics();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.m2m.quality.model.QualityMetrics.Metrics#getAggregatedRealMetrics <em>Aggregated Real Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregated Real Metrics</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.Metrics#getAggregatedRealMetrics()
	 * @see #getMetrics()
	 * @generated
	 */
	EReference getMetrics_AggregatedRealMetrics();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QualityMetrics.Metrics#getTrafoName <em>Trafo Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trafo Name</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.Metrics#getTrafoName()
	 * @see #getMetrics()
	 * @generated
	 */
	EAttribute getMetrics_TrafoName();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.model.QualityMetrics.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QualityMetrics.Metric#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.Metric#getMetric()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Metric();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.model.QualityMetrics.SimpleMetric <em>Simple Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Metric</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.SimpleMetric
	 * @generated
	 */
	EClass getSimpleMetric();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QualityMetrics.SimpleMetric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.SimpleMetric#getValue()
	 * @see #getSimpleMetric()
	 * @generated
	 */
	EAttribute getSimpleMetric_Value();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric <em>Aggregated Integer Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated Integer Metric</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric
	 * @generated
	 */
	EClass getAggregatedIntegerMetric();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getMinimum()
	 * @see #getAggregatedIntegerMetric()
	 * @generated
	 */
	EAttribute getAggregatedIntegerMetric_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getMaximum()
	 * @see #getAggregatedIntegerMetric()
	 * @generated
	 */
	EAttribute getAggregatedIntegerMetric_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getMedian <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Median</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getMedian()
	 * @see #getAggregatedIntegerMetric()
	 * @generated
	 */
	EAttribute getAggregatedIntegerMetric_Median();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getAverage <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getAverage()
	 * @see #getAggregatedIntegerMetric()
	 * @generated
	 */
	EAttribute getAggregatedIntegerMetric_Average();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric#getStandardDeviation()
	 * @see #getAggregatedIntegerMetric()
	 * @generated
	 */
	EAttribute getAggregatedIntegerMetric_StandardDeviation();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric <em>Aggregated Real Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated Real Metric</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric
	 * @generated
	 */
	EClass getAggregatedRealMetric();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric#getMinimum()
	 * @see #getAggregatedRealMetric()
	 * @generated
	 */
	EAttribute getAggregatedRealMetric_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric#getMaximum()
	 * @see #getAggregatedRealMetric()
	 * @generated
	 */
	EAttribute getAggregatedRealMetric_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric#getMedian <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Median</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric#getMedian()
	 * @see #getAggregatedRealMetric()
	 * @generated
	 */
	EAttribute getAggregatedRealMetric_Median();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric#getAverage <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric#getAverage()
	 * @see #getAggregatedRealMetric()
	 * @generated
	 */
	EAttribute getAggregatedRealMetric_Average();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric#getStandardDeviation()
	 * @see #getAggregatedRealMetric()
	 * @generated
	 */
	EAttribute getAggregatedRealMetric_StandardDeviation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QualityMetricsFactory getQualityMetricsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.model.QualityMetrics.impl.MetricsImpl <em>Metrics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.model.QualityMetrics.impl.MetricsImpl
		 * @see de.upb.m2m.quality.model.QualityMetrics.impl.QualityMetricsPackageImpl#getMetrics()
		 * @generated
		 */
		EClass METRICS = eINSTANCE.getMetrics();

		/**
		 * The meta object literal for the '<em><b>Simple Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRICS__SIMPLE_METRICS = eINSTANCE.getMetrics_SimpleMetrics();

		/**
		 * The meta object literal for the '<em><b>Aggregated Integer Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRICS__AGGREGATED_INTEGER_METRICS = eINSTANCE.getMetrics_AggregatedIntegerMetrics();

		/**
		 * The meta object literal for the '<em><b>Aggregated Real Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRICS__AGGREGATED_REAL_METRICS = eINSTANCE.getMetrics_AggregatedRealMetrics();

		/**
		 * The meta object literal for the '<em><b>Trafo Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRICS__TRAFO_NAME = eINSTANCE.getMetrics_TrafoName();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.model.QualityMetrics.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.model.QualityMetrics.impl.MetricImpl
		 * @see de.upb.m2m.quality.model.QualityMetrics.impl.QualityMetricsPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__METRIC = eINSTANCE.getMetric_Metric();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.model.QualityMetrics.impl.SimpleMetricImpl <em>Simple Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.model.QualityMetrics.impl.SimpleMetricImpl
		 * @see de.upb.m2m.quality.model.QualityMetrics.impl.QualityMetricsPackageImpl#getSimpleMetric()
		 * @generated
		 */
		EClass SIMPLE_METRIC = eINSTANCE.getSimpleMetric();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_METRIC__VALUE = eINSTANCE.getSimpleMetric_Value();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.model.QualityMetrics.impl.AggregatedIntegerMetricImpl <em>Aggregated Integer Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.model.QualityMetrics.impl.AggregatedIntegerMetricImpl
		 * @see de.upb.m2m.quality.model.QualityMetrics.impl.QualityMetricsPackageImpl#getAggregatedIntegerMetric()
		 * @generated
		 */
		EClass AGGREGATED_INTEGER_METRIC = eINSTANCE.getAggregatedIntegerMetric();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_INTEGER_METRIC__MINIMUM = eINSTANCE.getAggregatedIntegerMetric_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_INTEGER_METRIC__MAXIMUM = eINSTANCE.getAggregatedIntegerMetric_Maximum();

		/**
		 * The meta object literal for the '<em><b>Median</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_INTEGER_METRIC__MEDIAN = eINSTANCE.getAggregatedIntegerMetric_Median();

		/**
		 * The meta object literal for the '<em><b>Average</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_INTEGER_METRIC__AVERAGE = eINSTANCE.getAggregatedIntegerMetric_Average();

		/**
		 * The meta object literal for the '<em><b>Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_INTEGER_METRIC__STANDARD_DEVIATION = eINSTANCE.getAggregatedIntegerMetric_StandardDeviation();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.model.QualityMetrics.impl.AggregatedRealMetricImpl <em>Aggregated Real Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.model.QualityMetrics.impl.AggregatedRealMetricImpl
		 * @see de.upb.m2m.quality.model.QualityMetrics.impl.QualityMetricsPackageImpl#getAggregatedRealMetric()
		 * @generated
		 */
		EClass AGGREGATED_REAL_METRIC = eINSTANCE.getAggregatedRealMetric();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_REAL_METRIC__MINIMUM = eINSTANCE.getAggregatedRealMetric_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_REAL_METRIC__MAXIMUM = eINSTANCE.getAggregatedRealMetric_Maximum();

		/**
		 * The meta object literal for the '<em><b>Median</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_REAL_METRIC__MEDIAN = eINSTANCE.getAggregatedRealMetric_Median();

		/**
		 * The meta object literal for the '<em><b>Average</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_REAL_METRIC__AVERAGE = eINSTANCE.getAggregatedRealMetric_Average();

		/**
		 * The meta object literal for the '<em><b>Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_REAL_METRIC__STANDARD_DEVIATION = eINSTANCE.getAggregatedRealMetric_StandardDeviation();

	}

} //QualityMetricsPackage
