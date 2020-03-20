/**
 */
package edu.kit.ipd.sdq.metamodels.ensurance;

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
 * @see edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceFactory
 * @model kind="package"
 * @generated
 */
public interface EnsurancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ensurance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.metamodels.ensurance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ensurance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnsurancePackage eINSTANCE = edu.kit.ipd.sdq.metamodels.ensurance.impl.EnsurancePackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.metamodels.ensurance.impl.EnsuranceDatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.metamodels.ensurance.impl.EnsuranceDatabaseImpl
	 * @see edu.kit.ipd.sdq.metamodels.ensurance.impl.EnsurancePackageImpl#getEnsuranceDatabase()
	 * @generated
	 */
	int ENSURANCE_DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Ensuranceclient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSURANCE_DATABASE__ENSURANCECLIENT = 0;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSURANCE_DATABASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSURANCE_DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.metamodels.ensurance.impl.EnsuranceClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.metamodels.ensurance.impl.EnsuranceClientImpl
	 * @see edu.kit.ipd.sdq.metamodels.ensurance.impl.EnsurancePackageImpl#getEnsuranceClient()
	 * @generated
	 */
	int ENSURANCE_CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSURANCE_CLIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Social Security Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSURANCE_CLIENT__SOCIAL_SECURITY_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSURANCE_CLIENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSURANCE_CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.metamodels.ensurance.Sex <em>Sex</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.metamodels.ensurance.Sex
	 * @see edu.kit.ipd.sdq.metamodels.ensurance.impl.EnsurancePackageImpl#getSex()
	 * @generated
	 */
	int SEX = 2;

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceDatabase
	 * @generated
	 */
	EClass getEnsuranceDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceDatabase#getEnsuranceclient <em>Ensuranceclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ensuranceclient</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceDatabase#getEnsuranceclient()
	 * @see #getEnsuranceDatabase()
	 * @generated
	 */
	EReference getEnsuranceDatabase_Ensuranceclient();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceClient
	 * @generated
	 */
	EClass getEnsuranceClient();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceClient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceClient#getName()
	 * @see #getEnsuranceClient()
	 * @generated
	 */
	EAttribute getEnsuranceClient_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceClient#getSocialSecurityNumber <em>Social Security Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social Security Number</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceClient#getSocialSecurityNumber()
	 * @see #getEnsuranceClient()
	 * @generated
	 */
	EAttribute getEnsuranceClient_SocialSecurityNumber();

	/**
	 * Returns the meta object for enum '{@link edu.kit.ipd.sdq.metamodels.ensurance.Sex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sex</em>'.
	 * @see edu.kit.ipd.sdq.metamodels.ensurance.Sex
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
	EnsuranceFactory getEnsuranceFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.metamodels.ensurance.impl.EnsuranceDatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.metamodels.ensurance.impl.EnsuranceDatabaseImpl
		 * @see edu.kit.ipd.sdq.metamodels.ensurance.impl.EnsurancePackageImpl#getEnsuranceDatabase()
		 * @generated
		 */
		EClass ENSURANCE_DATABASE = eINSTANCE.getEnsuranceDatabase();

		/**
		 * The meta object literal for the '<em><b>Ensuranceclient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSURANCE_DATABASE__ENSURANCECLIENT = eINSTANCE.getEnsuranceDatabase_Ensuranceclient();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.metamodels.ensurance.impl.EnsuranceClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.metamodels.ensurance.impl.EnsuranceClientImpl
		 * @see edu.kit.ipd.sdq.metamodels.ensurance.impl.EnsurancePackageImpl#getEnsuranceClient()
		 * @generated
		 */
		EClass ENSURANCE_CLIENT = eINSTANCE.getEnsuranceClient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSURANCE_CLIENT__NAME = eINSTANCE.getEnsuranceClient_Name();

		/**
		 * The meta object literal for the '<em><b>Social Security Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSURANCE_CLIENT__SOCIAL_SECURITY_NUMBER = eINSTANCE.getEnsuranceClient_SocialSecurityNumber();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.metamodels.ensurance.Sex <em>Sex</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.metamodels.ensurance.Sex
		 * @see edu.kit.ipd.sdq.metamodels.ensurance.impl.EnsurancePackageImpl#getSex()
		 * @generated
		 */
		EEnum SEX = eINSTANCE.getSex();

	}

} //EnsurancePackage
