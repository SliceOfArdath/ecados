/**
 */
package tableur.impl;

import fr.n7.algorithme.AlgorithmePackage;

import fr.n7.algorithme.impl.AlgorithmePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tableur.Colonne;
import tableur.ColonneDonnee;
import tableur.ColonneExterne;
import tableur.ColonneID;
import tableur.DonneeBrute;
import tableur.DonneeCalculee;
import tableur.Primitive;
import tableur.Table;
import tableur.TableurFactory;
import tableur.TableurPackage;

import traitement.TraitementPackage;

import traitement.impl.TraitementPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TableurPackageImpl extends EPackageImpl implements TableurPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass donneeBruteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass donneeCalculeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneDonneeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneExterneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveEEnum = null;

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
	 * @see tableur.TableurPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TableurPackageImpl() {
		super(eNS_URI, TableurFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TableurPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TableurPackage init() {
		if (isInited)
			return (TableurPackage) EPackage.Registry.INSTANCE.getEPackage(TableurPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTableurPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TableurPackageImpl theTableurPackage = registeredTableurPackage instanceof TableurPackageImpl
				? (TableurPackageImpl) registeredTableurPackage
				: new TableurPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AlgorithmePackage.eNS_URI);
		AlgorithmePackageImpl theAlgorithmePackage = (AlgorithmePackageImpl) (registeredPackage instanceof AlgorithmePackageImpl
				? registeredPackage
				: AlgorithmePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TraitementPackage.eNS_URI);
		TraitementPackageImpl theTraitementPackage = (TraitementPackageImpl) (registeredPackage instanceof TraitementPackageImpl
				? registeredPackage
				: TraitementPackage.eINSTANCE);

		// Create package meta-data objects
		theTableurPackage.createPackageContents();
		theAlgorithmePackage.createPackageContents();
		theTraitementPackage.createPackageContents();

		// Initialize created meta-data
		theTableurPackage.initializePackageContents();
		theAlgorithmePackage.initializePackageContents();
		theTraitementPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTableurPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TableurPackage.eNS_URI, theTableurPackage);
		return theTableurPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Colonnes() {
		return (EReference) tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Name() {
		return (EAttribute) tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_ColonneID() {
		return (EReference) tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColonne() {
		return colonneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColonne_Type() {
		return (EAttribute) colonneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColonne_Name() {
		return (EAttribute) colonneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDonneeBrute() {
		return donneeBruteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDonneeCalculee() {
		return donneeCalculeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDonneeCalculee_Fonction() {
		return (EReference) donneeCalculeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColonneID() {
		return colonneIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColonneDonnee() {
		return colonneDonneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColonneExterne() {
		return colonneExterneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColonneExterne_TableExterne() {
		return (EReference) colonneExterneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColonneExterne_Colonne() {
		return (EReference) colonneExterneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitive() {
		return primitiveEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableurFactory getTableurFactory() {
		return (TableurFactory) getEFactoryInstance();
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
		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__COLONNES);
		createEAttribute(tableEClass, TABLE__NAME);
		createEReference(tableEClass, TABLE__COLONNE_ID);

		colonneEClass = createEClass(COLONNE);
		createEAttribute(colonneEClass, COLONNE__TYPE);
		createEAttribute(colonneEClass, COLONNE__NAME);

		donneeBruteEClass = createEClass(DONNEE_BRUTE);

		donneeCalculeeEClass = createEClass(DONNEE_CALCULEE);
		createEReference(donneeCalculeeEClass, DONNEE_CALCULEE__FONCTION);

		colonneIDEClass = createEClass(COLONNE_ID);

		colonneDonneeEClass = createEClass(COLONNE_DONNEE);

		colonneExterneEClass = createEClass(COLONNE_EXTERNE);
		createEReference(colonneExterneEClass, COLONNE_EXTERNE__TABLE_EXTERNE);
		createEReference(colonneExterneEClass, COLONNE_EXTERNE__COLONNE);

		// Create enums
		primitiveEEnum = createEEnum(PRIMITIVE);
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
		TraitementPackage theTraitementPackage = (TraitementPackage) EPackage.Registry.INSTANCE
				.getEPackage(TraitementPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		donneeBruteEClass.getESuperTypes().add(this.getColonneDonnee());
		donneeCalculeeEClass.getESuperTypes().add(this.getColonneDonnee());
		colonneIDEClass.getESuperTypes().add(this.getColonne());
		colonneDonneeEClass.getESuperTypes().add(this.getColonne());
		colonneExterneEClass.getESuperTypes().add(this.getColonneDonnee());

		// Initialize classes, features, and operations; add parameters
		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Colonnes(), this.getColonneDonnee(), null, "colonnes", null, 0, -1, Table.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Table.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_ColonneID(), this.getColonneID(), null, "colonneID", null, 1, 1, Table.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneEClass, Colonne.class, "Colonne", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColonne_Type(), this.getPrimitive(), "type", null, 1, 1, Colonne.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColonne_Name(), ecorePackage.getEString(), "name", null, 1, 1, Colonne.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(donneeBruteEClass, DonneeBrute.class, "DonneeBrute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(donneeCalculeeEClass, DonneeCalculee.class, "DonneeCalculee", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDonneeCalculee_Fonction(), theTraitementPackage.getFonction(), null, "fonction", null, 1, 1,
				DonneeCalculee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneIDEClass, ColonneID.class, "ColonneID", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(colonneDonneeEClass, ColonneDonnee.class, "ColonneDonnee", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(colonneExterneEClass, ColonneExterne.class, "ColonneExterne", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColonneExterne_TableExterne(), this.getTable(), null, "tableExterne", null, 1, 1,
				ColonneExterne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColonneExterne_Colonne(), this.getDonneeBrute(), null, "colonne", null, 1, 1,
				ColonneExterne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(primitiveEEnum, Primitive.class, "Primitive");
		addEEnumLiteral(primitiveEEnum, Primitive.STRING);
		addEEnumLiteral(primitiveEEnum, Primitive.INT);
		addEEnumLiteral(primitiveEEnum, Primitive.FLOAT);
		addEEnumLiteral(primitiveEEnum, Primitive.DATE);
		addEEnumLiteral(primitiveEEnum, Primitive.DATE_TIME);

		// Create resource
		createResource(eNS_URI);
	}

} //TableurPackageImpl
