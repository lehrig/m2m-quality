/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QualityMetrics.impl;

import de.upb.m2m.quality.model.QualityMetrics.AggregatedIntegerMetric;
import de.upb.m2m.quality.model.QualityMetrics.AggregatedRealMetric;
import de.upb.m2m.quality.model.QualityMetrics.Metrics;
import de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage;
import de.upb.m2m.quality.model.QualityMetrics.SimpleMetric;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metrics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.model.QualityMetrics.impl.MetricsImpl#getSimpleMetrics <em>Simple Metrics</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QualityMetrics.impl.MetricsImpl#getAggregatedIntegerMetrics <em>Aggregated Integer Metrics</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QualityMetrics.impl.MetricsImpl#getAggregatedRealMetrics <em>Aggregated Real Metrics</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QualityMetrics.impl.MetricsImpl#getTrafoName <em>Trafo Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetricsImpl extends EObjectImpl implements Metrics {
	/**
	 * The cached value of the '{@link #getSimpleMetrics() <em>Simple Metrics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleMetrics()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleMetric> simpleMetrics;

	/**
	 * The cached value of the '{@link #getAggregatedIntegerMetrics() <em>Aggregated Integer Metrics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatedIntegerMetrics()
	 * @generated
	 * @ordered
	 */
	protected EList<AggregatedIntegerMetric> aggregatedIntegerMetrics;

	/**
	 * The cached value of the '{@link #getAggregatedRealMetrics() <em>Aggregated Real Metrics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatedRealMetrics()
	 * @generated
	 * @ordered
	 */
	protected EList<AggregatedRealMetric> aggregatedRealMetrics;

	/**
	 * The default value of the '{@link #getTrafoName() <em>Trafo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafoName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAFO_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrafoName() <em>Trafo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafoName()
	 * @generated
	 * @ordered
	 */
	protected String trafoName = TRAFO_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityMetricsPackage.Literals.METRICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleMetric> getSimpleMetrics() {
		if (simpleMetrics == null) {
			simpleMetrics = new EObjectContainmentEList<SimpleMetric>(SimpleMetric.class, this, QualityMetricsPackage.METRICS__SIMPLE_METRICS);
		}
		return simpleMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregatedIntegerMetric> getAggregatedIntegerMetrics() {
		if (aggregatedIntegerMetrics == null) {
			aggregatedIntegerMetrics = new EObjectContainmentEList<AggregatedIntegerMetric>(AggregatedIntegerMetric.class, this, QualityMetricsPackage.METRICS__AGGREGATED_INTEGER_METRICS);
		}
		return aggregatedIntegerMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregatedRealMetric> getAggregatedRealMetrics() {
		if (aggregatedRealMetrics == null) {
			aggregatedRealMetrics = new EObjectContainmentEList<AggregatedRealMetric>(AggregatedRealMetric.class, this, QualityMetricsPackage.METRICS__AGGREGATED_REAL_METRICS);
		}
		return aggregatedRealMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrafoName() {
		return trafoName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrafoName(String newTrafoName) {
		String oldTrafoName = trafoName;
		trafoName = newTrafoName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityMetricsPackage.METRICS__TRAFO_NAME, oldTrafoName, trafoName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityMetricsPackage.METRICS__SIMPLE_METRICS:
				return ((InternalEList<?>)getSimpleMetrics()).basicRemove(otherEnd, msgs);
			case QualityMetricsPackage.METRICS__AGGREGATED_INTEGER_METRICS:
				return ((InternalEList<?>)getAggregatedIntegerMetrics()).basicRemove(otherEnd, msgs);
			case QualityMetricsPackage.METRICS__AGGREGATED_REAL_METRICS:
				return ((InternalEList<?>)getAggregatedRealMetrics()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualityMetricsPackage.METRICS__SIMPLE_METRICS:
				return getSimpleMetrics();
			case QualityMetricsPackage.METRICS__AGGREGATED_INTEGER_METRICS:
				return getAggregatedIntegerMetrics();
			case QualityMetricsPackage.METRICS__AGGREGATED_REAL_METRICS:
				return getAggregatedRealMetrics();
			case QualityMetricsPackage.METRICS__TRAFO_NAME:
				return getTrafoName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QualityMetricsPackage.METRICS__SIMPLE_METRICS:
				getSimpleMetrics().clear();
				getSimpleMetrics().addAll((Collection<? extends SimpleMetric>)newValue);
				return;
			case QualityMetricsPackage.METRICS__AGGREGATED_INTEGER_METRICS:
				getAggregatedIntegerMetrics().clear();
				getAggregatedIntegerMetrics().addAll((Collection<? extends AggregatedIntegerMetric>)newValue);
				return;
			case QualityMetricsPackage.METRICS__AGGREGATED_REAL_METRICS:
				getAggregatedRealMetrics().clear();
				getAggregatedRealMetrics().addAll((Collection<? extends AggregatedRealMetric>)newValue);
				return;
			case QualityMetricsPackage.METRICS__TRAFO_NAME:
				setTrafoName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QualityMetricsPackage.METRICS__SIMPLE_METRICS:
				getSimpleMetrics().clear();
				return;
			case QualityMetricsPackage.METRICS__AGGREGATED_INTEGER_METRICS:
				getAggregatedIntegerMetrics().clear();
				return;
			case QualityMetricsPackage.METRICS__AGGREGATED_REAL_METRICS:
				getAggregatedRealMetrics().clear();
				return;
			case QualityMetricsPackage.METRICS__TRAFO_NAME:
				setTrafoName(TRAFO_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QualityMetricsPackage.METRICS__SIMPLE_METRICS:
				return simpleMetrics != null && !simpleMetrics.isEmpty();
			case QualityMetricsPackage.METRICS__AGGREGATED_INTEGER_METRICS:
				return aggregatedIntegerMetrics != null && !aggregatedIntegerMetrics.isEmpty();
			case QualityMetricsPackage.METRICS__AGGREGATED_REAL_METRICS:
				return aggregatedRealMetrics != null && !aggregatedRealMetrics.isEmpty();
			case QualityMetricsPackage.METRICS__TRAFO_NAME:
				return TRAFO_NAME_EDEFAULT == null ? trafoName != null : !TRAFO_NAME_EDEFAULT.equals(trafoName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (TrafoName: ");
		result.append(trafoName);
		result.append(')');
		return result.toString();
	}

} //MetricsImpl
