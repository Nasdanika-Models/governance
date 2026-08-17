/**
 */
package org.nasdanika.models.governance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A risk: an uncertain event with a likelihood and an impact. Inherent values
 * describe the untreated risk; residual values describe what remains after
 * mitigations. Category is free-form here; the ai-governance extension
 * provides a typed AI risk taxonomy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.Risk#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Risk#getInherentLikelihood <em>Inherent Likelihood</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Risk#getInherentImpact <em>Inherent Impact</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Risk#getResidualLikelihood <em>Residual Likelihood</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Risk#getResidualImpact <em>Residual Impact</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Risk#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Risk#getMitigations <em>Mitigations</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.Risk#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.governance.GovernancePackage#getRisk()
 * @model
 * @generated
 */
public interface Risk extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see org.nasdanika.models.governance.GovernancePackage#getRisk_Category()
	 * @model unique="false"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Risk#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Inherent Likelihood</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.governance.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherent Likelihood</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #setInherentLikelihood(Level)
	 * @see org.nasdanika.models.governance.GovernancePackage#getRisk_InherentLikelihood()
	 * @model unique="false"
	 * @generated
	 */
	Level getInherentLikelihood();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Risk#getInherentLikelihood <em>Inherent Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherent Likelihood</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #getInherentLikelihood()
	 * @generated
	 */
	void setInherentLikelihood(Level value);

	/**
	 * Returns the value of the '<em><b>Inherent Impact</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.governance.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherent Impact</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #setInherentImpact(Level)
	 * @see org.nasdanika.models.governance.GovernancePackage#getRisk_InherentImpact()
	 * @model unique="false"
	 * @generated
	 */
	Level getInherentImpact();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Risk#getInherentImpact <em>Inherent Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherent Impact</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #getInherentImpact()
	 * @generated
	 */
	void setInherentImpact(Level value);

	/**
	 * Returns the value of the '<em><b>Residual Likelihood</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.governance.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residual Likelihood</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #setResidualLikelihood(Level)
	 * @see org.nasdanika.models.governance.GovernancePackage#getRisk_ResidualLikelihood()
	 * @model unique="false"
	 * @generated
	 */
	Level getResidualLikelihood();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Risk#getResidualLikelihood <em>Residual Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residual Likelihood</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #getResidualLikelihood()
	 * @generated
	 */
	void setResidualLikelihood(Level value);

	/**
	 * Returns the value of the '<em><b>Residual Impact</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.governance.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residual Impact</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #setResidualImpact(Level)
	 * @see org.nasdanika.models.governance.GovernancePackage#getRisk_ResidualImpact()
	 * @model unique="false"
	 * @generated
	 */
	Level getResidualImpact();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Risk#getResidualImpact <em>Residual Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residual Impact</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #getResidualImpact()
	 * @generated
	 */
	void setResidualImpact(Level value);

	/**
	 * Returns the value of the '<em><b>Treatment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.governance.RiskTreatment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treatment</em>' attribute.
	 * @see org.nasdanika.models.governance.RiskTreatment
	 * @see #setTreatment(RiskTreatment)
	 * @see org.nasdanika.models.governance.GovernancePackage#getRisk_Treatment()
	 * @model unique="false"
	 * @generated
	 */
	RiskTreatment getTreatment();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Risk#getTreatment <em>Treatment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treatment</em>' attribute.
	 * @see org.nasdanika.models.governance.RiskTreatment
	 * @see #getTreatment()
	 * @generated
	 */
	void setTreatment(RiskTreatment value);

	/**
	 * Returns the value of the '<em><b>Mitigations</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Control}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.governance.Control#getMitigates <em>Mitigates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigations</em>' reference list.
	 * @see org.nasdanika.models.governance.GovernancePackage#getRisk_Mitigations()
	 * @see org.nasdanika.models.governance.Control#getMitigates
	 * @model opposite="mitigates"
	 * @generated
	 */
	EList<Control> getMitigations();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.governance.GovernedElement#getRisks <em>Risks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  What the risk is about; anything governed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(GovernedElement)
	 * @see org.nasdanika.models.governance.GovernancePackage#getRisk_Subject()
	 * @see org.nasdanika.models.governance.GovernedElement#getRisks
	 * @model opposite="risks"
	 * @generated
	 */
	GovernedElement getSubject();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.governance.Risk#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(GovernedElement value);

} // Risk
