package control.controllers;

import java.awt.event.ActionEvent;

/**
 * Class SubscriptionController
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */


/**
 *Controller Class for Subscription
 *implements the controller class
 *implements the ActionListener class
 *used to link model to view through the actions and components of the Subscription and search Criteria
 */
public class SubscriptionController implements Controller, ActionListener 
{
	//private data members to hold the model and view objects
    private Frontend view;
    private CompanyDatabase model;
    
    
    /**
     * Subscription Controller class constructor
     * executes as soon as an instance of this class is created
     * Action Listeners are binded to the different buttons in the different panes
     * They will perform different functions on-click accessible to subscribed renters, specifically being able to: 
     * Update criteria, unsubscribe, and exit to dashboard
     * Editing of specific criteria is also available, where renter can specify things such as: property type, # of bedrooms, etc.
     * @param view is the Frontend instance that all gui components are pulled from
     * @param model is the Company Database instance with the data and the required information for the backend
     */
    public SubscriptionController(Frontend view, CompanyDatabase model) 
    {
    	//setting the data members of the view and model
        this.view = view;
        this.model = model;

        //binding buttons on Manage Renter Subscription start page to action listeners
        view.getManageSubscriptions().getEditButton().addActionListener(this);     
        view.getManageSubscriptions().getDashboardButton().addActionListener(this);
        
        //binding buttons on Edit Renter Subscription page to action listeners
        view.getEditSearchCriteriaForm().getDashboardButton().addActionListener(this);
        view.getEditSearchCriteriaForm().getUnsubscribeButton().addActionListener(this);
        view.getEditSearchCriteriaForm().getUpdateButton().addActionListener(this);
   
    }
    
    
    
    /**
     * Action Performed method with no return type
     * executes in response to something triggereing the ActionListener
     * in this case, it can be any of the buttons binded with action listeners
     * this method decides what action to take based off of which button in any of our panels was clicked
     * main functionalities e.g transitioning to the edit panel, updating criteria, etc.
     * @param e is the instance of the ActionEvent object which is the action event that triggers the ActionListener requiring handling
     */
    public void actionPerformed(ActionEvent e) 
    {    	
    	//if the edit button is pressed
    	if(e.getSource() == view.getManageSubscriptions().getEditButton()) 
    	{
    		//switches the panel to the editing of the subscription
    		view.editSearchCriteriaForm();    		
    	}
    	
    	//if unsubscribe button is pressed
        else if (e.getSource() == view.getEditSearchCriteriaForm().getUnsubscribeButton()) 
        {
        	//STILL NEEDS TO BE DONE
            //SOME-SEARCH-CRITERIA-OBJECT.getRenterID
        	//model.unsubscribe(SOME-SEARCH-CRITERIA-OBJECT.getRenterID);
        }
    	
    	///if update button is pressed
        else if (e.getSource() == view.getEditSearchCriteriaForm().getUpdateButton()) 
        {
        	//all local variables to store the criteria selected by the subscribed renter so it can be used to update the search criteria
        	String propType = "";
        	int bedrooms = 0;
        	int bathrooms = 0;
        	int maxRent = 0;
        	String furnished = "";
        	String cityQuad = "";
         
        	//user input sensitive so try catch allows us to catch any null pointer exception
        	try 
        	{
        		//assigning all local variables, corresponding values from criteria of registered renter
                propType = view.getEditSearchCriteriaForm().getPropertyTypeComboBox().getSelectedItem().toString();
                bedrooms = view.getEditSearchCriteriaForm().getBedroomSpinner().getValue();
                bathrooms = view.getEditSearchCriteriaForm().getBathroomSpinner().getValue();
                maxRent = Integer.parseInt(view.getEditSearchCriteriaForm().getMaxRentText());
                furnished = view.getEditSearchCriteriaForm().getFurnishedComboBox().getSelectedItem().toString();
                cityQuad = view.getEditSearchCriteriaForm().getCityQuadrantComboBox().getSelectedItem().toString();
                
                //^after above criteria are stored, they need to be added to search criteria object
                //STILL NEEDS TO BE DONE
                //model.updateSearchCriteria(SOME-SEARCH-CRITERIA-OBJECT);
               
            }
            catch (NullPointerException exception) {
                exception.printStackTrace();
            }
        	      	
        }
    	
    	//if 'x' (exit to dashboard) button is pressed on either page
        else if(e.getSource() == view.getManageSubscriptions().getDashboardButton() || e.getSource() == view.getEditSearchCriteriaForm().getDashboardButton()) 
        {
        	//required because we are switching GUIs
        	//puts up the dashboard panel
        	//view.dashboard();
        	//fills it with the corresponding buttons and components for renter because the renter is logged in and this is renter funcitonality
        	view.getDashboard().loggedInRenter();
        }       
    }
    
}
