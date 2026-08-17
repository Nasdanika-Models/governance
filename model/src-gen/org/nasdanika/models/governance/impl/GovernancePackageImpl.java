/**
 */
package org.nasdanika.models.governance.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.governance.Assessment;
import org.nasdanika.models.governance.Control;
import org.nasdanika.models.governance.ControlApplication;
import org.nasdanika.models.governance.ControlAutomation;
import org.nasdanika.models.governance.ControlNature;
import org.nasdanika.models.governance.Evidence;
import org.nasdanika.models.governance.Finding;
import org.nasdanika.models.governance.FindingStatus;
import org.nasdanika.models.governance.Framework;
import org.nasdanika.models.governance.GovernanceFactory;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.GovernanceProgram;
import org.nasdanika.models.governance.GovernedElement;
import org.nasdanika.models.governance.ImplementationStatus;
import org.nasdanika.models.governance.Level;
import org.nasdanika.models.governance.ModelElement;
import org.nasdanika.models.governance.Policy;
import org.nasdanika.models.governance.Property;
import org.nasdanika.models.governance.Requirement;
import org.nasdanika.models.governance.Risk;
import org.nasdanika.models.governance.RiskTreatment;
import org.nasdanika.models.governance.Waiver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GovernancePackageImpl extends EPackageImpl implements GovernancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass governanceProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass governedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlNatureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlAutomationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum riskTreatmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum implementationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum findingStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.governance.GovernancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GovernancePackageImpl() {
		super(eNS_URI, GovernanceFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GovernancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GovernancePackage init() {
		if (isInited) return (GovernancePackage)EPackage.Registry.INSTANCE.getEPackage(GovernancePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGovernancePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GovernancePackageImpl theGovernancePackage = registeredGovernancePackage instanceof GovernancePackageImpl ? (GovernancePackageImpl)registeredGovernancePackage : new GovernancePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGovernancePackage.createPackageContents();

		// Initialize created meta-data
		theGovernancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGovernancePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GovernancePackage.eNS_URI, theGovernancePackage);
		return theGovernancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Identifier() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Name() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Description() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Documentation() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Tags() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_Properties() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGovernanceProgram() {
		return governanceProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGovernanceProgram_Frameworks() {
		return (EReference)governanceProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGovernanceProgram_Policies() {
		return (EReference)governanceProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGovernanceProgram_Controls() {
		return (EReference)governanceProgramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGovernanceProgram_Risks() {
		return (EReference)governanceProgramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGovernanceProgram_Assessments() {
		return (EReference)governanceProgramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGovernanceProgram_Waivers() {
		return (EReference)governanceProgramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFramework() {
		return frameworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFramework_Authority() {
		return (EAttribute)frameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFramework_Version() {
		return (EAttribute)frameworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFramework_Website() {
		return (EAttribute)frameworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFramework_Requirements() {
		return (EReference)frameworkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Reference() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_Children() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicy() {
		return policyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPolicy_Satisfies() {
		return (EReference)policyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPolicy_EnforcedBy() {
		return (EReference)policyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Nature() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Automation() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Satisfies() {
		return (EReference)controlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Mitigates() {
		return (EReference)controlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRisk() {
		return riskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRisk_Category() {
		return (EAttribute)riskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRisk_InherentLikelihood() {
		return (EAttribute)riskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRisk_InherentImpact() {
		return (EAttribute)riskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRisk_ResidualLikelihood() {
		return (EAttribute)riskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRisk_ResidualImpact() {
		return (EAttribute)riskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRisk_Treatment() {
		return (EAttribute)riskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRisk_Mitigations() {
		return (EReference)riskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRisk_Subject() {
		return (EReference)riskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGovernedElement() {
		return governedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGovernedElement_ControlApplications() {
		return (EReference)governedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGovernedElement_Risks() {
		return (EReference)governedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGovernedElement_Waivers() {
		return (EReference)governedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlApplication() {
		return controlApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlApplication_Subject() {
		return (EReference)controlApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlApplication_Control() {
		return (EReference)controlApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlApplication_Status() {
		return (EAttribute)controlApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlApplication_LastVerified() {
		return (EAttribute)controlApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlApplication_Evidence() {
		return (EReference)controlApplicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvidence() {
		return evidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_Location() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_Collected() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_Source() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_Automated() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessment() {
		return assessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessment_Date() {
		return (EAttribute)assessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessment_Assessor() {
		return (EAttribute)assessmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessment_Scope() {
		return (EReference)assessmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessment_Findings() {
		return (EReference)assessmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessment_Evidence() {
		return (EReference)assessmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinding() {
		return findingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Severity() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Status() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinding_Subject() {
		return (EReference)findingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Remediation() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Due() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWaiver() {
		return waiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWaiver_Control() {
		return (EReference)waiverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWaiver_Subject() {
		return (EReference)waiverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWaiver_Justification() {
		return (EAttribute)waiverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWaiver_Expires() {
		return (EAttribute)waiverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLevel() {
		return levelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getControlNature() {
		return controlNatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getControlAutomation() {
		return controlAutomationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRiskTreatment() {
		return riskTreatmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImplementationStatus() {
		return implementationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFindingStatus() {
		return findingStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GovernanceFactory getGovernanceFactory() {
		return (GovernanceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__IDENTIFIER);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DOCUMENTATION);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__TAGS);
		createEReference(modelElementEClass, MODEL_ELEMENT__PROPERTIES);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		governanceProgramEClass = createEClass(GOVERNANCE_PROGRAM);
		createEReference(governanceProgramEClass, GOVERNANCE_PROGRAM__FRAMEWORKS);
		createEReference(governanceProgramEClass, GOVERNANCE_PROGRAM__POLICIES);
		createEReference(governanceProgramEClass, GOVERNANCE_PROGRAM__CONTROLS);
		createEReference(governanceProgramEClass, GOVERNANCE_PROGRAM__RISKS);
		createEReference(governanceProgramEClass, GOVERNANCE_PROGRAM__ASSESSMENTS);
		createEReference(governanceProgramEClass, GOVERNANCE_PROGRAM__WAIVERS);

		frameworkEClass = createEClass(FRAMEWORK);
		createEAttribute(frameworkEClass, FRAMEWORK__AUTHORITY);
		createEAttribute(frameworkEClass, FRAMEWORK__VERSION);
		createEAttribute(frameworkEClass, FRAMEWORK__WEBSITE);
		createEReference(frameworkEClass, FRAMEWORK__REQUIREMENTS);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__REFERENCE);
		createEReference(requirementEClass, REQUIREMENT__CHILDREN);

		policyEClass = createEClass(POLICY);
		createEReference(policyEClass, POLICY__SATISFIES);
		createEReference(policyEClass, POLICY__ENFORCED_BY);

		controlEClass = createEClass(CONTROL);
		createEAttribute(controlEClass, CONTROL__NATURE);
		createEAttribute(controlEClass, CONTROL__AUTOMATION);
		createEReference(controlEClass, CONTROL__SATISFIES);
		createEReference(controlEClass, CONTROL__MITIGATES);

		riskEClass = createEClass(RISK);
		createEAttribute(riskEClass, RISK__CATEGORY);
		createEAttribute(riskEClass, RISK__INHERENT_LIKELIHOOD);
		createEAttribute(riskEClass, RISK__INHERENT_IMPACT);
		createEAttribute(riskEClass, RISK__RESIDUAL_LIKELIHOOD);
		createEAttribute(riskEClass, RISK__RESIDUAL_IMPACT);
		createEAttribute(riskEClass, RISK__TREATMENT);
		createEReference(riskEClass, RISK__MITIGATIONS);
		createEReference(riskEClass, RISK__SUBJECT);

		governedElementEClass = createEClass(GOVERNED_ELEMENT);
		createEReference(governedElementEClass, GOVERNED_ELEMENT__CONTROL_APPLICATIONS);
		createEReference(governedElementEClass, GOVERNED_ELEMENT__RISKS);
		createEReference(governedElementEClass, GOVERNED_ELEMENT__WAIVERS);

		controlApplicationEClass = createEClass(CONTROL_APPLICATION);
		createEReference(controlApplicationEClass, CONTROL_APPLICATION__SUBJECT);
		createEReference(controlApplicationEClass, CONTROL_APPLICATION__CONTROL);
		createEAttribute(controlApplicationEClass, CONTROL_APPLICATION__STATUS);
		createEAttribute(controlApplicationEClass, CONTROL_APPLICATION__LAST_VERIFIED);
		createEReference(controlApplicationEClass, CONTROL_APPLICATION__EVIDENCE);

		evidenceEClass = createEClass(EVIDENCE);
		createEAttribute(evidenceEClass, EVIDENCE__LOCATION);
		createEAttribute(evidenceEClass, EVIDENCE__COLLECTED);
		createEAttribute(evidenceEClass, EVIDENCE__SOURCE);
		createEAttribute(evidenceEClass, EVIDENCE__AUTOMATED);

		assessmentEClass = createEClass(ASSESSMENT);
		createEAttribute(assessmentEClass, ASSESSMENT__DATE);
		createEAttribute(assessmentEClass, ASSESSMENT__ASSESSOR);
		createEReference(assessmentEClass, ASSESSMENT__SCOPE);
		createEReference(assessmentEClass, ASSESSMENT__FINDINGS);
		createEReference(assessmentEClass, ASSESSMENT__EVIDENCE);

		findingEClass = createEClass(FINDING);
		createEAttribute(findingEClass, FINDING__SEVERITY);
		createEAttribute(findingEClass, FINDING__STATUS);
		createEReference(findingEClass, FINDING__SUBJECT);
		createEAttribute(findingEClass, FINDING__REMEDIATION);
		createEAttribute(findingEClass, FINDING__DUE);

		waiverEClass = createEClass(WAIVER);
		createEReference(waiverEClass, WAIVER__CONTROL);
		createEReference(waiverEClass, WAIVER__SUBJECT);
		createEAttribute(waiverEClass, WAIVER__JUSTIFICATION);
		createEAttribute(waiverEClass, WAIVER__EXPIRES);

		// Create enums
		levelEEnum = createEEnum(LEVEL);
		controlNatureEEnum = createEEnum(CONTROL_NATURE);
		controlAutomationEEnum = createEEnum(CONTROL_AUTOMATION);
		riskTreatmentEEnum = createEEnum(RISK_TREATMENT);
		implementationStatusEEnum = createEEnum(IMPLEMENTATION_STATUS);
		findingStatusEEnum = createEEnum(FINDING_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		governanceProgramEClass.getESuperTypes().add(this.getModelElement());
		frameworkEClass.getESuperTypes().add(this.getModelElement());
		requirementEClass.getESuperTypes().add(this.getModelElement());
		policyEClass.getESuperTypes().add(this.getModelElement());
		controlEClass.getESuperTypes().add(this.getModelElement());
		riskEClass.getESuperTypes().add(this.getModelElement());
		governedElementEClass.getESuperTypes().add(this.getModelElement());
		controlApplicationEClass.getESuperTypes().add(this.getModelElement());
		evidenceEClass.getESuperTypes().add(this.getModelElement());
		assessmentEClass.getESuperTypes().add(this.getModelElement());
		findingEClass.getESuperTypes().add(this.getModelElement());
		waiverEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Identifier(), theEcorePackage.getEString(), "identifier", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Description(), theEcorePackage.getEString(), "description", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Documentation(), theEcorePackage.getEString(), "documentation", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Tags(), theEcorePackage.getEString(), "tags", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Properties(), this.getProperty(), null, "properties", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(governanceProgramEClass, GovernanceProgram.class, "GovernanceProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGovernanceProgram_Frameworks(), this.getFramework(), null, "frameworks", null, 0, -1, GovernanceProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGovernanceProgram_Policies(), this.getPolicy(), null, "policies", null, 0, -1, GovernanceProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGovernanceProgram_Controls(), this.getControl(), null, "controls", null, 0, -1, GovernanceProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGovernanceProgram_Risks(), this.getRisk(), null, "risks", null, 0, -1, GovernanceProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGovernanceProgram_Assessments(), this.getAssessment(), null, "assessments", null, 0, -1, GovernanceProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGovernanceProgram_Waivers(), this.getWaiver(), null, "waivers", null, 0, -1, GovernanceProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frameworkEClass, Framework.class, "Framework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFramework_Authority(), theEcorePackage.getEString(), "authority", null, 0, 1, Framework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFramework_Version(), theEcorePackage.getEString(), "version", null, 0, 1, Framework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFramework_Website(), theEcorePackage.getEString(), "website", null, 0, 1, Framework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFramework_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, Framework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Reference(), theEcorePackage.getEString(), "reference", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Children(), this.getRequirement(), null, "children", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicy_Satisfies(), this.getRequirement(), null, "satisfies", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicy_EnforcedBy(), this.getControl(), null, "enforcedBy", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControl_Nature(), this.getControlNature(), "nature", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Automation(), this.getControlAutomation(), "automation", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Satisfies(), this.getRequirement(), null, "satisfies", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Mitigates(), this.getRisk(), this.getRisk_Mitigations(), "mitigates", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskEClass, Risk.class, "Risk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRisk_Category(), theEcorePackage.getEString(), "category", null, 0, 1, Risk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRisk_InherentLikelihood(), this.getLevel(), "inherentLikelihood", null, 0, 1, Risk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRisk_InherentImpact(), this.getLevel(), "inherentImpact", null, 0, 1, Risk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRisk_ResidualLikelihood(), this.getLevel(), "residualLikelihood", null, 0, 1, Risk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRisk_ResidualImpact(), this.getLevel(), "residualImpact", null, 0, 1, Risk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRisk_Treatment(), this.getRiskTreatment(), "treatment", null, 0, 1, Risk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRisk_Mitigations(), this.getControl(), this.getControl_Mitigates(), "mitigations", null, 0, -1, Risk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRisk_Subject(), this.getGovernedElement(), this.getGovernedElement_Risks(), "subject", null, 0, 1, Risk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(governedElementEClass, GovernedElement.class, "GovernedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGovernedElement_ControlApplications(), this.getControlApplication(), this.getControlApplication_Subject(), "controlApplications", null, 0, -1, GovernedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGovernedElement_Risks(), this.getRisk(), this.getRisk_Subject(), "risks", null, 0, -1, GovernedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGovernedElement_Waivers(), this.getWaiver(), this.getWaiver_Subject(), "waivers", null, 0, -1, GovernedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlApplicationEClass, ControlApplication.class, "ControlApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlApplication_Subject(), this.getGovernedElement(), this.getGovernedElement_ControlApplications(), "subject", null, 0, 1, ControlApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlApplication_Control(), this.getControl(), null, "control", null, 0, 1, ControlApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlApplication_Status(), this.getImplementationStatus(), "status", null, 0, 1, ControlApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlApplication_LastVerified(), theEcorePackage.getEDate(), "lastVerified", null, 0, 1, ControlApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlApplication_Evidence(), this.getEvidence(), null, "evidence", null, 0, -1, ControlApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evidenceEClass, Evidence.class, "Evidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvidence_Location(), theEcorePackage.getEString(), "location", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvidence_Collected(), theEcorePackage.getEDate(), "collected", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvidence_Source(), theEcorePackage.getEString(), "source", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvidence_Automated(), theEcorePackage.getEBoolean(), "automated", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assessmentEClass, Assessment.class, "Assessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssessment_Date(), theEcorePackage.getEDate(), "date", null, 0, 1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssessment_Assessor(), theEcorePackage.getEString(), "assessor", null, 0, 1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssessment_Scope(), this.getGovernedElement(), null, "scope", null, 0, -1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssessment_Findings(), this.getFinding(), null, "findings", null, 0, -1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssessment_Evidence(), this.getEvidence(), null, "evidence", null, 0, -1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(findingEClass, Finding.class, "Finding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinding_Severity(), this.getLevel(), "severity", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Status(), this.getFindingStatus(), "status", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinding_Subject(), this.getControlApplication(), null, "subject", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Remediation(), theEcorePackage.getEString(), "remediation", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Due(), theEcorePackage.getEDate(), "due", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waiverEClass, Waiver.class, "Waiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWaiver_Control(), this.getControl(), null, "control", null, 0, 1, Waiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWaiver_Subject(), this.getGovernedElement(), this.getGovernedElement_Waivers(), "subject", null, 0, 1, Waiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaiver_Justification(), theEcorePackage.getEString(), "justification", null, 0, 1, Waiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaiver_Expires(), theEcorePackage.getEDate(), "expires", null, 0, 1, Waiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(levelEEnum, Level.class, "Level");
		addEEnumLiteral(levelEEnum, Level.VERY_LOW);
		addEEnumLiteral(levelEEnum, Level.LOW);
		addEEnumLiteral(levelEEnum, Level.MEDIUM);
		addEEnumLiteral(levelEEnum, Level.HIGH);
		addEEnumLiteral(levelEEnum, Level.VERY_HIGH);

		initEEnum(controlNatureEEnum, ControlNature.class, "ControlNature");
		addEEnumLiteral(controlNatureEEnum, ControlNature.PREVENTIVE);
		addEEnumLiteral(controlNatureEEnum, ControlNature.DETECTIVE);
		addEEnumLiteral(controlNatureEEnum, ControlNature.CORRECTIVE);
		addEEnumLiteral(controlNatureEEnum, ControlNature.DIRECTIVE);
		addEEnumLiteral(controlNatureEEnum, ControlNature.COMPENSATING);

		initEEnum(controlAutomationEEnum, ControlAutomation.class, "ControlAutomation");
		addEEnumLiteral(controlAutomationEEnum, ControlAutomation.MANUAL);
		addEEnumLiteral(controlAutomationEEnum, ControlAutomation.HYBRID);
		addEEnumLiteral(controlAutomationEEnum, ControlAutomation.AUTOMATED);

		initEEnum(riskTreatmentEEnum, RiskTreatment.class, "RiskTreatment");
		addEEnumLiteral(riskTreatmentEEnum, RiskTreatment.ACCEPT);
		addEEnumLiteral(riskTreatmentEEnum, RiskTreatment.MITIGATE);
		addEEnumLiteral(riskTreatmentEEnum, RiskTreatment.TRANSFER);
		addEEnumLiteral(riskTreatmentEEnum, RiskTreatment.AVOID);

		initEEnum(implementationStatusEEnum, ImplementationStatus.class, "ImplementationStatus");
		addEEnumLiteral(implementationStatusEEnum, ImplementationStatus.PLANNED);
		addEEnumLiteral(implementationStatusEEnum, ImplementationStatus.IN_PROGRESS);
		addEEnumLiteral(implementationStatusEEnum, ImplementationStatus.IMPLEMENTED);
		addEEnumLiteral(implementationStatusEEnum, ImplementationStatus.VERIFIED);
		addEEnumLiteral(implementationStatusEEnum, ImplementationStatus.INEFFECTIVE);
		addEEnumLiteral(implementationStatusEEnum, ImplementationStatus.RETIRED);

		initEEnum(findingStatusEEnum, FindingStatus.class, "FindingStatus");
		addEEnumLiteral(findingStatusEEnum, FindingStatus.OPEN);
		addEEnumLiteral(findingStatusEEnum, FindingStatus.IN_REMEDIATION);
		addEEnumLiteral(findingStatusEEnum, FindingStatus.RESOLVED);
		addEEnumLiteral(findingStatusEEnum, FindingStatus.ACCEPTED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (modelElementEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Base ----"
		   });
		addAnnotation
		  (getModelElement_Description(),
		   source,
		   new String[] {
			   "documentation", " Short summary."
		   });
		addAnnotation
		  (getModelElement_Documentation(),
		   source,
		   new String[] {
			   "documentation", " Markdown documentation for humans, used by documentation generation."
		   });
		addAnnotation
		  (getModelElement_Properties(),
		   source,
		   new String[] {
			   "documentation", " Generic string properties: extension/annotation carrier, same technique as the Diagram and MCP models."
		   });
		addAnnotation
		  (levelEEnum,
		   source,
		   new String[] {
			   "documentation", " Ordinal scale shared by likelihood, impact, and severity."
		   });
		addAnnotation
		  (governanceProgramEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Program (root container) ----"
		   });
		addAnnotation
		  (frameworkEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Frameworks and requirements ----"
		   });
		addAnnotation
		  (getFramework_Authority(),
		   source,
		   new String[] {
			   "documentation", " Issuing authority, e.g. NIST, ISO/IEC, European Union, internal."
		   });
		addAnnotation
		  (requirementEClass,
		   source,
		   new String[] {
			   "documentation", "A single requirement within a framework, hierarchical to mirror framework\nstructure (function > category > subcategory, article > paragraph)."
		   });
		addAnnotation
		  (getRequirement_Reference(),
		   source,
		   new String[] {
			   "documentation", " Reference identifier within the framework, e.g. \"GOVERN 1.1\", \"A.6.2.4\", \"Art. 9\"."
		   });
		addAnnotation
		  (policyEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Policies ----"
		   });
		addAnnotation
		  (getPolicy_Satisfies(),
		   source,
		   new String[] {
			   "documentation", " Framework requirements this policy addresses."
		   });
		addAnnotation
		  (getPolicy_EnforcedBy(),
		   source,
		   new String[] {
			   "documentation", " Controls that enforce this policy."
		   });
		addAnnotation
		  (controlNatureEEnum,
		   source,
		   new String[] {
			   "documentation", " ---- Controls ----"
		   });
		addAnnotation
		  (controlNatureEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", " Stops the bad thing from happening: input validation, access control."
		   });
		addAnnotation
		  (controlNatureEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", " Notices that it happened: monitoring, review, reconciliation."
		   });
		addAnnotation
		  (controlNatureEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", " Fixes it after the fact: rollback, incident response."
		   });
		addAnnotation
		  (controlNatureEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", " Tells people what to do: standards, training, procedures."
		   });
		addAnnotation
		  (controlNatureEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", " Substitutes for an infeasible primary control."
		   });
		addAnnotation
		  (controlAutomationEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", " Manual with automated support, e.g. human review of automated flags."
		   });
		addAnnotation
		  (controlEClass,
		   source,
		   new String[] {
			   "documentation", "A safeguard: a repeatable measure that mitigates risks and satisfies\nrequirements. Controls are defined once and applied to many governed\nelements via ControlApplication."
		   });
		addAnnotation
		  (getControl_Satisfies(),
		   source,
		   new String[] {
			   "documentation", " Crosswalk: requirements in any number of frameworks this control satisfies."
		   });
		addAnnotation
		  (getControl_Mitigates(),
		   source,
		   new String[] {
			   "documentation", " Risks this control mitigates."
		   });
		addAnnotation
		  (riskTreatmentEEnum,
		   source,
		   new String[] {
			   "documentation", " ---- Risks ----"
		   });
		addAnnotation
		  (riskTreatmentEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", " Documented decision to live with it; pairs with the decision model."
		   });
		addAnnotation
		  (riskTreatmentEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", " Insurance, contract, vendor."
		   });
		addAnnotation
		  (riskTreatmentEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", " Do not do the thing."
		   });
		addAnnotation
		  (riskEClass,
		   source,
		   new String[] {
			   "documentation", "A risk: an uncertain event with a likelihood and an impact. Inherent values\ndescribe the untreated risk; residual values describe what remains after\nmitigations. Category is free-form here; the ai-governance extension\nprovides a typed AI risk taxonomy."
		   });
		addAnnotation
		  (getRisk_Subject(),
		   source,
		   new String[] {
			   "documentation", " What the risk is about; anything governed."
		   });
		addAnnotation
		  (governedElementEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Governed elements ----"
		   });
		addAnnotation
		  (implementationStatusEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", " Independently verified as operating effectively."
		   });
		addAnnotation
		  (implementationStatusEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", " Implemented but found not to operate effectively."
		   });
		addAnnotation
		  (controlApplicationEClass,
		   source,
		   new String[] {
			   "documentation", "The application of a control to a governed element: the unit of compliance\nstatus. \"Control X on system Y is VERIFIED, and here is the evidence.\""
		   });
		addAnnotation
		  (evidenceEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Evidence ----"
		   });
		addAnnotation
		  (getEvidence_Location(),
		   source,
		   new String[] {
			   "documentation", " URI of the artifact: document, dashboard, query, repository path."
		   });
		addAnnotation
		  (getEvidence_Source(),
		   source,
		   new String[] {
			   "documentation", " Producing party or system."
		   });
		addAnnotation
		  (assessmentEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Assessments, findings, waivers ----"
		   });
		addAnnotation
		  (getAssessment_Assessor(),
		   source,
		   new String[] {
			   "documentation", " Assessing party: internal audit, second line, external auditor."
		   });
		addAnnotation
		  (findingStatusEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", " Risk-accepted via a waiver; documented decision."
		   });
		addAnnotation
		  (getFinding_Subject(),
		   source,
		   new String[] {
			   "documentation", " The control application the finding is about, if any."
		   });
		addAnnotation
		  (getFinding_Remediation(),
		   source,
		   new String[] {
			   "documentation", " Markdown remediation plan."
		   });
		addAnnotation
		  (waiverEClass,
		   source,
		   new String[] {
			   "documentation", "An approved, time-boxed deviation: a control not applied, a policy not met.\nGovernance without waivers is fiction; modeling them keeps the record honest.\nApproval records (who, in what role) come from the role model."
		   });
		addAnnotation
		  (getWaiver_Justification(),
		   source,
		   new String[] {
			   "documentation", " Markdown justification and compensating measures."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //GovernancePackageImpl
