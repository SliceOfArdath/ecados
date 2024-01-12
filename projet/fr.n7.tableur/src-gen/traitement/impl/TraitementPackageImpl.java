/**
 */
package traitement.impl;

import fr.n7.tableur.TableurPackage;

import fr.n7.tableur.impl.TableurPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import traitement.Fonction;
import traitement.TraitementFactory;
import traitement.TraitementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraitementPackageImpl extends EPackageImpl implements TraitementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fonctionEClass = null;

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
	 * @see traitement.TraitementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TraitementPackageImpl() {
		super(eNS_URI, TraitementFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TraitementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TraitementPackage init() {
		if (isInited)
			return (TraitementPackage) EPackage.Registry.INSTANCE.getEPackage(TraitementPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTraitementPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TraitementPackageImpl theTraitementPackage = registeredTraitementPackage instanceof TraitementPackageImpl
				? (TraitementPackageImpl) registeredTraitementPackage
				: new TraitementPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TableurPackage.eNS_URI);
		TableurPackageImpl theTableurPackage = (TableurPackageImpl) (registeredPackage instanceof TableurPackageImpl
				? registeredPackage
				: TableurPackage.eINSTANCE);

		// Create package meta-data objects
		theTraitementPackage.createPackageContents();
		theTableurPackage.createPackageContents();

		// Initialize created meta-data
		theTraitementPackage.initializePackageContents();
		theTableurPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTraitementPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TraitementPackage.eNS_URI, theTraitementPackage);
		return theTraitementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFonction() {
		return fonctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFonction_Chemin() {
		return (EAttribute) fonctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFonction_Name() {
		return (EAttribute) fonctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFonction_Entrees() {
		return (EReference) fonctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFonction_Sorties() {
		return (EReference) fonctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFonction_Table() {
		return (EReference) fonctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraitementFactory getTraitementFactory() {
		return (TraitementFactory) getEFactoryInstance();
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
		fonctionEClass = createEClass(FONCTION);
		createEAttribute(fonctionEClass, FONCTION__CHEMIN);
		createEAttribute(fonctionEClass, FONCTION__NAME);
		createEReference(fonctionEClass, FONCTION__ENTREES);
		createEReference(fonctionEClass, FONCTION__SORTIES);
		createEReference(fonctionEClass, FONCTION__TABLE);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(fonctionEClass, Fonction.class, "Fonction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFonction_Chemin(), ecorePackage.getEString(), "chemin", null, 1, 1, Fonction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFonction_Name(), ecorePackage.getEString(), "name", null, 1, 1, Fonction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFonction_Entrees(), theTableurPackage.getColonneDonnee(), null, "entrees", null, 0, -1,
				Fonction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFonction_Sorties(), theTableurPackage.getDonneeCalculee(), null, "sorties", null, 0, -1,
				Fonction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFonction_Table(), theTableurPackage.getTable(), null, "table", null, 1, 1, Fonction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TraitementPackageImpl
