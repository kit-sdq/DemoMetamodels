/**
 */
package edu.kit.ipd.sdq.metamodels.ensurance.impl;

import edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceClient;
import edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceDatabase;
import edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceFactory;
import edu.kit.ipd.sdq.metamodels.ensurance.EnsurancePackage;
import edu.kit.ipd.sdq.metamodels.ensurance.Sex;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnsurancePackageImpl extends EPackageImpl implements EnsurancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ensuranceDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ensuranceClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sexEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.ipd.sdq.metamodels.ensurance.EnsurancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnsurancePackageImpl() {
		super(eNS_URI, EnsuranceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EnsurancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnsurancePackage init() {
		if (isInited)
			return (EnsurancePackage) EPackage.Registry.INSTANCE.getEPackage(EnsurancePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEnsurancePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EnsurancePackageImpl theEnsurancePackage = registeredEnsurancePackage instanceof EnsurancePackageImpl
				? (EnsurancePackageImpl) registeredEnsurancePackage
				: new EnsurancePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEnsurancePackage.createPackageContents();

		// Initialize created meta-data
		theEnsurancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnsurancePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnsurancePackage.eNS_URI, theEnsurancePackage);
		return theEnsurancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnsuranceDatabase() {
		return ensuranceDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsuranceDatabase_Ensuranceclient() {
		return (EReference) ensuranceDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnsuranceClient() {
		return ensuranceClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnsuranceClient_Name() {
		return (EAttribute) ensuranceClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnsuranceClient_SocialSecurityNumber() {
		return (EAttribute) ensuranceClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSex() {
		return sexEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnsuranceFactory getEnsuranceFactory() {
		return (EnsuranceFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		ensuranceDatabaseEClass = createEClass(ENSURANCE_DATABASE);
		createEReference(ensuranceDatabaseEClass, ENSURANCE_DATABASE__ENSURANCECLIENT);

		ensuranceClientEClass = createEClass(ENSURANCE_CLIENT);
		createEAttribute(ensuranceClientEClass, ENSURANCE_CLIENT__NAME);
		createEAttribute(ensuranceClientEClass, ENSURANCE_CLIENT__SOCIAL_SECURITY_NUMBER);

		// Create enums
		sexEEnum = createEEnum(SEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(ensuranceDatabaseEClass, EnsuranceDatabase.class, "EnsuranceDatabase", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnsuranceDatabase_Ensuranceclient(), this.getEnsuranceClient(), null, "ensuranceclient", null,
				0, -1, EnsuranceDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ensuranceClientEClass, EnsuranceClient.class, "EnsuranceClient", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnsuranceClient_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnsuranceClient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnsuranceClient_SocialSecurityNumber(), ecorePackage.getEString(), "socialSecurityNumber",
				null, 0, 1, EnsuranceClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sexEEnum, Sex.class, "Sex");
		addEEnumLiteral(sexEEnum, Sex.MALE);
		addEEnumLiteral(sexEEnum, Sex.FEMALE);

		// Create resource
		createResource(eNS_URI);
	}

} //EnsurancePackageImpl
