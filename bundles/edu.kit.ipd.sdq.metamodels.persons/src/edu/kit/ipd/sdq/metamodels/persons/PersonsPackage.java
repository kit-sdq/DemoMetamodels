/**
 */
package edu.kit.ipd.sdq.metamodels.persons;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.metamodels.persons.PersonsFactory
 * @model kind="package"
 * @generated
 */
public interface PersonsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "persons";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.metamodels.persons";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "persons";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersonsPackage eINSTANCE = edu.kit.ipd.sdq.metamodels.persons.impl.PersonsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.metamodels.persons.impl.PersonRegisterImpl <em>Person Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.metamodels.persons.impl.PersonRegisterImpl
	 * @see edu.kit.ipd.sdq.metamodels.persons.impl.PersonsPackageImpl#getPersonRegister()
	 * @generated
	 */
	int PERSON_REGISTER = 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTER__PERSONS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTER__ID = 1;

	/**
	 * The number of structural features of the '<em>Person Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REGISTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.metamodels.persons.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.metamodels.persons.impl.PersonImpl
	 * @see edu.kit.ipd.sdq.metamodels.persons.impl.PersonsPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FULL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTHDAY = 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.metamodels.persons.impl.MaleImpl <em>Male</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.metamodels.persons.impl.MaleImpl
	 * @see edu.kit.ipd.sdq.metamodels.persons.impl.PersonsPackageImpl#getMale()
	 * @generated
	 */
	int MALE = 2;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALE__FULL_NAME = PERSON__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALE__BIRTHDAY = PERSON__BIRTHDAY;

	/**
	 * The number of structural features of the '<em>Male</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALE_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Male</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALE_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.metamodels.persons.impl.FemaleImpl <em>Female</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.metamodels.persons.impl.FemaleImpl
	 * @see edu.kit.ipd.sdq.metamodels.persons.impl.PersonsPackageImpl#getFemale()
	 * @generated
	 */
	int FEMALE = 3;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMALE__FULL_NAME = PERSON__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMALE__BIRTHDAY = PERSON__BIRTHDAY;

	/**
	 * The number of structural features of the '<em>Female</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMALE_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Female</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMALE_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.metamodels.persons.PersonRegister <em>Person Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Register</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.persons.PersonRegister
	 * @generated
	 */
	EClass getPersonRegister();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.metamodels.persons.PersonRegister#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.persons.PersonRegister#getPersons()
	 * @see #getPersonRegister()
	 * @generated
	 */
	EReference getPersonRegister_Persons();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.metamodels.persons.PersonRegister#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.persons.PersonRegister#getId()
	 * @see #getPersonRegister()
	 * @generated
	 */
	EAttribute getPersonRegister_Id();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.metamodels.persons.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.persons.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.metamodels.persons.Person#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.persons.Person#getFullName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FullName();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.metamodels.persons.Person#getBirthday <em>Birthday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthday</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.persons.Person#getBirthday()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Birthday();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.metamodels.persons.Male <em>Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Male</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.persons.Male
	 * @generated
	 */
	EClass getMale();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.metamodels.persons.Female <em>Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Female</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.persons.Female
	 * @generated
	 */
	EClass getFemale();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PersonsFactory getPersonsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.metamodels.persons.impl.PersonRegisterImpl <em>Person Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.metamodels.persons.impl.PersonRegisterImpl
		 * @see edu.kit.ipd.sdq.metamodels.persons.impl.PersonsPackageImpl#getPersonRegister()
		 * @generated
		 */
		EClass PERSON_REGISTER = eINSTANCE.getPersonRegister();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_REGISTER__PERSONS = eINSTANCE.getPersonRegister_Persons();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_REGISTER__ID = eINSTANCE.getPersonRegister_Id();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.metamodels.persons.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.metamodels.persons.impl.PersonImpl
		 * @see edu.kit.ipd.sdq.metamodels.persons.impl.PersonsPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FULL_NAME = eINSTANCE.getPerson_FullName();

		/**
		 * The meta object literal for the '<em><b>Birthday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTHDAY = eINSTANCE.getPerson_Birthday();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.metamodels.persons.impl.MaleImpl <em>Male</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.metamodels.persons.impl.MaleImpl
		 * @see edu.kit.ipd.sdq.metamodels.persons.impl.PersonsPackageImpl#getMale()
		 * @generated
		 */
		EClass MALE = eINSTANCE.getMale();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.metamodels.persons.impl.FemaleImpl <em>Female</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.metamodels.persons.impl.FemaleImpl
		 * @see edu.kit.ipd.sdq.metamodels.persons.impl.PersonsPackageImpl#getFemale()
		 * @generated
		 */
		EClass FEMALE = eINSTANCE.getFemale();

	}

} //PersonsPackage
