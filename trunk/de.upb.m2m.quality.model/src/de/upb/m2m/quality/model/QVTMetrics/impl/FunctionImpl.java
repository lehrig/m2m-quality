/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QVTMetrics.impl;

import de.upb.m2m.quality.model.QVTMetrics.Function;
import de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.FunctionImpl#getFanOut <em>Fan Out</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.FunctionImpl#getFanIn <em>Fan In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionImpl extends EObjectImpl implements Function {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFanOut() <em>Fan Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanOut()
	 * @generated
	 * @ordered
	 */
	protected static final int FAN_OUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFanOut() <em>Fan Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanOut()
	 * @generated
	 * @ordered
	 */
	protected int fanOut = FAN_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFanIn() <em>Fan In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanIn()
	 * @generated
	 * @ordered
	 */
	protected static final int FAN_IN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFanIn() <em>Fan In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanIn()
	 * @generated
	 * @ordered
	 */
	protected int fanIn = FAN_IN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTMetricsPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.FUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFanOut() {
		return fanOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFanOut(int newFanOut) {
		int oldFanOut = fanOut;
		fanOut = newFanOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.FUNCTION__FAN_OUT, oldFanOut, fanOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFanIn() {
		return fanIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFanIn(int newFanIn) {
		int oldFanIn = fanIn;
		fanIn = newFanIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.FUNCTION__FAN_IN, oldFanIn, fanIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QVTMetricsPackage.FUNCTION__NAME:
				return getName();
			case QVTMetricsPackage.FUNCTION__FAN_OUT:
				return getFanOut();
			case QVTMetricsPackage.FUNCTION__FAN_IN:
				return getFanIn();
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
			case QVTMetricsPackage.FUNCTION__NAME:
				setName((String)newValue);
				return;
			case QVTMetricsPackage.FUNCTION__FAN_OUT:
				setFanOut((Integer)newValue);
				return;
			case QVTMetricsPackage.FUNCTION__FAN_IN:
				setFanIn((Integer)newValue);
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
			case QVTMetricsPackage.FUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QVTMetricsPackage.FUNCTION__FAN_OUT:
				setFanOut(FAN_OUT_EDEFAULT);
				return;
			case QVTMetricsPackage.FUNCTION__FAN_IN:
				setFanIn(FAN_IN_EDEFAULT);
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
			case QVTMetricsPackage.FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QVTMetricsPackage.FUNCTION__FAN_OUT:
				return fanOut != FAN_OUT_EDEFAULT;
			case QVTMetricsPackage.FUNCTION__FAN_IN:
				return fanIn != FAN_IN_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", fanOut: ");
		result.append(fanOut);
		result.append(", fanIn: ");
		result.append(fanIn);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
