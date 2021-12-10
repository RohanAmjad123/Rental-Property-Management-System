package presentation.guicomponents;

import javax.swing.*;

/**
 * Class Frontend: main Frontend frame to hold all panels
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
     * Frontend constructor, used by class Backend to construct its view
     * object.
     */
    public Frontend() {
        // construct parent class JFrame
        super("Rental Property Management System");

        // set close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
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

        this.dashboard();
    }

    // methods for changing panel on frame

    /**
     * Place SignupGUI on frame
     */
    public void signup() {
        this.setContentPane(this.getSignup());
        this.pack();
    }

    /**
     * Place LoginGUI on frame
     */
    public void login() {
        this.setContentPane(this.getLogin());
        this.pack();
    }

    /**
     * Place RegisterPropertyGUI on frame
     */
    public void registerProperty() {
        this.setContentPane(this.registerProperty);
        this.pack();
    }

    /**
     * Place ManageSubscriptionsGUI on frame
     */
    public void manageSubscriptions() {
        this.setContentPane(this.manageSubscriptions);
        this.pack();
    }

    /**
     * Place EditSearchCriteriaFormGUI on frame
     */
    public void editSearchCriteriaForm() {
        this.setContentPane(this.getEditSearchCriteriaForm());
        this.pack();
    }

    /**
     * Place ManageLandlordPropertiesGUI on frame
     */
    public void manageLandlordProperties() {
        this.setContentPane(this.getManageLandlordProperties());
        this.pack();
    }

    /**
     * Place PayFeeFormGUI on frame
     */
    public void payFeeForm() {
        this.setContentPane(this.getPayFeeForm());
        this.pack();
    }

    /**
     * Place ManageManagerPropertiesGUI on frame
     */
    public void manageManagerProperties() {
        this.setContentPane(this.getManageManagerProperties());
        this.pack();
    }

    /**
     * Place ChangeFeesGUI on frame
     */
    public void changeFees() {
        this.setContentPane(this.getChangeFees());
        this.pack();
    }

    /**
     * Place ViewCompanyDatabaseGUI on frame
     */
    public void viewCompanyDatabase() {
        this.setContentPane(this.getViewCompanyDatabase());
        this.pack();
    }

    /**
     * Place PeriodicalReportFormGUI on frame
     */
    public void periodicalReportForm() {
        this.setContentPane(this.getPeriodicalReportForm());
        this.pack();
    }

    /**
     * Place PropertyViewGUI on frame
     */
    public void propertyView() {
        this.setContentPane(this.getPropertyView());
        this.pack();
    }

    /**
     * Place DashboardGUI on frame
     */
    public void dashboard() {
        this.setContentPane(this.getDashboard());
        this.pack();
    }

    // getter methods

    /**
     * signup getter method
     * 
     * @return SignupGUI
     */
    public SignupGUI getSignup() {
        return signup;
    }

    /**
     * login getter method
     * 
     * @return LoginGUI
     */
    public LoginGUI getLogin() {
        return login;
    }

    /**
     * registerProperty getter method
     * 
     * @return RegisterPropertyGUI
     */
    public RegisterPropertyGUI getRegisterProperty() {
        return registerProperty;
    }

    /**
     * manageSubscriptions getter method
     * 
     * @return ManageSubscriptionsGUI
     */
    public ManageSubscriptionsGUI getManageSubscriptions() {
        return manageSubscriptions;
    }

    /**
     * editSearchCriteriaForm getter method
     * 
     * @return EditSearchCriteriaFormGUI
     */
    public EditSearchCriteriaFormGUI getEditSearchCriteriaForm() {
        return editSearchCriteriaForm;
    }

    /**
     * manageLandlordProperties getter method
     * 
     * @return ManageLandlordPropertiesGUI
     */
    public ManageLandlordPropertiesGUI getManageLandlordProperties() {
        return manageLandlordProperties;
    }

    /**
     * payFeeForm getter method
     * 
     * @return PayFeeFormGUI
     */
    public PayFeeFormGUI getPayFeeForm() {
        return payFeeForm;
    }

    /**
     * manageManagerProperties getter method
     * 
     * @return ManageManagerPropertiesGUI
     */
    public ManageManagerPropertiesGUI getManageManagerProperties() {
        return manageManagerProperties;
    }

    /**
     * changeFees getter method
     * 
     * @return ChangeFeesGUI
     */
    public ChangeFeesGUI getChangeFees() {
        return changeFees;
    }

    /**
     * viewCompanyDatabase getter method
     * 
     * @return ViewCompanyDatabaseGUI
     */
    public ViewCompanyDatabaseGUI getViewCompanyDatabase() {
        return viewCompanyDatabase;
    }

    /**
     * periodicalReportForm getter method
     * 
     * @return PeriodicalReportFormGUI
     */
    public PeriodicalReportFormGUI getPeriodicalReportForm() {
        return periodicalReportForm;
    }

    /**
     * dashboard getter method
     * 
     * @return DashboardGUI
     */
    public DashboardGUI getDashboard() {
        return dashboard;
    }

    /**
     * propertyView getter method
     * 
     * @return PropertyViewGUI
     */
    public PropertyViewGUI getPropertyView() {
        return propertyView;
    }
}