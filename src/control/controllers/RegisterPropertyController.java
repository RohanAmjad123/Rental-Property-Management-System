package control.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import presentation.guicomponents.*;
import datasource.companydatabase.*;
import business.businesslogic.*;
import business.usermodels.*;
import java.time.LocalDate;
import java.sql.SQLException;
/**
 * Class RegisterPropertyController
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */
public class RegisterPropertyController implements Controller, ActionListener {
    Frontend view;
    CompanyDatabase model;

    public RegisterPropertyController(Frontend view, CompanyDatabase model) {
        this.view = view;
        this.model = model;

        view.getRegisterProperty().getRegisterPropertyButton().addActionListener(this);
        view.getRegisterProperty().getDashboardButton().addActionListener(this);
        view.getRegisterProperty().getTryAgainButton().addActionListener(this);
        view.getRegisterProperty().getFinishButton().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getRegisterProperty().getDashboardButton()) {
            view.dashboard();
            view.getDashboard().loggedInLandlord();
        }
        else if (e.getSource() == view.getRegisterProperty().getFinishButton()) {
            view.dashboard();
            view.getDashboard().loggedInLandlord();
        }
        else if (e.getSource() == view.getRegisterProperty().getTryAgainButton()) {
            view.getRegisterProperty().registrationForm();
        }
        else if (e.getSource() == view.getRegisterProperty().getRegisterPropertyButton()) {
            String title = "";
            String description = "";
            String propertyType = "";
            int rent = 0;
            int bedrooms = 0;
            int bathrooms = 0;
            int squareFeet = 0;
            String furnished = "";
            String landlordID = "";
            String state = "inactive";
            DateModel feeExpiry = new DateModel();
            int feeAmount = 0;
            LocalDate d = LocalDate.now();
            String day = String.valueOf(d.getDayOfMonth());
            String month = String.valueOf(d.getMonthValue());
            String year = String.valueOf(d.getYear());
            DateModel listingDate = new DateModel(year, month, day);
            
            String streetName = "";
            String postalCode = "";
            String cityQuadrant = "";
            String city = "";
            String stateProvince = "";
            String country = "";
            Address address = new Address();

            try {
                title = view.getRegisterProperty().getTitleText().getText();
                description = view.getRegisterProperty().getDescriptionText().getText();
                propertyType = view.getRegisterProperty().getPropertyTypeComboBox().getSelectedItem().toString();
                String rentString = view.getRegisterProperty().getRentText().getText();
                String bedroomsString = view.getRegisterProperty().getBedroomSpinner().getValue().toString();
                String bathroomsString = view.getRegisterProperty().getBathroomSpinner().getValue().toString();
                String squareFeetString = view.getRegisterProperty().getSquareFeetText().getText();
                furnished = view.getRegisterProperty().getFurnishedComboBox().getSelectedItem().toString();
                streetName = view.getRegisterProperty().getStreetNameText().getText();
                postalCode = view.getRegisterProperty().getPostalCodeText().getText();
                cityQuadrant = view.getRegisterProperty().getCityQuadrantComboBox().getSelectedItem().toString();
                city = view.getRegisterProperty().getCityText().getText();
                stateProvince = view.getRegisterProperty().getProvinceStateText().getText();
                country = view.getRegisterProperty().getCountryText().getText();

                rent = Integer.parseInt(rentString);
                bedrooms = Integer.parseInt(bedroomsString);
                bathrooms = Integer.parseInt(bathroomsString);
                squareFeet = Integer.parseInt(squareFeetString);
            }
            catch(NullPointerException exception) {
                exception.printStackTrace();
                view.getRegisterProperty().errorPage();
            }
            catch(NumberFormatException exception) {
                exception.printStackTrace();
                view.getRegisterProperty().errorPage();
            }

            try {
                SingletonLogin x = SingletonLogin.getInstance();
                User u = x.getCurrentUser();
                if (u==null) {
                    throw new NullPointerException("Fatal System Error Aborting!");
                }
                landlordID = u.getEmail();

                address = new Address(streetName, postalCode, cityQuadrant, city, stateProvince, country);
            }
            catch (NullPointerException exception) {
                exception.printStackTrace();
                System.exit(1);
            }
            catch (IllegalArgumentException exception) {
                exception.printStackTrace();
                view.getRegisterProperty().errorPage();
            }

            try {
                Property p = new Property(title, description, propertyType, rent, bedrooms, bathrooms, squareFeet, furnished, landlordID, state, feeExpiry, feeAmount, listingDate, address);
                
                model.registerProperty(p);
                view.getRegisterProperty().successPage();
            }
            catch (SQLException exception) {
                exception.printStackTrace();
                view.getRegisterProperty().errorPage();
            }
        }
    }
}
