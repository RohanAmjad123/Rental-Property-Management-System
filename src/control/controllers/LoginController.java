package control.controllers;

import datasource.companydatabase.*;
import presentation.guicomponents.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import business.usermodels.*;
import java.sql.SQLException;
import business.businesslogic.*;
/**
 * Class SignupController
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */
public class LoginController implements Controller, ActionListener {
    private String userType;
    private Frontend view;
    private CompanyDatabase model;
    
    public LoginController(Frontend view, CompanyDatabase model) {
        this.view = view;
        this.model = model;

		view.getLogin().getDashboardButton().addActionListener(this);
        view.getLogin().getRenterButton().addActionListener(this);
        view.getLogin().getLandlordButton().addActionListener(this);
        view.getLogin().getManagerButton().addActionListener(this);
        view.getLogin().getLoginButton().addActionListener(this);
        view.getLogin().getFinishButton().addActionListener(this);
        view.getLogin().getTryAgainButton().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.getLogin().getRenterButton()) {
			userType = "renter";
			view.getLogin().userLogin();
		}
		else if (e.getSource() == view.getLogin().getLandlordButton()) {
			userType = "landlord";
			view.getLogin().userLogin();
		}	
		else if (e.getSource() == view.getLogin().getManagerButton()) {
			userType = "manager";
			view.getLogin().userLogin();
		}
		else if (e.getSource() == view.getLogin().getTryAgainButton()) {
			view.getLogin().userChoice();
		}
		else if (e.getSource() == view.getLogin().getLoginButton()){
			String email = "";
			String password = "";
			
			// get results from the page 
			try {
				email = view.getLogin().getEmailText().getText();
				password = new String (view.getLogin().getPasswordText().getPassword());
			}
			catch(NullPointerException exception){
				exception.printStackTrace();
				view.getLogin().errorPage();
			}
			
			try {
				User u = model.login(email, password, userType);
				SingletonLogin x = SingletonLogin.getInstance();
				x.setCurrentUser(u);

				view.getLogin().successPage();

			}
			catch (SQLException exception) {
				exception.printStackTrace();
				view.getLogin().errorPage();
			}
			
		}
		else if (e.getSource() == view.getLogin().getFinishButton()) {
			if (userType.equals("renter")) {
				view.dashboard();
				view.getDashboard().loggedInRenter();
			}
			else if (userType.equals("landlord")) {
				view.dashboard();
				view.getDashboard().loggedInLandlord();
			}
			else if (userType.equals("manager")) {
				view.dashboard();
				view.getDashboard().loggedInManager();
			}
		}
		else if (e.getSource() == view.getLogin().getDashboardButton()) {
			view.dashboard();
			view.getDashboard().signedOut();
		}
    }

}
