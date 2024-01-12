/**
 * generated by Xtext 2.23.0
 */
package fr.n7.cONTRAINTES.util;

import fr.n7.cONTRAINTES.*;

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
 * @see fr.n7.cONTRAINTES.CONTRAINTESPackage
 * @generated
 */
public class CONTRAINTESSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CONTRAINTESPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CONTRAINTESSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CONTRAINTESPackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CONTRAINTESPackage.ENSEMBLE_CONTRAINTES:
      {
        EnsembleContraintes ensembleContraintes = (EnsembleContraintes)theEObject;
        T result = caseEnsembleContraintes(ensembleContraintes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CONTRAINTESPackage.CONTRAINTE:
      {
        Contrainte contrainte = (Contrainte)theEObject;
        T result = caseContrainte(contrainte);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CONTRAINTESPackage.COLONNE:
      {
        Colonne colonne = (Colonne)theEObject;
        T result = caseColonne(colonne);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CONTRAINTESPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CONTRAINTESPackage.COMPARAISON:
      {
        Comparaison comparaison = (Comparaison)theEObject;
        T result = caseComparaison(comparaison);
        if (result == null) result = caseExpression(comparaison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CONTRAINTESPackage.OPERATION_BINAIRE:
      {
        OperationBinaire operationBinaire = (OperationBinaire)theEObject;
        T result = caseOperationBinaire(operationBinaire);
        if (result == null) result = caseExpression(operationBinaire);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CONTRAINTESPackage.OPERATION_UNAIRE:
      {
        OperationUnaire operationUnaire = (OperationUnaire)theEObject;
        T result = caseOperationUnaire(operationUnaire);
        if (result == null) result = caseExpression(operationUnaire);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ensemble Contraintes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ensemble Contraintes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnsembleContraintes(EnsembleContraintes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contrainte</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contrainte</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContrainte(Contrainte object)
  {
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
  public T caseColonne(Colonne object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparaison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparaison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparaison(Comparaison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Binaire</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Binaire</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationBinaire(OperationBinaire object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Unaire</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Unaire</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationUnaire(OperationUnaire object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CONTRAINTESSwitch
