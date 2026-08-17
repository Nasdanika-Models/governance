/**
 */
package org.nasdanika.models.governance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A safeguard: a repeatable measure that mitigates risks and satisfies
 * requirements. Controls are defined once and applied to many governed
 * elements via ControlApplication.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.Control#getNature <em>Nature</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Control#getAutomation <em>Automation</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Control#getSatisfies <em>Satisfies</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Control#getMitigates <em>Mitigates</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.governance.GovernancePackage#getControl()
 * @model
 * @generated
 */
public interface Control extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.governance.ControlNature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see org.nasdanika.models.governance.ControlNature
	 * @see #setNature(ControlNature)
	 * @see org.nasdanika.models.governance.GovernancePackage#getControl_Nature()
	 * @model unique="false"
	 * @generated
	 */
	ControlNature getNature();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Control#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see org.nasdanika.models.governance.ControlNature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(ControlNature value);

	/**
	 * Returns the value of the '<em><b>Automation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.governance.ControlAutomation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automation</em>' attribute.
	 * @see org.nasdanika.models.governance.ControlAutomation
	 * @see #setAutomation(ControlAutomation)
	 * @see org.nasdanika.models.governance.GovernancePackage#getControl_Automation()
	 * @model unique="false"
	 * @generated
	 */
	ControlAutomation getAutomation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Control#getAutomation <em>Automation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automation</em>' attribute.
	 * @see org.nasdanika.models.governance.ControlAutomation
	 * @see #getAutomation()
	 * @generated
	 */
	void setAutomation(ControlAutomation value);

	/**
	 * Returns the value of the '<em><b>Satisfies</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Crosswalk: requirements in any number of frameworks this control satisfies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satisfies</em>' reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getControl_Satisfies()
	 * @model
	 * @generated
	 */
	EList<Requirement> getSatisfies();

	/**
	 * Returns the value of the '<em><b>Mitigates</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Risk}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.governance.Risk#getMitigations <em>Mitigations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Risks this control mitigates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mitigates</em>' reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getControl_Mitigates()
	 * @see org.nasdanika.models.governance.Risk#getMitigations
	 * @model opposite="mitigations"
	 * @generated
	 */
	EList<Risk> getMitigates();

} // Control
