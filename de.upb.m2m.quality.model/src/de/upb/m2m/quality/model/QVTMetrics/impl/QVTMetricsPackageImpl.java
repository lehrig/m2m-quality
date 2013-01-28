/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.model.QVTMetrics.impl;

import de.upb.m2m.quality.model.QVTMetrics.DomainPattern;
import de.upb.m2m.quality.model.QVTMetrics.DomainPredicate;
import de.upb.m2m.quality.model.QVTMetrics.DomainPredicateCount;
import de.upb.m2m.quality.model.QVTMetrics.Function;
import de.upb.m2m.quality.model.QVTMetrics.QVTMetricsFactory;
import de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage;
import de.upb.m2m.quality.model.QVTMetrics.Relation;
import de.upb.m2m.quality.model.QVTMetrics.Transformation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QVTMetricsPackageImpl extends EPackageImpl implements QVTMetricsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainPredicateCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainPatternEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.upb.m2m.quality.model.QVTMetrics.QVTMetricsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QVTMetricsPackageImpl() {
		super(eNS_URI, QVTMetricsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QVTMetricsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QVTMetricsPackage init() {
		if (isInited) return (QVTMetricsPackage)EPackage.Registry.INSTANCE.getEPackage(QVTMetricsPackage.eNS_URI);

		// Obtain or create and register package
		QVTMetricsPackageImpl theQVTMetricsPackage = (QVTMetricsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QVTMetricsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QVTMetricsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theQVTMetricsPackage.createPackageContents();

		// Initialize created meta-data
		theQVTMetricsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQVTMetricsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QVTMetricsPackage.eNS_URI, theQVTMetricsPackage);
		return theQVTMetricsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainPredicateCount() {
		return domainPredicateCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainPredicateCount_Average() {
		return (EAttribute)domainPredicateCountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainPredicateCount_Mean() {
		return (EAttribute)domainPredicateCountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Name() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Relations() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Functions() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Children() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_NoStarts() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_NoWhen() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_NoWhere() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_NoRelations() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_NoTopLevelRelations() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_NoMetamodels() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_NoOclQueries() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgWhen() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgWhere() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgEnforcedDomains() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgCheckonlyDomains() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgSizeOfDomainPattern() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgDomains() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgVars() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgRelFanOut() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgValOut() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgFanIn() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Extends_metric() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_NoDirectChildren() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_NoTransitiveChildren() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_NoTransitiveParents() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_NoOverrides() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgChildComplexity() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Balance() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgVarBindingRate() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgRelationDependencyDepth() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgTypeOverlap() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_NoLeafRelations() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgFuncFanOut() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgNWWPC() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_AvgNWWP() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Loc() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Sloc() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Bloc() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Cloc() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_NoIncludes() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_DomainPattern() {
		return (EReference)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Name() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_NoCheckonlyDomains() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_NoEnforcedDomains() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_NoWhen() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_NoWhere() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_NoDomains() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_NoVars() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_ValOut() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_FanOut() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_FanIn() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_NoBoundVars() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_NoUnboundVars() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_VarBindingRate() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_AvgSizeOfDomainPattern() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_IsLeaf() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_DepthOfLeaf() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Nwwp() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Nwwpc() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Name() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_FanOut() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_FanIn() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainPredicate() {
		return domainPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainPattern() {
		return domainPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainPattern_DomainPredicateCount() {
		return (EReference)domainPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainPattern_SizeOfDomainPattern() {
		return (EAttribute)domainPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTMetricsFactory getQVTMetricsFactory() {
		return (QVTMetricsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		domainPredicateCountEClass = createEClass(DOMAIN_PREDICATE_COUNT);
		createEAttribute(domainPredicateCountEClass, DOMAIN_PREDICATE_COUNT__AVERAGE);
		createEAttribute(domainPredicateCountEClass, DOMAIN_PREDICATE_COUNT__MEAN);

		transformationEClass = createEClass(TRANSFORMATION);
		createEAttribute(transformationEClass, TRANSFORMATION__NAME);
		createEReference(transformationEClass, TRANSFORMATION__RELATIONS);
		createEReference(transformationEClass, TRANSFORMATION__FUNCTIONS);
		createEReference(transformationEClass, TRANSFORMATION__CHILDREN);
		createEAttribute(transformationEClass, TRANSFORMATION__NO_STARTS);
		createEAttribute(transformationEClass, TRANSFORMATION__NO_WHEN);
		createEAttribute(transformationEClass, TRANSFORMATION__NO_WHERE);
		createEAttribute(transformationEClass, TRANSFORMATION__NO_RELATIONS);
		createEAttribute(transformationEClass, TRANSFORMATION__NO_TOP_LEVEL_RELATIONS);
		createEAttribute(transformationEClass, TRANSFORMATION__NO_METAMODELS);
		createEAttribute(transformationEClass, TRANSFORMATION__NO_OCL_QUERIES);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_WHEN);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_WHERE);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_ENFORCED_DOMAINS);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_CHECKONLY_DOMAINS);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_SIZE_OF_DOMAIN_PATTERN);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_DOMAINS);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_VARS);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_REL_FAN_OUT);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_VAL_OUT);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_FAN_IN);
		createEReference(transformationEClass, TRANSFORMATION__EXTENDS_METRIC);
		createEAttribute(transformationEClass, TRANSFORMATION__NO_DIRECT_CHILDREN);
		createEAttribute(transformationEClass, TRANSFORMATION__NO_TRANSITIVE_CHILDREN);
		createEAttribute(transformationEClass, TRANSFORMATION__NO_TRANSITIVE_PARENTS);
		createEAttribute(transformationEClass, TRANSFORMATION__NO_OVERRIDES);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_CHILD_COMPLEXITY);
		createEAttribute(transformationEClass, TRANSFORMATION__BALANCE);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_VAR_BINDING_RATE);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_RELATION_DEPENDENCY_DEPTH);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_TYPE_OVERLAP);
		createEAttribute(transformationEClass, TRANSFORMATION__NO_LEAF_RELATIONS);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_FUNC_FAN_OUT);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_NWWPC);
		createEAttribute(transformationEClass, TRANSFORMATION__AVG_NWWP);
		createEAttribute(transformationEClass, TRANSFORMATION__LOC);
		createEAttribute(transformationEClass, TRANSFORMATION__SLOC);
		createEAttribute(transformationEClass, TRANSFORMATION__BLOC);
		createEAttribute(transformationEClass, TRANSFORMATION__CLOC);
		createEAttribute(transformationEClass, TRANSFORMATION__NO_INCLUDES);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__DOMAIN_PATTERN);
		createEAttribute(relationEClass, RELATION__NAME);
		createEAttribute(relationEClass, RELATION__NO_CHECKONLY_DOMAINS);
		createEAttribute(relationEClass, RELATION__NO_ENFORCED_DOMAINS);
		createEAttribute(relationEClass, RELATION__NO_WHEN);
		createEAttribute(relationEClass, RELATION__NO_WHERE);
		createEAttribute(relationEClass, RELATION__NO_DOMAINS);
		createEAttribute(relationEClass, RELATION__NO_VARS);
		createEAttribute(relationEClass, RELATION__VAL_OUT);
		createEAttribute(relationEClass, RELATION__FAN_OUT);
		createEAttribute(relationEClass, RELATION__FAN_IN);
		createEAttribute(relationEClass, RELATION__NO_BOUND_VARS);
		createEAttribute(relationEClass, RELATION__NO_UNBOUND_VARS);
		createEAttribute(relationEClass, RELATION__VAR_BINDING_RATE);
		createEAttribute(relationEClass, RELATION__AVG_SIZE_OF_DOMAIN_PATTERN);
		createEAttribute(relationEClass, RELATION__IS_LEAF);
		createEAttribute(relationEClass, RELATION__DEPTH_OF_LEAF);
		createEAttribute(relationEClass, RELATION__NWWP);
		createEAttribute(relationEClass, RELATION__NWWPC);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__NAME);
		createEAttribute(functionEClass, FUNCTION__FAN_OUT);
		createEAttribute(functionEClass, FUNCTION__FAN_IN);

		domainPredicateEClass = createEClass(DOMAIN_PREDICATE);

		domainPatternEClass = createEClass(DOMAIN_PATTERN);
		createEReference(domainPatternEClass, DOMAIN_PATTERN__DOMAIN_PREDICATE_COUNT);
		createEAttribute(domainPatternEClass, DOMAIN_PATTERN__SIZE_OF_DOMAIN_PATTERN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(domainPredicateCountEClass, DomainPredicateCount.class, "DomainPredicateCount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainPredicateCount_Average(), ecorePackage.getEInt(), "average", null, 0, 1, DomainPredicateCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainPredicateCount_Mean(), ecorePackage.getEInt(), "mean", null, 0, 1, DomainPredicateCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_Relations(), this.getRelation(), null, "relations", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_Functions(), this.getFunction(), null, "functions", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_Children(), this.getTransformation(), null, "children", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransformation_NoStarts(), ecorePackage.getEInt(), "noStarts", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_NoWhen(), ecorePackage.getEInt(), "noWhen", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_NoWhere(), ecorePackage.getEInt(), "noWhere", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_NoRelations(), ecorePackage.getEInt(), "noRelations", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_NoTopLevelRelations(), ecorePackage.getEInt(), "noTopLevelRelations", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_NoMetamodels(), ecorePackage.getEInt(), "noMetamodels", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_NoOclQueries(), ecorePackage.getEInt(), "noOclQueries", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgWhen(), ecorePackage.getEDouble(), "avgWhen", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgWhere(), ecorePackage.getEDouble(), "avgWhere", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgEnforcedDomains(), ecorePackage.getEDouble(), "avgEnforcedDomains", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgCheckonlyDomains(), ecorePackage.getEDouble(), "avgCheckonlyDomains", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgSizeOfDomainPattern(), ecorePackage.getEDouble(), "avgSizeOfDomainPattern", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgDomains(), ecorePackage.getEDouble(), "avgDomains", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgVars(), ecorePackage.getEDouble(), "avgVars", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgRelFanOut(), ecorePackage.getEDouble(), "avgRelFanOut", "0", 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgValOut(), ecorePackage.getEDouble(), "avgValOut", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgFanIn(), ecorePackage.getEDouble(), "avgFanIn", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_Extends_metric(), this.getTransformation(), null, "extends_metric", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_NoDirectChildren(), ecorePackage.getEInt(), "noDirectChildren", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_NoTransitiveChildren(), ecorePackage.getEInt(), "noTransitiveChildren", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_NoTransitiveParents(), ecorePackage.getEInt(), "noTransitiveParents", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_NoOverrides(), ecorePackage.getEInt(), "noOverrides", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgChildComplexity(), ecorePackage.getEDouble(), "avgChildComplexity", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_Balance(), ecorePackage.getEDouble(), "balance", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgVarBindingRate(), ecorePackage.getEDouble(), "avgVarBindingRate", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgRelationDependencyDepth(), ecorePackage.getEDouble(), "avgRelationDependencyDepth", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgTypeOverlap(), ecorePackage.getEDouble(), "avgTypeOverlap", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_NoLeafRelations(), ecorePackage.getEInt(), "noLeafRelations", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgFuncFanOut(), ecorePackage.getEDouble(), "avgFuncFanOut", "0", 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgNWWPC(), ecorePackage.getEDouble(), "avgNWWPC", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_AvgNWWP(), ecorePackage.getEDouble(), "avgNWWP", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_Loc(), ecorePackage.getEInt(), "loc", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_Sloc(), ecorePackage.getEInt(), "sloc", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_Bloc(), ecorePackage.getEInt(), "bloc", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_Cloc(), ecorePackage.getEInt(), "cloc", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_NoIncludes(), ecorePackage.getEInt(), "noIncludes", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_DomainPattern(), this.getDomainPattern(), null, "domainPattern", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRelation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_NoCheckonlyDomains(), ecorePackage.getEInt(), "noCheckonlyDomains", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_NoEnforcedDomains(), ecorePackage.getEInt(), "noEnforcedDomains", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_NoWhen(), ecorePackage.getEInt(), "noWhen", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_NoWhere(), ecorePackage.getEInt(), "noWhere", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_NoDomains(), ecorePackage.getEInt(), "noDomains", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_NoVars(), ecorePackage.getEInt(), "noVars", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_ValOut(), ecorePackage.getEInt(), "valOut", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_FanOut(), ecorePackage.getEInt(), "fanOut", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_FanIn(), ecorePackage.getEInt(), "fanIn", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_NoBoundVars(), ecorePackage.getEInt(), "noBoundVars", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_NoUnboundVars(), ecorePackage.getEInt(), "noUnboundVars", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_VarBindingRate(), ecorePackage.getEDouble(), "varBindingRate", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_AvgSizeOfDomainPattern(), ecorePackage.getEDouble(), "avgSizeOfDomainPattern", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_IsLeaf(), ecorePackage.getEBoolean(), "isLeaf", "false", 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_DepthOfLeaf(), ecorePackage.getEInt(), "depthOfLeaf", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Nwwp(), ecorePackage.getEInt(), "nwwp", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Nwwpc(), ecorePackage.getEInt(), "nwwpc", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_FanOut(), ecorePackage.getEInt(), "fanOut", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_FanIn(), ecorePackage.getEInt(), "fanIn", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainPredicateEClass, DomainPredicate.class, "DomainPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainPatternEClass, DomainPattern.class, "DomainPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainPattern_DomainPredicateCount(), this.getDomainPredicateCount(), null, "domainPredicateCount", null, 0, 1, DomainPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainPattern_SizeOfDomainPattern(), ecorePackage.getEInt(), "sizeOfDomainPattern", null, 0, 1, DomainPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //QVTMetricsPackageImpl
