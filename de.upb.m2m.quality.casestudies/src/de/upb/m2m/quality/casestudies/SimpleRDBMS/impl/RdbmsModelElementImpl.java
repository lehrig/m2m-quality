/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleRDBMS.impl;

import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdbms Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsModelElementImpl#getRdbmsName <em>Rdbms Name</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsModelElementImpl#getRdbmsKind <em>Rdbms Kind</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsModelElementImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RdbmsModelElementImpl extends EObjectImpl implements RdbmsModelElement {
	/**
	 * The default value of the '{@link #getRdbmsName() <em>Rdbms Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsName()
	 * @generated
	 * @ordered
	 */
	protected static final String RDBMS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRdbmsName() <em>Rdbms Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsName()
	 * @generated
	 * @ordered
	 */
	protected String rdbmsName = RDBMS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRdbmsKind() <em>Rdbms Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsKind()
	 * @generated
	 * @ordered
	 */
	protected static final String RDBMS_KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRdbmsKind() <em>Rdbms Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsKind()
	 * @generated
	 * @ordered
	 */
	protected String rdbmsKind = RDBMS_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdbmsModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleRDBMSPackage.Literals.RDBMS_MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRdbmsName() {
		return rdbmsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRdbmsName(String newRdbmsName) {
		String oldRdbmsName = rdbmsName;
		rdbmsName = newRdbmsName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT__RDBMS_NAME, oldRdbmsName, rdbmsName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRdbmsKind() {
		return rdbmsKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRdbmsKind(String newRdbmsKind) {
		String oldRdbmsKind = rdbmsKind;
		rdbmsKind = newRdbmsKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT__RDBMS_KIND, oldRdbmsKind, rdbmsKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT__RDBMS_NAME:
				return getRdbmsName();
			case SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT__RDBMS_KIND:
				return getRdbmsKind();
			case SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT__ID:
				return getId();
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
			case SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT__RDBMS_NAME:
				setRdbmsName((String)newValue);
				return;
			case SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT__RDBMS_KIND:
				setRdbmsKind((String)newValue);
				return;
			case SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT__ID:
				setId((String)newValue);
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
			case SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT__RDBMS_NAME:
				setRdbmsName(RDBMS_NAME_EDEFAULT);
				return;
			case SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT__RDBMS_KIND:
				setRdbmsKind(RDBMS_KIND_EDEFAULT);
				return;
			case SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT__ID:
				setId(ID_EDEFAULT);
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
			case SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT__RDBMS_NAME:
				return RDBMS_NAME_EDEFAULT == null ? rdbmsName != null : !RDBMS_NAME_EDEFAULT.equals(rdbmsName);
			case SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT__RDBMS_KIND:
				return RDBMS_KIND_EDEFAULT == null ? rdbmsKind != null : !RDBMS_KIND_EDEFAULT.equals(rdbmsKind);
			case SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (rdbmsName: ");
		result.append(rdbmsName);
		result.append(", rdbmsKind: ");
		result.append(rdbmsKind);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //RdbmsModelElementImpl
