/**
 */
package edu.kit.ipd.sdq.metamodels.insurance.impl;

import edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient;
import edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.insurance.impl.InsuranceClientImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.insurance.impl.InsuranceClientImpl#getSocialSecurityNumber <em>Social Security Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsuranceClientImpl extends MinimalEObjectImpl.Container implements InsuranceClient {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSocialSecurityNumber() <em>Social Security Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialSecurityNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SOCIAL_SECURITY_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSocialSecurityNumber() <em>Social Security Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialSecurityNumber()
	 * @generated
	 * @ordered
	 */
	protected String socialSecurityNumber = SOCIAL_SECURITY_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsuranceClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InsurancePackage.Literals.INSURANCE_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InsurancePackage.INSURANCE_CLIENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSocialSecurityNumber(String newSocialSecurityNumber) {
		String oldSocialSecurityNumber = socialSecurityNumber;
		socialSecurityNumber = newSocialSecurityNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InsurancePackage.INSURANCE_CLIENT__SOCIAL_SECURITY_NUMBER, oldSocialSecurityNumber,
					socialSecurityNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case InsurancePackage.INSURANCE_CLIENT__NAME:
			return getName();
		case InsurancePackage.INSURANCE_CLIENT__SOCIAL_SECURITY_NUMBER:
			return getSocialSecurityNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case InsurancePackage.INSURANCE_CLIENT__NAME:
			setName((String) newValue);
			return;
		case InsurancePackage.INSURANCE_CLIENT__SOCIAL_SECURITY_NUMBER:
			setSocialSecurityNumber((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case InsurancePackage.INSURANCE_CLIENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case InsurancePackage.INSURANCE_CLIENT__SOCIAL_SECURITY_NUMBER:
			setSocialSecurityNumber(SOCIAL_SECURITY_NUMBER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case InsurancePackage.INSURANCE_CLIENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case InsurancePackage.INSURANCE_CLIENT__SOCIAL_SECURITY_NUMBER:
			return SOCIAL_SECURITY_NUMBER_EDEFAULT == null ? socialSecurityNumber != null
					: !SOCIAL_SECURITY_NUMBER_EDEFAULT.equals(socialSecurityNumber);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", socialSecurityNumber: ");
		result.append(socialSecurityNumber);
		result.append(')');
		return result.toString();
	}

} //InsuranceClientImpl
