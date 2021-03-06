/**
 */
package edu.kit.ipd.sdq.metamodels.addresses;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.addresses.Address#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.addresses.Address#getNumber <em>Number</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.addresses.Address#getStreet <em>Street</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.addresses.Address#getZipCode <em>Zip Code</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.metamodels.addresses.AddressesPackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.metamodels.addresses.Addresses#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Addresses)
	 * @see edu.kit.ipd.sdq.metamodels.addresses.AddressesPackage#getAddress_Parent()
	 * @see edu.kit.ipd.sdq.metamodels.addresses.Addresses#getAddresses
	 * @model opposite="addresses" required="true" transient="false"
	 * @generated
	 */
	Addresses getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.addresses.Address#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Addresses value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see edu.kit.ipd.sdq.metamodels.addresses.AddressesPackage#getAddress_Number()
	 * @model required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.addresses.Address#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see edu.kit.ipd.sdq.metamodels.addresses.AddressesPackage#getAddress_Street()
	 * @model required="true"
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.addresses.Address#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip Code</em>' attribute.
	 * @see #setZipCode(String)
	 * @see edu.kit.ipd.sdq.metamodels.addresses.AddressesPackage#getAddress_ZipCode()
	 * @model required="true"
	 * @generated
	 */
	String getZipCode();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.addresses.Address#getZipCode <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip Code</em>' attribute.
	 * @see #getZipCode()
	 * @generated
	 */
	void setZipCode(String value);

} // Address
