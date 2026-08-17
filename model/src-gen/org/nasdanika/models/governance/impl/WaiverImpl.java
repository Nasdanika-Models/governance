/**
 */
package org.nasdanika.models.governance.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.governance.Control;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.GovernedElement;
import org.nasdanika.models.governance.Waiver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Waiver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.impl.WaiverImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.WaiverImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.WaiverImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.WaiverImpl#getExpires <em>Expires</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WaiverImpl extends ModelElementImpl implements Waiver {
	/**
	 * The default value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFICATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExpires() <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRES_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaiverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GovernancePackage.Literals.WAIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Control getControl() {
		return (Control)eDynamicGet(GovernancePackage.WAIVER__CONTROL, GovernancePackage.Literals.WAIVER__CONTROL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control basicGetControl() {
		return (Control)eDynamicGet(GovernancePackage.WAIVER__CONTROL, GovernancePackage.Literals.WAIVER__CONTROL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControl(Control newControl) {
		eDynamicSet(GovernancePackage.WAIVER__CONTROL, GovernancePackage.Literals.WAIVER__CONTROL, newControl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GovernedElement getSubject() {
		return (GovernedElement)eDynamicGet(GovernancePackage.WAIVER__SUBJECT, GovernancePackage.Literals.WAIVER__SUBJECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GovernedElement basicGetSubject() {
		return (GovernedElement)eDynamicGet(GovernancePackage.WAIVER__SUBJECT, GovernancePackage.Literals.WAIVER__SUBJECT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(GovernedElement newSubject, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSubject, GovernancePackage.WAIVER__SUBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(GovernedElement newSubject) {
		eDynamicSet(GovernancePackage.WAIVER__SUBJECT, GovernancePackage.Literals.WAIVER__SUBJECT, newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJustification() {
		return (String)eDynamicGet(GovernancePackage.WAIVER__JUSTIFICATION, GovernancePackage.Literals.WAIVER__JUSTIFICATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJustification(String newJustification) {
		eDynamicSet(GovernancePackage.WAIVER__JUSTIFICATION, GovernancePackage.Literals.WAIVER__JUSTIFICATION, newJustification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpires() {
		return (Date)eDynamicGet(GovernancePackage.WAIVER__EXPIRES, GovernancePackage.Literals.WAIVER__EXPIRES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpires(Date newExpires) {
		eDynamicSet(GovernancePackage.WAIVER__EXPIRES, GovernancePackage.Literals.WAIVER__EXPIRES, newExpires);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GovernancePackage.WAIVER__SUBJECT:
				GovernedElement subject = basicGetSubject();
				if (subject != null)
					msgs = ((InternalEObject)subject).eInverseRemove(this, GovernancePackage.GOVERNED_ELEMENT__WAIVERS, GovernedElement.class, msgs);
				return basicSetSubject((GovernedElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GovernancePackage.WAIVER__SUBJECT:
				return basicSetSubject(null, msgs);
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
			case GovernancePackage.WAIVER__CONTROL:
				if (resolve) return getControl();
				return basicGetControl();
			case GovernancePackage.WAIVER__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case GovernancePackage.WAIVER__JUSTIFICATION:
				return getJustification();
			case GovernancePackage.WAIVER__EXPIRES:
				return getExpires();
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
			case GovernancePackage.WAIVER__CONTROL:
				setControl((Control)newValue);
				return;
			case GovernancePackage.WAIVER__SUBJECT:
				setSubject((GovernedElement)newValue);
				return;
			case GovernancePackage.WAIVER__JUSTIFICATION:
				setJustification((String)newValue);
				return;
			case GovernancePackage.WAIVER__EXPIRES:
				setExpires((Date)newValue);
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
			case GovernancePackage.WAIVER__CONTROL:
				setControl((Control)null);
				return;
			case GovernancePackage.WAIVER__SUBJECT:
				setSubject((GovernedElement)null);
				return;
			case GovernancePackage.WAIVER__JUSTIFICATION:
				setJustification(JUSTIFICATION_EDEFAULT);
				return;
			case GovernancePackage.WAIVER__EXPIRES:
				setExpires(EXPIRES_EDEFAULT);
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
			case GovernancePackage.WAIVER__CONTROL:
				return basicGetControl() != null;
			case GovernancePackage.WAIVER__SUBJECT:
				return basicGetSubject() != null;
			case GovernancePackage.WAIVER__JUSTIFICATION:
				return JUSTIFICATION_EDEFAULT == null ? getJustification() != null : !JUSTIFICATION_EDEFAULT.equals(getJustification());
			case GovernancePackage.WAIVER__EXPIRES:
				return EXPIRES_EDEFAULT == null ? getExpires() != null : !EXPIRES_EDEFAULT.equals(getExpires());
		}
		return super.eIsSet(featureID);
	}

} //WaiverImpl
