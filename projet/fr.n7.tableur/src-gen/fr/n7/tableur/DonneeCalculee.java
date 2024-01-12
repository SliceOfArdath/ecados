/**
 */
package fr.n7.tableur;

import traitement.Fonction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Donnee Calculee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.tableur.DonneeCalculee#getFonction <em>Fonction</em>}</li>
 * </ul>
 *
 * @see fr.n7.tableur.TableurPackage#getDonneeCalculee()
 * @model
 * @generated
 */
public interface DonneeCalculee extends ColonneDonnee {
	/**
	 * Returns the value of the '<em><b>Fonction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction</em>' reference.
	 * @see #setFonction(Fonction)
	 * @see fr.n7.tableur.TableurPackage#getDonneeCalculee_Fonction()
	 * @model required="true"
	 * @generated
	 */
	Fonction getFonction();

	/**
	 * Sets the value of the '{@link fr.n7.tableur.DonneeCalculee#getFonction <em>Fonction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction</em>' reference.
	 * @see #getFonction()
	 * @generated
	 */
	void setFonction(Fonction value);

} // DonneeCalculee