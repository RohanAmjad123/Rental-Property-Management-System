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
public class Backend {
    Frontend view;
    CompanyDatabase model;
    ArrayList<Controller> controllers;

    /**
     * 
     */
    public Backend() {
        view = new Frontend();
        model = new CompanyDatabase("jdbc:mysql://localhost:3306/Rental_Property_Management_System", "test", "testpass123");

        SignupController signupController = new SignupController(view, model);
        LoginController loginController = new LoginController(view, model);
        DashboardController dashboardController = new DashboardController(view, model);
        //PropertyController propertyController = new PropertyController(view, model);
        RegisterPropertyController registerPropertyController = new RegisterPropertyController(view, model);
        //SubscriptionController subscriptionController = new SubscriptionController(view, model);        
        ChangeFeesController changeFeesController = new ChangeFeesController(view, model);
        //ViewCompanyDBSController viewCompanyDBSController = new ViewCompanyDBSController(view, model);
        PeriodicalSummaryReportController periodicalSummaryReportController = new PeriodicalSummaryReportController(view, model);
        
        controllers = new ArrayList<Controller>();

        controllers.add(signupController);
        controllers.add(loginController);
        controllers.add(dashboardController);
        //controllers.add(propertyController);
        controllers.add(registerPropertyController);
        //controllers.add(subscriptionController);
        controllers.add(changeFeesController);
        //controllers.add(viewCompanyDBSController);
        controllers.add(periodicalSummaryReportController);
    }

    public void runApp() {
        // set frontend view true
        view.setVisible(true);
    }

    public static void main(String args[]) {
        Backend e = new Backend();
        e.runApp();
    }
}
