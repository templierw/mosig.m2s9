/**
 */
package multiGraphs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link multiGraphs.Node#getNName <em>NName</em>}</li>
 *   <li>{@link multiGraphs.Node#getTarget <em>Target</em>}</li>
 *   <li>{@link multiGraphs.Node#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see multiGraphs.MultiGraphsPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>NName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NName</em>' attribute.
	 * @see #setNName(String)
	 * @see multiGraphs.MultiGraphsPackage#getNode_NName()
	 * @model
	 * @generated
	 */
	String getNName();

	/**
	 * Sets the value of the '{@link multiGraphs.Node#getNName <em>NName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NName</em>' attribute.
	 * @see #getNName()
	 * @generated
	 */
	void setNName(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link multiGraphs.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see multiGraphs.MultiGraphsPackage#getNode_Target()
	 * @model
	 * @generated
	 */
	EList<Edge> getTarget();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link multiGraphs.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see multiGraphs.MultiGraphsPackage#getNode_Source()
	 * @model
	 * @generated
	 */
	EList<Edge> getSource();

} // Node
