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
                view.getDashboard().loggedInRenter();
            }
            else if (u.getUserType().equals("manager")) {
                view.getDashboard().loggedInManager();
            }
        }
    }
}
