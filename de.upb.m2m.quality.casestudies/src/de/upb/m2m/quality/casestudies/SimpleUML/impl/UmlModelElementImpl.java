/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML.impl;

import de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlModelElementImpl#getUmlName <em>Uml Name</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlModelElementImpl#getUmlKind <em>Uml Kind</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlModelElementImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UmlModelElementImpl extends EObjectImpl implements UmlModelElement {
	/**
	 * The default value of the '{@link #getUmlName() <em>Uml Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlName()
	 * @generated
	 * @ordered
	 */
	protected static final String UML_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUmlName() <em>Uml Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlName()
	 * @generated
	 * @ordered
	 */
	protected String umlName = UML_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUmlKind() <em>Uml Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlKind()
	 * @generated
	 * @ordered
	 */
	protected static final String UML_KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUmlKind() <em>Uml Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlKind()
	 * @generated
	 * @ordered
	 */
	protected String umlKind = UML_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmlModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleUMLPackage.Literals.UML_MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUmlName() {
		return umlName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlName(String newUmlName) {
		String oldUmlName = umlName;
		umlName = newUmlName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleUMLPackage.UML_MODEL_ELEMENT__UML_NAME, oldUmlName, umlName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUmlKind() {
		return umlKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlKind(String newUmlKind) {
		String oldUmlKind = umlKind;
		umlKind = newUmlKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleUMLPackage.UML_MODEL_ELEMENT__UML_KIND, oldUmlKind, umlKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleUMLPackage.UML_MODEL_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleUMLPackage.UML_MODEL_ELEMENT__UML_NAME:
				return getUmlName();
			case SimpleUMLPackage.UML_MODEL_ELEMENT__UML_KIND:
				return getUmlKind();
			case SimpleUMLPackage.UML_MODEL_ELEMENT__ID:
				return getId();
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
			case SimpleUMLPackage.UML_MODEL_ELEMENT__UML_NAME:
				setUmlName((String)newValue);
				return;
			case SimpleUMLPackage.UML_MODEL_ELEMENT__UML_KIND:
				setUmlKind((String)newValue);
				return;
			case SimpleUMLPackage.UML_MODEL_ELEMENT__ID:
				setId((String)newValue);
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
			case SimpleUMLPackage.UML_MODEL_ELEMENT__UML_NAME:
				setUmlName(UML_NAME_EDEFAULT);
				return;
			case SimpleUMLPackage.UML_MODEL_ELEMENT__UML_KIND:
				setUmlKind(UML_KIND_EDEFAULT);
				return;
			case SimpleUMLPackage.UML_MODEL_ELEMENT__ID:
				setId(ID_EDEFAULT);
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
			case SimpleUMLPackage.UML_MODEL_ELEMENT__UML_NAME:
				return UML_NAME_EDEFAULT == null ? umlName != null : !UML_NAME_EDEFAULT.equals(umlName);
			case SimpleUMLPackage.UML_MODEL_ELEMENT__UML_KIND:
				return UML_KIND_EDEFAULT == null ? umlKind != null : !UML_KIND_EDEFAULT.equals(umlKind);
			case SimpleUMLPackage.UML_MODEL_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (umlName: ");
		result.append(umlName);
		result.append(", umlKind: ");
		result.append(umlKind);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //UmlModelElementImpl
