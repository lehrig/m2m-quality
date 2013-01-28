/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QualityMetrics.util;

import de.upb.m2m.quality.model.QualityMetrics.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage
 * @generated
 */
public class QualityMetricsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QualityMetricsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityMetricsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QualityMetricsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityMetricsSwitch<Adapter> modelSwitch =
		new QualityMetricsSwitch<Adapter>() {
			@Override
			public Adapter caseMetrics(Metrics object) {
				return createMetricsAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter caseSimpleMetric(SimpleMetric object) {
				return createSimpleMetricAdapter();
			}
			@Override
			public Adapter caseAggregatedIntegerMetric(AggregatedIntegerMetric object) {
				return createAggregatedIntegerMetricAdapter();
			}
			@Override
			public Adapter caseAggregatedRealMetric(AggregatedRealMetric object) {
				return createAggregatedRealMetricAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.model.QualityMetrics.Metrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.model.QualityMetrics.Metrics
	 * @generated
	 */
	public Adapter createMetricsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.model.QualityMetrics.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.model.QualityMetrics.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.model.QualityMetrics.SimpleMetric <em>Simple Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.model.QualityMetrics.SimpleMetric
	 * @generated
	 */
	public Adapter createSimpleMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric <em>Aggregated Integer Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric
	 * @generated
	 */
	public Adapter createAggregatedIntegerMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric <em>Aggregated Real Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric
	 * @generated
	 */
	public Adapter createAggregatedRealMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QualityMetricsAdapterFactory
