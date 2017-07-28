/**
 */
package edu.kit.ipd.sdq.mdsd.recipients;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.mdsd.recipients.Location#getNumber <em>Number</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.mdsd.recipients.Location#getStreet <em>Street</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends IdentifiedElement {
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
	 * @see edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage#getLocation_Number()
	 * @model required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mdsd.recipients.Location#getNumber <em>Number</em>}' attribute.
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
	 * @see edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage#getLocation_Street()
	 * @model required="true"
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mdsd.recipients.Location#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

} // Location
