/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QVTMetrics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Predicate Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.DomainPredicateCount#getAverage <em>Average</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.DomainPredicateCount#getMean <em>Mean</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getDomainPredicateCount()
 * @model
 * @generated
 */
public interface DomainPredicateCount extends EObject {
	/**
	 * Returns the value of the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average</em>' attribute.
	 * @see #setAverage(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getDomainPredicateCount_Average()
	 * @model
	 * @generated
	 */
	int getAverage();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.DomainPredicateCount#getAverage <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average</em>' attribute.
	 * @see #getAverage()
	 * @generated
	 */
	void setAverage(int value);

	/**
	 * Returns the value of the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean</em>' attribute.
	 * @see #setMean(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getDomainPredicateCount_Mean()
	 * @model
	 * @generated
	 */
	int getMean();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.DomainPredicateCount#getMean <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' attribute.
	 * @see #getMean()
	 * @generated
	 */
	void setMean(int value);

} // DomainPredicateCount
