/**
 * generated by Xtext 2.23.0
 */
package fr.n7.cONTRAINTES.impl;

import fr.n7.cONTRAINTES.CONTRAINTESPackage;
import fr.n7.cONTRAINTES.Colonne;
import fr.n7.cONTRAINTES.Contrainte;
import fr.n7.cONTRAINTES.Expression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contrainte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.cONTRAINTES.impl.ContrainteImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.cONTRAINTES.impl.ContrainteImpl#getColonnes <em>Colonnes</em>}</li>
 *   <li>{@link fr.n7.cONTRAINTES.impl.ContrainteImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContrainteImpl extends MinimalEObjectImpl.Container implements Contrainte
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getColonnes() <em>Colonnes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColonnes()
   * @generated
   * @ordered
   */
  protected EList<Colonne> colonnes;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected EList<Expression> expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContrainteImpl()
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
    return CONTRAINTESPackage.Literals.CONTRAINTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CONTRAINTESPackage.CONTRAINTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Colonne> getColonnes()
  {
    if (colonnes == null)
    {
      colonnes = new EObjectContainmentEList<Colonne>(Colonne.class, this, CONTRAINTESPackage.CONTRAINTE__COLONNES);
    }
    return colonnes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Expression> getExpression()
  {
    if (expression == null)
    {
      expression = new EObjectContainmentEList<Expression>(Expression.class, this, CONTRAINTESPackage.CONTRAINTE__EXPRESSION);
    }
    return expression;
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
      case CONTRAINTESPackage.CONTRAINTE__COLONNES:
        return ((InternalEList<?>)getColonnes()).basicRemove(otherEnd, msgs);
      case CONTRAINTESPackage.CONTRAINTE__EXPRESSION:
        return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
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
      case CONTRAINTESPackage.CONTRAINTE__NAME:
        return getName();
      case CONTRAINTESPackage.CONTRAINTE__COLONNES:
        return getColonnes();
      case CONTRAINTESPackage.CONTRAINTE__EXPRESSION:
        return getExpression();
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
      case CONTRAINTESPackage.CONTRAINTE__NAME:
        setName((String)newValue);
        return;
      case CONTRAINTESPackage.CONTRAINTE__COLONNES:
        getColonnes().clear();
        getColonnes().addAll((Collection<? extends Colonne>)newValue);
        return;
      case CONTRAINTESPackage.CONTRAINTE__EXPRESSION:
        getExpression().clear();
        getExpression().addAll((Collection<? extends Expression>)newValue);
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
      case CONTRAINTESPackage.CONTRAINTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CONTRAINTESPackage.CONTRAINTE__COLONNES:
        getColonnes().clear();
        return;
      case CONTRAINTESPackage.CONTRAINTE__EXPRESSION:
        getExpression().clear();
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
      case CONTRAINTESPackage.CONTRAINTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CONTRAINTESPackage.CONTRAINTE__COLONNES:
        return colonnes != null && !colonnes.isEmpty();
      case CONTRAINTESPackage.CONTRAINTE__EXPRESSION:
        return expression != null && !expression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ContrainteImpl