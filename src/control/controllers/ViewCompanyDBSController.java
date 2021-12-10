package control.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import business.businesslogic.*;
import business.usermodels.*;
import presentation.guicomponents.*;
import datasource.companydatabase.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Class ViewCompanyDBSController
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */

/**
 *Controller Class for viewing Company Database
 *implements the controller class
 *implements the ActionListener class
 *used to link model to view through the actions and components of the viewing of the company DBS
 */
public class ViewCompanyDBSController implements Controller, ActionListener {
	//private data members to hold the model and view objects
	private Frontend view;
    private CompanyDatabase model;
    
    
    /**
     * ViewCompanyDBSController Controller class constructor
     * executes as soon as an instance of this class is created
     * Action Listeners are binded to the different buttons in the different panes
     * They will perform different functions on-click accessible to the manager, specifically being able to:
     * view the renters information
     * view the landlords information
     * view the properties information
     * @param view is the Frontend instance that all gui components are pulled from
     * @param model is the Company Database instance with the data and the required information for the backend
     */
    public ViewCompanyDBSController(Frontend view,CompanyDatabase model) 
    {
    	//setting the data members of the view and model
        this.view = view;
        this.model = model;
        
        //binding buttons on view CompanyDBS start page to action listeners
        view.getViewCompanyDatabase().getRenterButton().addActionListener(this);
        view.getViewCompanyDatabase().getLandlordButton().addActionListener(this);
        view.getViewCompanyDatabase().getPropertyButton().addActionListener(this);
        
        //x button (exit to dashboard) for all panels are the same
        view.getViewCompanyDatabase().getDashboardButton().addActionListener(this);  
    }

    
    /**
     * Action Performed method with no return type
     * executes in response to something triggereing the ActionListener
     * in this case, it can be any of the buttons binded with action listeners
     * this method decides what action to take based off of which button in any of our panels was clicked
     * main functionalities e.g navigating to renters info, properties info etc.
     * @param e is the instance of the ActionEvent object which is the action event that triggers the ActionListener requiring handling
     */
    public void actionPerformed(ActionEvent e) 
    {    	
    	//if the 'Renters' button is pressed
    	if(e.getSource() == view.getViewCompanyDatabase().getRenterButton()) 
    	{   
            ArrayList<User> u = new ArrayList<User>();

            try {
                u = model.getSpecificUsers("renter");

                view.getViewCompanyDatabase().updateRentersView(u);
                //switches the panel to the info panel for renters
    		    view.getViewCompanyDatabase().renterInformation();    		
            }
            catch (SQLException exception) {
                exception.printStackTrace();
            }
     	}
    	
    	//if the 'Landlords' button is pressed
        else if (e.getSource() == view.getViewCompanyDatabase().getLandlordButton()) 
        {
            ArrayList<User> u = new ArrayList<User>();

            try {
                u = model.getSpecificUsers("landlord");

                view.getViewCompanyDatabase().updateLandlordsView(u);
                //switches the panel to the info panel for landlords
    		    view.getViewCompanyDatabase().landlordInformation();    		
            }
            catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
    	
    	///if the 'Properties' button is pressed
        else if (e.getSource() == view.getViewCompanyDatabase().getPropertyButton()) 
        {
            ArrayList<Property> p = new ArrayList<Property>();

            try {
                p = model.getAllProperties();

                view.getViewCompanyDatabase().updatePropertiesView(p);
                //switches the panel to the info panel for properties
    		    view.getViewCompanyDatabase().propertyInformation();		
            }
            catch (SQLException exception) {
                exception.printStackTrace();
            }
        	      	
        }
    	
    	//if 'x' (exit to dashboard) button is pressed on any page
        else if(e.getSource() == view.getViewCompanyDatabase().getDashboardButton()) 
        {       
            view.getViewCompanyDatabase().chooseInformation(); 	
        	//required because we are switching GUIs
        	//puts up the dashboard panel
        	view.dashboard();
        	//fills it with the corresponding buttons and components for manager functionality
        	view.getDashboard().loggedInManager();
        }       
    }
}
