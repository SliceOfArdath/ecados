/**
 * generated by Xtext 2.23.0
 */
package fr.n7.cONTRAINTES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contrainte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.cONTRAINTES.Contrainte#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.cONTRAINTES.Contrainte#getColonnes <em>Colonnes</em>}</li>
 *   <li>{@link fr.n7.cONTRAINTES.Contrainte#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see fr.n7.cONTRAINTES.CONTRAINTESPackage#getContrainte()
 * @model
 * @generated
 */
public interface Contrainte extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.n7.cONTRAINTES.CONTRAINTESPackage#getContrainte_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.n7.cONTRAINTES.Contrainte#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Colonnes</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.cONTRAINTES.Colonne}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colonnes</em>' containment reference list.
   * @see fr.n7.cONTRAINTES.CONTRAINTESPackage#getContrainte_Colonnes()
   * @model containment="true"
   * @generated
   */
  EList<Colonne> getColonnes();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.cONTRAINTES.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see fr.n7.cONTRAINTES.CONTRAINTESPackage#getContrainte_Expression()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpression();

} // Contrainte
