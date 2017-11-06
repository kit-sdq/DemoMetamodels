/**
 */
package edu.kit.ipd.sdq.metamodels.recipients;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.recipients.City#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.recipients.City#getZipCode <em>Zip Code</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.metamodels.recipients.RecipientsPackage#getCity()
 * @model
 * @generated
 */
public interface City extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.metamodels.recipients.Recipient#getLocatedIn <em>Located In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Recipient)
	 * @see edu.kit.ipd.sdq.metamodels.recipients.RecipientsPackage#getCity_Parent()
	 * @see edu.kit.ipd.sdq.metamodels.recipients.Recipient#getLocatedIn
	 * @model opposite="locatedIn" required="true" transient="false"
	 * @generated
	 */
	Recipient getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.recipients.City#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Recipient value);

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
	 * @see edu.kit.ipd.sdq.metamodels.recipients.RecipientsPackage#getCity_ZipCode()
	 * @model required="true"
	 * @generated
	 */
	String getZipCode();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.recipients.City#getZipCode <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip Code</em>' attribute.
	 * @see #getZipCode()
	 * @generated
	 */
	void setZipCode(String value);

} // City
