/**
 * generated by Xtext 2.25.0
 */
package asmae.form.form;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asmae.form.form.choice#getLesChoix <em>Les Choix</em>}</li>
 * </ul>
 *
 * @see asmae.form.form.FormPackage#getchoice()
 * @model
 * @generated
 */
public interface choice extends Kind
{
  /**
   * Returns the value of the '<em><b>Les Choix</b></em>' containment reference list.
   * The list contents are of type {@link asmae.form.form.check}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Les Choix</em>' containment reference list.
   * @see asmae.form.form.FormPackage#getchoice_LesChoix()
   * @model containment="true"
   * @generated
   */
  EList<check> getLesChoix();

} // choice
