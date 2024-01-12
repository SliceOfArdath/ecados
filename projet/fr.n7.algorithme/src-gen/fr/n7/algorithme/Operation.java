/**
 */
package fr.n7.algorithme;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.algorithme.Operation#getOperande <em>Operande</em>}</li>
 * </ul>
 *
 * @see fr.n7.algorithme.AlgorithmePackage#getOperation()
 * @model abstract="true"
 * @generated
 */
public interface Operation extends Expression {
	/**
	 * Returns the value of the '<em><b>Operande</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operande</em>' attribute.
	 * @see #setOperande(String)
	 * @see fr.n7.algorithme.AlgorithmePackage#getOperation_Operande()
	 * @model required="true"
	 * @generated
	 */
	String getOperande();

	/**
	 * Sets the value of the '{@link fr.n7.algorithme.Operation#getOperande <em>Operande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operande</em>' attribute.
	 * @see #getOperande()
	 * @generated
	 */
	void setOperande(String value);

} // Operation
