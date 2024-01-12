/**
 */
package traitement;

import fr.n7.tableur.ColonneDonnee;
import fr.n7.tableur.DonneeCalculee;

import fr.n7.tableur.Table;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fonction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link traitement.Fonction#getChemin <em>Chemin</em>}</li>
 *   <li>{@link traitement.Fonction#getName <em>Name</em>}</li>
 *   <li>{@link traitement.Fonction#getEntrees <em>Entrees</em>}</li>
 *   <li>{@link traitement.Fonction#getSorties <em>Sorties</em>}</li>
 *   <li>{@link traitement.Fonction#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see traitement.TraitementPackage#getFonction()
 * @model
 * @generated
 */
public interface Fonction extends EObject {
	/**
	 * Returns the value of the '<em><b>Chemin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chemin</em>' attribute.
	 * @see #setChemin(String)
	 * @see traitement.TraitementPackage#getFonction_Chemin()
	 * @model required="true"
	 * @generated
	 */
	String getChemin();

	/**
	 * Sets the value of the '{@link traitement.Fonction#getChemin <em>Chemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chemin</em>' attribute.
	 * @see #getChemin()
	 * @generated
	 */
	void setChemin(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see traitement.TraitementPackage#getFonction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link traitement.Fonction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entrees</b></em>' reference list.
	 * The list contents are of type {@link fr.n7.tableur.ColonneDonnee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrees</em>' reference list.
	 * @see traitement.TraitementPackage#getFonction_Entrees()
	 * @model
	 * @generated
	 */
	EList<ColonneDonnee> getEntrees();

	/**
	 * Returns the value of the '<em><b>Sorties</b></em>' reference list.
	 * The list contents are of type {@link fr.n7.tableur.DonneeCalculee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorties</em>' reference list.
	 * @see traitement.TraitementPackage#getFonction_Sorties()
	 * @model
	 * @generated
	 */
	EList<DonneeCalculee> getSorties();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Table)
	 * @see traitement.TraitementPackage#getFonction_Table()
	 * @model required="true"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link traitement.Fonction#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

} // Fonction
