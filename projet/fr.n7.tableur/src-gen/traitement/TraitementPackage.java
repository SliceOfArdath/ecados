/**
 */
package traitement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see traitement.TraitementFactory
 * @model kind="package"
 * @generated
 */
public interface TraitementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traitement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/traitement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "traitement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraitementPackage eINSTANCE = traitement.impl.TraitementPackageImpl.init();

	/**
	 * The meta object id for the '{@link traitement.impl.FonctionImpl <em>Fonction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traitement.impl.FonctionImpl
	 * @see traitement.impl.TraitementPackageImpl#getFonction()
	 * @generated
	 */
	int FONCTION = 0;

	/**
	 * The feature id for the '<em><b>Chemin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION__CHEMIN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Sorties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION__SORTIES = 2;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION__ENTREES = 3;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION__TABLE_NAME = 4;

	/**
	 * The number of structural features of the '<em>Fonction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Fonction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link traitement.Fonction <em>Fonction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fonction</em>'.
	 * @see traitement.Fonction
	 * @generated
	 */
	EClass getFonction();

	/**
	 * Returns the meta object for the attribute '{@link traitement.Fonction#getChemin <em>Chemin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chemin</em>'.
	 * @see traitement.Fonction#getChemin()
	 * @see #getFonction()
	 * @generated
	 */
	EAttribute getFonction_Chemin();

	/**
	 * Returns the meta object for the attribute '{@link traitement.Fonction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see traitement.Fonction#getName()
	 * @see #getFonction()
	 * @generated
	 */
	EAttribute getFonction_Name();

	/**
	 * Returns the meta object for the attribute list '{@link traitement.Fonction#getEntrees <em>Entrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entrees</em>'.
	 * @see traitement.Fonction#getEntrees()
	 * @see #getFonction()
	 * @generated
	 */
	EAttribute getFonction_Entrees();

	/**
	 * Returns the meta object for the attribute '{@link traitement.Fonction#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see traitement.Fonction#getTableName()
	 * @see #getFonction()
	 * @generated
	 */
	EAttribute getFonction_TableName();

	/**
	 * Returns the meta object for the attribute list '{@link traitement.Fonction#getSorties <em>Sorties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sorties</em>'.
	 * @see traitement.Fonction#getSorties()
	 * @see #getFonction()
	 * @generated
	 */
	EAttribute getFonction_Sorties();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraitementFactory getTraitementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link traitement.impl.FonctionImpl <em>Fonction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traitement.impl.FonctionImpl
		 * @see traitement.impl.TraitementPackageImpl#getFonction()
		 * @generated
		 */
		EClass FONCTION = eINSTANCE.getFonction();

		/**
		 * The meta object literal for the '<em><b>Chemin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONCTION__CHEMIN = eINSTANCE.getFonction_Chemin();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONCTION__NAME = eINSTANCE.getFonction_Name();

		/**
		 * The meta object literal for the '<em><b>Entrees</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONCTION__ENTREES = eINSTANCE.getFonction_Entrees();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONCTION__TABLE_NAME = eINSTANCE.getFonction_TableName();

		/**
		 * The meta object literal for the '<em><b>Sorties</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONCTION__SORTIES = eINSTANCE.getFonction_Sorties();

	}

} //TraitementPackage
