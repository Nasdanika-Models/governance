/**
 */
package org.nasdanika.models.governance.impl;

import java.time.Duration;
import java.time.Instant;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.governance.Evidence;
import org.nasdanika.models.governance.GovernancePackage;

import org.nasdanika.models.nxcore.NxcorePackage;
import org.nasdanika.models.nxcore.Temporal;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.impl.EvidenceImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.EvidenceImpl#getInstant <em>Instant</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.EvidenceImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.EvidenceImpl#getLowerBounds <em>Lower Bounds</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.EvidenceImpl#getUpperBounds <em>Upper Bounds</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.EvidenceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.EvidenceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.EvidenceImpl#isAutomated <em>Automated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceImpl extends ModelElementImpl implements Evidence {
	/**
	 * The default value of the '{@link #getInstant() <em>Instant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstant()
	 * @generated
	 * @ordered
	 */
	protected static final Instant INSTANT_EDEFAULT = null;

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
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isAutomated() <em>Automated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOMATED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GovernancePackage.Literals.EVIDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getBase() {
		return (Temporal)eDynamicGet(GovernancePackage.EVIDENCE__BASE, NxcorePackage.Literals.TEMPORAL__BASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temporal basicGetBase() {
		return (Temporal)eDynamicGet(GovernancePackage.EVIDENCE__BASE, NxcorePackage.Literals.TEMPORAL__BASE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(Temporal newBase) {
		eDynamicSet(GovernancePackage.EVIDENCE__BASE, NxcorePackage.Literals.TEMPORAL__BASE, newBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getInstant() {
		return (Instant)eDynamicGet(GovernancePackage.EVIDENCE__INSTANT, NxcorePackage.Literals.TEMPORAL__INSTANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstant(Instant newInstant) {
		eDynamicSet(GovernancePackage.EVIDENCE__INSTANT, NxcorePackage.Literals.TEMPORAL__INSTANT, newInstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)eDynamicGet(GovernancePackage.EVIDENCE__DURATION, NxcorePackage.Literals.TEMPORAL__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(GovernancePackage.EVIDENCE__DURATION, NxcorePackage.Literals.TEMPORAL__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Temporal> getLowerBounds() {
		return (EList<Temporal>)eDynamicGet(GovernancePackage.EVIDENCE__LOWER_BOUNDS, NxcorePackage.Literals.TEMPORAL__LOWER_BOUNDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Temporal> getUpperBounds() {
		return (EList<Temporal>)eDynamicGet(GovernancePackage.EVIDENCE__UPPER_BOUNDS, NxcorePackage.Literals.TEMPORAL__UPPER_BOUNDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return (String)eDynamicGet(GovernancePackage.EVIDENCE__LOCATION, GovernancePackage.Literals.EVIDENCE__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		eDynamicSet(GovernancePackage.EVIDENCE__LOCATION, GovernancePackage.Literals.EVIDENCE__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return (String)eDynamicGet(GovernancePackage.EVIDENCE__SOURCE, GovernancePackage.Literals.EVIDENCE__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		eDynamicSet(GovernancePackage.EVIDENCE__SOURCE, GovernancePackage.Literals.EVIDENCE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutomated() {
		return (Boolean)eDynamicGet(GovernancePackage.EVIDENCE__AUTOMATED, GovernancePackage.Literals.EVIDENCE__AUTOMATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomated(boolean newAutomated) {
		eDynamicSet(GovernancePackage.EVIDENCE__AUTOMATED, GovernancePackage.Literals.EVIDENCE__AUTOMATED, newAutomated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GovernancePackage.EVIDENCE__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case GovernancePackage.EVIDENCE__INSTANT:
				return getInstant();
			case GovernancePackage.EVIDENCE__DURATION:
				return getDuration();
			case GovernancePackage.EVIDENCE__LOWER_BOUNDS:
				return getLowerBounds();
			case GovernancePackage.EVIDENCE__UPPER_BOUNDS:
				return getUpperBounds();
			case GovernancePackage.EVIDENCE__LOCATION:
				return getLocation();
			case GovernancePackage.EVIDENCE__SOURCE:
				return getSource();
			case GovernancePackage.EVIDENCE__AUTOMATED:
				return isAutomated();
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
			case GovernancePackage.EVIDENCE__BASE:
				setBase((Temporal)newValue);
				return;
			case GovernancePackage.EVIDENCE__INSTANT:
				setInstant((Instant)newValue);
				return;
			case GovernancePackage.EVIDENCE__DURATION:
				setDuration((Duration)newValue);
				return;
			case GovernancePackage.EVIDENCE__LOWER_BOUNDS:
				getLowerBounds().clear();
				getLowerBounds().addAll((Collection<? extends Temporal>)newValue);
				return;
			case GovernancePackage.EVIDENCE__UPPER_BOUNDS:
				getUpperBounds().clear();
				getUpperBounds().addAll((Collection<? extends Temporal>)newValue);
				return;
			case GovernancePackage.EVIDENCE__LOCATION:
				setLocation((String)newValue);
				return;
			case GovernancePackage.EVIDENCE__SOURCE:
				setSource((String)newValue);
				return;
			case GovernancePackage.EVIDENCE__AUTOMATED:
				setAutomated((Boolean)newValue);
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
			case GovernancePackage.EVIDENCE__BASE:
				setBase((Temporal)null);
				return;
			case GovernancePackage.EVIDENCE__INSTANT:
				setInstant(INSTANT_EDEFAULT);
				return;
			case GovernancePackage.EVIDENCE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case GovernancePackage.EVIDENCE__LOWER_BOUNDS:
				getLowerBounds().clear();
				return;
			case GovernancePackage.EVIDENCE__UPPER_BOUNDS:
				getUpperBounds().clear();
				return;
			case GovernancePackage.EVIDENCE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case GovernancePackage.EVIDENCE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case GovernancePackage.EVIDENCE__AUTOMATED:
				setAutomated(AUTOMATED_EDEFAULT);
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
			case GovernancePackage.EVIDENCE__BASE:
				return basicGetBase() != null;
			case GovernancePackage.EVIDENCE__INSTANT:
				return INSTANT_EDEFAULT == null ? getInstant() != null : !INSTANT_EDEFAULT.equals(getInstant());
			case GovernancePackage.EVIDENCE__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case GovernancePackage.EVIDENCE__LOWER_BOUNDS:
				return !getLowerBounds().isEmpty();
			case GovernancePackage.EVIDENCE__UPPER_BOUNDS:
				return !getUpperBounds().isEmpty();
			case GovernancePackage.EVIDENCE__LOCATION:
				return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
			case GovernancePackage.EVIDENCE__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case GovernancePackage.EVIDENCE__AUTOMATED:
				return isAutomated() != AUTOMATED_EDEFAULT;
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
		if (baseClass == Temporal.class) {
			switch (derivedFeatureID) {
				case GovernancePackage.EVIDENCE__BASE: return NxcorePackage.TEMPORAL__BASE;
				case GovernancePackage.EVIDENCE__INSTANT: return NxcorePackage.TEMPORAL__INSTANT;
				case GovernancePackage.EVIDENCE__DURATION: return NxcorePackage.TEMPORAL__DURATION;
				case GovernancePackage.EVIDENCE__LOWER_BOUNDS: return NxcorePackage.TEMPORAL__LOWER_BOUNDS;
				case GovernancePackage.EVIDENCE__UPPER_BOUNDS: return NxcorePackage.TEMPORAL__UPPER_BOUNDS;
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
		if (baseClass == Temporal.class) {
			switch (baseFeatureID) {
				case NxcorePackage.TEMPORAL__BASE: return GovernancePackage.EVIDENCE__BASE;
				case NxcorePackage.TEMPORAL__INSTANT: return GovernancePackage.EVIDENCE__INSTANT;
				case NxcorePackage.TEMPORAL__DURATION: return GovernancePackage.EVIDENCE__DURATION;
				case NxcorePackage.TEMPORAL__LOWER_BOUNDS: return GovernancePackage.EVIDENCE__LOWER_BOUNDS;
				case NxcorePackage.TEMPORAL__UPPER_BOUNDS: return GovernancePackage.EVIDENCE__UPPER_BOUNDS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EvidenceImpl
