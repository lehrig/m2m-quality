/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML.impl;

import de.upb.m2m.quality.casestudies.SimpleUML.*;

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
public class SimpleUMLFactoryImpl extends EFactoryImpl implements SimpleUMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleUMLFactory init() {
		try {
			SimpleUMLFactory theSimpleUMLFactory = (SimpleUMLFactory)EPackage.Registry.INSTANCE.getEFactory("http://m2m.upb.de/SimpleUML/1.0"); 
			if (theSimpleUMLFactory != null) {
				return theSimpleUMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpleUMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleUMLFactoryImpl() {
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
			case SimpleUMLPackage.UML_ASSOCIATION: return createUmlAssociation();
			case SimpleUMLPackage.UML_ATTRIBUTE: return createUmlAttribute();
			case SimpleUMLPackage.UML_CLASS: return createUmlClass();
			case SimpleUMLPackage.UML_CLASSIFIER: return createUmlClassifier();
			case SimpleUMLPackage.UML_MODEL_ELEMENT: return createUmlModelElement();
			case SimpleUMLPackage.UML_PACKAGE: return createUmlPackage();
			case SimpleUMLPackage.UML_PACKAGE_ELEMENT: return createUmlPackageElement();
			case SimpleUMLPackage.UML_PRIMITIVE_DATA_TYPE: return createUmlPrimitiveDataType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlAssociation createUmlAssociation() {
		UmlAssociationImpl umlAssociation = new UmlAssociationImpl();
		return umlAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlAttribute createUmlAttribute() {
		UmlAttributeImpl umlAttribute = new UmlAttributeImpl();
		return umlAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlClass createUmlClass() {
		UmlClassImpl umlClass = new UmlClassImpl();
		return umlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlClassifier createUmlClassifier() {
		UmlClassifierImpl umlClassifier = new UmlClassifierImpl();
		return umlClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlModelElement createUmlModelElement() {
		UmlModelElementImpl umlModelElement = new UmlModelElementImpl();
		return umlModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlPackage createUmlPackage() {
		UmlPackageImpl umlPackage = new UmlPackageImpl();
		return umlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlPackageElement createUmlPackageElement() {
		UmlPackageElementImpl umlPackageElement = new UmlPackageElementImpl();
		return umlPackageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlPrimitiveDataType createUmlPrimitiveDataType() {
		UmlPrimitiveDataTypeImpl umlPrimitiveDataType = new UmlPrimitiveDataTypeImpl();
		return umlPrimitiveDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleUMLPackage getSimpleUMLPackage() {
		return (SimpleUMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimpleUMLPackage getPackage() {
		return SimpleUMLPackage.eINSTANCE;
	}

} //SimpleUMLFactoryImpl
