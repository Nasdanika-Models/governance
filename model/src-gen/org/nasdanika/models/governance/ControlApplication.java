/**
 */
package org.nasdanika.models.governance;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The application of a control to a governed element: the unit of compliance
 * status. "Control X on system Y is VERIFIED, and here is the evidence."
 * TODO - to Staged and drop implementation status
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.ControlApplication#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.ControlApplication#getControl <em>Control</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.ControlApplication#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.ControlApplication#getLastVerified <em>Last Verified</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.ControlApplication#getEvidence <em>Evidence</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.governance.GovernancePackage#getControlApplication()
 * @model
 * @generated
 */
public interface ControlApplication extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.governance.Governed#getControlApplications <em>Control Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' container reference.
	 * @see #setSubject(Governed)
	 * @see org.nasdanika.models.governance.GovernancePackage#getControlApplication_Subject()
	 * @see org.nasdanika.models.governance.Governed#getControlApplications
	 * @model opposite="controlApplications" transient="false"
	 * @generated
	 */
	Governed getSubject();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.ControlApplication#getSubject <em>Subject</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' container reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Governed value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' reference.
	 * @see #setControl(Control)
	 * @see org.nasdanika.models.governance.GovernancePackage#getControlApplication_Control()
	 * @model
	 * @generated
	 */
	Control getControl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.ControlApplication#getControl <em>Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(Control value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.governance.ImplementationStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.governance.ImplementationStatus
	 * @see #setStatus(ImplementationStatus)
	 * @see org.nasdanika.models.governance.GovernancePackage#getControlApplication_Status()
	 * @model unique="false"
	 * @generated
	 */
	ImplementationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.ControlApplication#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.governance.ImplementationStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ImplementationStatus value);

	/**
	 * Returns the value of the '<em><b>Last Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Verified</em>' attribute.
	 * @see #setLastVerified(Date)
	 * @see org.nasdanika.models.governance.GovernancePackage#getControlApplication_LastVerified()
	 * @model unique="false"
	 * @generated
	 */
	Date getLastVerified();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.ControlApplication#getLastVerified <em>Last Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Verified</em>' attribute.
	 * @see #getLastVerified()
	 * @generated
	 */
	void setLastVerified(Date value);

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Evidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getControlApplication_Evidence()
	 * @model containment="true"
	 * @generated
	 */
	EList<Evidence> getEvidence();

} // ControlApplication
