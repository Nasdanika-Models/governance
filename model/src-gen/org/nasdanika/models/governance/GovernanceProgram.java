/**
 */
package org.nasdanika.models.governance;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Program (root container) ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.GovernanceProgram#getFrameworks <em>Frameworks</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.GovernanceProgram#getPolicies <em>Policies</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.GovernanceProgram#getControls <em>Controls</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.GovernanceProgram#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.GovernanceProgram#getAssessments <em>Assessments</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.GovernanceProgram#getWaivers <em>Waivers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.governance.GovernancePackage#getGovernanceProgram()
 * @model
 * @generated
 */
public interface GovernanceProgram extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Frameworks</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Framework}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frameworks</em>' containment reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getGovernanceProgram_Frameworks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Framework> getFrameworks();

	/**
	 * Returns the value of the '<em><b>Policies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Policy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policies</em>' containment reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getGovernanceProgram_Policies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Policy> getPolicies();

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getGovernanceProgram_Controls()
	 * @model containment="true"
	 * @generated
	 */
	EList<Control> getControls();

	/**
	 * Returns the value of the '<em><b>Risks</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Risk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risks</em>' containment reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getGovernanceProgram_Risks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Risk> getRisks();

	/**
	 * Returns the value of the '<em><b>Assessments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Assessment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessments</em>' containment reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getGovernanceProgram_Assessments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assessment> getAssessments();

	/**
	 * Returns the value of the '<em><b>Waivers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Waiver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waivers</em>' containment reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getGovernanceProgram_Waivers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Waiver> getWaivers();

} // GovernanceProgram
