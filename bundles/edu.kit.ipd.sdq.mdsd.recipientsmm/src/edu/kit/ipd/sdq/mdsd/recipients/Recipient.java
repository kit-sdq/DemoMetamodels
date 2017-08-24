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
 *   <li>{@link edu.kit.ipd.sdq.mdsd.recipients.Recipient#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.mdsd.recipients.Recipient#isBusiness <em>Business</em>}</li>
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
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.mdsd.recipients.Recipients#getRecipients <em>Recipients</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Recipients)
	 * @see edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage#getRecipient_Parent()
	 * @see edu.kit.ipd.sdq.mdsd.recipients.Recipients#getRecipients
	 * @model opposite="recipients" required="true" transient="false"
	 * @generated
	 */
	Recipients getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mdsd.recipients.Recipient#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Recipients value);

	/**
	 * Returns the value of the '<em><b>Business</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business</em>' attribute.
	 * @see #setBusiness(boolean)
	 * @see edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage#getRecipient_Business()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isBusiness();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mdsd.recipients.Recipient#isBusiness <em>Business</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business</em>' attribute.
	 * @see #isBusiness()
	 * @generated
	 */
	void setBusiness(boolean value);

	/**
	 * Returns the value of the '<em><b>Located At</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.mdsd.recipients.Location#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Located At</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Located At</em>' containment reference.
	 * @see #setLocatedAt(Location)
	 * @see edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage#getRecipient_LocatedAt()
	 * @see edu.kit.ipd.sdq.mdsd.recipients.Location#getParent
	 * @model opposite="parent" containment="true" required="true"
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
	 * Returns the value of the '<em><b>Located In</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.mdsd.recipients.City#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Located In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Located In</em>' containment reference.
	 * @see #setLocatedIn(City)
	 * @see edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage#getRecipient_LocatedIn()
	 * @see edu.kit.ipd.sdq.mdsd.recipients.City#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	City getLocatedIn();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.mdsd.recipients.Recipient#getLocatedIn <em>Located In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Located In</em>' containment reference.
	 * @see #getLocatedIn()
	 * @generated
	 */
	void setLocatedIn(City value);

} // Recipient
