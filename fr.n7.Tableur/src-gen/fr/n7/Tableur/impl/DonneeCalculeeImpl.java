/**
 */
package fr.n7.Tableur.impl;

import Traitement.Fonction;
import fr.n7.Tableur.DonneeCalculee;
import fr.n7.Tableur.Primitive;
import fr.n7.Tableur.TableurPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Donnee Calculee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.Tableur.impl.DonneeCalculeeImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.n7.Tableur.impl.DonneeCalculeeImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.n7.Tableur.impl.DonneeCalculeeImpl#getFonction <em>Fonction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DonneeCalculeeImpl extends MinimalEObjectImpl.Container implements DonneeCalculee {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Primitive TYPE_EDEFAULT = Primitive.INTEGER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Primitive type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

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
	public Primitive getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Primitive newType) {
		Primitive oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableurPackage.DONNEE_CALCULEE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableurPackage.DONNEE_CALCULEE__NOM, oldNom, nom));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TableurPackage.DONNEE_CALCULEE__TYPE:
			return getType();
		case TableurPackage.DONNEE_CALCULEE__NOM:
			return getNom();
		case TableurPackage.DONNEE_CALCULEE__FONCTION:
			if (resolve)
				return getFonction();
			return basicGetFonction();
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
		case TableurPackage.DONNEE_CALCULEE__TYPE:
			setType((Primitive) newValue);
			return;
		case TableurPackage.DONNEE_CALCULEE__NOM:
			setNom((String) newValue);
			return;
		case TableurPackage.DONNEE_CALCULEE__FONCTION:
			setFonction((Fonction) newValue);
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
		case TableurPackage.DONNEE_CALCULEE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case TableurPackage.DONNEE_CALCULEE__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case TableurPackage.DONNEE_CALCULEE__FONCTION:
			setFonction((Fonction) null);
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
		case TableurPackage.DONNEE_CALCULEE__TYPE:
			return type != TYPE_EDEFAULT;
		case TableurPackage.DONNEE_CALCULEE__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case TableurPackage.DONNEE_CALCULEE__FONCTION:
			return fonction != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //DonneeCalculeeImpl
