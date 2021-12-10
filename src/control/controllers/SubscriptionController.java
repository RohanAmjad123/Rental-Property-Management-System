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
public class SubscriptionController implements Controller, ActionListener 
{
    //private String userType;
    private Frontend view;
    private CompanyDatabase model;
    
    public SubscriptionController(Frontend view, CompanyDatabase model) {
        this.view = view;
        this.model = model;

        view.getManageSubscriptions().getEditButton().addActionListener(this);      //.getRenterButton().addActionListener(this);
        view.getManageSubscriptions().getDashboardButton().addActionListener(this);
        
        view.getEditSearchCriteriaForm().getDashboardButton().addActionListener(this);
        view.getEditSearchCriteriaForm().getUnsubscribeButton().addActionListener(this);
        view.getEditSearchCriteriaForm().getUpdateButton().addActionListener(this);
   
    }

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
            //SOME-SEARCH-CRITERIA-OBJECT.getRenterID
        	//model.unsubscribe(SOME-SEARCH-CRITERIA-OBJECT.getRenterID);
        }
    	
    	///if update button is pressed
        else if (e.getSource() == view.getEditSearchCriteriaForm().getUpdateButton()) 
        {
        	String propType = "";
        	int bedrooms = 0;
        	int bathrooms = 0;
        	int maxRent = 0;
        	String furnished = "";
        	String cityQuad = "";
         
        	try 
        	{
                propType = view.getEditSearchCriteriaForm().getPropertyTypeComboBox().getSelectedItem().toString();
                bedrooms = view.getEditSearchCriteriaForm().getBedroomSpinner().getValue();
                bathrooms = view.getEditSearchCriteriaForm().getBathroomSpinner().getValue();
                maxRent = Integer.parseInt(view.getEditSearchCriteriaForm().getMaxRentText());
                furnished = view.getEditSearchCriteriaForm().getFurnishedComboBox().getSelectedItem().toString();
                cityQuad = view.getEditSearchCriteriaForm().getCityQuadrantComboBox().getSelectedItem().toString();
                
                //^after above criteria are stored, they need to be added to search criteria object
                
                //model.updateSearchCriteria(SOME-SEARCH-CRITERIA-OBJECT);
               
            }
            catch (NullPointerException exception) {
                exception.printStackTrace();
            }
        	      	
        }
    	
    	//if 'x' button is pressed on either page
        else if(e.getSource() == view.getManageSubscriptions().getDashboardButton() || e.getSource() == view.getEditSearchCriteriaForm().getDashboardButton()) 
        {
        	//required because we are switching GUIs
        	//puts up the dashboard panel
        	//view.dashboard();
        	//fills it with the corresponding buttons and components for renter
        	view.getDashboard().loggedInRenter();
        }       
    }
    
}
