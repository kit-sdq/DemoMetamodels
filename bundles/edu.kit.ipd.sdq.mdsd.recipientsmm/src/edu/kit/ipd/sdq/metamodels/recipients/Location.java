/**
 */
package edu.kit.ipd.sdq.metamodels.recipients;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.recipients.Location#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.recipients.Location#getNumber <em>Number</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.recipients.Location#getStreet <em>Street</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.metamodels.recipients.RecipientsPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.metamodels.recipients.Recipient#getLocatedAt <em>Located At</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Recipient)
	 * @see edu.kit.ipd.sdq.metamodels.recipients.RecipientsPackage#getLocation_Parent()
	 * @see edu.kit.ipd.sdq.metamodels.recipients.Recipient#getLocatedAt
	 * @model opposite="locatedAt" required="true" transient="false"
	 * @generated
	 */
	Recipient getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.recipients.Location#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Recipient value);

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
	 * @see edu.kit.ipd.sdq.metamodels.recipients.RecipientsPackage#getLocation_Number()
	 * @model required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.recipients.Location#getNumber <em>Number</em>}' attribute.
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
	 * @see edu.kit.ipd.sdq.metamodels.recipients.RecipientsPackage#getLocation_Street()
	 * @model required="true"
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.recipients.Location#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

} // Location
