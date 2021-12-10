package control.controllers;

import presentation.guicomponents.*;
import datasource.companydatabase.*;
import java.util.*;

/**
 * Class Backend
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */

/**
 *Backend Class
 *Brings all controllers together
 *used to link model to view through the actions and components of the Changing Fees ability
 *main() function is in this class
 */
public class Backend {
    Frontend view;
    CompanyDatabase model;
    
    //ArrayList of controllers 
    ArrayList<Controller> controllers;

    /**
     * Backend default constructor
     * initializes all controllers
     * adds them to an arraylist of controllers
     * no params
     */
    public Backend() {
    	
    	//initialize the view
        view = new Frontend();
        
        //passing in username and pass for sql database
        model = new CompanyDatabase("jdbc:mysql://localhost:3306/Rental_Property_Management_System", "test", "testpass123");

        SignupController signupController = new SignupController(view, model);
        LoginController loginController = new LoginController(view, model);
        DashboardController dashboardController = new DashboardController(view, model);
        PropertyController propertyController = new PropertyController(view, model);
        RegisterPropertyController registerPropertyController = new RegisterPropertyController(view, model);
        SubscriptionController subscriptionController = new SubscriptionController(view, model);        
        ChangeFeesController changeFeesController = new ChangeFeesController(view, model);
        ViewCompanyDBSController viewCompanyDBSController = new ViewCompanyDBSController(view, model);
        PeriodicalSummaryReportController periodicalSummaryReportController = new PeriodicalSummaryReportController(view, model);
        
        controllers = new ArrayList<Controller>();

        controllers.add(signupController);
        controllers.add(loginController);
        controllers.add(dashboardController);
        controllers.add(propertyController);
        controllers.add(registerPropertyController);
        controllers.add(subscriptionController);
        controllers.add(changeFeesController);
        controllers.add(viewCompanyDBSController);
        controllers.add(periodicalSummaryReportController);
    }

    /**
     * runApp method with no return type
     * executes as the runner method
     * this method shows the the front end starting screen which is the first thing the user sees
     * no params
     */
    public void runApp() {
        // set frontend view true
        view.setVisible(true);
    }
    
    
    /**
     * MAIN method with no return type
     * this is where the program executes
     * first method to run before anything runs and is the starting point    
     * @param args[] isn't used
     */
    public static void main(String args[]) {
    	
    	//Backend object initialized
        Backend e = new Backend();
        
        //app is started by calling runner through backend object
        e.runApp();
    }
}
