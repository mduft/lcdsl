/**
 * generated by Xtext 2.10.0
 */
package com.wamas.ide.launching.lcDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Launch Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchModeType()
 * @model
 * @generated
 */
public enum LaunchModeType implements Enumerator
{
  /**
   * The '<em><b>RUN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RUN_VALUE
   * @generated
   * @ordered
   */
  RUN(0, "RUN", "run"),

  /**
   * The '<em><b>DEBUG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEBUG_VALUE
   * @generated
   * @ordered
   */
  DEBUG(1, "DEBUG", "debug"),

  /**
   * The '<em><b>PROFILE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROFILE_VALUE
   * @generated
   * @ordered
   */
  PROFILE(2, "PROFILE", "profile"),

  /**
   * The '<em><b>COVERAGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COVERAGE_VALUE
   * @generated
   * @ordered
   */
  COVERAGE(3, "COVERAGE", "coverage"),

  /**
   * The '<em><b>INHERIT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INHERIT_VALUE
   * @generated
   * @ordered
   */
  INHERIT(4, "INHERIT", "inherit");

  /**
   * The '<em><b>RUN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RUN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RUN
   * @model literal="run"
   * @generated
   * @ordered
   */
  public static final int RUN_VALUE = 0;

  /**
   * The '<em><b>DEBUG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DEBUG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEBUG
   * @model literal="debug"
   * @generated
   * @ordered
   */
  public static final int DEBUG_VALUE = 1;

  /**
   * The '<em><b>PROFILE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PROFILE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROFILE
   * @model literal="profile"
   * @generated
   * @ordered
   */
  public static final int PROFILE_VALUE = 2;

  /**
   * The '<em><b>COVERAGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COVERAGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COVERAGE
   * @model literal="coverage"
   * @generated
   * @ordered
   */
  public static final int COVERAGE_VALUE = 3;

  /**
   * The '<em><b>INHERIT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INHERIT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INHERIT
   * @model literal="inherit"
   * @generated
   * @ordered
   */
  public static final int INHERIT_VALUE = 4;

  /**
   * An array of all the '<em><b>Launch Mode Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LaunchModeType[] VALUES_ARRAY =
    new LaunchModeType[]
    {
      RUN,
      DEBUG,
      PROFILE,
      COVERAGE,
      INHERIT,
    };

  /**
   * A public read-only list of all the '<em><b>Launch Mode Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LaunchModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Launch Mode Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LaunchModeType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LaunchModeType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Launch Mode Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LaunchModeType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LaunchModeType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Launch Mode Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LaunchModeType get(int value)
  {
    switch (value)
    {
      case RUN_VALUE: return RUN;
      case DEBUG_VALUE: return DEBUG;
      case PROFILE_VALUE: return PROFILE;
      case COVERAGE_VALUE: return COVERAGE;
      case INHERIT_VALUE: return INHERIT;
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
  private LaunchModeType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //LaunchModeType