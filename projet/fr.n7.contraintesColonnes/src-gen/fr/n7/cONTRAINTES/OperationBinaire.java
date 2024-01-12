/**
 * generated by Xtext 2.23.0
 */
package fr.n7.cONTRAINTES;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Binaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.cONTRAINTES.OperationBinaire#getContrainteGauche <em>Contrainte Gauche</em>}</li>
 *   <li>{@link fr.n7.cONTRAINTES.OperationBinaire#getOperande <em>Operande</em>}</li>
 *   <li>{@link fr.n7.cONTRAINTES.OperationBinaire#getContrainteDroite <em>Contrainte Droite</em>}</li>
 * </ul>
 *
 * @see fr.n7.cONTRAINTES.CONTRAINTESPackage#getOperationBinaire()
 * @model
 * @generated
 */
public interface OperationBinaire extends Expression
{
  /**
   * Returns the value of the '<em><b>Contrainte Gauche</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contrainte Gauche</em>' containment reference.
   * @see #setContrainteGauche(Expression)
   * @see fr.n7.cONTRAINTES.CONTRAINTESPackage#getOperationBinaire_ContrainteGauche()
   * @model containment="true"
   * @generated
   */
  Expression getContrainteGauche();

  /**
   * Sets the value of the '{@link fr.n7.cONTRAINTES.OperationBinaire#getContrainteGauche <em>Contrainte Gauche</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contrainte Gauche</em>' containment reference.
   * @see #getContrainteGauche()
   * @generated
   */
  void setContrainteGauche(Expression value);

  /**
   * Returns the value of the '<em><b>Operande</b></em>' attribute.
   * The literals are from the enumeration {@link fr.n7.cONTRAINTES.OperandeBinaireType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operande</em>' attribute.
   * @see fr.n7.cONTRAINTES.OperandeBinaireType
   * @see #setOperande(OperandeBinaireType)
   * @see fr.n7.cONTRAINTES.CONTRAINTESPackage#getOperationBinaire_Operande()
   * @model
   * @generated
   */
  OperandeBinaireType getOperande();

  /**
   * Sets the value of the '{@link fr.n7.cONTRAINTES.OperationBinaire#getOperande <em>Operande</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operande</em>' attribute.
   * @see fr.n7.cONTRAINTES.OperandeBinaireType
   * @see #getOperande()
   * @generated
   */
  void setOperande(OperandeBinaireType value);

  /**
   * Returns the value of the '<em><b>Contrainte Droite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contrainte Droite</em>' containment reference.
   * @see #setContrainteDroite(Expression)
   * @see fr.n7.cONTRAINTES.CONTRAINTESPackage#getOperationBinaire_ContrainteDroite()
   * @model containment="true"
   * @generated
   */
  Expression getContrainteDroite();

  /**
   * Sets the value of the '{@link fr.n7.cONTRAINTES.OperationBinaire#getContrainteDroite <em>Contrainte Droite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contrainte Droite</em>' containment reference.
   * @see #getContrainteDroite()
   * @generated
   */
  void setContrainteDroite(Expression value);

} // OperationBinaire
