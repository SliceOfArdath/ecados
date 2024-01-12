/**
 */
package fr.n7.algorithme;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Unaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.algorithme.OperationUnaire#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see fr.n7.algorithme.AlgorithmePackage#getOperationUnaire()
 * @model
 * @generated
 */
public interface OperationUnaire extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(Expression)
	 * @see fr.n7.algorithme.AlgorithmePackage#getOperationUnaire_Expression()
	 * @model required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link fr.n7.algorithme.OperationUnaire#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // OperationUnaire
