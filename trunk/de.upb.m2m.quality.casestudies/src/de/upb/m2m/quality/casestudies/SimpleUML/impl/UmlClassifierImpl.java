/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML.impl;

import de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlClassifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlClassifierImpl#getUmlAttribute1 <em>Uml Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UmlClassifierImpl extends UmlPackageElementImpl implements UmlClassifier {
	/**
	 * The cached value of the '{@link #getUmlAttribute1() <em>Uml Attribute1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlAttribute1()
	 * @generated
	 * @ordered
	 */
	protected EList<UmlAttribute> umlAttribute1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmlClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleUMLPackage.Literals.UML_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UmlAttribute> getUmlAttribute1() {
		if (umlAttribute1 == null) {
			umlAttribute1 = new EObjectWithInverseResolvingEList<UmlAttribute>(UmlAttribute.class, this, SimpleUMLPackage.UML_CLASSIFIER__UML_ATTRIBUTE1, SimpleUMLPackage.UML_ATTRIBUTE__UML_TYPE);
		}
		return umlAttribute1;
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
			case SimpleUMLPackage.UML_CLASSIFIER__UML_ATTRIBUTE1:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUmlAttribute1()).basicAdd(otherEnd, msgs);
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
			case SimpleUMLPackage.UML_CLASSIFIER__UML_ATTRIBUTE1:
				return ((InternalEList<?>)getUmlAttribute1()).basicRemove(otherEnd, msgs);
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
			case SimpleUMLPackage.UML_CLASSIFIER__UML_ATTRIBUTE1:
				return getUmlAttribute1();
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
			case SimpleUMLPackage.UML_CLASSIFIER__UML_ATTRIBUTE1:
				getUmlAttribute1().clear();
				getUmlAttribute1().addAll((Collection<? extends UmlAttribute>)newValue);
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
			case SimpleUMLPackage.UML_CLASSIFIER__UML_ATTRIBUTE1:
				getUmlAttribute1().clear();
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
			case SimpleUMLPackage.UML_CLASSIFIER__UML_ATTRIBUTE1:
				return umlAttribute1 != null && !umlAttribute1.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UmlClassifierImpl
