/**
 */
package fr.n7.algorithme.impl;

import fr.n7.algorithme.AlgorithmePackage;
import fr.n7.algorithme.Expression;
import fr.n7.algorithme.OperationBinaire;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Binaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.algorithme.impl.OperationBinaireImpl#getEGauche <em>EGauche</em>}</li>
 *   <li>{@link fr.n7.algorithme.impl.OperationBinaireImpl#getEDroite <em>EDroite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationBinaireImpl extends ExpressionImpl implements OperationBinaire {
	/**
	 * The cached value of the '{@link #getEGauche() <em>EGauche</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGauche()
	 * @generated
	 * @ordered
	 */
	protected Expression eGauche;

	/**
	 * The cached value of the '{@link #getEDroite() <em>EDroite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDroite()
	 * @generated
	 * @ordered
	 */
	protected Expression eDroite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationBinaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmePackage.Literals.OPERATION_BINAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getEGauche() {
		if (eGauche != null && eGauche.eIsProxy()) {
			InternalEObject oldEGauche = (InternalEObject) eGauche;
			eGauche = (Expression) eResolveProxy(oldEGauche);
			if (eGauche != oldEGauche) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AlgorithmePackage.OPERATION_BINAIRE__EGAUCHE, oldEGauche, eGauche));
			}
		}
		return eGauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetEGauche() {
		return eGauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEGauche(Expression newEGauche) {
		Expression oldEGauche = eGauche;
		eGauche = newEGauche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.OPERATION_BINAIRE__EGAUCHE,
					oldEGauche, eGauche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getEDroite() {
		if (eDroite != null && eDroite.eIsProxy()) {
			InternalEObject oldEDroite = (InternalEObject) eDroite;
			eDroite = (Expression) eResolveProxy(oldEDroite);
			if (eDroite != oldEDroite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AlgorithmePackage.OPERATION_BINAIRE__EDROITE, oldEDroite, eDroite));
			}
		}
		return eDroite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetEDroite() {
		return eDroite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDroite(Expression newEDroite) {
		Expression oldEDroite = eDroite;
		eDroite = newEDroite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.OPERATION_BINAIRE__EDROITE,
					oldEDroite, eDroite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AlgorithmePackage.OPERATION_BINAIRE__EGAUCHE:
			if (resolve)
				return getEGauche();
			return basicGetEGauche();
		case AlgorithmePackage.OPERATION_BINAIRE__EDROITE:
			if (resolve)
				return getEDroite();
			return basicGetEDroite();
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
		case AlgorithmePackage.OPERATION_BINAIRE__EGAUCHE:
			setEGauche((Expression) newValue);
			return;
		case AlgorithmePackage.OPERATION_BINAIRE__EDROITE:
			setEDroite((Expression) newValue);
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
		case AlgorithmePackage.OPERATION_BINAIRE__EGAUCHE:
			setEGauche((Expression) null);
			return;
		case AlgorithmePackage.OPERATION_BINAIRE__EDROITE:
			setEDroite((Expression) null);
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
		case AlgorithmePackage.OPERATION_BINAIRE__EGAUCHE:
			return eGauche != null;
		case AlgorithmePackage.OPERATION_BINAIRE__EDROITE:
			return eDroite != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationBinaireImpl
