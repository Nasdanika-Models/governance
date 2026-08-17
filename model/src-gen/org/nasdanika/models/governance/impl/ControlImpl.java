/**
 */
package org.nasdanika.models.governance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.governance.Control;
import org.nasdanika.models.governance.ControlAutomation;
import org.nasdanika.models.governance.ControlNature;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.Requirement;
import org.nasdanika.models.governance.Risk;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.impl.ControlImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.ControlImpl#getAutomation <em>Automation</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.ControlImpl#getSatisfies <em>Satisfies</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.ControlImpl#getMitigates <em>Mitigates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlImpl extends ModelElementImpl implements Control {
	/**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final ControlNature NATURE_EDEFAULT = ControlNature.PREVENTIVE;

	/**
	 * The default value of the '{@link #getAutomation() <em>Automation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomation()
	 * @generated
	 * @ordered
	 */
	protected static final ControlAutomation AUTOMATION_EDEFAULT = ControlAutomation.MANUAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GovernancePackage.Literals.CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlNature getNature() {
		return (ControlNature)eDynamicGet(GovernancePackage.CONTROL__NATURE, GovernancePackage.Literals.CONTROL__NATURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNature(ControlNature newNature) {
		eDynamicSet(GovernancePackage.CONTROL__NATURE, GovernancePackage.Literals.CONTROL__NATURE, newNature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlAutomation getAutomation() {
		return (ControlAutomation)eDynamicGet(GovernancePackage.CONTROL__AUTOMATION, GovernancePackage.Literals.CONTROL__AUTOMATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomation(ControlAutomation newAutomation) {
		eDynamicSet(GovernancePackage.CONTROL__AUTOMATION, GovernancePackage.Literals.CONTROL__AUTOMATION, newAutomation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Requirement> getSatisfies() {
		return (EList<Requirement>)eDynamicGet(GovernancePackage.CONTROL__SATISFIES, GovernancePackage.Literals.CONTROL__SATISFIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Risk> getMitigates() {
		return (EList<Risk>)eDynamicGet(GovernancePackage.CONTROL__MITIGATES, GovernancePackage.Literals.CONTROL__MITIGATES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GovernancePackage.CONTROL__MITIGATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMitigates()).basicAdd(otherEnd, msgs);
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
			case GovernancePackage.CONTROL__MITIGATES:
				return ((InternalEList<?>)getMitigates()).basicRemove(otherEnd, msgs);
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
			case GovernancePackage.CONTROL__NATURE:
				return getNature();
			case GovernancePackage.CONTROL__AUTOMATION:
				return getAutomation();
			case GovernancePackage.CONTROL__SATISFIES:
				return getSatisfies();
			case GovernancePackage.CONTROL__MITIGATES:
				return getMitigates();
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
			case GovernancePackage.CONTROL__NATURE:
				setNature((ControlNature)newValue);
				return;
			case GovernancePackage.CONTROL__AUTOMATION:
				setAutomation((ControlAutomation)newValue);
				return;
			case GovernancePackage.CONTROL__SATISFIES:
				getSatisfies().clear();
				getSatisfies().addAll((Collection<? extends Requirement>)newValue);
				return;
			case GovernancePackage.CONTROL__MITIGATES:
				getMitigates().clear();
				getMitigates().addAll((Collection<? extends Risk>)newValue);
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
			case GovernancePackage.CONTROL__NATURE:
				setNature(NATURE_EDEFAULT);
				return;
			case GovernancePackage.CONTROL__AUTOMATION:
				setAutomation(AUTOMATION_EDEFAULT);
				return;
			case GovernancePackage.CONTROL__SATISFIES:
				getSatisfies().clear();
				return;
			case GovernancePackage.CONTROL__MITIGATES:
				getMitigates().clear();
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
			case GovernancePackage.CONTROL__NATURE:
				return getNature() != NATURE_EDEFAULT;
			case GovernancePackage.CONTROL__AUTOMATION:
				return getAutomation() != AUTOMATION_EDEFAULT;
			case GovernancePackage.CONTROL__SATISFIES:
				return !getSatisfies().isEmpty();
			case GovernancePackage.CONTROL__MITIGATES:
				return !getMitigates().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlImpl
