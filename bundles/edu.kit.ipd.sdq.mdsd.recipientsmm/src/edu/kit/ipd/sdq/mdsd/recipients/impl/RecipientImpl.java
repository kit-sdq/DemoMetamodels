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
 *   <li>{@link edu.kit.ipd.sdq.mdsd.recipients.impl.RecipientImpl#isBusiness <em>Business</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.mdsd.recipients.impl.RecipientImpl#getLocatedAt <em>Located At</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.mdsd.recipients.impl.RecipientImpl#getLocatedIn <em>Located In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecipientImpl extends IdentifiedElementImpl implements Recipient {
	/**
	 * The default value of the '{@link #isBusiness() <em>Business</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBusiness()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUSINESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBusiness() <em>Business</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBusiness()
	 * @generated
	 * @ordered
	 */
	protected boolean business = BUSINESS_EDEFAULT;

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
	 * The cached value of the '{@link #getLocatedIn() <em>Located In</em>}' containment reference.
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
	public boolean isBusiness() {
		return business;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusiness(boolean newBusiness) {
		boolean oldBusiness = business;
		business = newBusiness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipientsPackage.RECIPIENT__BUSINESS, oldBusiness, business));
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
		return locatedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocatedIn(City newLocatedIn, NotificationChain msgs) {
		City oldLocatedIn = locatedIn;
		locatedIn = newLocatedIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecipientsPackage.RECIPIENT__LOCATED_IN, oldLocatedIn, newLocatedIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocatedIn(City newLocatedIn) {
		if (newLocatedIn != locatedIn) {
			NotificationChain msgs = null;
			if (locatedIn != null)
				msgs = ((InternalEObject)locatedIn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RecipientsPackage.RECIPIENT__LOCATED_IN, null, msgs);
			if (newLocatedIn != null)
				msgs = ((InternalEObject)newLocatedIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RecipientsPackage.RECIPIENT__LOCATED_IN, null, msgs);
			msgs = basicSetLocatedIn(newLocatedIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipientsPackage.RECIPIENT__LOCATED_IN, newLocatedIn, newLocatedIn));
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
			case RecipientsPackage.RECIPIENT__LOCATED_IN:
				return basicSetLocatedIn(null, msgs);
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
			case RecipientsPackage.RECIPIENT__BUSINESS:
				return isBusiness();
			case RecipientsPackage.RECIPIENT__LOCATED_AT:
				return getLocatedAt();
			case RecipientsPackage.RECIPIENT__LOCATED_IN:
				return getLocatedIn();
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
			case RecipientsPackage.RECIPIENT__BUSINESS:
				setBusiness((Boolean)newValue);
				return;
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
			case RecipientsPackage.RECIPIENT__BUSINESS:
				setBusiness(BUSINESS_EDEFAULT);
				return;
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
			case RecipientsPackage.RECIPIENT__BUSINESS:
				return business != BUSINESS_EDEFAULT;
			case RecipientsPackage.RECIPIENT__LOCATED_AT:
				return locatedAt != null;
			case RecipientsPackage.RECIPIENT__LOCATED_IN:
				return locatedIn != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (business: ");
		result.append(business);
		result.append(')');
		return result.toString();
	}

} //RecipientImpl
