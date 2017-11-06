/**
 */
package edu.kit.ipd.sdq.metamodels.addresses;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.metamodels.addresses.AddressesPackage
 * @generated
 */
public interface AddressesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AddressesFactory eINSTANCE = edu.kit.ipd.sdq.metamodels.addresses.impl.AddressesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Addresses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addresses</em>'.
	 * @generated
	 */
	Addresses createAddresses();

	/**
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
	Address createAddress();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AddressesPackage getAddressesPackage();

} //AddressesFactory
