/**
 */
package fr.n7.tableur.impl;

import fr.n7.tableur.DonneeCalculee;
import fr.n7.tableur.TableurPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import traitement.Fonction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Donnee Calculee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.tableur.impl.DonneeCalculeeImpl#getFonction <em>Fonction</em>}</li>
 *   <li>{@link fr.n7.tableur.impl.DonneeCalculeeImpl#getNomFonction <em>Nom Fonction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DonneeCalculeeImpl extends ColonneDonneeImpl implements DonneeCalculee {
	/**
	 * The cached value of the '{@link #getFonction() <em>Fonction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonction()
	 * @generated
	 * @ordered
	 */
	protected Fonction fonction;

	/**
	 * The default value of the '{@link #getNomFonction() <em>Nom Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomFonction()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_FONCTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNomFonction() <em>Nom Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomFonction()
	 * @generated
	 * @ordered
	 */
	protected String nomFonction = NOM_FONCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DonneeCalculeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TableurPackage.Literals.DONNEE_CALCULEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fonction getFonction() {
		if (fonction != null && fonction.eIsProxy()) {
			InternalEObject oldFonction = (InternalEObject) fonction;
			fonction = (Fonction) eResolveProxy(oldFonction);
			if (fonction != oldFonction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TableurPackage.DONNEE_CALCULEE__FONCTION,
							oldFonction, fonction));
			}
		}
		return fonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fonction basicGetFonction() {
		return fonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonction(Fonction newFonction) {
		Fonction oldFonction = fonction;
		fonction = newFonction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableurPackage.DONNEE_CALCULEE__FONCTION, oldFonction,
					fonction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomFonction() {
		return nomFonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomFonction(String newNomFonction) {
		String oldNomFonction = nomFonction;
		nomFonction = newNomFonction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableurPackage.DONNEE_CALCULEE__NOM_FONCTION,
					oldNomFonction, nomFonction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TableurPackage.DONNEE_CALCULEE__FONCTION:
			if (resolve)
				return getFonction();
			return basicGetFonction();
		case TableurPackage.DONNEE_CALCULEE__NOM_FONCTION:
			return getNomFonction();
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
		case TableurPackage.DONNEE_CALCULEE__FONCTION:
			setFonction((Fonction) newValue);
			return;
		case TableurPackage.DONNEE_CALCULEE__NOM_FONCTION:
			setNomFonction((String) newValue);
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
		case TableurPackage.DONNEE_CALCULEE__FONCTION:
			setFonction((Fonction) null);
			return;
		case TableurPackage.DONNEE_CALCULEE__NOM_FONCTION:
			setNomFonction(NOM_FONCTION_EDEFAULT);
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
		case TableurPackage.DONNEE_CALCULEE__FONCTION:
			return fonction != null;
		case TableurPackage.DONNEE_CALCULEE__NOM_FONCTION:
			return NOM_FONCTION_EDEFAULT == null ? nomFonction != null : !NOM_FONCTION_EDEFAULT.equals(nomFonction);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nomFonction: ");
		result.append(nomFonction);
		result.append(')');
		return result.toString();
	}

} //DonneeCalculeeImpl
