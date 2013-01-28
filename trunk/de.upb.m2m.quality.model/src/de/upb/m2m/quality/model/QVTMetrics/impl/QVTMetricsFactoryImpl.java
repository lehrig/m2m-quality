/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QVTMetrics.impl;

import de.upb.m2m.quality.model.QVTMetrics.*;

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
public class QVTMetricsFactoryImpl extends EFactoryImpl implements QVTMetricsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QVTMetricsFactory init() {
		try {
			QVTMetricsFactory theQVTMetricsFactory = (QVTMetricsFactory)EPackage.Registry.INSTANCE.getEFactory("http://m2m.upb.de/QVTMetrics/1.0"); 
			if (theQVTMetricsFactory != null) {
				return theQVTMetricsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QVTMetricsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTMetricsFactoryImpl() {
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
			case QVTMetricsPackage.DOMAIN_PREDICATE_COUNT: return createDomainPredicateCount();
			case QVTMetricsPackage.TRANSFORMATION: return createTransformation();
			case QVTMetricsPackage.RELATION: return createRelation();
			case QVTMetricsPackage.FUNCTION: return createFunction();
			case QVTMetricsPackage.DOMAIN_PREDICATE: return createDomainPredicate();
			case QVTMetricsPackage.DOMAIN_PATTERN: return createDomainPattern();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainPredicateCount createDomainPredicateCount() {
		DomainPredicateCountImpl domainPredicateCount = new DomainPredicateCountImpl();
		return domainPredicateCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainPredicate createDomainPredicate() {
		DomainPredicateImpl domainPredicate = new DomainPredicateImpl();
		return domainPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainPattern createDomainPattern() {
		DomainPatternImpl domainPattern = new DomainPatternImpl();
		return domainPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTMetricsPackage getQVTMetricsPackage() {
		return (QVTMetricsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QVTMetricsPackage getPackage() {
		return QVTMetricsPackage.eINSTANCE;
	}

} //QVTMetricsFactoryImpl
