/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QVTMetrics;

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
 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsFactory
 * @model kind="package"
 * @generated
 */
public interface QVTMetricsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "QVTMetrics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://m2m.upb.de/QVTMetrics/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QVTMetrics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QVTMetricsPackage eINSTANCE = de.upb.m2m.quality.model.QVTMetrics.impl.QVTMetricsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.model.QVTMetrics.impl.DomainPredicateCountImpl <em>Domain Predicate Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.model.QVTMetrics.impl.DomainPredicateCountImpl
	 * @see de.upb.m2m.quality.model.QVTMetrics.impl.QVTMetricsPackageImpl#getDomainPredicateCount()
	 * @generated
	 */
	int DOMAIN_PREDICATE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PREDICATE_COUNT__AVERAGE = 0;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PREDICATE_COUNT__MEAN = 1;

	/**
	 * The number of structural features of the '<em>Domain Predicate Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PREDICATE_COUNT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl
	 * @see de.upb.m2m.quality.model.QVTMetrics.impl.QVTMetricsPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__RELATIONS = 1;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__FUNCTIONS = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__CHILDREN = 3;

	/**
	 * The feature id for the '<em><b>No Starts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NO_STARTS = 4;

	/**
	 * The feature id for the '<em><b>No When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NO_WHEN = 5;

	/**
	 * The feature id for the '<em><b>No Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NO_WHERE = 6;

	/**
	 * The feature id for the '<em><b>No Relations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NO_RELATIONS = 7;

	/**
	 * The feature id for the '<em><b>No Top Level Relations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NO_TOP_LEVEL_RELATIONS = 8;

	/**
	 * The feature id for the '<em><b>No Metamodels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NO_METAMODELS = 9;

	/**
	 * The feature id for the '<em><b>No Ocl Queries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NO_OCL_QUERIES = 10;

	/**
	 * The feature id for the '<em><b>Avg When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_WHEN = 11;

	/**
	 * The feature id for the '<em><b>Avg Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_WHERE = 12;

	/**
	 * The feature id for the '<em><b>Avg Enforced Domains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_ENFORCED_DOMAINS = 13;

	/**
	 * The feature id for the '<em><b>Avg Checkonly Domains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_CHECKONLY_DOMAINS = 14;

	/**
	 * The feature id for the '<em><b>Avg Size Of Domain Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_SIZE_OF_DOMAIN_PATTERN = 15;

	/**
	 * The feature id for the '<em><b>Avg Domains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_DOMAINS = 16;

	/**
	 * The feature id for the '<em><b>Avg Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_VARS = 17;

	/**
	 * The feature id for the '<em><b>Avg Rel Fan Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_REL_FAN_OUT = 18;

	/**
	 * The feature id for the '<em><b>Avg Val Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_VAL_OUT = 19;

	/**
	 * The feature id for the '<em><b>Avg Fan In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_FAN_IN = 20;

	/**
	 * The feature id for the '<em><b>Extends metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__EXTENDS_METRIC = 21;

	/**
	 * The feature id for the '<em><b>No Direct Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NO_DIRECT_CHILDREN = 22;

	/**
	 * The feature id for the '<em><b>No Transitive Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NO_TRANSITIVE_CHILDREN = 23;

	/**
	 * The feature id for the '<em><b>No Transitive Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NO_TRANSITIVE_PARENTS = 24;

	/**
	 * The feature id for the '<em><b>No Overrides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NO_OVERRIDES = 25;

	/**
	 * The feature id for the '<em><b>Avg Child Complexity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_CHILD_COMPLEXITY = 26;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__BALANCE = 27;

	/**
	 * The feature id for the '<em><b>Avg Var Binding Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_VAR_BINDING_RATE = 28;

	/**
	 * The feature id for the '<em><b>Avg Relation Dependency Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_RELATION_DEPENDENCY_DEPTH = 29;

	/**
	 * The feature id for the '<em><b>Avg Type Overlap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_TYPE_OVERLAP = 30;

	/**
	 * The feature id for the '<em><b>No Leaf Relations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NO_LEAF_RELATIONS = 31;

	/**
	 * The feature id for the '<em><b>Avg Func Fan Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_FUNC_FAN_OUT = 32;

	/**
	 * The feature id for the '<em><b>Avg NWWPC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_NWWPC = 33;

	/**
	 * The feature id for the '<em><b>Avg NWWP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__AVG_NWWP = 34;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__LOC = 35;

	/**
	 * The feature id for the '<em><b>Sloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__SLOC = 36;

	/**
	 * The feature id for the '<em><b>Bloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__BLOC = 37;

	/**
	 * The feature id for the '<em><b>Cloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__CLOC = 38;

	/**
	 * The feature id for the '<em><b>No Includes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NO_INCLUDES = 39;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 40;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl
	 * @see de.upb.m2m.quality.model.QVTMetrics.impl.QVTMetricsPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 2;

	/**
	 * The feature id for the '<em><b>Domain Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__DOMAIN_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>No Checkonly Domains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NO_CHECKONLY_DOMAINS = 2;

	/**
	 * The feature id for the '<em><b>No Enforced Domains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NO_ENFORCED_DOMAINS = 3;

	/**
	 * The feature id for the '<em><b>No When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NO_WHEN = 4;

	/**
	 * The feature id for the '<em><b>No Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NO_WHERE = 5;

	/**
	 * The feature id for the '<em><b>No Domains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NO_DOMAINS = 6;

	/**
	 * The feature id for the '<em><b>No Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NO_VARS = 7;

	/**
	 * The feature id for the '<em><b>Val Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__VAL_OUT = 8;

	/**
	 * The feature id for the '<em><b>Fan Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__FAN_OUT = 9;

	/**
	 * The feature id for the '<em><b>Fan In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__FAN_IN = 10;

	/**
	 * The feature id for the '<em><b>No Bound Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NO_BOUND_VARS = 11;

	/**
	 * The feature id for the '<em><b>No Unbound Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NO_UNBOUND_VARS = 12;

	/**
	 * The feature id for the '<em><b>Var Binding Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__VAR_BINDING_RATE = 13;

	/**
	 * The feature id for the '<em><b>Avg Size Of Domain Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__AVG_SIZE_OF_DOMAIN_PATTERN = 14;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__IS_LEAF = 15;

	/**
	 * The feature id for the '<em><b>Depth Of Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__DEPTH_OF_LEAF = 16;

	/**
	 * The feature id for the '<em><b>Nwwp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NWWP = 17;

	/**
	 * The feature id for the '<em><b>Nwwpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NWWPC = 18;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.model.QVTMetrics.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.model.QVTMetrics.impl.FunctionImpl
	 * @see de.upb.m2m.quality.model.QVTMetrics.impl.QVTMetricsPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fan Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FAN_OUT = 1;

	/**
	 * The feature id for the '<em><b>Fan In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FAN_IN = 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.model.QVTMetrics.impl.DomainPredicateImpl <em>Domain Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.model.QVTMetrics.impl.DomainPredicateImpl
	 * @see de.upb.m2m.quality.model.QVTMetrics.impl.QVTMetricsPackageImpl#getDomainPredicate()
	 * @generated
	 */
	int DOMAIN_PREDICATE = 4;

	/**
	 * The number of structural features of the '<em>Domain Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PREDICATE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.model.QVTMetrics.impl.DomainPatternImpl <em>Domain Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.model.QVTMetrics.impl.DomainPatternImpl
	 * @see de.upb.m2m.quality.model.QVTMetrics.impl.QVTMetricsPackageImpl#getDomainPattern()
	 * @generated
	 */
	int DOMAIN_PATTERN = 5;

	/**
	 * The feature id for the '<em><b>Domain Predicate Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN__DOMAIN_PREDICATE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Size Of Domain Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN__SIZE_OF_DOMAIN_PATTERN = 1;

	/**
	 * The number of structural features of the '<em>Domain Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.model.QVTMetrics.DomainPredicateCount <em>Domain Predicate Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Predicate Count</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.DomainPredicateCount
	 * @generated
	 */
	EClass getDomainPredicateCount();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.DomainPredicateCount#getAverage <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.DomainPredicateCount#getAverage()
	 * @see #getDomainPredicateCount()
	 * @generated
	 */
	EAttribute getDomainPredicateCount_Average();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.DomainPredicateCount#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.DomainPredicateCount#getMean()
	 * @see #getDomainPredicateCount()
	 * @generated
	 */
	EAttribute getDomainPredicateCount_Mean();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getName()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getRelations()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Relations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getFunctions()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Functions();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getChildren()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Children();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoStarts <em>No Starts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Starts</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoStarts()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_NoStarts();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoWhen <em>No When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No When</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoWhen()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_NoWhen();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoWhere <em>No Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Where</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoWhere()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_NoWhere();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoRelations <em>No Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Relations</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoRelations()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_NoRelations();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoTopLevelRelations <em>No Top Level Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Top Level Relations</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoTopLevelRelations()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_NoTopLevelRelations();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoMetamodels <em>No Metamodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Metamodels</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoMetamodels()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_NoMetamodels();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoOclQueries <em>No Ocl Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Ocl Queries</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoOclQueries()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_NoOclQueries();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgWhen <em>Avg When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg When</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgWhen()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgWhen();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgWhere <em>Avg Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Where</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgWhere()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgWhere();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgEnforcedDomains <em>Avg Enforced Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Enforced Domains</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgEnforcedDomains()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgEnforcedDomains();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgCheckonlyDomains <em>Avg Checkonly Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Checkonly Domains</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgCheckonlyDomains()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgCheckonlyDomains();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgSizeOfDomainPattern <em>Avg Size Of Domain Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Size Of Domain Pattern</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgSizeOfDomainPattern()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgSizeOfDomainPattern();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgDomains <em>Avg Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Domains</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgDomains()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgDomains();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgVars <em>Avg Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Vars</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgVars()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgVars();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgRelFanOut <em>Avg Rel Fan Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Rel Fan Out</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgRelFanOut()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgRelFanOut();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgValOut <em>Avg Val Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Val Out</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgValOut()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgValOut();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgFanIn <em>Avg Fan In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Fan In</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgFanIn()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgFanIn();

	/**
	 * Returns the meta object for the reference '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getExtends_metric <em>Extends metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends metric</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getExtends_metric()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Extends_metric();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoDirectChildren <em>No Direct Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Direct Children</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoDirectChildren()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_NoDirectChildren();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoTransitiveChildren <em>No Transitive Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Transitive Children</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoTransitiveChildren()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_NoTransitiveChildren();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoTransitiveParents <em>No Transitive Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Transitive Parents</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoTransitiveParents()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_NoTransitiveParents();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoOverrides <em>No Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Overrides</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoOverrides()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_NoOverrides();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgChildComplexity <em>Avg Child Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Child Complexity</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgChildComplexity()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgChildComplexity();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getBalance()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Balance();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgVarBindingRate <em>Avg Var Binding Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Var Binding Rate</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgVarBindingRate()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgVarBindingRate();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgRelationDependencyDepth <em>Avg Relation Dependency Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Relation Dependency Depth</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgRelationDependencyDepth()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgRelationDependencyDepth();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgTypeOverlap <em>Avg Type Overlap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Type Overlap</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgTypeOverlap()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgTypeOverlap();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoLeafRelations <em>No Leaf Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Leaf Relations</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoLeafRelations()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_NoLeafRelations();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgFuncFanOut <em>Avg Func Fan Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Func Fan Out</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgFuncFanOut()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgFuncFanOut();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgNWWPC <em>Avg NWWPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg NWWPC</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgNWWPC()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgNWWPC();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgNWWP <em>Avg NWWP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg NWWP</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getAvgNWWP()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_AvgNWWP();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getLoc <em>Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getLoc()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Loc();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getSloc <em>Sloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sloc</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getSloc()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Sloc();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getBloc <em>Bloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bloc</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getBloc()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Bloc();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getCloc <em>Cloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloc</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getCloc()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Cloc();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoIncludes <em>No Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Includes</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Transformation#getNoIncludes()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_NoIncludes();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.model.QVTMetrics.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getDomainPattern <em>Domain Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Pattern</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getDomainPattern()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_DomainPattern();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoCheckonlyDomains <em>No Checkonly Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Checkonly Domains</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getNoCheckonlyDomains()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_NoCheckonlyDomains();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoEnforcedDomains <em>No Enforced Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Enforced Domains</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getNoEnforcedDomains()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_NoEnforcedDomains();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoWhen <em>No When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No When</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getNoWhen()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_NoWhen();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoWhere <em>No Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Where</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getNoWhere()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_NoWhere();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoDomains <em>No Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Domains</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getNoDomains()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_NoDomains();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoVars <em>No Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Vars</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getNoVars()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_NoVars();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getValOut <em>Val Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val Out</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getValOut()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_ValOut();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getFanOut <em>Fan Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fan Out</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getFanOut()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_FanOut();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getFanIn <em>Fan In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fan In</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getFanIn()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_FanIn();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoBoundVars <em>No Bound Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Bound Vars</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getNoBoundVars()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_NoBoundVars();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNoUnboundVars <em>No Unbound Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Unbound Vars</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getNoUnboundVars()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_NoUnboundVars();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getVarBindingRate <em>Var Binding Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Binding Rate</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getVarBindingRate()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_VarBindingRate();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getAvgSizeOfDomainPattern <em>Avg Size Of Domain Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Size Of Domain Pattern</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getAvgSizeOfDomainPattern()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_AvgSizeOfDomainPattern();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#isIsLeaf <em>Is Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leaf</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#isIsLeaf()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_IsLeaf();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getDepthOfLeaf <em>Depth Of Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth Of Leaf</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getDepthOfLeaf()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_DepthOfLeaf();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNwwp <em>Nwwp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nwwp</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getNwwp()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Nwwp();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Relation#getNwwpc <em>Nwwpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nwwpc</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Relation#getNwwpc()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Nwwpc();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.model.QVTMetrics.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Function#getFanOut <em>Fan Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fan Out</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Function#getFanOut()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_FanOut();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.Function#getFanIn <em>Fan In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fan In</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.Function#getFanIn()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_FanIn();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.model.QVTMetrics.DomainPredicate <em>Domain Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Predicate</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.DomainPredicate
	 * @generated
	 */
	EClass getDomainPredicate();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.model.QVTMetrics.DomainPattern <em>Domain Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Pattern</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.DomainPattern
	 * @generated
	 */
	EClass getDomainPattern();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.m2m.quality.model.QVTMetrics.DomainPattern#getDomainPredicateCount <em>Domain Predicate Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Predicate Count</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.DomainPattern#getDomainPredicateCount()
	 * @see #getDomainPattern()
	 * @generated
	 */
	EReference getDomainPattern_DomainPredicateCount();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.model.QVTMetrics.DomainPattern#getSizeOfDomainPattern <em>Size Of Domain Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Of Domain Pattern</em>'.
	 * @see de.upb.m2m.quality.model.QVTMetrics.DomainPattern#getSizeOfDomainPattern()
	 * @see #getDomainPattern()
	 * @generated
	 */
	EAttribute getDomainPattern_SizeOfDomainPattern();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QVTMetricsFactory getQVTMetricsFactory();

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
		 * The meta object literal for the '{@link de.upb.m2m.quality.model.QVTMetrics.impl.DomainPredicateCountImpl <em>Domain Predicate Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.model.QVTMetrics.impl.DomainPredicateCountImpl
		 * @see de.upb.m2m.quality.model.QVTMetrics.impl.QVTMetricsPackageImpl#getDomainPredicateCount()
		 * @generated
		 */
		EClass DOMAIN_PREDICATE_COUNT = eINSTANCE.getDomainPredicateCount();

		/**
		 * The meta object literal for the '<em><b>Average</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_PREDICATE_COUNT__AVERAGE = eINSTANCE.getDomainPredicateCount_Average();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_PREDICATE_COUNT__MEAN = eINSTANCE.getDomainPredicateCount_Mean();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl
		 * @see de.upb.m2m.quality.model.QVTMetrics.impl.QVTMetricsPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NAME = eINSTANCE.getTransformation_Name();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__RELATIONS = eINSTANCE.getTransformation_Relations();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__FUNCTIONS = eINSTANCE.getTransformation_Functions();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__CHILDREN = eINSTANCE.getTransformation_Children();

		/**
		 * The meta object literal for the '<em><b>No Starts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NO_STARTS = eINSTANCE.getTransformation_NoStarts();

		/**
		 * The meta object literal for the '<em><b>No When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NO_WHEN = eINSTANCE.getTransformation_NoWhen();

		/**
		 * The meta object literal for the '<em><b>No Where</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NO_WHERE = eINSTANCE.getTransformation_NoWhere();

		/**
		 * The meta object literal for the '<em><b>No Relations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NO_RELATIONS = eINSTANCE.getTransformation_NoRelations();

		/**
		 * The meta object literal for the '<em><b>No Top Level Relations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NO_TOP_LEVEL_RELATIONS = eINSTANCE.getTransformation_NoTopLevelRelations();

		/**
		 * The meta object literal for the '<em><b>No Metamodels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NO_METAMODELS = eINSTANCE.getTransformation_NoMetamodels();

		/**
		 * The meta object literal for the '<em><b>No Ocl Queries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NO_OCL_QUERIES = eINSTANCE.getTransformation_NoOclQueries();

		/**
		 * The meta object literal for the '<em><b>Avg When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_WHEN = eINSTANCE.getTransformation_AvgWhen();

		/**
		 * The meta object literal for the '<em><b>Avg Where</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_WHERE = eINSTANCE.getTransformation_AvgWhere();

		/**
		 * The meta object literal for the '<em><b>Avg Enforced Domains</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_ENFORCED_DOMAINS = eINSTANCE.getTransformation_AvgEnforcedDomains();

		/**
		 * The meta object literal for the '<em><b>Avg Checkonly Domains</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_CHECKONLY_DOMAINS = eINSTANCE.getTransformation_AvgCheckonlyDomains();

		/**
		 * The meta object literal for the '<em><b>Avg Size Of Domain Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_SIZE_OF_DOMAIN_PATTERN = eINSTANCE.getTransformation_AvgSizeOfDomainPattern();

		/**
		 * The meta object literal for the '<em><b>Avg Domains</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_DOMAINS = eINSTANCE.getTransformation_AvgDomains();

		/**
		 * The meta object literal for the '<em><b>Avg Vars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_VARS = eINSTANCE.getTransformation_AvgVars();

		/**
		 * The meta object literal for the '<em><b>Avg Rel Fan Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_REL_FAN_OUT = eINSTANCE.getTransformation_AvgRelFanOut();

		/**
		 * The meta object literal for the '<em><b>Avg Val Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_VAL_OUT = eINSTANCE.getTransformation_AvgValOut();

		/**
		 * The meta object literal for the '<em><b>Avg Fan In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_FAN_IN = eINSTANCE.getTransformation_AvgFanIn();

		/**
		 * The meta object literal for the '<em><b>Extends metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__EXTENDS_METRIC = eINSTANCE.getTransformation_Extends_metric();

		/**
		 * The meta object literal for the '<em><b>No Direct Children</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NO_DIRECT_CHILDREN = eINSTANCE.getTransformation_NoDirectChildren();

		/**
		 * The meta object literal for the '<em><b>No Transitive Children</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NO_TRANSITIVE_CHILDREN = eINSTANCE.getTransformation_NoTransitiveChildren();

		/**
		 * The meta object literal for the '<em><b>No Transitive Parents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NO_TRANSITIVE_PARENTS = eINSTANCE.getTransformation_NoTransitiveParents();

		/**
		 * The meta object literal for the '<em><b>No Overrides</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NO_OVERRIDES = eINSTANCE.getTransformation_NoOverrides();

		/**
		 * The meta object literal for the '<em><b>Avg Child Complexity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_CHILD_COMPLEXITY = eINSTANCE.getTransformation_AvgChildComplexity();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__BALANCE = eINSTANCE.getTransformation_Balance();

		/**
		 * The meta object literal for the '<em><b>Avg Var Binding Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_VAR_BINDING_RATE = eINSTANCE.getTransformation_AvgVarBindingRate();

		/**
		 * The meta object literal for the '<em><b>Avg Relation Dependency Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_RELATION_DEPENDENCY_DEPTH = eINSTANCE.getTransformation_AvgRelationDependencyDepth();

		/**
		 * The meta object literal for the '<em><b>Avg Type Overlap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_TYPE_OVERLAP = eINSTANCE.getTransformation_AvgTypeOverlap();

		/**
		 * The meta object literal for the '<em><b>No Leaf Relations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NO_LEAF_RELATIONS = eINSTANCE.getTransformation_NoLeafRelations();

		/**
		 * The meta object literal for the '<em><b>Avg Func Fan Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_FUNC_FAN_OUT = eINSTANCE.getTransformation_AvgFuncFanOut();

		/**
		 * The meta object literal for the '<em><b>Avg NWWPC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_NWWPC = eINSTANCE.getTransformation_AvgNWWPC();

		/**
		 * The meta object literal for the '<em><b>Avg NWWP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__AVG_NWWP = eINSTANCE.getTransformation_AvgNWWP();

		/**
		 * The meta object literal for the '<em><b>Loc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__LOC = eINSTANCE.getTransformation_Loc();

		/**
		 * The meta object literal for the '<em><b>Sloc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__SLOC = eINSTANCE.getTransformation_Sloc();

		/**
		 * The meta object literal for the '<em><b>Bloc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__BLOC = eINSTANCE.getTransformation_Bloc();

		/**
		 * The meta object literal for the '<em><b>Cloc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__CLOC = eINSTANCE.getTransformation_Cloc();

		/**
		 * The meta object literal for the '<em><b>No Includes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NO_INCLUDES = eINSTANCE.getTransformation_NoIncludes();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl
		 * @see de.upb.m2m.quality.model.QVTMetrics.impl.QVTMetricsPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Domain Pattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__DOMAIN_PATTERN = eINSTANCE.getRelation_DomainPattern();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

		/**
		 * The meta object literal for the '<em><b>No Checkonly Domains</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NO_CHECKONLY_DOMAINS = eINSTANCE.getRelation_NoCheckonlyDomains();

		/**
		 * The meta object literal for the '<em><b>No Enforced Domains</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NO_ENFORCED_DOMAINS = eINSTANCE.getRelation_NoEnforcedDomains();

		/**
		 * The meta object literal for the '<em><b>No When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NO_WHEN = eINSTANCE.getRelation_NoWhen();

		/**
		 * The meta object literal for the '<em><b>No Where</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NO_WHERE = eINSTANCE.getRelation_NoWhere();

		/**
		 * The meta object literal for the '<em><b>No Domains</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NO_DOMAINS = eINSTANCE.getRelation_NoDomains();

		/**
		 * The meta object literal for the '<em><b>No Vars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NO_VARS = eINSTANCE.getRelation_NoVars();

		/**
		 * The meta object literal for the '<em><b>Val Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__VAL_OUT = eINSTANCE.getRelation_ValOut();

		/**
		 * The meta object literal for the '<em><b>Fan Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__FAN_OUT = eINSTANCE.getRelation_FanOut();

		/**
		 * The meta object literal for the '<em><b>Fan In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__FAN_IN = eINSTANCE.getRelation_FanIn();

		/**
		 * The meta object literal for the '<em><b>No Bound Vars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NO_BOUND_VARS = eINSTANCE.getRelation_NoBoundVars();

		/**
		 * The meta object literal for the '<em><b>No Unbound Vars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NO_UNBOUND_VARS = eINSTANCE.getRelation_NoUnboundVars();

		/**
		 * The meta object literal for the '<em><b>Var Binding Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__VAR_BINDING_RATE = eINSTANCE.getRelation_VarBindingRate();

		/**
		 * The meta object literal for the '<em><b>Avg Size Of Domain Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__AVG_SIZE_OF_DOMAIN_PATTERN = eINSTANCE.getRelation_AvgSizeOfDomainPattern();

		/**
		 * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__IS_LEAF = eINSTANCE.getRelation_IsLeaf();

		/**
		 * The meta object literal for the '<em><b>Depth Of Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__DEPTH_OF_LEAF = eINSTANCE.getRelation_DepthOfLeaf();

		/**
		 * The meta object literal for the '<em><b>Nwwp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NWWP = eINSTANCE.getRelation_Nwwp();

		/**
		 * The meta object literal for the '<em><b>Nwwpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NWWPC = eINSTANCE.getRelation_Nwwpc();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.model.QVTMetrics.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.model.QVTMetrics.impl.FunctionImpl
		 * @see de.upb.m2m.quality.model.QVTMetrics.impl.QVTMetricsPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Fan Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__FAN_OUT = eINSTANCE.getFunction_FanOut();

		/**
		 * The meta object literal for the '<em><b>Fan In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__FAN_IN = eINSTANCE.getFunction_FanIn();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.model.QVTMetrics.impl.DomainPredicateImpl <em>Domain Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.model.QVTMetrics.impl.DomainPredicateImpl
		 * @see de.upb.m2m.quality.model.QVTMetrics.impl.QVTMetricsPackageImpl#getDomainPredicate()
		 * @generated
		 */
		EClass DOMAIN_PREDICATE = eINSTANCE.getDomainPredicate();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.model.QVTMetrics.impl.DomainPatternImpl <em>Domain Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.model.QVTMetrics.impl.DomainPatternImpl
		 * @see de.upb.m2m.quality.model.QVTMetrics.impl.QVTMetricsPackageImpl#getDomainPattern()
		 * @generated
		 */
		EClass DOMAIN_PATTERN = eINSTANCE.getDomainPattern();

		/**
		 * The meta object literal for the '<em><b>Domain Predicate Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_PATTERN__DOMAIN_PREDICATE_COUNT = eINSTANCE.getDomainPattern_DomainPredicateCount();

		/**
		 * The meta object literal for the '<em><b>Size Of Domain Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_PATTERN__SIZE_OF_DOMAIN_PATTERN = eINSTANCE.getDomainPattern_SizeOfDomainPattern();

	}

} //QVTMetricsPackage
