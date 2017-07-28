/**
 */
package edu.kit.ipd.sdq.mdsd.addresses;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addresses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.mdsd.addresses.Addresses#getAddresses <em>Addresses</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.mdsd.addresses.AddressesPackage#getAddresses()
 * @model
 * @generated
 */
public interface Addresses extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.mdsd.addresses.Address}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.mdsd.addresses.AddressesPackage#getAddresses_Addresses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Address> getAddresses();

} // Addresses
