/**
 * generated by Xtext 2.23.0
 */
package fr.n7.cONTRAINTES.impl;

import fr.n7.cONTRAINTES.CONTRAINTESPackage;
import fr.n7.cONTRAINTES.Contrainte;
import fr.n7.cONTRAINTES.EnsembleContraintes;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ensemble Contraintes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.cONTRAINTES.impl.EnsembleContraintesImpl#getContraintes <em>Contraintes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnsembleContraintesImpl extends MinimalEObjectImpl.Container implements EnsembleContraintes
{
  /**
   * The cached value of the '{@link #getContraintes() <em>Contraintes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContraintes()
   * @generated
   * @ordered
   */
  protected EList<Contrainte> contraintes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnsembleContraintesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CONTRAINTESPackage.Literals.ENSEMBLE_CONTRAINTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Contrainte> getContraintes()
  {
    if (contraintes == null)
    {
      contraintes = new EObjectContainmentEList<Contrainte>(Contrainte.class, this, CONTRAINTESPackage.ENSEMBLE_CONTRAINTES__CONTRAINTES);
    }
    return contraintes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CONTRAINTESPackage.ENSEMBLE_CONTRAINTES__CONTRAINTES:
        return ((InternalEList<?>)getContraintes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CONTRAINTESPackage.ENSEMBLE_CONTRAINTES__CONTRAINTES:
        return getContraintes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CONTRAINTESPackage.ENSEMBLE_CONTRAINTES__CONTRAINTES:
        getContraintes().clear();
        getContraintes().addAll((Collection<? extends Contrainte>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CONTRAINTESPackage.ENSEMBLE_CONTRAINTES__CONTRAINTES:
        getContraintes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CONTRAINTESPackage.ENSEMBLE_CONTRAINTES__CONTRAINTES:
        return contraintes != null && !contraintes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EnsembleContraintesImpl
