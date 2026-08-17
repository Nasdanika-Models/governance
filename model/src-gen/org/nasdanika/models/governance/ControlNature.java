/**
 */
package org.nasdanika.models.governance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Control Nature</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  ---- Controls ----
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.governance.GovernancePackage#getControlNature()
 * @model
 * @generated
 */
public enum ControlNature implements Enumerator {
	/**
	 * The '<em><b>PREVENTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Stops the bad thing from happening: input validation, access control.
	 * <!-- end-model-doc -->
	 * @see #PREVENTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PREVENTIVE(0, "PREVENTIVE", "PREVENTIVE"),

	/**
	 * The '<em><b>DETECTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Notices that it happened: monitoring, review, reconciliation.
	 * <!-- end-model-doc -->
	 * @see #DETECTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	DETECTIVE(0, "DETECTIVE", "DETECTIVE"),

	/**
	 * The '<em><b>CORRECTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Fixes it after the fact: rollback, incident response.
	 * <!-- end-model-doc -->
	 * @see #CORRECTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	CORRECTIVE(0, "CORRECTIVE", "CORRECTIVE"),

	/**
	 * The '<em><b>DIRECTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Tells people what to do: standards, training, procedures.
	 * <!-- end-model-doc -->
	 * @see #DIRECTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECTIVE(0, "DIRECTIVE", "DIRECTIVE"),

	/**
	 * The '<em><b>COMPENSATING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Substitutes for an infeasible primary control.
	 * <!-- end-model-doc -->
	 * @see #COMPENSATING_VALUE
	 * @generated
	 * @ordered
	 */
	COMPENSATING(0, "COMPENSATING", "COMPENSATING");

	/**
	 * The '<em><b>PREVENTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Stops the bad thing from happening: input validation, access control.
	 * <!-- end-model-doc -->
	 * @see #PREVENTIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREVENTIVE_VALUE = 0;

	/**
	 * The '<em><b>DETECTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Notices that it happened: monitoring, review, reconciliation.
	 * <!-- end-model-doc -->
	 * @see #DETECTIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DETECTIVE_VALUE = 0;

	/**
	 * The '<em><b>CORRECTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Fixes it after the fact: rollback, incident response.
	 * <!-- end-model-doc -->
	 * @see #CORRECTIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CORRECTIVE_VALUE = 0;

	/**
	 * The '<em><b>DIRECTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Tells people what to do: standards, training, procedures.
	 * <!-- end-model-doc -->
	 * @see #DIRECTIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIRECTIVE_VALUE = 0;

	/**
	 * The '<em><b>COMPENSATING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Substitutes for an infeasible primary control.
	 * <!-- end-model-doc -->
	 * @see #COMPENSATING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPENSATING_VALUE = 0;

	/**
	 * An array of all the '<em><b>Control Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ControlNature[] VALUES_ARRAY =
		new ControlNature[] {
			PREVENTIVE,
			DETECTIVE,
			CORRECTIVE,
			DIRECTIVE,
			COMPENSATING,
		};

	/**
	 * A public read-only list of all the '<em><b>Control Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ControlNature> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Control Nature</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlNature get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlNature result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Nature</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlNature getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlNature result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Nature</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlNature get(int value) {
		switch (value) {
			case PREVENTIVE_VALUE: return PREVENTIVE;
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
	private ControlNature(int value, String name, String literal) {
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
	
} //ControlNature
