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
 * A representation of the model object '<em><b>Domain Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.DomainPattern#getDomainPredicateCount <em>Domain Predicate Count</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.DomainPattern#getSizeOfDomainPattern <em>Size Of Domain Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getDomainPattern()
 * @model
 * @generated
 */
public interface DomainPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Predicate Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Predicate Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Predicate Count</em>' containment reference.
	 * @see #setDomainPredicateCount(DomainPredicateCount)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getDomainPattern_DomainPredicateCount()
	 * @model containment="true"
	 * @generated
	 */
	DomainPredicateCount getDomainPredicateCount();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.DomainPattern#getDomainPredicateCount <em>Domain Predicate Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Predicate Count</em>' containment reference.
	 * @see #getDomainPredicateCount()
	 * @generated
	 */
	void setDomainPredicateCount(DomainPredicateCount value);

	/**
	 * Returns the value of the '<em><b>Size Of Domain Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Of Domain Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Of Domain Pattern</em>' attribute.
	 * @see #setSizeOfDomainPattern(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getDomainPattern_SizeOfDomainPattern()
	 * @model
	 * @generated
	 */
	int getSizeOfDomainPattern();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.DomainPattern#getSizeOfDomainPattern <em>Size Of Domain Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Of Domain Pattern</em>' attribute.
	 * @see #getSizeOfDomainPattern()
	 * @generated
	 */
	void setSizeOfDomainPattern(int value);

} // DomainPattern
