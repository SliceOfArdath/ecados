/**
 */
package traitement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fonction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link traitement.Fonction#getChemin <em>Chemin</em>}</li>
 *   <li>{@link traitement.Fonction#getName <em>Name</em>}</li>
 *   <li>{@link traitement.Fonction#getSorties <em>Sorties</em>}</li>
 *   <li>{@link traitement.Fonction#getEntrees <em>Entrees</em>}</li>
 *   <li>{@link traitement.Fonction#getTableName <em>Table Name</em>}</li>
 * </ul>
 *
 * @see traitement.TraitementPackage#getFonction()
 * @model
 * @generated
 */
public interface Fonction extends EObject {
	/**
	 * Returns the value of the '<em><b>Chemin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chemin</em>' attribute.
	 * @see #setChemin(String)
	 * @see traitement.TraitementPackage#getFonction_Chemin()
	 * @model required="true"
	 * @generated
	 */
	String getChemin();

	/**
	 * Sets the value of the '{@link traitement.Fonction#getChemin <em>Chemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chemin</em>' attribute.
	 * @see #getChemin()
	 * @generated
	 */
	void setChemin(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see traitement.TraitementPackage#getFonction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link traitement.Fonction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entrees</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrees</em>' attribute list.
	 * @see traitement.TraitementPackage#getFonction_Entrees()
	 * @model
	 * @generated
	 */
	EList<String> getEntrees();

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see traitement.TraitementPackage#getFonction_TableName()
	 * @model required="true"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link traitement.Fonction#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Sorties</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorties</em>' attribute list.
	 * @see traitement.TraitementPackage#getFonction_Sorties()
	 * @model
	 * @generated
	 */
	EList<String> getSorties();

} // Fonction
