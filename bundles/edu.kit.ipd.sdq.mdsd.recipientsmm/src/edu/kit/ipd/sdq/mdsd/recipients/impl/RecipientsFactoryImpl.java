/**
 */
package edu.kit.ipd.sdq.mdsd.recipients.impl;

import edu.kit.ipd.sdq.mdsd.recipients.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecipientsFactoryImpl extends EFactoryImpl implements RecipientsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecipientsFactory init() {
		try {
			RecipientsFactory theRecipientsFactory = (RecipientsFactory)EPackage.Registry.INSTANCE.getEFactory(RecipientsPackage.eNS_URI);
			if (theRecipientsFactory != null) {
				return theRecipientsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RecipientsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipientsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RecipientsPackage.RECIPIENT: return createRecipient();
			case RecipientsPackage.LOCATION: return createLocation();
			case RecipientsPackage.CITY: return createCity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipient createRecipient() {
		RecipientImpl recipient = new RecipientImpl();
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City createCity() {
		CityImpl city = new CityImpl();
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipientsPackage getRecipientsPackage() {
		return (RecipientsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RecipientsPackage getPackage() {
		return RecipientsPackage.eINSTANCE;
	}

} //RecipientsFactoryImpl
