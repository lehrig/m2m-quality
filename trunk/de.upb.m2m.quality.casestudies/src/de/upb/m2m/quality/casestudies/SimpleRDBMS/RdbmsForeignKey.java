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
 * A representation of the model object '<em><b>Rdbms Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsOwner <em>Rdbms Owner</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsRefersTo <em>Rdbms Refers To</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsColumn <em>Rdbms Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsForeignKey()
 * @model
 * @generated
 */
public interface RdbmsForeignKey extends RdbmsModelElement {
	/**
	 * Returns the value of the '<em><b>Rdbms Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsForeignKey <em>Rdbms Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Owner</em>' container reference.
	 * @see #setRdbmsOwner(RdbmsTable)
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsForeignKey_RdbmsOwner()
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsForeignKey
	 * @model opposite="rdbmsForeignKey" required="true" transient="false"
	 * @generated
	 */
	RdbmsTable getRdbmsOwner();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsOwner <em>Rdbms Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdbms Owner</em>' container reference.
	 * @see #getRdbmsOwner()
	 * @generated
	 */
	void setRdbmsOwner(RdbmsTable value);

	/**
	 * Returns the value of the '<em><b>Rdbms Refers To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey#getRdbmsRefersToOpposite <em>Rdbms Refers To Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Refers To</em>' reference.
	 * @see #setRdbmsRefersTo(RdbmsKey)
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsForeignKey_RdbmsRefersTo()
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey#getRdbmsRefersToOpposite
	 * @model opposite="rdbmsRefersToOpposite" required="true"
	 * @generated
	 */
	RdbmsKey getRdbmsRefersTo();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsRefersTo <em>Rdbms Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdbms Refers To</em>' reference.
	 * @see #getRdbmsRefersTo()
	 * @generated
	 */
	void setRdbmsRefersTo(RdbmsKey value);

	/**
	 * Returns the value of the '<em><b>Rdbms Column</b></em>' reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsForeignKey <em>Rdbms Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Column</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Column</em>' reference list.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsForeignKey_RdbmsColumn()
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsForeignKey
	 * @model opposite="rdbmsForeignKey"
	 * @generated
	 */
	EList<RdbmsColumn> getRdbmsColumn();

} // RdbmsForeignKey
