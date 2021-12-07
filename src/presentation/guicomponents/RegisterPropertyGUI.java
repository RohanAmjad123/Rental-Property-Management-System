package presentation.guicomponents;

import javax.swing.*;

/**
 * Class RegisterPropertyGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */
public class RegisterPropertyGUI extends JPanel {
    private Frontend view;

    // Variables declaration - do not modify
    private javax.swing.JLabel bathroomLabel = new javax.swing.JLabel();
    private javax.swing.JSpinner bathroomSpinner = new javax.swing.JSpinner();
    private javax.swing.JLabel bedroomLabel = new javax.swing.JLabel();
    private javax.swing.JSpinner bedroomSpinner = new javax.swing.JSpinner();
    private javax.swing.JLabel cityLabel = new javax.swing.JLabel();
    private javax.swing.JComboBox<String> cityQuadrantComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel cityQuadrantLabel = new javax.swing.JLabel();
    private javax.swing.JTextField cityText = new javax.swing.JTextField();
    private javax.swing.JLabel copyrightLabel = new javax.swing.JLabel();
    private javax.swing.JLabel countryLabel = new javax.swing.JLabel();
    private javax.swing.JTextField countryText = new javax.swing.JTextField();
    private javax.swing.JButton dashboardButton = new javax.swing.JButton();
    private javax.swing.JLabel descriptionLabel = new javax.swing.JLabel();
    private javax.swing.JTextArea descriptionText = new javax.swing.JTextArea();
    private javax.swing.JComboBox<String> furnishedComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel furnishedLabel = new javax.swing.JLabel();
    private javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    private javax.swing.JLabel postalCodeLabel = new javax.swing.JLabel();
    private javax.swing.JTextField postalCodeText = new javax.swing.JTextField();
    private javax.swing.JComboBox<String> propertyTypeComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel propertyTypeLabel = new javax.swing.JLabel();
    private javax.swing.JLabel provinceStateLabel = new javax.swing.JLabel();
    private javax.swing.JTextField provinceStateText = new javax.swing.JTextField();
    private javax.swing.JLabel registerLandlordPropertyLabel = new javax.swing.JLabel();
    private javax.swing.JButton registerPropertyButton = new javax.swing.JButton();
    private javax.swing.JLabel rentLabel = new javax.swing.JLabel();
    private javax.swing.JLabel rentSlowerLabel = new javax.swing.JLabel();
    private javax.swing.JTextField rentText = new javax.swing.JTextField();
    private javax.swing.JLabel squareFeetLabel = new javax.swing.JLabel();
    private javax.swing.JTextField squareFeetText = new javax.swing.JTextField();
    private javax.swing.JLabel streetNameLabel = new javax.swing.JLabel();
    private javax.swing.JTextField streetNameText = new javax.swing.JTextField();
    private javax.swing.JLabel titleLabel = new javax.swing.JLabel();
    private javax.swing.JTextField titleText = new javax.swing.JTextField();
    // End of variables declaration

    // Variables declaration - do not modify
    private javax.swing.JButton finishButton = new javax.swing.JButton();
    private javax.swing.JLabel propertyRegistrationSuccessfulLabel = new javax.swing.JLabel();
    // End of variables declaration

    // Variables declaration - do not modify
    private javax.swing.JLabel propertyRegistrationUnsuccessfulLabel = new javax.swing.JLabel();
    private javax.swing.JButton tryAgainButton = new javax.swing.JButton();
    // End of variables declaration

    public RegisterPropertyGUI(Frontend view) {
        // assign view reference
        this.view = view;
        registrationForm();
    }

