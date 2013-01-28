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
 * An implementation of the model object '<em><b>Rdbms Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsKeyImpl#getRdbmsColumn <em>Rdbms Column</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsKeyImpl#getRdbmsRefersToOpposite <em>Rdbms Refers To Opposite</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsKeyImpl#getRdbmsOwner <em>Rdbms Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RdbmsKeyImpl extends RdbmsModelElementImpl implements RdbmsKey {
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
	 * The cached value of the '{@link #getRdbmsRefersToOpposite() <em>Rdbms Refers To Opposite</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsRefersToOpposite()
	 * @generated
	 * @ordered
	 */
	protected EList<RdbmsForeignKey> rdbmsRefersToOpposite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdbmsKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleRDBMSPackage.Literals.RDBMS_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RdbmsColumn> getRdbmsColumn() {
		if (rdbmsColumn == null) {
			rdbmsColumn = new EObjectWithInverseResolvingEList.ManyInverse<RdbmsColumn>(RdbmsColumn.class, this, SimpleRDBMSPackage.RDBMS_KEY__RDBMS_COLUMN, SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_KEY);
		}
		return rdbmsColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RdbmsForeignKey> getRdbmsRefersToOpposite() {
		if (rdbmsRefersToOpposite == null) {
			rdbmsRefersToOpposite = new EObjectWithInverseResolvingEList<RdbmsForeignKey>(RdbmsForeignKey.class, this, SimpleRDBMSPackage.RDBMS_KEY__RDBMS_REFERS_TO_OPPOSITE, SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_REFERS_TO);
		}
		return rdbmsRefersToOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsTable getRdbmsOwner() {
		if (eContainerFeatureID() != SimpleRDBMSPackage.RDBMS_KEY__RDBMS_OWNER) return null;
		return (RdbmsTable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdbmsOwner(RdbmsTable newRdbmsOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRdbmsOwner, SimpleRDBMSPackage.RDBMS_KEY__RDBMS_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRdbmsOwner(RdbmsTable newRdbmsOwner) {
		if (newRdbmsOwner != eInternalContainer() || (eContainerFeatureID() != SimpleRDBMSPackage.RDBMS_KEY__RDBMS_OWNER && newRdbmsOwner != null)) {
			if (EcoreUtil.isAncestor(this, newRdbmsOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRdbmsOwner != null)
				msgs = ((InternalEObject)newRdbmsOwner).eInverseAdd(this, SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_KEY, RdbmsTable.class, msgs);
			msgs = basicSetRdbmsOwner(newRdbmsOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRDBMSPackage.RDBMS_KEY__RDBMS_OWNER, newRdbmsOwner, newRdbmsOwner));
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
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_COLUMN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRdbmsColumn()).basicAdd(otherEnd, msgs);
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_REFERS_TO_OPPOSITE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRdbmsRefersToOpposite()).basicAdd(otherEnd, msgs);
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRdbmsOwner((RdbmsTable)otherEnd, msgs);
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
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_COLUMN:
				return ((InternalEList<?>)getRdbmsColumn()).basicRemove(otherEnd, msgs);
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_REFERS_TO_OPPOSITE:
				return ((InternalEList<?>)getRdbmsRefersToOpposite()).basicRemove(otherEnd, msgs);
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_OWNER:
				return basicSetRdbmsOwner(null, msgs);
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
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_OWNER:
				return eInternalContainer().eInverseRemove(this, SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_KEY, RdbmsTable.class, msgs);
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
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_COLUMN:
				return getRdbmsColumn();
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_REFERS_TO_OPPOSITE:
				return getRdbmsRefersToOpposite();
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_OWNER:
				return getRdbmsOwner();
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
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_COLUMN:
				getRdbmsColumn().clear();
				getRdbmsColumn().addAll((Collection<? extends RdbmsColumn>)newValue);
				return;
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_REFERS_TO_OPPOSITE:
				getRdbmsRefersToOpposite().clear();
				getRdbmsRefersToOpposite().addAll((Collection<? extends RdbmsForeignKey>)newValue);
				return;
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_OWNER:
				setRdbmsOwner((RdbmsTable)newValue);
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
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_COLUMN:
				getRdbmsColumn().clear();
				return;
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_REFERS_TO_OPPOSITE:
				getRdbmsRefersToOpposite().clear();
				return;
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_OWNER:
				setRdbmsOwner((RdbmsTable)null);
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
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_COLUMN:
				return rdbmsColumn != null && !rdbmsColumn.isEmpty();
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_REFERS_TO_OPPOSITE:
				return rdbmsRefersToOpposite != null && !rdbmsRefersToOpposite.isEmpty();
			case SimpleRDBMSPackage.RDBMS_KEY__RDBMS_OWNER:
				return getRdbmsOwner() != null;
		}
		return super.eIsSet(featureID);
	}

} //RdbmsKeyImpl
