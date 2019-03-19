/**
 */
package org.lpdql.automation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.automation.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link org.lpdql.automation.Transition#getActions <em>Actions</em>}</li>
 *   <li>{@link org.lpdql.automation.Transition#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.lpdql.automation.Transition#getDisnation <em>Disnation</em>}</li>
 * </ul>
 *
 * @see org.lpdql.automation.AutomationPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Input)
	 * @see org.lpdql.automation.AutomationPackage#getTransition_Event()
	 * @model
	 * @generated
	 */
	Input getEvent();

	/**
	 * Sets the value of the '{@link org.lpdql.automation.Transition#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Input value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link org.lpdql.automation.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see org.lpdql.automation.AutomationPackage#getTransition_Actions()
	 * @model
	 * @generated
	 */
	EList<Output> getActions();

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(State)
	 * @see org.lpdql.automation.AutomationPackage#getTransition_Origin()
	 * @model
	 * @generated
	 */
	State getOrigin();

	/**
	 * Sets the value of the '{@link org.lpdql.automation.Transition#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(State value);

	/**
	 * Returns the value of the '<em><b>Disnation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disnation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disnation</em>' reference.
	 * @see #setDisnation(State)
	 * @see org.lpdql.automation.AutomationPackage#getTransition_Disnation()
	 * @model
	 * @generated
	 */
	State getDisnation();

	/**
	 * Sets the value of the '{@link org.lpdql.automation.Transition#getDisnation <em>Disnation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disnation</em>' reference.
	 * @see #getDisnation()
	 * @generated
	 */
	void setDisnation(State value);

} // Transition
