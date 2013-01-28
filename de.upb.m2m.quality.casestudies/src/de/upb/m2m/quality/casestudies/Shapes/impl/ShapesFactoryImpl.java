/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.Shapes.impl;

import de.upb.m2m.quality.casestudies.Shapes.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShapesFactoryImpl extends EFactoryImpl implements ShapesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShapesFactory init() {
		try {
			ShapesFactory theShapesFactory = (ShapesFactory)EPackage.Registry.INSTANCE.getEFactory("http://m2m.upb.de/Shapes/1.0"); 
			if (theShapesFactory != null) {
				return theShapesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ShapesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ShapesPackage.ARROW: return createArrow();
			case ShapesPackage.SQUARE: return createSquare();
			case ShapesPackage.TRIANGLE: return createTriangle();
			case ShapesPackage.CIRCLE: return createCircle();
			case ShapesPackage.BLOCK: return createBlock();
			case ShapesPackage.ROOT_BLOCK: return createRootBlock();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrow createArrow() {
		ArrowImpl arrow = new ArrowImpl();
		return arrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square createSquare() {
		SquareImpl square = new SquareImpl();
		return square;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triangle createTriangle() {
		TriangleImpl triangle = new TriangleImpl();
		return triangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circle createCircle() {
		CircleImpl circle = new CircleImpl();
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootBlock createRootBlock() {
		RootBlockImpl rootBlock = new RootBlockImpl();
		return rootBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapesPackage getShapesPackage() {
		return (ShapesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ShapesPackage getPackage() {
		return ShapesPackage.eINSTANCE;
	}

} //ShapesFactoryImpl
