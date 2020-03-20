/**
 */
package edu.kit.ipd.sdq.metamodels.ensurance;

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
 *   <li>{@link edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceDatabase#getEnsuranceclient <em>Ensuranceclient</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.metamodels.ensurance.EnsurancePackage#getEnsuranceDatabase()
 * @model
 * @generated
 */
public interface EnsuranceDatabase extends EObject {
	/**
	 * Returns the value of the '<em><b>Ensuranceclient</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceClient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ensuranceclient</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.metamodels.ensurance.EnsurancePackage#getEnsuranceDatabase_Ensuranceclient()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnsuranceClient> getEnsuranceclient();

} // EnsuranceDatabase
