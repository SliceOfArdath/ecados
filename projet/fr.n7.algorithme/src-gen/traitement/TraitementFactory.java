/**
 */
package traitement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see traitement.TraitementPackage
 * @generated
 */
public interface TraitementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraitementFactory eINSTANCE = traitement.impl.TraitementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fonction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fonction</em>'.
	 * @generated
	 */
	Fonction createFonction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TraitementPackage getTraitementPackage();

} //TraitementFactory
