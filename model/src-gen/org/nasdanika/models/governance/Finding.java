/**
 */
package org.nasdanika.models.governance;

import java.util.Date;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * TODO - to staged
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.Finding#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Finding#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Finding#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Finding#getRemediation <em>Remediation</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Finding#getDue <em>Due</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.governance.GovernancePackage#getFinding()
 * @model
 * @generated
 */
public interface Finding extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.governance.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #setSeverity(Level)
	 * @see org.nasdanika.models.governance.GovernancePackage#getFinding_Severity()
	 * @model unique="false"
	 * @generated
	 */
	Level getSeverity();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Finding#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Level value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.governance.FindingStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.governance.FindingStatus
	 * @see #setStatus(FindingStatus)
	 * @see org.nasdanika.models.governance.GovernancePackage#getFinding_Status()
	 * @model unique="false"
	 * @generated
	 */
	FindingStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Finding#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.governance.FindingStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(FindingStatus value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The control application the finding is about, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(ControlApplication)
	 * @see org.nasdanika.models.governance.GovernancePackage#getFinding_Subject()
	 * @model
	 * @generated
	 */
	ControlApplication getSubject();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Finding#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(ControlApplication value);

	/**
	 * Returns the value of the '<em><b>Remediation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Markdown remediation plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remediation</em>' attribute.
	 * @see #setRemediation(String)
	 * @see org.nasdanika.models.governance.GovernancePackage#getFinding_Remediation()
	 * @model unique="false"
	 * @generated
	 */
	String getRemediation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Finding#getRemediation <em>Remediation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remediation</em>' attribute.
	 * @see #getRemediation()
	 * @generated
	 */
	void setRemediation(String value);

	/**
	 * Returns the value of the '<em><b>Due</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due</em>' attribute.
	 * @see #setDue(Date)
	 * @see org.nasdanika.models.governance.GovernancePackage#getFinding_Due()
	 * @model unique="false"
	 * @generated
	 */
	Date getDue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Finding#getDue <em>Due</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due</em>' attribute.
	 * @see #getDue()
	 * @generated
	 */
	void setDue(Date value);

} // Finding
