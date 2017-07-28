/**
 */
package edu.kit.ipd.sdq.mdsd.recipients.impl;

import edu.kit.ipd.sdq.mdsd.recipients.City;
import edu.kit.ipd.sdq.mdsd.recipients.Location;
import edu.kit.ipd.sdq.mdsd.recipients.Recipient;
import edu.kit.ipd.sdq.mdsd.recipients.RecipientsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.mdsd.recipients.impl.RecipientImpl#getLocatedAt <em>Located At</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.mdsd.recipients.impl.RecipientImpl#getLocatedIn <em>Located In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecipientImpl extends IdentifiedElementImpl implements Recipient {
	/**
	 * The cached value of the '{@link #getLocatedAt() <em>Located At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocatedAt()
	 * @generated
	 * @ordered
	 */
	protected Location locatedAt;

	/**
	 * The cached value of the '{@link #getLocatedIn() <em>Located In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocatedIn()
	 * @generated
	 * @ordered
	 */
	protected City locatedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecipientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipientsPackage.Literals.RECIPIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocatedAt() {
		return locatedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocatedAt(Location newLocatedAt, NotificationChain msgs) {
		Location oldLocatedAt = locatedAt;
		locatedAt = newLocatedAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecipientsPackage.RECIPIENT__LOCATED_AT, oldLocatedAt, newLocatedAt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocatedAt(Location newLocatedAt) {
		if (newLocatedAt != locatedAt) {
			NotificationChain msgs = null;
			if (locatedAt != null)
				msgs = ((InternalEObject)locatedAt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RecipientsPackage.RECIPIENT__LOCATED_AT, null, msgs);
			if (newLocatedAt != null)
				msgs = ((InternalEObject)newLocatedAt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RecipientsPackage.RECIPIENT__LOCATED_AT, null, msgs);
			msgs = basicSetLocatedAt(newLocatedAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipientsPackage.RECIPIENT__LOCATED_AT, newLocatedAt, newLocatedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City getLocatedIn() {
		if (locatedIn != null && locatedIn.eIsProxy()) {
			InternalEObject oldLocatedIn = (InternalEObject)locatedIn;
			locatedIn = (City)eResolveProxy(oldLocatedIn);
			if (locatedIn != oldLocatedIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipientsPackage.RECIPIENT__LOCATED_IN, oldLocatedIn, locatedIn));
			}
		}
		return locatedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City basicGetLocatedIn() {
		return locatedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocatedIn(City newLocatedIn) {
		City oldLocatedIn = locatedIn;
		locatedIn = newLocatedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipientsPackage.RECIPIENT__LOCATED_IN, oldLocatedIn, locatedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecipientsPackage.RECIPIENT__LOCATED_AT:
				return basicSetLocatedAt(null, msgs);
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
			case RecipientsPackage.RECIPIENT__LOCATED_AT:
				return getLocatedAt();
			case RecipientsPackage.RECIPIENT__LOCATED_IN:
				if (resolve) return getLocatedIn();
				return basicGetLocatedIn();
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
			case RecipientsPackage.RECIPIENT__LOCATED_AT:
				setLocatedAt((Location)newValue);
				return;
			case RecipientsPackage.RECIPIENT__LOCATED_IN:
				setLocatedIn((City)newValue);
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
			case RecipientsPackage.RECIPIENT__LOCATED_AT:
				setLocatedAt((Location)null);
				return;
			case RecipientsPackage.RECIPIENT__LOCATED_IN:
				setLocatedIn((City)null);
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
			case RecipientsPackage.RECIPIENT__LOCATED_AT:
				return locatedAt != null;
			case RecipientsPackage.RECIPIENT__LOCATED_IN:
				return locatedIn != null;
		}
		return super.eIsSet(featureID);
	}

} //RecipientImpl
