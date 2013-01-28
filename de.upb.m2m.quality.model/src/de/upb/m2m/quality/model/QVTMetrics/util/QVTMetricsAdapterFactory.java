/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QVTMetrics.util;

import de.upb.m2m.quality.model.QVTMetrics.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage
 * @generated
 */
public class QVTMetricsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QVTMetricsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTMetricsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QVTMetricsPackage.eINSTANCE;
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
	protected QVTMetricsSwitch<Adapter> modelSwitch =
		new QVTMetricsSwitch<Adapter>() {
			@Override
			public Adapter caseDomainPredicateCount(DomainPredicateCount object) {
				return createDomainPredicateCountAdapter();
			}
			@Override
			public Adapter caseTransformation(Transformation object) {
				return createTransformationAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseDomainPredicate(DomainPredicate object) {
				return createDomainPredicateAdapter();
			}
			@Override
			public Adapter caseDomainPattern(DomainPattern object) {
				return createDomainPatternAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.model.QVTMetrics.DomainPredicateCount <em>Domain Predicate Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.model.QVTMetrics.DomainPredicateCount
	 * @generated
	 */
	public Adapter createDomainPredicateCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.model.QVTMetrics.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.model.QVTMetrics.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.model.QVTMetrics.DomainPredicate <em>Domain Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.model.QVTMetrics.DomainPredicate
	 * @generated
	 */
	public Adapter createDomainPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.model.QVTMetrics.DomainPattern <em>Domain Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.model.QVTMetrics.DomainPattern
	 * @generated
	 */
	public Adapter createDomainPatternAdapter() {
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

} //QVTMetricsAdapterFactory
