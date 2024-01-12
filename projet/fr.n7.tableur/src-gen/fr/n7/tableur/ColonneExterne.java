/**
 */
package fr.n7.tableur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne Externe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.tableur.ColonneExterne#getTableExterne <em>Table Externe</em>}</li>
 *   <li>{@link fr.n7.tableur.ColonneExterne#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @see fr.n7.tableur.TableurPackage#getColonneExterne()
 * @model
 * @generated
 */
public interface ColonneExterne extends ColonneDonnee {
	/**
	 * Returns the value of the '<em><b>Table Externe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Externe</em>' reference.
	 * @see #setTableExterne(Table)
	 * @see fr.n7.tableur.TableurPackage#getColonneExterne_TableExterne()
	 * @model required="true"
	 * @generated
	 */
	Table getTableExterne();

	/**
	 * Sets the value of the '{@link fr.n7.tableur.ColonneExterne#getTableExterne <em>Table Externe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Externe</em>' reference.
	 * @see #getTableExterne()
	 * @generated
	 */
	void setTableExterne(Table value);

	/**
	 * Returns the value of the '<em><b>Colonne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne</em>' reference.
	 * @see #setColonne(ColonneDonnee)
	 * @see fr.n7.tableur.TableurPackage#getColonneExterne_Colonne()
	 * @model required="true"
	 * @generated
	 */
	ColonneDonnee getColonne();

	/**
	 * Sets the value of the '{@link fr.n7.tableur.ColonneExterne#getColonne <em>Colonne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colonne</em>' reference.
	 * @see #getColonne()
	 * @generated
	 */
	void setColonne(ColonneDonnee value);

} // ColonneExterne
