/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleRDBMS.util;

import de.upb.m2m.quality.casestudies.SimpleRDBMS.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.SimpleRDBMSPackage
 * @generated
 */
public class SimpleRDBMSAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimpleRDBMSPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRDBMSAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimpleRDBMSPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleRDBMSSwitch<Adapter> modelSwitch =
		new SimpleRDBMSSwitch<Adapter>() {
			@Override
			public Adapter caseRdbmsColumn(RdbmsColumn object) {
				return createRdbmsColumnAdapter();
			}
			@Override
			public Adapter caseRdbmsForeignKey(RdbmsForeignKey object) {
				return createRdbmsForeignKeyAdapter();
			}
			@Override
			public Adapter caseRdbmsKey(RdbmsKey object) {
				return createRdbmsKeyAdapter();
			}
			@Override
			public Adapter caseRdbmsModelElement(RdbmsModelElement object) {
				return createRdbmsModelElementAdapter();
			}
			@Override
			public Adapter caseRdbmsSchema(RdbmsSchema object) {
				return createRdbmsSchemaAdapter();
			}
			@Override
			public Adapter caseRdbmsTable(RdbmsTable object) {
				return createRdbmsTableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn <em>Rdbms Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsColumn
	 * @generated
	 */
	public Adapter createRdbmsColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey <em>Rdbms Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsForeignKey
	 * @generated
	 */
	public Adapter createRdbmsForeignKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey <em>Rdbms Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsKey
	 * @generated
	 */
	public Adapter createRdbmsKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement <em>Rdbms Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsModelElement
	 * @generated
	 */
	public Adapter createRdbmsModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsSchema <em>Rdbms Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsSchema
	 * @generated
	 */
	public Adapter createRdbmsSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable <em>Rdbms Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.casestudies.SimpleRDBMS.RdbmsTable
	 * @generated
	 */
	public Adapter createRdbmsTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimpleRDBMSAdapterFactory
