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
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getRelations <em>Relations</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getFunctions <em>Functions</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getChildren <em>Children</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoStarts <em>No Starts</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoWhen <em>No When</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoWhere <em>No Where</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoRelations <em>No Relations</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoTopLevelRelations <em>No Top Level Relations</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoMetamodels <em>No Metamodels</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoOclQueries <em>No Ocl Queries</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgWhen <em>Avg When</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgWhere <em>Avg Where</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgEnforcedDomains <em>Avg Enforced Domains</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgCheckonlyDomains <em>Avg Checkonly Domains</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgSizeOfDomainPattern <em>Avg Size Of Domain Pattern</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgDomains <em>Avg Domains</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgVars <em>Avg Vars</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgRelFanOut <em>Avg Rel Fan Out</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgValOut <em>Avg Val Out</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgFanIn <em>Avg Fan In</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getExtends_metric <em>Extends metric</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoDirectChildren <em>No Direct Children</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoTransitiveChildren <em>No Transitive Children</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoTransitiveParents <em>No Transitive Parents</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoOverrides <em>No Overrides</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgChildComplexity <em>Avg Child Complexity</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getBalance <em>Balance</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgVarBindingRate <em>Avg Var Binding Rate</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgRelationDependencyDepth <em>Avg Relation Dependency Depth</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgTypeOverlap <em>Avg Type Overlap</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoLeafRelations <em>No Leaf Relations</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgFuncFanOut <em>Avg Func Fan Out</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgNWWPC <em>Avg NWWPC</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgNWWP <em>Avg NWWP</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getLoc <em>Loc</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getSloc <em>Sloc</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getBloc <em>Bloc</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getCloc <em>Cloc</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoIncludes <em>No Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject {
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
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.model.QVTMetrics.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.model.QVTMetrics.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunctions();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link de.upb.m2m.quality.model.QVTMetrics.Transformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_Children()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Transformation> getChildren();

	/**
	 * Returns the value of the '<em><b>No Starts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Starts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Starts</em>' attribute.
	 * @see #setNoStarts(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_NoStarts()
	 * @model
	 * @generated
	 */
	int getNoStarts();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoStarts <em>No Starts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Starts</em>' attribute.
	 * @see #getNoStarts()
	 * @generated
	 */
	void setNoStarts(int value);

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
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_NoWhen()
	 * @model
	 * @generated
	 */
	int getNoWhen();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoWhen <em>No When</em>}' attribute.
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
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_NoWhere()
	 * @model
	 * @generated
	 */
	int getNoWhere();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoWhere <em>No Where</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Where</em>' attribute.
	 * @see #getNoWhere()
	 * @generated
	 */
	void setNoWhere(int value);

	/**
	 * Returns the value of the '<em><b>No Relations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Relations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Relations</em>' attribute.
	 * @see #setNoRelations(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_NoRelations()
	 * @model
	 * @generated
	 */
	int getNoRelations();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoRelations <em>No Relations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Relations</em>' attribute.
	 * @see #getNoRelations()
	 * @generated
	 */
	void setNoRelations(int value);

	/**
	 * Returns the value of the '<em><b>No Top Level Relations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Top Level Relations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Top Level Relations</em>' attribute.
	 * @see #setNoTopLevelRelations(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_NoTopLevelRelations()
	 * @model
	 * @generated
	 */
	int getNoTopLevelRelations();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoTopLevelRelations <em>No Top Level Relations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Top Level Relations</em>' attribute.
	 * @see #getNoTopLevelRelations()
	 * @generated
	 */
	void setNoTopLevelRelations(int value);

	/**
	 * Returns the value of the '<em><b>No Metamodels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Metamodels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Metamodels</em>' attribute.
	 * @see #setNoMetamodels(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_NoMetamodels()
	 * @model
	 * @generated
	 */
	int getNoMetamodels();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoMetamodels <em>No Metamodels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Metamodels</em>' attribute.
	 * @see #getNoMetamodels()
	 * @generated
	 */
	void setNoMetamodels(int value);

	/**
	 * Returns the value of the '<em><b>No Ocl Queries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Ocl Queries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Ocl Queries</em>' attribute.
	 * @see #setNoOclQueries(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_NoOclQueries()
	 * @model
	 * @generated
	 */
	int getNoOclQueries();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoOclQueries <em>No Ocl Queries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Ocl Queries</em>' attribute.
	 * @see #getNoOclQueries()
	 * @generated
	 */
	void setNoOclQueries(int value);

	/**
	 * Returns the value of the '<em><b>Avg When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg When</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg When</em>' attribute.
	 * @see #setAvgWhen(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgWhen()
	 * @model
	 * @generated
	 */
	double getAvgWhen();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgWhen <em>Avg When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg When</em>' attribute.
	 * @see #getAvgWhen()
	 * @generated
	 */
	void setAvgWhen(double value);

	/**
	 * Returns the value of the '<em><b>Avg Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Where</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Where</em>' attribute.
	 * @see #setAvgWhere(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgWhere()
	 * @model
	 * @generated
	 */
	double getAvgWhere();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgWhere <em>Avg Where</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Where</em>' attribute.
	 * @see #getAvgWhere()
	 * @generated
	 */
	void setAvgWhere(double value);

	/**
	 * Returns the value of the '<em><b>Avg Enforced Domains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Enforced Domains</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Enforced Domains</em>' attribute.
	 * @see #setAvgEnforcedDomains(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgEnforcedDomains()
	 * @model
	 * @generated
	 */
	double getAvgEnforcedDomains();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgEnforcedDomains <em>Avg Enforced Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Enforced Domains</em>' attribute.
	 * @see #getAvgEnforcedDomains()
	 * @generated
	 */
	void setAvgEnforcedDomains(double value);

	/**
	 * Returns the value of the '<em><b>Avg Checkonly Domains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Checkonly Domains</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Checkonly Domains</em>' attribute.
	 * @see #setAvgCheckonlyDomains(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgCheckonlyDomains()
	 * @model
	 * @generated
	 */
	double getAvgCheckonlyDomains();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgCheckonlyDomains <em>Avg Checkonly Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Checkonly Domains</em>' attribute.
	 * @see #getAvgCheckonlyDomains()
	 * @generated
	 */
	void setAvgCheckonlyDomains(double value);

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
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgSizeOfDomainPattern()
	 * @model
	 * @generated
	 */
	double getAvgSizeOfDomainPattern();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgSizeOfDomainPattern <em>Avg Size Of Domain Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Size Of Domain Pattern</em>' attribute.
	 * @see #getAvgSizeOfDomainPattern()
	 * @generated
	 */
	void setAvgSizeOfDomainPattern(double value);

	/**
	 * Returns the value of the '<em><b>Avg Domains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Domains</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Domains</em>' attribute.
	 * @see #setAvgDomains(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgDomains()
	 * @model
	 * @generated
	 */
	double getAvgDomains();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgDomains <em>Avg Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Domains</em>' attribute.
	 * @see #getAvgDomains()
	 * @generated
	 */
	void setAvgDomains(double value);

	/**
	 * Returns the value of the '<em><b>Avg Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Vars</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Vars</em>' attribute.
	 * @see #setAvgVars(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgVars()
	 * @model
	 * @generated
	 */
	double getAvgVars();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgVars <em>Avg Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Vars</em>' attribute.
	 * @see #getAvgVars()
	 * @generated
	 */
	void setAvgVars(double value);

	/**
	 * Returns the value of the '<em><b>Avg Rel Fan Out</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Rel Fan Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Rel Fan Out</em>' attribute.
	 * @see #setAvgRelFanOut(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgRelFanOut()
	 * @model default="0"
	 * @generated
	 */
	double getAvgRelFanOut();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgRelFanOut <em>Avg Rel Fan Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Rel Fan Out</em>' attribute.
	 * @see #getAvgRelFanOut()
	 * @generated
	 */
	void setAvgRelFanOut(double value);

	/**
	 * Returns the value of the '<em><b>Avg Val Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Val Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Val Out</em>' attribute.
	 * @see #setAvgValOut(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgValOut()
	 * @model
	 * @generated
	 */
	double getAvgValOut();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgValOut <em>Avg Val Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Val Out</em>' attribute.
	 * @see #getAvgValOut()
	 * @generated
	 */
	void setAvgValOut(double value);

	/**
	 * Returns the value of the '<em><b>Avg Fan In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Fan In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Fan In</em>' attribute.
	 * @see #setAvgFanIn(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgFanIn()
	 * @model
	 * @generated
	 */
	double getAvgFanIn();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgFanIn <em>Avg Fan In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Fan In</em>' attribute.
	 * @see #getAvgFanIn()
	 * @generated
	 */
	void setAvgFanIn(double value);

	/**
	 * Returns the value of the '<em><b>Extends metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends metric</em>' reference.
	 * @see #setExtends_metric(Transformation)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_Extends_metric()
	 * @model
	 * @generated
	 */
	Transformation getExtends_metric();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getExtends_metric <em>Extends metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends metric</em>' reference.
	 * @see #getExtends_metric()
	 * @generated
	 */
	void setExtends_metric(Transformation value);

	/**
	 * Returns the value of the '<em><b>No Direct Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Direct Children</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Direct Children</em>' attribute.
	 * @see #setNoDirectChildren(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_NoDirectChildren()
	 * @model
	 * @generated
	 */
	int getNoDirectChildren();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoDirectChildren <em>No Direct Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Direct Children</em>' attribute.
	 * @see #getNoDirectChildren()
	 * @generated
	 */
	void setNoDirectChildren(int value);

	/**
	 * Returns the value of the '<em><b>No Transitive Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Transitive Children</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Transitive Children</em>' attribute.
	 * @see #setNoTransitiveChildren(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_NoTransitiveChildren()
	 * @model
	 * @generated
	 */
	int getNoTransitiveChildren();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoTransitiveChildren <em>No Transitive Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Transitive Children</em>' attribute.
	 * @see #getNoTransitiveChildren()
	 * @generated
	 */
	void setNoTransitiveChildren(int value);

	/**
	 * Returns the value of the '<em><b>No Transitive Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Transitive Parents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Transitive Parents</em>' attribute.
	 * @see #setNoTransitiveParents(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_NoTransitiveParents()
	 * @model
	 * @generated
	 */
	int getNoTransitiveParents();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoTransitiveParents <em>No Transitive Parents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Transitive Parents</em>' attribute.
	 * @see #getNoTransitiveParents()
	 * @generated
	 */
	void setNoTransitiveParents(int value);

	/**
	 * Returns the value of the '<em><b>No Overrides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Overrides</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Overrides</em>' attribute.
	 * @see #setNoOverrides(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_NoOverrides()
	 * @model
	 * @generated
	 */
	int getNoOverrides();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoOverrides <em>No Overrides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Overrides</em>' attribute.
	 * @see #getNoOverrides()
	 * @generated
	 */
	void setNoOverrides(int value);

	/**
	 * Returns the value of the '<em><b>Avg Child Complexity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Child Complexity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Child Complexity</em>' attribute.
	 * @see #setAvgChildComplexity(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgChildComplexity()
	 * @model
	 * @generated
	 */
	double getAvgChildComplexity();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgChildComplexity <em>Avg Child Complexity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Child Complexity</em>' attribute.
	 * @see #getAvgChildComplexity()
	 * @generated
	 */
	void setAvgChildComplexity(double value);

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see #setBalance(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_Balance()
	 * @model
	 * @generated
	 */
	double getBalance();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(double value);

	/**
	 * Returns the value of the '<em><b>Avg Var Binding Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Var Binding Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Var Binding Rate</em>' attribute.
	 * @see #setAvgVarBindingRate(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgVarBindingRate()
	 * @model
	 * @generated
	 */
	double getAvgVarBindingRate();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgVarBindingRate <em>Avg Var Binding Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Var Binding Rate</em>' attribute.
	 * @see #getAvgVarBindingRate()
	 * @generated
	 */
	void setAvgVarBindingRate(double value);

	/**
	 * Returns the value of the '<em><b>Avg Relation Dependency Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Relation Dependency Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Relation Dependency Depth</em>' attribute.
	 * @see #setAvgRelationDependencyDepth(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgRelationDependencyDepth()
	 * @model
	 * @generated
	 */
	double getAvgRelationDependencyDepth();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgRelationDependencyDepth <em>Avg Relation Dependency Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Relation Dependency Depth</em>' attribute.
	 * @see #getAvgRelationDependencyDepth()
	 * @generated
	 */
	void setAvgRelationDependencyDepth(double value);

	/**
	 * Returns the value of the '<em><b>Avg Type Overlap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Type Overlap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Type Overlap</em>' attribute.
	 * @see #setAvgTypeOverlap(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgTypeOverlap()
	 * @model
	 * @generated
	 */
	double getAvgTypeOverlap();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgTypeOverlap <em>Avg Type Overlap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Type Overlap</em>' attribute.
	 * @see #getAvgTypeOverlap()
	 * @generated
	 */
	void setAvgTypeOverlap(double value);

	/**
	 * Returns the value of the '<em><b>No Leaf Relations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Leaf Relations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Leaf Relations</em>' attribute.
	 * @see #setNoLeafRelations(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_NoLeafRelations()
	 * @model
	 * @generated
	 */
	int getNoLeafRelations();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoLeafRelations <em>No Leaf Relations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Leaf Relations</em>' attribute.
	 * @see #getNoLeafRelations()
	 * @generated
	 */
	void setNoLeafRelations(int value);

	/**
	 * Returns the value of the '<em><b>Avg Func Fan Out</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Func Fan Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Func Fan Out</em>' attribute.
	 * @see #setAvgFuncFanOut(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgFuncFanOut()
	 * @model default="0"
	 * @generated
	 */
	double getAvgFuncFanOut();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgFuncFanOut <em>Avg Func Fan Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Func Fan Out</em>' attribute.
	 * @see #getAvgFuncFanOut()
	 * @generated
	 */
	void setAvgFuncFanOut(double value);

	/**
	 * Returns the value of the '<em><b>Avg NWWPC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg NWWPC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg NWWPC</em>' attribute.
	 * @see #setAvgNWWPC(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgNWWPC()
	 * @model
	 * @generated
	 */
	double getAvgNWWPC();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgNWWPC <em>Avg NWWPC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg NWWPC</em>' attribute.
	 * @see #getAvgNWWPC()
	 * @generated
	 */
	void setAvgNWWPC(double value);

	/**
	 * Returns the value of the '<em><b>Avg NWWP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg NWWP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg NWWP</em>' attribute.
	 * @see #setAvgNWWP(double)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_AvgNWWP()
	 * @model
	 * @generated
	 */
	double getAvgNWWP();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgNWWP <em>Avg NWWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg NWWP</em>' attribute.
	 * @see #getAvgNWWP()
	 * @generated
	 */
	void setAvgNWWP(double value);

	/**
	 * Returns the value of the '<em><b>Loc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc</em>' attribute.
	 * @see #setLoc(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_Loc()
	 * @model
	 * @generated
	 */
	int getLoc();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getLoc <em>Loc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc</em>' attribute.
	 * @see #getLoc()
	 * @generated
	 */
	void setLoc(int value);

	/**
	 * Returns the value of the '<em><b>Sloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sloc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sloc</em>' attribute.
	 * @see #setSloc(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_Sloc()
	 * @model
	 * @generated
	 */
	int getSloc();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getSloc <em>Sloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sloc</em>' attribute.
	 * @see #getSloc()
	 * @generated
	 */
	void setSloc(int value);

	/**
	 * Returns the value of the '<em><b>Bloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bloc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloc</em>' attribute.
	 * @see #setBloc(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_Bloc()
	 * @model
	 * @generated
	 */
	int getBloc();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getBloc <em>Bloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bloc</em>' attribute.
	 * @see #getBloc()
	 * @generated
	 */
	void setBloc(int value);

	/**
	 * Returns the value of the '<em><b>Cloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloc</em>' attribute.
	 * @see #setCloc(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_Cloc()
	 * @model
	 * @generated
	 */
	int getCloc();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getCloc <em>Cloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloc</em>' attribute.
	 * @see #getCloc()
	 * @generated
	 */
	void setCloc(int value);

	/**
	 * Returns the value of the '<em><b>No Includes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Includes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Includes</em>' attribute.
	 * @see #setNoIncludes(int)
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#getTransformation_NoIncludes()
	 * @model
	 * @generated
	 */
	int getNoIncludes();

	/**
	 * Sets the value of the '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoIncludes <em>No Includes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Includes</em>' attribute.
	 * @see #getNoIncludes()
	 * @generated
	 */
	void setNoIncludes(int value);

} // Transformation
