package presentation.guicomponents;

import javax.swing.*;

/**
 * Class Frontend
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @version 1.0
 */
public class Frontend extends JFrame {
    private SignupGUI signup;
    private LoginGUI login;
    private RegisterPropertyGUI registerProperty;
    private ManageSubscriptionsGUI manageSubscriptions;
    private EditSearchCriteriaFormGUI editSearchCriteriaForm;
    private ManageLandlordPropertiesGUI manageLandlordProperties;
    private PayFeeFormGUI payFeeForm;
    private ManageManagerPropertiesGUI manageManagerProperties;
    private ChangeFeesGUI changeFees;
    private ViewCompanyDatabaseGUI viewCompanyDatabase;
    private PeriodicalReportFormGUI periodicalReportForm;
    private DashboardGUI dashboard;
    private PropertyViewGUI propertyView;

    /**
     * class Frontend constructor, used by class Backend to construct its view
     * object.
     */
    public Frontend() {
        // construct parent class JFrame
        super("Rental Property Management System");

        // construct all GUI JPanels
        signup = new SignupGUI(this);
        login = new LoginGUI(this);
        registerProperty = new RegisterPropertyGUI(this);
        manageSubscriptions = new ManageSubscriptionsGUI(this);
        editSearchCriteriaForm = new EditSearchCriteriaFormGUI(this);
        manageLandlordProperties = new ManageLandlordPropertiesGUI(this);
        payFeeForm = new PayFeeFormGUI(this);
        manageManagerProperties = new ManageManagerPropertiesGUI(this);
        changeFees = new ChangeFeesGUI(this);
        viewCompanyDatabase = new ViewCompanyDatabaseGUI(this);
        periodicalReportForm = new PeriodicalReportFormGUI(this);
        propertyView = new PropertyViewGUI(this);
        dashboard = new DashboardGUI(this);

        this.manageSubscriptions();
    }

    // methods for changing panel on frame

    public void signup() {
        this.setContentPane(this.getSignup());
        this.pack();
    }

    public void login() {
        this.setContentPane(this.getLogin());
        this.pack();
    }

    public void registerProperty() {
        this.setContentPane(this.registerProperty);
        this.pack();
    }

    public void manageSubscriptions() {
        this.setContentPane(this.manageSubscriptions);
        this.pack();
    }

    public void editSearchCriteriaFrom() {
        this.setContentPane(this.getEditSearchCriteriaForm());
        this.pack();
    }

    public void manageLandlordProperties() {
        this.setContentPane(this.getManageLandlordProperties());
        this.pack();
    }

    public void payFeeForm() {
        this.setContentPane(this.getPayFeeForm());
        this.pack();
    }

    public void manageManagerProperties() {
        this.setContentPane(this.getManageManagerProperties());
        this.pack();
    }

    public void changeFees() {
        this.setContentPane(this.getChangeFees());
        this.pack();
    }

    public void viewCompanyDatabase() {
        this.setContentPane(this.getViewCompanyDatabase());
        this.pack();
    }

    public void periodicalReportForm() {
        this.setContentPane(this.getPeriodicalReportForm());
        this.pack();
    }

    public void propertyView() {
        this.setContentPane(this.getPropertyView());
        this.pack();
    }

    public void dashboard() {
        this.setContentPane(this.getDashboard());
        this.pack();
    }


    // getter methods

    public SignupGUI getSignup() {
        return signup;
    }

    public LoginGUI getLogin() {
        return login;
    }

    public RegisterPropertyGUI getRegisterProperty() {
        return registerProperty;
    }

    public ManageSubscriptionsGUI getManageSubscriptions() {
        return manageSubscriptions;
    }

    public EditSearchCriteriaFormGUI getEditSearchCriteriaForm() {
        return editSearchCriteriaForm;
    }

    public ManageLandlordPropertiesGUI getManageLandlordProperties() {
        return manageLandlordProperties;
    }

    public PayFeeFormGUI getPayFeeForm() {
        return payFeeForm;
    }

    public ManageManagerPropertiesGUI getManageManagerProperties() {
        return manageManagerProperties;
    }

    public ChangeFeesGUI getChangeFees() {
        return changeFees;
    }

    public ViewCompanyDatabaseGUI getViewCompanyDatabase() {
        return viewCompanyDatabase;
    }

    public PeriodicalReportFormGUI getPeriodicalReportForm() {
        return periodicalReportForm;
    }

    public DashboardGUI getDashboard() {
        return dashboard;
    }

    public PropertyViewGUI getPropertyView() {
        return propertyView;
    }
}