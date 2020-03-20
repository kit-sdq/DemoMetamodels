/**
 */
package edu.kit.ipd.sdq.metamodels.insurance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase#getInsuranceclient <em>Insuranceclient</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage#getInsuranceDatabase()
 * @model
 * @generated
 */
public interface InsuranceDatabase extends EObject {
	/**
	 * Returns the value of the '<em><b>Insuranceclient</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insuranceclient</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage#getInsuranceDatabase_Insuranceclient()
	 * @model containment="true"
	 * @generated
	 */
	EList<InsuranceClient> getInsuranceclient();

} // InsuranceDatabase
