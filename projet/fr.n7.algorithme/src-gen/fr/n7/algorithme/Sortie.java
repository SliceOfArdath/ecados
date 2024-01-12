/**
 */
package fr.n7.algorithme;

import org.eclipse.emf.ecore.EObject;

import tableur.DonneeCalculee;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sortie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.algorithme.Sortie#getColonne <em>Colonne</em>}</li>
 *   <li>{@link fr.n7.algorithme.Sortie#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see fr.n7.algorithme.AlgorithmePackage#getSortie()
 * @model
 * @generated
 */
public interface Sortie extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(Expression)
	 * @see fr.n7.algorithme.AlgorithmePackage#getSortie_Expression()
	 * @model required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link fr.n7.algorithme.Sortie#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Colonne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne</em>' reference.
	 * @see #setColonne(DonneeCalculee)
	 * @see fr.n7.algorithme.AlgorithmePackage#getSortie_Colonne()
	 * @model required="true"
	 * @generated
	 */
	DonneeCalculee getColonne();

	/**
	 * Sets the value of the '{@link fr.n7.algorithme.Sortie#getColonne <em>Colonne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colonne</em>' reference.
	 * @see #getColonne()
	 * @generated
	 */
	void setColonne(DonneeCalculee value);

} // Sortie
