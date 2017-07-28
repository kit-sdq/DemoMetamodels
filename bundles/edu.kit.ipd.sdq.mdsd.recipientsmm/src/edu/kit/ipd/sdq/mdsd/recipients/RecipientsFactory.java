/**
 */
package edu.kit.ipd.sdq.mdsd.recipients;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage
 * @generated
 */
public interface RecipientsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecipientsFactory eINSTANCE = edu.kit.ipd.sdq.mdsd.recipients.impl.RecipientsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recipient</em>'.
	 * @generated
	 */
	Recipient createRecipient();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>City</em>'.
	 * @generated
	 */
	City createCity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RecipientsPackage getRecipientsPackage();

} //RecipientsFactory
