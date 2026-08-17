/**
 */
package org.nasdanika.models.governance;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Evidence ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.Evidence#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Evidence#getCollected <em>Collected</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Evidence#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Evidence#isAutomated <em>Automated</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.governance.GovernancePackage#getEvidence()
 * @model
 * @generated
 */
public interface Evidence extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  URI of the artifact: document, dashboard, query, repository path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.nasdanika.models.governance.GovernancePackage#getEvidence_Location()
	 * @model unique="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Evidence#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Collected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collected</em>' attribute.
	 * @see #setCollected(Date)
	 * @see org.nasdanika.models.governance.GovernancePackage#getEvidence_Collected()
	 * @model unique="false"
	 * @generated
	 */
	Date getCollected();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Evidence#getCollected <em>Collected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collected</em>' attribute.
	 * @see #getCollected()
	 * @generated
	 */
	void setCollected(Date value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Producing party or system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.nasdanika.models.governance.GovernancePackage#getEvidence_Source()
	 * @model unique="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Evidence#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Automated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automated</em>' attribute.
	 * @see #setAutomated(boolean)
	 * @see org.nasdanika.models.governance.GovernancePackage#getEvidence_Automated()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAutomated();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Evidence#isAutomated <em>Automated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automated</em>' attribute.
	 * @see #isAutomated()
	 * @generated
	 */
	void setAutomated(boolean value);

} // Evidence
