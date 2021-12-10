package presentation.guicomponents;

import java.util.ArrayList;
import javax.swing.*;

import business.businesslogic.Address;
import business.businesslogic.DateModel;
import business.businesslogic.Property;

/**
 * Class DashboardGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @version 1.0
 */
public class DashboardGUI extends JPanel {
    private Frontend view;

    // Variables declaration - do not modify
    private javax.swing.JLabel bathroomLabel = new javax.swing.JLabel();
    private javax.swing.JSpinner bathroomSpinner = new javax.swing.JSpinner();
    private javax.swing.JLabel bedroomLabel = new javax.swing.JLabel();
    private javax.swing.JSpinner bedroomSpinner = new javax.swing.JSpinner();
    private javax.swing.JComboBox<String> cityQuadrantComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel cityQuadrantLabel = new javax.swing.JLabel();
    private javax.swing.JLabel copyrightLabel = new javax.swing.JLabel();
    private javax.swing.JComboBox<String> furnishedComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel furnishedLabel = new javax.swing.JLabel();
    private javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    private javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
    private javax.swing.JSeparator jSeparator2 = new javax.swing.JSeparator();
    private javax.swing.JLabel joinTodayLabel = new javax.swing.JLabel();
    private javax.swing.JButton loginButton = new javax.swing.JButton();
    private javax.swing.JLabel maxRentLabel = new javax.swing.JLabel();
    private javax.swing.JTextField maxRentText = new javax.swing.JTextField();
    private javax.swing.JLabel mottoLabel = new javax.swing.JLabel();
    private javax.swing.JLabel orLabel = new javax.swing.JLabel();
    private javax.swing.JList<Property> propertyList = new javax.swing.JList<Property>();
    private javax.swing.JComboBox<String> propertyTypeComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel propertyTypeLabel = new javax.swing.JLabel();
    private javax.swing.JLabel rentSlowerLabel = new javax.swing.JLabel();
    private javax.swing.JButton searchButton = new javax.swing.JButton();
    private javax.swing.JLabel searchLabel = new javax.swing.JLabel();
    private javax.swing.JButton signupButton = new javax.swing.JButton();
    // End of variables declaration

    // all properties
    private DefaultListModel<Property> propertyListModel = new DefaultListModel<Property>();

    // Variables declaration - do not modify
    private javax.swing.JLabel logoLabel = new javax.swing.JLabel();
    private javax.swing.JButton startButton = new javax.swing.JButton();
    private javax.swing.JLabel welcomeLabel = new javax.swing.JLabel();
    // End of variables declaration

    // Variables declaration - do not modify
    private javax.swing.JButton logoutButton = new javax.swing.JButton();
    private javax.swing.JButton manageSubscriptionButton = new javax.swing.JButton();
    private javax.swing.JLabel renterLabel = new javax.swing.JLabel();
    // End of variables declaration

    // Variables declaration - do not modify
    private javax.swing.JLabel landlordLabel = new javax.swing.JLabel();
    private javax.swing.JButton manageMyPropertiesButton = new javax.swing.JButton();
    private javax.swing.JButton registerPropertyButton = new javax.swing.JButton();
    // End of variables declaration

    // Variables declaration - do not modify
    private javax.swing.JButton changeFeesButton = new javax.swing.JButton();
    private javax.swing.JButton generateSummaryReportButton = new javax.swing.JButton();
    private javax.swing.JButton manageAllPropertiesButton = new javax.swing.JButton();
    private javax.swing.JLabel managerLabel = new javax.swing.JLabel();
    private javax.swing.JButton viewCompanyDatabaseButton = new javax.swing.JButton();
    // End of variables declaration

    public DashboardGUI(Frontend view) {
        // assign view reference
        this.view = view;
        startPage();
    }

    // update Property list model
    public void updatePropertiesView(ArrayList<Property> updatedPropertyListModel) {
        this.propertyListModel.clear();
        for (Property p : updatedPropertyListModel) {
            this.propertyListModel.addElement(p);
        }
    }

