/**
 */
package org.nasdanika.models.governance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Governed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Governed elements ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.GovernedElement#getControlApplications <em>Control Applications</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.GovernedElement#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.GovernedElement#getWaivers <em>Waivers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.governance.GovernancePackage#getGovernedElement()
 * @model abstract="true"
 * @generated
 */
public interface GovernedElement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Control Applications</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.ControlApplication}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.governance.ControlApplication#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Applications</em>' containment reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getGovernedElement_ControlApplications()
	 * @see org.nasdanika.models.governance.ControlApplication#getSubject
	 * @model opposite="subject" containment="true"
	 * @generated
	 */
	EList<ControlApplication> getControlApplications();

	/**
	 * Returns the value of the '<em><b>Risks</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Risk}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.governance.Risk#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risks</em>' reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getGovernedElement_Risks()
	 * @see org.nasdanika.models.governance.Risk#getSubject
	 * @model opposite="subject"
	 * @generated
	 */
	EList<Risk> getRisks();

	/**
	 * Returns the value of the '<em><b>Waivers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Waiver}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.governance.Waiver#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waivers</em>' reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getGovernedElement_Waivers()
	 * @see org.nasdanika.models.governance.Waiver#getSubject
	 * @model opposite="subject"
	 * @generated
	 */
	EList<Waiver> getWaivers();

} // GovernedElement
