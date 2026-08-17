/**
 */
package org.nasdanika.models.governance.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.governance.Control;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.Policy;
import org.nasdanika.models.governance.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.impl.PolicyImpl#getSatisfies <em>Satisfies</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.PolicyImpl#getEnforcedBy <em>Enforced By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicyImpl extends ModelElementImpl implements Policy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GovernancePackage.Literals.POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Requirement> getSatisfies() {
		return (EList<Requirement>)eDynamicGet(GovernancePackage.POLICY__SATISFIES, GovernancePackage.Literals.POLICY__SATISFIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Control> getEnforcedBy() {
		return (EList<Control>)eDynamicGet(GovernancePackage.POLICY__ENFORCED_BY, GovernancePackage.Literals.POLICY__ENFORCED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GovernancePackage.POLICY__SATISFIES:
				return getSatisfies();
			case GovernancePackage.POLICY__ENFORCED_BY:
				return getEnforcedBy();
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
			case GovernancePackage.POLICY__SATISFIES:
				getSatisfies().clear();
				getSatisfies().addAll((Collection<? extends Requirement>)newValue);
				return;
			case GovernancePackage.POLICY__ENFORCED_BY:
				getEnforcedBy().clear();
				getEnforcedBy().addAll((Collection<? extends Control>)newValue);
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
			case GovernancePackage.POLICY__SATISFIES:
				getSatisfies().clear();
				return;
			case GovernancePackage.POLICY__ENFORCED_BY:
				getEnforcedBy().clear();
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
			case GovernancePackage.POLICY__SATISFIES:
				return !getSatisfies().isEmpty();
			case GovernancePackage.POLICY__ENFORCED_BY:
				return !getEnforcedBy().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PolicyImpl
