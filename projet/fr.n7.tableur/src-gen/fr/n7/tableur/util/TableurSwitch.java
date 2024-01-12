/**
 */
package fr.n7.tableur.util;

import fr.n7.tableur.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.n7.tableur.TableurPackage
 * @generated
 */
public class TableurSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TableurPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableurSwitch() {
		if (modelPackage == null) {
			modelPackage = TableurPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case TableurPackage.TABLE: {
			Table table = (Table) theEObject;
			T result = caseTable(table);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TableurPackage.COLONNE: {
			Colonne colonne = (Colonne) theEObject;
			T result = caseColonne(colonne);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TableurPackage.DONNEE_BRUTE: {
			DonneeBrute donneeBrute = (DonneeBrute) theEObject;
			T result = caseDonneeBrute(donneeBrute);
			if (result == null)
				result = caseColonneDonnee(donneeBrute);
			if (result == null)
				result = caseColonne(donneeBrute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TableurPackage.DONNEE_CALCULEE: {
			DonneeCalculee donneeCalculee = (DonneeCalculee) theEObject;
			T result = caseDonneeCalculee(donneeCalculee);
			if (result == null)
				result = caseColonneDonnee(donneeCalculee);
			if (result == null)
				result = caseColonne(donneeCalculee);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TableurPackage.COLONNE_ID: {
			ColonneID colonneID = (ColonneID) theEObject;
			T result = caseColonneID(colonneID);
			if (result == null)
				result = caseColonne(colonneID);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TableurPackage.COLONNE_DONNEE: {
			ColonneDonnee colonneDonnee = (ColonneDonnee) theEObject;
			T result = caseColonneDonnee(colonneDonnee);
			if (result == null)
				result = caseColonne(colonneDonnee);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TableurPackage.COLONNE_EXTERNE: {
			ColonneExterne colonneExterne = (ColonneExterne) theEObject;
			T result = caseColonneExterne(colonneExterne);
			if (result == null)
				result = caseColonneDonnee(colonneExterne);
			if (result == null)
				result = caseColonne(colonneExterne);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colonne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colonne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColonne(Colonne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Donnee Brute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Donnee Brute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDonneeBrute(DonneeBrute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Donnee Calculee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Donnee Calculee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDonneeCalculee(DonneeCalculee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colonne ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colonne ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColonneID(ColonneID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colonne Donnee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colonne Donnee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColonneDonnee(ColonneDonnee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colonne Externe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colonne Externe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColonneExterne(ColonneExterne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TableurSwitch
