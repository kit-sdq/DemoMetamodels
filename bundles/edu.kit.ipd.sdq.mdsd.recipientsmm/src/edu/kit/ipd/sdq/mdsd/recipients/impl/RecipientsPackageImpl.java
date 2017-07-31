/**
 */
package edu.kit.ipd.sdq.mdsd.recipients.impl;

import edu.kit.ipd.sdq.mdsd.recipients.City;
import edu.kit.ipd.sdq.mdsd.recipients.IdentifiedElement;
import edu.kit.ipd.sdq.mdsd.recipients.Location;
import edu.kit.ipd.sdq.mdsd.recipients.Recipient;
import edu.kit.ipd.sdq.mdsd.recipients.RecipientsFactory;
import edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecipientsPackageImpl extends EPackageImpl implements RecipientsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recipientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cityEClass = null;

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
	 * @see edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RecipientsPackageImpl() {
		super(eNS_URI, RecipientsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RecipientsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RecipientsPackage init() {
		if (isInited) return (RecipientsPackage)EPackage.Registry.INSTANCE.getEPackage(RecipientsPackage.eNS_URI);

		// Obtain or create and register package
		RecipientsPackageImpl theRecipientsPackage = (RecipientsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RecipientsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RecipientsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRecipientsPackage.createPackageContents();

		// Initialize created meta-data
		theRecipientsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRecipientsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RecipientsPackage.eNS_URI, theRecipientsPackage);
		return theRecipientsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiedElement() {
		return identifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Id() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecipient() {
		return recipientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecipient_Business() {
		return (EAttribute)recipientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipient_LocatedAt() {
		return (EReference)recipientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipient_LocatedIn() {
		return (EReference)recipientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Number() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Street() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCity() {
		return cityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_ZipCode() {
		return (EAttribute)cityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipientsFactory getRecipientsFactory() {
		return (RecipientsFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		identifiedElementEClass = createEClass(IDENTIFIED_ELEMENT);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__ID);

		recipientEClass = createEClass(RECIPIENT);
		createEAttribute(recipientEClass, RECIPIENT__BUSINESS);
		createEReference(recipientEClass, RECIPIENT__LOCATED_AT);
		createEReference(recipientEClass, RECIPIENT__LOCATED_IN);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__NUMBER);
		createEAttribute(locationEClass, LOCATION__STREET);

		cityEClass = createEClass(CITY);
		createEAttribute(cityEClass, CITY__ZIP_CODE);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		recipientEClass.getESuperTypes().add(this.getIdentifiedElement());
		locationEClass.getESuperTypes().add(this.getIdentifiedElement());
		cityEClass.getESuperTypes().add(this.getIdentifiedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recipientEClass, Recipient.class, "Recipient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecipient_Business(), ecorePackage.getEBoolean(), "business", "false", 1, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipient_LocatedAt(), this.getLocation(), null, "locatedAt", null, 1, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipient_LocatedIn(), this.getCity(), null, "locatedIn", null, 1, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Number(), ecorePackage.getEInt(), "number", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Street(), ecorePackage.getEString(), "street", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cityEClass, City.class, "City", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCity_ZipCode(), ecorePackage.getEString(), "zipCode", null, 1, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RecipientsPackageImpl
