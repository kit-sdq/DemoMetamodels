/**
 */
package edu.kit.ipd.sdq.metamodels.insurance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see edu.kit.ipd.sdq.metamodels.insurance.InsuranceFactory
 * @model kind="package"
 * @generated
 */
public interface InsurancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "insurance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.metamodels.insurance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "insurance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InsurancePackage eINSTANCE = edu.kit.ipd.sdq.metamodels.insurance.impl.InsurancePackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.metamodels.insurance.impl.InsuranceDatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.metamodels.insurance.impl.InsuranceDatabaseImpl
	 * @see edu.kit.ipd.sdq.metamodels.insurance.impl.InsurancePackageImpl#getInsuranceDatabase()
	 * @generated
	 */
	int INSURANCE_DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Insuranceclient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_DATABASE__INSURANCECLIENT = 0;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_DATABASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.metamodels.insurance.impl.InsuranceClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.metamodels.insurance.impl.InsuranceClientImpl
	 * @see edu.kit.ipd.sdq.metamodels.insurance.impl.InsurancePackageImpl#getInsuranceClient()
	 * @generated
	 */
	int INSURANCE_CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_CLIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Social Security Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_CLIENT__SOCIAL_SECURITY_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_CLIENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.metamodels.insurance.Sex <em>Sex</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.metamodels.insurance.Sex
	 * @see edu.kit.ipd.sdq.metamodels.insurance.impl.InsurancePackageImpl#getSex()
	 * @generated
	 */
	int SEX = 2;

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase
	 * @generated
	 */
	EClass getInsuranceDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase#getInsuranceclient <em>Insuranceclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Insuranceclient</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase#getInsuranceclient()
	 * @see #getInsuranceDatabase()
	 * @generated
	 */
	EReference getInsuranceDatabase_Insuranceclient();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient
	 * @generated
	 */
	EClass getInsuranceClient();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient#getName()
	 * @see #getInsuranceClient()
	 * @generated
	 */
	EAttribute getInsuranceClient_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient#getSocialSecurityNumber <em>Social Security Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social Security Number</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient#getSocialSecurityNumber()
	 * @see #getInsuranceClient()
	 * @generated
	 */
	EAttribute getInsuranceClient_SocialSecurityNumber();

	/**
	 * Returns the meta object for enum '{@link edu.kit.ipd.sdq.metamodels.insurance.Sex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sex</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.insurance.Sex
	 * @generated
	 */
	EEnum getSex();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InsuranceFactory getInsuranceFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.metamodels.insurance.impl.InsuranceDatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.metamodels.insurance.impl.InsuranceDatabaseImpl
		 * @see edu.kit.ipd.sdq.metamodels.insurance.impl.InsurancePackageImpl#getInsuranceDatabase()
		 * @generated
		 */
		EClass INSURANCE_DATABASE = eINSTANCE.getInsuranceDatabase();

		/**
		 * The meta object literal for the '<em><b>Insuranceclient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_DATABASE__INSURANCECLIENT = eINSTANCE.getInsuranceDatabase_Insuranceclient();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.metamodels.insurance.impl.InsuranceClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.metamodels.insurance.impl.InsuranceClientImpl
		 * @see edu.kit.ipd.sdq.metamodels.insurance.impl.InsurancePackageImpl#getInsuranceClient()
		 * @generated
		 */
		EClass INSURANCE_CLIENT = eINSTANCE.getInsuranceClient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_CLIENT__NAME = eINSTANCE.getInsuranceClient_Name();

		/**
		 * The meta object literal for the '<em><b>Social Security Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_CLIENT__SOCIAL_SECURITY_NUMBER = eINSTANCE.getInsuranceClient_SocialSecurityNumber();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.metamodels.insurance.Sex <em>Sex</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.metamodels.insurance.Sex
		 * @see edu.kit.ipd.sdq.metamodels.insurance.impl.InsurancePackageImpl#getSex()
		 * @generated
		 */
		EEnum SEX = eINSTANCE.getSex();

	}

} //InsurancePackage
