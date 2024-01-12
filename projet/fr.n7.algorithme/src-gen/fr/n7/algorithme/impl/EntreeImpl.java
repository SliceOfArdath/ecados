/**
 */
package fr.n7.algorithme.impl;

import fr.n7.algorithme.AlgorithmePackage;
import fr.n7.algorithme.Entree;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import tableur.ColonneDonnee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.algorithme.impl.EntreeImpl#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntreeImpl extends ExpressionImpl implements Entree {
	/**
	 * The cached value of the '{@link #getColonne() <em>Colonne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonne()
	 * @generated
	 * @ordered
	 */
	protected ColonneDonnee colonne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmePackage.Literals.ENTREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColonneDonnee getColonne() {
		if (colonne != null && colonne.eIsProxy()) {
			InternalEObject oldColonne = (InternalEObject) colonne;
			colonne = (ColonneDonnee) eResolveProxy(oldColonne);
			if (colonne != oldColonne) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmePackage.ENTREE__COLONNE,
							oldColonne, colonne));
			}
		}
		return colonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColonneDonnee basicGetColonne() {
		return colonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColonne(ColonneDonnee newColonne) {
		ColonneDonnee oldColonne = colonne;
		colonne = newColonne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ENTREE__COLONNE, oldColonne,
					colonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AlgorithmePackage.ENTREE__COLONNE:
			if (resolve)
				return getColonne();
			return basicGetColonne();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AlgorithmePackage.ENTREE__COLONNE:
			setColonne((ColonneDonnee) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case AlgorithmePackage.ENTREE__COLONNE:
			setColonne((ColonneDonnee) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AlgorithmePackage.ENTREE__COLONNE:
			return colonne != null;
		}
		return super.eIsSet(featureID);
	}

} //EntreeImpl
