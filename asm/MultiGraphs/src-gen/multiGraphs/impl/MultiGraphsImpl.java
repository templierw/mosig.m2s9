/**
 */
package multiGraphs.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import multiGraphs.Edge;
import multiGraphs.MultiGraphs;
import multiGraphs.MultiGraphsPackage;
import multiGraphs.Node;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
	 * @generated NOT
	 */
	public boolean Valider() {
		EList<Node> nodes = this.getNodes();
		String Name1, Name2;
		for(int i = 0 ; i < nodes.size() ; i++){
			Name1 = (nodes.get(i)).getNName();
			for(int j = 0 ; j < nodes.size() ; j++){
				Name2 = (nodes.get(j)).getNName();
				if((i != j) && Name1.equals(Name2)) {
					System.out.println("Node name: " + Name1 + " is defined several times.");
					return false ;
				}
			}
		}
		for(Node n1: nodes){
			EList<Edge> source = n1.getSource();
			for(Node n2: nodes){
				for(Edge e1: source) {
					for(Edge e2: n2.getSource()) {
						if(e1.getLabel().equals(e2.getLabel()) &&
						   !e1.equals(e2)) {
							System.out.println("Node name: " + e1.getLabel() + " is defined several times.");
							return false ;
						}
					}
				}
			}
		}
		return true ;
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
	 * @generated
	 */
	public void Path(String node1, String node2) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
