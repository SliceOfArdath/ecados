/**
 */
package fr.n7.algorithme;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Binaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.algorithme.OperationBinaire#getEGauche <em>EGauche</em>}</li>
 *   <li>{@link fr.n7.algorithme.OperationBinaire#getEDroite <em>EDroite</em>}</li>
 * </ul>
 *
 * @see fr.n7.algorithme.AlgorithmePackage#getOperationBinaire()
 * @model
 * @generated
 */
public interface OperationBinaire extends Expression {
	/**
	 * Returns the value of the '<em><b>EGauche</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EGauche</em>' reference.
	 * @see #setEGauche(Expression)
	 * @see fr.n7.algorithme.AlgorithmePackage#getOperationBinaire_EGauche()
	 * @model required="true"
	 * @generated
	 */
	Expression getEGauche();

	/**
	 * Sets the value of the '{@link fr.n7.algorithme.OperationBinaire#getEGauche <em>EGauche</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EGauche</em>' reference.
	 * @see #getEGauche()
	 * @generated
	 */
	void setEGauche(Expression value);

	/**
	 * Returns the value of the '<em><b>EDroite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EDroite</em>' reference.
	 * @see #setEDroite(Expression)
	 * @see fr.n7.algorithme.AlgorithmePackage#getOperationBinaire_EDroite()
	 * @model required="true"
	 * @generated
	 */
	Expression getEDroite();

	/**
	 * Sets the value of the '{@link fr.n7.algorithme.OperationBinaire#getEDroite <em>EDroite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EDroite</em>' reference.
	 * @see #getEDroite()
	 * @generated
	 */
	void setEDroite(Expression value);

} // OperationBinaire
