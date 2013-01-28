/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QVTMetrics.impl;

import de.upb.m2m.quality.model.QVTMetrics.DomainPattern;
import de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage;
import de.upb.m2m.quality.model.QVTMetrics.Relation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getDomainPattern <em>Domain Pattern</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getNoCheckonlyDomains <em>No Checkonly Domains</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getNoEnforcedDomains <em>No Enforced Domains</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getNoWhen <em>No When</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getNoWhere <em>No Where</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getNoDomains <em>No Domains</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getNoVars <em>No Vars</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getValOut <em>Val Out</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getFanOut <em>Fan Out</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getFanIn <em>Fan In</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getNoBoundVars <em>No Bound Vars</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getNoUnboundVars <em>No Unbound Vars</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getVarBindingRate <em>Var Binding Rate</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getAvgSizeOfDomainPattern <em>Avg Size Of Domain Pattern</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getDepthOfLeaf <em>Depth Of Leaf</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getNwwp <em>Nwwp</em>}</li>
 *   <li>{@link de.upb.m2m.quality.model.QVTMetrics.impl.RelationImpl#getNwwpc <em>Nwwpc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends EObjectImpl implements Relation {
	/**
	 * The cached value of the '{@link #getDomainPattern() <em>Domain Pattern</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainPattern()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainPattern> domainPattern;

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
	 * The default value of the '{@link #getNoCheckonlyDomains() <em>No Checkonly Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoCheckonlyDomains()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_CHECKONLY_DOMAINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoCheckonlyDomains() <em>No Checkonly Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoCheckonlyDomains()
	 * @generated
	 * @ordered
	 */
	protected int noCheckonlyDomains = NO_CHECKONLY_DOMAINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoEnforcedDomains() <em>No Enforced Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoEnforcedDomains()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_ENFORCED_DOMAINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoEnforcedDomains() <em>No Enforced Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoEnforcedDomains()
	 * @generated
	 * @ordered
	 */
	protected int noEnforcedDomains = NO_ENFORCED_DOMAINS_EDEFAULT;

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
	 * The default value of the '{@link #getNoDomains() <em>No Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoDomains()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_DOMAINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoDomains() <em>No Domains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoDomains()
	 * @generated
	 * @ordered
	 */
	protected int noDomains = NO_DOMAINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoVars() <em>No Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoVars()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_VARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoVars() <em>No Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoVars()
	 * @generated
	 * @ordered
	 */
	protected int noVars = NO_VARS_EDEFAULT;

	/**
	 * The default value of the '{@link #getValOut() <em>Val Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValOut()
	 * @generated
	 * @ordered
	 */
	protected static final int VAL_OUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValOut() <em>Val Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValOut()
	 * @generated
	 * @ordered
	 */
	protected int valOut = VAL_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFanOut() <em>Fan Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanOut()
	 * @generated
	 * @ordered
	 */
	protected static final int FAN_OUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFanOut() <em>Fan Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanOut()
	 * @generated
	 * @ordered
	 */
	protected int fanOut = FAN_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFanIn() <em>Fan In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanIn()
	 * @generated
	 * @ordered
	 */
	protected static final int FAN_IN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFanIn() <em>Fan In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanIn()
	 * @generated
	 * @ordered
	 */
	protected int fanIn = FAN_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoBoundVars() <em>No Bound Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoBoundVars()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_BOUND_VARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoBoundVars() <em>No Bound Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoBoundVars()
	 * @generated
	 * @ordered
	 */
	protected int noBoundVars = NO_BOUND_VARS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoUnboundVars() <em>No Unbound Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoUnboundVars()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_UNBOUND_VARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoUnboundVars() <em>No Unbound Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoUnboundVars()
	 * @generated
	 * @ordered
	 */
	protected int noUnboundVars = NO_UNBOUND_VARS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarBindingRate() <em>Var Binding Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarBindingRate()
	 * @generated
	 * @ordered
	 */
	protected static final double VAR_BINDING_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVarBindingRate() <em>Var Binding Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarBindingRate()
	 * @generated
	 * @ordered
	 */
	protected double varBindingRate = VAR_BINDING_RATE_EDEFAULT;

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
	 * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepthOfLeaf() <em>Depth Of Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthOfLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPTH_OF_LEAF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDepthOfLeaf() <em>Depth Of Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthOfLeaf()
	 * @generated
	 * @ordered
	 */
	protected int depthOfLeaf = DEPTH_OF_LEAF_EDEFAULT;

	/**
	 * The default value of the '{@link #getNwwp() <em>Nwwp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNwwp()
	 * @generated
	 * @ordered
	 */
	protected static final int NWWP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNwwp() <em>Nwwp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNwwp()
	 * @generated
	 * @ordered
	 */
	protected int nwwp = NWWP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNwwpc() <em>Nwwpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNwwpc()
	 * @generated
	 * @ordered
	 */
	protected static final int NWWPC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNwwpc() <em>Nwwpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNwwpc()
	 * @generated
	 * @ordered
	 */
	protected int nwwpc = NWWPC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTMetricsPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainPattern> getDomainPattern() {
		if (domainPattern == null) {
			domainPattern = new EObjectContainmentEList<DomainPattern>(DomainPattern.class, this, QVTMetricsPackage.RELATION__DOMAIN_PATTERN);
		}
		return domainPattern;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoCheckonlyDomains() {
		return noCheckonlyDomains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoCheckonlyDomains(int newNoCheckonlyDomains) {
		int oldNoCheckonlyDomains = noCheckonlyDomains;
		noCheckonlyDomains = newNoCheckonlyDomains;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__NO_CHECKONLY_DOMAINS, oldNoCheckonlyDomains, noCheckonlyDomains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoEnforcedDomains() {
		return noEnforcedDomains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoEnforcedDomains(int newNoEnforcedDomains) {
		int oldNoEnforcedDomains = noEnforcedDomains;
		noEnforcedDomains = newNoEnforcedDomains;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__NO_ENFORCED_DOMAINS, oldNoEnforcedDomains, noEnforcedDomains));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__NO_WHEN, oldNoWhen, noWhen));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__NO_WHERE, oldNoWhere, noWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoDomains() {
		return noDomains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoDomains(int newNoDomains) {
		int oldNoDomains = noDomains;
		noDomains = newNoDomains;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__NO_DOMAINS, oldNoDomains, noDomains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoVars() {
		return noVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoVars(int newNoVars) {
		int oldNoVars = noVars;
		noVars = newNoVars;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__NO_VARS, oldNoVars, noVars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValOut() {
		return valOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValOut(int newValOut) {
		int oldValOut = valOut;
		valOut = newValOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__VAL_OUT, oldValOut, valOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFanOut() {
		return fanOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFanOut(int newFanOut) {
		int oldFanOut = fanOut;
		fanOut = newFanOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__FAN_OUT, oldFanOut, fanOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFanIn() {
		return fanIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFanIn(int newFanIn) {
		int oldFanIn = fanIn;
		fanIn = newFanIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__FAN_IN, oldFanIn, fanIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoBoundVars() {
		return noBoundVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoBoundVars(int newNoBoundVars) {
		int oldNoBoundVars = noBoundVars;
		noBoundVars = newNoBoundVars;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__NO_BOUND_VARS, oldNoBoundVars, noBoundVars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoUnboundVars() {
		return noUnboundVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoUnboundVars(int newNoUnboundVars) {
		int oldNoUnboundVars = noUnboundVars;
		noUnboundVars = newNoUnboundVars;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__NO_UNBOUND_VARS, oldNoUnboundVars, noUnboundVars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVarBindingRate() {
		return varBindingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarBindingRate(double newVarBindingRate) {
		double oldVarBindingRate = varBindingRate;
		varBindingRate = newVarBindingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__VAR_BINDING_RATE, oldVarBindingRate, varBindingRate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__AVG_SIZE_OF_DOMAIN_PATTERN, oldAvgSizeOfDomainPattern, avgSizeOfDomainPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDepthOfLeaf() {
		return depthOfLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepthOfLeaf(int newDepthOfLeaf) {
		int oldDepthOfLeaf = depthOfLeaf;
		depthOfLeaf = newDepthOfLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__DEPTH_OF_LEAF, oldDepthOfLeaf, depthOfLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNwwp() {
		return nwwp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNwwp(int newNwwp) {
		int oldNwwp = nwwp;
		nwwp = newNwwp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__NWWP, oldNwwp, nwwp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNwwpc() {
		return nwwpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNwwpc(int newNwwpc) {
		int oldNwwpc = nwwpc;
		nwwpc = newNwwpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTMetricsPackage.RELATION__NWWPC, oldNwwpc, nwwpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTMetricsPackage.RELATION__DOMAIN_PATTERN:
				return ((InternalEList<?>)getDomainPattern()).basicRemove(otherEnd, msgs);
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
			case QVTMetricsPackage.RELATION__DOMAIN_PATTERN:
				return getDomainPattern();
			case QVTMetricsPackage.RELATION__NAME:
				return getName();
			case QVTMetricsPackage.RELATION__NO_CHECKONLY_DOMAINS:
				return getNoCheckonlyDomains();
			case QVTMetricsPackage.RELATION__NO_ENFORCED_DOMAINS:
				return getNoEnforcedDomains();
			case QVTMetricsPackage.RELATION__NO_WHEN:
				return getNoWhen();
			case QVTMetricsPackage.RELATION__NO_WHERE:
				return getNoWhere();
			case QVTMetricsPackage.RELATION__NO_DOMAINS:
				return getNoDomains();
			case QVTMetricsPackage.RELATION__NO_VARS:
				return getNoVars();
			case QVTMetricsPackage.RELATION__VAL_OUT:
				return getValOut();
			case QVTMetricsPackage.RELATION__FAN_OUT:
				return getFanOut();
			case QVTMetricsPackage.RELATION__FAN_IN:
				return getFanIn();
			case QVTMetricsPackage.RELATION__NO_BOUND_VARS:
				return getNoBoundVars();
			case QVTMetricsPackage.RELATION__NO_UNBOUND_VARS:
				return getNoUnboundVars();
			case QVTMetricsPackage.RELATION__VAR_BINDING_RATE:
				return getVarBindingRate();
			case QVTMetricsPackage.RELATION__AVG_SIZE_OF_DOMAIN_PATTERN:
				return getAvgSizeOfDomainPattern();
			case QVTMetricsPackage.RELATION__IS_LEAF:
				return isIsLeaf();
			case QVTMetricsPackage.RELATION__DEPTH_OF_LEAF:
				return getDepthOfLeaf();
			case QVTMetricsPackage.RELATION__NWWP:
				return getNwwp();
			case QVTMetricsPackage.RELATION__NWWPC:
				return getNwwpc();
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
			case QVTMetricsPackage.RELATION__DOMAIN_PATTERN:
				getDomainPattern().clear();
				getDomainPattern().addAll((Collection<? extends DomainPattern>)newValue);
				return;
			case QVTMetricsPackage.RELATION__NAME:
				setName((String)newValue);
				return;
			case QVTMetricsPackage.RELATION__NO_CHECKONLY_DOMAINS:
				setNoCheckonlyDomains((Integer)newValue);
				return;
			case QVTMetricsPackage.RELATION__NO_ENFORCED_DOMAINS:
				setNoEnforcedDomains((Integer)newValue);
				return;
			case QVTMetricsPackage.RELATION__NO_WHEN:
				setNoWhen((Integer)newValue);
				return;
			case QVTMetricsPackage.RELATION__NO_WHERE:
				setNoWhere((Integer)newValue);
				return;
			case QVTMetricsPackage.RELATION__NO_DOMAINS:
				setNoDomains((Integer)newValue);
				return;
			case QVTMetricsPackage.RELATION__NO_VARS:
				setNoVars((Integer)newValue);
				return;
			case QVTMetricsPackage.RELATION__VAL_OUT:
				setValOut((Integer)newValue);
				return;
			case QVTMetricsPackage.RELATION__FAN_OUT:
				setFanOut((Integer)newValue);
				return;
			case QVTMetricsPackage.RELATION__FAN_IN:
				setFanIn((Integer)newValue);
				return;
			case QVTMetricsPackage.RELATION__NO_BOUND_VARS:
				setNoBoundVars((Integer)newValue);
				return;
			case QVTMetricsPackage.RELATION__NO_UNBOUND_VARS:
				setNoUnboundVars((Integer)newValue);
				return;
			case QVTMetricsPackage.RELATION__VAR_BINDING_RATE:
				setVarBindingRate((Double)newValue);
				return;
			case QVTMetricsPackage.RELATION__AVG_SIZE_OF_DOMAIN_PATTERN:
				setAvgSizeOfDomainPattern((Double)newValue);
				return;
			case QVTMetricsPackage.RELATION__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case QVTMetricsPackage.RELATION__DEPTH_OF_LEAF:
				setDepthOfLeaf((Integer)newValue);
				return;
			case QVTMetricsPackage.RELATION__NWWP:
				setNwwp((Integer)newValue);
				return;
			case QVTMetricsPackage.RELATION__NWWPC:
				setNwwpc((Integer)newValue);
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
			case QVTMetricsPackage.RELATION__DOMAIN_PATTERN:
				getDomainPattern().clear();
				return;
			case QVTMetricsPackage.RELATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__NO_CHECKONLY_DOMAINS:
				setNoCheckonlyDomains(NO_CHECKONLY_DOMAINS_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__NO_ENFORCED_DOMAINS:
				setNoEnforcedDomains(NO_ENFORCED_DOMAINS_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__NO_WHEN:
				setNoWhen(NO_WHEN_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__NO_WHERE:
				setNoWhere(NO_WHERE_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__NO_DOMAINS:
				setNoDomains(NO_DOMAINS_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__NO_VARS:
				setNoVars(NO_VARS_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__VAL_OUT:
				setValOut(VAL_OUT_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__FAN_OUT:
				setFanOut(FAN_OUT_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__FAN_IN:
				setFanIn(FAN_IN_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__NO_BOUND_VARS:
				setNoBoundVars(NO_BOUND_VARS_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__NO_UNBOUND_VARS:
				setNoUnboundVars(NO_UNBOUND_VARS_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__VAR_BINDING_RATE:
				setVarBindingRate(VAR_BINDING_RATE_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__AVG_SIZE_OF_DOMAIN_PATTERN:
				setAvgSizeOfDomainPattern(AVG_SIZE_OF_DOMAIN_PATTERN_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__DEPTH_OF_LEAF:
				setDepthOfLeaf(DEPTH_OF_LEAF_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__NWWP:
				setNwwp(NWWP_EDEFAULT);
				return;
			case QVTMetricsPackage.RELATION__NWWPC:
				setNwwpc(NWWPC_EDEFAULT);
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
			case QVTMetricsPackage.RELATION__DOMAIN_PATTERN:
				return domainPattern != null && !domainPattern.isEmpty();
			case QVTMetricsPackage.RELATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QVTMetricsPackage.RELATION__NO_CHECKONLY_DOMAINS:
				return noCheckonlyDomains != NO_CHECKONLY_DOMAINS_EDEFAULT;
			case QVTMetricsPackage.RELATION__NO_ENFORCED_DOMAINS:
				return noEnforcedDomains != NO_ENFORCED_DOMAINS_EDEFAULT;
			case QVTMetricsPackage.RELATION__NO_WHEN:
				return noWhen != NO_WHEN_EDEFAULT;
			case QVTMetricsPackage.RELATION__NO_WHERE:
				return noWhere != NO_WHERE_EDEFAULT;
			case QVTMetricsPackage.RELATION__NO_DOMAINS:
				return noDomains != NO_DOMAINS_EDEFAULT;
			case QVTMetricsPackage.RELATION__NO_VARS:
				return noVars != NO_VARS_EDEFAULT;
			case QVTMetricsPackage.RELATION__VAL_OUT:
				return valOut != VAL_OUT_EDEFAULT;
			case QVTMetricsPackage.RELATION__FAN_OUT:
				return fanOut != FAN_OUT_EDEFAULT;
			case QVTMetricsPackage.RELATION__FAN_IN:
				return fanIn != FAN_IN_EDEFAULT;
			case QVTMetricsPackage.RELATION__NO_BOUND_VARS:
				return noBoundVars != NO_BOUND_VARS_EDEFAULT;
			case QVTMetricsPackage.RELATION__NO_UNBOUND_VARS:
				return noUnboundVars != NO_UNBOUND_VARS_EDEFAULT;
			case QVTMetricsPackage.RELATION__VAR_BINDING_RATE:
				return varBindingRate != VAR_BINDING_RATE_EDEFAULT;
			case QVTMetricsPackage.RELATION__AVG_SIZE_OF_DOMAIN_PATTERN:
				return avgSizeOfDomainPattern != AVG_SIZE_OF_DOMAIN_PATTERN_EDEFAULT;
			case QVTMetricsPackage.RELATION__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case QVTMetricsPackage.RELATION__DEPTH_OF_LEAF:
				return depthOfLeaf != DEPTH_OF_LEAF_EDEFAULT;
			case QVTMetricsPackage.RELATION__NWWP:
				return nwwp != NWWP_EDEFAULT;
			case QVTMetricsPackage.RELATION__NWWPC:
				return nwwpc != NWWPC_EDEFAULT;
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
		result.append(", noCheckonlyDomains: ");
		result.append(noCheckonlyDomains);
		result.append(", noEnforcedDomains: ");
		result.append(noEnforcedDomains);
		result.append(", noWhen: ");
		result.append(noWhen);
		result.append(", noWhere: ");
		result.append(noWhere);
		result.append(", noDomains: ");
		result.append(noDomains);
		result.append(", noVars: ");
		result.append(noVars);
		result.append(", valOut: ");
		result.append(valOut);
		result.append(", fanOut: ");
		result.append(fanOut);
		result.append(", fanIn: ");
		result.append(fanIn);
		result.append(", noBoundVars: ");
		result.append(noBoundVars);
		result.append(", noUnboundVars: ");
		result.append(noUnboundVars);
		result.append(", varBindingRate: ");
		result.append(varBindingRate);
		result.append(", avgSizeOfDomainPattern: ");
		result.append(avgSizeOfDomainPattern);
		result.append(", isLeaf: ");
		result.append(isLeaf);
		result.append(", depthOfLeaf: ");
		result.append(depthOfLeaf);
		result.append(", nwwp: ");
		result.append(nwwp);
		result.append(", nwwpc: ");
		result.append(nwwpc);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
