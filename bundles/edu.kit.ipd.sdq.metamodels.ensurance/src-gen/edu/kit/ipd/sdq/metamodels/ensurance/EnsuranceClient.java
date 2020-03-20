/**
 */
package edu.kit.ipd.sdq.metamodels.ensurance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceClient#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceClient#getSocialSecurityNumber <em>Social Security Number</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.metamodels.ensurance.EnsurancePackage#getEnsuranceClient()
 * @model
 * @generated
 */
public interface EnsuranceClient extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.kit.ipd.sdq.metamodels.ensurance.EnsurancePackage#getEnsuranceClient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceClient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Social Security Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Social Security Number</em>' attribute.
	 * @see #setSocialSecurityNumber(String)
	 * @see edu.kit.ipd.sdq.metamodels.ensurance.EnsurancePackage#getEnsuranceClient_SocialSecurityNumber()
	 * @model
	 * @generated
	 */
	String getSocialSecurityNumber();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceClient#getSocialSecurityNumber <em>Social Security Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Social Security Number</em>' attribute.
	 * @see #getSocialSecurityNumber()
	 * @generated
	 */
	void setSocialSecurityNumber(String value);

} // EnsuranceClient