    public void registrationForm() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(480, 741));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(70, 20, 290, 70);

        registerLandlordPropertyLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        registerLandlordPropertyLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerLandlordPropertyLabel.setText("Register Landlord Property");
        add(registerLandlordPropertyLabel);
        registerLandlordPropertyLabel.setBounds(100, 100, 290, 30);

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
        registerPropertyButton.setBounds(250, 680, 200, 40);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 710, 170, 20);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Title");
        add(titleLabel);
        titleLabel.setBounds(70, 150, 80, 20);

        postalCodeText.setBackground(java.awt.Color.black);
        postalCodeText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * postalCodeText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(postalCodeText);
        postalCodeText.setBounds(310, 550, 130, 18);

        dashboardButton.setBackground(new java.awt.Color(255, 255, 255));
        dashboardButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(0, 0, 0));
        dashboardButton.setText("X");
        /*
         * dashboardButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(dashboardButton);
        dashboardButton.setBounds(410, 20, 50, 40);

        countryLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        countryLabel.setForeground(new java.awt.Color(255, 255, 255));
        countryLabel.setText("Country");
        add(countryLabel);
        countryLabel.setBounds(330, 590, 80, 20);

        descriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLabel.setText("Description");
        add(descriptionLabel);
        descriptionLabel.setBounds(70, 210, 80, 20);

        propertyTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        propertyTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        propertyTypeLabel.setText("Property Type");
        add(propertyTypeLabel);
        propertyTypeLabel.setBounds(60, 340, 90, 20);

        rentLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rentLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentLabel.setText("Rent");
        add(rentLabel);
        rentLabel.setBounds(310, 420, 80, 20);

        bedroomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bedroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        bedroomLabel.setText("Bedrooms");
        add(bedroomLabel);
        bedroomLabel.setBounds(220, 340, 80, 20);

        bathroomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bathroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        bathroomLabel.setText("Bathrooms");
        add(bathroomLabel);
        bathroomLabel.setBounds(330, 340, 80, 20);

        squareFeetLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        squareFeetLabel.setForeground(new java.awt.Color(255, 255, 255));
        squareFeetLabel.setText("Square Feet");
        add(squareFeetLabel);
        squareFeetLabel.setBounds(160, 420, 80, 20);

        furnishedLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        furnishedLabel.setForeground(new java.awt.Color(255, 255, 255));
        furnishedLabel.setText("Furnished");
        add(furnishedLabel);
        furnishedLabel.setBounds(60, 420, 80, 20);

        streetNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        streetNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        streetNameLabel.setText("Street Name");
        add(streetNameLabel);
        streetNameLabel.setBounds(50, 520, 80, 20);

        postalCodeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        postalCodeLabel.setForeground(new java.awt.Color(255, 255, 255));
        postalCodeLabel.setText("Postal Code");
        add(postalCodeLabel);
        postalCodeLabel.setBounds(330, 520, 80, 20);

        cityQuadrantLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityQuadrantLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityQuadrantLabel.setText("City Quadrant");
        add(cityQuadrantLabel);
        cityQuadrantLabel.setBounds(200, 520, 90, 20);

        cityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityLabel.setText("City");
        add(cityLabel);
        cityLabel.setBounds(50, 590, 80, 20);

        provinceStateLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        provinceStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        provinceStateLabel.setText("Province/State");
        add(provinceStateLabel);
        provinceStateLabel.setBounds(190, 590, 100, 20);

        descriptionText.setBackground(java.awt.Color.black);
        descriptionText.setColumns(20);
        descriptionText.setForeground(new java.awt.Color(255, 255, 255));
        descriptionText.setRows(5);
        jScrollPane1.setViewportView(descriptionText);

        add(jScrollPane1);
        jScrollPane1.setBounds(60, 240, 370, 80);

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
        propertyTypeComboBox.setBounds(50, 370, 120, 20);

        bathroomSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(bathroomSpinner);
        bathroomSpinner.setBounds(320, 370, 50, 20);

        bedroomSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(bedroomSpinner);
        bedroomSpinner.setBounds(210, 370, 50, 20);

        cityQuadrantComboBox.setBackground(new java.awt.Color(255, 255, 255));
        cityQuadrantComboBox.setForeground(java.awt.Color.black);
        cityQuadrantComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NE", "NW", "SE", "SW" }));
        add(cityQuadrantComboBox);
        cityQuadrantComboBox.setBounds(200, 550, 80, 20);

        titleText.setBackground(java.awt.Color.black);
        titleText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * titleText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(titleText);
        titleText.setBounds(60, 180, 270, 18);

        rentText.setBackground(java.awt.Color.black);
        rentText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * rentText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(rentText);
        rentText.setBounds(290, 450, 110, 18);

        squareFeetText.setBackground(java.awt.Color.black);
        squareFeetText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * squareFeetText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(squareFeetText);
        squareFeetText.setBounds(150, 450, 110, 18);

        streetNameText.setBackground(java.awt.Color.black);
        streetNameText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * streetNameText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(streetNameText);
        streetNameText.setBounds(40, 550, 130, 18);

        cityText.setBackground(java.awt.Color.black);
        cityText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * cityText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(cityText);
        cityText.setBounds(40, 620, 130, 18);

        provinceStateText.setBackground(java.awt.Color.black);
        provinceStateText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * provinceStateText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(provinceStateText);
        provinceStateText.setBounds(180, 620, 130, 18);

        countryText.setBackground(java.awt.Color.black);
        countryText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * countryText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(countryText);
        countryText.setBounds(320, 620, 130, 18);

        furnishedComboBox.setBackground(new java.awt.Color(255, 255, 255));
        furnishedComboBox.setForeground(java.awt.Color.black);
        furnishedComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        add(furnishedComboBox);
        furnishedComboBox.setBounds(50, 450, 80, 20);

        revalidate();
        repaint();
        view.pack();
    }

    public void successPage() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(436, 491));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(90, 20, 290, 70);

        propertyRegistrationSuccessfulLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        propertyRegistrationSuccessfulLabel.setForeground(new java.awt.Color(255, 255, 255));
        propertyRegistrationSuccessfulLabel.setText("Property Registration Successful!");
        add(propertyRegistrationSuccessfulLabel);
        propertyRegistrationSuccessfulLabel.setBounds(50, 180, 370, 40);

        finishButton.setBackground(new java.awt.Color(255, 255, 255));
        finishButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        finishButton.setForeground(new java.awt.Color(0, 0, 0));
        finishButton.setText("Finish");
        /*
         * finishButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(finishButton);
        finishButton.setBounds(160, 240, 120, 40);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 460, 170, 20);

        revalidate();
        repaint();
        view.pack();
    }

    public void errorPage() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(436, 491));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(90, 20, 290, 70);

        propertyRegistrationUnsuccessfulLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        propertyRegistrationUnsuccessfulLabel.setForeground(new java.awt.Color(255, 255, 255));
        propertyRegistrationUnsuccessfulLabel.setText("Property Registration Unsuccessful!");
        add(propertyRegistrationUnsuccessfulLabel);
        propertyRegistrationUnsuccessfulLabel.setBounds(30, 180, 390, 40);

        tryAgainButton.setBackground(new java.awt.Color(255, 255, 255));
        tryAgainButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tryAgainButton.setForeground(new java.awt.Color(0, 0, 0));
        tryAgainButton.setText("Try Again");
        /*
         * tryAgainButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(tryAgainButton);
        tryAgainButton.setBounds(160, 240, 120, 40);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 460, 170, 20);

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

    public javax.swing.JLabel getCityLabel() {
        return cityLabel;
    }

    public javax.swing.JComboBox<String> getCityQuadrantComboBox() {
        return cityQuadrantComboBox;
    }

    public javax.swing.JLabel getCityQuadrantLabel() {
        return cityQuadrantLabel;
    }

    public javax.swing.JTextField getCityText() {
        return cityText;
    }

    public javax.swing.JLabel getCopyrightLabel() {
        return copyrightLabel;
    }

    public javax.swing.JLabel getCountryLabel() {
        return countryLabel;
    }

    public javax.swing.JTextField getCountryText() {
        return countryText;
    }

    public javax.swing.JButton getDashboardButton() {
        return dashboardButton;
    }

    public javax.swing.JLabel getDescriptionLabel() {
        return descriptionLabel;
    }

    public javax.swing.JTextArea getDescriptionText() {
        return descriptionText;
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

    public javax.swing.JLabel getPostalCodeLabel() {
        return postalCodeLabel;
    }

    public javax.swing.JTextField getPostalCodeText() {
        return postalCodeText;
    }

    public javax.swing.JComboBox<String> getPropertyTypeComboBox() {
        return propertyTypeComboBox;
    }

    public javax.swing.JLabel getPropertyTypeLabel() {
        return propertyTypeLabel;
    }

    public javax.swing.JLabel getProvinceStateLabel() {
        return provinceStateLabel;
    }

    public javax.swing.JTextField getProvinceStateText() {
        return provinceStateText;
    }

    public javax.swing.JLabel getRegisterLandlordPropertyLabel() {
        return registerLandlordPropertyLabel;
    }

    public javax.swing.JButton getRegisterPropertyButton() {
        return registerPropertyButton;
    }

    public javax.swing.JLabel getRentLabel() {
        return rentLabel;
    }

    public javax.swing.JLabel getRentSlowerLabel() {
        return rentSlowerLabel;
    }

    public javax.swing.JTextField getRentText() {
        return rentText;
    }

    public javax.swing.JLabel getSquareFeetLabel() {
        return squareFeetLabel;
    }

    public javax.swing.JTextField getSquareFeetText() {
        return squareFeetText;
    }

    public javax.swing.JLabel getStreetNameLabel() {
        return streetNameLabel;
    }

    public javax.swing.JTextField getStreetNameText() {
        return streetNameText;
    }

    public javax.swing.JLabel getTitleLabel() {
        return titleLabel;
    }

    public javax.swing.JTextField getTitleText() {
        return titleText;
    }

    public javax.swing.JButton getFinishButton() {
        return finishButton;
    }

    public javax.swing.JLabel getPropertyRegistrationSuccessfulLabel() {
        return propertyRegistrationSuccessfulLabel;
    }

    public javax.swing.JLabel getPropertyRegistrationUnsuccessfulLabel() {
        return propertyRegistrationUnsuccessfulLabel;
    }

    public javax.swing.JButton getTryAgainButton() {
        return tryAgainButton;
    }
}
