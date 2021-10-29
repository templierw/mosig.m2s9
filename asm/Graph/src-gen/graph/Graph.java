/**
 */
package graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.Graph#getTheNodes <em>The Nodes</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>The Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link graph.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Nodes</em>' containment reference list.
	 * @see graph.GraphPackage#getGraph_TheNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getTheNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean Validate();

} // Graph
