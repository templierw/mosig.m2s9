/**
 */
package multiGraphs.impl;

import java.util.Collection;

import multiGraphs.Edge;
import multiGraphs.MultiGraphsPackage;
import multiGraphs.Node;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link multiGraphs.impl.NodeImpl#getNName <em>NName</em>}</li>
 *   <li>{@link multiGraphs.impl.NodeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link multiGraphs.impl.NodeImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The default value of the '{@link #getNName() <em>NName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNName()
	 * @generated
	 * @ordered
	 */
	protected static final String NNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNName() <em>NName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNName()
	 * @generated
	 * @ordered
	 */
	protected String nName = NNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiGraphsPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNName() {
		return nName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNName(String newNName) {
		String oldNName = nName;
		nName = newNName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiGraphsPackage.NODE__NNAME, oldNName, nName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Edge>(Edge.class, this, MultiGraphsPackage.NODE__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<Edge>(Edge.class, this, MultiGraphsPackage.NODE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MultiGraphsPackage.NODE__NNAME:
			return getNName();
		case MultiGraphsPackage.NODE__TARGET:
			return getTarget();
		case MultiGraphsPackage.NODE__SOURCE:
			return getSource();
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
		case MultiGraphsPackage.NODE__NNAME:
			setNName((String) newValue);
			return;
		case MultiGraphsPackage.NODE__TARGET:
			getTarget().clear();
			getTarget().addAll((Collection<? extends Edge>) newValue);
			return;
		case MultiGraphsPackage.NODE__SOURCE:
			getSource().clear();
			getSource().addAll((Collection<? extends Edge>) newValue);
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
		case MultiGraphsPackage.NODE__NNAME:
			setNName(NNAME_EDEFAULT);
			return;
		case MultiGraphsPackage.NODE__TARGET:
			getTarget().clear();
			return;
		case MultiGraphsPackage.NODE__SOURCE:
			getSource().clear();
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
		case MultiGraphsPackage.NODE__NNAME:
			return NNAME_EDEFAULT == null ? nName != null : !NNAME_EDEFAULT.equals(nName);
		case MultiGraphsPackage.NODE__TARGET:
			return target != null && !target.isEmpty();
		case MultiGraphsPackage.NODE__SOURCE:
			return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (NName: ");
		result.append(nName);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
