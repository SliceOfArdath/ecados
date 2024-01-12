/**
 */
package tableur.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tableur.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tableur.TableurPackage
 * @generated
 */
public class TableurAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TableurPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableurAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TableurPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableurSwitch<Adapter> modelSwitch = new TableurSwitch<Adapter>() {
		@Override
		public Adapter caseTable(Table object) {
			return createTableAdapter();
		}

		@Override
		public Adapter caseColonne(Colonne object) {
			return createColonneAdapter();
		}

		@Override
		public Adapter caseDonneeBrute(DonneeBrute object) {
			return createDonneeBruteAdapter();
		}

		@Override
		public Adapter caseDonneeCalculee(DonneeCalculee object) {
			return createDonneeCalculeeAdapter();
		}

		@Override
		public Adapter caseColonneID(ColonneID object) {
			return createColonneIDAdapter();
		}

		@Override
		public Adapter caseColonneDonnee(ColonneDonnee object) {
			return createColonneDonneeAdapter();
		}

		@Override
		public Adapter caseColonneExterne(ColonneExterne object) {
			return createColonneExterneAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link tableur.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tableur.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tableur.Colonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tableur.Colonne
	 * @generated
	 */
	public Adapter createColonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tableur.DonneeBrute <em>Donnee Brute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tableur.DonneeBrute
	 * @generated
	 */
	public Adapter createDonneeBruteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tableur.DonneeCalculee <em>Donnee Calculee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tableur.DonneeCalculee
	 * @generated
	 */
	public Adapter createDonneeCalculeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tableur.ColonneID <em>Colonne ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tableur.ColonneID
	 * @generated
	 */
	public Adapter createColonneIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tableur.ColonneDonnee <em>Colonne Donnee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tableur.ColonneDonnee
	 * @generated
	 */
	public Adapter createColonneDonneeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tableur.ColonneExterne <em>Colonne Externe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tableur.ColonneExterne
	 * @generated
	 */
	public Adapter createColonneExterneAdapter() {
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

} //TableurAdapterFactory
