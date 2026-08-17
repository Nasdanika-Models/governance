/**
 */
package org.nasdanika.models.governance;

import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Waiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An approved, time-boxed deviation: a control not applied, a policy not met.
 * Governance without waivers is fiction; modeling them keeps the record honest.
 * Approval records (who, in what role) come from the role model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.Waiver#getControl <em>Control</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Waiver#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Waiver#getJustification <em>Justification</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.governance.GovernancePackage#getWaiver()
 * @model
 * @generated
 */
public interface Waiver extends ModelElement, Period {
	/**
	 * Returns the value of the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' reference.
	 * @see #setControl(Control)
	 * @see org.nasdanika.models.governance.GovernancePackage#getWaiver_Control()
	 * @model
	 * @generated
	 */
	Control getControl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Waiver#getControl <em>Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(Control value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.governance.Governed#getWaivers <em>Waivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(Governed)
	 * @see org.nasdanika.models.governance.GovernancePackage#getWaiver_Subject()
	 * @see org.nasdanika.models.governance.Governed#getWaivers
	 * @model opposite="waivers"
	 * @generated
	 */
	Governed getSubject();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Waiver#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Governed value);

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Markdown justification and compensating measures.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Justification</em>' attribute.
	 * @see #setJustification(String)
	 * @see org.nasdanika.models.governance.GovernancePackage#getWaiver_Justification()
	 * @model unique="false"
	 * @generated
	 */
	String getJustification();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Waiver#getJustification <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' attribute.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(String value);

} // Waiver
