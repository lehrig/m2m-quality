/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QVTMetrics.impl;

import de.upb.m2m.quality.model.QVTMetrics.DomainPredicateCount;
import de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Predicate Count</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.DomainPredicateCountImpl#getAverage <em>Average</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.DomainPredicateCountImpl#getMean <em>Mean</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainPredicateCountImpl extends EObjectImpl implements DomainPredicateCount {
	/**
	 * The default value of the '{@link #getAverage() <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage()
	 * @generated
	 * @ordered
	 */
	protected static final int AVERAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAverage() <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage()
	 * @generated
	 * @ordered
	 */
	protected int average = AVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMean() <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected static final int MEAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMean() <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected int mean = MEAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainPredicateCountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTMetricsPackage.Literals.DOMAIN_PREDICATE_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAverage() {
		return average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverage(int newAverage) {
		int oldAverage = average;
		average = newAverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.DOMAIN_PREDICATE_COUNT__AVERAGE, oldAverage, average));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMean() {
		return mean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMean(int newMean) {
		int oldMean = mean;
		mean = newMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.DOMAIN_PREDICATE_COUNT__MEAN, oldMean, mean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QVTMetricsPackage.DOMAIN_PREDICATE_COUNT__AVERAGE:
				return getAverage();
			case QVTMetricsPackage.DOMAIN_PREDICATE_COUNT__MEAN:
				return getMean();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QVTMetricsPackage.DOMAIN_PREDICATE_COUNT__AVERAGE:
				setAverage((Integer)newValue);
				return;
			case QVTMetricsPackage.DOMAIN_PREDICATE_COUNT__MEAN:
				setMean((Integer)newValue);
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
			case QVTMetricsPackage.DOMAIN_PREDICATE_COUNT__AVERAGE:
				setAverage(AVERAGE_EDEFAULT);
				return;
			case QVTMetricsPackage.DOMAIN_PREDICATE_COUNT__MEAN:
				setMean(MEAN_EDEFAULT);
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
			case QVTMetricsPackage.DOMAIN_PREDICATE_COUNT__AVERAGE:
				return average != AVERAGE_EDEFAULT;
			case QVTMetricsPackage.DOMAIN_PREDICATE_COUNT__MEAN:
				return mean != MEAN_EDEFAULT;
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
		result.append(" (average: ");
		result.append(average);
		result.append(", mean: ");
		result.append(mean);
		result.append(')');
		return result.toString();
	}

} //DomainPredicateCountImpl
