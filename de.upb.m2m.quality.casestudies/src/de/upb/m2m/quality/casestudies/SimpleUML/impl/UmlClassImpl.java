/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML.impl;

import de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute;
import de.upb.m2m.quality.casestudies.SimpleUML.UmlClass;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlClassImpl#getUmlForward <em>Uml Forward</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlClassImpl#getUmlReverse <em>Uml Reverse</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlClassImpl#getUmlAttribute <em>Uml Attribute</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlClassImpl#getUmlGeneral <em>Uml General</em>}</li>
 *   <li>{@link de.upb.m2m.quality.casestudies.SimpleUML.impl.UmlClassImpl#getUmlSpecific <em>Uml Specific</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UmlClassImpl extends UmlClassifierImpl implements UmlClass {
	/**
	 * The cached value of the '{@link #getUmlForward() <em>Uml Forward</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlForward()
	 * @generated
	 * @ordered
	 */
	protected EList<UmlAssociation> umlForward;

	/**
	 * The cached value of the '{@link #getUmlReverse() <em>Uml Reverse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlReverse()
	 * @generated
	 * @ordered
	 */
	protected EList<UmlAssociation> umlReverse;

	/**
	 * The cached value of the '{@link #getUmlAttribute() <em>Uml Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<UmlAttribute> umlAttribute;

	/**
	 * The cached value of the '{@link #getUmlGeneral() <em>Uml General</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlGeneral()
	 * @generated
	 * @ordered
	 */
	protected EList<UmlClass> umlGeneral;

	/**
	 * The cached value of the '{@link #getUmlSpecific() <em>Uml Specific</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlSpecific()
	 * @generated
	 * @ordered
	 */
	protected EList<UmlClass> umlSpecific;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmlClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleUMLPackage.Literals.UML_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UmlAssociation> getUmlForward() {
		if (umlForward == null) {
			umlForward = new EObjectWithInverseResolvingEList<UmlAssociation>(UmlAssociation.class, this, SimpleUMLPackage.UML_CLASS__UML_FORWARD, SimpleUMLPackage.UML_ASSOCIATION__UML_DESTINATION);
		}
		return umlForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UmlAssociation> getUmlReverse() {
		if (umlReverse == null) {
			umlReverse = new EObjectWithInverseResolvingEList<UmlAssociation>(UmlAssociation.class, this, SimpleUMLPackage.UML_CLASS__UML_REVERSE, SimpleUMLPackage.UML_ASSOCIATION__UML_SOURCE);
		}
		return umlReverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UmlAttribute> getUmlAttribute() {
		if (umlAttribute == null) {
			umlAttribute = new EObjectContainmentWithInverseEList<UmlAttribute>(UmlAttribute.class, this, SimpleUMLPackage.UML_CLASS__UML_ATTRIBUTE, SimpleUMLPackage.UML_ATTRIBUTE__UML_OWNER);
		}
		return umlAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UmlClass> getUmlGeneral() {
		if (umlGeneral == null) {
			umlGeneral = new EObjectWithInverseResolvingEList.ManyInverse<UmlClass>(UmlClass.class, this, SimpleUMLPackage.UML_CLASS__UML_GENERAL, SimpleUMLPackage.UML_CLASS__UML_SPECIFIC);
		}
		return umlGeneral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UmlClass> getUmlSpecific() {
		if (umlSpecific == null) {
			umlSpecific = new EObjectWithInverseResolvingEList.ManyInverse<UmlClass>(UmlClass.class, this, SimpleUMLPackage.UML_CLASS__UML_SPECIFIC, SimpleUMLPackage.UML_CLASS__UML_GENERAL);
		}
		return umlSpecific;
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
			case SimpleUMLPackage.UML_CLASS__UML_FORWARD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUmlForward()).basicAdd(otherEnd, msgs);
			case SimpleUMLPackage.UML_CLASS__UML_REVERSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUmlReverse()).basicAdd(otherEnd, msgs);
			case SimpleUMLPackage.UML_CLASS__UML_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUmlAttribute()).basicAdd(otherEnd, msgs);
			case SimpleUMLPackage.UML_CLASS__UML_GENERAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUmlGeneral()).basicAdd(otherEnd, msgs);
			case SimpleUMLPackage.UML_CLASS__UML_SPECIFIC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUmlSpecific()).basicAdd(otherEnd, msgs);
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
			case SimpleUMLPackage.UML_CLASS__UML_FORWARD:
				return ((InternalEList<?>)getUmlForward()).basicRemove(otherEnd, msgs);
			case SimpleUMLPackage.UML_CLASS__UML_REVERSE:
				return ((InternalEList<?>)getUmlReverse()).basicRemove(otherEnd, msgs);
			case SimpleUMLPackage.UML_CLASS__UML_ATTRIBUTE:
				return ((InternalEList<?>)getUmlAttribute()).basicRemove(otherEnd, msgs);
			case SimpleUMLPackage.UML_CLASS__UML_GENERAL:
				return ((InternalEList<?>)getUmlGeneral()).basicRemove(otherEnd, msgs);
			case SimpleUMLPackage.UML_CLASS__UML_SPECIFIC:
				return ((InternalEList<?>)getUmlSpecific()).basicRemove(otherEnd, msgs);
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
			case SimpleUMLPackage.UML_CLASS__UML_FORWARD:
				return getUmlForward();
			case SimpleUMLPackage.UML_CLASS__UML_REVERSE:
				return getUmlReverse();
			case SimpleUMLPackage.UML_CLASS__UML_ATTRIBUTE:
				return getUmlAttribute();
			case SimpleUMLPackage.UML_CLASS__UML_GENERAL:
				return getUmlGeneral();
			case SimpleUMLPackage.UML_CLASS__UML_SPECIFIC:
				return getUmlSpecific();
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
			case SimpleUMLPackage.UML_CLASS__UML_FORWARD:
				getUmlForward().clear();
				getUmlForward().addAll((Collection<? extends UmlAssociation>)newValue);
				return;
			case SimpleUMLPackage.UML_CLASS__UML_REVERSE:
				getUmlReverse().clear();
				getUmlReverse().addAll((Collection<? extends UmlAssociation>)newValue);
				return;
			case SimpleUMLPackage.UML_CLASS__UML_ATTRIBUTE:
				getUmlAttribute().clear();
				getUmlAttribute().addAll((Collection<? extends UmlAttribute>)newValue);
				return;
			case SimpleUMLPackage.UML_CLASS__UML_GENERAL:
				getUmlGeneral().clear();
				getUmlGeneral().addAll((Collection<? extends UmlClass>)newValue);
				return;
			case SimpleUMLPackage.UML_CLASS__UML_SPECIFIC:
				getUmlSpecific().clear();
				getUmlSpecific().addAll((Collection<? extends UmlClass>)newValue);
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
			case SimpleUMLPackage.UML_CLASS__UML_FORWARD:
				getUmlForward().clear();
				return;
			case SimpleUMLPackage.UML_CLASS__UML_REVERSE:
				getUmlReverse().clear();
				return;
			case SimpleUMLPackage.UML_CLASS__UML_ATTRIBUTE:
				getUmlAttribute().clear();
				return;
			case SimpleUMLPackage.UML_CLASS__UML_GENERAL:
				getUmlGeneral().clear();
				return;
			case SimpleUMLPackage.UML_CLASS__UML_SPECIFIC:
				getUmlSpecific().clear();
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
			case SimpleUMLPackage.UML_CLASS__UML_FORWARD:
				return umlForward != null && !umlForward.isEmpty();
			case SimpleUMLPackage.UML_CLASS__UML_REVERSE:
				return umlReverse != null && !umlReverse.isEmpty();
			case SimpleUMLPackage.UML_CLASS__UML_ATTRIBUTE:
				return umlAttribute != null && !umlAttribute.isEmpty();
			case SimpleUMLPackage.UML_CLASS__UML_GENERAL:
				return umlGeneral != null && !umlGeneral.isEmpty();
			case SimpleUMLPackage.UML_CLASS__UML_SPECIFIC:
				return umlSpecific != null && !umlSpecific.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UmlClassImpl
