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

        // add all GUI panels
        this.add(signup);
        this.add(login);
        this.add(registerProperty);
        this.add(manageSubscriptions);
        this.add(editSearchCriteriaForm);
        this.add(manageLandlordProperties);
        this.add(payFeeForm);
        this.add(manageManagerProperties);
        this.add(changeFees);
        this.add(viewCompanyDatabase);
        this.add(periodicalReportForm);
        this.add(propertyView);
        this.add(dashboard);


        // set all panels as not visible
        signup.setVisible(false);
        signup.setPreferredSize(new java.awt.Dimension(0, 0));

        login.setVisible(false);
        login.setPreferredSize(new java.awt.Dimension(0, 0));

        registerProperty.setVisible(false);
        registerProperty.setPreferredSize(new java.awt.Dimension(0, 0));

        manageSubscriptions.setVisible(false);
        manageSubscriptions.setPreferredSize(new java.awt.Dimension(0, 0));

        editSearchCriteriaForm.setVisible(false);
        editSearchCriteriaForm.setPreferredSize(new java.awt.Dimension(0, 0));

        manageLandlordProperties.setVisible(false);
        manageLandlordProperties.setPreferredSize(new java.awt.Dimension(0, 0));

        payFeeForm.setVisible(false);
        payFeeForm.setPreferredSize(new java.awt.Dimension(0, 0));

        manageManagerProperties.setVisible(false);
        manageManagerProperties.setPreferredSize(new java.awt.Dimension(0, 0));

        changeFees.setVisible(false);
        changeFees.setPreferredSize(new java.awt.Dimension(0, 0));

        viewCompanyDatabase.setVisible(false);
        viewCompanyDatabase.setPreferredSize(new java.awt.Dimension(0, 0));

        periodicalReportForm.setVisible(false);
        periodicalReportForm.setPreferredSize(new java.awt.Dimension(0, 0));

        propertyView.setVisible(false);
        propertyView.setPreferredSize(new java.awt.Dimension(0, 0));

        dashboard.setVisible(true);
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