/**
 */
package org.nasdanika.models.governance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.governance.Control;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.Governed;
import org.nasdanika.models.governance.Level;
import org.nasdanika.models.governance.Risk;
import org.nasdanika.models.governance.RiskTreatment;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.impl.RiskImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.RiskImpl#getInherentLikelihood <em>Inherent Likelihood</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.RiskImpl#getInherentImpact <em>Inherent Impact</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.RiskImpl#getResidualLikelihood <em>Residual Likelihood</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.RiskImpl#getResidualImpact <em>Residual Impact</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.RiskImpl#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.RiskImpl#getMitigations <em>Mitigations</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.RiskImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskImpl extends ModelElementImpl implements Risk {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInherentLikelihood() <em>Inherent Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherentLikelihood()
	 * @generated
	 * @ordered
	 */
	protected static final Level INHERENT_LIKELIHOOD_EDEFAULT = Level.VERY_LOW;

	/**
	 * The default value of the '{@link #getInherentImpact() <em>Inherent Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherentImpact()
	 * @generated
	 * @ordered
	 */
	protected static final Level INHERENT_IMPACT_EDEFAULT = Level.VERY_LOW;

	/**
	 * The default value of the '{@link #getResidualLikelihood() <em>Residual Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidualLikelihood()
	 * @generated
	 * @ordered
	 */
	protected static final Level RESIDUAL_LIKELIHOOD_EDEFAULT = Level.VERY_LOW;

	/**
	 * The default value of the '{@link #getResidualImpact() <em>Residual Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidualImpact()
	 * @generated
	 * @ordered
	 */
	protected static final Level RESIDUAL_IMPACT_EDEFAULT = Level.VERY_LOW;

	/**
	 * The default value of the '{@link #getTreatment() <em>Treatment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatment()
	 * @generated
	 * @ordered
	 */
	protected static final RiskTreatment TREATMENT_EDEFAULT = RiskTreatment.ACCEPT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GovernancePackage.Literals.RISK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategory() {
		return (String)eDynamicGet(GovernancePackage.RISK__CATEGORY, GovernancePackage.Literals.RISK__CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(String newCategory) {
		eDynamicSet(GovernancePackage.RISK__CATEGORY, GovernancePackage.Literals.RISK__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getInherentLikelihood() {
		return (Level)eDynamicGet(GovernancePackage.RISK__INHERENT_LIKELIHOOD, GovernancePackage.Literals.RISK__INHERENT_LIKELIHOOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInherentLikelihood(Level newInherentLikelihood) {
		eDynamicSet(GovernancePackage.RISK__INHERENT_LIKELIHOOD, GovernancePackage.Literals.RISK__INHERENT_LIKELIHOOD, newInherentLikelihood);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getInherentImpact() {
		return (Level)eDynamicGet(GovernancePackage.RISK__INHERENT_IMPACT, GovernancePackage.Literals.RISK__INHERENT_IMPACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInherentImpact(Level newInherentImpact) {
		eDynamicSet(GovernancePackage.RISK__INHERENT_IMPACT, GovernancePackage.Literals.RISK__INHERENT_IMPACT, newInherentImpact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getResidualLikelihood() {
		return (Level)eDynamicGet(GovernancePackage.RISK__RESIDUAL_LIKELIHOOD, GovernancePackage.Literals.RISK__RESIDUAL_LIKELIHOOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResidualLikelihood(Level newResidualLikelihood) {
		eDynamicSet(GovernancePackage.RISK__RESIDUAL_LIKELIHOOD, GovernancePackage.Literals.RISK__RESIDUAL_LIKELIHOOD, newResidualLikelihood);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getResidualImpact() {
		return (Level)eDynamicGet(GovernancePackage.RISK__RESIDUAL_IMPACT, GovernancePackage.Literals.RISK__RESIDUAL_IMPACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResidualImpact(Level newResidualImpact) {
		eDynamicSet(GovernancePackage.RISK__RESIDUAL_IMPACT, GovernancePackage.Literals.RISK__RESIDUAL_IMPACT, newResidualImpact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskTreatment getTreatment() {
		return (RiskTreatment)eDynamicGet(GovernancePackage.RISK__TREATMENT, GovernancePackage.Literals.RISK__TREATMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTreatment(RiskTreatment newTreatment) {
		eDynamicSet(GovernancePackage.RISK__TREATMENT, GovernancePackage.Literals.RISK__TREATMENT, newTreatment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Control> getMitigations() {
		return (EList<Control>)eDynamicGet(GovernancePackage.RISK__MITIGATIONS, GovernancePackage.Literals.RISK__MITIGATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Governed getSubject() {
		return (Governed)eDynamicGet(GovernancePackage.RISK__SUBJECT, GovernancePackage.Literals.RISK__SUBJECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Governed basicGetSubject() {
		return (Governed)eDynamicGet(GovernancePackage.RISK__SUBJECT, GovernancePackage.Literals.RISK__SUBJECT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Governed newSubject, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSubject, GovernancePackage.RISK__SUBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(Governed newSubject) {
		eDynamicSet(GovernancePackage.RISK__SUBJECT, GovernancePackage.Literals.RISK__SUBJECT, newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GovernancePackage.RISK__MITIGATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMitigations()).basicAdd(otherEnd, msgs);
			case GovernancePackage.RISK__SUBJECT:
				Governed subject = basicGetSubject();
				if (subject != null)
					msgs = ((InternalEObject)subject).eInverseRemove(this, GovernancePackage.GOVERNED__RISKS, Governed.class, msgs);
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
			case GovernancePackage.RISK__MITIGATIONS:
				return ((InternalEList<?>)getMitigations()).basicRemove(otherEnd, msgs);
			case GovernancePackage.RISK__SUBJECT:
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
			case GovernancePackage.RISK__CATEGORY:
				return getCategory();
			case GovernancePackage.RISK__INHERENT_LIKELIHOOD:
				return getInherentLikelihood();
			case GovernancePackage.RISK__INHERENT_IMPACT:
				return getInherentImpact();
			case GovernancePackage.RISK__RESIDUAL_LIKELIHOOD:
				return getResidualLikelihood();
			case GovernancePackage.RISK__RESIDUAL_IMPACT:
				return getResidualImpact();
			case GovernancePackage.RISK__TREATMENT:
				return getTreatment();
			case GovernancePackage.RISK__MITIGATIONS:
				return getMitigations();
			case GovernancePackage.RISK__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
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
			case GovernancePackage.RISK__CATEGORY:
				setCategory((String)newValue);
				return;
			case GovernancePackage.RISK__INHERENT_LIKELIHOOD:
				setInherentLikelihood((Level)newValue);
				return;
			case GovernancePackage.RISK__INHERENT_IMPACT:
				setInherentImpact((Level)newValue);
				return;
			case GovernancePackage.RISK__RESIDUAL_LIKELIHOOD:
				setResidualLikelihood((Level)newValue);
				return;
			case GovernancePackage.RISK__RESIDUAL_IMPACT:
				setResidualImpact((Level)newValue);
				return;
			case GovernancePackage.RISK__TREATMENT:
				setTreatment((RiskTreatment)newValue);
				return;
			case GovernancePackage.RISK__MITIGATIONS:
				getMitigations().clear();
				getMitigations().addAll((Collection<? extends Control>)newValue);
				return;
			case GovernancePackage.RISK__SUBJECT:
				setSubject((Governed)newValue);
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
			case GovernancePackage.RISK__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case GovernancePackage.RISK__INHERENT_LIKELIHOOD:
				setInherentLikelihood(INHERENT_LIKELIHOOD_EDEFAULT);
				return;
			case GovernancePackage.RISK__INHERENT_IMPACT:
				setInherentImpact(INHERENT_IMPACT_EDEFAULT);
				return;
			case GovernancePackage.RISK__RESIDUAL_LIKELIHOOD:
				setResidualLikelihood(RESIDUAL_LIKELIHOOD_EDEFAULT);
				return;
			case GovernancePackage.RISK__RESIDUAL_IMPACT:
				setResidualImpact(RESIDUAL_IMPACT_EDEFAULT);
				return;
			case GovernancePackage.RISK__TREATMENT:
				setTreatment(TREATMENT_EDEFAULT);
				return;
			case GovernancePackage.RISK__MITIGATIONS:
				getMitigations().clear();
				return;
			case GovernancePackage.RISK__SUBJECT:
				setSubject((Governed)null);
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
			case GovernancePackage.RISK__CATEGORY:
				return CATEGORY_EDEFAULT == null ? getCategory() != null : !CATEGORY_EDEFAULT.equals(getCategory());
			case GovernancePackage.RISK__INHERENT_LIKELIHOOD:
				return getInherentLikelihood() != INHERENT_LIKELIHOOD_EDEFAULT;
			case GovernancePackage.RISK__INHERENT_IMPACT:
				return getInherentImpact() != INHERENT_IMPACT_EDEFAULT;
			case GovernancePackage.RISK__RESIDUAL_LIKELIHOOD:
				return getResidualLikelihood() != RESIDUAL_LIKELIHOOD_EDEFAULT;
			case GovernancePackage.RISK__RESIDUAL_IMPACT:
				return getResidualImpact() != RESIDUAL_IMPACT_EDEFAULT;
			case GovernancePackage.RISK__TREATMENT:
				return getTreatment() != TREATMENT_EDEFAULT;
			case GovernancePackage.RISK__MITIGATIONS:
				return !getMitigations().isEmpty();
			case GovernancePackage.RISK__SUBJECT:
				return basicGetSubject() != null;
		}
		return super.eIsSet(featureID);
	}

} //RiskImpl
