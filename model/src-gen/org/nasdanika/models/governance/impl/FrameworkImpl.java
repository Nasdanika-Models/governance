/**
 */
package org.nasdanika.models.governance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.governance.Framework;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Framework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.governance.impl.FrameworkImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.FrameworkImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.FrameworkImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link org.nasdanika.models.governance.impl.FrameworkImpl#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrameworkImpl extends ModelElementImpl implements Framework {
	/**
	 * The default value of the '{@link #getAuthority() <em>Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GovernancePackage.Literals.FRAMEWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthority() {
		return (String)eDynamicGet(GovernancePackage.FRAMEWORK__AUTHORITY, GovernancePackage.Literals.FRAMEWORK__AUTHORITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthority(String newAuthority) {
		eDynamicSet(GovernancePackage.FRAMEWORK__AUTHORITY, GovernancePackage.Literals.FRAMEWORK__AUTHORITY, newAuthority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return (String)eDynamicGet(GovernancePackage.FRAMEWORK__VERSION, GovernancePackage.Literals.FRAMEWORK__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		eDynamicSet(GovernancePackage.FRAMEWORK__VERSION, GovernancePackage.Literals.FRAMEWORK__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebsite() {
		return (String)eDynamicGet(GovernancePackage.FRAMEWORK__WEBSITE, GovernancePackage.Literals.FRAMEWORK__WEBSITE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebsite(String newWebsite) {
		eDynamicSet(GovernancePackage.FRAMEWORK__WEBSITE, GovernancePackage.Literals.FRAMEWORK__WEBSITE, newWebsite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Requirement> getRequirements() {
		return (EList<Requirement>)eDynamicGet(GovernancePackage.FRAMEWORK__REQUIREMENTS, GovernancePackage.Literals.FRAMEWORK__REQUIREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GovernancePackage.FRAMEWORK__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
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
			case GovernancePackage.FRAMEWORK__AUTHORITY:
				return getAuthority();
			case GovernancePackage.FRAMEWORK__VERSION:
				return getVersion();
			case GovernancePackage.FRAMEWORK__WEBSITE:
				return getWebsite();
			case GovernancePackage.FRAMEWORK__REQUIREMENTS:
				return getRequirements();
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
			case GovernancePackage.FRAMEWORK__AUTHORITY:
				setAuthority((String)newValue);
				return;
			case GovernancePackage.FRAMEWORK__VERSION:
				setVersion((String)newValue);
				return;
			case GovernancePackage.FRAMEWORK__WEBSITE:
				setWebsite((String)newValue);
				return;
			case GovernancePackage.FRAMEWORK__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Requirement>)newValue);
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
			case GovernancePackage.FRAMEWORK__AUTHORITY:
				setAuthority(AUTHORITY_EDEFAULT);
				return;
			case GovernancePackage.FRAMEWORK__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case GovernancePackage.FRAMEWORK__WEBSITE:
				setWebsite(WEBSITE_EDEFAULT);
				return;
			case GovernancePackage.FRAMEWORK__REQUIREMENTS:
				getRequirements().clear();
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
			case GovernancePackage.FRAMEWORK__AUTHORITY:
				return AUTHORITY_EDEFAULT == null ? getAuthority() != null : !AUTHORITY_EDEFAULT.equals(getAuthority());
			case GovernancePackage.FRAMEWORK__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case GovernancePackage.FRAMEWORK__WEBSITE:
				return WEBSITE_EDEFAULT == null ? getWebsite() != null : !WEBSITE_EDEFAULT.equals(getWebsite());
			case GovernancePackage.FRAMEWORK__REQUIREMENTS:
				return !getRequirements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FrameworkImpl
