/**
 */
package org.nasdanika.models.governance.impl;

import java.time.Duration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.governance.Assessment;
import org.nasdanika.models.governance.Evidence;
import org.nasdanika.models.governance.Finding;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.Governed;

import org.nasdanika.models.nxcore.NxcorePackage;
import org.nasdanika.models.nxcore.Period;
import org.nasdanika.models.nxcore.Temporal;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.role.Role;
import org.nasdanika.models.role.RolePackage;
import org.nasdanika.models.role.Undergoer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.impl.AssessmentImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.AssessmentImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.AssessmentImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.AssessmentImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.AssessmentImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.AssessmentImpl#getFindings <em>Findings</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.AssessmentImpl#getEvidence <em>Evidence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssessmentImpl extends ModelElementImpl implements Assessment {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = null;

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
	public Duration getDuration() {
		return (Duration)eDynamicGet(GovernancePackage.ASSESSMENT__DURATION, NxcorePackage.Literals.PERIOD__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(GovernancePackage.ASSESSMENT__DURATION, NxcorePackage.Literals.PERIOD__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getStart() {
		return (Temporal)eDynamicGet(GovernancePackage.ASSESSMENT__START, NxcorePackage.Literals.PERIOD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Temporal newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, GovernancePackage.ASSESSMENT__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Temporal newStart) {
		eDynamicSet(GovernancePackage.ASSESSMENT__START, NxcorePackage.Literals.PERIOD__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getEnd() {
		return (Temporal)eDynamicGet(GovernancePackage.ASSESSMENT__END, NxcorePackage.Literals.PERIOD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Temporal newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, GovernancePackage.ASSESSMENT__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Temporal newEnd) {
		eDynamicSet(GovernancePackage.ASSESSMENT__END, NxcorePackage.Literals.PERIOD__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(GovernancePackage.ASSESSMENT__ROLES, RolePackage.Literals.UNDERGOER__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Governed> getScope() {
		return (EList<Governed>)eDynamicGet(GovernancePackage.ASSESSMENT__SCOPE, GovernancePackage.Literals.ASSESSMENT__SCOPE, true, true);
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
			case GovernancePackage.ASSESSMENT__START:
				return basicSetStart(null, msgs);
			case GovernancePackage.ASSESSMENT__END:
				return basicSetEnd(null, msgs);
			case GovernancePackage.ASSESSMENT__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case GovernancePackage.ASSESSMENT__DURATION:
				return getDuration();
			case GovernancePackage.ASSESSMENT__START:
				return getStart();
			case GovernancePackage.ASSESSMENT__END:
				return getEnd();
			case GovernancePackage.ASSESSMENT__ROLES:
				return getRoles();
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
			case GovernancePackage.ASSESSMENT__DURATION:
				setDuration((Duration)newValue);
				return;
			case GovernancePackage.ASSESSMENT__START:
				setStart((Temporal)newValue);
				return;
			case GovernancePackage.ASSESSMENT__END:
				setEnd((Temporal)newValue);
				return;
			case GovernancePackage.ASSESSMENT__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case GovernancePackage.ASSESSMENT__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends Governed>)newValue);
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
			case GovernancePackage.ASSESSMENT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case GovernancePackage.ASSESSMENT__START:
				setStart((Temporal)null);
				return;
			case GovernancePackage.ASSESSMENT__END:
				setEnd((Temporal)null);
				return;
			case GovernancePackage.ASSESSMENT__ROLES:
				getRoles().clear();
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
			case GovernancePackage.ASSESSMENT__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case GovernancePackage.ASSESSMENT__START:
				return getStart() != null;
			case GovernancePackage.ASSESSMENT__END:
				return getEnd() != null;
			case GovernancePackage.ASSESSMENT__ROLES:
				return !getRoles().isEmpty();
			case GovernancePackage.ASSESSMENT__SCOPE:
				return !getScope().isEmpty();
			case GovernancePackage.ASSESSMENT__FINDINGS:
				return !getFindings().isEmpty();
			case GovernancePackage.ASSESSMENT__EVIDENCE:
				return !getEvidence().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Period.class) {
			switch (derivedFeatureID) {
				case GovernancePackage.ASSESSMENT__DURATION: return NxcorePackage.PERIOD__DURATION;
				case GovernancePackage.ASSESSMENT__START: return NxcorePackage.PERIOD__START;
				case GovernancePackage.ASSESSMENT__END: return NxcorePackage.PERIOD__END;
				default: return -1;
			}
		}
		if (baseClass == Undergoer.class) {
			switch (derivedFeatureID) {
				case GovernancePackage.ASSESSMENT__ROLES: return RolePackage.UNDERGOER__ROLES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Period.class) {
			switch (baseFeatureID) {
				case NxcorePackage.PERIOD__DURATION: return GovernancePackage.ASSESSMENT__DURATION;
				case NxcorePackage.PERIOD__START: return GovernancePackage.ASSESSMENT__START;
				case NxcorePackage.PERIOD__END: return GovernancePackage.ASSESSMENT__END;
				default: return -1;
			}
		}
		if (baseClass == Undergoer.class) {
			switch (baseFeatureID) {
				case RolePackage.UNDERGOER__ROLES: return GovernancePackage.ASSESSMENT__ROLES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AssessmentImpl
