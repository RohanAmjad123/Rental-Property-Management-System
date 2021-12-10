package control.controllers;

import datasource.companydatabase.*;
import presentation.guicomponents.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import business.usermodels.*;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * Class SignupController
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */

/**
 *Controller Class for Signup
 *implements the Controller class
 *implements the ActionListener class
 *used to link model to view through the actions and components of the process of Sign Up
 */
public class SignupController implements Controller, ActionListener {
    private String userType;
    private Frontend view;
    private CompanyDatabase model;
    
    /**
     * Signup Controller class constructor
     * executes as soon as an instance of this class is created
     * Action Listeners are binded to the different buttons in the different panes
     * They will perform different functions on-click, some of them being: 
     * signup, finish, determine the user type (landlord, renter, manager, etc.)
     * all user types must sign up first
     * @param view is the Frontend instance that all gui components are pulled from
     * @param model is the Company Database instance with the data and the required information for the backend used to connect to SQL database
     */
    public SignupController(Frontend view, CompanyDatabase model) {
        this.view = view;
        this.model = model;

        //relevant buttons in gui binded with action listeners
        view.getSignup().getRenterButton().addActionListener(this);
        view.getSignup().getLandlordButton().addActionListener(this);
        view.getSignup().getManagerButton().addActionListener(this);
        view.getSignup().getSignupButton().addActionListener(this);
        view.getSignup().getTryAgainButton().addActionListener(this);
        view.getSignup().getFinishButton().addActionListener(this);
        view.getSignup().getDashboardButton().addActionListener(this);
    }

    
    /**
     * Action Performed method with no return type
     * executes in response to something triggereing the ActionListener
     * in this case, it can be any of the buttons binded with action listeners
     * this method decides what action to take based off of which button was clicked e.g to sign up as a land lord, renter, or manager, etc.
     * flow is dictated by the options picked annd the corresponding buttons are shown
     * @param e is the instance of the ActionEvent object which is the action event that triggers the ActionListener requiring handling
     */
    public void actionPerformed(ActionEvent e) {
    	
    	//if renter button is pressed
        if (e.getSource() == view.getSignup().getRenterButton()) {
            userType = "renter";
            view.getSignup().renterSignup();
        }
        
        //if landlord button is pressed
        else if (e.getSource() == view.getSignup().getLandlordButton()) {
            userType = "landlord";
            view.getSignup().landlordSignup();
        }
        
        //if manager button is pressed
        else if (e.getSource() == view.getSignup().getManagerButton()) {
            userType = "manager";
            view.getSignup().managerSignup();
        }
        
        //if signup button is pressed
        else if (e.getSource() == view.getSignup().getSignupButton()) {
            String email = "";
            String password = "";
            String firstName = "";
            String lastName = ""; 

            try {
                email = view.getSignup().getEmailText().getText();
                password = new String(view.getSignup().getPasswordText().getPassword());
                firstName = view.getSignup().getFirstNameText().getText();
                lastName = view.getSignup().getLastNameText().getText();
            }
            catch (NullPointerException exception) {
                exception.printStackTrace();
                view.getSignup().errorPage();
            }
            
            User u = new User(email, password, firstName, lastName, userType);

            if (userType == "manager") {
                String managerKey = "";
                try {
                    managerKey = new String(view.getSignup().getManagerKeyText().getPassword());
                }
                catch (NullPointerException exception) {
                    exception.printStackTrace();
                    view.getSignup().errorPage();
                }
    
                try {
                    ArrayList<String> managerKeys = model.getManagerKeys();
                    if (!managerKeys.contains(managerKey)) {
                        throw new SQLException("Manager key not found!");
                    }
                    model.validSignup(u);
                    view.getSignup().successPage();
                }
                catch (SQLException exception) {
                    exception.printStackTrace();
                    view.getSignup().errorPage();
                }
            }
            else {
                try {
                    model.validSignup(u);
                    view.getSignup().successPage();
                }
                catch (SQLException exception) {
                    exception.printStackTrace();
                    view.getSignup().errorPage();
                }
            }
        }
        
        //if try again button is pressed
        else if (e.getSource() == view.getSignup().getTryAgainButton()) {
            view.getSignup().userChoice();
        }
        
        //if finish button is pressed
        else if (e.getSource() == view.getSignup().getFinishButton()) {
            view.dashboard();
            view.getSignup().userChoice();
            view.getDashboard().signedOut();
        }
        
        //if 'x' (exit to dashboard) button is pressed
        else if (e.getSource() == view.getSignup().getDashboardButton()) {
            view.dashboard();
            view.getSignup().userChoice();
            view.getDashboard().signedOut();
        }
    }

}
