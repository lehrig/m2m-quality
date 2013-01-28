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
 * A representation of the model object '<em><b>Rdbms Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey#getRdbmsColumn <em>Rdbms Column</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey#getRdbmsRefersToOpposite <em>Rdbms Refers To Opposite</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey#getRdbmsOwner <em>Rdbms Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsKey()
 * @model
 * @generated
 */
public interface RdbmsKey extends RdbmsModelElement {
	/**
	 * Returns the value of the '<em><b>Rdbms Column</b></em>' reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsKey <em>Rdbms Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Column</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Column</em>' reference list.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsKey_RdbmsColumn()
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsKey
	 * @model opposite="rdbmsKey"
	 * @generated
	 */
	EList<RdbmsColumn> getRdbmsColumn();

	/**
	 * Returns the value of the '<em><b>Rdbms Refers To Opposite</b></em>' reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsRefersTo <em>Rdbms Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Refers To Opposite</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Refers To Opposite</em>' reference list.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsKey_RdbmsRefersToOpposite()
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsRefersTo
	 * @model opposite="rdbmsRefersTo"
	 * @generated
	 */
	EList<RdbmsForeignKey> getRdbmsRefersToOpposite();

	/**
	 * Returns the value of the '<em><b>Rdbms Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsKey <em>Rdbms Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Owner</em>' container reference.
	 * @see #setRdbmsOwner(RdbmsTable)
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsKey_RdbmsOwner()
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsKey
	 * @model opposite="rdbmsKey" required="true" transient="false"
	 * @generated
	 */
	RdbmsTable getRdbmsOwner();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey#getRdbmsOwner <em>Rdbms Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdbms Owner</em>' container reference.
	 * @see #getRdbmsOwner()
	 * @generated
	 */
	void setRdbmsOwner(RdbmsTable value);

} // RdbmsKey
