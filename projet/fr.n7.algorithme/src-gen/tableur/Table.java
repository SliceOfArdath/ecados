/**
 */
package tableur;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tableur.Table#getColonnes <em>Colonnes</em>}</li>
 *   <li>{@link tableur.Table#getName <em>Name</em>}</li>
 *   <li>{@link tableur.Table#getColonneID <em>Colonne ID</em>}</li>
 * </ul>
 *
 * @see tableur.TableurPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Colonnes</b></em>' containment reference list.
	 * The list contents are of type {@link tableur.ColonneDonnee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonnes</em>' containment reference list.
	 * @see tableur.TableurPackage#getTable_Colonnes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ColonneDonnee> getColonnes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tableur.TableurPackage#getTable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tableur.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Colonne ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne ID</em>' containment reference.
	 * @see #setColonneID(ColonneID)
	 * @see tableur.TableurPackage#getTable_ColonneID()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	ColonneID getColonneID();

	/**
	 * Sets the value of the '{@link tableur.Table#getColonneID <em>Colonne ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colonne ID</em>' containment reference.
	 * @see #getColonneID()
	 * @generated
	 */
	void setColonneID(ColonneID value);

} // Table
