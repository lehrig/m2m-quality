/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QVTMetrics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getDomainPattern <em>Domain Pattern</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoCheckonlyDomains <em>No Checkonly Domains</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoEnforcedDomains <em>No Enforced Domains</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoWhen <em>No When</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoWhere <em>No Where</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoDomains <em>No Domains</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoVars <em>No Vars</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getValOut <em>Val Out</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getFanOut <em>Fan Out</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getFanIn <em>Fan In</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoBoundVars <em>No Bound Vars</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoUnboundVars <em>No Unbound Vars</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getVarBindingRate <em>Var Binding Rate</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getAvgSizeOfDomainPattern <em>Avg Size Of Domain Pattern</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getDepthOfLeaf <em>Depth Of Leaf</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNwwp <em>Nwwp</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNwwpc <em>Nwwpc</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Pattern</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.model.QVTMetrics.DomainPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Pattern</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Pattern</em>' containment reference list.
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_DomainPattern()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DomainPattern> getDomainPattern();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>No Checkonly Domains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Checkonly Domains</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Checkonly Domains</em>' attribute.
	 * @see #setNoCheckonlyDomains(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_NoCheckonlyDomains()
	 * @model
	 * @generated
	 */
	int getNoCheckonlyDomains();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoCheckonlyDomains <em>No Checkonly Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Checkonly Domains</em>' attribute.
	 * @see #getNoCheckonlyDomains()
	 * @generated
	 */
	void setNoCheckonlyDomains(int value);

	/**
	 * Returns the value of the '<em><b>No Enforced Domains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Enforced Domains</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Enforced Domains</em>' attribute.
	 * @see #setNoEnforcedDomains(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_NoEnforcedDomains()
	 * @model
	 * @generated
	 */
	int getNoEnforcedDomains();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoEnforcedDomains <em>No Enforced Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Enforced Domains</em>' attribute.
	 * @see #getNoEnforcedDomains()
	 * @generated
	 */
	void setNoEnforcedDomains(int value);

	/**
	 * Returns the value of the '<em><b>No When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No When</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No When</em>' attribute.
	 * @see #setNoWhen(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_NoWhen()
	 * @model
	 * @generated
	 */
	int getNoWhen();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoWhen <em>No When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No When</em>' attribute.
	 * @see #getNoWhen()
	 * @generated
	 */
	void setNoWhen(int value);

	/**
	 * Returns the value of the '<em><b>No Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Where</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Where</em>' attribute.
	 * @see #setNoWhere(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_NoWhere()
	 * @model
	 * @generated
	 */
	int getNoWhere();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoWhere <em>No Where</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Where</em>' attribute.
	 * @see #getNoWhere()
	 * @generated
	 */
	void setNoWhere(int value);

	/**
	 * Returns the value of the '<em><b>No Domains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Domains</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Domains</em>' attribute.
	 * @see #setNoDomains(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_NoDomains()
	 * @model
	 * @generated
	 */
	int getNoDomains();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoDomains <em>No Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Domains</em>' attribute.
	 * @see #getNoDomains()
	 * @generated
	 */
	void setNoDomains(int value);

	/**
	 * Returns the value of the '<em><b>No Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Vars</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Vars</em>' attribute.
	 * @see #setNoVars(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_NoVars()
	 * @model
	 * @generated
	 */
	int getNoVars();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoVars <em>No Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Vars</em>' attribute.
	 * @see #getNoVars()
	 * @generated
	 */
	void setNoVars(int value);

	/**
	 * Returns the value of the '<em><b>Val Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val Out</em>' attribute.
	 * @see #setValOut(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_ValOut()
	 * @model
	 * @generated
	 */
	int getValOut();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getValOut <em>Val Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val Out</em>' attribute.
	 * @see #getValOut()
	 * @generated
	 */
	void setValOut(int value);

	/**
	 * Returns the value of the '<em><b>Fan Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan Out</em>' attribute.
	 * @see #setFanOut(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_FanOut()
	 * @model
	 * @generated
	 */
	int getFanOut();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getFanOut <em>Fan Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan Out</em>' attribute.
	 * @see #getFanOut()
	 * @generated
	 */
	void setFanOut(int value);

	/**
	 * Returns the value of the '<em><b>Fan In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan In</em>' attribute.
	 * @see #setFanIn(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_FanIn()
	 * @model
	 * @generated
	 */
	int getFanIn();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getFanIn <em>Fan In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan In</em>' attribute.
	 * @see #getFanIn()
	 * @generated
	 */
	void setFanIn(int value);

	/**
	 * Returns the value of the '<em><b>No Bound Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Bound Vars</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Bound Vars</em>' attribute.
	 * @see #setNoBoundVars(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_NoBoundVars()
	 * @model
	 * @generated
	 */
	int getNoBoundVars();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoBoundVars <em>No Bound Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Bound Vars</em>' attribute.
	 * @see #getNoBoundVars()
	 * @generated
	 */
	void setNoBoundVars(int value);

	/**
	 * Returns the value of the '<em><b>No Unbound Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Unbound Vars</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Unbound Vars</em>' attribute.
	 * @see #setNoUnboundVars(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_NoUnboundVars()
	 * @model
	 * @generated
	 */
	int getNoUnboundVars();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoUnboundVars <em>No Unbound Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Unbound Vars</em>' attribute.
	 * @see #getNoUnboundVars()
	 * @generated
	 */
	void setNoUnboundVars(int value);

	/**
	 * Returns the value of the '<em><b>Var Binding Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Binding Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Binding Rate</em>' attribute.
	 * @see #setVarBindingRate(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_VarBindingRate()
	 * @model
	 * @generated
	 */
	double getVarBindingRate();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getVarBindingRate <em>Var Binding Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Binding Rate</em>' attribute.
	 * @see #getVarBindingRate()
	 * @generated
	 */
	void setVarBindingRate(double value);

	/**
	 * Returns the value of the '<em><b>Avg Size Of Domain Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Size Of Domain Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Size Of Domain Pattern</em>' attribute.
	 * @see #setAvgSizeOfDomainPattern(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_AvgSizeOfDomainPattern()
	 * @model
	 * @generated
	 */
	double getAvgSizeOfDomainPattern();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getAvgSizeOfDomainPattern <em>Avg Size Of Domain Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Size Of Domain Pattern</em>' attribute.
	 * @see #getAvgSizeOfDomainPattern()
	 * @generated
	 */
	void setAvgSizeOfDomainPattern(double value);

	/**
	 * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Leaf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Leaf</em>' attribute.
	 * @see #setIsLeaf(boolean)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_IsLeaf()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsLeaf();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#isIsLeaf <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leaf</em>' attribute.
	 * @see #isIsLeaf()
	 * @generated
	 */
	void setIsLeaf(boolean value);

	/**
	 * Returns the value of the '<em><b>Depth Of Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Of Leaf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth Of Leaf</em>' attribute.
	 * @see #setDepthOfLeaf(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_DepthOfLeaf()
	 * @model
	 * @generated
	 */
	int getDepthOfLeaf();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getDepthOfLeaf <em>Depth Of Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth Of Leaf</em>' attribute.
	 * @see #getDepthOfLeaf()
	 * @generated
	 */
	void setDepthOfLeaf(int value);

	/**
	 * Returns the value of the '<em><b>Nwwp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nwwp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nwwp</em>' attribute.
	 * @see #setNwwp(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_Nwwp()
	 * @model
	 * @generated
	 */
	int getNwwp();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNwwp <em>Nwwp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nwwp</em>' attribute.
	 * @see #getNwwp()
	 * @generated
	 */
	void setNwwp(int value);

	/**
	 * Returns the value of the '<em><b>Nwwpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nwwpc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nwwpc</em>' attribute.
	 * @see #setNwwpc(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getRelation_Nwwpc()
	 * @model
	 * @generated
	 */
	int getNwwpc();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNwwpc <em>Nwwpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nwwpc</em>' attribute.
	 * @see #getNwwpc()
	 * @generated
	 */
	void setNwwpc(int value);

} // Relation
