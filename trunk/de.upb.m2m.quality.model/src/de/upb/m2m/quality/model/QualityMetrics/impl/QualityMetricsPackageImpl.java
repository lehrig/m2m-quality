/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QualityMetrics.impl;

import de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric;
import de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric;
import de.upb.m2m.quality.model.QualityMetrics.Metric;
import de.upb.m2m.quality.model.QualityMetrics.Metrics;
import de.upb.m2m.quality.model.QualityMetrics.QualityMetricsFactory;
import de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage;
import de.upb.m2m.quality.model.QualityMetrics.SimpleMetric;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityMetricsPackageImpl extends EPackageImpl implements QualityMetricsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregatedIntegerMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregatedRealMetricEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QualityMetricsPackageImpl() {
		super(eNS_URI, QualityMetricsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QualityMetricsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QualityMetricsPackage init() {
		if (isInited) return (QualityMetricsPackage)EPackage.Registry.INSTANCE.getEPackage(QualityMetricsPackage.eNS_URI);

		// Obtain or create and register package
		QualityMetricsPackageImpl theQualityMetricsPackage = (QualityMetricsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QualityMetricsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QualityMetricsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theQualityMetricsPackage.createPackageContents();

		// Initialize created meta-data
		theQualityMetricsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQualityMetricsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QualityMetricsPackage.eNS_URI, theQualityMetricsPackage);
		return theQualityMetricsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetrics() {
		return metricsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetrics_SimpleMetrics() {
		return (EReference)metricsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetrics_AggregatedIntegerMetrics() {
		return (EReference)metricsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetrics_AggregatedRealMetrics() {
		return (EReference)metricsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetrics_TrafoName() {
		return (EAttribute)metricsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Metric() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleMetric() {
		return simpleMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleMetric_Value() {
		return (EAttribute)simpleMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregatedIntegerMetric() {
		return aggregatedIntegerMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregatedIntegerMetric_Minimum() {
		return (EAttribute)aggregatedIntegerMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregatedIntegerMetric_Maximum() {
		return (EAttribute)aggregatedIntegerMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregatedIntegerMetric_Median() {
		return (EAttribute)aggregatedIntegerMetricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregatedIntegerMetric_Average() {
		return (EAttribute)aggregatedIntegerMetricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregatedIntegerMetric_StandardDeviation() {
		return (EAttribute)aggregatedIntegerMetricEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregatedRealMetric() {
		return aggregatedRealMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregatedRealMetric_Minimum() {
		return (EAttribute)aggregatedRealMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregatedRealMetric_Maximum() {
		return (EAttribute)aggregatedRealMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregatedRealMetric_Median() {
		return (EAttribute)aggregatedRealMetricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregatedRealMetric_Average() {
		return (EAttribute)aggregatedRealMetricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregatedRealMetric_StandardDeviation() {
		return (EAttribute)aggregatedRealMetricEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityMetricsFactory getQualityMetricsFactory() {
		return (QualityMetricsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		metricsEClass = createEClass(METRICS);
		createEReference(metricsEClass, METRICS__SIMPLE_METRICS);
		createEReference(metricsEClass, METRICS__AGGREGATED_INTEGER_METRICS);
		createEReference(metricsEClass, METRICS__AGGREGATED_REAL_METRICS);
		createEAttribute(metricsEClass, METRICS__TRAFO_NAME);

		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__METRIC);

		simpleMetricEClass = createEClass(SIMPLE_METRIC);
		createEAttribute(simpleMetricEClass, SIMPLE_METRIC__VALUE);

		aggregatedIntegerMetricEClass = createEClass(AGGREGATED_INTEGER_METRIC);
		createEAttribute(aggregatedIntegerMetricEClass, AGGREGATED_INTEGER_METRIC__MINIMUM);
		createEAttribute(aggregatedIntegerMetricEClass, AGGREGATED_INTEGER_METRIC__MAXIMUM);
		createEAttribute(aggregatedIntegerMetricEClass, AGGREGATED_INTEGER_METRIC__MEDIAN);
		createEAttribute(aggregatedIntegerMetricEClass, AGGREGATED_INTEGER_METRIC__AVERAGE);
		createEAttribute(aggregatedIntegerMetricEClass, AGGREGATED_INTEGER_METRIC__STANDARD_DEVIATION);

		aggregatedRealMetricEClass = createEClass(AGGREGATED_REAL_METRIC);
		createEAttribute(aggregatedRealMetricEClass, AGGREGATED_REAL_METRIC__MINIMUM);
		createEAttribute(aggregatedRealMetricEClass, AGGREGATED_REAL_METRIC__MAXIMUM);
		createEAttribute(aggregatedRealMetricEClass, AGGREGATED_REAL_METRIC__MEDIAN);
		createEAttribute(aggregatedRealMetricEClass, AGGREGATED_REAL_METRIC__AVERAGE);
		createEAttribute(aggregatedRealMetricEClass, AGGREGATED_REAL_METRIC__STANDARD_DEVIATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleMetricEClass.getESuperTypes().add(this.getMetric());
		aggregatedIntegerMetricEClass.getESuperTypes().add(this.getMetric());
		aggregatedRealMetricEClass.getESuperTypes().add(this.getMetric());

		// Initialize classes and features; add operations and parameters
		initEClass(metricsEClass, Metrics.class, "Metrics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetrics_SimpleMetrics(), this.getSimpleMetric(), null, "SimpleMetrics", null, 0, -1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetrics_AggregatedIntegerMetrics(), this.getAggregatedIntegerMetric(), null, "AggregatedIntegerMetrics", null, 0, -1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetrics_AggregatedRealMetrics(), this.getAggregatedRealMetric(), null, "AggregatedRealMetrics", null, 0, -1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetrics_TrafoName(), ecorePackage.getEString(), "TrafoName", null, 1, 1, Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_Metric(), ecorePackage.getEString(), "Metric", null, 1, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleMetricEClass, SimpleMetric.class, "SimpleMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleMetric_Value(), ecorePackage.getEInt(), "Value", null, 1, 1, SimpleMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregatedIntegerMetricEClass, AggregatedIntegerMetric.class, "AggregatedIntegerMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregatedIntegerMetric_Minimum(), ecorePackage.getEInt(), "Minimum", null, 1, 1, AggregatedIntegerMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregatedIntegerMetric_Maximum(), ecorePackage.getEInt(), "Maximum", null, 1, 1, AggregatedIntegerMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregatedIntegerMetric_Median(), ecorePackage.getEInt(), "Median", null, 1, 1, AggregatedIntegerMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregatedIntegerMetric_Average(), ecorePackage.getEFloat(), "Average", null, 1, 1, AggregatedIntegerMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregatedIntegerMetric_StandardDeviation(), ecorePackage.getEFloat(), "StandardDeviation", null, 1, 1, AggregatedIntegerMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregatedRealMetricEClass, AggregatedRealMetric.class, "AggregatedRealMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregatedRealMetric_Minimum(), ecorePackage.getEFloat(), "Minimum", null, 1, 1, AggregatedRealMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregatedRealMetric_Maximum(), ecorePackage.getEFloat(), "Maximum", null, 1, 1, AggregatedRealMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregatedRealMetric_Median(), ecorePackage.getEFloat(), "Median", null, 1, 1, AggregatedRealMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregatedRealMetric_Average(), ecorePackage.getEFloat(), "Average", null, 1, 1, AggregatedRealMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregatedRealMetric_StandardDeviation(), ecorePackage.getEFloat(), "StandardDeviation", null, 1, 1, AggregatedRealMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //QualityMetricsPackageImpl
