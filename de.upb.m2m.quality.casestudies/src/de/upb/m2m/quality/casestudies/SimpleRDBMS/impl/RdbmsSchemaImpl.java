/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleRDBMS.impl;

import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsSchema;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable;
import de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdbms Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsSchemaImpl#getRdbmsTable <em>Rdbms Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RdbmsSchemaImpl extends RdbmsModelElementImpl implements RdbmsSchema {
	/**
	 * The cached value of the '{@link #getRdbmsTable() <em>Rdbms Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsTable()
	 * @generated
	 * @ordered
	 */
	protected EList<RdbmsTable> rdbmsTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdbmsSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleRDBMSPackage.Literals.RDBMS_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RdbmsTable> getRdbmsTable() {
		if (rdbmsTable == null) {
			rdbmsTable = new EObjectContainmentWithInverseEList<RdbmsTable>(RdbmsTable.class, this, SimpleRDBMSPackage.RDBMS_SCHEMA__RDBMS_TABLE, SimpleRDBMSPackage.RDBMS_TABLE__RDBMS_SCHEMA);
		}
		return rdbmsTable;
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
			case SimpleRDBMSPackage.RDBMS_SCHEMA__RDBMS_TABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRdbmsTable()).basicAdd(otherEnd, msgs);
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
			case SimpleRDBMSPackage.RDBMS_SCHEMA__RDBMS_TABLE:
				return ((InternalEList<?>)getRdbmsTable()).basicRemove(otherEnd, msgs);
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
			case SimpleRDBMSPackage.RDBMS_SCHEMA__RDBMS_TABLE:
				return getRdbmsTable();
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
			case SimpleRDBMSPackage.RDBMS_SCHEMA__RDBMS_TABLE:
				getRdbmsTable().clear();
				getRdbmsTable().addAll((Collection<? extends RdbmsTable>)newValue);
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
			case SimpleRDBMSPackage.RDBMS_SCHEMA__RDBMS_TABLE:
				getRdbmsTable().clear();
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
			case SimpleRDBMSPackage.RDBMS_SCHEMA__RDBMS_TABLE:
				return rdbmsTable != null && !rdbmsTable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RdbmsSchemaImpl
