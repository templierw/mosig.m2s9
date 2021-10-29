/**
 */
package multiGraphs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see multiGraphs.MultiGraphsFactory
 * @model kind="package"
 * @generated
 */
public interface MultiGraphsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "multiGraphs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/multiGraphs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "multiGraphs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MultiGraphsPackage eINSTANCE = multiGraphs.impl.MultiGraphsPackageImpl.init();

	/**
	 * The meta object id for the '{@link multiGraphs.impl.MultiGraphsImpl <em>Multi Graphs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multiGraphs.impl.MultiGraphsImpl
	 * @see multiGraphs.impl.MultiGraphsPackageImpl#getMultiGraphs()
	 * @generated
	 */
	int MULTI_GRAPHS = 0;

	/**
	 * The feature id for the '<em><b>MG Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GRAPHS__MG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GRAPHS__NODES = 1;

	/**
	 * The number of structural features of the '<em>Multi Graphs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GRAPHS_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Valider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GRAPHS___VALIDER = 0;

	/**
	 * The operation id for the '<em>Is Tree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GRAPHS___IS_TREE = 1;

	/**
	 * The operation id for the '<em>Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GRAPHS___PATH__STRING_STRING = 2;

	/**
	 * The number of operations of the '<em>Multi Graphs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GRAPHS_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link multiGraphs.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multiGraphs.impl.NodeImpl
	 * @see multiGraphs.impl.MultiGraphsPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>NName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NNAME = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link multiGraphs.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multiGraphs.impl.EdgeImpl
	 * @see multiGraphs.impl.MultiGraphsPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link multiGraphs.MultiGraphs <em>Multi Graphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Graphs</em>'.
	 * @see multiGraphs.MultiGraphs
	 * @generated
	 */
	EClass getMultiGraphs();

	/**
	 * Returns the meta object for the attribute '{@link multiGraphs.MultiGraphs#getMGName <em>MG Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MG Name</em>'.
	 * @see multiGraphs.MultiGraphs#getMGName()
	 * @see #getMultiGraphs()
	 * @generated
	 */
	EAttribute getMultiGraphs_MGName();

	/**
	 * Returns the meta object for the containment reference list '{@link multiGraphs.MultiGraphs#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see multiGraphs.MultiGraphs#getNodes()
	 * @see #getMultiGraphs()
	 * @generated
	 */
	EReference getMultiGraphs_Nodes();

	/**
	 * Returns the meta object for the '{@link multiGraphs.MultiGraphs#Valider() <em>Valider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valider</em>' operation.
	 * @see multiGraphs.MultiGraphs#Valider()
	 * @generated
	 */
	EOperation getMultiGraphs__Valider();

	/**
	 * Returns the meta object for the '{@link multiGraphs.MultiGraphs#isTree() <em>Is Tree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Tree</em>' operation.
	 * @see multiGraphs.MultiGraphs#isTree()
	 * @generated
	 */
	EOperation getMultiGraphs__IsTree();

	/**
	 * Returns the meta object for the '{@link multiGraphs.MultiGraphs#Path(java.lang.String, java.lang.String) <em>Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Path</em>' operation.
	 * @see multiGraphs.MultiGraphs#Path(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getMultiGraphs__Path__String_String();

	/**
	 * Returns the meta object for class '{@link multiGraphs.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see multiGraphs.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link multiGraphs.Node#getNName <em>NName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NName</em>'.
	 * @see multiGraphs.Node#getNName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_NName();

	/**
	 * Returns the meta object for the reference list '{@link multiGraphs.Node#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see multiGraphs.Node#getTarget()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Target();

	/**
	 * Returns the meta object for the reference list '{@link multiGraphs.Node#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see multiGraphs.Node#getSource()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Source();

	/**
	 * Returns the meta object for class '{@link multiGraphs.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see multiGraphs.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link multiGraphs.Edge#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see multiGraphs.Edge#getLabel()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Label();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MultiGraphsFactory getMultiGraphsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link multiGraphs.impl.MultiGraphsImpl <em>Multi Graphs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multiGraphs.impl.MultiGraphsImpl
		 * @see multiGraphs.impl.MultiGraphsPackageImpl#getMultiGraphs()
		 * @generated
		 */
		EClass MULTI_GRAPHS = eINSTANCE.getMultiGraphs();

		/**
		 * The meta object literal for the '<em><b>MG Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_GRAPHS__MG_NAME = eINSTANCE.getMultiGraphs_MGName();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_GRAPHS__NODES = eINSTANCE.getMultiGraphs_Nodes();

		/**
		 * The meta object literal for the '<em><b>Valider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTI_GRAPHS___VALIDER = eINSTANCE.getMultiGraphs__Valider();

		/**
		 * The meta object literal for the '<em><b>Is Tree</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTI_GRAPHS___IS_TREE = eINSTANCE.getMultiGraphs__IsTree();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTI_GRAPHS___PATH__STRING_STRING = eINSTANCE.getMultiGraphs__Path__String_String();

		/**
		 * The meta object literal for the '{@link multiGraphs.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multiGraphs.impl.NodeImpl
		 * @see multiGraphs.impl.MultiGraphsPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>NName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NNAME = eINSTANCE.getNode_NName();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TARGET = eINSTANCE.getNode_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SOURCE = eINSTANCE.getNode_Source();

		/**
		 * The meta object literal for the '{@link multiGraphs.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multiGraphs.impl.EdgeImpl
		 * @see multiGraphs.impl.MultiGraphsPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__LABEL = eINSTANCE.getEdge_Label();

	}

} //MultiGraphsPackage
