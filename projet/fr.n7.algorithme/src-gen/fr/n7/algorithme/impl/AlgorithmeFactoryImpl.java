/**
 */
package fr.n7.algorithme.impl;

import fr.n7.algorithme.*;

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
public class AlgorithmeFactoryImpl extends EFactoryImpl implements AlgorithmeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AlgorithmeFactory init() {
		try {
			AlgorithmeFactory theAlgorithmeFactory = (AlgorithmeFactory) EPackage.Registry.INSTANCE
					.getEFactory(AlgorithmePackage.eNS_URI);
			if (theAlgorithmeFactory != null) {
				return theAlgorithmeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AlgorithmeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmeFactoryImpl() {
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
		case AlgorithmePackage.ALGORITHME:
			return createAlgorithme();
		case AlgorithmePackage.OPERATION_BINAIRE:
			return createOperationBinaire();
		case AlgorithmePackage.OPERATION_UNAIRE:
			return createOperationUnaire();
		case AlgorithmePackage.CONSTANTE:
			return createConstante();
		case AlgorithmePackage.ENTREE:
			return createEntree();
		case AlgorithmePackage.SORTIE:
			return createSortie();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Algorithme createAlgorithme() {
		AlgorithmeImpl algorithme = new AlgorithmeImpl();
		return algorithme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationBinaire createOperationBinaire() {
		OperationBinaireImpl operationBinaire = new OperationBinaireImpl();
		return operationBinaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationUnaire createOperationUnaire() {
		OperationUnaireImpl operationUnaire = new OperationUnaireImpl();
		return operationUnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constante createConstante() {
		ConstanteImpl constante = new ConstanteImpl();
		return constante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entree createEntree() {
		EntreeImpl entree = new EntreeImpl();
		return entree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sortie createSortie() {
		SortieImpl sortie = new SortieImpl();
		return sortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmePackage getAlgorithmePackage() {
		return (AlgorithmePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AlgorithmePackage getPackage() {
		return AlgorithmePackage.eINSTANCE;
	}

} //AlgorithmeFactoryImpl
