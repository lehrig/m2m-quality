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
import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsSchema;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdbms Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsTableImpl#getRdbmsColumn <em>Rdbms Column</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsTableImpl#getRdbmsForeignKey <em>Rdbms Foreign Key</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsTableImpl#getRdbmsKey <em>Rdbms Key</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsTableImpl#getRdbmsSchema <em>Rdbms Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RdbmsTableImpl extends RdbmsModelElementImpl implements RdbmsTable {
	/**
	 * The cached value of the '{@link #getRdbmsColumn() <em>Rdbms Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<RdbmsColumn> rdbmsColumn;

	/**
	 * The cached value of the '{@link #getRdbmsForeignKey() <em>Rdbms Foreign Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsForeignKey()
	 * @generated
	 * @ordered
	 */
	protected EList<RdbmsForeignKey> rdbmsForeignKey;

	/**
	 * The cached value of the '{@link #getRdbmsKey() <em>Rdbms Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsKey()
	 * @generated
	 * @ordered
	 */
	protected EList<RdbmsKey> rdbmsKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdbmsTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleRDBMSPackage.Literals.RDBMS_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RdbmsColumn> getRdbmsColumn() {
		if (rdbmsColumn == null) {
			rdbmsColumn = new EObjectContainmentWithInverseEList<RdbmsColumn>(RdbmsColumn.class, this, SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_COLUMN, SimpleRDBMSPackage.RDBMS_COLUMN__RDBMS_OWNER);
		}
		return rdbmsColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RdbmsForeignKey> getRdbmsForeignKey() {
		if (rdbmsForeignKey == null) {
			rdbmsForeignKey = new EObjectContainmentWithInverseEList<RdbmsForeignKey>(RdbmsForeignKey.class, this, SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_FOREIGN_KEY, SimpleRDBMSPackage.RDBMS_FOREIGN_KEY__RDBMS_OWNER);
		}
		return rdbmsForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RdbmsKey> getRdbmsKey() {
		if (rdbmsKey == null) {
			rdbmsKey = new EObjectContainmentWithInverseEList<RdbmsKey>(RdbmsKey.class, this, SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_KEY, SimpleRDBMSPackage.RDBMS_KEY__RDBMS_OWNER);
		}
		return rdbmsKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsSchema getRdbmsSchema() {
		if (eContainerFeatureID() != SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_SCHEMA) return null;
		return (RdbmsSchema)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdbmsSchema(RdbmsSchema newRdbmsSchema, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRdbmsSchema, SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_SCHEMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRdbmsSchema(RdbmsSchema newRdbmsSchema) {
		if (newRdbmsSchema != eInternalContainer() || (eContainerFeatureID() != SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_SCHEMA && newRdbmsSchema != null)) {
			if (EcoreUtil.isAncestor(this, newRdbmsSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRdbmsSchema != null)
				msgs = ((InternalEObject)newRdbmsSchema).eInverseAdd(this, SimpleRDBMSPackage.RDBMS_SCHEMA__RDBMS_TABLE, RdbmsSchema.class, msgs);
			msgs = basicSetRdbmsSchema(newRdbmsSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_SCHEMA, newRdbmsSchema, newRdbmsSchema));
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
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_COLUMN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRdbmsColumn()).basicAdd(otherEnd, msgs);
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_FOREIGN_KEY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRdbmsForeignKey()).basicAdd(otherEnd, msgs);
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_KEY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRdbmsKey()).basicAdd(otherEnd, msgs);
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRdbmsSchema((RdbmsSchema)otherEnd, msgs);
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
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_COLUMN:
				return ((InternalEList<?>)getRdbmsColumn()).basicRemove(otherEnd, msgs);
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_FOREIGN_KEY:
				return ((InternalEList<?>)getRdbmsForeignKey()).basicRemove(otherEnd, msgs);
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_KEY:
				return ((InternalEList<?>)getRdbmsKey()).basicRemove(otherEnd, msgs);
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_SCHEMA:
				return basicSetRdbmsSchema(null, msgs);
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
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_SCHEMA:
				return eInternalContainer().eInverseRemove(this, SimpleRDBMSPackage.RDBMS_SCHEMA__RDBMS_TABLE, RdbmsSchema.class, msgs);
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
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_COLUMN:
				return getRdbmsColumn();
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_FOREIGN_KEY:
				return getRdbmsForeignKey();
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_KEY:
				return getRdbmsKey();
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_SCHEMA:
				return getRdbmsSchema();
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
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_COLUMN:
				getRdbmsColumn().clear();
				getRdbmsColumn().addAll((Collection<? extends RdbmsColumn>)newValue);
				return;
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_FOREIGN_KEY:
				getRdbmsForeignKey().clear();
				getRdbmsForeignKey().addAll((Collection<? extends RdbmsForeignKey>)newValue);
				return;
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_KEY:
				getRdbmsKey().clear();
				getRdbmsKey().addAll((Collection<? extends RdbmsKey>)newValue);
				return;
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_SCHEMA:
				setRdbmsSchema((RdbmsSchema)newValue);
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
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_COLUMN:
				getRdbmsColumn().clear();
				return;
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_FOREIGN_KEY:
				getRdbmsForeignKey().clear();
				return;
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_KEY:
				getRdbmsKey().clear();
				return;
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_SCHEMA:
				setRdbmsSchema((RdbmsSchema)null);
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
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_COLUMN:
				return rdbmsColumn != null && !rdbmsColumn.isEmpty();
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_FOREIGN_KEY:
				return rdbmsForeignKey != null && !rdbmsForeignKey.isEmpty();
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_KEY:
				return rdbmsKey != null && !rdbmsKey.isEmpty();
			case SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_SCHEMA:
				return getRdbmsSchema() != null;
		}
		return super.eIsSet(featureID);
	}

} //RdbmsTableImpl
