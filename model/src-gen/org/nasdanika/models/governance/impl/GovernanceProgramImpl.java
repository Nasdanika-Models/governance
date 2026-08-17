/**
 */
package org.nasdanika.models.governance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.governance.Assessment;
import org.nasdanika.models.governance.Control;
import org.nasdanika.models.governance.Framework;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.GovernanceProgram;
import org.nasdanika.models.governance.Policy;
import org.nasdanika.models.governance.Risk;
import org.nasdanika.models.governance.Waiver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.impl.GovernanceProgramImpl#getFrameworks <em>Frameworks</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.GovernanceProgramImpl#getPolicies <em>Policies</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.GovernanceProgramImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.GovernanceProgramImpl#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.GovernanceProgramImpl#getAssessments <em>Assessments</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.GovernanceProgramImpl#getWaivers <em>Waivers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovernanceProgramImpl extends ModelElementImpl implements GovernanceProgram {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GovernanceProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GovernancePackage.Literals.GOVERNANCE_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Framework> getFrameworks() {
		return (EList<Framework>)eDynamicGet(GovernancePackage.GOVERNANCE_PROGRAM__FRAMEWORKS, GovernancePackage.Literals.GOVERNANCE_PROGRAM__FRAMEWORKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Policy> getPolicies() {
		return (EList<Policy>)eDynamicGet(GovernancePackage.GOVERNANCE_PROGRAM__POLICIES, GovernancePackage.Literals.GOVERNANCE_PROGRAM__POLICIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Control> getControls() {
		return (EList<Control>)eDynamicGet(GovernancePackage.GOVERNANCE_PROGRAM__CONTROLS, GovernancePackage.Literals.GOVERNANCE_PROGRAM__CONTROLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Risk> getRisks() {
		return (EList<Risk>)eDynamicGet(GovernancePackage.GOVERNANCE_PROGRAM__RISKS, GovernancePackage.Literals.GOVERNANCE_PROGRAM__RISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Assessment> getAssessments() {
		return (EList<Assessment>)eDynamicGet(GovernancePackage.GOVERNANCE_PROGRAM__ASSESSMENTS, GovernancePackage.Literals.GOVERNANCE_PROGRAM__ASSESSMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Waiver> getWaivers() {
		return (EList<Waiver>)eDynamicGet(GovernancePackage.GOVERNANCE_PROGRAM__WAIVERS, GovernancePackage.Literals.GOVERNANCE_PROGRAM__WAIVERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GovernancePackage.GOVERNANCE_PROGRAM__FRAMEWORKS:
				return ((InternalEList<?>)getFrameworks()).basicRemove(otherEnd, msgs);
			case GovernancePackage.GOVERNANCE_PROGRAM__POLICIES:
				return ((InternalEList<?>)getPolicies()).basicRemove(otherEnd, msgs);
			case GovernancePackage.GOVERNANCE_PROGRAM__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case GovernancePackage.GOVERNANCE_PROGRAM__RISKS:
				return ((InternalEList<?>)getRisks()).basicRemove(otherEnd, msgs);
			case GovernancePackage.GOVERNANCE_PROGRAM__ASSESSMENTS:
				return ((InternalEList<?>)getAssessments()).basicRemove(otherEnd, msgs);
			case GovernancePackage.GOVERNANCE_PROGRAM__WAIVERS:
				return ((InternalEList<?>)getWaivers()).basicRemove(otherEnd, msgs);
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
			case GovernancePackage.GOVERNANCE_PROGRAM__FRAMEWORKS:
				return getFrameworks();
			case GovernancePackage.GOVERNANCE_PROGRAM__POLICIES:
				return getPolicies();
			case GovernancePackage.GOVERNANCE_PROGRAM__CONTROLS:
				return getControls();
			case GovernancePackage.GOVERNANCE_PROGRAM__RISKS:
				return getRisks();
			case GovernancePackage.GOVERNANCE_PROGRAM__ASSESSMENTS:
				return getAssessments();
			case GovernancePackage.GOVERNANCE_PROGRAM__WAIVERS:
				return getWaivers();
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
			case GovernancePackage.GOVERNANCE_PROGRAM__FRAMEWORKS:
				getFrameworks().clear();
				getFrameworks().addAll((Collection<? extends Framework>)newValue);
				return;
			case GovernancePackage.GOVERNANCE_PROGRAM__POLICIES:
				getPolicies().clear();
				getPolicies().addAll((Collection<? extends Policy>)newValue);
				return;
			case GovernancePackage.GOVERNANCE_PROGRAM__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Control>)newValue);
				return;
			case GovernancePackage.GOVERNANCE_PROGRAM__RISKS:
				getRisks().clear();
				getRisks().addAll((Collection<? extends Risk>)newValue);
				return;
			case GovernancePackage.GOVERNANCE_PROGRAM__ASSESSMENTS:
				getAssessments().clear();
				getAssessments().addAll((Collection<? extends Assessment>)newValue);
				return;
			case GovernancePackage.GOVERNANCE_PROGRAM__WAIVERS:
				getWaivers().clear();
				getWaivers().addAll((Collection<? extends Waiver>)newValue);
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
			case GovernancePackage.GOVERNANCE_PROGRAM__FRAMEWORKS:
				getFrameworks().clear();
				return;
			case GovernancePackage.GOVERNANCE_PROGRAM__POLICIES:
				getPolicies().clear();
				return;
			case GovernancePackage.GOVERNANCE_PROGRAM__CONTROLS:
				getControls().clear();
				return;
			case GovernancePackage.GOVERNANCE_PROGRAM__RISKS:
				getRisks().clear();
				return;
			case GovernancePackage.GOVERNANCE_PROGRAM__ASSESSMENTS:
				getAssessments().clear();
				return;
			case GovernancePackage.GOVERNANCE_PROGRAM__WAIVERS:
				getWaivers().clear();
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
			case GovernancePackage.GOVERNANCE_PROGRAM__FRAMEWORKS:
				return !getFrameworks().isEmpty();
			case GovernancePackage.GOVERNANCE_PROGRAM__POLICIES:
				return !getPolicies().isEmpty();
			case GovernancePackage.GOVERNANCE_PROGRAM__CONTROLS:
				return !getControls().isEmpty();
			case GovernancePackage.GOVERNANCE_PROGRAM__RISKS:
				return !getRisks().isEmpty();
			case GovernancePackage.GOVERNANCE_PROGRAM__ASSESSMENTS:
				return !getAssessments().isEmpty();
			case GovernancePackage.GOVERNANCE_PROGRAM__WAIVERS:
				return !getWaivers().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GovernanceProgramImpl
