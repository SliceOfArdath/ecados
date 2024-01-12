/**
 */
package fr.n7.algorithme;

import org.eclipse.emf.ecore.EObject;
import tableur.ColonneDonnee;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.algorithme.Entree#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @see fr.n7.algorithme.AlgorithmePackage#getEntree()
 * @model
 * @generated
 */
public interface Entree extends EObject {
	/**
	 * Returns the value of the '<em><b>Colonne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne</em>' reference.
	 * @see #setColonne(ColonneDonnee)
	 * @see fr.n7.algorithme.AlgorithmePackage#getEntree_Colonne()
	 * @model required="true"
	 * @generated
	 */
	ColonneDonnee getColonne();

	/**
	 * Sets the value of the '{@link fr.n7.algorithme.Entree#getColonne <em>Colonne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colonne</em>' reference.
	 * @see #getColonne()
	 * @generated
	 */
	void setColonne(ColonneDonnee value);

} // Entree
