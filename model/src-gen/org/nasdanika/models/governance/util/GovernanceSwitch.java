/**
 */
package org.nasdanika.models.governance.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.governance.*;

import org.nasdanika.models.nxcore.Documented;
import org.nasdanika.models.nxcore.Marked;
import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.Referrable;
import org.nasdanika.models.nxcore.StringIdentity;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.governance.GovernancePackage
 * @generated
 */
public class GovernanceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GovernancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GovernanceSwitch() {
		if (modelPackage == null) {
			modelPackage = GovernancePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GovernancePackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GovernancePackage.GOVERNANCE_PROGRAM: {
				GovernanceProgram governanceProgram = (GovernanceProgram)theEObject;
				T result = caseGovernanceProgram(governanceProgram);
				if (result == null) result = caseModelElement(governanceProgram);
				if (result == null) result = caseStringIdentity(governanceProgram);
				if (result == null) result = caseDocumented(governanceProgram);
				if (result == null) result = caseMarked(governanceProgram);
				if (result == null) result = caseReferrable(governanceProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GovernancePackage.FRAMEWORK: {
				Framework framework = (Framework)theEObject;
				T result = caseFramework(framework);
				if (result == null) result = caseModelElement(framework);
				if (result == null) result = caseStringIdentity(framework);
				if (result == null) result = caseDocumented(framework);
				if (result == null) result = caseMarked(framework);
				if (result == null) result = caseReferrable(framework);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GovernancePackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseModelElement(requirement);
				if (result == null) result = caseStringIdentity(requirement);
				if (result == null) result = caseDocumented(requirement);
				if (result == null) result = caseMarked(requirement);
				if (result == null) result = caseReferrable(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GovernancePackage.POLICY: {
				Policy policy = (Policy)theEObject;
				T result = casePolicy(policy);
				if (result == null) result = caseModelElement(policy);
				if (result == null) result = caseStringIdentity(policy);
				if (result == null) result = caseDocumented(policy);
				if (result == null) result = caseMarked(policy);
				if (result == null) result = caseReferrable(policy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GovernancePackage.CONTROL: {
				Control control = (Control)theEObject;
				T result = caseControl(control);
				if (result == null) result = caseModelElement(control);
				if (result == null) result = caseStringIdentity(control);
				if (result == null) result = caseDocumented(control);
				if (result == null) result = caseMarked(control);
				if (result == null) result = caseReferrable(control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GovernancePackage.RISK: {
				Risk risk = (Risk)theEObject;
				T result = caseRisk(risk);
				if (result == null) result = caseModelElement(risk);
				if (result == null) result = caseStringIdentity(risk);
				if (result == null) result = caseDocumented(risk);
				if (result == null) result = caseMarked(risk);
				if (result == null) result = caseReferrable(risk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GovernancePackage.GOVERNED_ELEMENT: {
				GovernedElement governedElement = (GovernedElement)theEObject;
				T result = caseGovernedElement(governedElement);
				if (result == null) result = caseModelElement(governedElement);
				if (result == null) result = caseStringIdentity(governedElement);
				if (result == null) result = caseDocumented(governedElement);
				if (result == null) result = caseMarked(governedElement);
				if (result == null) result = caseReferrable(governedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GovernancePackage.CONTROL_APPLICATION: {
				ControlApplication controlApplication = (ControlApplication)theEObject;
				T result = caseControlApplication(controlApplication);
				if (result == null) result = caseModelElement(controlApplication);
				if (result == null) result = caseStringIdentity(controlApplication);
				if (result == null) result = caseDocumented(controlApplication);
				if (result == null) result = caseMarked(controlApplication);
				if (result == null) result = caseReferrable(controlApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GovernancePackage.EVIDENCE: {
				Evidence evidence = (Evidence)theEObject;
				T result = caseEvidence(evidence);
				if (result == null) result = caseModelElement(evidence);
				if (result == null) result = caseStringIdentity(evidence);
				if (result == null) result = caseDocumented(evidence);
				if (result == null) result = caseMarked(evidence);
				if (result == null) result = caseReferrable(evidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GovernancePackage.ASSESSMENT: {
				Assessment assessment = (Assessment)theEObject;
				T result = caseAssessment(assessment);
				if (result == null) result = caseModelElement(assessment);
				if (result == null) result = caseStringIdentity(assessment);
				if (result == null) result = caseDocumented(assessment);
				if (result == null) result = caseMarked(assessment);
				if (result == null) result = caseReferrable(assessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GovernancePackage.FINDING: {
				Finding finding = (Finding)theEObject;
				T result = caseFinding(finding);
				if (result == null) result = caseModelElement(finding);
				if (result == null) result = caseStringIdentity(finding);
				if (result == null) result = caseDocumented(finding);
				if (result == null) result = caseMarked(finding);
				if (result == null) result = caseReferrable(finding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GovernancePackage.WAIVER: {
				Waiver waiver = (Waiver)theEObject;
				T result = caseWaiver(waiver);
				if (result == null) result = caseModelElement(waiver);
				if (result == null) result = caseStringIdentity(waiver);
				if (result == null) result = caseDocumented(waiver);
				if (result == null) result = caseMarked(waiver);
				if (result == null) result = caseReferrable(waiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGovernanceProgram(GovernanceProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Framework</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Framework</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFramework(Framework object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicy(Policy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRisk(Risk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Governed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Governed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGovernedElement(GovernedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlApplication(ControlApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidence(Evidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessment(Assessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinding(Finding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Waiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Waiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaiver(Waiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GovernanceSwitch
