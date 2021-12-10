package control.controllers;

import presentation.guicomponents.*;
import datasource.companydatabase.*;
import business.usermodels.*;
import business.businesslogic.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.sql.SQLException;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**
 * Class DashboardController
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */

/**
 *Controller Class for Dashboard
 *implements the controller class
 *implements the ActionListener class
 *used to link model to view through the actions and components of the Dashboard (basically the main menu of the software)
 */
public class DashboardController implements Controller, ActionListener, MouseListener {
    private Frontend view;
    private CompanyDatabase model;
  
    /**
     * Dashboard Controller class constructor
     * executes as soon as an instance of this class is created
     * Action Listeners are binded to the different buttons in the different panes
     * They will perform different functions on-click, specifically being able to: 
     * logout/login, look at properties, etc.
     * Depending on what type of user is using the software, their dashboard will be different and customized to their needs
     * @param view is the Frontend instance that all gui components are pulled from
     * @param model is the Company Database instance with the data and the required information for the backend
     */
    public DashboardController(Frontend view, CompanyDatabase model) {
        this.view = view;
        this.model = model;

        //binding all buttons on dashboard with Action Listener
        view.getDashboard().getStartButton().addActionListener(this);
        view.getDashboard().getSignupButton().addActionListener(this);
        view.getDashboard().getSearchButton().addActionListener(this);
        view.getDashboard().getLoginButton().addActionListener(this);
        view.getDashboard().getLogoutButton().addActionListener(this);
        view.getDashboard().getManageSubscriptionButton().addActionListener(this);
        view.getDashboard().getRegisterPropertyButton().addActionListener(this);
        view.getDashboard().getManageMyPropertiesButton().addActionListener(this);
        view.getDashboard().getManageAllPropertiesButton().addActionListener(this);
        view.getDashboard().getChangeFeesButton().addActionListener(this);
        view.getDashboard().getViewCompanyDatabaseButton().addActionListener(this);
        view.getDashboard().getGenerateSummaryReportButton().addActionListener(this);
        view.getDashboard().getPropertyList().addMouseListener(this);
    }

    
    /**
     * Action Performed method with no return type
     * executes in response to something triggereing the ActionListener
     * in this case, it can be any of the buttons binded with action listeners
     * this method decides what action to take based off of which button was clicked
     * main functionalities e.g transitioning to different panels depending on what type of user is using it etc.
     * @param e is the instance of the ActionEvent object which is the action event that triggers the ActionListener requiring handling
     */
    public void actionPerformed(ActionEvent e) {
    	
    	//if start button is clicked
        if (e.getSource() == view.getDashboard().getStartButton()) {
            ArrayList<Property> activeProperties = new ArrayList<Property>();

            try {
                activeProperties = model.getStateProperties("active");
            }
            catch (SQLException exception) {
                exception.printStackTrace();
                System.exit(1);
            }

            view.getDashboard().updatePropertiesView(activeProperties);
            
            view.getDashboard().signedOut();
        }
        
        //if sign up button is clicked
        else if (e.getSource() == view.getDashboard().getSignupButton()) {
            view.signup();
        }
        //if login button is clicked
        else if (e.getSource() == view.getDashboard().getLoginButton()) {
            view.login();
            view.getLogin().userChoice();
        }
        
        //if search button is clicked
        else if (e.getSource() == view.getDashboard().getSearchButton()) {
            String propertyType = "";
            int bedrooms = 0;
            int bathrooms = 0;
            String furnished = "";
            int maxRent = 0;
            String cityQuadrant = "";

            ArrayList<Property> searchProperties = new ArrayList<Property>();

            try {
                propertyType = view.getDashboard().getPropertyTypeComboBox().getSelectedItem().toString();
                String bedroomsString = view.getDashboard().getBedroomSpinner().getValue().toString();
                String bathroomsString = view.getDashboard().getBathroomSpinner().getValue().toString();
                furnished = view.getDashboard().getFurnishedComboBox().getSelectedItem().toString();
                String maxRentString = view.getDashboard().getMaxRentText().getText();
                cityQuadrant = view.getDashboard().getCityQuadrantComboBox().getSelectedItem().toString();
                
                bedrooms = Integer.parseInt(bedroomsString);
                bathrooms = Integer.parseInt(bathroomsString);
                maxRent = Integer.parseInt(maxRentString);
                
            }
            catch (NullPointerException exception) {
                exception.printStackTrace();
            }
            catch (NumberFormatException exception) {
                exception.printStackTrace();
                maxRent = Integer.MAX_VALUE;
            }

            SearchCriteria s = new SearchCriteria(propertyType, bedrooms, bathrooms, maxRent, cityQuadrant, furnished);

            try {
                searchProperties = model.getSearchProperties(s);
            }
            catch (SQLException exception) {
                exception.printStackTrace();
            }

            view.getDashboard().updatePropertiesView(searchProperties);

            SingletonLogin x = SingletonLogin.getInstance();
            User u = x.getCurrentUser();

            if (u==null) {
                view.getDashboard().signedOut();
            }
            else if (u.getUserType().equals("renter")) {
                view.getDashboard().loggedInRenter();
            }
            else if (u.getUserType().equals("landlord")) {
                view.getDashboard().loggedInLandlord();
            }
            else if (u.getUserType().equals("manager")) {
                view.getDashboard().loggedInManager();
            }
        }
        
        //if logout button is clicked
        else if (e.getSource() == view.getDashboard().getLogoutButton()) {
            SingletonLogin x = SingletonLogin.getInstance();
            x.logout();
            view.getDashboard().signedOut();
        }
        
        //if manage subscription button is clicked
        else if (e.getSource() == view.getDashboard().getManageSubscriptionButton()) {
            SearchCriteria s = new SearchCriteria();
            
            try {
                s = model.getSubscription(SingletonLogin.getInstance().getCurrentUser().getEmail());

                if (s.getRenterID().equals("")) {
                    view.getManageSubscriptions().deleteSubscription();
                }
                else {
                    view.getManageSubscriptions().updateSubscriptionView(s);
                }

                view.manageSubscriptions();
            }
            catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
        
        //if register property button is clicked
        else if (e.getSource() == view.getDashboard().getRegisterPropertyButton()) {
            view.registerProperty();
            view.getRegisterProperty().registrationForm();
        }
        
        //if manage my properties button is clicked
        else if (e.getSource() == view.getDashboard().getManageMyPropertiesButton()) {
            ArrayList<Property> p = new ArrayList<Property>();
            
            try {
                p = model.getProperties(SingletonLogin.getInstance().getCurrentUser().getEmail());

                view.getManageLandlordProperties().updatePropertiesView(p);
                
                view.manageLandlordProperties();
            }
            catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
        
      //if manage all properties button is clicked
        else if (e.getSource() == view.getDashboard().getManageAllPropertiesButton()) {
            ArrayList<Property> p = new ArrayList<Property>();
            
            try {
                p = model.getAllProperties();

                view.getManageManagerProperties().updatePropertiesView(p);
                
                view.manageManagerProperties();
            }
            catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
        
        //if change fees button is clicked
        else if (e.getSource() == view.getDashboard().getChangeFeesButton()) {
            view.changeFees();
        }
        
      //if view company Database button is clicked
        else if (e.getSource() == view.getDashboard().getViewCompanyDatabaseButton()) {
            view.viewCompanyDatabase();
        }
        
      //if Generate Summary Report button is clicked
        else if (e.getSource() == view.getDashboard().getGenerateSummaryReportButton()) {
            view.periodicalReportForm();
        }
    }

    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            int index = view.getDashboard().getPropertyList().locationToIndex(e.getPoint());

            Property p = view.getDashboard().getPropertyList().getModel().getElementAt(index);
            
            view.getPropertyView().updatePropertyView(p);

            view.propertyView();
            view.getPropertyView().propertyView();
        }
    }

    public void mouseExited(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
}
