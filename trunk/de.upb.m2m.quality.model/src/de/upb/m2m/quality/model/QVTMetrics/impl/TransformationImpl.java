/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QVTMetrics.impl;

import de.upb.m2m.quality.model.QVTMetrics.Function;
import de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage;
import de.upb.m2m.quality.model.QVTMetrics.Relation;
import de.upb.m2m.quality.model.QVTMetrics.Transformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getNoStarts <em>No Starts</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getNoWhen <em>No When</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getNoWhere <em>No Where</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getNoRelations <em>No Relations</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getNoTopLevelRelations <em>No Top Level Relations</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getNoMetamodels <em>No Metamodels</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getNoOclQueries <em>No Ocl Queries</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgWhen <em>Avg When</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgWhere <em>Avg Where</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgEnforcedDomains <em>Avg Enforced Domains</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgCheckonlyDomains <em>Avg Checkonly Domains</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgSizeOfDomainPattern <em>Avg Size Of Domain Pattern</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgDomains <em>Avg Domains</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgVars <em>Avg Vars</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgRelFanOut <em>Avg Rel Fan Out</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgValOut <em>Avg Val Out</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgFanIn <em>Avg Fan In</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getExtends_metric <em>Extends metric</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getNoDirectChildren <em>No Direct Children</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getNoTransitiveChildren <em>No Transitive Children</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getNoTransitiveParents <em>No Transitive Parents</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getNoOverrides <em>No Overrides</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgChildComplexity <em>Avg Child Complexity</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgVarBindingRate <em>Avg Var Binding Rate</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgRelationDependencyDepth <em>Avg Relation Dependency Depth</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgTypeOverlap <em>Avg Type Overlap</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getNoLeafRelations <em>No Leaf Relations</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgFuncFanOut <em>Avg Func Fan Out</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgNWWPC <em>Avg NWWPC</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getAvgNWWP <em>Avg NWWP</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getLoc <em>Loc</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getSloc <em>Sloc</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getBloc <em>Bloc</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getCloc <em>Cloc</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.TransformationImpl#getNoIncludes <em>No Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationImpl extends EObjectImpl implements Transformation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> functions;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> children;

	/**
	 * The default value of the '{@link #getNoStarts() <em>No Starts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoStarts()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_STARTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoStarts() <em>No Starts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoStarts()
	 * @generated
	 * @ordered
	 */
	protected int noStarts = NO_STARTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoWhen() <em>No When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoWhen()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_WHEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoWhen() <em>No When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoWhen()
	 * @generated
	 * @ordered
	 */
	protected int noWhen = NO_WHEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoWhere() <em>No Where</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoWhere()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_WHERE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoWhere() <em>No Where</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoWhere()
	 * @generated
	 * @ordered
	 */
	protected int noWhere = NO_WHERE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoRelations() <em>No Relations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoRelations()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_RELATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoRelations() <em>No Relations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoRelations()
	 * @generated
	 * @ordered
	 */
	protected int noRelations = NO_RELATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoTopLevelRelations() <em>No Top Level Relations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoTopLevelRelations()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_TOP_LEVEL_RELATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoTopLevelRelations() <em>No Top Level Relations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoTopLevelRelations()
	 * @generated
	 * @ordered
	 */
	protected int noTopLevelRelations = NO_TOP_LEVEL_RELATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoMetamodels() <em>No Metamodels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoMetamodels()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_METAMODELS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoMetamodels() <em>No Metamodels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoMetamodels()
	 * @generated
	 * @ordered
	 */
	protected int noMetamodels = NO_METAMODELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoOclQueries() <em>No Ocl Queries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoOclQueries()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_OCL_QUERIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoOclQueries() <em>No Ocl Queries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoOclQueries()
	 * @generated
	 * @ordered
	 */
	protected int noOclQueries = NO_OCL_QUERIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgWhen() <em>Avg When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgWhen()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_WHEN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgWhen() <em>Avg When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgWhen()
	 * @generated
	 * @ordered
	 */
	protected double avgWhen = AVG_WHEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgWhere() <em>Avg Where</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgWhere()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_WHERE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgWhere() <em>Avg Where</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgWhere()
	 * @generated
	 * @ordered
	 */
	protected double avgWhere = AVG_WHERE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgEnforcedDomains() <em>Avg Enforced Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgEnforcedDomains()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_ENFORCED_DOMAINS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgEnforcedDomains() <em>Avg Enforced Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgEnforcedDomains()
	 * @generated
	 * @ordered
	 */
	protected double avgEnforcedDomains = AVG_ENFORCED_DOMAINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgCheckonlyDomains() <em>Avg Checkonly Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgCheckonlyDomains()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_CHECKONLY_DOMAINS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgCheckonlyDomains() <em>Avg Checkonly Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgCheckonlyDomains()
	 * @generated
	 * @ordered
	 */
	protected double avgCheckonlyDomains = AVG_CHECKONLY_DOMAINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgSizeOfDomainPattern() <em>Avg Size Of Domain Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgSizeOfDomainPattern()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_SIZE_OF_DOMAIN_PATTERN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgSizeOfDomainPattern() <em>Avg Size Of Domain Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgSizeOfDomainPattern()
	 * @generated
	 * @ordered
	 */
	protected double avgSizeOfDomainPattern = AVG_SIZE_OF_DOMAIN_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgDomains() <em>Avg Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgDomains()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_DOMAINS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgDomains() <em>Avg Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgDomains()
	 * @generated
	 * @ordered
	 */
	protected double avgDomains = AVG_DOMAINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgVars() <em>Avg Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgVars()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_VARS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgVars() <em>Avg Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgVars()
	 * @generated
	 * @ordered
	 */
	protected double avgVars = AVG_VARS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgRelFanOut() <em>Avg Rel Fan Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgRelFanOut()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_REL_FAN_OUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgRelFanOut() <em>Avg Rel Fan Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgRelFanOut()
	 * @generated
	 * @ordered
	 */
	protected double avgRelFanOut = AVG_REL_FAN_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgValOut() <em>Avg Val Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgValOut()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_VAL_OUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgValOut() <em>Avg Val Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgValOut()
	 * @generated
	 * @ordered
	 */
	protected double avgValOut = AVG_VAL_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgFanIn() <em>Avg Fan In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgFanIn()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_FAN_IN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgFanIn() <em>Avg Fan In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgFanIn()
	 * @generated
	 * @ordered
	 */
	protected double avgFanIn = AVG_FAN_IN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtends_metric() <em>Extends metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends_metric()
	 * @generated
	 * @ordered
	 */
	protected Transformation extends_metric;

	/**
	 * The default value of the '{@link #getNoDirectChildren() <em>No Direct Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoDirectChildren()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_DIRECT_CHILDREN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoDirectChildren() <em>No Direct Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoDirectChildren()
	 * @generated
	 * @ordered
	 */
	protected int noDirectChildren = NO_DIRECT_CHILDREN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoTransitiveChildren() <em>No Transitive Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoTransitiveChildren()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_TRANSITIVE_CHILDREN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoTransitiveChildren() <em>No Transitive Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoTransitiveChildren()
	 * @generated
	 * @ordered
	 */
	protected int noTransitiveChildren = NO_TRANSITIVE_CHILDREN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoTransitiveParents() <em>No Transitive Parents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoTransitiveParents()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_TRANSITIVE_PARENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoTransitiveParents() <em>No Transitive Parents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoTransitiveParents()
	 * @generated
	 * @ordered
	 */
	protected int noTransitiveParents = NO_TRANSITIVE_PARENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoOverrides() <em>No Overrides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoOverrides()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_OVERRIDES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoOverrides() <em>No Overrides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoOverrides()
	 * @generated
	 * @ordered
	 */
	protected int noOverrides = NO_OVERRIDES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgChildComplexity() <em>Avg Child Complexity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgChildComplexity()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_CHILD_COMPLEXITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgChildComplexity() <em>Avg Child Complexity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgChildComplexity()
	 * @generated
	 * @ordered
	 */
	protected double avgChildComplexity = AVG_CHILD_COMPLEXITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected static final double BALANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected double balance = BALANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgVarBindingRate() <em>Avg Var Binding Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgVarBindingRate()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_VAR_BINDING_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgVarBindingRate() <em>Avg Var Binding Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgVarBindingRate()
	 * @generated
	 * @ordered
	 */
	protected double avgVarBindingRate = AVG_VAR_BINDING_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgRelationDependencyDepth() <em>Avg Relation Dependency Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgRelationDependencyDepth()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_RELATION_DEPENDENCY_DEPTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgRelationDependencyDepth() <em>Avg Relation Dependency Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgRelationDependencyDepth()
	 * @generated
	 * @ordered
	 */
	protected double avgRelationDependencyDepth = AVG_RELATION_DEPENDENCY_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgTypeOverlap() <em>Avg Type Overlap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgTypeOverlap()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_TYPE_OVERLAP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgTypeOverlap() <em>Avg Type Overlap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgTypeOverlap()
	 * @generated
	 * @ordered
	 */
	protected double avgTypeOverlap = AVG_TYPE_OVERLAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoLeafRelations() <em>No Leaf Relations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoLeafRelations()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_LEAF_RELATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoLeafRelations() <em>No Leaf Relations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoLeafRelations()
	 * @generated
	 * @ordered
	 */
	protected int noLeafRelations = NO_LEAF_RELATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgFuncFanOut() <em>Avg Func Fan Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgFuncFanOut()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_FUNC_FAN_OUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgFuncFanOut() <em>Avg Func Fan Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgFuncFanOut()
	 * @generated
	 * @ordered
	 */
	protected double avgFuncFanOut = AVG_FUNC_FAN_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgNWWPC() <em>Avg NWWPC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgNWWPC()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_NWWPC_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgNWWPC() <em>Avg NWWPC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgNWWPC()
	 * @generated
	 * @ordered
	 */
	protected double avgNWWPC = AVG_NWWPC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgNWWP() <em>Avg NWWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgNWWP()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_NWWP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvgNWWP() <em>Avg NWWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgNWWP()
	 * @generated
	 * @ordered
	 */
	protected double avgNWWP = AVG_NWWP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoc() <em>Loc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoc()
	 * @generated
	 * @ordered
	 */
	protected static final int LOC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoc() <em>Loc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoc()
	 * @generated
	 * @ordered
	 */
	protected int loc = LOC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSloc() <em>Sloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSloc()
	 * @generated
	 * @ordered
	 */
	protected static final int SLOC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSloc() <em>Sloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSloc()
	 * @generated
	 * @ordered
	 */
	protected int sloc = SLOC_EDEFAULT;

	/**
	 * The default value of the '{@link #getBloc() <em>Bloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloc()
	 * @generated
	 * @ordered
	 */
	protected static final int BLOC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBloc() <em>Bloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloc()
	 * @generated
	 * @ordered
	 */
	protected int bloc = BLOC_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloc() <em>Cloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloc()
	 * @generated
	 * @ordered
	 */
	protected static final int CLOC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCloc() <em>Cloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloc()
	 * @generated
	 * @ordered
	 */
	protected int cloc = CLOC_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoIncludes() <em>No Includes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoIncludes()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_INCLUDES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoIncludes() <em>No Includes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoIncludes()
	 * @generated
	 * @ordered
	 */
	protected int noIncludes = NO_INCLUDES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTMetricsPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, QVTMetricsPackage.TRANSFORMATION__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<Function>(Function.class, this, QVTMetricsPackage.TRANSFORMATION__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<Transformation>(Transformation.class, this, QVTMetricsPackage.TRANSFORMATION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoStarts() {
		return noStarts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoStarts(int newNoStarts) {
		int oldNoStarts = noStarts;
		noStarts = newNoStarts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__NO_STARTS, oldNoStarts, noStarts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoWhen() {
		return noWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoWhen(int newNoWhen) {
		int oldNoWhen = noWhen;
		noWhen = newNoWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__NO_WHEN, oldNoWhen, noWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoWhere() {
		return noWhere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoWhere(int newNoWhere) {
		int oldNoWhere = noWhere;
		noWhere = newNoWhere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__NO_WHERE, oldNoWhere, noWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoRelations() {
		return noRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoRelations(int newNoRelations) {
		int oldNoRelations = noRelations;
		noRelations = newNoRelations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__NO_RELATIONS, oldNoRelations, noRelations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoTopLevelRelations() {
		return noTopLevelRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoTopLevelRelations(int newNoTopLevelRelations) {
		int oldNoTopLevelRelations = noTopLevelRelations;
		noTopLevelRelations = newNoTopLevelRelations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__NO_TOP_LEVEL_RELATIONS, oldNoTopLevelRelations, noTopLevelRelations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoMetamodels() {
		return noMetamodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoMetamodels(int newNoMetamodels) {
		int oldNoMetamodels = noMetamodels;
		noMetamodels = newNoMetamodels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__NO_METAMODELS, oldNoMetamodels, noMetamodels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoOclQueries() {
		return noOclQueries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoOclQueries(int newNoOclQueries) {
		int oldNoOclQueries = noOclQueries;
		noOclQueries = newNoOclQueries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__NO_OCL_QUERIES, oldNoOclQueries, noOclQueries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgWhen() {
		return avgWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgWhen(double newAvgWhen) {
		double oldAvgWhen = avgWhen;
		avgWhen = newAvgWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_WHEN, oldAvgWhen, avgWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgWhere() {
		return avgWhere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgWhere(double newAvgWhere) {
		double oldAvgWhere = avgWhere;
		avgWhere = newAvgWhere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_WHERE, oldAvgWhere, avgWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgEnforcedDomains() {
		return avgEnforcedDomains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgEnforcedDomains(double newAvgEnforcedDomains) {
		double oldAvgEnforcedDomains = avgEnforcedDomains;
		avgEnforcedDomains = newAvgEnforcedDomains;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_ENFORCED_DOMAINS, oldAvgEnforcedDomains, avgEnforcedDomains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgCheckonlyDomains() {
		return avgCheckonlyDomains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgCheckonlyDomains(double newAvgCheckonlyDomains) {
		double oldAvgCheckonlyDomains = avgCheckonlyDomains;
		avgCheckonlyDomains = newAvgCheckonlyDomains;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_CHECKONLY_DOMAINS, oldAvgCheckonlyDomains, avgCheckonlyDomains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgSizeOfDomainPattern() {
		return avgSizeOfDomainPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgSizeOfDomainPattern(double newAvgSizeOfDomainPattern) {
		double oldAvgSizeOfDomainPattern = avgSizeOfDomainPattern;
		avgSizeOfDomainPattern = newAvgSizeOfDomainPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_SIZE_OF_DOMAIN_PATTERN, oldAvgSizeOfDomainPattern, avgSizeOfDomainPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgDomains() {
		return avgDomains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgDomains(double newAvgDomains) {
		double oldAvgDomains = avgDomains;
		avgDomains = newAvgDomains;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_DOMAINS, oldAvgDomains, avgDomains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgVars() {
		return avgVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgVars(double newAvgVars) {
		double oldAvgVars = avgVars;
		avgVars = newAvgVars;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_VARS, oldAvgVars, avgVars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgRelFanOut() {
		return avgRelFanOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgRelFanOut(double newAvgRelFanOut) {
		double oldAvgRelFanOut = avgRelFanOut;
		avgRelFanOut = newAvgRelFanOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_REL_FAN_OUT, oldAvgRelFanOut, avgRelFanOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgValOut() {
		return avgValOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgValOut(double newAvgValOut) {
		double oldAvgValOut = avgValOut;
		avgValOut = newAvgValOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_VAL_OUT, oldAvgValOut, avgValOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgFanIn() {
		return avgFanIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgFanIn(double newAvgFanIn) {
		double oldAvgFanIn = avgFanIn;
		avgFanIn = newAvgFanIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_FAN_IN, oldAvgFanIn, avgFanIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getExtends_metric() {
		if (extends_metric != null && extends_metric.eIsProxy()) {
			InternalEObject oldExtends_metric = (InternalEObject)extends_metric;
			extends_metric = (Transformation)eResolveProxy(oldExtends_metric);
			if (extends_metric != oldExtends_metric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QVTMetricsPackage.TRANSFORMATION__EXTENDS_METRIC, oldExtends_metric, extends_metric));
			}
		}
		return extends_metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation basicGetExtends_metric() {
		return extends_metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends_metric(Transformation newExtends_metric) {
		Transformation oldExtends_metric = extends_metric;
		extends_metric = newExtends_metric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__EXTENDS_METRIC, oldExtends_metric, extends_metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoDirectChildren() {
		return noDirectChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoDirectChildren(int newNoDirectChildren) {
		int oldNoDirectChildren = noDirectChildren;
		noDirectChildren = newNoDirectChildren;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__NO_DIRECT_CHILDREN, oldNoDirectChildren, noDirectChildren));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoTransitiveChildren() {
		return noTransitiveChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoTransitiveChildren(int newNoTransitiveChildren) {
		int oldNoTransitiveChildren = noTransitiveChildren;
		noTransitiveChildren = newNoTransitiveChildren;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__NO_TRANSITIVE_CHILDREN, oldNoTransitiveChildren, noTransitiveChildren));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoTransitiveParents() {
		return noTransitiveParents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoTransitiveParents(int newNoTransitiveParents) {
		int oldNoTransitiveParents = noTransitiveParents;
		noTransitiveParents = newNoTransitiveParents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__NO_TRANSITIVE_PARENTS, oldNoTransitiveParents, noTransitiveParents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoOverrides() {
		return noOverrides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoOverrides(int newNoOverrides) {
		int oldNoOverrides = noOverrides;
		noOverrides = newNoOverrides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__NO_OVERRIDES, oldNoOverrides, noOverrides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgChildComplexity() {
		return avgChildComplexity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgChildComplexity(double newAvgChildComplexity) {
		double oldAvgChildComplexity = avgChildComplexity;
		avgChildComplexity = newAvgChildComplexity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_CHILD_COMPLEXITY, oldAvgChildComplexity, avgChildComplexity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(double newBalance) {
		double oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__BALANCE, oldBalance, balance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgVarBindingRate() {
		return avgVarBindingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgVarBindingRate(double newAvgVarBindingRate) {
		double oldAvgVarBindingRate = avgVarBindingRate;
		avgVarBindingRate = newAvgVarBindingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_VAR_BINDING_RATE, oldAvgVarBindingRate, avgVarBindingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgRelationDependencyDepth() {
		return avgRelationDependencyDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgRelationDependencyDepth(double newAvgRelationDependencyDepth) {
		double oldAvgRelationDependencyDepth = avgRelationDependencyDepth;
		avgRelationDependencyDepth = newAvgRelationDependencyDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_RELATION_DEPENDENCY_DEPTH, oldAvgRelationDependencyDepth, avgRelationDependencyDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgTypeOverlap() {
		return avgTypeOverlap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgTypeOverlap(double newAvgTypeOverlap) {
		double oldAvgTypeOverlap = avgTypeOverlap;
		avgTypeOverlap = newAvgTypeOverlap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_TYPE_OVERLAP, oldAvgTypeOverlap, avgTypeOverlap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoLeafRelations() {
		return noLeafRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoLeafRelations(int newNoLeafRelations) {
		int oldNoLeafRelations = noLeafRelations;
		noLeafRelations = newNoLeafRelations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__NO_LEAF_RELATIONS, oldNoLeafRelations, noLeafRelations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgFuncFanOut() {
		return avgFuncFanOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgFuncFanOut(double newAvgFuncFanOut) {
		double oldAvgFuncFanOut = avgFuncFanOut;
		avgFuncFanOut = newAvgFuncFanOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_FUNC_FAN_OUT, oldAvgFuncFanOut, avgFuncFanOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgNWWPC() {
		return avgNWWPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgNWWPC(double newAvgNWWPC) {
		double oldAvgNWWPC = avgNWWPC;
		avgNWWPC = newAvgNWWPC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_NWWPC, oldAvgNWWPC, avgNWWPC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvgNWWP() {
		return avgNWWP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgNWWP(double newAvgNWWP) {
		double oldAvgNWWP = avgNWWP;
		avgNWWP = newAvgNWWP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__AVG_NWWP, oldAvgNWWP, avgNWWP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLoc() {
		return loc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoc(int newLoc) {
		int oldLoc = loc;
		loc = newLoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__LOC, oldLoc, loc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSloc() {
		return sloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSloc(int newSloc) {
		int oldSloc = sloc;
		sloc = newSloc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__SLOC, oldSloc, sloc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBloc() {
		return bloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBloc(int newBloc) {
		int oldBloc = bloc;
		bloc = newBloc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__BLOC, oldBloc, bloc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCloc() {
		return cloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloc(int newCloc) {
		int oldCloc = cloc;
		cloc = newCloc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__CLOC, oldCloc, cloc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoIncludes() {
		return noIncludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoIncludes(int newNoIncludes) {
		int oldNoIncludes = noIncludes;
		noIncludes = newNoIncludes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.TRANSFORMATION__NO_INCLUDES, oldNoIncludes, noIncludes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTMetricsPackage.TRANSFORMATION__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case QVTMetricsPackage.TRANSFORMATION__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QVTMetricsPackage.TRANSFORMATION__NAME:
				return getName();
			case QVTMetricsPackage.TRANSFORMATION__RELATIONS:
				return getRelations();
			case QVTMetricsPackage.TRANSFORMATION__FUNCTIONS:
				return getFunctions();
			case QVTMetricsPackage.TRANSFORMATION__CHILDREN:
				return getChildren();
			case QVTMetricsPackage.TRANSFORMATION__NO_STARTS:
				return getNoStarts();
			case QVTMetricsPackage.TRANSFORMATION__NO_WHEN:
				return getNoWhen();
			case QVTMetricsPackage.TRANSFORMATION__NO_WHERE:
				return getNoWhere();
			case QVTMetricsPackage.TRANSFORMATION__NO_RELATIONS:
				return getNoRelations();
			case QVTMetricsPackage.TRANSFORMATION__NO_TOP_LEVEL_RELATIONS:
				return getNoTopLevelRelations();
			case QVTMetricsPackage.TRANSFORMATION__NO_METAMODELS:
				return getNoMetamodels();
			case QVTMetricsPackage.TRANSFORMATION__NO_OCL_QUERIES:
				return getNoOclQueries();
			case QVTMetricsPackage.TRANSFORMATION__AVG_WHEN:
				return getAvgWhen();
			case QVTMetricsPackage.TRANSFORMATION__AVG_WHERE:
				return getAvgWhere();
			case QVTMetricsPackage.TRANSFORMATION__AVG_ENFORCED_DOMAINS:
				return getAvgEnforcedDomains();
			case QVTMetricsPackage.TRANSFORMATION__AVG_CHECKONLY_DOMAINS:
				return getAvgCheckonlyDomains();
			case QVTMetricsPackage.TRANSFORMATION__AVG_SIZE_OF_DOMAIN_PATTERN:
				return getAvgSizeOfDomainPattern();
			case QVTMetricsPackage.TRANSFORMATION__AVG_DOMAINS:
				return getAvgDomains();
			case QVTMetricsPackage.TRANSFORMATION__AVG_VARS:
				return getAvgVars();
			case QVTMetricsPackage.TRANSFORMATION__AVG_REL_FAN_OUT:
				return getAvgRelFanOut();
			case QVTMetricsPackage.TRANSFORMATION__AVG_VAL_OUT:
				return getAvgValOut();
			case QVTMetricsPackage.TRANSFORMATION__AVG_FAN_IN:
				return getAvgFanIn();
			case QVTMetricsPackage.TRANSFORMATION__EXTENDS_METRIC:
				if (resolve) return getExtends_metric();
				return basicGetExtends_metric();
			case QVTMetricsPackage.TRANSFORMATION__NO_DIRECT_CHILDREN:
				return getNoDirectChildren();
			case QVTMetricsPackage.TRANSFORMATION__NO_TRANSITIVE_CHILDREN:
				return getNoTransitiveChildren();
			case QVTMetricsPackage.TRANSFORMATION__NO_TRANSITIVE_PARENTS:
				return getNoTransitiveParents();
			case QVTMetricsPackage.TRANSFORMATION__NO_OVERRIDES:
				return getNoOverrides();
			case QVTMetricsPackage.TRANSFORMATION__AVG_CHILD_COMPLEXITY:
				return getAvgChildComplexity();
			case QVTMetricsPackage.TRANSFORMATION__BALANCE:
				return getBalance();
			case QVTMetricsPackage.TRANSFORMATION__AVG_VAR_BINDING_RATE:
				return getAvgVarBindingRate();
			case QVTMetricsPackage.TRANSFORMATION__AVG_RELATION_DEPENDENCY_DEPTH:
				return getAvgRelationDependencyDepth();
			case QVTMetricsPackage.TRANSFORMATION__AVG_TYPE_OVERLAP:
				return getAvgTypeOverlap();
			case QVTMetricsPackage.TRANSFORMATION__NO_LEAF_RELATIONS:
				return getNoLeafRelations();
			case QVTMetricsPackage.TRANSFORMATION__AVG_FUNC_FAN_OUT:
				return getAvgFuncFanOut();
			case QVTMetricsPackage.TRANSFORMATION__AVG_NWWPC:
				return getAvgNWWPC();
			case QVTMetricsPackage.TRANSFORMATION__AVG_NWWP:
				return getAvgNWWP();
			case QVTMetricsPackage.TRANSFORMATION__LOC:
				return getLoc();
			case QVTMetricsPackage.TRANSFORMATION__SLOC:
				return getSloc();
			case QVTMetricsPackage.TRANSFORMATION__BLOC:
				return getBloc();
			case QVTMetricsPackage.TRANSFORMATION__CLOC:
				return getCloc();
			case QVTMetricsPackage.TRANSFORMATION__NO_INCLUDES:
				return getNoIncludes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QVTMetricsPackage.TRANSFORMATION__NAME:
				setName((String)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Transformation>)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_STARTS:
				setNoStarts((Integer)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_WHEN:
				setNoWhen((Integer)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_WHERE:
				setNoWhere((Integer)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_RELATIONS:
				setNoRelations((Integer)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_TOP_LEVEL_RELATIONS:
				setNoTopLevelRelations((Integer)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_METAMODELS:
				setNoMetamodels((Integer)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_OCL_QUERIES:
				setNoOclQueries((Integer)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_WHEN:
				setAvgWhen((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_WHERE:
				setAvgWhere((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_ENFORCED_DOMAINS:
				setAvgEnforcedDomains((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_CHECKONLY_DOMAINS:
				setAvgCheckonlyDomains((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_SIZE_OF_DOMAIN_PATTERN:
				setAvgSizeOfDomainPattern((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_DOMAINS:
				setAvgDomains((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_VARS:
				setAvgVars((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_REL_FAN_OUT:
				setAvgRelFanOut((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_VAL_OUT:
				setAvgValOut((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_FAN_IN:
				setAvgFanIn((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__EXTENDS_METRIC:
				setExtends_metric((Transformation)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_DIRECT_CHILDREN:
				setNoDirectChildren((Integer)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_TRANSITIVE_CHILDREN:
				setNoTransitiveChildren((Integer)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_TRANSITIVE_PARENTS:
				setNoTransitiveParents((Integer)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_OVERRIDES:
				setNoOverrides((Integer)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_CHILD_COMPLEXITY:
				setAvgChildComplexity((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__BALANCE:
				setBalance((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_VAR_BINDING_RATE:
				setAvgVarBindingRate((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_RELATION_DEPENDENCY_DEPTH:
				setAvgRelationDependencyDepth((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_TYPE_OVERLAP:
				setAvgTypeOverlap((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_LEAF_RELATIONS:
				setNoLeafRelations((Integer)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_FUNC_FAN_OUT:
				setAvgFuncFanOut((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_NWWPC:
				setAvgNWWPC((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_NWWP:
				setAvgNWWP((Double)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__LOC:
				setLoc((Integer)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__SLOC:
				setSloc((Integer)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__BLOC:
				setBloc((Integer)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__CLOC:
				setCloc((Integer)newValue);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_INCLUDES:
				setNoIncludes((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QVTMetricsPackage.TRANSFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__RELATIONS:
				getRelations().clear();
				return;
			case QVTMetricsPackage.TRANSFORMATION__FUNCTIONS:
				getFunctions().clear();
				return;
			case QVTMetricsPackage.TRANSFORMATION__CHILDREN:
				getChildren().clear();
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_STARTS:
				setNoStarts(NO_STARTS_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_WHEN:
				setNoWhen(NO_WHEN_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_WHERE:
				setNoWhere(NO_WHERE_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_RELATIONS:
				setNoRelations(NO_RELATIONS_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_TOP_LEVEL_RELATIONS:
				setNoTopLevelRelations(NO_TOP_LEVEL_RELATIONS_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_METAMODELS:
				setNoMetamodels(NO_METAMODELS_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_OCL_QUERIES:
				setNoOclQueries(NO_OCL_QUERIES_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_WHEN:
				setAvgWhen(AVG_WHEN_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_WHERE:
				setAvgWhere(AVG_WHERE_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_ENFORCED_DOMAINS:
				setAvgEnforcedDomains(AVG_ENFORCED_DOMAINS_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_CHECKONLY_DOMAINS:
				setAvgCheckonlyDomains(AVG_CHECKONLY_DOMAINS_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_SIZE_OF_DOMAIN_PATTERN:
				setAvgSizeOfDomainPattern(AVG_SIZE_OF_DOMAIN_PATTERN_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_DOMAINS:
				setAvgDomains(AVG_DOMAINS_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_VARS:
				setAvgVars(AVG_VARS_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_REL_FAN_OUT:
				setAvgRelFanOut(AVG_REL_FAN_OUT_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_VAL_OUT:
				setAvgValOut(AVG_VAL_OUT_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_FAN_IN:
				setAvgFanIn(AVG_FAN_IN_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__EXTENDS_METRIC:
				setExtends_metric((Transformation)null);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_DIRECT_CHILDREN:
				setNoDirectChildren(NO_DIRECT_CHILDREN_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_TRANSITIVE_CHILDREN:
				setNoTransitiveChildren(NO_TRANSITIVE_CHILDREN_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_TRANSITIVE_PARENTS:
				setNoTransitiveParents(NO_TRANSITIVE_PARENTS_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_OVERRIDES:
				setNoOverrides(NO_OVERRIDES_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_CHILD_COMPLEXITY:
				setAvgChildComplexity(AVG_CHILD_COMPLEXITY_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__BALANCE:
				setBalance(BALANCE_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_VAR_BINDING_RATE:
				setAvgVarBindingRate(AVG_VAR_BINDING_RATE_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_RELATION_DEPENDENCY_DEPTH:
				setAvgRelationDependencyDepth(AVG_RELATION_DEPENDENCY_DEPTH_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_TYPE_OVERLAP:
				setAvgTypeOverlap(AVG_TYPE_OVERLAP_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_LEAF_RELATIONS:
				setNoLeafRelations(NO_LEAF_RELATIONS_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_FUNC_FAN_OUT:
				setAvgFuncFanOut(AVG_FUNC_FAN_OUT_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_NWWPC:
				setAvgNWWPC(AVG_NWWPC_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__AVG_NWWP:
				setAvgNWWP(AVG_NWWP_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__LOC:
				setLoc(LOC_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__SLOC:
				setSloc(SLOC_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__BLOC:
				setBloc(BLOC_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__CLOC:
				setCloc(CLOC_EDEFAULT);
				return;
			case QVTMetricsPackage.TRANSFORMATION__NO_INCLUDES:
				setNoIncludes(NO_INCLUDES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QVTMetricsPackage.TRANSFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QVTMetricsPackage.TRANSFORMATION__RELATIONS:
				return relations != null && !relations.isEmpty();
			case QVTMetricsPackage.TRANSFORMATION__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case QVTMetricsPackage.TRANSFORMATION__CHILDREN:
				return children != null && !children.isEmpty();
			case QVTMetricsPackage.TRANSFORMATION__NO_STARTS:
				return noStarts != NO_STARTS_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__NO_WHEN:
				return noWhen != NO_WHEN_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__NO_WHERE:
				return noWhere != NO_WHERE_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__NO_RELATIONS:
				return noRelations != NO_RELATIONS_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__NO_TOP_LEVEL_RELATIONS:
				return noTopLevelRelations != NO_TOP_LEVEL_RELATIONS_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__NO_METAMODELS:
				return noMetamodels != NO_METAMODELS_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__NO_OCL_QUERIES:
				return noOclQueries != NO_OCL_QUERIES_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_WHEN:
				return avgWhen != AVG_WHEN_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_WHERE:
				return avgWhere != AVG_WHERE_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_ENFORCED_DOMAINS:
				return avgEnforcedDomains != AVG_ENFORCED_DOMAINS_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_CHECKONLY_DOMAINS:
				return avgCheckonlyDomains != AVG_CHECKONLY_DOMAINS_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_SIZE_OF_DOMAIN_PATTERN:
				return avgSizeOfDomainPattern != AVG_SIZE_OF_DOMAIN_PATTERN_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_DOMAINS:
				return avgDomains != AVG_DOMAINS_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_VARS:
				return avgVars != AVG_VARS_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_REL_FAN_OUT:
				return avgRelFanOut != AVG_REL_FAN_OUT_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_VAL_OUT:
				return avgValOut != AVG_VAL_OUT_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_FAN_IN:
				return avgFanIn != AVG_FAN_IN_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__EXTENDS_METRIC:
				return extends_metric != null;
			case QVTMetricsPackage.TRANSFORMATION__NO_DIRECT_CHILDREN:
				return noDirectChildren != NO_DIRECT_CHILDREN_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__NO_TRANSITIVE_CHILDREN:
				return noTransitiveChildren != NO_TRANSITIVE_CHILDREN_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__NO_TRANSITIVE_PARENTS:
				return noTransitiveParents != NO_TRANSITIVE_PARENTS_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__NO_OVERRIDES:
				return noOverrides != NO_OVERRIDES_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_CHILD_COMPLEXITY:
				return avgChildComplexity != AVG_CHILD_COMPLEXITY_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__BALANCE:
				return balance != BALANCE_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_VAR_BINDING_RATE:
				return avgVarBindingRate != AVG_VAR_BINDING_RATE_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_RELATION_DEPENDENCY_DEPTH:
				return avgRelationDependencyDepth != AVG_RELATION_DEPENDENCY_DEPTH_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_TYPE_OVERLAP:
				return avgTypeOverlap != AVG_TYPE_OVERLAP_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__NO_LEAF_RELATIONS:
				return noLeafRelations != NO_LEAF_RELATIONS_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_FUNC_FAN_OUT:
				return avgFuncFanOut != AVG_FUNC_FAN_OUT_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_NWWPC:
				return avgNWWPC != AVG_NWWPC_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__AVG_NWWP:
				return avgNWWP != AVG_NWWP_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__LOC:
				return loc != LOC_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__SLOC:
				return sloc != SLOC_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__BLOC:
				return bloc != BLOC_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__CLOC:
				return cloc != CLOC_EDEFAULT;
			case QVTMetricsPackage.TRANSFORMATION__NO_INCLUDES:
				return noIncludes != NO_INCLUDES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", noStarts: ");
		result.append(noStarts);
		result.append(", noWhen: ");
		result.append(noWhen);
		result.append(", noWhere: ");
		result.append(noWhere);
		result.append(", noRelations: ");
		result.append(noRelations);
		result.append(", noTopLevelRelations: ");
		result.append(noTopLevelRelations);
		result.append(", noMetamodels: ");
		result.append(noMetamodels);
		result.append(", noOclQueries: ");
		result.append(noOclQueries);
		result.append(", avgWhen: ");
		result.append(avgWhen);
		result.append(", avgWhere: ");
		result.append(avgWhere);
		result.append(", avgEnforcedDomains: ");
		result.append(avgEnforcedDomains);
		result.append(", avgCheckonlyDomains: ");
		result.append(avgCheckonlyDomains);
		result.append(", avgSizeOfDomainPattern: ");
		result.append(avgSizeOfDomainPattern);
		result.append(", avgDomains: ");
		result.append(avgDomains);
		result.append(", avgVars: ");
		result.append(avgVars);
		result.append(", avgRelFanOut: ");
		result.append(avgRelFanOut);
		result.append(", avgValOut: ");
		result.append(avgValOut);
		result.append(", avgFanIn: ");
		result.append(avgFanIn);
		result.append(", noDirectChildren: ");
		result.append(noDirectChildren);
		result.append(", noTransitiveChildren: ");
		result.append(noTransitiveChildren);
		result.append(", noTransitiveParents: ");
		result.append(noTransitiveParents);
		result.append(", noOverrides: ");
		result.append(noOverrides);
		result.append(", avgChildComplexity: ");
		result.append(avgChildComplexity);
		result.append(", balance: ");
		result.append(balance);
		result.append(", avgVarBindingRate: ");
		result.append(avgVarBindingRate);
		result.append(", avgRelationDependencyDepth: ");
		result.append(avgRelationDependencyDepth);
		result.append(", avgTypeOverlap: ");
		result.append(avgTypeOverlap);
		result.append(", noLeafRelations: ");
		result.append(noLeafRelations);
		result.append(", avgFuncFanOut: ");
		result.append(avgFuncFanOut);
		result.append(", avgNWWPC: ");
		result.append(avgNWWPC);
		result.append(", avgNWWP: ");
		result.append(avgNWWP);
		result.append(", loc: ");
		result.append(loc);
		result.append(", sloc: ");
		result.append(sloc);
		result.append(", bloc: ");
		result.append(bloc);
		result.append(", cloc: ");
		result.append(cloc);
		result.append(", noIncludes: ");
		result.append(noIncludes);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