    public void startPage() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(878, 471));
        setLayout(null);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(30, 430, 170, 20);

        startButton.setBackground(new java.awt.Color(255, 255, 255));
        startButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        startButton.setForeground(new java.awt.Color(0, 0, 0));
        startButton.setText("Start");
        /*
         * startButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(startButton);
        startButton.setBounds(310, 290, 240, 70);

        welcomeLabel.setFont(new java.awt.Font("Heiti TC", 1, 36)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("Welcome to");
        add(welcomeLabel);
        welcomeLabel.setBounds(160, 60, 230, 80);

        logoLabel.setFont(new java.awt.Font("Heiti TC", 1, 120)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoLabel.setText("RentSlower");
        add(logoLabel);
        logoLabel.setBounds(120, 130, 670, 130);

        revalidate();
        repaint();
        view.pack();
    }

    public void signedOut() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(878, 750));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(50, 20, 260, 70);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 710, 170, 20);

        searchLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchLabel.setText("Search for a property");
        add(searchLabel);
        searchLabel.setBounds(70, 110, 240, 30);

        propertyList.setBackground(new java.awt.Color(0, 0, 0));
        propertyList.setForeground(new java.awt.Color(255, 255, 255));
        propertyList.setModel(propertyListModel);

        jScrollPane1.setViewportView(propertyList);

        add(jScrollPane1);
        jScrollPane1.setBounds(60, 250, 500, 450);

        orLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        orLabel.setForeground(new java.awt.Color(255, 255, 255));
        orLabel.setText("or");
        add(orLabel);
        orLabel.setBounds(710, 490, 30, 30);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator1);
        jSeparator1.setBounds(0, 230, 880, 20);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator2);
        jSeparator2.setBounds(0, 90, 880, 20);

        propertyTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        propertyTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        propertyTypeLabel.setText("Property Type");
        add(propertyTypeLabel);
        propertyTypeLabel.setBounds(30, 160, 90, 20);

        bedroomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bedroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        bedroomLabel.setText("Bedrooms");
        add(bedroomLabel);
        bedroomLabel.setBounds(170, 160, 80, 20);

        bathroomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bathroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        bathroomLabel.setText("Bathrooms");
        add(bathroomLabel);
        bathroomLabel.setBounds(260, 160, 80, 20);

        propertyTypeComboBox.setBackground(new java.awt.Color(255, 255, 255));
        propertyTypeComboBox.setForeground(java.awt.Color.black);
        propertyTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Apartment", "Basement", "Condo", "Attached", "Detached", "Room", "Garage" }));
        /*
         * propertyTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(propertyTypeComboBox);
        propertyTypeComboBox.setBounds(20, 190, 120, 20);

        bathroomSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(bathroomSpinner);
        bathroomSpinner.setBounds(250, 190, 50, 20);

        bedroomSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(bedroomSpinner);
        bedroomSpinner.setBounds(160, 190, 50, 20);

        furnishedLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        furnishedLabel.setForeground(new java.awt.Color(255, 255, 255));
        furnishedLabel.setText("Furnished");
        add(furnishedLabel);
        furnishedLabel.setBounds(350, 160, 80, 20);

        furnishedComboBox.setBackground(new java.awt.Color(255, 255, 255));
        furnishedComboBox.setForeground(java.awt.Color.black);
        furnishedComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        add(furnishedComboBox);
        furnishedComboBox.setBounds(340, 190, 80, 20);

        maxRentLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxRentLabel.setForeground(new java.awt.Color(255, 255, 255));
        maxRentLabel.setText("Max Rent");
        add(maxRentLabel);
        maxRentLabel.setBounds(460, 160, 70, 20);

        maxRentText.setBackground(java.awt.Color.black);
        maxRentText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * maxRentText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(maxRentText);
        maxRentText.setBounds(440, 190, 110, 20);

        cityQuadrantLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityQuadrantLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityQuadrantLabel.setText("City Quadrant");
        add(cityQuadrantLabel);
        cityQuadrantLabel.setBounds(570, 160, 90, 20);

        cityQuadrantComboBox.setBackground(new java.awt.Color(255, 255, 255));
        cityQuadrantComboBox.setForeground(java.awt.Color.black);
        cityQuadrantComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NE", "NW", "SE", "SW" }));
        add(cityQuadrantComboBox);
        cityQuadrantComboBox.setBounds(570, 190, 80, 20);

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("Login");
        /*
         * loginButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(loginButton);
        loginButton.setBounds(650, 560, 150, 40);

        mottoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mottoLabel.setForeground(new java.awt.Color(255, 255, 255));
        mottoLabel.setText("why RentFaster when you can RentSlower!");
        add(mottoLabel);
        mottoLabel.setBounds(350, 40, 470, 30);

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(0, 0, 0));
        searchButton.setText("Search");
        /*
         * searchButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(searchButton);
        searchButton.setBounds(720, 140, 110, 40);

        signupButton.setBackground(new java.awt.Color(255, 255, 255));
        signupButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signupButton.setForeground(new java.awt.Color(0, 0, 0));
        signupButton.setText("Signup");
        /*
         * signupButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(signupButton);
        signupButton.setBounds(650, 420, 150, 40);

        joinTodayLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        joinTodayLabel.setForeground(new java.awt.Color(255, 255, 255));
        joinTodayLabel.setText("Join today! ");
        add(joinTodayLabel);
        joinTodayLabel.setBounds(630, 330, 190, 50);

        revalidate();
        repaint();
        view.pack();
    }

    public void loggedInRenter() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(878, 750));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(50, 20, 260, 70);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 710, 170, 20);

        renterLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        renterLabel.setForeground(new java.awt.Color(255, 255, 255));
        renterLabel.setText("Renter");
        add(renterLabel);
        renterLabel.setBounds(660, 350, 120, 40);

        propertyList.setBackground(new java.awt.Color(0, 0, 0));
        propertyList.setForeground(new java.awt.Color(255, 255, 255));
        propertyList.setModel(propertyListModel);

        jScrollPane1.setViewportView(propertyList);

        add(jScrollPane1);
        jScrollPane1.setBounds(60, 250, 500, 450);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator1);
        jSeparator1.setBounds(0, 230, 880, 20);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator2);
        jSeparator2.setBounds(0, 90, 880, 20);

        propertyTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        propertyTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        propertyTypeLabel.setText("Property Type");
        add(propertyTypeLabel);
        propertyTypeLabel.setBounds(30, 160, 90, 20);

        bedroomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bedroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        bedroomLabel.setText("Bedrooms");
        add(bedroomLabel);
        bedroomLabel.setBounds(170, 160, 80, 20);

        bathroomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bathroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        bathroomLabel.setText("Bathrooms");
        add(bathroomLabel);
        bathroomLabel.setBounds(260, 160, 80, 20);

        propertyTypeComboBox.setBackground(new java.awt.Color(255, 255, 255));
        propertyTypeComboBox.setForeground(java.awt.Color.black);
        propertyTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Apartment", "Basement", "Condo", "Attached", "Detached", "Room", "Garage" }));
        /*
         * propertyTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(propertyTypeComboBox);
        propertyTypeComboBox.setBounds(20, 190, 120, 20);

        bathroomSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(bathroomSpinner);
        bathroomSpinner.setBounds(250, 190, 50, 20);

        bedroomSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(bedroomSpinner);
        bedroomSpinner.setBounds(160, 190, 50, 20);

        furnishedLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        furnishedLabel.setForeground(new java.awt.Color(255, 255, 255));
        furnishedLabel.setText("Furnished");
        add(furnishedLabel);
        furnishedLabel.setBounds(350, 160, 80, 20);

        furnishedComboBox.setBackground(new java.awt.Color(255, 255, 255));
        furnishedComboBox.setForeground(java.awt.Color.black);
        furnishedComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        add(furnishedComboBox);
        furnishedComboBox.setBounds(340, 190, 80, 20);

        maxRentLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxRentLabel.setForeground(new java.awt.Color(255, 255, 255));
        maxRentLabel.setText("Max Rent");
        add(maxRentLabel);
        maxRentLabel.setBounds(460, 160, 70, 20);

        maxRentText.setBackground(java.awt.Color.black);
        maxRentText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * maxRentText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(maxRentText);
        maxRentText.setBounds(440, 190, 110, 20);

        cityQuadrantLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityQuadrantLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityQuadrantLabel.setText("City Quadrant");
        add(cityQuadrantLabel);
        cityQuadrantLabel.setBounds(570, 160, 90, 20);

        cityQuadrantComboBox.setBackground(new java.awt.Color(255, 255, 255));
        cityQuadrantComboBox.setForeground(java.awt.Color.black);
        cityQuadrantComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NE", "NW", "SE", "SW" }));
        add(cityQuadrantComboBox);
        cityQuadrantComboBox.setBounds(570, 190, 80, 20);

        mottoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mottoLabel.setForeground(new java.awt.Color(255, 255, 255));
        mottoLabel.setText("why RentFaster when you can RentSlower!");
        add(mottoLabel);
        mottoLabel.setBounds(350, 40, 470, 30);

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(0, 0, 0));
        searchButton.setText("Search");
        /*
         * searchButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(searchButton);
        searchButton.setBounds(720, 140, 110, 40);

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 0, 0));
        logoutButton.setText("Logout");
        /*
         * logoutButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(logoutButton);
        logoutButton.setBounds(740, 670, 100, 40);

        searchLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchLabel.setText("Search for a property");
        add(searchLabel);
        searchLabel.setBounds(50, 110, 240, 30);

        manageSubscriptionButton.setBackground(new java.awt.Color(255, 255, 255));
        manageSubscriptionButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageSubscriptionButton.setForeground(new java.awt.Color(0, 0, 0));
        manageSubscriptionButton.setText("Manage Subscription");
        /*
         * manageSubscriptionButton.addActionListener(new
         * java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(manageSubscriptionButton);
        manageSubscriptionButton.setBounds(600, 440, 230, 40);

        revalidate();
        repaint();
        view.pack();
    }

    public void loggedInLandlord() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(878, 750));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(50, 20, 260, 70);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 710, 170, 20);

        landlordLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        landlordLabel.setForeground(new java.awt.Color(255, 255, 255));
        landlordLabel.setText("Landlord");
        add(landlordLabel);
        landlordLabel.setBounds(650, 340, 150, 40);

        propertyList.setBackground(new java.awt.Color(0, 0, 0));
        propertyList.setForeground(new java.awt.Color(255, 255, 255));
        propertyList.setModel(propertyListModel);

        jScrollPane1.setViewportView(propertyList);

        add(jScrollPane1);
        jScrollPane1.setBounds(60, 250, 500, 450);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator1);
        jSeparator1.setBounds(0, 230, 880, 20);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator2);
        jSeparator2.setBounds(0, 90, 880, 20);

        propertyTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        propertyTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        propertyTypeLabel.setText("Property Type");
        add(propertyTypeLabel);
        propertyTypeLabel.setBounds(30, 160, 90, 20);

        bedroomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bedroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        bedroomLabel.setText("Bedrooms");
        add(bedroomLabel);
        bedroomLabel.setBounds(170, 160, 80, 20);

        bathroomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bathroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        bathroomLabel.setText("Bathrooms");
        add(bathroomLabel);
        bathroomLabel.setBounds(260, 160, 80, 20);

        propertyTypeComboBox.setBackground(new java.awt.Color(255, 255, 255));
        propertyTypeComboBox.setForeground(java.awt.Color.black);
        propertyTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Apartment", "Basement", "Condo", "Attached", "Detached", "Room", "Garage" }));
        /*
         * propertyTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(propertyTypeComboBox);
        propertyTypeComboBox.setBounds(20, 190, 120, 20);

        bathroomSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(bathroomSpinner);
        bathroomSpinner.setBounds(250, 190, 50, 20);

        bedroomSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(bedroomSpinner);
        bedroomSpinner.setBounds(160, 190, 50, 20);

        furnishedLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        furnishedLabel.setForeground(new java.awt.Color(255, 255, 255));
        furnishedLabel.setText("Furnished");
        add(furnishedLabel);
        furnishedLabel.setBounds(350, 160, 80, 20);

        furnishedComboBox.setBackground(new java.awt.Color(255, 255, 255));
        furnishedComboBox.setForeground(java.awt.Color.black);
        furnishedComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        add(furnishedComboBox);
        furnishedComboBox.setBounds(340, 190, 80, 20);

        maxRentLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxRentLabel.setForeground(new java.awt.Color(255, 255, 255));
        maxRentLabel.setText("Max Rent");
        add(maxRentLabel);
        maxRentLabel.setBounds(460, 160, 70, 20);

        maxRentText.setBackground(java.awt.Color.black);
        maxRentText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * maxRentText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(maxRentText);
        maxRentText.setBounds(440, 190, 110, 20);

        cityQuadrantLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityQuadrantLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityQuadrantLabel.setText("City Quadrant");
        add(cityQuadrantLabel);
        cityQuadrantLabel.setBounds(570, 160, 90, 20);

        cityQuadrantComboBox.setBackground(new java.awt.Color(255, 255, 255));
        cityQuadrantComboBox.setForeground(java.awt.Color.black);
        cityQuadrantComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NE", "NW", "SE", "SW" }));
        add(cityQuadrantComboBox);
        cityQuadrantComboBox.setBounds(570, 190, 80, 20);

        manageMyPropertiesButton.setBackground(new java.awt.Color(255, 255, 255));
        manageMyPropertiesButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageMyPropertiesButton.setForeground(new java.awt.Color(0, 0, 0));
        manageMyPropertiesButton.setText("Manage My Properties");
        /*
         * manageMyPropertiesButton.addActionListener(new
         * java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(manageMyPropertiesButton);
        manageMyPropertiesButton.setBounds(600, 530, 240, 40);

        mottoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mottoLabel.setForeground(new java.awt.Color(255, 255, 255));
        mottoLabel.setText("why RentFaster when you can RentSlower!");
        add(mottoLabel);
        mottoLabel.setBounds(350, 40, 470, 30);

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(0, 0, 0));
        searchButton.setText("Search");
        /*
         * searchButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(searchButton);
        searchButton.setBounds(720, 140, 110, 40);

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 0, 0));
        logoutButton.setText("Logout");
        /*
         * logoutButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(logoutButton);
        logoutButton.setBounds(740, 670, 100, 40);

        registerPropertyButton.setBackground(new java.awt.Color(255, 255, 255));
        registerPropertyButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registerPropertyButton.setForeground(new java.awt.Color(0, 0, 0));
        registerPropertyButton.setText("Register Property");
        /*
         * registerPropertyButton.addActionListener(new java.awt.event.ActionListener()
         * {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(registerPropertyButton);
        registerPropertyButton.setBounds(620, 440, 200, 40);

        searchLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchLabel.setText("Search for a property");
        add(searchLabel);
        searchLabel.setBounds(50, 110, 240, 30);

        revalidate();
        repaint();
        view.pack();
    }

    public void loggedInManager() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(878, 750));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(50, 20, 260, 70);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 710, 170, 20);

        managerLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        managerLabel.setForeground(new java.awt.Color(255, 255, 255));
        managerLabel.setText("Manager");
        add(managerLabel);
        managerLabel.setBounds(650, 270, 150, 40);

        propertyList.setBackground(new java.awt.Color(0, 0, 0));
        propertyList.setForeground(new java.awt.Color(255, 255, 255));
        propertyList.setModel(propertyListModel);

        jScrollPane1.setViewportView(propertyList);

        add(jScrollPane1);
        jScrollPane1.setBounds(60, 250, 500, 450);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator1);
        jSeparator1.setBounds(0, 230, 880, 20);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator2);
        jSeparator2.setBounds(0, 90, 880, 20);

        propertyTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        propertyTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        propertyTypeLabel.setText("Property Type");
        add(propertyTypeLabel);
        propertyTypeLabel.setBounds(30, 160, 90, 20);

        bedroomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bedroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        bedroomLabel.setText("Bedrooms");
        add(bedroomLabel);
        bedroomLabel.setBounds(170, 160, 80, 20);

        bathroomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bathroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        bathroomLabel.setText("Bathrooms");
        add(bathroomLabel);
        bathroomLabel.setBounds(260, 160, 80, 20);

        propertyTypeComboBox.setBackground(new java.awt.Color(255, 255, 255));
        propertyTypeComboBox.setForeground(java.awt.Color.black);
        propertyTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Apartment", "Basement", "Condo", "Attached", "Detached", "Room", "Garage" }));
        /*
         * propertyTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(propertyTypeComboBox);
        propertyTypeComboBox.setBounds(20, 190, 120, 20);

        bathroomSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(bathroomSpinner);
        bathroomSpinner.setBounds(250, 190, 50, 20);

        bedroomSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(bedroomSpinner);
        bedroomSpinner.setBounds(160, 190, 50, 20);

        furnishedLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        furnishedLabel.setForeground(new java.awt.Color(255, 255, 255));
        furnishedLabel.setText("Furnished");
        add(furnishedLabel);
        furnishedLabel.setBounds(350, 160, 80, 20);

        furnishedComboBox.setBackground(new java.awt.Color(255, 255, 255));
        furnishedComboBox.setForeground(java.awt.Color.black);
        furnishedComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        add(furnishedComboBox);
        furnishedComboBox.setBounds(340, 190, 80, 20);

        maxRentLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxRentLabel.setForeground(new java.awt.Color(255, 255, 255));
        maxRentLabel.setText("Max Rent");
        add(maxRentLabel);
        maxRentLabel.setBounds(460, 160, 70, 20);

        maxRentText.setBackground(java.awt.Color.black);
        maxRentText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * maxRentText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(maxRentText);
        maxRentText.setBounds(440, 190, 110, 20);

        cityQuadrantLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityQuadrantLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityQuadrantLabel.setText("City Quadrant");
        add(cityQuadrantLabel);
        cityQuadrantLabel.setBounds(570, 160, 90, 20);

        cityQuadrantComboBox.setBackground(new java.awt.Color(255, 255, 255));
        cityQuadrantComboBox.setForeground(java.awt.Color.black);
        cityQuadrantComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NE", "NW", "SE", "SW" }));
        add(cityQuadrantComboBox);
        cityQuadrantComboBox.setBounds(570, 190, 80, 20);

        mottoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mottoLabel.setForeground(new java.awt.Color(255, 255, 255));
        mottoLabel.setText("why RentFaster when you can RentSlower!");
        add(mottoLabel);
        mottoLabel.setBounds(350, 40, 470, 30);

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(0, 0, 0));
        searchButton.setText("Search");
        /*
         * searchButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(searchButton);
        searchButton.setBounds(720, 140, 110, 40);

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 0, 0));
        logoutButton.setText("Logout");
        /*
         * logoutButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(logoutButton);
        logoutButton.setBounds(740, 670, 100, 40);

        searchLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchLabel.setText("Search for a property");
        add(searchLabel);
        searchLabel.setBounds(50, 110, 240, 30);

        changeFeesButton.setBackground(new java.awt.Color(255, 255, 255));
        changeFeesButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        changeFeesButton.setForeground(new java.awt.Color(0, 0, 0));
        changeFeesButton.setText("Change Fees");
        /*
         * changeFeesButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(changeFeesButton);
        changeFeesButton.setBounds(640, 420, 150, 40);

        generateSummaryReportButton.setBackground(new java.awt.Color(255, 255, 255));
        generateSummaryReportButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        generateSummaryReportButton.setForeground(new java.awt.Color(0, 0, 0));
        generateSummaryReportButton.setText("Generate Summary Report");
        /*
         * generateSummaryReportButton.addActionListener(new
         * java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(generateSummaryReportButton);
        generateSummaryReportButton.setBounds(580, 560, 280, 40);

        manageAllPropertiesButton.setBackground(new java.awt.Color(255, 255, 255));
        manageAllPropertiesButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageAllPropertiesButton.setForeground(new java.awt.Color(0, 0, 0));
        manageAllPropertiesButton.setText("Manage All Properties");
        /*
         * manageAllPropertiesButton.addActionListener(new
         * java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(manageAllPropertiesButton);
        manageAllPropertiesButton.setBounds(590, 350, 250, 40);

        viewCompanyDatabaseButton.setBackground(new java.awt.Color(255, 255, 255));
        viewCompanyDatabaseButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewCompanyDatabaseButton.setForeground(new java.awt.Color(0, 0, 0));
        viewCompanyDatabaseButton.setText("View Company Database");
        /*
         * viewCompanyDatabaseButton.addActionListener(new
         * java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(viewCompanyDatabaseButton);
        viewCompanyDatabaseButton.setBounds(590, 490, 260, 40);

        revalidate();
        repaint();
        view.pack();
    }

    // getter methods

    public javax.swing.JLabel getBathroomLabel() {
        return bathroomLabel;
    }

    public javax.swing.JSpinner getBathroomSpinner() {
        return bathroomSpinner;
    }

    public javax.swing.JLabel getBedroomLabel() {
        return bedroomLabel;
    }

    public javax.swing.JSpinner getBedroomSpinner() {
        return bedroomSpinner;
    }

    public javax.swing.JComboBox<String> getCityQuadrantComboBox() {
        return cityQuadrantComboBox;
    }

    public javax.swing.JLabel getCityQuadrantLabel() {
        return cityQuadrantLabel;
    }

    public javax.swing.JLabel getCopyrightLabel() {
        return copyrightLabel;
    }

    public javax.swing.JComboBox<String> getFurnishedComboBox() {
        return furnishedComboBox;
    }

    public javax.swing.JLabel getFurnishedLabel() {
        return furnishedLabel;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public javax.swing.JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public javax.swing.JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public javax.swing.JLabel getJoinTodayLabel() {
        return joinTodayLabel;
    }

    public javax.swing.JButton getLoginButton() {
        return loginButton;
    }

    public javax.swing.JLabel getMaxRentLabel() {
        return maxRentLabel;
    }

    public javax.swing.JTextField getMaxRentText() {
        return maxRentText;
    }

    public javax.swing.JLabel getMottoLabel() {
        return mottoLabel;
    }

    public javax.swing.JLabel getOrLabel() {
        return orLabel;
    }

    public javax.swing.JList<Property> getPropertyList() {
        return propertyList;
    }

    public javax.swing.JComboBox<String> getPropertyTypeComboBox() {
        return propertyTypeComboBox;
    }

    public javax.swing.JLabel getPropertyTypeLabel() {
        return propertyTypeLabel;
    }

    public javax.swing.JLabel getRentSlowerLabel() {
        return rentSlowerLabel;
    }

    public javax.swing.JButton getSearchButton() {
        return searchButton;
    }

    public javax.swing.JLabel getSearchLabel() {
        return searchLabel;
    }

    public javax.swing.JButton getSignupButton() {
        return signupButton;
    }

    public DefaultListModel<Property> getPropertyListModel() {
        return propertyListModel;
    }

    public javax.swing.JLabel getLogoLabel() {
        return logoLabel;
    }

    public javax.swing.JButton getStartButton() {
        return startButton;
    }

    public javax.swing.JLabel getWelcomeLabel() {
        return welcomeLabel;
    }

    public javax.swing.JButton getLogoutButton() {
        return logoutButton;
    }

    public javax.swing.JButton getManageSubscriptionButton() {
        return manageSubscriptionButton;
    }

    public javax.swing.JLabel getRenterLabel() {
        return renterLabel;
    }

    public javax.swing.JLabel getLandlordLabel() {
        return landlordLabel;
    }

    public javax.swing.JButton getManageMyPropertiesButton() {
        return manageMyPropertiesButton;
    }

    public javax.swing.JButton getRegisterPropertyButton() {
        return registerPropertyButton;
    }

    public javax.swing.JButton getChangeFeesButton() {
        return changeFeesButton;
    }

    public javax.swing.JButton getGenerateSummaryReportButton() {
        return generateSummaryReportButton;
    }

    public javax.swing.JButton getManageAllPropertiesButton() {
        return manageAllPropertiesButton;
    }

    public javax.swing.JLabel getManagerLabel() {
        return managerLabel;
    }

    public javax.swing.JButton getViewCompanyDatabaseButton() {
        return viewCompanyDatabaseButton;
    }
}
