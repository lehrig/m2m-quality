/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML.impl;

import de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlPackage;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlPackageElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlPackageImpl#getUmlOwnedElement <em>Uml Owned Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UmlPackageImpl extends UmlModelElementImpl implements UmlPackage {
	/**
	 * The cached value of the '{@link #getUmlOwnedElement() <em>Uml Owned Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<UmlPackageElement> umlOwnedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmlPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleUMLPackage.Literals.UML_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UmlPackageElement> getUmlOwnedElement() {
		if (umlOwnedElement == null) {
			umlOwnedElement = new EObjectContainmentWithInverseEList<UmlPackageElement>(UmlPackageElement.class, this, SimpleUMLPackage.UML_PACKAGE__UML_OWNED_ELEMENT, SimpleUMLPackage.UML_PACKAGE_ELEMENT__UML_NAMESPACE);
		}
		return umlOwnedElement;
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
			case SimpleUMLPackage.UML_PACKAGE__UML_OWNED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUmlOwnedElement()).basicAdd(otherEnd, msgs);
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
			case SimpleUMLPackage.UML_PACKAGE__UML_OWNED_ELEMENT:
				return ((InternalEList<?>)getUmlOwnedElement()).basicRemove(otherEnd, msgs);
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
			case SimpleUMLPackage.UML_PACKAGE__UML_OWNED_ELEMENT:
				return getUmlOwnedElement();
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
			case SimpleUMLPackage.UML_PACKAGE__UML_OWNED_ELEMENT:
				getUmlOwnedElement().clear();
				getUmlOwnedElement().addAll((Collection<? extends UmlPackageElement>)newValue);
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
			case SimpleUMLPackage.UML_PACKAGE__UML_OWNED_ELEMENT:
				getUmlOwnedElement().clear();
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
			case SimpleUMLPackage.UML_PACKAGE__UML_OWNED_ELEMENT:
				return umlOwnedElement != null && !umlOwnedElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UmlPackageImpl
