/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleRDBMS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rdbms Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement#getRdbmsName <em>Rdbms Name</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement#getRdbmsKind <em>Rdbms Kind</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsModelElement()
 * @model
 * @generated
 */
public interface RdbmsModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Rdbms Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Name</em>' attribute.
	 * @see #setRdbmsName(String)
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsModelElement_RdbmsName()
	 * @model required="true"
	 * @generated
	 */
	String getRdbmsName();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement#getRdbmsName <em>Rdbms Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdbms Name</em>' attribute.
	 * @see #getRdbmsName()
	 * @generated
	 */
	void setRdbmsName(String value);

	/**
	 * Returns the value of the '<em><b>Rdbms Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Kind</em>' attribute.
	 * @see #setRdbmsKind(String)
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsModelElement_RdbmsKind()
	 * @model required="true"
	 * @generated
	 */
	String getRdbmsKind();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement#getRdbmsKind <em>Rdbms Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdbms Kind</em>' attribute.
	 * @see #getRdbmsKind()
	 * @generated
	 */
	void setRdbmsKind(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsModelElement_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // RdbmsModelElement
