/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleRDBMS;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage
 * @generated
 */
public interface SimpleRDBMSFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleRDBMSFactory eINSTANCE = de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.SimpleRDBMSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rdbms Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdbms Column</em>'.
	 * @generated
	 */
	RdbmsColumn createRdbmsColumn();

	/**
	 * Returns a new object of class '<em>Rdbms Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdbms Foreign Key</em>'.
	 * @generated
	 */
	RdbmsForeignKey createRdbmsForeignKey();

	/**
	 * Returns a new object of class '<em>Rdbms Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdbms Key</em>'.
	 * @generated
	 */
	RdbmsKey createRdbmsKey();

	/**
	 * Returns a new object of class '<em>Rdbms Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdbms Model Element</em>'.
	 * @generated
	 */
	RdbmsModelElement createRdbmsModelElement();

	/**
	 * Returns a new object of class '<em>Rdbms Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdbms Schema</em>'.
	 * @generated
	 */
	RdbmsSchema createRdbmsSchema();

	/**
	 * Returns a new object of class '<em>Rdbms Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdbms Table</em>'.
	 * @generated
	 */
	RdbmsTable createRdbmsTable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimpleRDBMSPackage getSimpleRDBMSPackage();

} //SimpleRDBMSFactory
