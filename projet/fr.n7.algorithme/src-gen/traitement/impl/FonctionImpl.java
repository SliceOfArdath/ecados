/**
 */
package traitement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tableur.ColonneDonnee;
import tableur.DonneeCalculee;

import tableur.Table;
import traitement.Fonction;
import traitement.TraitementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fonction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link traitement.impl.FonctionImpl#getChemin <em>Chemin</em>}</li>
 *   <li>{@link traitement.impl.FonctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link traitement.impl.FonctionImpl#getEntrees <em>Entrees</em>}</li>
 *   <li>{@link traitement.impl.FonctionImpl#getSorties <em>Sorties</em>}</li>
 *   <li>{@link traitement.impl.FonctionImpl#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FonctionImpl extends MinimalEObjectImpl.Container implements Fonction {
	/**
	 * The default value of the '{@link #getChemin() <em>Chemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemin()
	 * @generated
	 * @ordered
	 */
	protected static final String CHEMIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChemin() <em>Chemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemin()
	 * @generated
	 * @ordered
	 */
	protected String chemin = CHEMIN_EDEFAULT;

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
	 * The cached value of the '{@link #getEntrees() <em>Entrees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrees()
	 * @generated
	 * @ordered
	 */
	protected EList<ColonneDonnee> entrees;

	/**
	 * The cached value of the '{@link #getSorties() <em>Sorties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorties()
	 * @generated
	 * @ordered
	 */
	protected EList<DonneeCalculee> sorties;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected Table table;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FonctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraitementPackage.Literals.FONCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChemin() {
		return chemin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChemin(String newChemin) {
		String oldChemin = chemin;
		chemin = newChemin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraitementPackage.FONCTION__CHEMIN, oldChemin,
					chemin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TraitementPackage.FONCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColonneDonnee> getEntrees() {
		if (entrees == null) {
			entrees = new EObjectResolvingEList<ColonneDonnee>(ColonneDonnee.class, this,
					TraitementPackage.FONCTION__ENTREES);
		}
		return entrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DonneeCalculee> getSorties() {
		if (sorties == null) {
			sorties = new EObjectResolvingEList<DonneeCalculee>(DonneeCalculee.class, this,
					TraitementPackage.FONCTION__SORTIES);
		}
		return sorties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		if (table != null && table.eIsProxy()) {
			InternalEObject oldTable = (InternalEObject) table;
			table = (Table) eResolveProxy(oldTable);
			if (table != oldTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraitementPackage.FONCTION__TABLE,
							oldTable, table));
			}
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Table newTable) {
		Table oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraitementPackage.FONCTION__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TraitementPackage.FONCTION__CHEMIN:
			return getChemin();
		case TraitementPackage.FONCTION__NAME:
			return getName();
		case TraitementPackage.FONCTION__ENTREES:
			return getEntrees();
		case TraitementPackage.FONCTION__SORTIES:
			return getSorties();
		case TraitementPackage.FONCTION__TABLE:
			if (resolve)
				return getTable();
			return basicGetTable();
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
		case TraitementPackage.FONCTION__CHEMIN:
			setChemin((String) newValue);
			return;
		case TraitementPackage.FONCTION__NAME:
			setName((String) newValue);
			return;
		case TraitementPackage.FONCTION__ENTREES:
			getEntrees().clear();
			getEntrees().addAll((Collection<? extends ColonneDonnee>) newValue);
			return;
		case TraitementPackage.FONCTION__SORTIES:
			getSorties().clear();
			getSorties().addAll((Collection<? extends DonneeCalculee>) newValue);
			return;
		case TraitementPackage.FONCTION__TABLE:
			setTable((Table) newValue);
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
		case TraitementPackage.FONCTION__CHEMIN:
			setChemin(CHEMIN_EDEFAULT);
			return;
		case TraitementPackage.FONCTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TraitementPackage.FONCTION__ENTREES:
			getEntrees().clear();
			return;
		case TraitementPackage.FONCTION__SORTIES:
			getSorties().clear();
			return;
		case TraitementPackage.FONCTION__TABLE:
			setTable((Table) null);
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
		case TraitementPackage.FONCTION__CHEMIN:
			return CHEMIN_EDEFAULT == null ? chemin != null : !CHEMIN_EDEFAULT.equals(chemin);
		case TraitementPackage.FONCTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TraitementPackage.FONCTION__ENTREES:
			return entrees != null && !entrees.isEmpty();
		case TraitementPackage.FONCTION__SORTIES:
			return sorties != null && !sorties.isEmpty();
		case TraitementPackage.FONCTION__TABLE:
			return table != null;
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
		result.append(" (chemin: ");
		result.append(chemin);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FonctionImpl
