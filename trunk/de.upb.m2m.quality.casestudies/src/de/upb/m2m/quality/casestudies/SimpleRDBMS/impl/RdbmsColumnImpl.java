/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleRDBMS.impl;

import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdbms Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsColumnImpl#getRdbmsType <em>Rdbms Type</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsColumnImpl#getRdbmsOwner <em>Rdbms Owner</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsColumnImpl#getRdbmsKey <em>Rdbms Key</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsColumnImpl#getRdbmsForeignKey <em>Rdbms Foreign Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RdbmsColumnImpl extends RdbmsModelElementImpl implements RdbmsColumn {
	/**
	 * The default value of the '{@link #getRdbmsType() <em>Rdbms Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsType()
	 * @generated
	 * @ordered
	 */
	protected static final String RDBMS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRdbmsType() <em>Rdbms Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsType()
	 * @generated
	 * @ordered
	 */
	protected String rdbmsType = RDBMS_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRdbmsKey() <em>Rdbms Key</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsKey()
	 * @generated
	 * @ordered
	 */
	protected EList<RdbmsKey> rdbmsKey;

	/**
	 * The cached value of the '{@link #getRdbmsForeignKey() <em>Rdbms Foreign Key</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsForeignKey()
	 * @generated
	 * @ordered
	 */
	protected EList<RdbmsForeignKey> rdbmsForeignKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdbmsColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleRDBMSPackage.Literals.RDBMS_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRdbmsType() {
		return rdbmsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRdbmsType(String newRdbmsType) {
		String oldRdbmsType = rdbmsType;
		rdbmsType = newRdbmsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_TYPE, oldRdbmsType, rdbmsType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsTable getRdbmsOwner() {
		if (eContainerFeatureID() != SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_OWNER) return null;
		return (RdbmsTable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdbmsOwner(RdbmsTable newRdbmsOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRdbmsOwner, SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRdbmsOwner(RdbmsTable newRdbmsOwner) {
		if (newRdbmsOwner != eInternalContainer() || (eContainerFeatureID() != SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_OWNER && newRdbmsOwner != null)) {
			if (EcoreUtil.isAncestor(this, newRdbmsOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRdbmsOwner != null)
				msgs = ((InternalEObject)newRdbmsOwner).eInverseAdd(this, SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_COLUMN, RdbmsTable.class, msgs);
			msgs = basicSetRdbmsOwner(newRdbmsOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_OWNER, newRdbmsOwner, newRdbmsOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RdbmsKey> getRdbmsKey() {
		if (rdbmsKey == null) {
			rdbmsKey = new EObjectWithInverseResolvingEList.ManyInverse<RdbmsKey>(RdbmsKey.class, this, SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_KEY, SimpleRDBMSPackage.RDBMS_KEY__RDBMS_COLUMN);
		}
		return rdbmsKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RdbmsForeignKey> getRdbmsForeignKey() {
		if (rdbmsForeignKey == null) {
			rdbmsForeignKey = new EObjectWithInverseResolvingEList.ManyInverse<RdbmsForeignKey>(RdbmsForeignKey.class, this, SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_FOREIGN_KEY, SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_COLUMN);
		}
		return rdbmsForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRdbmsOwner((RdbmsTable)otherEnd, msgs);
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_KEY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRdbmsKey()).basicAdd(otherEnd, msgs);
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_FOREIGN_KEY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRdbmsForeignKey()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_OWNER:
				return basicSetRdbmsOwner(null, msgs);
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_KEY:
				return ((InternalEList<?>)getRdbmsKey()).basicRemove(otherEnd, msgs);
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_FOREIGN_KEY:
				return ((InternalEList<?>)getRdbmsForeignKey()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_OWNER:
				return eInternalContainer().eInverseRemove(this, SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_COLUMN, RdbmsTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_TYPE:
				return getRdbmsType();
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_OWNER:
				return getRdbmsOwner();
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_KEY:
				return getRdbmsKey();
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_FOREIGN_KEY:
				return getRdbmsForeignKey();
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
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_TYPE:
				setRdbmsType((String)newValue);
				return;
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_OWNER:
				setRdbmsOwner((RdbmsTable)newValue);
				return;
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_KEY:
				getRdbmsKey().clear();
				getRdbmsKey().addAll((Collection<? extends RdbmsKey>)newValue);
				return;
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_FOREIGN_KEY:
				getRdbmsForeignKey().clear();
				getRdbmsForeignKey().addAll((Collection<? extends RdbmsForeignKey>)newValue);
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
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_TYPE:
				setRdbmsType(RDBMS_TYPE_EDEFAULT);
				return;
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_OWNER:
				setRdbmsOwner((RdbmsTable)null);
				return;
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_KEY:
				getRdbmsKey().clear();
				return;
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_FOREIGN_KEY:
				getRdbmsForeignKey().clear();
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
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_TYPE:
				return RDBMS_TYPE_EDEFAULT == null ? rdbmsType != null : !RDBMS_TYPE_EDEFAULT.equals(rdbmsType);
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_OWNER:
				return getRdbmsOwner() != null;
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_KEY:
				return rdbmsKey != null && !rdbmsKey.isEmpty();
			case SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_FOREIGN_KEY:
				return rdbmsForeignKey != null && !rdbmsForeignKey.isEmpty();
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
		result.append(" (rdbmsType: ");
		result.append(rdbmsType);
		result.append(')');
		return result.toString();
	}

} //RdbmsColumnImpl
