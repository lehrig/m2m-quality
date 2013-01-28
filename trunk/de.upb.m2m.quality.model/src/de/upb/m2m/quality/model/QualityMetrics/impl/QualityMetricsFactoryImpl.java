/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QualityMetrics.impl;

import de.upb.m2m.quality.model.QualityMetrics.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityMetricsFactoryImpl extends EFactoryImpl implements QualityMetricsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QualityMetricsFactory init() {
		try {
			QualityMetricsFactory theQualityMetricsFactory = (QualityMetricsFactory)EPackage.Registry.INSTANCE.getEFactory("http://m2m.upb.de/QualityMetrics/1.0"); 
			if (theQualityMetricsFactory != null) {
				return theQualityMetricsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QualityMetricsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityMetricsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QualityMetricsPackage.METRICS: return createMetrics();
			case QualityMetricsPackage.SIMPLE_METRIC: return createSimpleMetric();
			case QualityMetricsPackage.AGGREGATED_INTEGER_METRIC: return createAggregatedIntegerMetric();
			case QualityMetricsPackage.AGGREGATED_REAL_METRIC: return createAggregatedRealMetric();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metrics createMetrics() {
		MetricsImpl metrics = new MetricsImpl();
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMetric createSimpleMetric() {
		SimpleMetricImpl simpleMetric = new SimpleMetricImpl();
		return simpleMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedIntegerMetric createAggregatedIntegerMetric() {
		AggregatedIntegerMetricImpl aggregatedIntegerMetric = new AggregatedIntegerMetricImpl();
		return aggregatedIntegerMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedRealMetric createAggregatedRealMetric() {
		AggregatedRealMetricImpl aggregatedRealMetric = new AggregatedRealMetricImpl();
		return aggregatedRealMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityMetricsPackage getQualityMetricsPackage() {
		return (QualityMetricsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QualityMetricsPackage getPackage() {
		return QualityMetricsPackage.eINSTANCE;
	}

} //QualityMetricsFactoryImpl
