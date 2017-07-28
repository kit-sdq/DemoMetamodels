/**
 */
package edu.kit.ipd.sdq.mdsd.recipients;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.mdsd.recipients.Recipient#getLocatedAt <em>Located At</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.mdsd.recipients.Recipient#getLocatedIn <em>Located In</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage#getRecipient()
 * @model
 * @generated
 */
public interface Recipient extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Located At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Located At</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Located At</em>' containment reference.
	 * @see #setLocatedAt(Location)
	 * @see edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage#getRecipient_LocatedAt()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location getLocatedAt();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mdsd.recipients.Recipient#getLocatedAt <em>Located At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Located At</em>' containment reference.
	 * @see #getLocatedAt()
	 * @generated
	 */
	void setLocatedAt(Location value);

	/**
	 * Returns the value of the '<em><b>Located In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Located In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Located In</em>' reference.
	 * @see #setLocatedIn(City)
	 * @see edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage#getRecipient_LocatedIn()
	 * @model required="true"
	 * @generated
	 */
	City getLocatedIn();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mdsd.recipients.Recipient#getLocatedIn <em>Located In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Located In</em>' reference.
	 * @see #getLocatedIn()
	 * @generated
	 */
	void setLocatedIn(City value);

} // Recipient