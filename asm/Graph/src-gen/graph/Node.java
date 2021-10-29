/**
 */
package graph;

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
 *   <li>{@link graph.Node#getName <em>Name</em>}</li>
 *   <li>{@link graph.Node#getNext <em>Next</em>}</li>
 *   <li>{@link graph.Node#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see graph.GraphPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link graph.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link graph.Node}.
	 * It is bidirectional and its opposite is '{@link graph.Node#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see graph.GraphPackage#getNode_Next()
	 * @see graph.Node#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	EList<Node> getNext();

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference list.
	 * The list contents are of type {@link graph.Node}.
	 * It is bidirectional and its opposite is '{@link graph.Node#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference list.
	 * @see graph.GraphPackage#getNode_Previous()
	 * @see graph.Node#getNext
	 * @model opposite="next"
	 * @generated
	 */
	EList<Node> getPrevious();

} // Node
