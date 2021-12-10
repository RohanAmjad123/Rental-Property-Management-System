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
        view.getLogin().getFinsihButton().addActionListener(this);
        view.getLogin().getTryAgainButton().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.getLogin().getRenterButton()){
			userType = "renter";
			view.getLogin().userLogin();
		}
		else if (e.getSource() == view.getLogin().getLandlordButton()){
			userType = "landlord";
			view.getLogin().userLogin();
		}	
		else if (e.getSource() == view.getLogin().getManagerButton()){
			userType = "manager";
			view.getLogin().userLogin();
		}
		//if the user fails to login they get sent back to the user choice 
		//login page
		else if(e.getSource() == view.getLogin().getTryAgainButton()){
			view.getLogin().userChoice();
		}
		else if (e.getSource() == view.getLogin().getLoginButton()){
			string email = "";
			string password = "";
			
			// get results from the page 
			try{
				email = view.getLogin().getEmailtext().getText();
				password = new string (view.getLogin().getPasswordText().getPassword());
			}
			catch(NullPointerException e){
				e.printStackTrace();
				view.getLogin().errorPage();
			}
			
			
			
			User u = login(email, password,
			
			
			
			
			
			
			
			
			
		}
		



	else if(e.getSource() == view.getLogin().getFinsihButton()){
		
		
	}


	else if(e.getSource() == view.getLogin().getDashboardButton()){
		
		
	}



    }

}
