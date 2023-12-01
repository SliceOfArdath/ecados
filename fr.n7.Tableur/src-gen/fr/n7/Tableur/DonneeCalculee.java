/**
 */
package fr.n7.Tableur;

import Traitement.Fonction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Donnee Calculee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.Tableur.DonneeCalculee#getFonction <em>Fonction</em>}</li>
 * </ul>
 *
 * @see fr.n7.Tableur.TableurPackage#getDonneeCalculee()
 * @model
 * @generated
 */
public interface DonneeCalculee extends Colonne {

	/**
	 * Returns the value of the '<em><b>Fonction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction</em>' reference.
	 * @see #setFonction(Fonction)
	 * @see fr.n7.Tableur.TableurPackage#getDonneeCalculee_Fonction()
	 * @model
	 * @generated
	 */
	Fonction getFonction();

	/**
	 * Sets the value of the '{@link fr.n7.Tableur.DonneeCalculee#getFonction <em>Fonction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction</em>' reference.
	 * @see #getFonction()
	 * @generated
	 */
	void setFonction(Fonction value);
} // DonneeCalculee
