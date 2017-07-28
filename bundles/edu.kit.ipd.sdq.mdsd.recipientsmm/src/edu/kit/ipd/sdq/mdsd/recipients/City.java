/**
 */
package edu.kit.ipd.sdq.mdsd.recipients;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.mdsd.recipients.City#getZipCode <em>Zip Code</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage#getCity()
 * @model
 * @generated
 */
public interface City extends IdentifiedElement {
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
	 * @see edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage#getCity_ZipCode()
	 * @model required="true"
	 * @generated
	 */
	String getZipCode();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mdsd.recipients.City#getZipCode <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip Code</em>' attribute.
	 * @see #getZipCode()
	 * @generated
	 */
	void setZipCode(String value);

} // City