/**
 */
package fr.n7.tableur;

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
 *   <li>{@link fr.n7.tableur.Colonne#getType <em>Type</em>}</li>
 *   <li>{@link fr.n7.tableur.Colonne#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.n7.tableur.TableurPackage#getColonne()
 * @model abstract="true"
 * @generated
 */
public interface Colonne extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.n7.tableur.Primitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.n7.tableur.Primitive
	 * @see #setType(Primitive)
	 * @see fr.n7.tableur.TableurPackage#getColonne_Type()
	 * @model required="true"
	 * @generated
	 */
	Primitive getType();

	/**
	 * Sets the value of the '{@link fr.n7.tableur.Colonne#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.n7.tableur.Primitive
	 * @see #getType()
	 * @generated
	 */
	void setType(Primitive value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.n7.tableur.TableurPackage#getColonne_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.n7.tableur.Colonne#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Colonne