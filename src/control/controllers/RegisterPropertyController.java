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


/**
 *Controller Class for Register Property
 *implements the Controller class
 *implements the ActionListener class
 *used to link model to view through the actions and components of the process of Registering a Property
 */
public class RegisterPropertyController implements Controller, ActionListener {
    Frontend view;
    CompanyDatabase model;
    
    /**
     * Register Property Controller class constructor
     * executes as soon as an instance of this class is created
     * Action Listeners are binded to the different buttons in the different panes
     * They will perform different functions on-click, specifically being able to: 
     * register property, try again, finish, and exit to dashboard
     * landlord only has access to this functionality
     * @param view is the Frontend instance that all gui components are pulled from
     * @param model is the Company Database instance with the data and the required information for the backend used to connect to SQL database
     */
    public RegisterPropertyController(Frontend view, CompanyDatabase model) {
        this.view = view;
        this.model = model;

        //relevant buttons in gui binded with action listeners
        view.getRegisterProperty().getRegisterPropertyButton().addActionListener(this);
        view.getRegisterProperty().getDashboardButton().addActionListener(this);
        view.getRegisterProperty().getTryAgainButton().addActionListener(this);
        view.getRegisterProperty().getFinishButton().addActionListener(this);
    }

    
    /**
     * Action Performed method with no return type
     * executes in response to something triggereing the ActionListener
     * in this case, it can be any of the buttons binded with action listeners
     * this method decides what action to take based off of which button was clicked e.g to register property, or exit to dash board
     * @param e is the instance of the ActionEvent object which is the action event that triggers the ActionListener requiring handling
     */
    public void actionPerformed(ActionEvent e) {
    	
    	// if 'x' (exit to dashboard) button is clicked
        if (e.getSource() == view.getRegisterProperty().getDashboardButton()) {
            view.dashboard();
            view.getDashboard().loggedInLandlord();
        }
        
        //if finish button is pressed
        else if (e.getSource() == view.getRegisterProperty().getFinishButton()) {
            view.dashboard();
            view.getDashboard().loggedInLandlord();
        }
        
        //if try again button is pressed
        else if (e.getSource() == view.getRegisterProperty().getTryAgainButton()) {
            view.getRegisterProperty().registrationForm();
        }
        
        //if register property button is pressed
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

                //assign obtained values to local variables
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
            
                //new property initialized with stored specifications
                Property p = new Property(title, description, propertyType, rent, bedrooms, bathrooms, squareFeet, furnished, landlordID, state, feeExpiry, feeAmount, listingDate, address);
                            
                model.registerProperty(p);
                view.getRegisterProperty().successPage();
              
            }
            catch (NullPointerException exception) {
                exception.printStackTrace();
                System.exit(1);
            }
            catch (IllegalArgumentException exception) {
                exception.printStackTrace();
                view.getRegisterProperty().errorPage();
            }
            catch (SQLException exception) {
                exception.printStackTrace();
                view.getRegisterProperty().errorPage();
            }
        }
    }
}
