/**
 */
package multiGraphs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Graphs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link multiGraphs.MultiGraphs#getMGName <em>MG Name</em>}</li>
 *   <li>{@link multiGraphs.MultiGraphs#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see multiGraphs.MultiGraphsPackage#getMultiGraphs()
 * @model
 * @generated
 */
public interface MultiGraphs extends EObject {
	/**
	 * Returns the value of the '<em><b>MG Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MG Name</em>' attribute.
	 * @see #setMGName(String)
	 * @see multiGraphs.MultiGraphsPackage#getMultiGraphs_MGName()
	 * @model
	 * @generated
	 */
	String getMGName();

	/**
	 * Sets the value of the '{@link multiGraphs.MultiGraphs#getMGName <em>MG Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MG Name</em>' attribute.
	 * @see #getMGName()
	 * @generated
	 */
	void setMGName(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link multiGraphs.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see multiGraphs.MultiGraphsPackage#getMultiGraphs_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean Valider();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isTree();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Path(String node1, String node2);

} // MultiGraphs
