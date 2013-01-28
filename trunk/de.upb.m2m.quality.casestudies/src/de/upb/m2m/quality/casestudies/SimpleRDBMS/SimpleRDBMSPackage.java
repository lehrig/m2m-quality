/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleRDBMS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleRDBMSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SimpleRDBMS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://m2m.upb.de/SimpleRDBMS/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SimpleRDBMS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleRDBMSPackage eINSTANCE = de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.SimpleRDBMSPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsModelElementImpl <em>Rdbms Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsModelElementImpl
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.SimpleRDBMSPackageImpl#getRdbmsModelElement()
	 * @generated
	 */
	int RDBMS_MODEL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Rdbms Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_MODEL_ELEMENT__RDBMS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Rdbms Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_MODEL_ELEMENT__RDBMS_KIND = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_MODEL_ELEMENT__ID = 2;

	/**
	 * The number of structural features of the '<em>Rdbms Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_MODEL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsColumnImpl <em>Rdbms Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsColumnImpl
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.SimpleRDBMSPackageImpl#getRdbmsColumn()
	 * @generated
	 */
	int RDBMS_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Rdbms Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_COLUMN__RDBMS_NAME = RDBMS_MODEL_ELEMENT__RDBMS_NAME;

	/**
	 * The feature id for the '<em><b>Rdbms Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_COLUMN__RDBMS_KIND = RDBMS_MODEL_ELEMENT__RDBMS_KIND;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_COLUMN__ID = RDBMS_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Rdbms Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_COLUMN__RDBMS_TYPE = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rdbms Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_COLUMN__RDBMS_OWNER = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rdbms Key</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_COLUMN__RDBMS_KEY = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rdbms Foreign Key</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_COLUMN__RDBMS_FOREIGN_KEY = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rdbms Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_COLUMN_FEATURE_COUNT = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsForeignKeyImpl <em>Rdbms Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsForeignKeyImpl
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.SimpleRDBMSPackageImpl#getRdbmsForeignKey()
	 * @generated
	 */
	int RDBMS_FOREIGN_KEY = 1;

	/**
	 * The feature id for the '<em><b>Rdbms Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_FOREIGN_KEY__RDBMS_NAME = RDBMS_MODEL_ELEMENT__RDBMS_NAME;

	/**
	 * The feature id for the '<em><b>Rdbms Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_FOREIGN_KEY__RDBMS_KIND = RDBMS_MODEL_ELEMENT__RDBMS_KIND;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_FOREIGN_KEY__ID = RDBMS_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Rdbms Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_FOREIGN_KEY__RDBMS_OWNER = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rdbms Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_FOREIGN_KEY__RDBMS_REFERS_TO = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rdbms Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_FOREIGN_KEY__RDBMS_COLUMN = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rdbms Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_FOREIGN_KEY_FEATURE_COUNT = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsKeyImpl <em>Rdbms Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsKeyImpl
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.SimpleRDBMSPackageImpl#getRdbmsKey()
	 * @generated
	 */
	int RDBMS_KEY = 2;

	/**
	 * The feature id for the '<em><b>Rdbms Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_KEY__RDBMS_NAME = RDBMS_MODEL_ELEMENT__RDBMS_NAME;

	/**
	 * The feature id for the '<em><b>Rdbms Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_KEY__RDBMS_KIND = RDBMS_MODEL_ELEMENT__RDBMS_KIND;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_KEY__ID = RDBMS_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Rdbms Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_KEY__RDBMS_COLUMN = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rdbms Refers To Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_KEY__RDBMS_REFERS_TO_OPPOSITE = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rdbms Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_KEY__RDBMS_OWNER = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rdbms Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_KEY_FEATURE_COUNT = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsSchemaImpl <em>Rdbms Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsSchemaImpl
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.SimpleRDBMSPackageImpl#getRdbmsSchema()
	 * @generated
	 */
	int RDBMS_SCHEMA = 4;

	/**
	 * The feature id for the '<em><b>Rdbms Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_SCHEMA__RDBMS_NAME = RDBMS_MODEL_ELEMENT__RDBMS_NAME;

	/**
	 * The feature id for the '<em><b>Rdbms Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_SCHEMA__RDBMS_KIND = RDBMS_MODEL_ELEMENT__RDBMS_KIND;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_SCHEMA__ID = RDBMS_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Rdbms Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_SCHEMA__RDBMS_TABLE = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rdbms Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_SCHEMA_FEATURE_COUNT = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsTableImpl <em>Rdbms Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsTableImpl
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.SimpleRDBMSPackageImpl#getRdbmsTable()
	 * @generated
	 */
	int RDBMS_TABLE = 5;

	/**
	 * The feature id for the '<em><b>Rdbms Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE__RDBMS_NAME = RDBMS_MODEL_ELEMENT__RDBMS_NAME;

	/**
	 * The feature id for the '<em><b>Rdbms Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE__RDBMS_KIND = RDBMS_MODEL_ELEMENT__RDBMS_KIND;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE__ID = RDBMS_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Rdbms Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE__RDBMS_COLUMN = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rdbms Foreign Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE__RDBMS_FOREIGN_KEY = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rdbms Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE__RDBMS_KEY = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rdbms Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE__RDBMS_SCHEMA = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rdbms Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE_FEATURE_COUNT = RDBMS_MODEL_ELEMENT_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn <em>Rdbms Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdbms Column</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn
	 * @generated
	 */
	EClass getRdbmsColumn();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsType <em>Rdbms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rdbms Type</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsType()
	 * @see #getRdbmsColumn()
	 * @generated
	 */
	EAttribute getRdbmsColumn_RdbmsType();

	/**
	 * Returns the meta object for the container reference '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsOwner <em>Rdbms Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rdbms Owner</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsOwner()
	 * @see #getRdbmsColumn()
	 * @generated
	 */
	EReference getRdbmsColumn_RdbmsOwner();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsKey <em>Rdbms Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rdbms Key</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsKey()
	 * @see #getRdbmsColumn()
	 * @generated
	 */
	EReference getRdbmsColumn_RdbmsKey();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsForeignKey <em>Rdbms Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rdbms Foreign Key</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn#getRdbmsForeignKey()
	 * @see #getRdbmsColumn()
	 * @generated
	 */
	EReference getRdbmsColumn_RdbmsForeignKey();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey <em>Rdbms Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdbms Foreign Key</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey
	 * @generated
	 */
	EClass getRdbmsForeignKey();

	/**
	 * Returns the meta object for the container reference '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsOwner <em>Rdbms Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rdbms Owner</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsOwner()
	 * @see #getRdbmsForeignKey()
	 * @generated
	 */
	EReference getRdbmsForeignKey_RdbmsOwner();

	/**
	 * Returns the meta object for the reference '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsRefersTo <em>Rdbms Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rdbms Refers To</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsRefersTo()
	 * @see #getRdbmsForeignKey()
	 * @generated
	 */
	EReference getRdbmsForeignKey_RdbmsRefersTo();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsColumn <em>Rdbms Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rdbms Column</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey#getRdbmsColumn()
	 * @see #getRdbmsForeignKey()
	 * @generated
	 */
	EReference getRdbmsForeignKey_RdbmsColumn();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey <em>Rdbms Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdbms Key</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey
	 * @generated
	 */
	EClass getRdbmsKey();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey#getRdbmsColumn <em>Rdbms Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rdbms Column</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey#getRdbmsColumn()
	 * @see #getRdbmsKey()
	 * @generated
	 */
	EReference getRdbmsKey_RdbmsColumn();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey#getRdbmsRefersToOpposite <em>Rdbms Refers To Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rdbms Refers To Opposite</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey#getRdbmsRefersToOpposite()
	 * @see #getRdbmsKey()
	 * @generated
	 */
	EReference getRdbmsKey_RdbmsRefersToOpposite();

	/**
	 * Returns the meta object for the container reference '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey#getRdbmsOwner <em>Rdbms Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rdbms Owner</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey#getRdbmsOwner()
	 * @see #getRdbmsKey()
	 * @generated
	 */
	EReference getRdbmsKey_RdbmsOwner();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement <em>Rdbms Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdbms Model Element</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement
	 * @generated
	 */
	EClass getRdbmsModelElement();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement#getRdbmsName <em>Rdbms Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rdbms Name</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement#getRdbmsName()
	 * @see #getRdbmsModelElement()
	 * @generated
	 */
	EAttribute getRdbmsModelElement_RdbmsName();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement#getRdbmsKind <em>Rdbms Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rdbms Kind</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement#getRdbmsKind()
	 * @see #getRdbmsModelElement()
	 * @generated
	 */
	EAttribute getRdbmsModelElement_RdbmsKind();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement#getId()
	 * @see #getRdbmsModelElement()
	 * @generated
	 */
	EAttribute getRdbmsModelElement_Id();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsSchema <em>Rdbms Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdbms Schema</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsSchema
	 * @generated
	 */
	EClass getRdbmsSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsSchema#getRdbmsTable <em>Rdbms Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rdbms Table</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsSchema#getRdbmsTable()
	 * @see #getRdbmsSchema()
	 * @generated
	 */
	EReference getRdbmsSchema_RdbmsTable();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable <em>Rdbms Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdbms Table</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable
	 * @generated
	 */
	EClass getRdbmsTable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsColumn <em>Rdbms Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rdbms Column</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsColumn()
	 * @see #getRdbmsTable()
	 * @generated
	 */
	EReference getRdbmsTable_RdbmsColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsForeignKey <em>Rdbms Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rdbms Foreign Key</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsForeignKey()
	 * @see #getRdbmsTable()
	 * @generated
	 */
	EReference getRdbmsTable_RdbmsForeignKey();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsKey <em>Rdbms Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rdbms Key</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsKey()
	 * @see #getRdbmsTable()
	 * @generated
	 */
	EReference getRdbmsTable_RdbmsKey();

	/**
	 * Returns the meta object for the container reference '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsSchema <em>Rdbms Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rdbms Schema</em>'.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable#getRdbmsSchema()
	 * @see #getRdbmsTable()
	 * @generated
	 */
	EReference getRdbmsTable_RdbmsSchema();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleRDBMSFactory getSimpleRDBMSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsColumnImpl <em>Rdbms Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsColumnImpl
		 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.SimpleRDBMSPackageImpl#getRdbmsColumn()
		 * @generated
		 */
		EClass RDBMS_COLUMN = eINSTANCE.getRdbmsColumn();

		/**
		 * The meta object literal for the '<em><b>Rdbms Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDBMS_COLUMN__RDBMS_TYPE = eINSTANCE.getRdbmsColumn_RdbmsType();

		/**
		 * The meta object literal for the '<em><b>Rdbms Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_COLUMN__RDBMS_OWNER = eINSTANCE.getRdbmsColumn_RdbmsOwner();

		/**
		 * The meta object literal for the '<em><b>Rdbms Key</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_COLUMN__RDBMS_KEY = eINSTANCE.getRdbmsColumn_RdbmsKey();

		/**
		 * The meta object literal for the '<em><b>Rdbms Foreign Key</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_COLUMN__RDBMS_FOREIGN_KEY = eINSTANCE.getRdbmsColumn_RdbmsForeignKey();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsForeignKeyImpl <em>Rdbms Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsForeignKeyImpl
		 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.SimpleRDBMSPackageImpl#getRdbmsForeignKey()
		 * @generated
		 */
		EClass RDBMS_FOREIGN_KEY = eINSTANCE.getRdbmsForeignKey();

		/**
		 * The meta object literal for the '<em><b>Rdbms Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_FOREIGN_KEY__RDBMS_OWNER = eINSTANCE.getRdbmsForeignKey_RdbmsOwner();

		/**
		 * The meta object literal for the '<em><b>Rdbms Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_FOREIGN_KEY__RDBMS_REFERS_TO = eINSTANCE.getRdbmsForeignKey_RdbmsRefersTo();

		/**
		 * The meta object literal for the '<em><b>Rdbms Column</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_FOREIGN_KEY__RDBMS_COLUMN = eINSTANCE.getRdbmsForeignKey_RdbmsColumn();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsKeyImpl <em>Rdbms Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsKeyImpl
		 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.SimpleRDBMSPackageImpl#getRdbmsKey()
		 * @generated
		 */
		EClass RDBMS_KEY = eINSTANCE.getRdbmsKey();

		/**
		 * The meta object literal for the '<em><b>Rdbms Column</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_KEY__RDBMS_COLUMN = eINSTANCE.getRdbmsKey_RdbmsColumn();

		/**
		 * The meta object literal for the '<em><b>Rdbms Refers To Opposite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_KEY__RDBMS_REFERS_TO_OPPOSITE = eINSTANCE.getRdbmsKey_RdbmsRefersToOpposite();

		/**
		 * The meta object literal for the '<em><b>Rdbms Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_KEY__RDBMS_OWNER = eINSTANCE.getRdbmsKey_RdbmsOwner();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsModelElementImpl <em>Rdbms Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsModelElementImpl
		 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.SimpleRDBMSPackageImpl#getRdbmsModelElement()
		 * @generated
		 */
		EClass RDBMS_MODEL_ELEMENT = eINSTANCE.getRdbmsModelElement();

		/**
		 * The meta object literal for the '<em><b>Rdbms Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDBMS_MODEL_ELEMENT__RDBMS_NAME = eINSTANCE.getRdbmsModelElement_RdbmsName();

		/**
		 * The meta object literal for the '<em><b>Rdbms Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDBMS_MODEL_ELEMENT__RDBMS_KIND = eINSTANCE.getRdbmsModelElement_RdbmsKind();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDBMS_MODEL_ELEMENT__ID = eINSTANCE.getRdbmsModelElement_Id();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsSchemaImpl <em>Rdbms Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsSchemaImpl
		 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.SimpleRDBMSPackageImpl#getRdbmsSchema()
		 * @generated
		 */
		EClass RDBMS_SCHEMA = eINSTANCE.getRdbmsSchema();

		/**
		 * The meta object literal for the '<em><b>Rdbms Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_SCHEMA__RDBMS_TABLE = eINSTANCE.getRdbmsSchema_RdbmsTable();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsTableImpl <em>Rdbms Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.RdbmsTableImpl
		 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.impl.SimpleRDBMSPackageImpl#getRdbmsTable()
		 * @generated
		 */
		EClass RDBMS_TABLE = eINSTANCE.getRdbmsTable();

		/**
		 * The meta object literal for the '<em><b>Rdbms Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_TABLE__RDBMS_COLUMN = eINSTANCE.getRdbmsTable_RdbmsColumn();

		/**
		 * The meta object literal for the '<em><b>Rdbms Foreign Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_TABLE__RDBMS_FOREIGN_KEY = eINSTANCE.getRdbmsTable_RdbmsForeignKey();

		/**
		 * The meta object literal for the '<em><b>Rdbms Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_TABLE__RDBMS_KEY = eINSTANCE.getRdbmsTable_RdbmsKey();

		/**
		 * The meta object literal for the '<em><b>Rdbms Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_TABLE__RDBMS_SCHEMA = eINSTANCE.getRdbmsTable_RdbmsSchema();

	}

} //SimpleRDBMSPackage
