/**
 */
package fr.n7.Tableur;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.Tableur.Colonne#getType <em>Type</em>}</li>
 *   <li>{@link fr.n7.Tableur.Colonne#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see fr.n7.Tableur.TableurPackage#getColonne()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Colonne extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.n7.Tableur.Primitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.n7.Tableur.Primitive
	 * @see #setType(Primitive)
	 * @see fr.n7.Tableur.TableurPackage#getColonne_Type()
	 * @model required="true"
	 * @generated
	 */
	Primitive getType();

	/**
	 * Sets the value of the '{@link fr.n7.Tableur.Colonne#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.n7.Tableur.Primitive
	 * @see #getType()
	 * @generated
	 */
	void setType(Primitive value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fr.n7.Tableur.TableurPackage#getColonne_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.n7.Tableur.Colonne#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Colonne
