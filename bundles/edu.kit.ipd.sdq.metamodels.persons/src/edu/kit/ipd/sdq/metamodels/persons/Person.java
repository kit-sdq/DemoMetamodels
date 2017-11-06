/**
 */
package edu.kit.ipd.sdq.metamodels.persons;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.persons.Person#getFullName <em>Full Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.persons.Person#getBirthday <em>Birthday</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.metamodels.persons.PersonsPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see edu.kit.ipd.sdq.metamodels.persons.PersonsPackage#getPerson_FullName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.persons.Person#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birthday</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthday</em>' attribute.
	 * @see #setBirthday(Date)
	 * @see edu.kit.ipd.sdq.metamodels.persons.PersonsPackage#getPerson_Birthday()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Date getBirthday();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.metamodels.persons.Person#getBirthday <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthday</em>' attribute.
	 * @see #getBirthday()
	 * @generated
	 */
	void setBirthday(Date value);

} // Person
