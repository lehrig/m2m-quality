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
 * A representation of the model object '<em><b>Rdbms Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsSchema#getRdbmsTable <em>Rdbms Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsSchema()
 * @model
 * @generated
 */
public interface RdbmsSchema extends RdbmsModelElement {
	/**
	 * Returns the value of the '<em><b>Rdbms Table</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable}.
	 * It is bidirectional and its opposite is '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsSchema <em>Rdbms Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Table</em>' containment reference list.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage#getRdbmsSchema_RdbmsTable()
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsSchema
	 * @model opposite="rdbmsSchema" containment="true"
	 * @generated
	 */
	EList<RdbmsTable> getRdbmsTable();

} // RdbmsSchema
