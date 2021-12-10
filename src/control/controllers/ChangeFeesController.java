

package control.controllers;

import control.controllers.*;
import presentation.guicomponents.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import business.usermodels.*;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * Class ChangeFeesController
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.2
 */
public class ChangeFeesController implements Controller {

 private Frontend view;
 private CompanyDatabase model;
 
 
    /**
     * Initializes the values of Frontend and CompantDatabase
     * Placing Action Listners to the buttons of our GUI so that if a 
     * button is pressed it will cause an action
     * @param view
     * @param model
     */
  
public ChangeFeesController (Frontend view, CompanyDatabase model){
	this.view = view;
	this.model = model;
	// change login
	view.getChangeFees().getDashboardButton().addActionListener(this);
	view.getChangeFees().getUpdateButton().addActionListener(this);
}


    /**
     * If one of the two buttons is pressed will make sure the
     * an action is performed correctly.
     * @param e
     */

 public void actionPerformed(ActionEvent e) {
	 
	 
	 
	if(e.getSource() == view.getChangeFees().getDashboardButton()){
		view.dashboard();
		view.getDashboard().loggedInManager();
		
	}
	
	
	else if(e.getSource() == view.getChangeFees().getUpdateButton()){
		
		String FeeAmount = "";
		String FeePeriod = "";
		
		
		try{
			
			FeeAmount = view.getChangeFees().getFeeAmountComboBox().getSelectedItem().toString();
			FeePeriod = view.getChangeFees().getFeePeriodComboBox().getSelectedItem().toString();
			
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		
		Fee fee = new Fee(FeePeriod, FeeAmount);
		
		try{
			model.setFee(fee);
		}
		catch (SQLException exception) {
           exception.printStackTrace();
        }
        
        view.dashboard();
		view.getDashboard().loggedInManager();
		
		
		
		
	}
	
	
	
	
	
	
 }




    
}
