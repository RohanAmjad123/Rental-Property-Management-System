package presentation.guicomponents;

import javax.swing.*;

/**
 * Class AddSearchCriteriaFormGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @version 1.0
 */
public class EditSearchCriteriaFormGUI extends JPanel {
    private Frontend view;

    // Variables declaration - do not modify
    private javax.swing.JLabel bathroomLabel = new javax.swing.JLabel();
    private javax.swing.JSpinner bathroomSpinner = new javax.swing.JSpinner();
    private javax.swing.JLabel bedroomLabel = new javax.swing.JLabel();
    private javax.swing.JSpinner bedroomSpinner = new javax.swing.JSpinner();
    private javax.swing.JComboBox<String> cityQuadrantComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel cityQuadrantLabel = new javax.swing.JLabel();
    private javax.swing.JLabel copyrightLabel = new javax.swing.JLabel();
    private javax.swing.JButton dashboardButton = new javax.swing.JButton();
    private javax.swing.JLabel editRenterSubscriptionLabel = new javax.swing.JLabel();
    private javax.swing.JComboBox<String> furnishedComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel furnishedLabel = new javax.swing.JLabel();
    private javax.swing.JLabel maxRentLabel = new javax.swing.JLabel();
    private javax.swing.JTextField maxRentText = new javax.swing.JTextField();
    private javax.swing.JComboBox<String> propertyTypeComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel propertyTypeLabel = new javax.swing.JLabel();
    private javax.swing.JLabel rentSlowerLabel = new javax.swing.JLabel();
    private javax.swing.JButton unsubscribeButton = new javax.swing.JButton();
    private javax.swing.JButton updateButton = new javax.swing.JButton();
    // End of variables declaration

    public EditSearchCriteriaFormGUI(Frontend view) {
        // assign view reference
        this.view = view;
        editSearchCriteriaForm();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void editSearchCriteriaForm() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(636, 412));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(190, 30, 260, 70);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 380, 170, 20);

        editRenterSubscriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        editRenterSubscriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        editRenterSubscriptionLabel.setText("Edit Renter Subscription");
        add(editRenterSubscriptionLabel);
        editRenterSubscriptionLabel.setBounds(190, 110, 270, 30);

        unsubscribeButton.setBackground(new java.awt.Color(255, 255, 255));
        unsubscribeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        unsubscribeButton.setForeground(new java.awt.Color(0, 0, 0));
        unsubscribeButton.setText("Unsubscribe");
        /*
         * unsubscribeButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(unsubscribeButton);
        unsubscribeButton.setBounds(320, 320, 150, 40);

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
        dashboardButton.setBounds(560, 20, 50, 40);

        updateButton.setBackground(new java.awt.Color(255, 255, 255));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(0, 0, 0));
        updateButton.setText("Update");
        /*
         * updateButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(updateButton);
        updateButton.setBounds(170, 320, 120, 40);

        propertyTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        propertyTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        propertyTypeLabel.setText("Property Type");
        add(propertyTypeLabel);
        propertyTypeLabel.setBounds(90, 160, 90, 20);

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
        propertyTypeComboBox.setBounds(80, 190, 120, 20);

        bedroomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bedroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        bedroomLabel.setText("Bedrooms");
        add(bedroomLabel);
        bedroomLabel.setBounds(250, 160, 80, 20);

        bedroomSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(bedroomSpinner);
        bedroomSpinner.setBounds(240, 190, 50, 20);

        bathroomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bathroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        bathroomLabel.setText("Bathrooms");
        add(bathroomLabel);
        bathroomLabel.setBounds(360, 160, 80, 20);

        bathroomSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(bathroomSpinner);
        bathroomSpinner.setBounds(350, 190, 50, 20);

        maxRentLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxRentLabel.setForeground(new java.awt.Color(255, 255, 255));
        maxRentLabel.setText("Max Rent");
        add(maxRentLabel);
        maxRentLabel.setBounds(470, 160, 80, 20);

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
        maxRentText.setBounds(450, 190, 110, 18);

        furnishedLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        furnishedLabel.setForeground(new java.awt.Color(255, 255, 255));
        furnishedLabel.setText("Furnished");
        add(furnishedLabel);
        furnishedLabel.setBounds(220, 230, 80, 20);

        furnishedComboBox.setBackground(new java.awt.Color(255, 255, 255));
        furnishedComboBox.setForeground(java.awt.Color.black);
        furnishedComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        add(furnishedComboBox);
        furnishedComboBox.setBounds(210, 260, 80, 20);

        cityQuadrantLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityQuadrantLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityQuadrantLabel.setText("City Quadrant");
        add(cityQuadrantLabel);
        cityQuadrantLabel.setBounds(330, 230, 90, 20);

        cityQuadrantComboBox.setBackground(new java.awt.Color(255, 255, 255));
        cityQuadrantComboBox.setForeground(java.awt.Color.black);
        cityQuadrantComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NE", "NW", "SE", "SW" }));
        add(cityQuadrantComboBox);
        cityQuadrantComboBox.setBounds(330, 260, 80, 20);

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

    public javax.swing.JButton getDashboardButton() {
        return dashboardButton;
    }

    public javax.swing.JLabel getEditRenterSubscriptionLabel() {
        return editRenterSubscriptionLabel;
    }

    public javax.swing.JComboBox<String> getFurnishedComboBox() {
        return furnishedComboBox;
    }

    public javax.swing.JLabel getFurnishedLabel() {
        return furnishedLabel;
    }

    public javax.swing.JLabel getMaxRentLabel() {
        return maxRentLabel;
    }

    public javax.swing.JTextField getMaxRentText() {
        return maxRentText;
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

    public javax.swing.JButton getUnsubscribeButton() {
        return unsubscribeButton;
    }

    public javax.swing.JButton getUpdateButton() {
        return updateButton;
    }
}
