/**
 */
package edu.kit.ipd.sdq.mdsd.recipients;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipients</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.mdsd.recipients.Recipients#getRecipients <em>Recipients</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage#getRecipients()
 * @model
 * @generated
 */
public interface Recipients extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Recipients</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.mdsd.recipients.Recipient}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.mdsd.recipients.Recipient#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipients</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage#getRecipients_Recipients()
	 * @see edu.kit.ipd.sdq.mdsd.recipients.Recipient#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	EList<Recipient> getRecipients();

} // Recipients
