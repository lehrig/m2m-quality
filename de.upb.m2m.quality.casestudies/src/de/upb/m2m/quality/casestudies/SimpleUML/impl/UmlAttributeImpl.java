/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML.impl;

import de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlClass;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlClassifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlAttributeImpl#getUmlOwner <em>Uml Owner</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlAttributeImpl#getUmlType <em>Uml Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UmlAttributeImpl extends UmlModelElementImpl implements UmlAttribute {
	/**
	 * The cached value of the '{@link #getUmlType() <em>Uml Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlType()
	 * @generated
	 * @ordered
	 */
	protected UmlClassifier umlType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmlAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleUMLPackage.Literals.UML_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlClass getUmlOwner() {
		if (eContainerFeatureID() != SimpleUMLPackage.UML_ATTRIBUTE__UML_OWNER) return null;
		return (UmlClass)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmlOwner(UmlClass newUmlOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUmlOwner, SimpleUMLPackage.UML_ATTRIBUTE__UML_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlOwner(UmlClass newUmlOwner) {
		if (newUmlOwner != eInternalContainer() || (eContainerFeatureID() != SimpleUMLPackage.UML_ATTRIBUTE__UML_OWNER && newUmlOwner != null)) {
			if (EcoreUtil.isAncestor(this, newUmlOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUmlOwner != null)
				msgs = ((InternalEObject)newUmlOwner).eInverseAdd(this, SimpleUMLPackage.UML_CLASS__UML_ATTRIBUTE, UmlClass.class, msgs);
			msgs = basicSetUmlOwner(newUmlOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleUMLPackage.UML_ATTRIBUTE__UML_OWNER, newUmlOwner, newUmlOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlClassifier getUmlType() {
		if (umlType != null && umlType.eIsProxy()) {
			InternalEObject oldUmlType = (InternalEObject)umlType;
			umlType = (UmlClassifier)eResolveProxy(oldUmlType);
			if (umlType != oldUmlType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleUMLPackage.UML_ATTRIBUTE__UML_TYPE, oldUmlType, umlType));
			}
		}
		return umlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlClassifier basicGetUmlType() {
		return umlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmlType(UmlClassifier newUmlType, NotificationChain msgs) {
		UmlClassifier oldUmlType = umlType;
		umlType = newUmlType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleUMLPackage.UML_ATTRIBUTE__UML_TYPE, oldUmlType, newUmlType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlType(UmlClassifier newUmlType) {
		if (newUmlType != umlType) {
			NotificationChain msgs = null;
			if (umlType != null)
				msgs = ((InternalEObject)umlType).eInverseRemove(this, SimpleUMLPackage.UML_CLASSIFIER__UML_ATTRIBUTE1, UmlClassifier.class, msgs);
			if (newUmlType != null)
				msgs = ((InternalEObject)newUmlType).eInverseAdd(this, SimpleUMLPackage.UML_CLASSIFIER__UML_ATTRIBUTE1, UmlClassifier.class, msgs);
			msgs = basicSetUmlType(newUmlType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleUMLPackage.UML_ATTRIBUTE__UML_TYPE, newUmlType, newUmlType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleUMLPackage.UML_ATTRIBUTE__UML_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUmlOwner((UmlClass)otherEnd, msgs);
			case SimpleUMLPackage.UML_ATTRIBUTE__UML_TYPE:
				if (umlType != null)
					msgs = ((InternalEObject)umlType).eInverseRemove(this, SimpleUMLPackage.UML_CLASSIFIER__UML_ATTRIBUTE1, UmlClassifier.class, msgs);
				return basicSetUmlType((UmlClassifier)otherEnd, msgs);
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
			case SimpleUMLPackage.UML_ATTRIBUTE__UML_OWNER:
				return basicSetUmlOwner(null, msgs);
			case SimpleUMLPackage.UML_ATTRIBUTE__UML_TYPE:
				return basicSetUmlType(null, msgs);
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
			case SimpleUMLPackage.UML_ATTRIBUTE__UML_OWNER:
				return eInternalContainer().eInverseRemove(this, SimpleUMLPackage.UML_CLASS__UML_ATTRIBUTE, UmlClass.class, msgs);
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
			case SimpleUMLPackage.UML_ATTRIBUTE__UML_OWNER:
				return getUmlOwner();
			case SimpleUMLPackage.UML_ATTRIBUTE__UML_TYPE:
				if (resolve) return getUmlType();
				return basicGetUmlType();
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
			case SimpleUMLPackage.UML_ATTRIBUTE__UML_OWNER:
				setUmlOwner((UmlClass)newValue);
				return;
			case SimpleUMLPackage.UML_ATTRIBUTE__UML_TYPE:
				setUmlType((UmlClassifier)newValue);
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
			case SimpleUMLPackage.UML_ATTRIBUTE__UML_OWNER:
				setUmlOwner((UmlClass)null);
				return;
			case SimpleUMLPackage.UML_ATTRIBUTE__UML_TYPE:
				setUmlType((UmlClassifier)null);
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
			case SimpleUMLPackage.UML_ATTRIBUTE__UML_OWNER:
				return getUmlOwner() != null;
			case SimpleUMLPackage.UML_ATTRIBUTE__UML_TYPE:
				return umlType != null;
		}
		return super.eIsSet(featureID);
	}

} //UmlAttributeImpl
