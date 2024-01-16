/**
 */
package tableur;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see tableur.TableurFactory
 * @model kind="package"
 * @generated
 */
public interface TableurPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tableur";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tableur";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tableur";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TableurPackage eINSTANCE = tableur.impl.TableurPackageImpl.init();

	/**
	 * The meta object id for the '{@link tableur.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tableur.impl.TableImpl
	 * @see tableur.impl.TableurPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 0;

	/**
	 * The feature id for the '<em><b>Colonnes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLONNES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Colonne ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLONNE_ID = 2;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tableur.impl.ColonneImpl <em>Colonne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tableur.impl.ColonneImpl
	 * @see tableur.impl.TableurPackageImpl#getColonne()
	 * @generated
	 */
	int COLONNE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tableur.impl.ColonneDonneeImpl <em>Colonne Donnee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tableur.impl.ColonneDonneeImpl
	 * @see tableur.impl.TableurPackageImpl#getColonneDonnee()
	 * @generated
	 */
	int COLONNE_DONNEE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DONNEE__TYPE = COLONNE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DONNEE__NAME = COLONNE__NAME;

	/**
	 * The number of structural features of the '<em>Colonne Donnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DONNEE_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Colonne Donnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DONNEE_OPERATION_COUNT = COLONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tableur.impl.DonneeBruteImpl <em>Donnee Brute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tableur.impl.DonneeBruteImpl
	 * @see tableur.impl.TableurPackageImpl#getDonneeBrute()
	 * @generated
	 */
	int DONNEE_BRUTE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_BRUTE__TYPE = COLONNE_DONNEE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_BRUTE__NAME = COLONNE_DONNEE__NAME;

	/**
	 * The number of structural features of the '<em>Donnee Brute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_BRUTE_FEATURE_COUNT = COLONNE_DONNEE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Donnee Brute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_BRUTE_OPERATION_COUNT = COLONNE_DONNEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tableur.impl.DonneeCalculeeImpl <em>Donnee Calculee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tableur.impl.DonneeCalculeeImpl
	 * @see tableur.impl.TableurPackageImpl#getDonneeCalculee()
	 * @generated
	 */
	int DONNEE_CALCULEE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_CALCULEE__TYPE = COLONNE_DONNEE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_CALCULEE__NAME = COLONNE_DONNEE__NAME;

	/**
	 * The feature id for the '<em><b>Fonction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_CALCULEE__FONCTION = COLONNE_DONNEE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nom Fonction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_CALCULEE__NOM_FONCTION = COLONNE_DONNEE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Donnee Calculee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_CALCULEE_FEATURE_COUNT = COLONNE_DONNEE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Donnee Calculee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_CALCULEE_OPERATION_COUNT = COLONNE_DONNEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tableur.impl.ColonneIDImpl <em>Colonne ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tableur.impl.ColonneIDImpl
	 * @see tableur.impl.TableurPackageImpl#getColonneID()
	 * @generated
	 */
	int COLONNE_ID = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ID__TYPE = COLONNE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ID__NAME = COLONNE__NAME;

	/**
	 * The number of structural features of the '<em>Colonne ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ID_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Colonne ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ID_OPERATION_COUNT = COLONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tableur.impl.ColonneExterneImpl <em>Colonne Externe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tableur.impl.ColonneExterneImpl
	 * @see tableur.impl.TableurPackageImpl#getColonneExterne()
	 * @generated
	 */
	int COLONNE_EXTERNE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_EXTERNE__TYPE = COLONNE_DONNEE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_EXTERNE__NAME = COLONNE_DONNEE__NAME;

	/**
	 * The feature id for the '<em><b>Table Externe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_EXTERNE__TABLE_EXTERNE = COLONNE_DONNEE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Colonne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_EXTERNE__COLONNE = COLONNE_DONNEE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Colonne Externe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_EXTERNE_FEATURE_COUNT = COLONNE_DONNEE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Colonne Externe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_EXTERNE_OPERATION_COUNT = COLONNE_DONNEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tableur.Primitive <em>Primitive</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tableur.Primitive
	 * @see tableur.impl.TableurPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 7;

	/**
	 * Returns the meta object for class '{@link tableur.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see tableur.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link tableur.Table#getColonnes <em>Colonnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colonnes</em>'.
	 * @see tableur.Table#getColonnes()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Colonnes();

	/**
	 * Returns the meta object for the attribute '{@link tableur.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tableur.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tableur.Table#getColonneID <em>Colonne ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Colonne ID</em>'.
	 * @see tableur.Table#getColonneID()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ColonneID();

	/**
	 * Returns the meta object for class '{@link tableur.Colonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne</em>'.
	 * @see tableur.Colonne
	 * @generated
	 */
	EClass getColonne();

	/**
	 * Returns the meta object for the attribute '{@link tableur.Colonne#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tableur.Colonne#getType()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Type();

	/**
	 * Returns the meta object for the attribute '{@link tableur.Colonne#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tableur.Colonne#getName()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Name();

	/**
	 * Returns the meta object for class '{@link tableur.DonneeBrute <em>Donnee Brute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donnee Brute</em>'.
	 * @see tableur.DonneeBrute
	 * @generated
	 */
	EClass getDonneeBrute();

	/**
	 * Returns the meta object for class '{@link tableur.DonneeCalculee <em>Donnee Calculee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donnee Calculee</em>'.
	 * @see tableur.DonneeCalculee
	 * @generated
	 */
	EClass getDonneeCalculee();

	/**
	 * Returns the meta object for the reference '{@link tableur.DonneeCalculee#getFonction <em>Fonction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fonction</em>'.
	 * @see tableur.DonneeCalculee#getFonction()
	 * @see #getDonneeCalculee()
	 * @generated
	 */
	EReference getDonneeCalculee_Fonction();

	/**
	 * Returns the meta object for the attribute '{@link tableur.DonneeCalculee#getNomFonction <em>Nom Fonction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Fonction</em>'.
	 * @see tableur.DonneeCalculee#getNomFonction()
	 * @see #getDonneeCalculee()
	 * @generated
	 */
	EAttribute getDonneeCalculee_NomFonction();

	/**
	 * Returns the meta object for class '{@link tableur.ColonneID <em>Colonne ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne ID</em>'.
	 * @see tableur.ColonneID
	 * @generated
	 */
	EClass getColonneID();

	/**
	 * Returns the meta object for class '{@link tableur.ColonneDonnee <em>Colonne Donnee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne Donnee</em>'.
	 * @see tableur.ColonneDonnee
	 * @generated
	 */
	EClass getColonneDonnee();

	/**
	 * Returns the meta object for class '{@link tableur.ColonneExterne <em>Colonne Externe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne Externe</em>'.
	 * @see tableur.ColonneExterne
	 * @generated
	 */
	EClass getColonneExterne();

	/**
	 * Returns the meta object for the reference '{@link tableur.ColonneExterne#getTableExterne <em>Table Externe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Externe</em>'.
	 * @see tableur.ColonneExterne#getTableExterne()
	 * @see #getColonneExterne()
	 * @generated
	 */
	EReference getColonneExterne_TableExterne();

	/**
	 * Returns the meta object for the reference '{@link tableur.ColonneExterne#getColonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colonne</em>'.
	 * @see tableur.ColonneExterne#getColonne()
	 * @see #getColonneExterne()
	 * @generated
	 */
	EReference getColonneExterne_Colonne();

	/**
	 * Returns the meta object for enum '{@link tableur.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive</em>'.
	 * @see tableur.Primitive
	 * @generated
	 */
	EEnum getPrimitive();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TableurFactory getTableurFactory();

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
		 * The meta object literal for the '{@link tableur.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tableur.impl.TableImpl
		 * @see tableur.impl.TableurPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Colonnes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLONNES = eINSTANCE.getTable_Colonnes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Colonne ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLONNE_ID = eINSTANCE.getTable_ColonneID();

		/**
		 * The meta object literal for the '{@link tableur.impl.ColonneImpl <em>Colonne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tableur.impl.ColonneImpl
		 * @see tableur.impl.TableurPackageImpl#getColonne()
		 * @generated
		 */
		EClass COLONNE = eINSTANCE.getColonne();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__TYPE = eINSTANCE.getColonne_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__NAME = eINSTANCE.getColonne_Name();

		/**
		 * The meta object literal for the '{@link tableur.impl.DonneeBruteImpl <em>Donnee Brute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tableur.impl.DonneeBruteImpl
		 * @see tableur.impl.TableurPackageImpl#getDonneeBrute()
		 * @generated
		 */
		EClass DONNEE_BRUTE = eINSTANCE.getDonneeBrute();

		/**
		 * The meta object literal for the '{@link tableur.impl.DonneeCalculeeImpl <em>Donnee Calculee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tableur.impl.DonneeCalculeeImpl
		 * @see tableur.impl.TableurPackageImpl#getDonneeCalculee()
		 * @generated
		 */
		EClass DONNEE_CALCULEE = eINSTANCE.getDonneeCalculee();

		/**
		 * The meta object literal for the '<em><b>Fonction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DONNEE_CALCULEE__FONCTION = eINSTANCE.getDonneeCalculee_Fonction();

		/**
		 * The meta object literal for the '<em><b>Nom Fonction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONNEE_CALCULEE__NOM_FONCTION = eINSTANCE.getDonneeCalculee_NomFonction();

		/**
		 * The meta object literal for the '{@link tableur.impl.ColonneIDImpl <em>Colonne ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tableur.impl.ColonneIDImpl
		 * @see tableur.impl.TableurPackageImpl#getColonneID()
		 * @generated
		 */
		EClass COLONNE_ID = eINSTANCE.getColonneID();

		/**
		 * The meta object literal for the '{@link tableur.impl.ColonneDonneeImpl <em>Colonne Donnee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tableur.impl.ColonneDonneeImpl
		 * @see tableur.impl.TableurPackageImpl#getColonneDonnee()
		 * @generated
		 */
		EClass COLONNE_DONNEE = eINSTANCE.getColonneDonnee();

		/**
		 * The meta object literal for the '{@link tableur.impl.ColonneExterneImpl <em>Colonne Externe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tableur.impl.ColonneExterneImpl
		 * @see tableur.impl.TableurPackageImpl#getColonneExterne()
		 * @generated
		 */
		EClass COLONNE_EXTERNE = eINSTANCE.getColonneExterne();

		/**
		 * The meta object literal for the '<em><b>Table Externe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE_EXTERNE__TABLE_EXTERNE = eINSTANCE.getColonneExterne_TableExterne();

		/**
		 * The meta object literal for the '<em><b>Colonne</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE_EXTERNE__COLONNE = eINSTANCE.getColonneExterne_Colonne();

		/**
		 * The meta object literal for the '{@link tableur.Primitive <em>Primitive</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tableur.Primitive
		 * @see tableur.impl.TableurPackageImpl#getPrimitive()
		 * @generated
		 */
		EEnum PRIMITIVE = eINSTANCE.getPrimitive();

	}

} //TableurPackage
