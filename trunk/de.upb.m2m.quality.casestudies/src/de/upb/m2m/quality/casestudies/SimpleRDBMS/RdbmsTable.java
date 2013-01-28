/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleRDBMS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rdbms Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsColumn <em>Rdbms Column</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsForeignKey <em>Rdbms Foreign Key</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsKey <em>Rdbms Key</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsSchema <em>Rdbms Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsTable()
 * @model
 * @generated
 */
public interface RdbmsTable extends RdbmsModelElement {
	/**
	 * Returns the value of the '<em><b>Rdbms Column</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsOwner <em>Rdbms Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Column</em>' containment reference list.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsTable_RdbmsColumn()
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsOwner
	 * @model opposite="rdbmsOwner" containment="true"
	 * @generated
	 */
	EList<RdbmsColumn> getRdbmsColumn();

	/**
	 * Returns the value of the '<em><b>Rdbms Foreign Key</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsOwner <em>Rdbms Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Foreign Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Foreign Key</em>' containment reference list.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsTable_RdbmsForeignKey()
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsOwner
	 * @model opposite="rdbmsOwner" containment="true"
	 * @generated
	 */
	EList<RdbmsForeignKey> getRdbmsForeignKey();

	/**
	 * Returns the value of the '<em><b>Rdbms Key</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey#getRdbmsOwner <em>Rdbms Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Key</em>' containment reference list.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsTable_RdbmsKey()
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey#getRdbmsOwner
	 * @model opposite="rdbmsOwner" containment="true"
	 * @generated
	 */
	EList<RdbmsKey> getRdbmsKey();

	/**
	 * Returns the value of the '<em><b>Rdbms Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsSchema#getRdbmsTable <em>Rdbms Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Schema</em>' container reference.
	 * @see #setRdbmsSchema(RdbmsSchema)
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsTable_RdbmsSchema()
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsSchema#getRdbmsTable
	 * @model opposite="rdbmsTable" required="true" transient="false"
	 * @generated
	 */
	RdbmsSchema getRdbmsSchema();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsSchema <em>Rdbms Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdbms Schema</em>' container reference.
	 * @see #getRdbmsSchema()
	 * @generated
	 */
	void setRdbmsSchema(RdbmsSchema value);

} // RdbmsTable
