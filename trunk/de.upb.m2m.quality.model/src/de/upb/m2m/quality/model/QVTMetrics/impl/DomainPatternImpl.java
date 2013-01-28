/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QVTMetrics.impl;

import de.upb.m2m.quality.model.QVTMetrics.DomainPattern;
import de.upb.m2m.quality.model.QVTMetrics.DomainPredicateCount;
import de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.DomainPatternImpl#getDomainPredicateCount <em>Domain Predicate Count</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.DomainPatternImpl#getSizeOfDomainPattern <em>Size Of Domain Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainPatternImpl extends EObjectImpl implements DomainPattern {
	/**
	 * The cached value of the '{@link #getDomainPredicateCount() <em>Domain Predicate Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainPredicateCount()
	 * @generated
	 * @ordered
	 */
	protected DomainPredicateCount domainPredicateCount;

	/**
	 * The default value of the '{@link #getSizeOfDomainPattern() <em>Size Of Domain Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeOfDomainPattern()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_OF_DOMAIN_PATTERN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSizeOfDomainPattern() <em>Size Of Domain Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeOfDomainPattern()
	 * @generated
	 * @ordered
	 */
	protected int sizeOfDomainPattern = SIZE_OF_DOMAIN_PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTMetricsPackage.Literals.DOMAIN_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainPredicateCount getDomainPredicateCount() {
		return domainPredicateCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainPredicateCount(DomainPredicateCount newDomainPredicateCount, NotificationChain msgs) {
		DomainPredicateCount oldDomainPredicateCount = domainPredicateCount;
		domainPredicateCount = newDomainPredicateCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.DOMAIN_PATTERN__DOMAIN_PREDICATE_COUNT, oldDomainPredicateCount, newDomainPredicateCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainPredicateCount(DomainPredicateCount newDomainPredicateCount) {
		if (newDomainPredicateCount != domainPredicateCount) {
			NotificationChain msgs = null;
			if (domainPredicateCount != null)
				msgs = ((InternalEObject)domainPredicateCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTMetricsPackage.DOMAIN_PATTERN__DOMAIN_PREDICATE_COUNT, null, msgs);
			if (newDomainPredicateCount != null)
				msgs = ((InternalEObject)newDomainPredicateCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTMetricsPackage.DOMAIN_PATTERN__DOMAIN_PREDICATE_COUNT, null, msgs);
			msgs = basicSetDomainPredicateCount(newDomainPredicateCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.DOMAIN_PATTERN__DOMAIN_PREDICATE_COUNT, newDomainPredicateCount, newDomainPredicateCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSizeOfDomainPattern() {
		return sizeOfDomainPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeOfDomainPattern(int newSizeOfDomainPattern) {
		int oldSizeOfDomainPattern = sizeOfDomainPattern;
		sizeOfDomainPattern = newSizeOfDomainPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.DOMAIN_PATTERN__SIZE_OF_DOMAIN_PATTERN, oldSizeOfDomainPattern, sizeOfDomainPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTMetricsPackage.DOMAIN_PATTERN__DOMAIN_PREDICATE_COUNT:
				return basicSetDomainPredicateCount(null, msgs);
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
			case QVTMetricsPackage.DOMAIN_PATTERN__DOMAIN_PREDICATE_COUNT:
				return getDomainPredicateCount();
			case QVTMetricsPackage.DOMAIN_PATTERN__SIZE_OF_DOMAIN_PATTERN:
				return getSizeOfDomainPattern();
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
			case QVTMetricsPackage.DOMAIN_PATTERN__DOMAIN_PREDICATE_COUNT:
				setDomainPredicateCount((DomainPredicateCount)newValue);
				return;
			case QVTMetricsPackage.DOMAIN_PATTERN__SIZE_OF_DOMAIN_PATTERN:
				setSizeOfDomainPattern((Integer)newValue);
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
			case QVTMetricsPackage.DOMAIN_PATTERN__DOMAIN_PREDICATE_COUNT:
				setDomainPredicateCount((DomainPredicateCount)null);
				return;
			case QVTMetricsPackage.DOMAIN_PATTERN__SIZE_OF_DOMAIN_PATTERN:
				setSizeOfDomainPattern(SIZE_OF_DOMAIN_PATTERN_EDEFAULT);
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
			case QVTMetricsPackage.DOMAIN_PATTERN__DOMAIN_PREDICATE_COUNT:
				return domainPredicateCount != null;
			case QVTMetricsPackage.DOMAIN_PATTERN__SIZE_OF_DOMAIN_PATTERN:
				return sizeOfDomainPattern != SIZE_OF_DOMAIN_PATTERN_EDEFAULT;
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
		result.append(" (sizeOfDomainPattern: ");
		result.append(sizeOfDomainPattern);
		result.append(')');
		return result.toString();
	}

} //DomainPatternImpl
