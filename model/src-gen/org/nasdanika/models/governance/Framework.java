/**
 */
package org.nasdanika.models.governance;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Frameworks and requirements ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.Framework#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Framework#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Framework#getWebsite <em>Website</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Framework#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.governance.GovernancePackage#getFramework()
 * @model
 * @generated
 */
public interface Framework extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Issuing authority, e.g. NIST, ISO/IEC, European Union, internal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authority</em>' attribute.
	 * @see #setAuthority(String)
	 * @see org.nasdanika.models.governance.GovernancePackage#getFramework_Authority()
	 * @model unique="false"
	 * @generated
	 */
	String getAuthority();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Framework#getAuthority <em>Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' attribute.
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.nasdanika.models.governance.GovernancePackage#getFramework_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Framework#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website</em>' attribute.
	 * @see #setWebsite(String)
	 * @see org.nasdanika.models.governance.GovernancePackage#getFramework_Website()
	 * @model unique="false"
	 * @generated
	 */
	String getWebsite();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Framework#getWebsite <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' attribute.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(String value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getFramework_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

} // Framework
