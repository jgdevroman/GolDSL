/**
 * generated by Xtext 2.37.0
 */
package gameOfLife.model.gameOfLife;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gameOfLife.model.gameOfLife.GameOfLifeFactory
 * @model kind="package"
 * @generated
 */
public interface GameOfLifePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gameOfLife";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.example.org/GDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gameOfLife";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GameOfLifePackage eINSTANCE = gameOfLife.model.gameOfLife.impl.GameOfLifePackageImpl.init();

  /**
   * The meta object id for the '{@link gameOfLife.model.gameOfLife.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameOfLife.model.gameOfLife.impl.ModelImpl
   * @see gameOfLife.model.gameOfLife.impl.GameOfLifePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Cells</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CELLS = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RULES = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link gameOfLife.model.gameOfLife.impl.CellImpl <em>Cell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameOfLife.model.gameOfLife.impl.CellImpl
   * @see gameOfLife.model.gameOfLife.impl.GameOfLifePackageImpl#getCell()
   * @generated
   */
  int CELL = 1;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__Y = 1;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__STATE = 2;

  /**
   * The number of structural features of the '<em>Cell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link gameOfLife.model.gameOfLife.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameOfLife.model.gameOfLife.impl.RuleImpl
   * @see gameOfLife.model.gameOfLife.impl.GameOfLifePackageImpl#getRule()
   * @generated
   */
  int RULE = 2;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__ACTION = 1;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link gameOfLife.model.gameOfLife.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameOfLife.model.gameOfLife.impl.ConditionImpl
   * @see gameOfLife.model.gameOfLife.impl.GameOfLifePackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 3;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link gameOfLife.model.gameOfLife.CellState <em>Cell State</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gameOfLife.model.gameOfLife.CellState
   * @see gameOfLife.model.gameOfLife.impl.GameOfLifePackageImpl#getCellState()
   * @generated
   */
  int CELL_STATE = 4;


  /**
   * Returns the meta object for class '{@link gameOfLife.model.gameOfLife.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see gameOfLife.model.gameOfLife.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link gameOfLife.model.gameOfLife.Model#getCells <em>Cells</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cells</em>'.
   * @see gameOfLife.model.gameOfLife.Model#getCells()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Cells();

  /**
   * Returns the meta object for the containment reference list '{@link gameOfLife.model.gameOfLife.Model#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see gameOfLife.model.gameOfLife.Model#getRules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Rules();

  /**
   * Returns the meta object for class '{@link gameOfLife.model.gameOfLife.Cell <em>Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell</em>'.
   * @see gameOfLife.model.gameOfLife.Cell
   * @generated
   */
  EClass getCell();

  /**
   * Returns the meta object for the attribute '{@link gameOfLife.model.gameOfLife.Cell#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see gameOfLife.model.gameOfLife.Cell#getX()
   * @see #getCell()
   * @generated
   */
  EAttribute getCell_X();

  /**
   * Returns the meta object for the attribute '{@link gameOfLife.model.gameOfLife.Cell#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see gameOfLife.model.gameOfLife.Cell#getY()
   * @see #getCell()
   * @generated
   */
  EAttribute getCell_Y();

  /**
   * Returns the meta object for the attribute '{@link gameOfLife.model.gameOfLife.Cell#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State</em>'.
   * @see gameOfLife.model.gameOfLife.Cell#getState()
   * @see #getCell()
   * @generated
   */
  EAttribute getCell_State();

  /**
   * Returns the meta object for class '{@link gameOfLife.model.gameOfLife.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see gameOfLife.model.gameOfLife.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the containment reference '{@link gameOfLife.model.gameOfLife.Rule#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see gameOfLife.model.gameOfLife.Rule#getCondition()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Condition();

  /**
   * Returns the meta object for the attribute '{@link gameOfLife.model.gameOfLife.Rule#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action</em>'.
   * @see gameOfLife.model.gameOfLife.Rule#getAction()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Action();

  /**
   * Returns the meta object for class '{@link gameOfLife.model.gameOfLife.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see gameOfLife.model.gameOfLife.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the attribute '{@link gameOfLife.model.gameOfLife.Condition#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see gameOfLife.model.gameOfLife.Condition#getOperator()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Operator();

  /**
   * Returns the meta object for the attribute '{@link gameOfLife.model.gameOfLife.Condition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see gameOfLife.model.gameOfLife.Condition#getValue()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Value();

  /**
   * Returns the meta object for enum '{@link gameOfLife.model.gameOfLife.CellState <em>Cell State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cell State</em>'.
   * @see gameOfLife.model.gameOfLife.CellState
   * @generated
   */
  EEnum getCellState();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GameOfLifeFactory getGameOfLifeFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link gameOfLife.model.gameOfLife.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameOfLife.model.gameOfLife.impl.ModelImpl
     * @see gameOfLife.model.gameOfLife.impl.GameOfLifePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CELLS = eINSTANCE.getModel_Cells();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RULES = eINSTANCE.getModel_Rules();

    /**
     * The meta object literal for the '{@link gameOfLife.model.gameOfLife.impl.CellImpl <em>Cell</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameOfLife.model.gameOfLife.impl.CellImpl
     * @see gameOfLife.model.gameOfLife.impl.GameOfLifePackageImpl#getCell()
     * @generated
     */
    EClass CELL = eINSTANCE.getCell();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL__X = eINSTANCE.getCell_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL__Y = eINSTANCE.getCell_Y();

    /**
     * The meta object literal for the '<em><b>State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL__STATE = eINSTANCE.getCell_State();

    /**
     * The meta object literal for the '{@link gameOfLife.model.gameOfLife.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameOfLife.model.gameOfLife.impl.RuleImpl
     * @see gameOfLife.model.gameOfLife.impl.GameOfLifePackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__CONDITION = eINSTANCE.getRule_Condition();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__ACTION = eINSTANCE.getRule_Action();

    /**
     * The meta object literal for the '{@link gameOfLife.model.gameOfLife.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameOfLife.model.gameOfLife.impl.ConditionImpl
     * @see gameOfLife.model.gameOfLife.impl.GameOfLifePackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__OPERATOR = eINSTANCE.getCondition_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__VALUE = eINSTANCE.getCondition_Value();

    /**
     * The meta object literal for the '{@link gameOfLife.model.gameOfLife.CellState <em>Cell State</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gameOfLife.model.gameOfLife.CellState
     * @see gameOfLife.model.gameOfLife.impl.GameOfLifePackageImpl#getCellState()
     * @generated
     */
    EEnum CELL_STATE = eINSTANCE.getCellState();

  }

} //GameOfLifePackage
