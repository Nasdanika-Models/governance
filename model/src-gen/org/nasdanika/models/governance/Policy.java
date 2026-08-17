/**
 */
package org.nasdanika.models.governance;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Policies ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.Policy#getSatisfies <em>Satisfies</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Policy#getEnforcedBy <em>Enforced By</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.governance.GovernancePackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Satisfies</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Framework requirements this policy addresses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satisfies</em>' reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getPolicy_Satisfies()
	 * @model
	 * @generated
	 */
	EList<Requirement> getSatisfies();

	/**
	 * Returns the value of the '<em><b>Enforced By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Controls that enforce this policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enforced By</em>' reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getPolicy_EnforcedBy()
	 * @model
	 * @generated
	 */
	EList<Control> getEnforcedBy();

} // Policy
