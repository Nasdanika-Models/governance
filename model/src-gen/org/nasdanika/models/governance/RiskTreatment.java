/**
 */
package org.nasdanika.models.governance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Risk Treatment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  ---- Risks ----
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.governance.GovernancePackage#getRiskTreatment()
 * @model
 * @generated
 */
public enum RiskTreatment implements Enumerator {
	/**
	 * The '<em><b>ACCEPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Documented decision to live with it; pairs with the decision model.
	 * <!-- end-model-doc -->
	 * @see #ACCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPT(0, "ACCEPT", "ACCEPT"),

	/**
	 * The '<em><b>MITIGATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MITIGATE_VALUE
	 * @generated
	 * @ordered
	 */
	MITIGATE(0, "MITIGATE", "MITIGATE"),

	/**
	 * The '<em><b>TRANSFER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Insurance, contract, vendor.
	 * <!-- end-model-doc -->
	 * @see #TRANSFER_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFER(0, "TRANSFER", "TRANSFER"),

	/**
	 * The '<em><b>AVOID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Do not do the thing.
	 * <!-- end-model-doc -->
	 * @see #AVOID_VALUE
	 * @generated
	 * @ordered
	 */
	AVOID(0, "AVOID", "AVOID");

	/**
	 * The '<em><b>ACCEPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Documented decision to live with it; pairs with the decision model.
	 * <!-- end-model-doc -->
	 * @see #ACCEPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPT_VALUE = 0;

	/**
	 * The '<em><b>MITIGATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MITIGATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MITIGATE_VALUE = 0;

	/**
	 * The '<em><b>TRANSFER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Insurance, contract, vendor.
	 * <!-- end-model-doc -->
	 * @see #TRANSFER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFER_VALUE = 0;

	/**
	 * The '<em><b>AVOID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Do not do the thing.
	 * <!-- end-model-doc -->
	 * @see #AVOID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVOID_VALUE = 0;

	/**
	 * An array of all the '<em><b>Risk Treatment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RiskTreatment[] VALUES_ARRAY =
		new RiskTreatment[] {
			ACCEPT,
			MITIGATE,
			TRANSFER,
			AVOID,
		};

	/**
	 * A public read-only list of all the '<em><b>Risk Treatment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RiskTreatment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Risk Treatment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RiskTreatment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RiskTreatment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Risk Treatment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RiskTreatment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RiskTreatment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Risk Treatment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RiskTreatment get(int value) {
		switch (value) {
			case ACCEPT_VALUE: return ACCEPT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RiskTreatment(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RiskTreatment
