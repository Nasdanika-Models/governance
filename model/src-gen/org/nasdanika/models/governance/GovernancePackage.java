/**
 */
package org.nasdanika.models.governance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.nxcore.NxcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.governance.GovernanceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel featureDelegation='Dynamic' complianceLevel='21.0' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface GovernancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "governance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://governance.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.governance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GovernancePackage eINSTANCE = org.nasdanika.models.governance.impl.GovernancePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.impl.PropertyImpl
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.impl.GovernanceProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.impl.GovernanceProgramImpl
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getGovernanceProgram()
	 * @generated
	 */
	int GOVERNANCE_PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Frameworks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM__FRAMEWORKS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM__POLICIES = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM__CONTROLS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM__RISKS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assessments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM__ASSESSMENTS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM__WAIVERS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNANCE_PROGRAM_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.impl.FrameworkImpl <em>Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.impl.FrameworkImpl
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getFramework()
	 * @generated
	 */
	int FRAMEWORK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__AUTHORITY = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__VERSION = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__WEBSITE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__REQUIREMENTS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.impl.RequirementImpl
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REFERENCE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CHILDREN = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.impl.PolicyImpl
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getPolicy()
	 * @generated
	 */
	int POLICY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__SATISFIES = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enforced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__ENFORCED_BY = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.impl.ControlImpl
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NATURE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Automation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__AUTOMATION = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SATISFIES = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mitigates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MITIGATES = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.impl.RiskImpl <em>Risk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.impl.RiskImpl
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getRisk()
	 * @generated
	 */
	int RISK = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__CATEGORY = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inherent Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__INHERENT_LIKELIHOOD = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inherent Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__INHERENT_IMPACT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Residual Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__RESIDUAL_LIKELIHOOD = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Residual Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__RESIDUAL_IMPACT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Treatment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__TREATMENT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Mitigations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__MITIGATIONS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__SUBJECT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.impl.GovernedElementImpl <em>Governed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.impl.GovernedElementImpl
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getGovernedElement()
	 * @generated
	 */
	int GOVERNED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNED_ELEMENT__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNED_ELEMENT__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNED_ELEMENT__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNED_ELEMENT__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNED_ELEMENT__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNED_ELEMENT__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNED_ELEMENT__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNED_ELEMENT__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNED_ELEMENT__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNED_ELEMENT__CONTROL_APPLICATIONS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNED_ELEMENT__RISKS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNED_ELEMENT__WAIVERS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Governed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNED_ELEMENT_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNED_ELEMENT___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Governed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNED_ELEMENT_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.impl.ControlApplicationImpl <em>Control Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.impl.ControlApplicationImpl
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getControlApplication()
	 * @generated
	 */
	int CONTROL_APPLICATION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION__SUBJECT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION__CONTROL = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION__STATUS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION__LAST_VERIFIED = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION__EVIDENCE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Control Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Control Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_APPLICATION_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.impl.EvidenceImpl <em>Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.impl.EvidenceImpl
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getEvidence()
	 * @generated
	 */
	int EVIDENCE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__LOCATION = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__COLLECTED = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__SOURCE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Automated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__AUTOMATED = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.impl.AssessmentImpl <em>Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.impl.AssessmentImpl
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getAssessment()
	 * @generated
	 */
	int ASSESSMENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__DATE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assessor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__ASSESSOR = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__SCOPE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__FINDINGS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__EVIDENCE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.impl.FindingImpl <em>Finding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.impl.FindingImpl
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getFinding()
	 * @generated
	 */
	int FINDING = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__SEVERITY = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__STATUS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__SUBJECT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remediation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__REMEDIATION = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Due</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__DUE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.impl.WaiverImpl <em>Waiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.impl.WaiverImpl
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getWaiver()
	 * @generated
	 */
	int WAIVER = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER__CONTROL = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER__SUBJECT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER__JUSTIFICATION = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER__EXPIRES = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Waiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Waiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIVER_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.Level <em>Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.Level
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 13;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.ControlNature <em>Control Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.ControlNature
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getControlNature()
	 * @generated
	 */
	int CONTROL_NATURE = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.ControlAutomation <em>Control Automation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.ControlAutomation
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getControlAutomation()
	 * @generated
	 */
	int CONTROL_AUTOMATION = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.RiskTreatment <em>Risk Treatment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.RiskTreatment
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getRiskTreatment()
	 * @generated
	 */
	int RISK_TREATMENT = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.ImplementationStatus <em>Implementation Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.ImplementationStatus
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getImplementationStatus()
	 * @generated
	 */
	int IMPLEMENTATION_STATUS = 17;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.governance.FindingStatus <em>Finding Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.governance.FindingStatus
	 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getFindingStatus()
	 * @generated
	 */
	int FINDING_STATUS = 18;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.governance.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.nasdanika.models.governance.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.governance.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.governance.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.governance.GovernanceProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see org.nasdanika.models.governance.GovernanceProgram
	 * @generated
	 */
	EClass getGovernanceProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.governance.GovernanceProgram#getFrameworks <em>Frameworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frameworks</em>'.
	 * @see org.nasdanika.models.governance.GovernanceProgram#getFrameworks()
	 * @see #getGovernanceProgram()
	 * @generated
	 */
	EReference getGovernanceProgram_Frameworks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.governance.GovernanceProgram#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policies</em>'.
	 * @see org.nasdanika.models.governance.GovernanceProgram#getPolicies()
	 * @see #getGovernanceProgram()
	 * @generated
	 */
	EReference getGovernanceProgram_Policies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.governance.GovernanceProgram#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see org.nasdanika.models.governance.GovernanceProgram#getControls()
	 * @see #getGovernanceProgram()
	 * @generated
	 */
	EReference getGovernanceProgram_Controls();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.governance.GovernanceProgram#getRisks <em>Risks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Risks</em>'.
	 * @see org.nasdanika.models.governance.GovernanceProgram#getRisks()
	 * @see #getGovernanceProgram()
	 * @generated
	 */
	EReference getGovernanceProgram_Risks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.governance.GovernanceProgram#getAssessments <em>Assessments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assessments</em>'.
	 * @see org.nasdanika.models.governance.GovernanceProgram#getAssessments()
	 * @see #getGovernanceProgram()
	 * @generated
	 */
	EReference getGovernanceProgram_Assessments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.governance.GovernanceProgram#getWaivers <em>Waivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Waivers</em>'.
	 * @see org.nasdanika.models.governance.GovernanceProgram#getWaivers()
	 * @see #getGovernanceProgram()
	 * @generated
	 */
	EReference getGovernanceProgram_Waivers();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.governance.Framework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Framework</em>'.
	 * @see org.nasdanika.models.governance.Framework
	 * @generated
	 */
	EClass getFramework();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Framework#getAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority</em>'.
	 * @see org.nasdanika.models.governance.Framework#getAuthority()
	 * @see #getFramework()
	 * @generated
	 */
	EAttribute getFramework_Authority();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Framework#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.models.governance.Framework#getVersion()
	 * @see #getFramework()
	 * @generated
	 */
	EAttribute getFramework_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Framework#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see org.nasdanika.models.governance.Framework#getWebsite()
	 * @see #getFramework()
	 * @generated
	 */
	EAttribute getFramework_Website();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.governance.Framework#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.nasdanika.models.governance.Framework#getRequirements()
	 * @see #getFramework()
	 * @generated
	 */
	EReference getFramework_Requirements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.governance.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.nasdanika.models.governance.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Requirement#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.nasdanika.models.governance.Requirement#getReference()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.governance.Requirement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.models.governance.Requirement#getChildren()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.governance.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see org.nasdanika.models.governance.Policy
	 * @generated
	 */
	EClass getPolicy();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.governance.Policy#getSatisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfies</em>'.
	 * @see org.nasdanika.models.governance.Policy#getSatisfies()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Satisfies();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.governance.Policy#getEnforcedBy <em>Enforced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enforced By</em>'.
	 * @see org.nasdanika.models.governance.Policy#getEnforcedBy()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_EnforcedBy();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.governance.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see org.nasdanika.models.governance.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Control#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see org.nasdanika.models.governance.Control#getNature()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Nature();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Control#getAutomation <em>Automation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automation</em>'.
	 * @see org.nasdanika.models.governance.Control#getAutomation()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Automation();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.governance.Control#getSatisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfies</em>'.
	 * @see org.nasdanika.models.governance.Control#getSatisfies()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Satisfies();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.governance.Control#getMitigates <em>Mitigates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mitigates</em>'.
	 * @see org.nasdanika.models.governance.Control#getMitigates()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Mitigates();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.governance.Risk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk</em>'.
	 * @see org.nasdanika.models.governance.Risk
	 * @generated
	 */
	EClass getRisk();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Risk#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.nasdanika.models.governance.Risk#getCategory()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Risk#getInherentLikelihood <em>Inherent Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherent Likelihood</em>'.
	 * @see org.nasdanika.models.governance.Risk#getInherentLikelihood()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_InherentLikelihood();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Risk#getInherentImpact <em>Inherent Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherent Impact</em>'.
	 * @see org.nasdanika.models.governance.Risk#getInherentImpact()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_InherentImpact();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Risk#getResidualLikelihood <em>Residual Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Residual Likelihood</em>'.
	 * @see org.nasdanika.models.governance.Risk#getResidualLikelihood()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_ResidualLikelihood();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Risk#getResidualImpact <em>Residual Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Residual Impact</em>'.
	 * @see org.nasdanika.models.governance.Risk#getResidualImpact()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_ResidualImpact();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Risk#getTreatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treatment</em>'.
	 * @see org.nasdanika.models.governance.Risk#getTreatment()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Treatment();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.governance.Risk#getMitigations <em>Mitigations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mitigations</em>'.
	 * @see org.nasdanika.models.governance.Risk#getMitigations()
	 * @see #getRisk()
	 * @generated
	 */
	EReference getRisk_Mitigations();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.governance.Risk#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see org.nasdanika.models.governance.Risk#getSubject()
	 * @see #getRisk()
	 * @generated
	 */
	EReference getRisk_Subject();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.governance.GovernedElement <em>Governed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Governed Element</em>'.
	 * @see org.nasdanika.models.governance.GovernedElement
	 * @generated
	 */
	EClass getGovernedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.governance.GovernedElement#getControlApplications <em>Control Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Applications</em>'.
	 * @see org.nasdanika.models.governance.GovernedElement#getControlApplications()
	 * @see #getGovernedElement()
	 * @generated
	 */
	EReference getGovernedElement_ControlApplications();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.governance.GovernedElement#getRisks <em>Risks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Risks</em>'.
	 * @see org.nasdanika.models.governance.GovernedElement#getRisks()
	 * @see #getGovernedElement()
	 * @generated
	 */
	EReference getGovernedElement_Risks();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.governance.GovernedElement#getWaivers <em>Waivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Waivers</em>'.
	 * @see org.nasdanika.models.governance.GovernedElement#getWaivers()
	 * @see #getGovernedElement()
	 * @generated
	 */
	EReference getGovernedElement_Waivers();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.governance.ControlApplication <em>Control Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Application</em>'.
	 * @see org.nasdanika.models.governance.ControlApplication
	 * @generated
	 */
	EClass getControlApplication();

	/**
	 * Returns the meta object for the container reference '{@link org.nasdanika.models.governance.ControlApplication#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Subject</em>'.
	 * @see org.nasdanika.models.governance.ControlApplication#getSubject()
	 * @see #getControlApplication()
	 * @generated
	 */
	EReference getControlApplication_Subject();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.governance.ControlApplication#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control</em>'.
	 * @see org.nasdanika.models.governance.ControlApplication#getControl()
	 * @see #getControlApplication()
	 * @generated
	 */
	EReference getControlApplication_Control();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.ControlApplication#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.governance.ControlApplication#getStatus()
	 * @see #getControlApplication()
	 * @generated
	 */
	EAttribute getControlApplication_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.ControlApplication#getLastVerified <em>Last Verified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Verified</em>'.
	 * @see org.nasdanika.models.governance.ControlApplication#getLastVerified()
	 * @see #getControlApplication()
	 * @generated
	 */
	EAttribute getControlApplication_LastVerified();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.governance.ControlApplication#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evidence</em>'.
	 * @see org.nasdanika.models.governance.ControlApplication#getEvidence()
	 * @see #getControlApplication()
	 * @generated
	 */
	EReference getControlApplication_Evidence();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.governance.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence</em>'.
	 * @see org.nasdanika.models.governance.Evidence
	 * @generated
	 */
	EClass getEvidence();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Evidence#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.nasdanika.models.governance.Evidence#getLocation()
	 * @see #getEvidence()
	 * @generated
	 */
	EAttribute getEvidence_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Evidence#getCollected <em>Collected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collected</em>'.
	 * @see org.nasdanika.models.governance.Evidence#getCollected()
	 * @see #getEvidence()
	 * @generated
	 */
	EAttribute getEvidence_Collected();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Evidence#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.nasdanika.models.governance.Evidence#getSource()
	 * @see #getEvidence()
	 * @generated
	 */
	EAttribute getEvidence_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Evidence#isAutomated <em>Automated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automated</em>'.
	 * @see org.nasdanika.models.governance.Evidence#isAutomated()
	 * @see #getEvidence()
	 * @generated
	 */
	EAttribute getEvidence_Automated();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.governance.Assessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment</em>'.
	 * @see org.nasdanika.models.governance.Assessment
	 * @generated
	 */
	EClass getAssessment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Assessment#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.models.governance.Assessment#getDate()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Assessment#getAssessor <em>Assessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessor</em>'.
	 * @see org.nasdanika.models.governance.Assessment#getAssessor()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_Assessor();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.governance.Assessment#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scope</em>'.
	 * @see org.nasdanika.models.governance.Assessment#getScope()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_Scope();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.governance.Assessment#getFindings <em>Findings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Findings</em>'.
	 * @see org.nasdanika.models.governance.Assessment#getFindings()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_Findings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.governance.Assessment#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evidence</em>'.
	 * @see org.nasdanika.models.governance.Assessment#getEvidence()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_Evidence();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.governance.Finding <em>Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finding</em>'.
	 * @see org.nasdanika.models.governance.Finding
	 * @generated
	 */
	EClass getFinding();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Finding#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.nasdanika.models.governance.Finding#getSeverity()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Finding#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.governance.Finding#getStatus()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Status();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.governance.Finding#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see org.nasdanika.models.governance.Finding#getSubject()
	 * @see #getFinding()
	 * @generated
	 */
	EReference getFinding_Subject();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Finding#getRemediation <em>Remediation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remediation</em>'.
	 * @see org.nasdanika.models.governance.Finding#getRemediation()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Remediation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Finding#getDue <em>Due</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due</em>'.
	 * @see org.nasdanika.models.governance.Finding#getDue()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Due();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.governance.Waiver <em>Waiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Waiver</em>'.
	 * @see org.nasdanika.models.governance.Waiver
	 * @generated
	 */
	EClass getWaiver();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.governance.Waiver#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control</em>'.
	 * @see org.nasdanika.models.governance.Waiver#getControl()
	 * @see #getWaiver()
	 * @generated
	 */
	EReference getWaiver_Control();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.governance.Waiver#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see org.nasdanika.models.governance.Waiver#getSubject()
	 * @see #getWaiver()
	 * @generated
	 */
	EReference getWaiver_Subject();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Waiver#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification</em>'.
	 * @see org.nasdanika.models.governance.Waiver#getJustification()
	 * @see #getWaiver()
	 * @generated
	 */
	EAttribute getWaiver_Justification();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.governance.Waiver#getExpires <em>Expires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expires</em>'.
	 * @see org.nasdanika.models.governance.Waiver#getExpires()
	 * @see #getWaiver()
	 * @generated
	 */
	EAttribute getWaiver_Expires();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.governance.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level</em>'.
	 * @see org.nasdanika.models.governance.Level
	 * @generated
	 */
	EEnum getLevel();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.governance.ControlNature <em>Control Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Nature</em>'.
	 * @see org.nasdanika.models.governance.ControlNature
	 * @generated
	 */
	EEnum getControlNature();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.governance.ControlAutomation <em>Control Automation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Automation</em>'.
	 * @see org.nasdanika.models.governance.ControlAutomation
	 * @generated
	 */
	EEnum getControlAutomation();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.governance.RiskTreatment <em>Risk Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Risk Treatment</em>'.
	 * @see org.nasdanika.models.governance.RiskTreatment
	 * @generated
	 */
	EEnum getRiskTreatment();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.governance.ImplementationStatus <em>Implementation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Implementation Status</em>'.
	 * @see org.nasdanika.models.governance.ImplementationStatus
	 * @generated
	 */
	EEnum getImplementationStatus();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.governance.FindingStatus <em>Finding Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Finding Status</em>'.
	 * @see org.nasdanika.models.governance.FindingStatus
	 * @generated
	 */
	EEnum getFindingStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GovernanceFactory getGovernanceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.impl.PropertyImpl
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.impl.GovernanceProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.impl.GovernanceProgramImpl
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getGovernanceProgram()
		 * @generated
		 */
		EClass GOVERNANCE_PROGRAM = eINSTANCE.getGovernanceProgram();

		/**
		 * The meta object literal for the '<em><b>Frameworks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOVERNANCE_PROGRAM__FRAMEWORKS = eINSTANCE.getGovernanceProgram_Frameworks();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOVERNANCE_PROGRAM__POLICIES = eINSTANCE.getGovernanceProgram_Policies();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOVERNANCE_PROGRAM__CONTROLS = eINSTANCE.getGovernanceProgram_Controls();

		/**
		 * The meta object literal for the '<em><b>Risks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOVERNANCE_PROGRAM__RISKS = eINSTANCE.getGovernanceProgram_Risks();

		/**
		 * The meta object literal for the '<em><b>Assessments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOVERNANCE_PROGRAM__ASSESSMENTS = eINSTANCE.getGovernanceProgram_Assessments();

		/**
		 * The meta object literal for the '<em><b>Waivers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOVERNANCE_PROGRAM__WAIVERS = eINSTANCE.getGovernanceProgram_Waivers();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.impl.FrameworkImpl <em>Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.impl.FrameworkImpl
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getFramework()
		 * @generated
		 */
		EClass FRAMEWORK = eINSTANCE.getFramework();

		/**
		 * The meta object literal for the '<em><b>Authority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAMEWORK__AUTHORITY = eINSTANCE.getFramework_Authority();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAMEWORK__VERSION = eINSTANCE.getFramework_Version();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAMEWORK__WEBSITE = eINSTANCE.getFramework_Website();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAMEWORK__REQUIREMENTS = eINSTANCE.getFramework_Requirements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.impl.RequirementImpl
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REFERENCE = eINSTANCE.getRequirement_Reference();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__CHILDREN = eINSTANCE.getRequirement_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.impl.PolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.impl.PolicyImpl
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getPolicy()
		 * @generated
		 */
		EClass POLICY = eINSTANCE.getPolicy();

		/**
		 * The meta object literal for the '<em><b>Satisfies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__SATISFIES = eINSTANCE.getPolicy_Satisfies();

		/**
		 * The meta object literal for the '<em><b>Enforced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__ENFORCED_BY = eINSTANCE.getPolicy_EnforcedBy();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.impl.ControlImpl
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__NATURE = eINSTANCE.getControl_Nature();

		/**
		 * The meta object literal for the '<em><b>Automation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__AUTOMATION = eINSTANCE.getControl_Automation();

		/**
		 * The meta object literal for the '<em><b>Satisfies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__SATISFIES = eINSTANCE.getControl_Satisfies();

		/**
		 * The meta object literal for the '<em><b>Mitigates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__MITIGATES = eINSTANCE.getControl_Mitigates();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.impl.RiskImpl <em>Risk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.impl.RiskImpl
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getRisk()
		 * @generated
		 */
		EClass RISK = eINSTANCE.getRisk();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__CATEGORY = eINSTANCE.getRisk_Category();

		/**
		 * The meta object literal for the '<em><b>Inherent Likelihood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__INHERENT_LIKELIHOOD = eINSTANCE.getRisk_InherentLikelihood();

		/**
		 * The meta object literal for the '<em><b>Inherent Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__INHERENT_IMPACT = eINSTANCE.getRisk_InherentImpact();

		/**
		 * The meta object literal for the '<em><b>Residual Likelihood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__RESIDUAL_LIKELIHOOD = eINSTANCE.getRisk_ResidualLikelihood();

		/**
		 * The meta object literal for the '<em><b>Residual Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__RESIDUAL_IMPACT = eINSTANCE.getRisk_ResidualImpact();

		/**
		 * The meta object literal for the '<em><b>Treatment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__TREATMENT = eINSTANCE.getRisk_Treatment();

		/**
		 * The meta object literal for the '<em><b>Mitigations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK__MITIGATIONS = eINSTANCE.getRisk_Mitigations();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK__SUBJECT = eINSTANCE.getRisk_Subject();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.impl.GovernedElementImpl <em>Governed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.impl.GovernedElementImpl
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getGovernedElement()
		 * @generated
		 */
		EClass GOVERNED_ELEMENT = eINSTANCE.getGovernedElement();

		/**
		 * The meta object literal for the '<em><b>Control Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOVERNED_ELEMENT__CONTROL_APPLICATIONS = eINSTANCE.getGovernedElement_ControlApplications();

		/**
		 * The meta object literal for the '<em><b>Risks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOVERNED_ELEMENT__RISKS = eINSTANCE.getGovernedElement_Risks();

		/**
		 * The meta object literal for the '<em><b>Waivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOVERNED_ELEMENT__WAIVERS = eINSTANCE.getGovernedElement_Waivers();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.impl.ControlApplicationImpl <em>Control Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.impl.ControlApplicationImpl
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getControlApplication()
		 * @generated
		 */
		EClass CONTROL_APPLICATION = eINSTANCE.getControlApplication();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_APPLICATION__SUBJECT = eINSTANCE.getControlApplication_Subject();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_APPLICATION__CONTROL = eINSTANCE.getControlApplication_Control();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_APPLICATION__STATUS = eINSTANCE.getControlApplication_Status();

		/**
		 * The meta object literal for the '<em><b>Last Verified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_APPLICATION__LAST_VERIFIED = eINSTANCE.getControlApplication_LastVerified();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_APPLICATION__EVIDENCE = eINSTANCE.getControlApplication_Evidence();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.impl.EvidenceImpl <em>Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.impl.EvidenceImpl
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getEvidence()
		 * @generated
		 */
		EClass EVIDENCE = eINSTANCE.getEvidence();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE__LOCATION = eINSTANCE.getEvidence_Location();

		/**
		 * The meta object literal for the '<em><b>Collected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE__COLLECTED = eINSTANCE.getEvidence_Collected();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE__SOURCE = eINSTANCE.getEvidence_Source();

		/**
		 * The meta object literal for the '<em><b>Automated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE__AUTOMATED = eINSTANCE.getEvidence_Automated();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.impl.AssessmentImpl <em>Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.impl.AssessmentImpl
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getAssessment()
		 * @generated
		 */
		EClass ASSESSMENT = eINSTANCE.getAssessment();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESSMENT__DATE = eINSTANCE.getAssessment_Date();

		/**
		 * The meta object literal for the '<em><b>Assessor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESSMENT__ASSESSOR = eINSTANCE.getAssessment_Assessor();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__SCOPE = eINSTANCE.getAssessment_Scope();

		/**
		 * The meta object literal for the '<em><b>Findings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__FINDINGS = eINSTANCE.getAssessment_Findings();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__EVIDENCE = eINSTANCE.getAssessment_Evidence();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.impl.FindingImpl <em>Finding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.impl.FindingImpl
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getFinding()
		 * @generated
		 */
		EClass FINDING = eINSTANCE.getFinding();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__SEVERITY = eINSTANCE.getFinding_Severity();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__STATUS = eINSTANCE.getFinding_Status();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINDING__SUBJECT = eINSTANCE.getFinding_Subject();

		/**
		 * The meta object literal for the '<em><b>Remediation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__REMEDIATION = eINSTANCE.getFinding_Remediation();

		/**
		 * The meta object literal for the '<em><b>Due</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__DUE = eINSTANCE.getFinding_Due();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.impl.WaiverImpl <em>Waiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.impl.WaiverImpl
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getWaiver()
		 * @generated
		 */
		EClass WAIVER = eINSTANCE.getWaiver();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIVER__CONTROL = eINSTANCE.getWaiver_Control();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIVER__SUBJECT = eINSTANCE.getWaiver_Subject();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIVER__JUSTIFICATION = eINSTANCE.getWaiver_Justification();

		/**
		 * The meta object literal for the '<em><b>Expires</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIVER__EXPIRES = eINSTANCE.getWaiver_Expires();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.Level <em>Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.Level
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getLevel()
		 * @generated
		 */
		EEnum LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.ControlNature <em>Control Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.ControlNature
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getControlNature()
		 * @generated
		 */
		EEnum CONTROL_NATURE = eINSTANCE.getControlNature();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.ControlAutomation <em>Control Automation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.ControlAutomation
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getControlAutomation()
		 * @generated
		 */
		EEnum CONTROL_AUTOMATION = eINSTANCE.getControlAutomation();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.RiskTreatment <em>Risk Treatment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.RiskTreatment
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getRiskTreatment()
		 * @generated
		 */
		EEnum RISK_TREATMENT = eINSTANCE.getRiskTreatment();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.ImplementationStatus <em>Implementation Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.ImplementationStatus
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getImplementationStatus()
		 * @generated
		 */
		EEnum IMPLEMENTATION_STATUS = eINSTANCE.getImplementationStatus();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.governance.FindingStatus <em>Finding Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.governance.FindingStatus
		 * @see org.nasdanika.models.governance.impl.GovernancePackageImpl#getFindingStatus()
		 * @generated
		 */
		EEnum FINDING_STATUS = eINSTANCE.getFindingStatus();

	}

} //GovernancePackage
