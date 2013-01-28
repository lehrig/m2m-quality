/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleRDBMS.util;

import de.upb.m2m.quality.casestudies.SimpleRDBMS.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage
 * @generated
 */
public class SimpleRDBMSSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimpleRDBMSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRDBMSSwitch() {
		if (modelPackage == null) {
			modelPackage = SimpleRDBMSPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SimpleRDBMSPackage.RDBMS_COLUMN: {
				RdbmsColumn rdbmsColumn = (RdbmsColumn)theEObject;
				T result = caseRdbmsColumn(rdbmsColumn);
				if (result == null) result = caseRdbmsModelElement(rdbmsColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY: {
				RdbmsForeignKey rdbmsForeignKey = (RdbmsForeignKey)theEObject;
				T result = caseRdbmsForeignKey(rdbmsForeignKey);
				if (result == null) result = caseRdbmsModelElement(rdbmsForeignKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleRDBMSPackage.RDBMS_KEY: {
				RdbmsKey rdbmsKey = (RdbmsKey)theEObject;
				T result = caseRdbmsKey(rdbmsKey);
				if (result == null) result = caseRdbmsModelElement(rdbmsKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT: {
				RdbmsModelElement rdbmsModelElement = (RdbmsModelElement)theEObject;
				T result = caseRdbmsModelElement(rdbmsModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleRDBMSPackage.RDBMS_SCHEMA: {
				RdbmsSchema rdbmsSchema = (RdbmsSchema)theEObject;
				T result = caseRdbmsSchema(rdbmsSchema);
				if (result == null) result = caseRdbmsModelElement(rdbmsSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimpleRDBMSPackage.RDBMS_TABLE: {
				RdbmsTable rdbmsTable = (RdbmsTable)theEObject;
				T result = caseRdbmsTable(rdbmsTable);
				if (result == null) result = caseRdbmsModelElement(rdbmsTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdbms Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdbms Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdbmsColumn(RdbmsColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdbms Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdbms Foreign Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdbmsForeignKey(RdbmsForeignKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdbms Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdbms Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdbmsKey(RdbmsKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdbms Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdbms Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdbmsModelElement(RdbmsModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdbms Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdbms Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdbmsSchema(RdbmsSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdbms Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdbms Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdbmsTable(RdbmsTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SimpleRDBMSSwitch
