/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.m2m.quality.casestudies.SimpleUML.util;

import de.upb.m2m.quality.casestudies.SimpleUML.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.m2m.quality.casestudies.SimpleUML.SimpleUMLPackage
 * @generated
 */
public class SimpleUMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimpleUMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleUMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimpleUMLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleUMLSwitch<Adapter> modelSwitch =
		new SimpleUMLSwitch<Adapter>() {
			@Override
			public Adapter caseUmlAssociation(UmlAssociation object) {
				return createUmlAssociationAdapter();
			}
			@Override
			public Adapter caseUmlAttribute(UmlAttribute object) {
				return createUmlAttributeAdapter();
			}
			@Override
			public Adapter caseUmlClass(UmlClass object) {
				return createUmlClassAdapter();
			}
			@Override
			public Adapter caseUmlClassifier(UmlClassifier object) {
				return createUmlClassifierAdapter();
			}
			@Override
			public Adapter caseUmlModelElement(UmlModelElement object) {
				return createUmlModelElementAdapter();
			}
			@Override
			public Adapter caseUmlPackage(UmlPackage object) {
				return createUmlPackageAdapter();
			}
			@Override
			public Adapter caseUmlPackageElement(UmlPackageElement object) {
				return createUmlPackageElementAdapter();
			}
			@Override
			public Adapter caseUmlPrimitiveDataType(UmlPrimitiveDataType object) {
				return createUmlPrimitiveDataTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation <em>Uml Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlAssociation
	 * @generated
	 */
	public Adapter createUmlAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute <em>Uml Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlAttribute
	 * @generated
	 */
	public Adapter createUmlAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClass <em>Uml Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlClass
	 * @generated
	 */
	public Adapter createUmlClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlClassifier <em>Uml Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlClassifier
	 * @generated
	 */
	public Adapter createUmlClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement <em>Uml Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlModelElement
	 * @generated
	 */
	public Adapter createUmlModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlPackage <em>Uml Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlPackage
	 * @generated
	 */
	public Adapter createUmlPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlPackageElement <em>Uml Package Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlPackageElement
	 * @generated
	 */
	public Adapter createUmlPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.m2m.quality.casestudies.SimpleUML.UmlPrimitiveDataType <em>Uml Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.m2m.quality.casestudies.SimpleUML.UmlPrimitiveDataType
	 * @generated
	 */
	public Adapter createUmlPrimitiveDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimpleUMLAdapterFactory
