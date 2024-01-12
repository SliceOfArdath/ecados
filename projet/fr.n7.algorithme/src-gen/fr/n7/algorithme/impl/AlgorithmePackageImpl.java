/**
 */
package fr.n7.algorithme.impl;

import fr.n7.algorithme.Algorithme;
import fr.n7.algorithme.AlgorithmeFactory;
import fr.n7.algorithme.AlgorithmePackage;
import fr.n7.algorithme.Constante;
import fr.n7.algorithme.Entree;
import fr.n7.algorithme.Expression;
import fr.n7.algorithme.Operation;
import fr.n7.algorithme.OperationBinaire;
import fr.n7.algorithme.OperationUnaire;
import fr.n7.algorithme.Sortie;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tableur.TableurPackage;

import tableur.impl.TableurPackageImpl;

import traitement.TraitementPackage;

import traitement.impl.TraitementPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgorithmePackageImpl extends EPackageImpl implements AlgorithmePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationBinaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationUnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortieEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.n7.algorithme.AlgorithmePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlgorithmePackageImpl() {
		super(eNS_URI, AlgorithmeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AlgorithmePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlgorithmePackage init() {
		if (isInited)
			return (AlgorithmePackage) EPackage.Registry.INSTANCE.getEPackage(AlgorithmePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAlgorithmePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AlgorithmePackageImpl theAlgorithmePackage = registeredAlgorithmePackage instanceof AlgorithmePackageImpl
				? (AlgorithmePackageImpl) registeredAlgorithmePackage
				: new AlgorithmePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TableurPackage.eNS_URI);
		TableurPackageImpl theTableurPackage = (TableurPackageImpl) (registeredPackage instanceof TableurPackageImpl
				? registeredPackage
				: TableurPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TraitementPackage.eNS_URI);
		TraitementPackageImpl theTraitementPackage = (TraitementPackageImpl) (registeredPackage instanceof TraitementPackageImpl
				? registeredPackage
				: TraitementPackage.eINSTANCE);

		// Create package meta-data objects
		theAlgorithmePackage.createPackageContents();
		theTableurPackage.createPackageContents();
		theTraitementPackage.createPackageContents();

		// Initialize created meta-data
		theAlgorithmePackage.initializePackageContents();
		theTableurPackage.initializePackageContents();
		theTraitementPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAlgorithmePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlgorithmePackage.eNS_URI, theAlgorithmePackage);
		return theAlgorithmePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgorithme() {
		return algorithmeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithme_Expressions() {
		return (EReference) algorithmeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithme_Sortie() {
		return (EReference) algorithmeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgorithme_Name() {
		return (EAttribute) algorithmeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithme_Entrees() {
		return (EReference) algorithmeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithme_Table() {
		return (EReference) algorithmeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Operande() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationBinaire() {
		return operationBinaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationBinaire_EGauche() {
		return (EReference) operationBinaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationBinaire_EDroite() {
		return (EReference) operationBinaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationUnaire() {
		return operationUnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationUnaire_Expression() {
		return (EReference) operationUnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstante() {
		return constanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstante_Valeur() {
		return (EAttribute) constanteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntree() {
		return entreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntree_Colonne() {
		return (EReference) entreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortie() {
		return sortieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortie_Expression() {
		return (EReference) sortieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortie_Colonne() {
		return (EReference) sortieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmeFactory getAlgorithmeFactory() {
		return (AlgorithmeFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		algorithmeEClass = createEClass(ALGORITHME);
		createEReference(algorithmeEClass, ALGORITHME__EXPRESSIONS);
		createEReference(algorithmeEClass, ALGORITHME__SORTIE);
		createEAttribute(algorithmeEClass, ALGORITHME__NAME);
		createEReference(algorithmeEClass, ALGORITHME__ENTREES);
		createEReference(algorithmeEClass, ALGORITHME__TABLE);

		expressionEClass = createEClass(EXPRESSION);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__OPERANDE);

		operationBinaireEClass = createEClass(OPERATION_BINAIRE);
		createEReference(operationBinaireEClass, OPERATION_BINAIRE__EGAUCHE);
		createEReference(operationBinaireEClass, OPERATION_BINAIRE__EDROITE);

		operationUnaireEClass = createEClass(OPERATION_UNAIRE);
		createEReference(operationUnaireEClass, OPERATION_UNAIRE__EXPRESSION);

		constanteEClass = createEClass(CONSTANTE);
		createEAttribute(constanteEClass, CONSTANTE__VALEUR);

		entreeEClass = createEClass(ENTREE);
		createEReference(entreeEClass, ENTREE__COLONNE);

		sortieEClass = createEClass(SORTIE);
		createEReference(sortieEClass, SORTIE__COLONNE);
		createEReference(sortieEClass, SORTIE__EXPRESSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TableurPackage theTableurPackage = (TableurPackage) EPackage.Registry.INSTANCE
				.getEPackage(TableurPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		operationEClass.getESuperTypes().add(this.getExpression());
		operationBinaireEClass.getESuperTypes().add(this.getExpression());
		operationUnaireEClass.getESuperTypes().add(this.getExpression());
		constanteEClass.getESuperTypes().add(this.getExpression());
		entreeEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(algorithmeEClass, Algorithme.class, "Algorithme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlgorithme_Expressions(), this.getExpression(), null, "expressions", null, 1, -1,
				Algorithme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithme_Sortie(), this.getSortie(), null, "sortie", null, 1, 1, Algorithme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgorithme_Name(), ecorePackage.getEString(), "name", null, 1, 1, Algorithme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithme_Entrees(), this.getEntree(), null, "entrees", null, 0, -1, Algorithme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithme_Table(), theTableurPackage.getTable(), null, "table", null, 1, 1, Algorithme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Operande(), ecorePackage.getEString(), "operande", null, 1, 1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationBinaireEClass, OperationBinaire.class, "OperationBinaire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationBinaire_EGauche(), this.getExpression(), null, "eGauche", null, 1, 1,
				OperationBinaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationBinaire_EDroite(), this.getExpression(), null, "eDroite", null, 1, 1,
				OperationBinaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationUnaireEClass, OperationUnaire.class, "OperationUnaire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationUnaire_Expression(), this.getExpression(), null, "expression", null, 1, 1,
				OperationUnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constanteEClass, Constante.class, "Constante", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstante_Valeur(), ecorePackage.getEInt(), "valeur", null, 1, 1, Constante.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entreeEClass, Entree.class, "Entree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntree_Colonne(), theTableurPackage.getColonneDonnee(), null, "colonne", null, 1, 1,
				Entree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortieEClass, Sortie.class, "Sortie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortie_Colonne(), theTableurPackage.getDonneeCalculee(), null, "colonne", null, 1, 1,
				Sortie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortie_Expression(), this.getExpression(), null, "expression", null, 1, 1, Sortie.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AlgorithmePackageImpl
