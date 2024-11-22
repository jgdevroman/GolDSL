/**
 * generated by Xtext 2.37.0
 */
package gameOfLife.model.gDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gameOfLife.model.gDSL.Condition#getOperator <em>Operator</em>}</li>
 *   <li>{@link gameOfLife.model.gDSL.Condition#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see gameOfLife.model.gDSL.GDSLPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link gameOfLife.model.gDSL.RelationalOperator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see gameOfLife.model.gDSL.RelationalOperator
   * @see #setOperator(RelationalOperator)
   * @see gameOfLife.model.gDSL.GDSLPackage#getCondition_Operator()
   * @model
   * @generated
   */
  RelationalOperator getOperator();

  /**
   * Sets the value of the '{@link gameOfLife.model.gDSL.Condition#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see gameOfLife.model.gDSL.RelationalOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(RelationalOperator value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see gameOfLife.model.gDSL.GDSLPackage#getCondition_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link gameOfLife.model.gDSL.Condition#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // Condition
