/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.Shapes.impl;

import de.upb.m2m.quality.casestudies.Shapes.Arrow;
import de.upb.m2m.quality.casestudies.Shapes.Shape;
import de.upb.m2m.quality.casestudies.Shapes.ShapesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.Shapes.impl.ShapeImpl#getInArrow <em>In Arrow</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.Shapes.impl.ShapeImpl#getOutArrow <em>Out Arrow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ShapeImpl extends ModelElementImpl implements Shape {
	/**
	 * The cached value of the '{@link #getInArrow() <em>In Arrow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInArrow()
	 * @generated
	 * @ordered
	 */
	protected EList<Arrow> inArrow;

	/**
	 * The cached value of the '{@link #getOutArrow() <em>Out Arrow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutArrow()
	 * @generated
	 * @ordered
	 */
	protected EList<Arrow> outArrow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShapesPackage.Literals.SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arrow> getInArrow() {
		if (inArrow == null) {
			inArrow = new EObjectWithInverseResolvingEList<Arrow>(Arrow.class, this, ShapesPackage.SHAPE__IN_ARROW, ShapesPackage.ARROW__TARGET);
		}
		return inArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arrow> getOutArrow() {
		if (outArrow == null) {
			outArrow = new EObjectWithInverseResolvingEList<Arrow>(Arrow.class, this, ShapesPackage.SHAPE__OUT_ARROW, ShapesPackage.ARROW__SOURCE);
		}
		return outArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShapesPackage.SHAPE__IN_ARROW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInArrow()).basicAdd(otherEnd, msgs);
			case ShapesPackage.SHAPE__OUT_ARROW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutArrow()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShapesPackage.SHAPE__IN_ARROW:
				return ((InternalEList<?>)getInArrow()).basicRemove(otherEnd, msgs);
			case ShapesPackage.SHAPE__OUT_ARROW:
				return ((InternalEList<?>)getOutArrow()).basicRemove(otherEnd, msgs);
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
			case ShapesPackage.SHAPE__IN_ARROW:
				return getInArrow();
			case ShapesPackage.SHAPE__OUT_ARROW:
				return getOutArrow();
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
			case ShapesPackage.SHAPE__IN_ARROW:
				getInArrow().clear();
				getInArrow().addAll((Collection<? extends Arrow>)newValue);
				return;
			case ShapesPackage.SHAPE__OUT_ARROW:
				getOutArrow().clear();
				getOutArrow().addAll((Collection<? extends Arrow>)newValue);
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
			case ShapesPackage.SHAPE__IN_ARROW:
				getInArrow().clear();
				return;
			case ShapesPackage.SHAPE__OUT_ARROW:
				getOutArrow().clear();
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
			case ShapesPackage.SHAPE__IN_ARROW:
				return inArrow != null && !inArrow.isEmpty();
			case ShapesPackage.SHAPE__OUT_ARROW:
				return outArrow != null && !outArrow.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShapeImpl
