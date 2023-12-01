/**
 */
package Traitement.impl;

import Traitement.Fonction;
import Traitement.TraitementPackage;

import fr.n7.Tableur.Colonne;
import fr.n7.Tableur.DonneeCalculee;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fonction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Traitement.impl.FonctionImpl#getEntrees <em>Entrees</em>}</li>
 *   <li>{@link Traitement.impl.FonctionImpl#getSorties <em>Sorties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FonctionImpl extends MinimalEObjectImpl.Container implements Fonction {
	/**
	 * The cached value of the '{@link #getEntrees() <em>Entrees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrees()
	 * @generated
	 * @ordered
	 */
	protected EList<Colonne> entrees;
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
	public EList<Colonne> getEntrees() {
		if (entrees == null) {
			entrees = new EObjectResolvingEList<Colonne>(Colonne.class, this, TraitementPackage.FONCTION__ENTREES);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TraitementPackage.FONCTION__ENTREES:
			return getEntrees();
		case TraitementPackage.FONCTION__SORTIES:
			return getSorties();
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
		case TraitementPackage.FONCTION__ENTREES:
			getEntrees().clear();
			getEntrees().addAll((Collection<? extends Colonne>) newValue);
			return;
		case TraitementPackage.FONCTION__SORTIES:
			getSorties().clear();
			getSorties().addAll((Collection<? extends DonneeCalculee>) newValue);
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
		case TraitementPackage.FONCTION__ENTREES:
			getEntrees().clear();
			return;
		case TraitementPackage.FONCTION__SORTIES:
			getSorties().clear();
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
		case TraitementPackage.FONCTION__ENTREES:
			return entrees != null && !entrees.isEmpty();
		case TraitementPackage.FONCTION__SORTIES:
			return sorties != null && !sorties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FonctionImpl
