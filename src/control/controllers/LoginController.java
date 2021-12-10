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
    
    
     /**
     * LoginController constuctor, Initializes the values of Frontend
     * and CompantDatabase, placing Action Listners to the buttons of our 
     * GUI so that if a button is pressed it will cause an action.
     * @param view, parameter is a Frontend type and used to make the GUI
     * @param model, the model parameter is a CompanyDatabase type and is used to connect to the SQL Database
     */
  
	public LoginController(Frontend view, CompanyDatabase model) {
	 	this.view = view;
        this.model = model;

        //relevant buttons in gui binded with action listeners
		view.getLogin().getDashboardButton().addActionListener(this);
        view.getLogin().getRenterButton().addActionListener(this);
        view.getLogin().getLandlordButton().addActionListener(this);
        view.getLogin().getManagerButton().addActionListener(this);
        view.getLogin().getLoginButton().addActionListener(this);
        view.getLogin().getFinishButton().addActionListener(this);
        view.getLogin().getTryAgainButton().addActionListener(this);
    }
    
    
     /**
     * actionPerformed function is used when one of the buttons is pressed and will make sure the
     * an action is performed correctly regarding Login. Users will first select if they are a renter,
     * landlord, or a manager on the "User Choice" page. It will then proceed to the User Login page 
     * where they enter their login info and click the "Login" button, if the user exists it will 
     * open a successful page where the user will then go into the "user logged in as _____" page based on what they chose on the 
     * "User Choice" page after pressing the "Finish" button. Otherwise it will go to an error page after 
     * throwing an exception where the user presses the "Try Again" button goes back to the "User Choice" page. If the person presses 
     * the dashboard button they will go to the "Signed Out" page.
     * @param e parameter is a ActionEvent type and makes sure to check if a button is pressed and will commit an an action
     */
    
    
    public void actionPerformed(ActionEvent e) {
    	//if renter button is clicked
		if (e.getSource() == view.getLogin().getRenterButton()) {
			userType = "renter";
			view.getLogin().userLogin();
		}
		
		//if landlord button is clicked
		else if (e.getSource() == view.getLogin().getLandlordButton()) {
			userType = "landlord";
			view.getLogin().userLogin();
		}
		
		//if manager button is clicked
		else if (e.getSource() == view.getLogin().getManagerButton()) {
			userType = "manager";
			view.getLogin().userLogin();
		}
		
		//if try again button is clicked
		else if (e.getSource() == view.getLogin().getTryAgainButton()) {
			view.getLogin().userChoice();
		}
		
		//if login button is clicked
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
		
		//if finish button is clicked
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
		
		//if 'x' (exit to dashboard) button is clicked
		else if (e.getSource() == view.getLogin().getDashboardButton()) {
			view.dashboard();
			view.getDashboard().signedOut();
		}
    }


}
