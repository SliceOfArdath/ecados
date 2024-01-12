/**
 */
package tableur.impl;

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
import tableur.ColonneDonnee;
import tableur.ColonneID;
import tableur.Table;
import tableur.TableurPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tableur.impl.TableImpl#getColonnes <em>Colonnes</em>}</li>
 *   <li>{@link tableur.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link tableur.impl.TableImpl#getColonneID <em>Colonne ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
	/**
	 * The cached value of the '{@link #getColonnes() <em>Colonnes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonnes()
	 * @generated
	 * @ordered
	 */
	protected EList<ColonneDonnee> colonnes;

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
	 * The cached value of the '{@link #getColonneID() <em>Colonne ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonneID()
	 * @generated
	 * @ordered
	 */
	protected ColonneID colonneID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TableurPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColonneDonnee> getColonnes() {
		if (colonnes == null) {
			colonnes = new EObjectContainmentEList<ColonneDonnee>(ColonneDonnee.class, this,
					TableurPackage.TABLE__COLONNES);
		}
		return colonnes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableurPackage.TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColonneID getColonneID() {
		return colonneID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColonneID(ColonneID newColonneID, NotificationChain msgs) {
		ColonneID oldColonneID = colonneID;
		colonneID = newColonneID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TableurPackage.TABLE__COLONNE_ID, oldColonneID, newColonneID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColonneID(ColonneID newColonneID) {
		if (newColonneID != colonneID) {
			NotificationChain msgs = null;
			if (colonneID != null)
				msgs = ((InternalEObject) colonneID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TableurPackage.TABLE__COLONNE_ID, null, msgs);
			if (newColonneID != null)
				msgs = ((InternalEObject) newColonneID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TableurPackage.TABLE__COLONNE_ID, null, msgs);
			msgs = basicSetColonneID(newColonneID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableurPackage.TABLE__COLONNE_ID, newColonneID,
					newColonneID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TableurPackage.TABLE__COLONNES:
			return ((InternalEList<?>) getColonnes()).basicRemove(otherEnd, msgs);
		case TableurPackage.TABLE__COLONNE_ID:
			return basicSetColonneID(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TableurPackage.TABLE__COLONNES:
			return getColonnes();
		case TableurPackage.TABLE__NAME:
			return getName();
		case TableurPackage.TABLE__COLONNE_ID:
			return getColonneID();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TableurPackage.TABLE__COLONNES:
			getColonnes().clear();
			getColonnes().addAll((Collection<? extends ColonneDonnee>) newValue);
			return;
		case TableurPackage.TABLE__NAME:
			setName((String) newValue);
			return;
		case TableurPackage.TABLE__COLONNE_ID:
			setColonneID((ColonneID) newValue);
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
		case TableurPackage.TABLE__COLONNES:
			getColonnes().clear();
			return;
		case TableurPackage.TABLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TableurPackage.TABLE__COLONNE_ID:
			setColonneID((ColonneID) null);
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
		case TableurPackage.TABLE__COLONNES:
			return colonnes != null && !colonnes.isEmpty();
		case TableurPackage.TABLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TableurPackage.TABLE__COLONNE_ID:
			return colonneID != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TableImpl
