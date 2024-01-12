/**
 */
package tableur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne Externe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tableur.ColonneExterne#getTableExterne <em>Table Externe</em>}</li>
 *   <li>{@link tableur.ColonneExterne#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @see tableur.TableurPackage#getColonneExterne()
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
	 * @see tableur.TableurPackage#getColonneExterne_TableExterne()
	 * @model required="true"
	 * @generated
	 */
	Table getTableExterne();

	/**
	 * Sets the value of the '{@link tableur.ColonneExterne#getTableExterne <em>Table Externe</em>}' reference.
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
	 * @see tableur.TableurPackage#getColonneExterne_Colonne()
	 * @model required="true"
	 * @generated
	 */
	ColonneDonnee getColonne();

	/**
	 * Sets the value of the '{@link tableur.ColonneExterne#getColonne <em>Colonne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colonne</em>' reference.
	 * @see #getColonne()
	 * @generated
	 */
	void setColonne(ColonneDonnee value);

} // ColonneExterne
