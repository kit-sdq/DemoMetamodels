/**
 */
package edu.kit.ipd.sdq.metamodels.ensurance.impl;

import edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceClient;
import edu.kit.ipd.sdq.metamodels.ensurance.EnsuranceDatabase;
import edu.kit.ipd.sdq.metamodels.ensurance.EnsurancePackage;

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
 *   <li>{@link edu.kit.ipd.sdq.metamodels.ensurance.impl.EnsuranceDatabaseImpl#getEnsuranceclient <em>Ensuranceclient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnsuranceDatabaseImpl extends MinimalEObjectImpl.Container implements EnsuranceDatabase {
	/**
	 * The cached value of the '{@link #getEnsuranceclient() <em>Ensuranceclient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnsuranceclient()
	 * @generated
	 * @ordered
	 */
	protected EList<EnsuranceClient> ensuranceclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnsuranceDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnsurancePackage.Literals.ENSURANCE_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnsuranceClient> getEnsuranceclient() {
		if (ensuranceclient == null) {
			ensuranceclient = new EObjectContainmentEList<EnsuranceClient>(EnsuranceClient.class, this,
					EnsurancePackage.ENSURANCE_DATABASE__ENSURANCECLIENT);
		}
		return ensuranceclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EnsurancePackage.ENSURANCE_DATABASE__ENSURANCECLIENT:
			return ((InternalEList<?>) getEnsuranceclient()).basicRemove(otherEnd, msgs);
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
		case EnsurancePackage.ENSURANCE_DATABASE__ENSURANCECLIENT:
			return getEnsuranceclient();
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
		case EnsurancePackage.ENSURANCE_DATABASE__ENSURANCECLIENT:
			getEnsuranceclient().clear();
			getEnsuranceclient().addAll((Collection<? extends EnsuranceClient>) newValue);
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
		case EnsurancePackage.ENSURANCE_DATABASE__ENSURANCECLIENT:
			getEnsuranceclient().clear();
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
		case EnsurancePackage.ENSURANCE_DATABASE__ENSURANCECLIENT:
			return ensuranceclient != null && !ensuranceclient.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnsuranceDatabaseImpl
