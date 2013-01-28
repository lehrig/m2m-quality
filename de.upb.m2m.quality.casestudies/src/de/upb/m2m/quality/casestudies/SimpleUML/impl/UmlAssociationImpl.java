/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML.impl;

import de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlAssociationImpl#getUmlDestination <em>Uml Destination</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlAssociationImpl#getUmlSource <em>Uml Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UmlAssociationImpl extends UmlPackageElementImpl implements UmlAssociation {
	/**
	 * The cached value of the '{@link #getUmlDestination() <em>Uml Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlDestination()
	 * @generated
	 * @ordered
	 */
	protected UmlClass umlDestination;

	/**
	 * The cached value of the '{@link #getUmlSource() <em>Uml Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlSource()
	 * @generated
	 * @ordered
	 */
	protected UmlClass umlSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmlAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleUMLPackage.Literals.UML_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlClass getUmlDestination() {
		if (umlDestination != null && umlDestination.eIsProxy()) {
			InternalEObject oldUmlDestination = (InternalEObject)umlDestination;
			umlDestination = (UmlClass)eResolveProxy(oldUmlDestination);
			if (umlDestination != oldUmlDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleUMLPackage.UML_ASSOCIATION__UML_DESTINATION, oldUmlDestination, umlDestination));
			}
		}
		return umlDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlClass basicGetUmlDestination() {
		return umlDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmlDestination(UmlClass newUmlDestination, NotificationChain msgs) {
		UmlClass oldUmlDestination = umlDestination;
		umlDestination = newUmlDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleUMLPackage.UML_ASSOCIATION__UML_DESTINATION, oldUmlDestination, newUmlDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlDestination(UmlClass newUmlDestination) {
		if (newUmlDestination != umlDestination) {
			NotificationChain msgs = null;
			if (umlDestination != null)
				msgs = ((InternalEObject)umlDestination).eInverseRemove(this, SimpleUMLPackage.UML_CLASS__UML_FORWARD, UmlClass.class, msgs);
			if (newUmlDestination != null)
				msgs = ((InternalEObject)newUmlDestination).eInverseAdd(this, SimpleUMLPackage.UML_CLASS__UML_FORWARD, UmlClass.class, msgs);
			msgs = basicSetUmlDestination(newUmlDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleUMLPackage.UML_ASSOCIATION__UML_DESTINATION, newUmlDestination, newUmlDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlClass getUmlSource() {
		if (umlSource != null && umlSource.eIsProxy()) {
			InternalEObject oldUmlSource = (InternalEObject)umlSource;
			umlSource = (UmlClass)eResolveProxy(oldUmlSource);
			if (umlSource != oldUmlSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleUMLPackage.UML_ASSOCIATION__UML_SOURCE, oldUmlSource, umlSource));
			}
		}
		return umlSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlClass basicGetUmlSource() {
		return umlSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmlSource(UmlClass newUmlSource, NotificationChain msgs) {
		UmlClass oldUmlSource = umlSource;
		umlSource = newUmlSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleUMLPackage.UML_ASSOCIATION__UML_SOURCE, oldUmlSource, newUmlSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlSource(UmlClass newUmlSource) {
		if (newUmlSource != umlSource) {
			NotificationChain msgs = null;
			if (umlSource != null)
				msgs = ((InternalEObject)umlSource).eInverseRemove(this, SimpleUMLPackage.UML_CLASS__UML_REVERSE, UmlClass.class, msgs);
			if (newUmlSource != null)
				msgs = ((InternalEObject)newUmlSource).eInverseAdd(this, SimpleUMLPackage.UML_CLASS__UML_REVERSE, UmlClass.class, msgs);
			msgs = basicSetUmlSource(newUmlSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleUMLPackage.UML_ASSOCIATION__UML_SOURCE, newUmlSource, newUmlSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleUMLPackage.UML_ASSOCIATION__UML_DESTINATION:
				if (umlDestination != null)
					msgs = ((InternalEObject)umlDestination).eInverseRemove(this, SimpleUMLPackage.UML_CLASS__UML_FORWARD, UmlClass.class, msgs);
				return basicSetUmlDestination((UmlClass)otherEnd, msgs);
			case SimpleUMLPackage.UML_ASSOCIATION__UML_SOURCE:
				if (umlSource != null)
					msgs = ((InternalEObject)umlSource).eInverseRemove(this, SimpleUMLPackage.UML_CLASS__UML_REVERSE, UmlClass.class, msgs);
				return basicSetUmlSource((UmlClass)otherEnd, msgs);
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
			case SimpleUMLPackage.UML_ASSOCIATION__UML_DESTINATION:
				return basicSetUmlDestination(null, msgs);
			case SimpleUMLPackage.UML_ASSOCIATION__UML_SOURCE:
				return basicSetUmlSource(null, msgs);
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
			case SimpleUMLPackage.UML_ASSOCIATION__UML_DESTINATION:
				if (resolve) return getUmlDestination();
				return basicGetUmlDestination();
			case SimpleUMLPackage.UML_ASSOCIATION__UML_SOURCE:
				if (resolve) return getUmlSource();
				return basicGetUmlSource();
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
			case SimpleUMLPackage.UML_ASSOCIATION__UML_DESTINATION:
				setUmlDestination((UmlClass)newValue);
				return;
			case SimpleUMLPackage.UML_ASSOCIATION__UML_SOURCE:
				setUmlSource((UmlClass)newValue);
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
			case SimpleUMLPackage.UML_ASSOCIATION__UML_DESTINATION:
				setUmlDestination((UmlClass)null);
				return;
			case SimpleUMLPackage.UML_ASSOCIATION__UML_SOURCE:
				setUmlSource((UmlClass)null);
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
			case SimpleUMLPackage.UML_ASSOCIATION__UML_DESTINATION:
				return umlDestination != null;
			case SimpleUMLPackage.UML_ASSOCIATION__UML_SOURCE:
				return umlSource != null;
		}
		return super.eIsSet(featureID);
	}

} //UmlAssociationImpl
