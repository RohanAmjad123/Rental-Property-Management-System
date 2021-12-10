package control.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import presentation.guicomponents.*;
import datasource.companydatabase.*;
import business.businesslogic.*;
import java.sql.SQLException;

/**
 * Class SubscriptionController
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */

/**
 * Controller Class for Subscription
 * implements the controller class
 * implements the ActionListener class
 * used to link model to view through the actions and components of the
 * Subscription and search Criteria
 */
public class SubscriptionController implements Controller, ActionListener {
    // private data members to hold the model and view objects
    private Frontend view;
    private CompanyDatabase model;

    /**
     * Subscription Controller class constructor
     * executes as soon as an instance of this class is created
     * Action Listeners are binded to the different buttons in the different panes
     * They will perform different functions on-click accessible to subscribed
     * renters, specifically being able to:
     * Update criteria, unsubscribe, and exit to dashboard
     * Editing of specific criteria is also available, where renter can specify
     * things such as: property type, # of bedrooms, etc.
     * 
     * @param view  is the Frontend instance that all gui components are pulled from
     * @param model is the Company Database instance with the data and the required
     *              information for the backend
     */
    public SubscriptionController(Frontend view, CompanyDatabase model) {
        // setting the data members of the view and model
        this.view = view;
        this.model = model;

        // binding buttons on Manage Renter Subscription start page to action listeners
        view.getManageSubscriptions().getEditButton().addActionListener(this);
        view.getManageSubscriptions().getDashboardButton().addActionListener(this);

        // binding buttons on Edit Renter Subscription page to action listeners
        view.getEditSearchCriteriaForm().getDashboardButton().addActionListener(this);
        view.getEditSearchCriteriaForm().getUnsubscribeButton().addActionListener(this);
        view.getEditSearchCriteriaForm().getUpdateButton().addActionListener(this);

    }

    /**
     * Action Performed method with no return type
     * executes in response to something triggereing the ActionListener
     * in this case, it can be any of the buttons binded with action listeners
     * this method decides what action to take based off of which button in any of
     * our panels was clicked
     * main functionalities e.g transitioning to the edit panel, updating criteria,
     * etc.
     * 
     * @param e is the instance of the ActionEvent object which is the action event
     *          that triggers the ActionListener requiring handling
     */
    public void actionPerformed(ActionEvent e) {
        // if the edit button is pressed
        if (e.getSource() == view.getManageSubscriptions().getEditButton()) {
            // switches the panel to the editing of the subscription
            view.editSearchCriteriaForm();
        }
        // if unsubscribe button is pressed
        else if (e.getSource() == view.getEditSearchCriteriaForm().getUnsubscribeButton()) {
            try {
                model.unsubscribe(SingletonLogin.getInstance().getCurrentUser().getEmail());
                view.dashboard();
                view.getDashboard().loggedInRenter();
            }
            catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
        /// if update button is pressed
        else if (e.getSource() == view.getEditSearchCriteriaForm().getUpdateButton()) {
            // all local variables to store the criteria selected by the subscribed renter
            // so it can be used to update the search criteria
            String renterID = SingletonLogin.getInstance().getCurrentUser().getEmail();
            String propertyType = "";
            int bedrooms = 0;
            int bathrooms = 0;
            int maxRent = Integer.MAX_VALUE;
            String furnished = "";
            String cityQuadrant = "";

            // user input sensitive so try catch allows us to catch any null pointer
            // exception
            try {
                // assigning all local variables, corresponding values from criteria of
                // registered renter
                propertyType = view.getEditSearchCriteriaForm().getPropertyTypeComboBox().getSelectedItem().toString();
                String bedroomsString = view.getEditSearchCriteriaForm().getBedroomSpinner().getValue().toString();
                String bathroomsString = view.getEditSearchCriteriaForm().getBathroomSpinner().getValue().toString();
                String maxRentString = view.getEditSearchCriteriaForm().getMaxRentText().getText();
                furnished = view.getEditSearchCriteriaForm().getFurnishedComboBox().getSelectedItem().toString();
                cityQuadrant = view.getEditSearchCriteriaForm().getCityQuadrantComboBox().getSelectedItem().toString();

                bedrooms = Integer.parseInt(bedroomsString);
                bathrooms = Integer.parseInt(bathroomsString);
                maxRent = Integer.parseInt(maxRentString);

            } catch (NullPointerException exception) {
                exception.printStackTrace();
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
            }

            SearchCriteria s = new SearchCriteria();

            try {
                s = model.getSubscription(renterID);
            } catch (SQLException exception) {
                exception.printStackTrace();
            }

            if (s.getRenterID().equals("")) {
                SearchCriteria subscribeCriteria = new SearchCriteria(renterID, propertyType, bedrooms, bathrooms, maxRent,
                        cityQuadrant, furnished);
                try {
                    model.subscribe(subscribeCriteria);
                    view.dashboard();
                    view.getDashboard().loggedInRenter();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            } else {
                SearchCriteria updateSearch = new SearchCriteria(renterID, propertyType, bedrooms, bathrooms, maxRent,
                        cityQuadrant, furnished);
                try {
                    model.updateSearchCriteria(updateSearch);
                    view.dashboard();
                    view.getDashboard().loggedInRenter();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }

        }
        // if 'x' (exit to dashboard) button is pressed on either page
        else if (e.getSource() == view.getManageSubscriptions().getDashboardButton()
                || e.getSource() == view.getEditSearchCriteriaForm().getDashboardButton()) {
            // required because we are switching GUIs
            // puts up the dashboard panel
            view.dashboard();
            // fills it with the corresponding buttons and components for renter because the
            // renter is logged in and this is renter funcitonality
            view.getDashboard().loggedInRenter();
        }
    }

}
