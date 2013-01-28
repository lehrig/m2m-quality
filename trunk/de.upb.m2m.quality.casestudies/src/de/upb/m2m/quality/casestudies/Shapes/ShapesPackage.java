/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.Shapes;

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
 * @see de.upb.m2m.quality.casestudies.Shapes.ShapesFactory
 * @model kind="package"
 * @generated
 */
public interface ShapesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Shapes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://m2m.upb.de/Shapes/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Shapes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShapesPackage eINSTANCE = de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ModelElementImpl
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__BLOCK = 1;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.ArrowImpl <em>Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ArrowImpl
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getArrow()
	 * @generated
	 */
	int ARROW = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__BLOCK = MODEL_ELEMENT__BLOCK;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__SOURCE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__TARGET = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapeImpl
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__BLOCK = MODEL_ELEMENT__BLOCK;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__IN_ARROW = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__OUT_ARROW = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.SimpleShapeImpl <em>Simple Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.SimpleShapeImpl
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getSimpleShape()
	 * @generated
	 */
	int SIMPLE_SHAPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SHAPE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SHAPE__BLOCK = SHAPE__BLOCK;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SHAPE__IN_ARROW = SHAPE__IN_ARROW;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SHAPE__OUT_ARROW = SHAPE__OUT_ARROW;

	/**
	 * The number of structural features of the '<em>Simple Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.SquareImpl <em>Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.SquareImpl
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getSquare()
	 * @generated
	 */
	int SQUARE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__NAME = SIMPLE_SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__BLOCK = SIMPLE_SHAPE__BLOCK;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__IN_ARROW = SIMPLE_SHAPE__IN_ARROW;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__OUT_ARROW = SIMPLE_SHAPE__OUT_ARROW;

	/**
	 * The number of structural features of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_FEATURE_COUNT = SIMPLE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.TriangleImpl <em>Triangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.TriangleImpl
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getTriangle()
	 * @generated
	 */
	int TRIANGLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__NAME = SIMPLE_SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__BLOCK = SIMPLE_SHAPE__BLOCK;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__IN_ARROW = SIMPLE_SHAPE__IN_ARROW;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__OUT_ARROW = SIMPLE_SHAPE__OUT_ARROW;

	/**
	 * The number of structural features of the '<em>Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_FEATURE_COUNT = SIMPLE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.CircleImpl
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__NAME = SIMPLE_SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__BLOCK = SIMPLE_SHAPE__BLOCK;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__IN_ARROW = SIMPLE_SHAPE__IN_ARROW;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__OUT_ARROW = SIMPLE_SHAPE__OUT_ARROW;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = SIMPLE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.BlockImpl
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCK = SHAPE__BLOCK;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__IN_ARROW = SHAPE__IN_ARROW;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OUT_ARROW = SHAPE__OUT_ARROW;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__MODEL_ELEMENT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.RootBlockImpl <em>Root Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.RootBlockImpl
	 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getRootBlock()
	 * @generated
	 */
	int ROOT_BLOCK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK__BLOCK = BLOCK__BLOCK;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK__IN_ARROW = BLOCK__IN_ARROW;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK__OUT_ARROW = BLOCK__OUT_ARROW;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK__MODEL_ELEMENT = BLOCK__MODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Root Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.Shapes.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see de.upb.m2m.quality.casestudies.Shapes.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.m2m.quality.casestudies.Shapes.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.m2m.quality.casestudies.Shapes.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the container reference '{@link de.upb.m2m.quality.casestudies.Shapes.ModelElement#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Block</em>'.
	 * @see de.upb.m2m.quality.casestudies.Shapes.ModelElement#getBlock()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Block();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.Shapes.Arrow <em>Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrow</em>'.
	 * @see de.upb.m2m.quality.casestudies.Shapes.Arrow
	 * @generated
	 */
	EClass getArrow();

	/**
	 * Returns the meta object for the reference '{@link de.upb.m2m.quality.casestudies.Shapes.Arrow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.upb.m2m.quality.casestudies.Shapes.Arrow#getSource()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_Source();

	/**
	 * Returns the meta object for the reference '{@link de.upb.m2m.quality.casestudies.Shapes.Arrow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.upb.m2m.quality.casestudies.Shapes.Arrow#getTarget()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_Target();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.Shapes.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see de.upb.m2m.quality.casestudies.Shapes.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.m2m.quality.casestudies.Shapes.Shape#getInArrow <em>In Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Arrow</em>'.
	 * @see de.upb.m2m.quality.casestudies.Shapes.Shape#getInArrow()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_InArrow();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.m2m.quality.casestudies.Shapes.Shape#getOutArrow <em>Out Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Arrow</em>'.
	 * @see de.upb.m2m.quality.casestudies.Shapes.Shape#getOutArrow()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_OutArrow();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.Shapes.SimpleShape <em>Simple Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Shape</em>'.
	 * @see de.upb.m2m.quality.casestudies.Shapes.SimpleShape
	 * @generated
	 */
	EClass getSimpleShape();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.Shapes.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square</em>'.
	 * @see de.upb.m2m.quality.casestudies.Shapes.Square
	 * @generated
	 */
	EClass getSquare();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.Shapes.Triangle <em>Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangle</em>'.
	 * @see de.upb.m2m.quality.casestudies.Shapes.Triangle
	 * @generated
	 */
	EClass getTriangle();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.Shapes.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see de.upb.m2m.quality.casestudies.Shapes.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.Shapes.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see de.upb.m2m.quality.casestudies.Shapes.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.m2m.quality.casestudies.Shapes.Block#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Element</em>'.
	 * @see de.upb.m2m.quality.casestudies.Shapes.Block#getModelElement()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_ModelElement();

	/**
	 * Returns the meta object for class '{@link de.upb.m2m.quality.casestudies.Shapes.RootBlock <em>Root Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Block</em>'.
	 * @see de.upb.m2m.quality.casestudies.Shapes.RootBlock
	 * @generated
	 */
	EClass getRootBlock();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShapesFactory getShapesFactory();

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
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ModelElementImpl
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__BLOCK = eINSTANCE.getModelElement_Block();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.ArrowImpl <em>Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ArrowImpl
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getArrow()
		 * @generated
		 */
		EClass ARROW = eINSTANCE.getArrow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__SOURCE = eINSTANCE.getArrow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__TARGET = eINSTANCE.getArrow_Target();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapeImpl
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>In Arrow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__IN_ARROW = eINSTANCE.getShape_InArrow();

		/**
		 * The meta object literal for the '<em><b>Out Arrow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__OUT_ARROW = eINSTANCE.getShape_OutArrow();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.SimpleShapeImpl <em>Simple Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.SimpleShapeImpl
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getSimpleShape()
		 * @generated
		 */
		EClass SIMPLE_SHAPE = eINSTANCE.getSimpleShape();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.SquareImpl <em>Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.SquareImpl
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getSquare()
		 * @generated
		 */
		EClass SQUARE = eINSTANCE.getSquare();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.TriangleImpl <em>Triangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.TriangleImpl
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getTriangle()
		 * @generated
		 */
		EClass TRIANGLE = eINSTANCE.getTriangle();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.CircleImpl
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.BlockImpl
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__MODEL_ELEMENT = eINSTANCE.getBlock_ModelElement();

		/**
		 * The meta object literal for the '{@link de.upb.m2m.quality.casestudies.Shapes.impl.RootBlockImpl <em>Root Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.RootBlockImpl
		 * @see de.upb.m2m.quality.casestudies.Shapes.impl.ShapesPackageImpl#getRootBlock()
		 * @generated
		 */
		EClass ROOT_BLOCK = eINSTANCE.getRootBlock();

	}

} //ShapesPackage
