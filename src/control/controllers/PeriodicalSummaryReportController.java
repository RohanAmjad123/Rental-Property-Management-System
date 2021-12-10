package control.controllers;

import presentation.guicomponents.*;
import datasource.companydatabase.*;
import business.businesslogic.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * Class PeriodicalSummaryReportController
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */

/**
 *Controller Class for Periodic Summary Report
 *implements the controller class
 *implements the ActionListener class
 *used to link model to view through the actions and components of the Periodic Summary Report
 */
public class PeriodicalSummaryReportController implements Controller, ActionListener {
    Frontend view;
    CompanyDatabase model;

    
    /**
     * Periodical Summary Report Controller class constructor
     * executes as soon as an instance of this class is created
     * Action Listeners are binded to the different buttons in the different panes
     * They will perform different functions on-click, specifically being able to: 
     * generate a report
     * exit to dashboard
     * manager only has access to this functionality
     * @param view is the Frontend instance that all gui components are pulled from
     * @param model is the Company Database instance with the data and the required information for the backend used to connect to SQL database
     */
    public PeriodicalSummaryReportController(Frontend view, CompanyDatabase model) {
  
    	this.view = view;
        this.model = model;

        //binding of buttons with listeners
        view.getPeriodicalReportForm().getGenerateButton().addActionListener(this);
        view.getPeriodicalReportForm().getDashboardButton().addActionListener(this);
    }

    
    
    /**
     * Action Performed method with no return type
     * executes in response to something triggereing the ActionListener
     * in this case, it can be any of the buttons binded with action listeners
     * this method decides what action to take based off of which button was clicked
     * main functionalities here are to generate the report or exit the panel to go back to the dashboard
     * @param e is the instance of the ActionEvent object which is the action event that triggers the ActionListener requiring handling
     */
    public void actionPerformed(ActionEvent e) {
    	
    	//if generate button is pressed
        if (e.getSource() == view.getPeriodicalReportForm().getGenerateButton()) {
            String fromDay = "";
            String fromMonth = "";
            String fromYear = "";
            String toDay = "";
            String toMonth = "";
            String toYear = "";

            try {
                fromDay = view.getPeriodicalReportForm().getFromDayComboBox().getSelectedItem().toString();
                fromMonth = view.getPeriodicalReportForm().getFromMonthComboBox().getSelectedItem().toString();
                fromYear = view.getPeriodicalReportForm().getFromYearComboBox().getSelectedItem().toString();
                toDay = view.getPeriodicalReportForm().getToDayComboBox().getSelectedItem().toString();
                toMonth = view.getPeriodicalReportForm().getToMonthComboBox().getSelectedItem().toString();
                toYear = view.getPeriodicalReportForm().getToYearComboBox().getSelectedItem().toString();                
            }
            catch (NullPointerException exception) {
                exception.printStackTrace();
            }

            DateModel from = new DateModel(fromYear, fromMonth, fromDay);
            DateModel to = new DateModel(toYear, toMonth, toDay);

            try {
                model.getPeriodicalSummary(from, to);
            }
            catch (SQLException exception) {
                exception.printStackTrace();
            }

            view.dashboard();
            view.getDashboard().loggedInManager();

        }
        
        //if 'x' (exit to dashboard) button is pressed
        else if (e.getSource() == view.getPeriodicalReportForm().getDashboardButton()) {
            view.dashboard();
            view.getDashboard().loggedInManager();
        }
    }
}
