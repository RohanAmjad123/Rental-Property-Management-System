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
        dashboard = new DashboardGUI(this);
        propertyView = new PropertyViewGUI(this);

        // set SignupGUI on JFrame
        this.add(viewCompanyDatabase);
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

    public EditSearchCriteriaFormGUI getAddSearchCriteriaForm() {
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