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
 * A representation of the model object '<em><b>Rdbms Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsType <em>Rdbms Type</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsOwner <em>Rdbms Owner</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsKey <em>Rdbms Key</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsForeignKey <em>Rdbms Foreign Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsColumn()
 * @model
 * @generated
 */
public interface RdbmsColumn extends RdbmsModelElement {
	/**
	 * Returns the value of the '<em><b>Rdbms Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Type</em>' attribute.
	 * @see #setRdbmsType(String)
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsColumn_RdbmsType()
	 * @model required="true"
	 * @generated
	 */
	String getRdbmsType();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsType <em>Rdbms Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdbms Type</em>' attribute.
	 * @see #getRdbmsType()
	 * @generated
	 */
	void setRdbmsType(String value);

	/**
	 * Returns the value of the '<em><b>Rdbms Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsColumn <em>Rdbms Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Owner</em>' container reference.
	 * @see #setRdbmsOwner(RdbmsTable)
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsColumn_RdbmsOwner()
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsColumn
	 * @model opposite="rdbmsColumn" required="true" transient="false"
	 * @generated
	 */
	RdbmsTable getRdbmsOwner();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsOwner <em>Rdbms Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdbms Owner</em>' container reference.
	 * @see #getRdbmsOwner()
	 * @generated
	 */
	void setRdbmsOwner(RdbmsTable value);

	/**
	 * Returns the value of the '<em><b>Rdbms Key</b></em>' reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey#getRdbmsColumn <em>Rdbms Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Key</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Key</em>' reference list.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsColumn_RdbmsKey()
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey#getRdbmsColumn
	 * @model opposite="rdbmsColumn"
	 * @generated
	 */
	EList<RdbmsKey> getRdbmsKey();

	/**
	 * Returns the value of the '<em><b>Rdbms Foreign Key</b></em>' reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsColumn <em>Rdbms Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Foreign Key</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Foreign Key</em>' reference list.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsColumn_RdbmsForeignKey()
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsColumn
	 * @model opposite="rdbmsColumn"
	 * @generated
	 */
	EList<RdbmsForeignKey> getRdbmsForeignKey();

} // RdbmsColumn
