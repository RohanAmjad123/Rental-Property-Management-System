package control.controllers;

import presentation.guicomponents.*;
import datasource.companydatabase.*;
import business.usermodels.*;
import business.businesslogic.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 * Class DashboardController
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */
public class DashboardController implements Controller, ActionListener {
    private Frontend view;
    private CompanyDatabase model;

    public DashboardController(Frontend view, CompanyDatabase model) {
        this.view = view;
        this.model = model;

        view.getDashboard().getStartButton().addActionListener(this);
        view.getDashboard().getSignupButton().addActionListener(this);
        view.getDashboard().getSearchButton().addActionListener(this);
        view.getDashboard().getLoginButton().addActionListener(this);
        view.getDashboard().getLogoutButton().addActionListener(this);
        view.getDashboard().getManageSubscriptionButton().addActionListener(this);
        view.getDashboard().getRegisterPropertyButton().addActionListener(this);
        view.getDashboard().getManageMyPropertiesButton().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
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
        else if (e.getSource() == view.getDashboard().getSignupButton()) {
            view.signup();
        }
        else if (e.getSource() == view.getDashboard().getLoginButton()) {
            view.login();
            view.getLogin().userChoice();
        }
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
        else if (e.getSource() == view.getDashboard().getLogoutButton()) {
            SingletonLogin x = SingletonLogin.getInstance();
            x.logout();
            view.getDashboard().signedOut();
        }
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
        else if (e.getSource() == view.getDashboard().getRegisterPropertyButton()) {
            view.registerProperty();
        }
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
    }
}
