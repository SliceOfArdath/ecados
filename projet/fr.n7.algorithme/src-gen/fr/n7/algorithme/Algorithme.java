/**
 */
package fr.n7.algorithme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import tableur.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.algorithme.Algorithme#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link fr.n7.algorithme.Algorithme#getSortie <em>Sortie</em>}</li>
 *   <li>{@link fr.n7.algorithme.Algorithme#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.algorithme.Algorithme#getEntrees <em>Entrees</em>}</li>
 *   <li>{@link fr.n7.algorithme.Algorithme#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see fr.n7.algorithme.AlgorithmePackage#getAlgorithme()
 * @model
 * @generated
 */
public interface Algorithme extends EObject {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.n7.algorithme.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see fr.n7.algorithme.AlgorithmePackage#getAlgorithme_Expressions()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

	/**
	 * Returns the value of the '<em><b>Sortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie</em>' containment reference.
	 * @see #setSortie(Sortie)
	 * @see fr.n7.algorithme.AlgorithmePackage#getAlgorithme_Sortie()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	Sortie getSortie();

	/**
	 * Sets the value of the '{@link fr.n7.algorithme.Algorithme#getSortie <em>Sortie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie</em>' containment reference.
	 * @see #getSortie()
	 * @generated
	 */
	void setSortie(Sortie value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.n7.algorithme.AlgorithmePackage#getAlgorithme_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.n7.algorithme.Algorithme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entrees</b></em>' containment reference list.
	 * The list contents are of type {@link fr.n7.algorithme.Entree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrees</em>' containment reference list.
	 * @see fr.n7.algorithme.AlgorithmePackage#getAlgorithme_Entrees()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Entree> getEntrees();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Table)
	 * @see fr.n7.algorithme.AlgorithmePackage#getAlgorithme_Table()
	 * @model required="true"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link fr.n7.algorithme.Algorithme#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

} // Algorithme
