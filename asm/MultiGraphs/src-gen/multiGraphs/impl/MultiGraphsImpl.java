/**
 */
package multiGraphs.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.LinkedList;
import multiGraphs.Edge;
import multiGraphs.MultiGraphs;
import multiGraphs.MultiGraphsPackage;
import multiGraphs.Node;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Graphs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link multiGraphs.impl.MultiGraphsImpl#getMGName <em>MG Name</em>}</li>
 *   <li>{@link multiGraphs.impl.MultiGraphsImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link multiGraphs.impl.MultiGraphsImpl#getEdge <em>Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiGraphsImpl extends MinimalEObjectImpl.Container implements MultiGraphs {
	/**
	 * The default value of the '{@link #getMGName() <em>MG Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMGName()
	 * @generated
	 * @ordered
	 */
	protected static final String MG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMGName() <em>MG Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMGName()
	 * @generated
	 * @ordered
	 */
	protected String mgName = MG_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiGraphsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiGraphsPackage.Literals.MULTI_GRAPHS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMGName() {
		return mgName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMGName(String newMGName) {
		String oldMGName = mgName;
		mgName = newMGName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiGraphsPackage.MULTI_GRAPHS__MG_NAME, oldMGName,
					mgName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, MultiGraphsPackage.MULTI_GRAPHS__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdge() {
		if (edge == null) {
			edge = new EObjectContainmentEList<Edge>(Edge.class, this, MultiGraphsPackage.MULTI_GRAPHS__EDGE);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean Valider() {
		LinkedList<String> nname = new LinkedList<>();
		for(Node n : this.getNodes()) {
			String name = n.getNName();
			if (nname.contains(name)) {
				System.out.println("Node name: " + name + " is defined several times.");
				return false;
			
			} else nname.add(name);
		}
		LinkedList<String> labels = new LinkedList<>();
		for(Edge e : this.getEdge()) {
			String label = e.getLabel();
			if (labels.contains(label)) {
				System.out.println("Edge label: " + label + " is defined several times.");
				return false;
			
			} else labels.add(label);
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTree() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void Path(String node1, String node2) {
		Node n1 = null, n2 = null;
		for(Node n : this.getNodes()) {
			if(n.getNName().equals(node1)) n1 = n;
			else if (n.getNName().equals(node2)) n2 = n;
		}
		if(n1.equals(null) || n2.equals(null)) return;
		EList<Node> r = this.getReachableNodes(n1);
		this.recPath(n1, n2, "",r);
		System.out.println();
	}
	
	private void recPath(Node start, Node end, String path, EList<Node> reachable) {
		
		if (reachable.isEmpty()) return;
		
		if (reachable.contains(end)) {
			System.out.println(path + this.printEdgeLabel(start, end));
			return;
		}
		
		for(Node n : reachable) {
			this.recPath(n, end, path+this.printEdgeLabel(start, n)+":", this.getReachableNodes(n));
		}
		
	}
	
	private EList<Node> getReachableNodes(Node current) {
		EList<Node> reachable = new BasicEList<>();
		
		for(Edge e : current.getTarget()) {
			for(Node n : this.getNodes()) {
				if (n.getSource().contains(e)) reachable.add(n);
			}
		}
		
		return reachable;
	}
	
	private String printEdgeLabel(Node n1, Node n2) {
		String path = null;
		
		for(Edge e : n1.getTarget()) {
			if(n2.getSource().contains(e))
				path = e.getLabel();
		}
		
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MultiGraphsPackage.MULTI_GRAPHS__NODES:
			return ((InternalEList<?>) getNodes()).basicRemove(otherEnd, msgs);
		case MultiGraphsPackage.MULTI_GRAPHS__EDGE:
			return ((InternalEList<?>) getEdge()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MultiGraphsPackage.MULTI_GRAPHS__MG_NAME:
			return getMGName();
		case MultiGraphsPackage.MULTI_GRAPHS__NODES:
			return getNodes();
		case MultiGraphsPackage.MULTI_GRAPHS__EDGE:
			return getEdge();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MultiGraphsPackage.MULTI_GRAPHS__MG_NAME:
			setMGName((String) newValue);
			return;
		case MultiGraphsPackage.MULTI_GRAPHS__NODES:
			getNodes().clear();
			getNodes().addAll((Collection<? extends Node>) newValue);
			return;
		case MultiGraphsPackage.MULTI_GRAPHS__EDGE:
			getEdge().clear();
			getEdge().addAll((Collection<? extends Edge>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MultiGraphsPackage.MULTI_GRAPHS__MG_NAME:
			setMGName(MG_NAME_EDEFAULT);
			return;
		case MultiGraphsPackage.MULTI_GRAPHS__NODES:
			getNodes().clear();
			return;
		case MultiGraphsPackage.MULTI_GRAPHS__EDGE:
			getEdge().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MultiGraphsPackage.MULTI_GRAPHS__MG_NAME:
			return MG_NAME_EDEFAULT == null ? mgName != null : !MG_NAME_EDEFAULT.equals(mgName);
		case MultiGraphsPackage.MULTI_GRAPHS__NODES:
			return nodes != null && !nodes.isEmpty();
		case MultiGraphsPackage.MULTI_GRAPHS__EDGE:
			return edge != null && !edge.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MultiGraphsPackage.MULTI_GRAPHS___VALIDER:
			return Valider();
		case MultiGraphsPackage.MULTI_GRAPHS___IS_TREE:
			return isTree();
		case MultiGraphsPackage.MULTI_GRAPHS___PATH__STRING_STRING:
			Path((String) arguments.get(0), (String) arguments.get(1));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (MGName: ");
		result.append(mgName);
		result.append(')');
		return result.toString();
	}

} //MultiGraphsImpl
