/**
 */
package org.nasdanika.models.governance.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.governance.Control;
import org.nasdanika.models.governance.ControlApplication;
import org.nasdanika.models.governance.Evidence;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.GovernedElement;
import org.nasdanika.models.governance.ImplementationStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.impl.ControlApplicationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.ControlApplicationImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.ControlApplicationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.ControlApplicationImpl#getLastVerified <em>Last Verified</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.ControlApplicationImpl#getEvidence <em>Evidence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlApplicationImpl extends ModelElementImpl implements ControlApplication {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ImplementationStatus STATUS_EDEFAULT = ImplementationStatus.PLANNED;

	/**
	 * The default value of the '{@link #getLastVerified() <em>Last Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastVerified()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_VERIFIED_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GovernancePackage.Literals.CONTROL_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GovernedElement getSubject() {
		return (GovernedElement)eDynamicGet(GovernancePackage.CONTROL_APPLICATION__SUBJECT, GovernancePackage.Literals.CONTROL_APPLICATION__SUBJECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GovernedElement basicGetSubject() {
		return (GovernedElement)eDynamicGet(GovernancePackage.CONTROL_APPLICATION__SUBJECT, GovernancePackage.Literals.CONTROL_APPLICATION__SUBJECT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(GovernedElement newSubject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSubject, GovernancePackage.CONTROL_APPLICATION__SUBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(GovernedElement newSubject) {
		eDynamicSet(GovernancePackage.CONTROL_APPLICATION__SUBJECT, GovernancePackage.Literals.CONTROL_APPLICATION__SUBJECT, newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Control getControl() {
		return (Control)eDynamicGet(GovernancePackage.CONTROL_APPLICATION__CONTROL, GovernancePackage.Literals.CONTROL_APPLICATION__CONTROL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control basicGetControl() {
		return (Control)eDynamicGet(GovernancePackage.CONTROL_APPLICATION__CONTROL, GovernancePackage.Literals.CONTROL_APPLICATION__CONTROL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControl(Control newControl) {
		eDynamicSet(GovernancePackage.CONTROL_APPLICATION__CONTROL, GovernancePackage.Literals.CONTROL_APPLICATION__CONTROL, newControl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationStatus getStatus() {
		return (ImplementationStatus)eDynamicGet(GovernancePackage.CONTROL_APPLICATION__STATUS, GovernancePackage.Literals.CONTROL_APPLICATION__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(ImplementationStatus newStatus) {
		eDynamicSet(GovernancePackage.CONTROL_APPLICATION__STATUS, GovernancePackage.Literals.CONTROL_APPLICATION__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastVerified() {
		return (Date)eDynamicGet(GovernancePackage.CONTROL_APPLICATION__LAST_VERIFIED, GovernancePackage.Literals.CONTROL_APPLICATION__LAST_VERIFIED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastVerified(Date newLastVerified) {
		eDynamicSet(GovernancePackage.CONTROL_APPLICATION__LAST_VERIFIED, GovernancePackage.Literals.CONTROL_APPLICATION__LAST_VERIFIED, newLastVerified);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Evidence> getEvidence() {
		return (EList<Evidence>)eDynamicGet(GovernancePackage.CONTROL_APPLICATION__EVIDENCE, GovernancePackage.Literals.CONTROL_APPLICATION__EVIDENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GovernancePackage.CONTROL_APPLICATION__SUBJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case GovernancePackage.CONTROL_APPLICATION__SUBJECT:
				return basicSetSubject(null, msgs);
			case GovernancePackage.CONTROL_APPLICATION__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GovernancePackage.CONTROL_APPLICATION__SUBJECT:
				return eInternalContainer().eInverseRemove(this, GovernancePackage.GOVERNED_ELEMENT__CONTROL_APPLICATIONS, GovernedElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GovernancePackage.CONTROL_APPLICATION__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case GovernancePackage.CONTROL_APPLICATION__CONTROL:
				if (resolve) return getControl();
				return basicGetControl();
			case GovernancePackage.CONTROL_APPLICATION__STATUS:
				return getStatus();
			case GovernancePackage.CONTROL_APPLICATION__LAST_VERIFIED:
				return getLastVerified();
			case GovernancePackage.CONTROL_APPLICATION__EVIDENCE:
				return getEvidence();
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
			case GovernancePackage.CONTROL_APPLICATION__SUBJECT:
				setSubject((GovernedElement)newValue);
				return;
			case GovernancePackage.CONTROL_APPLICATION__CONTROL:
				setControl((Control)newValue);
				return;
			case GovernancePackage.CONTROL_APPLICATION__STATUS:
				setStatus((ImplementationStatus)newValue);
				return;
			case GovernancePackage.CONTROL_APPLICATION__LAST_VERIFIED:
				setLastVerified((Date)newValue);
				return;
			case GovernancePackage.CONTROL_APPLICATION__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Evidence>)newValue);
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
			case GovernancePackage.CONTROL_APPLICATION__SUBJECT:
				setSubject((GovernedElement)null);
				return;
			case GovernancePackage.CONTROL_APPLICATION__CONTROL:
				setControl((Control)null);
				return;
			case GovernancePackage.CONTROL_APPLICATION__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case GovernancePackage.CONTROL_APPLICATION__LAST_VERIFIED:
				setLastVerified(LAST_VERIFIED_EDEFAULT);
				return;
			case GovernancePackage.CONTROL_APPLICATION__EVIDENCE:
				getEvidence().clear();
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
			case GovernancePackage.CONTROL_APPLICATION__SUBJECT:
				return basicGetSubject() != null;
			case GovernancePackage.CONTROL_APPLICATION__CONTROL:
				return basicGetControl() != null;
			case GovernancePackage.CONTROL_APPLICATION__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case GovernancePackage.CONTROL_APPLICATION__LAST_VERIFIED:
				return LAST_VERIFIED_EDEFAULT == null ? getLastVerified() != null : !LAST_VERIFIED_EDEFAULT.equals(getLastVerified());
			case GovernancePackage.CONTROL_APPLICATION__EVIDENCE:
				return !getEvidence().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlApplicationImpl
