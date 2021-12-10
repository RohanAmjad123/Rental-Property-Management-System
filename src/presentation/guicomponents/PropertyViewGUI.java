package presentation.guicomponents;

import javax.swing.*;
import business.businesslogic.Property;

/**
 * Class PropertyViewGUI: a panel to display the details of a property and allow
 * a user email the property landlord
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @version 1.0
 */
public class PropertyViewGUI extends JPanel {
    private Frontend view;

    // Variables declaration - do not modify
    private javax.swing.JLabel addressLabel = new javax.swing.JLabel();
    private javax.swing.JButton backButton = new javax.swing.JButton();
    private javax.swing.JLabel bathrooms = new javax.swing.JLabel();
    private javax.swing.JLabel bathroomsLabel = new javax.swing.JLabel();
    private javax.swing.JLabel bedrooms = new javax.swing.JLabel();
    private javax.swing.JLabel bedroomsLabel = new javax.swing.JLabel();
    private javax.swing.JLabel city = new javax.swing.JLabel();
    private javax.swing.JLabel cityQuadrant = new javax.swing.JLabel();
    private javax.swing.JLabel copyrightLabel = new javax.swing.JLabel();
    private javax.swing.JLabel country = new javax.swing.JLabel();
    private javax.swing.JLabel descriptionLabel = new javax.swing.JLabel();
    private javax.swing.JTextArea descriptionTextArea = new javax.swing.JTextArea();
    private javax.swing.JLabel emailLandlordLabel = new javax.swing.JLabel();
    private javax.swing.JTextArea emailLandlordTextArea = new javax.swing.JTextArea();
    private javax.swing.JLabel furnished = new javax.swing.JLabel();
    private javax.swing.JLabel furnishedLabel = new javax.swing.JLabel();
    private javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    private javax.swing.JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
    private javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
    private javax.swing.JSeparator jSeparator2 = new javax.swing.JSeparator();
    private javax.swing.JLabel mottoLabel = new javax.swing.JLabel();
    private javax.swing.JLabel postalCode = new javax.swing.JLabel();
    private javax.swing.JLabel propertyType = new javax.swing.JLabel();
    private javax.swing.JLabel propertyTypeLabel = new javax.swing.JLabel();
    private javax.swing.JLabel provinceState = new javax.swing.JLabel();
    private javax.swing.JLabel rent = new javax.swing.JLabel();
    private javax.swing.JLabel rentLabel = new javax.swing.JLabel();
    private javax.swing.JLabel rentSlowerLabel = new javax.swing.JLabel();
    private javax.swing.JButton sendEmailButton = new javax.swing.JButton();
    private javax.swing.JLabel squareFeet = new javax.swing.JLabel();
    private javax.swing.JLabel squareFeetLabel = new javax.swing.JLabel();
    private javax.swing.JLabel streetName = new javax.swing.JLabel();
    private javax.swing.JLabel titleLabel = new javax.swing.JLabel();
    // End of variables declaration

    // property model
    private Property propertyToBeViewed = new Property();

    /**
     * PropertyViewGUI constructor, used by Frontend
     * 
     * @param view Frontend JFrame
     */
    public PropertyViewGUI(Frontend view) {
        // assign view reference
        this.view = view;
        propertyView();
    }

    /**
     * Update PropertyViewGUIs property model
     * 
     * @param updatedProperty Property updated property
     */
    public void updatePropertyView(Property updatedProperty) {
        this.propertyToBeViewed = updatedProperty;
    }

    /**
     * Instantiate property view layout
     */
    public void propertyView() {
        // remove all components from panel
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
        copyrightLabel.setBounds(20, 720, 170, 20);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator1);
        jSeparator1.setBounds(0, 180, 880, 20);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator2);
        jSeparator2.setBounds(0, 90, 880, 20);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText(propertyToBeViewed.getTitle());
        add(titleLabel);
        titleLabel.setBounds(50, 120, 740, 30);

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("Back");
        /*
         * backButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(backButton);
        backButton.setBounds(400, 670, 100, 40);

        mottoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mottoLabel.setForeground(new java.awt.Color(255, 255, 255));
        mottoLabel.setText("why RentFaster when you can RentSlower!");
        add(mottoLabel);
        mottoLabel.setBounds(350, 40, 470, 30);

        bathroomsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bathroomsLabel.setForeground(new java.awt.Color(255, 255, 255));
        bathroomsLabel.setText("Bathrooms");
        add(bathroomsLabel);
        bathroomsLabel.setBounds(400, 390, 130, 30);

        descriptionTextArea.setEditable(false);
        descriptionTextArea.setBackground(new java.awt.Color(0, 0, 0));
        descriptionTextArea.setColumns(20);
        descriptionTextArea.setForeground(new java.awt.Color(255, 255, 255));
        descriptionTextArea.setRows(5);
        descriptionTextArea.setText(propertyToBeViewed.getDescription());
        jScrollPane1.setViewportView(descriptionTextArea);

        add(jScrollPane1);
        jScrollPane1.setBounds(50, 250, 460, 120);

        emailLandlordLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        emailLandlordLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLandlordLabel.setText("Email Landlord");
        add(emailLandlordLabel);
        emailLandlordLabel.setBounds(610, 200, 170, 30);

        propertyTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        propertyTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        propertyTypeLabel.setText("Property Type");
        add(propertyTypeLabel);
        propertyTypeLabel.setBounds(60, 390, 160, 30);

        bedroomsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bedroomsLabel.setForeground(new java.awt.Color(255, 255, 255));
        bedroomsLabel.setText("Bedrooms");
        add(bedroomsLabel);
        bedroomsLabel.setBounds(240, 390, 120, 30);

        rentLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rentLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentLabel.setText("Rent");
        add(rentLabel);
        rentLabel.setBounds(400, 470, 60, 30);

        country.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        country.setForeground(new java.awt.Color(255, 255, 255));
        country.setText(propertyToBeViewed.getAddress().getCountry());
        add(country);
        country.setBounds(160, 680, 70, 20);

        squareFeetLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        squareFeetLabel.setForeground(new java.awt.Color(255, 255, 255));
        squareFeetLabel.setText("Square Feet");
        add(squareFeetLabel);
        squareFeetLabel.setBounds(240, 470, 140, 30);

        furnishedLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        furnishedLabel.setForeground(new java.awt.Color(255, 255, 255));
        furnishedLabel.setText("Furnished");
        add(furnishedLabel);
        furnishedLabel.setBounds(60, 470, 120, 30);

        addressLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Address");
        add(addressLabel);
        addressLabel.setBounds(60, 560, 80, 30);

        bathrooms.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bathrooms.setForeground(new java.awt.Color(255, 255, 255));
        bathrooms.setText(String.valueOf(propertyToBeViewed.getBathrooms()));
        add(bathrooms);
        bathrooms.setBounds(400, 430, 100, 20);

        cityQuadrant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cityQuadrant.setForeground(new java.awt.Color(255, 255, 255));
        cityQuadrant.setText(propertyToBeViewed.getAddress().getCityQuadrant());
        add(cityQuadrant);
        cityQuadrant.setBounds(370, 560, 120, 20);

        postalCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        postalCode.setForeground(new java.awt.Color(255, 255, 255));
        postalCode.setText(propertyToBeViewed.getAddress().getPostalCode());
        add(postalCode);
        postalCode.setBounds(160, 590, 120, 20);

        city.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        city.setForeground(new java.awt.Color(255, 255, 255));
        city.setText(propertyToBeViewed.getAddress().getCity());
        add(city);
        city.setBounds(160, 620, 120, 20);

        provinceState.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        provinceState.setForeground(new java.awt.Color(255, 255, 255));
        provinceState.setText(propertyToBeViewed.getAddress().getStateProvince());
        add(provinceState);
        provinceState.setBounds(160, 650, 120, 20);

        streetName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        streetName.setForeground(new java.awt.Color(255, 255, 255));
        streetName.setText(propertyToBeViewed.getAddress().getStreetName());
        add(streetName);
        streetName.setBounds(160, 560, 200, 20);

        rent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rent.setForeground(new java.awt.Color(255, 255, 255));
        rent.setText(String.valueOf(propertyToBeViewed.getRent()));
        add(rent);
        rent.setBounds(400, 510, 100, 20);

        bedrooms.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bedrooms.setForeground(new java.awt.Color(255, 255, 255));
        bedrooms.setText(String.valueOf(propertyToBeViewed.getBedrooms()));
        add(bedrooms);
        bedrooms.setBounds(240, 430, 100, 20);

        propertyType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        propertyType.setForeground(new java.awt.Color(255, 255, 255));
        propertyType.setText(propertyToBeViewed.getPropertyType());
        add(propertyType);
        propertyType.setBounds(60, 430, 160, 20);

        furnished.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        furnished.setForeground(new java.awt.Color(255, 255, 255));
        furnished.setText(propertyToBeViewed.getFurnished());
        add(furnished);
        furnished.setBounds(60, 510, 80, 20);

        squareFeet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        squareFeet.setForeground(new java.awt.Color(255, 255, 255));
        squareFeet.setText(String.valueOf(propertyToBeViewed.getSquareFeet()));
        add(squareFeet);
        squareFeet.setBounds(240, 510, 100, 20);

        descriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLabel.setText("Description");
        add(descriptionLabel);
        descriptionLabel.setBounds(50, 200, 140, 30);

        emailLandlordTextArea.setBackground(new java.awt.Color(0, 0, 0));
        emailLandlordTextArea.setColumns(20);
        emailLandlordTextArea.setForeground(new java.awt.Color(255, 255, 255));
        emailLandlordTextArea.setRows(5);
        jScrollPane2.setViewportView(emailLandlordTextArea);

        add(jScrollPane2);
        jScrollPane2.setBounds(550, 250, 290, 280);

        sendEmailButton.setBackground(new java.awt.Color(255, 255, 255));
        sendEmailButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sendEmailButton.setForeground(new java.awt.Color(0, 0, 0));
        sendEmailButton.setText("Send Email");
        /*
         * sendEmailButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(sendEmailButton);
        sendEmailButton.setBounds(620, 560, 150, 40);

        // revalidate, repaint, then pack frame
        revalidate();
        repaint();
        view.pack();
    }

    // getter methods

    /**
     * addressLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getAddressLabel() {
        return addressLabel;
    }

    /**
     * backButton getter method
     * 
     * @return JButton
     */
    public javax.swing.JButton getBackButton() {
        return backButton;
    }

    /**
     * bathroom getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getBathrooms() {
        return bathrooms;
    }

    /**
     * bathroomsLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getBathroomsLabel() {
        return bathroomsLabel;
    }

    /**
     * bedrooms getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getBedrooms() {
        return bedrooms;
    }

    /**
     * bedroomsLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getBedroomsLabel() {
        return bedroomsLabel;
    }

    /**
     * city getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getCity() {
        return city;
    }

    /**
     * cityQuadrant getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getCityQuadrant() {
        return cityQuadrant;
    }

    /**
     * copyrightLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getCopyrightLabel() {
        return copyrightLabel;
    }

    /**
     * country getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getCountry() {
        return country;
    }

    /**
     * descriptionLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getDescriptionLabel() {
        return descriptionLabel;
    }

    /**
     * descriptionTextArea getter method
     * 
     * @return JTextArea
     */
    public javax.swing.JTextArea getDescriptionTextArea() {
        return descriptionTextArea;
    }

    /**
     * emailLandlordLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getEmailLandlordLabel() {
        return emailLandlordLabel;
    }

    /**
     * emailLandlordTextArea getter method
     * 
     * @return JTextArea
     */
    public javax.swing.JTextArea getEmailLandlordTextArea() {
        return emailLandlordTextArea;
    }

    /**
     * furnished getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getFurnished() {
        return furnished;
    }

    /**
     * furnishedLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getFurnishedLabel() {
        return furnishedLabel;
    }

    /**
     * jScrollPane1 getter method
     * 
     * @return JScrollPane
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * jScrollPane2 getter method
     * 
     * @return JScrollPane
     */
    public javax.swing.JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    /**
     * jSeparator1 getter method
     * 
     * @return JSeparator
     */
    public javax.swing.JSeparator getjSeparator1() {
        return jSeparator1;
    }

    /**
     * jSeparator2 getter method
     * 
     * @return JSeparator
     */
    public javax.swing.JSeparator getjSeparator2() {
        return jSeparator2;
    }

    /**
     * mottoLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getMottoLabel() {
        return mottoLabel;
    }

    /**
     * postalCode getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getPostalCode() {
        return postalCode;
    }

    /**
     * propertyType getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getPropertyType() {
        return propertyType;
    }

    /**
     * propertyTypeLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getPropertyTypeLabel() {
        return propertyTypeLabel;
    }

    /**
     * provinceState getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getProvinceState() {
        return provinceState;
    }

    /**
     * rent getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getRent() {
        return rent;
    }

    /**
     * rentLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getRentLabel() {
        return rentLabel;
    }

    /**
     * rentSlowerLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getRentSlowerLabel() {
        return rentSlowerLabel;
    }

    /**
     * sendEmailButton getter method
     * 
     * @return JButton
     */
    public javax.swing.JButton getSendEmailButton() {
        return sendEmailButton;
    }

    /**
     * squareFeet getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getSquareFeet() {
        return squareFeet;
    }

    /**
     * squareFeetLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getSquareFeetLabel() {
        return squareFeetLabel;
    }

    /**
     * streetName getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getStreetName() {
        return streetName;
    }

    /**
     * titleLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getTitleLabel() {
        return titleLabel;
    }

    /**
     * propertyToBeViewed getter method
     * 
     * @return Property
     */
    public Property getPropertyToBeViewed() {
        return propertyToBeViewed;
    }
}
