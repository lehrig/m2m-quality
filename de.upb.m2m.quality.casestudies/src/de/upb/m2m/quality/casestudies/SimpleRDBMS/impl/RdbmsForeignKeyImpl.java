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
 * An implementation of the model object '<em><b>Rdbms Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsForeignKeyImpl#getRdbmsOwner <em>Rdbms Owner</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsForeignKeyImpl#getRdbmsRefersTo <em>Rdbms Refers To</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsForeignKeyImpl#getRdbmsColumn <em>Rdbms Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RdbmsForeignKeyImpl extends RdbmsModelElementImpl implements RdbmsForeignKey {
	/**
	 * The cached value of the '{@link #getRdbmsRefersTo() <em>Rdbms Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsRefersTo()
	 * @generated
	 * @ordered
	 */
	protected RdbmsKey rdbmsRefersTo;

	/**
	 * The cached value of the '{@link #getRdbmsColumn() <em>Rdbms Column</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<RdbmsColumn> rdbmsColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdbmsForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleRDBMSPackage.Literals.RDBMS_FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsTable getRdbmsOwner() {
		if (eContainerFeatureID() != SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_OWNER) return null;
		return (RdbmsTable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdbmsOwner(RdbmsTable newRdbmsOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRdbmsOwner, SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRdbmsOwner(RdbmsTable newRdbmsOwner) {
		if (newRdbmsOwner != eInternalContainer() || (eContainerFeatureID() != SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_OWNER && newRdbmsOwner != null)) {
			if (EcoreUtil.isAncestor(this, newRdbmsOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRdbmsOwner != null)
				msgs = ((InternalEObject)newRdbmsOwner).eInverseAdd(this, SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_FOREIGN_KEY, RdbmsTable.class, msgs);
			msgs = basicSetRdbmsOwner(newRdbmsOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_OWNER, newRdbmsOwner, newRdbmsOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsKey getRdbmsRefersTo() {
		if (rdbmsRefersTo != null && rdbmsRefersTo.eIsProxy()) {
			InternalEObject oldRdbmsRefersTo = (InternalEObject)rdbmsRefersTo;
			rdbmsRefersTo = (RdbmsKey)eResolveProxy(oldRdbmsRefersTo);
			if (rdbmsRefersTo != oldRdbmsRefersTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_REFERS_TO, oldRdbmsRefersTo, rdbmsRefersTo));
			}
		}
		return rdbmsRefersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsKey basicGetRdbmsRefersTo() {
		return rdbmsRefersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdbmsRefersTo(RdbmsKey newRdbmsRefersTo, NotificationChain msgs) {
		RdbmsKey oldRdbmsRefersTo = rdbmsRefersTo;
		rdbmsRefersTo = newRdbmsRefersTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_REFERS_TO, oldRdbmsRefersTo, newRdbmsRefersTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRdbmsRefersTo(RdbmsKey newRdbmsRefersTo) {
		if (newRdbmsRefersTo != rdbmsRefersTo) {
			NotificationChain msgs = null;
			if (rdbmsRefersTo != null)
				msgs = ((InternalEObject)rdbmsRefersTo).eInverseRemove(this, SimpleRDBMSPackage.RDBMS_KEY__RDBMS_REFERS_TO_OPPOSITE, RdbmsKey.class, msgs);
			if (newRdbmsRefersTo != null)
				msgs = ((InternalEObject)newRdbmsRefersTo).eInverseAdd(this, SimpleRDBMSPackage.RDBMS_KEY__RDBMS_REFERS_TO_OPPOSITE, RdbmsKey.class, msgs);
			msgs = basicSetRdbmsRefersTo(newRdbmsRefersTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_REFERS_TO, newRdbmsRefersTo, newRdbmsRefersTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RdbmsColumn> getRdbmsColumn() {
		if (rdbmsColumn == null) {
			rdbmsColumn = new EObjectWithInverseResolvingEList.ManyInverse<RdbmsColumn>(RdbmsColumn.class, this, SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_COLUMN, SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_FOREIGN_KEY);
		}
		return rdbmsColumn;
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
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRdbmsOwner((RdbmsTable)otherEnd, msgs);
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_REFERS_TO:
				if (rdbmsRefersTo != null)
					msgs = ((InternalEObject)rdbmsRefersTo).eInverseRemove(this, SimpleRDBMSPackage.RDBMS_KEY__RDBMS_REFERS_TO_OPPOSITE, RdbmsKey.class, msgs);
				return basicSetRdbmsRefersTo((RdbmsKey)otherEnd, msgs);
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_COLUMN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRdbmsColumn()).basicAdd(otherEnd, msgs);
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
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_OWNER:
				return basicSetRdbmsOwner(null, msgs);
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_REFERS_TO:
				return basicSetRdbmsRefersTo(null, msgs);
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_COLUMN:
				return ((InternalEList<?>)getRdbmsColumn()).basicRemove(otherEnd, msgs);
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
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_OWNER:
				return eInternalContainer().eInverseRemove(this, SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_FOREIGN_KEY, RdbmsTable.class, msgs);
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
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_OWNER:
				return getRdbmsOwner();
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_REFERS_TO:
				if (resolve) return getRdbmsRefersTo();
				return basicGetRdbmsRefersTo();
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_COLUMN:
				return getRdbmsColumn();
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
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_OWNER:
				setRdbmsOwner((RdbmsTable)newValue);
				return;
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_REFERS_TO:
				setRdbmsRefersTo((RdbmsKey)newValue);
				return;
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_COLUMN:
				getRdbmsColumn().clear();
				getRdbmsColumn().addAll((Collection<? extends RdbmsColumn>)newValue);
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
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_OWNER:
				setRdbmsOwner((RdbmsTable)null);
				return;
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_REFERS_TO:
				setRdbmsRefersTo((RdbmsKey)null);
				return;
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_COLUMN:
				getRdbmsColumn().clear();
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
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_OWNER:
				return getRdbmsOwner() != null;
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_REFERS_TO:
				return rdbmsRefersTo != null;
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_COLUMN:
				return rdbmsColumn != null && !rdbmsColumn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RdbmsForeignKeyImpl
