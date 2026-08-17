/**
 */
package org.nasdanika.models.governance.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.governance.Evidence;
import org.nasdanika.models.governance.GovernancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.impl.EvidenceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.EvidenceImpl#getCollected <em>Collected</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.EvidenceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.EvidenceImpl#isAutomated <em>Automated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceImpl extends ModelElementImpl implements Evidence {
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
	 * The default value of the '{@link #getCollected() <em>Collected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollected()
	 * @generated
	 * @ordered
	 */
	protected static final Date COLLECTED_EDEFAULT = null;

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
	public Date getCollected() {
		return (Date)eDynamicGet(GovernancePackage.EVIDENCE__COLLECTED, GovernancePackage.Literals.EVIDENCE__COLLECTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollected(Date newCollected) {
		eDynamicSet(GovernancePackage.EVIDENCE__COLLECTED, GovernancePackage.Literals.EVIDENCE__COLLECTED, newCollected);
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
			case GovernancePackage.EVIDENCE__LOCATION:
				return getLocation();
			case GovernancePackage.EVIDENCE__COLLECTED:
				return getCollected();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GovernancePackage.EVIDENCE__LOCATION:
				setLocation((String)newValue);
				return;
			case GovernancePackage.EVIDENCE__COLLECTED:
				setCollected((Date)newValue);
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
			case GovernancePackage.EVIDENCE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case GovernancePackage.EVIDENCE__COLLECTED:
				setCollected(COLLECTED_EDEFAULT);
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
			case GovernancePackage.EVIDENCE__LOCATION:
				return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
			case GovernancePackage.EVIDENCE__COLLECTED:
				return COLLECTED_EDEFAULT == null ? getCollected() != null : !COLLECTED_EDEFAULT.equals(getCollected());
			case GovernancePackage.EVIDENCE__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case GovernancePackage.EVIDENCE__AUTOMATED:
				return isAutomated() != AUTOMATED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //EvidenceImpl
