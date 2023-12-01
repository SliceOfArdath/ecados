/**
 */
package Traitement;

import fr.n7.Tableur.Colonne;
import fr.n7.Tableur.DonneeCalculee;
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
 *   <li>{@link Traitement.Fonction#getEntrees <em>Entrees</em>}</li>
 *   <li>{@link Traitement.Fonction#getSorties <em>Sorties</em>}</li>
 * </ul>
 *
 * @see Traitement.TraitementPackage#getFonction()
 * @model
 * @generated
 */
public interface Fonction extends EObject {

	/**
	 * Returns the value of the '<em><b>Entrees</b></em>' reference list.
	 * The list contents are of type {@link fr.n7.Tableur.Colonne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrees</em>' reference list.
	 * @see Traitement.TraitementPackage#getFonction_Entrees()
	 * @model
	 * @generated
	 */
	EList<Colonne> getEntrees();

	/**
	 * Returns the value of the '<em><b>Sorties</b></em>' reference list.
	 * The list contents are of type {@link fr.n7.Tableur.DonneeCalculee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorties</em>' reference list.
	 * @see Traitement.TraitementPackage#getFonction_Sorties()
	 * @model
	 * @generated
	 */
	EList<DonneeCalculee> getSorties();
} // Fonction
