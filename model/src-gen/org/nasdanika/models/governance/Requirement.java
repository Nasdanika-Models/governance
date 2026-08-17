/**
 */
package org.nasdanika.models.governance;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single requirement within a framework, hierarchical to mirror framework
 * structure (function > category > subcategory, article > paragraph).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.Requirement#getReference <em>Reference</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Requirement#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.governance.GovernancePackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Reference identifier within the framework, e.g. "GOVERN 1.1", "A.6.2.4", "Art. 9".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see org.nasdanika.models.governance.GovernancePackage#getRequirement_Reference()
	 * @model unique="false"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Requirement#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getRequirement_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getChildren();

} // Requirement
