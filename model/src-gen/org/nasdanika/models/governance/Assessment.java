/**
 */
package org.nasdanika.models.governance;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.Period;

import org.nasdanika.models.role.Undergoer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Assessments, findings, waivers ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.Assessment#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Assessment#getFindings <em>Findings</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Assessment#getEvidence <em>Evidence</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.governance.GovernancePackage#getAssessment()
 * @model
 * @generated
 */
public interface Assessment extends ModelElement, Period, Undergoer {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Governed}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Assessing party: internal audit, second line, external auditor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getAssessment_Scope()
	 * @model
	 * @generated
	 */
	EList<Governed> getScope();

	/**
	 * Returns the value of the '<em><b>Findings</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Finding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Findings</em>' containment reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getAssessment_Findings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Finding> getFindings();

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Evidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getAssessment_Evidence()
	 * @model containment="true"
	 * @generated
	 */
	EList<Evidence> getEvidence();

} // Assessment
