/**
 */
package org.nasdanika.models.governance.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.governance.ControlApplication;
import org.nasdanika.models.governance.Finding;
import org.nasdanika.models.governance.FindingStatus;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.Level;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.impl.FindingImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.FindingImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.FindingImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.FindingImpl#getRemediation <em>Remediation</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.FindingImpl#getDue <em>Due</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindingImpl extends ModelElementImpl implements Finding {
	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Level SEVERITY_EDEFAULT = Level.VERY_LOW;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final FindingStatus STATUS_EDEFAULT = FindingStatus.OPEN;

	/**
	 * The default value of the '{@link #getRemediation() <em>Remediation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemediation()
	 * @generated
	 * @ordered
	 */
	protected static final String REMEDIATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDue() <em>Due</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDue()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GovernancePackage.Literals.FINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getSeverity() {
		return (Level)eDynamicGet(GovernancePackage.FINDING__SEVERITY, GovernancePackage.Literals.FINDING__SEVERITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(Level newSeverity) {
		eDynamicSet(GovernancePackage.FINDING__SEVERITY, GovernancePackage.Literals.FINDING__SEVERITY, newSeverity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindingStatus getStatus() {
		return (FindingStatus)eDynamicGet(GovernancePackage.FINDING__STATUS, GovernancePackage.Literals.FINDING__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(FindingStatus newStatus) {
		eDynamicSet(GovernancePackage.FINDING__STATUS, GovernancePackage.Literals.FINDING__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlApplication getSubject() {
		return (ControlApplication)eDynamicGet(GovernancePackage.FINDING__SUBJECT, GovernancePackage.Literals.FINDING__SUBJECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlApplication basicGetSubject() {
		return (ControlApplication)eDynamicGet(GovernancePackage.FINDING__SUBJECT, GovernancePackage.Literals.FINDING__SUBJECT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(ControlApplication newSubject) {
		eDynamicSet(GovernancePackage.FINDING__SUBJECT, GovernancePackage.Literals.FINDING__SUBJECT, newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemediation() {
		return (String)eDynamicGet(GovernancePackage.FINDING__REMEDIATION, GovernancePackage.Literals.FINDING__REMEDIATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemediation(String newRemediation) {
		eDynamicSet(GovernancePackage.FINDING__REMEDIATION, GovernancePackage.Literals.FINDING__REMEDIATION, newRemediation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDue() {
		return (Date)eDynamicGet(GovernancePackage.FINDING__DUE, GovernancePackage.Literals.FINDING__DUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDue(Date newDue) {
		eDynamicSet(GovernancePackage.FINDING__DUE, GovernancePackage.Literals.FINDING__DUE, newDue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GovernancePackage.FINDING__SEVERITY:
				return getSeverity();
			case GovernancePackage.FINDING__STATUS:
				return getStatus();
			case GovernancePackage.FINDING__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case GovernancePackage.FINDING__REMEDIATION:
				return getRemediation();
			case GovernancePackage.FINDING__DUE:
				return getDue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GovernancePackage.FINDING__SEVERITY:
				setSeverity((Level)newValue);
				return;
			case GovernancePackage.FINDING__STATUS:
				setStatus((FindingStatus)newValue);
				return;
			case GovernancePackage.FINDING__SUBJECT:
				setSubject((ControlApplication)newValue);
				return;
			case GovernancePackage.FINDING__REMEDIATION:
				setRemediation((String)newValue);
				return;
			case GovernancePackage.FINDING__DUE:
				setDue((Date)newValue);
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
			case GovernancePackage.FINDING__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case GovernancePackage.FINDING__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case GovernancePackage.FINDING__SUBJECT:
				setSubject((ControlApplication)null);
				return;
			case GovernancePackage.FINDING__REMEDIATION:
				setRemediation(REMEDIATION_EDEFAULT);
				return;
			case GovernancePackage.FINDING__DUE:
				setDue(DUE_EDEFAULT);
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
			case GovernancePackage.FINDING__SEVERITY:
				return getSeverity() != SEVERITY_EDEFAULT;
			case GovernancePackage.FINDING__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case GovernancePackage.FINDING__SUBJECT:
				return basicGetSubject() != null;
			case GovernancePackage.FINDING__REMEDIATION:
				return REMEDIATION_EDEFAULT == null ? getRemediation() != null : !REMEDIATION_EDEFAULT.equals(getRemediation());
			case GovernancePackage.FINDING__DUE:
				return DUE_EDEFAULT == null ? getDue() != null : !DUE_EDEFAULT.equals(getDue());
		}
		return super.eIsSet(featureID);
	}

} //FindingImpl
