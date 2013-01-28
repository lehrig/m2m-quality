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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Package Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlPackageElementImpl#getUmlNamespace <em>Uml Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UmlPackageElementImpl extends UmlModelElementImpl implements UmlPackageElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmlPackageElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleUMLPackage.Literals.UML_PACKAGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlPackage getUmlNamespace() {
		if (eContainerFeatureID() != SimpleUMLPackage.UML_PACKAGE_ELEMENT__UML_NAMESPACE) return null;
		return (UmlPackage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmlNamespace(UmlPackage newUmlNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUmlNamespace, SimpleUMLPackage.UML_PACKAGE_ELEMENT__UML_NAMESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlNamespace(UmlPackage newUmlNamespace) {
		if (newUmlNamespace != eInternalContainer() || (eContainerFeatureID() != SimpleUMLPackage.UML_PACKAGE_ELEMENT__UML_NAMESPACE && newUmlNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newUmlNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUmlNamespace != null)
				msgs = ((InternalEObject)newUmlNamespace).eInverseAdd(this, SimpleUMLPackage.UML_PACKAGE__UML_OWNED_ELEMENT, UmlPackage.class, msgs);
			msgs = basicSetUmlNamespace(newUmlNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleUMLPackage.UML_PACKAGE_ELEMENT__UML_NAMESPACE, newUmlNamespace, newUmlNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleUMLPackage.UML_PACKAGE_ELEMENT__UML_NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUmlNamespace((UmlPackage)otherEnd, msgs);
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
			case SimpleUMLPackage.UML_PACKAGE_ELEMENT__UML_NAMESPACE:
				return basicSetUmlNamespace(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SimpleUMLPackage.UML_PACKAGE_ELEMENT__UML_NAMESPACE:
				return eInternalContainer().eInverseRemove(this, SimpleUMLPackage.UML_PACKAGE__UML_OWNED_ELEMENT, UmlPackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleUMLPackage.UML_PACKAGE_ELEMENT__UML_NAMESPACE:
				return getUmlNamespace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimpleUMLPackage.UML_PACKAGE_ELEMENT__UML_NAMESPACE:
				setUmlNamespace((UmlPackage)newValue);
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
			case SimpleUMLPackage.UML_PACKAGE_ELEMENT__UML_NAMESPACE:
				setUmlNamespace((UmlPackage)null);
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
			case SimpleUMLPackage.UML_PACKAGE_ELEMENT__UML_NAMESPACE:
				return getUmlNamespace() != null;
		}
		return super.eIsSet(featureID);
	}

} //UmlPackageElementImpl
