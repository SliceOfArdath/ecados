/**
 */
package fr.n7.algorithme;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see fr.n7.algorithme.AlgorithmeFactory
 * @model kind="package"
 * @generated
 */
public interface AlgorithmePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "algorithme";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/algorithme";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "algorithme";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgorithmePackage eINSTANCE = fr.n7.algorithme.impl.AlgorithmePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.n7.algorithme.impl.AlgorithmeImpl <em>Algorithme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.algorithme.impl.AlgorithmeImpl
	 * @see fr.n7.algorithme.impl.AlgorithmePackageImpl#getAlgorithme()
	 * @generated
	 */
	int ALGORITHME = 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__EXPRESSIONS = 0;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__SORTIE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__NAME = 2;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__ENTREES = 3;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__TABLE = 4;

	/**
	 * The number of structural features of the '<em>Algorithme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Algorithme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.n7.algorithme.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.algorithme.impl.ExpressionImpl
	 * @see fr.n7.algorithme.impl.AlgorithmePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.n7.algorithme.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.algorithme.impl.OperationImpl
	 * @see fr.n7.algorithme.impl.AlgorithmePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Operande</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERANDE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.n7.algorithme.impl.OperationBinaireImpl <em>Operation Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.algorithme.impl.OperationBinaireImpl
	 * @see fr.n7.algorithme.impl.AlgorithmePackageImpl#getOperationBinaire()
	 * @generated
	 */
	int OPERATION_BINAIRE = 3;

	/**
	 * The feature id for the '<em><b>EGauche</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE__EGAUCHE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EDroite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE__EDROITE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.n7.algorithme.impl.OperationUnaireImpl <em>Operation Unaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.algorithme.impl.OperationUnaireImpl
	 * @see fr.n7.algorithme.impl.AlgorithmePackageImpl#getOperationUnaire()
	 * @generated
	 */
	int OPERATION_UNAIRE = 4;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_UNAIRE__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_UNAIRE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operation Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_UNAIRE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.n7.algorithme.impl.ConstanteImpl <em>Constante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.algorithme.impl.ConstanteImpl
	 * @see fr.n7.algorithme.impl.AlgorithmePackageImpl#getConstante()
	 * @generated
	 */
	int CONSTANTE = 5;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__VALEUR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.n7.algorithme.impl.EntreeImpl <em>Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.algorithme.impl.EntreeImpl
	 * @see fr.n7.algorithme.impl.AlgorithmePackageImpl#getEntree()
	 * @generated
	 */
	int ENTREE = 6;

	/**
	 * The feature id for the '<em><b>Colonne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__COLONNE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.n7.algorithme.impl.SortieImpl <em>Sortie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.algorithme.impl.SortieImpl
	 * @see fr.n7.algorithme.impl.AlgorithmePackageImpl#getSortie()
	 * @generated
	 */
	int SORTIE = 7;

	/**
	 * The feature id for the '<em><b>Colonne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__COLONNE = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link fr.n7.algorithme.Algorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithme</em>'.
	 * @see fr.n7.algorithme.Algorithme
	 * @generated
	 */
	EClass getAlgorithme();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.n7.algorithme.Algorithme#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see fr.n7.algorithme.Algorithme#getExpressions()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EReference getAlgorithme_Expressions();

	/**
	 * Returns the meta object for the containment reference '{@link fr.n7.algorithme.Algorithme#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sortie</em>'.
	 * @see fr.n7.algorithme.Algorithme#getSortie()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EReference getAlgorithme_Sortie();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.algorithme.Algorithme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.n7.algorithme.Algorithme#getName()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EAttribute getAlgorithme_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.n7.algorithme.Algorithme#getEntrees <em>Entrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entrees</em>'.
	 * @see fr.n7.algorithme.Algorithme#getEntrees()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EReference getAlgorithme_Entrees();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.algorithme.Algorithme#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see fr.n7.algorithme.Algorithme#getTable()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EReference getAlgorithme_Table();

	/**
	 * Returns the meta object for class '{@link fr.n7.algorithme.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see fr.n7.algorithme.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link fr.n7.algorithme.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see fr.n7.algorithme.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.algorithme.Operation#getOperande <em>Operande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operande</em>'.
	 * @see fr.n7.algorithme.Operation#getOperande()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Operande();

	/**
	 * Returns the meta object for class '{@link fr.n7.algorithme.OperationBinaire <em>Operation Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Binaire</em>'.
	 * @see fr.n7.algorithme.OperationBinaire
	 * @generated
	 */
	EClass getOperationBinaire();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.algorithme.OperationBinaire#getEGauche <em>EGauche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EGauche</em>'.
	 * @see fr.n7.algorithme.OperationBinaire#getEGauche()
	 * @see #getOperationBinaire()
	 * @generated
	 */
	EReference getOperationBinaire_EGauche();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.algorithme.OperationBinaire#getEDroite <em>EDroite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EDroite</em>'.
	 * @see fr.n7.algorithme.OperationBinaire#getEDroite()
	 * @see #getOperationBinaire()
	 * @generated
	 */
	EReference getOperationBinaire_EDroite();

	/**
	 * Returns the meta object for class '{@link fr.n7.algorithme.OperationUnaire <em>Operation Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Unaire</em>'.
	 * @see fr.n7.algorithme.OperationUnaire
	 * @generated
	 */
	EClass getOperationUnaire();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.algorithme.OperationUnaire#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see fr.n7.algorithme.OperationUnaire#getExpression()
	 * @see #getOperationUnaire()
	 * @generated
	 */
	EReference getOperationUnaire_Expression();

	/**
	 * Returns the meta object for class '{@link fr.n7.algorithme.Constante <em>Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constante</em>'.
	 * @see fr.n7.algorithme.Constante
	 * @generated
	 */
	EClass getConstante();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.algorithme.Constante#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see fr.n7.algorithme.Constante#getValeur()
	 * @see #getConstante()
	 * @generated
	 */
	EAttribute getConstante_Valeur();

	/**
	 * Returns the meta object for class '{@link fr.n7.algorithme.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entree</em>'.
	 * @see fr.n7.algorithme.Entree
	 * @generated
	 */
	EClass getEntree();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.algorithme.Entree#getColonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colonne</em>'.
	 * @see fr.n7.algorithme.Entree#getColonne()
	 * @see #getEntree()
	 * @generated
	 */
	EReference getEntree_Colonne();

	/**
	 * Returns the meta object for class '{@link fr.n7.algorithme.Sortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sortie</em>'.
	 * @see fr.n7.algorithme.Sortie
	 * @generated
	 */
	EClass getSortie();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.algorithme.Sortie#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see fr.n7.algorithme.Sortie#getExpression()
	 * @see #getSortie()
	 * @generated
	 */
	EReference getSortie_Expression();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.algorithme.Sortie#getColonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colonne</em>'.
	 * @see fr.n7.algorithme.Sortie#getColonne()
	 * @see #getSortie()
	 * @generated
	 */
	EReference getSortie_Colonne();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlgorithmeFactory getAlgorithmeFactory();

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
		 * The meta object literal for the '{@link fr.n7.algorithme.impl.AlgorithmeImpl <em>Algorithme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.algorithme.impl.AlgorithmeImpl
		 * @see fr.n7.algorithme.impl.AlgorithmePackageImpl#getAlgorithme()
		 * @generated
		 */
		EClass ALGORITHME = eINSTANCE.getAlgorithme();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHME__EXPRESSIONS = eINSTANCE.getAlgorithme_Expressions();

		/**
		 * The meta object literal for the '<em><b>Sortie</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHME__SORTIE = eINSTANCE.getAlgorithme_Sortie();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHME__NAME = eINSTANCE.getAlgorithme_Name();

		/**
		 * The meta object literal for the '<em><b>Entrees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHME__ENTREES = eINSTANCE.getAlgorithme_Entrees();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHME__TABLE = eINSTANCE.getAlgorithme_Table();

		/**
		 * The meta object literal for the '{@link fr.n7.algorithme.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.algorithme.impl.ExpressionImpl
		 * @see fr.n7.algorithme.impl.AlgorithmePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link fr.n7.algorithme.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.algorithme.impl.OperationImpl
		 * @see fr.n7.algorithme.impl.AlgorithmePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Operande</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__OPERANDE = eINSTANCE.getOperation_Operande();

		/**
		 * The meta object literal for the '{@link fr.n7.algorithme.impl.OperationBinaireImpl <em>Operation Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.algorithme.impl.OperationBinaireImpl
		 * @see fr.n7.algorithme.impl.AlgorithmePackageImpl#getOperationBinaire()
		 * @generated
		 */
		EClass OPERATION_BINAIRE = eINSTANCE.getOperationBinaire();

		/**
		 * The meta object literal for the '<em><b>EGauche</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BINAIRE__EGAUCHE = eINSTANCE.getOperationBinaire_EGauche();

		/**
		 * The meta object literal for the '<em><b>EDroite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BINAIRE__EDROITE = eINSTANCE.getOperationBinaire_EDroite();

		/**
		 * The meta object literal for the '{@link fr.n7.algorithme.impl.OperationUnaireImpl <em>Operation Unaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.algorithme.impl.OperationUnaireImpl
		 * @see fr.n7.algorithme.impl.AlgorithmePackageImpl#getOperationUnaire()
		 * @generated
		 */
		EClass OPERATION_UNAIRE = eINSTANCE.getOperationUnaire();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_UNAIRE__EXPRESSION = eINSTANCE.getOperationUnaire_Expression();

		/**
		 * The meta object literal for the '{@link fr.n7.algorithme.impl.ConstanteImpl <em>Constante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.algorithme.impl.ConstanteImpl
		 * @see fr.n7.algorithme.impl.AlgorithmePackageImpl#getConstante()
		 * @generated
		 */
		EClass CONSTANTE = eINSTANCE.getConstante();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTE__VALEUR = eINSTANCE.getConstante_Valeur();

		/**
		 * The meta object literal for the '{@link fr.n7.algorithme.impl.EntreeImpl <em>Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.algorithme.impl.EntreeImpl
		 * @see fr.n7.algorithme.impl.AlgorithmePackageImpl#getEntree()
		 * @generated
		 */
		EClass ENTREE = eINSTANCE.getEntree();

		/**
		 * The meta object literal for the '<em><b>Colonne</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTREE__COLONNE = eINSTANCE.getEntree_Colonne();

		/**
		 * The meta object literal for the '{@link fr.n7.algorithme.impl.SortieImpl <em>Sortie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.algorithme.impl.SortieImpl
		 * @see fr.n7.algorithme.impl.AlgorithmePackageImpl#getSortie()
		 * @generated
		 */
		EClass SORTIE = eINSTANCE.getSortie();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTIE__EXPRESSION = eINSTANCE.getSortie_Expression();

		/**
		 * The meta object literal for the '<em><b>Colonne</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTIE__COLONNE = eINSTANCE.getSortie_Colonne();

	}

} //AlgorithmePackage
