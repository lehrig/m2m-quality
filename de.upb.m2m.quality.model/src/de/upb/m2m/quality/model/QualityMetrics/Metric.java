/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QualityMetrics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.model.QualityMetrics.Metric#getMetric <em>Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage#getMetric()
 * @model abstract="true"
 * @generated
 */
public interface Metric extends EObject {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see #setMetric(String)
	 * @see de.upb.m2m.quality.model.QualityMetrics.QualityMetricsPackage#getMetric_Metric()
	 * @model required="true"
	 * @generated
	 */
	String getMetric();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QualityMetrics.Metric#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(String value);

} // Metric
