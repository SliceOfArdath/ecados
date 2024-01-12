/**
 */
package fr.n7.tableur;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.n7.tableur.TableurPackage
 * @generated
 */
public interface TableurFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TableurFactory eINSTANCE = fr.n7.tableur.impl.TableurFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Donnee Brute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Donnee Brute</em>'.
	 * @generated
	 */
	DonneeBrute createDonneeBrute();

	/**
	 * Returns a new object of class '<em>Donnee Calculee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Donnee Calculee</em>'.
	 * @generated
	 */
	DonneeCalculee createDonneeCalculee();

	/**
	 * Returns a new object of class '<em>Colonne ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colonne ID</em>'.
	 * @generated
	 */
	ColonneID createColonneID();

	/**
	 * Returns a new object of class '<em>Colonne Externe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colonne Externe</em>'.
	 * @generated
	 */
	ColonneExterne createColonneExterne();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TableurPackage getTableurPackage();

} //TableurFactory
