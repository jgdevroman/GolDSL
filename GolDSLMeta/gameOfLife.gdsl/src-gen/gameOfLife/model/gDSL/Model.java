/**
 * generated by Xtext 2.37.0
 */
package gameOfLife.model.gDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gameOfLife.model.gDSL.Model#getGrid <em>Grid</em>}</li>
 *   <li>{@link gameOfLife.model.gDSL.Model#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see gameOfLife.model.gDSL.GDSLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Grid</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grid</em>' containment reference.
   * @see #setGrid(Grid)
   * @see gameOfLife.model.gDSL.GDSLPackage#getModel_Grid()
   * @model containment="true"
   * @generated
   */
  Grid getGrid();

  /**
   * Sets the value of the '{@link gameOfLife.model.gDSL.Model#getGrid <em>Grid</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Grid</em>' containment reference.
   * @see #getGrid()
   * @generated
   */
  void setGrid(Grid value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link gameOfLife.model.gDSL.Rule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see gameOfLife.model.gDSL.GDSLPackage#getModel_Rules()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRules();

} // Model
