/**
 */
package tableur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tableur.ColonneDonnee;
import tableur.ColonneExterne;
import tableur.Table;
import tableur.TableurPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonne Externe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tableur.impl.ColonneExterneImpl#getTableExterne <em>Table Externe</em>}</li>
 *   <li>{@link tableur.impl.ColonneExterneImpl#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColonneExterneImpl extends ColonneDonneeImpl implements ColonneExterne {
	/**
	 * The cached value of the '{@link #getTableExterne() <em>Table Externe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableExterne()
	 * @generated
	 * @ordered
	 */
	protected Table tableExterne;

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
	protected ColonneExterneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TableurPackage.Literals.COLONNE_EXTERNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTableExterne() {
		if (tableExterne != null && tableExterne.eIsProxy()) {
			InternalEObject oldTableExterne = (InternalEObject) tableExterne;
			tableExterne = (Table) eResolveProxy(oldTableExterne);
			if (tableExterne != oldTableExterne) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TableurPackage.COLONNE_EXTERNE__TABLE_EXTERNE, oldTableExterne, tableExterne));
			}
		}
		return tableExterne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTableExterne() {
		return tableExterne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableExterne(Table newTableExterne) {
		Table oldTableExterne = tableExterne;
		tableExterne = newTableExterne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableurPackage.COLONNE_EXTERNE__TABLE_EXTERNE,
					oldTableExterne, tableExterne));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TableurPackage.COLONNE_EXTERNE__COLONNE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, TableurPackage.COLONNE_EXTERNE__COLONNE, oldColonne,
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
		case TableurPackage.COLONNE_EXTERNE__TABLE_EXTERNE:
			if (resolve)
				return getTableExterne();
			return basicGetTableExterne();
		case TableurPackage.COLONNE_EXTERNE__COLONNE:
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
		case TableurPackage.COLONNE_EXTERNE__TABLE_EXTERNE:
			setTableExterne((Table) newValue);
			return;
		case TableurPackage.COLONNE_EXTERNE__COLONNE:
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
		case TableurPackage.COLONNE_EXTERNE__TABLE_EXTERNE:
			setTableExterne((Table) null);
			return;
		case TableurPackage.COLONNE_EXTERNE__COLONNE:
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
		case TableurPackage.COLONNE_EXTERNE__TABLE_EXTERNE:
			return tableExterne != null;
		case TableurPackage.COLONNE_EXTERNE__COLONNE:
			return colonne != null;
		}
		return super.eIsSet(featureID);
	}

} //ColonneExterneImpl
