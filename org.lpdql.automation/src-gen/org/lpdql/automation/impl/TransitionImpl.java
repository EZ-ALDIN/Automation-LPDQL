/**
 */
package org.lpdql.automation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.lpdql.automation.AutomationPackage;
import org.lpdql.automation.Input;
import org.lpdql.automation.Output;
import org.lpdql.automation.State;
import org.lpdql.automation.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.automation.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lpdql.automation.impl.TransitionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.lpdql.automation.impl.TransitionImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.lpdql.automation.impl.TransitionImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.lpdql.automation.impl.TransitionImpl#getDisnation <em>Disnation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Input event;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> actions;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected State origin;

	/**
	 * The cached value of the '{@link #getDisnation() <em>Disnation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisnation()
	 * @generated
	 * @ordered
	 */
	protected State disnation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutomationPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomationPackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject) event;
			event = (Input) eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutomationPackage.TRANSITION__EVENT,
							oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Input newEvent) {
		Input oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomationPackage.TRANSITION__EVENT, oldEvent,
					event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<Output>(Output.class, this, AutomationPackage.TRANSITION__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject) origin;
			origin = (State) eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutomationPackage.TRANSITION__ORIGIN,
							oldOrigin, origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(State newOrigin) {
		State oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomationPackage.TRANSITION__ORIGIN, oldOrigin,
					origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getDisnation() {
		if (disnation != null && disnation.eIsProxy()) {
			InternalEObject oldDisnation = (InternalEObject) disnation;
			disnation = (State) eResolveProxy(oldDisnation);
			if (disnation != oldDisnation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutomationPackage.TRANSITION__DISNATION,
							oldDisnation, disnation));
			}
		}
		return disnation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetDisnation() {
		return disnation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisnation(State newDisnation) {
		State oldDisnation = disnation;
		disnation = newDisnation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomationPackage.TRANSITION__DISNATION, oldDisnation,
					disnation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutomationPackage.TRANSITION__NAME:
			return getName();
		case AutomationPackage.TRANSITION__EVENT:
			if (resolve)
				return getEvent();
			return basicGetEvent();
		case AutomationPackage.TRANSITION__ACTIONS:
			return getActions();
		case AutomationPackage.TRANSITION__ORIGIN:
			if (resolve)
				return getOrigin();
			return basicGetOrigin();
		case AutomationPackage.TRANSITION__DISNATION:
			if (resolve)
				return getDisnation();
			return basicGetDisnation();
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
		case AutomationPackage.TRANSITION__NAME:
			setName((String) newValue);
			return;
		case AutomationPackage.TRANSITION__EVENT:
			setEvent((Input) newValue);
			return;
		case AutomationPackage.TRANSITION__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Output>) newValue);
			return;
		case AutomationPackage.TRANSITION__ORIGIN:
			setOrigin((State) newValue);
			return;
		case AutomationPackage.TRANSITION__DISNATION:
			setDisnation((State) newValue);
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
		case AutomationPackage.TRANSITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AutomationPackage.TRANSITION__EVENT:
			setEvent((Input) null);
			return;
		case AutomationPackage.TRANSITION__ACTIONS:
			getActions().clear();
			return;
		case AutomationPackage.TRANSITION__ORIGIN:
			setOrigin((State) null);
			return;
		case AutomationPackage.TRANSITION__DISNATION:
			setDisnation((State) null);
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
		case AutomationPackage.TRANSITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AutomationPackage.TRANSITION__EVENT:
			return event != null;
		case AutomationPackage.TRANSITION__ACTIONS:
			return actions != null && !actions.isEmpty();
		case AutomationPackage.TRANSITION__ORIGIN:
			return origin != null;
		case AutomationPackage.TRANSITION__DISNATION:
			return disnation != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
