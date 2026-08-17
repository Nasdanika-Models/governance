/**
 */
package org.nasdanika.models.governance.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.governance.Assessment;
import org.nasdanika.models.governance.Evidence;
import org.nasdanika.models.governance.Finding;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.GovernedElement;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.impl.AssessmentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.AssessmentImpl#getAssessor <em>Assessor</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.AssessmentImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.AssessmentImpl#getFindings <em>Findings</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.AssessmentImpl#getEvidence <em>Evidence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssessmentImpl extends ModelElementImpl implements Assessment {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAssessor() <em>Assessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessor()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSESSOR_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GovernancePackage.Literals.ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return (Date)eDynamicGet(GovernancePackage.ASSESSMENT__DATE, GovernancePackage.Literals.ASSESSMENT__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		eDynamicSet(GovernancePackage.ASSESSMENT__DATE, GovernancePackage.Literals.ASSESSMENT__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssessor() {
		return (String)eDynamicGet(GovernancePackage.ASSESSMENT__ASSESSOR, GovernancePackage.Literals.ASSESSMENT__ASSESSOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssessor(String newAssessor) {
		eDynamicSet(GovernancePackage.ASSESSMENT__ASSESSOR, GovernancePackage.Literals.ASSESSMENT__ASSESSOR, newAssessor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<GovernedElement> getScope() {
		return (EList<GovernedElement>)eDynamicGet(GovernancePackage.ASSESSMENT__SCOPE, GovernancePackage.Literals.ASSESSMENT__SCOPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Finding> getFindings() {
		return (EList<Finding>)eDynamicGet(GovernancePackage.ASSESSMENT__FINDINGS, GovernancePackage.Literals.ASSESSMENT__FINDINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Evidence> getEvidence() {
		return (EList<Evidence>)eDynamicGet(GovernancePackage.ASSESSMENT__EVIDENCE, GovernancePackage.Literals.ASSESSMENT__EVIDENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GovernancePackage.ASSESSMENT__FINDINGS:
				return ((InternalEList<?>)getFindings()).basicRemove(otherEnd, msgs);
			case GovernancePackage.ASSESSMENT__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GovernancePackage.ASSESSMENT__DATE:
				return getDate();
			case GovernancePackage.ASSESSMENT__ASSESSOR:
				return getAssessor();
			case GovernancePackage.ASSESSMENT__SCOPE:
				return getScope();
			case GovernancePackage.ASSESSMENT__FINDINGS:
				return getFindings();
			case GovernancePackage.ASSESSMENT__EVIDENCE:
				return getEvidence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GovernancePackage.ASSESSMENT__DATE:
				setDate((Date)newValue);
				return;
			case GovernancePackage.ASSESSMENT__ASSESSOR:
				setAssessor((String)newValue);
				return;
			case GovernancePackage.ASSESSMENT__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends GovernedElement>)newValue);
				return;
			case GovernancePackage.ASSESSMENT__FINDINGS:
				getFindings().clear();
				getFindings().addAll((Collection<? extends Finding>)newValue);
				return;
			case GovernancePackage.ASSESSMENT__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Evidence>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GovernancePackage.ASSESSMENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case GovernancePackage.ASSESSMENT__ASSESSOR:
				setAssessor(ASSESSOR_EDEFAULT);
				return;
			case GovernancePackage.ASSESSMENT__SCOPE:
				getScope().clear();
				return;
			case GovernancePackage.ASSESSMENT__FINDINGS:
				getFindings().clear();
				return;
			case GovernancePackage.ASSESSMENT__EVIDENCE:
				getEvidence().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GovernancePackage.ASSESSMENT__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case GovernancePackage.ASSESSMENT__ASSESSOR:
				return ASSESSOR_EDEFAULT == null ? getAssessor() != null : !ASSESSOR_EDEFAULT.equals(getAssessor());
			case GovernancePackage.ASSESSMENT__SCOPE:
				return !getScope().isEmpty();
			case GovernancePackage.ASSESSMENT__FINDINGS:
				return !getFindings().isEmpty();
			case GovernancePackage.ASSESSMENT__EVIDENCE:
				return !getEvidence().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssessmentImpl
