/**
 */
package edu.kit.ipd.sdq.metamodels.insurance.impl;

import edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient;
import edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase;
import edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.metamodels.insurance.impl.InsuranceDatabaseImpl#getInsuranceclient <em>Insuranceclient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsuranceDatabaseImpl extends MinimalEObjectImpl.Container implements InsuranceDatabase {
	/**
	 * The cached value of the '{@link #getInsuranceclient() <em>Insuranceclient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceclient()
	 * @generated
	 * @ordered
	 */
	protected EList<InsuranceClient> insuranceclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsuranceDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InsurancePackage.Literals.INSURANCE_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsuranceClient> getInsuranceclient() {
		if (insuranceclient == null) {
			insuranceclient = new EObjectContainmentEList<InsuranceClient>(InsuranceClient.class, this,
					InsurancePackage.INSURANCE_DATABASE__INSURANCECLIENT);
		}
		return insuranceclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InsurancePackage.INSURANCE_DATABASE__INSURANCECLIENT:
			return ((InternalEList<?>) getInsuranceclient()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case InsurancePackage.INSURANCE_DATABASE__INSURANCECLIENT:
			return getInsuranceclient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case InsurancePackage.INSURANCE_DATABASE__INSURANCECLIENT:
			getInsuranceclient().clear();
			getInsuranceclient().addAll((Collection<? extends InsuranceClient>) newValue);
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
		case InsurancePackage.INSURANCE_DATABASE__INSURANCECLIENT:
			getInsuranceclient().clear();
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
		case InsurancePackage.INSURANCE_DATABASE__INSURANCECLIENT:
			return insuranceclient != null && !insuranceclient.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InsuranceDatabaseImpl
