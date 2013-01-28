/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleRDBMS.impl;

import de.upb.m2m.quality.casestudies.SimpleRDBMS.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleRDBMSFactoryImpl extends EFactoryImpl implements SimpleRDBMSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleRDBMSFactory init() {
		try {
			SimpleRDBMSFactory theSimpleRDBMSFactory = (SimpleRDBMSFactory)EPackage.Registry.INSTANCE.getEFactory("http://m2m.upb.de/SimpleRDBMS/1.0"); 
			if (theSimpleRDBMSFactory != null) {
				return theSimpleRDBMSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpleRDBMSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRDBMSFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimpleRDBMSPackage.RDBMS_COLUMN: return createRdbmsColumn();
			case SimpleRDBMSPackage.RDBMS_FOREIGN_KEY: return createRdbmsForeignKey();
			case SimpleRDBMSPackage.RDBMS_KEY: return createRdbmsKey();
			case SimpleRDBMSPackage.RDBMS_MODEL_ELEMENT: return createRdbmsModelElement();
			case SimpleRDBMSPackage.RDBMS_SCHEMA: return createRdbmsSchema();
			case SimpleRDBMSPackage.RDBMS_TABLE: return createRdbmsTable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsColumn createRdbmsColumn() {
		RdbmsColumnImpl rdbmsColumn = new RdbmsColumnImpl();
		return rdbmsColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsForeignKey createRdbmsForeignKey() {
		RdbmsForeignKeyImpl rdbmsForeignKey = new RdbmsForeignKeyImpl();
		return rdbmsForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsKey createRdbmsKey() {
		RdbmsKeyImpl rdbmsKey = new RdbmsKeyImpl();
		return rdbmsKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsModelElement createRdbmsModelElement() {
		RdbmsModelElementImpl rdbmsModelElement = new RdbmsModelElementImpl();
		return rdbmsModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsSchema createRdbmsSchema() {
		RdbmsSchemaImpl rdbmsSchema = new RdbmsSchemaImpl();
		return rdbmsSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsTable createRdbmsTable() {
		RdbmsTableImpl rdbmsTable = new RdbmsTableImpl();
		return rdbmsTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRDBMSPackage getSimpleRDBMSPackage() {
		return (SimpleRDBMSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimpleRDBMSPackage getPackage() {
		return SimpleRDBMSPackage.eINSTANCE;
	}

} //SimpleRDBMSFactoryImpl
