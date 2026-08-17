/**
 */
package org.nasdanika.models.governance.impl;

import java.time.Duration;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.governance.Control;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.Governed;
import org.nasdanika.models.governance.Waiver;

import org.nasdanika.models.nxcore.NxcorePackage;
import org.nasdanika.models.nxcore.Period;
import org.nasdanika.models.nxcore.Temporal;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Waiver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.impl.WaiverImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.WaiverImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.WaiverImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.WaiverImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.WaiverImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.WaiverImpl#getJustification <em>Justification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WaiverImpl extends ModelElementImpl implements Waiver {
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
	 * The default value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFICATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaiverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GovernancePackage.Literals.WAIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)eDynamicGet(GovernancePackage.WAIVER__DURATION, NxcorePackage.Literals.PERIOD__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(GovernancePackage.WAIVER__DURATION, NxcorePackage.Literals.PERIOD__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getStart() {
		return (Temporal)eDynamicGet(GovernancePackage.WAIVER__START, NxcorePackage.Literals.PERIOD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Temporal newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, GovernancePackage.WAIVER__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Temporal newStart) {
		eDynamicSet(GovernancePackage.WAIVER__START, NxcorePackage.Literals.PERIOD__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getEnd() {
		return (Temporal)eDynamicGet(GovernancePackage.WAIVER__END, NxcorePackage.Literals.PERIOD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Temporal newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, GovernancePackage.WAIVER__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Temporal newEnd) {
		eDynamicSet(GovernancePackage.WAIVER__END, NxcorePackage.Literals.PERIOD__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Control getControl() {
		return (Control)eDynamicGet(GovernancePackage.WAIVER__CONTROL, GovernancePackage.Literals.WAIVER__CONTROL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control basicGetControl() {
		return (Control)eDynamicGet(GovernancePackage.WAIVER__CONTROL, GovernancePackage.Literals.WAIVER__CONTROL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControl(Control newControl) {
		eDynamicSet(GovernancePackage.WAIVER__CONTROL, GovernancePackage.Literals.WAIVER__CONTROL, newControl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Governed getSubject() {
		return (Governed)eDynamicGet(GovernancePackage.WAIVER__SUBJECT, GovernancePackage.Literals.WAIVER__SUBJECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Governed basicGetSubject() {
		return (Governed)eDynamicGet(GovernancePackage.WAIVER__SUBJECT, GovernancePackage.Literals.WAIVER__SUBJECT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Governed newSubject, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSubject, GovernancePackage.WAIVER__SUBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(Governed newSubject) {
		eDynamicSet(GovernancePackage.WAIVER__SUBJECT, GovernancePackage.Literals.WAIVER__SUBJECT, newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJustification() {
		return (String)eDynamicGet(GovernancePackage.WAIVER__JUSTIFICATION, GovernancePackage.Literals.WAIVER__JUSTIFICATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJustification(String newJustification) {
		eDynamicSet(GovernancePackage.WAIVER__JUSTIFICATION, GovernancePackage.Literals.WAIVER__JUSTIFICATION, newJustification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GovernancePackage.WAIVER__SUBJECT:
				Governed subject = basicGetSubject();
				if (subject != null)
					msgs = ((InternalEObject)subject).eInverseRemove(this, GovernancePackage.GOVERNED__WAIVERS, Governed.class, msgs);
				return basicSetSubject((Governed)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GovernancePackage.WAIVER__START:
				return basicSetStart(null, msgs);
			case GovernancePackage.WAIVER__END:
				return basicSetEnd(null, msgs);
			case GovernancePackage.WAIVER__SUBJECT:
				return basicSetSubject(null, msgs);
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
			case GovernancePackage.WAIVER__DURATION:
				return getDuration();
			case GovernancePackage.WAIVER__START:
				return getStart();
			case GovernancePackage.WAIVER__END:
				return getEnd();
			case GovernancePackage.WAIVER__CONTROL:
				if (resolve) return getControl();
				return basicGetControl();
			case GovernancePackage.WAIVER__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case GovernancePackage.WAIVER__JUSTIFICATION:
				return getJustification();
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
			case GovernancePackage.WAIVER__DURATION:
				setDuration((Duration)newValue);
				return;
			case GovernancePackage.WAIVER__START:
				setStart((Temporal)newValue);
				return;
			case GovernancePackage.WAIVER__END:
				setEnd((Temporal)newValue);
				return;
			case GovernancePackage.WAIVER__CONTROL:
				setControl((Control)newValue);
				return;
			case GovernancePackage.WAIVER__SUBJECT:
				setSubject((Governed)newValue);
				return;
			case GovernancePackage.WAIVER__JUSTIFICATION:
				setJustification((String)newValue);
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
			case GovernancePackage.WAIVER__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case GovernancePackage.WAIVER__START:
				setStart((Temporal)null);
				return;
			case GovernancePackage.WAIVER__END:
				setEnd((Temporal)null);
				return;
			case GovernancePackage.WAIVER__CONTROL:
				setControl((Control)null);
				return;
			case GovernancePackage.WAIVER__SUBJECT:
				setSubject((Governed)null);
				return;
			case GovernancePackage.WAIVER__JUSTIFICATION:
				setJustification(JUSTIFICATION_EDEFAULT);
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
			case GovernancePackage.WAIVER__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case GovernancePackage.WAIVER__START:
				return getStart() != null;
			case GovernancePackage.WAIVER__END:
				return getEnd() != null;
			case GovernancePackage.WAIVER__CONTROL:
				return basicGetControl() != null;
			case GovernancePackage.WAIVER__SUBJECT:
				return basicGetSubject() != null;
			case GovernancePackage.WAIVER__JUSTIFICATION:
				return JUSTIFICATION_EDEFAULT == null ? getJustification() != null : !JUSTIFICATION_EDEFAULT.equals(getJustification());
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
				case GovernancePackage.WAIVER__DURATION: return NxcorePackage.PERIOD__DURATION;
				case GovernancePackage.WAIVER__START: return NxcorePackage.PERIOD__START;
				case GovernancePackage.WAIVER__END: return NxcorePackage.PERIOD__END;
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
				case NxcorePackage.PERIOD__DURATION: return GovernancePackage.WAIVER__DURATION;
				case NxcorePackage.PERIOD__START: return GovernancePackage.WAIVER__START;
				case NxcorePackage.PERIOD__END: return GovernancePackage.WAIVER__END;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //WaiverImpl
