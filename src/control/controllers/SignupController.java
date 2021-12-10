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
public class SignupController implements Controller, ActionListener {
    private String userType;
    private Frontend view;
    private CompanyDatabase model;
    
    public SignupController(Frontend view, CompanyDatabase model) {
        this.view = view;
        this.model = model;

        view.getSignup().getRenterButton().addActionListener(this);
        view.getSignup().getLandlordButton().addActionListener(this);
        view.getSignup().getManagerButton().addActionListener(this);
        view.getSignup().getSignupButton().addActionListener(this);
        view.getSignup().getTryAgainButton().addActionListener(this);
        view.getSignup().getFinishButton().addActionListener(this);
        view.getSignup().getDashboardButton().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getSignup().getRenterButton()) {
            userType = "renter";
            view.getSignup().renterSignup();
        }
        else if (e.getSource() == view.getSignup().getLandlordButton()) {
            userType = "landlord";
            view.getSignup().landlordSignup();
        }
        else if (e.getSource() == view.getSignup().getManagerButton()) {
            userType = "manager";
            view.getSignup().managerSignup();
        }
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
        else if (e.getSource() == view.getSignup().getTryAgainButton()) {
            view.getSignup().userChoice();
        }
        else if (e.getSource() == view.getSignup().getFinishButton()) {
            view.dashboard();
            view.getSignup().userChoice();
            view.getDashboard().signedOut();
        }
        else if (e.getSource() == view.getSignup().getDashboardButton()) {
            view.dashboard();
            view.getSignup().userChoice();
            view.getDashboard().signedOut();
        }
    }

}
