package presentation.guicomponents;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import business.businesslogic.Property;

/**
 * Class ManageLandlordPropertiesGUI: a panel to display landlord properties,
 * with options to manipulate them
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @version 1.0
 */
public class ManageLandlordPropertiesGUI extends JPanel {
    private Frontend view;

    // Variables declaration - do not modify
    private javax.swing.JLabel changePropertyStateLabel = new javax.swing.JLabel();
    private javax.swing.JButton changeStateButton = new javax.swing.JButton();
    private javax.swing.JComboBox<String> changeStateComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel copyrightLabel = new javax.swing.JLabel();
    private javax.swing.JButton dashboardButton = new javax.swing.JButton();
    private javax.swing.JButton deleteButton = new javax.swing.JButton();
    private javax.swing.JLabel deletePropertyListingLabel = new javax.swing.JLabel();
    private javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    private javax.swing.JLabel manageLandlordPropertiesLabel = new javax.swing.JLabel();
    private javax.swing.JList<Property> propertyList = new javax.swing.JList<Property>();
    private javax.swing.JLabel rentSlowerLabel = new javax.swing.JLabel();
    // End of variables declaration

    // landlord properties
    private DefaultListModel<Property> propertyListModel = new DefaultListModel<Property>();

    /**
     * ManageLandlordPropertiesGUI constructor, used by Frontend
     * 
     * @param view Frontend JFrame
     */
    public ManageLandlordPropertiesGUI(Frontend view) {
        // assign view reference
        this.view = view;
        manageProperties();
    }

    /**
     * Update ManageLandlordPropertiesGUIs property list model
     * 
     * @param updatedPropertyListModel ArrayList<Property> updated list of
     *                                 properties
     */
    public void updatePropertiesView(ArrayList<Property> updatedPropertyListModel) {
        this.propertyListModel.clear();
        for (Property p : updatedPropertyListModel) {
            this.propertyListModel.addElement(p);
        }
    }

    /**
     * Instantiate manage properties layout
     */
    public void manageProperties() {
        // remove all components from the panel
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(752, 418));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(110, 30, 260, 70);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 380, 170, 20);

        manageLandlordPropertiesLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        manageLandlordPropertiesLabel.setForeground(new java.awt.Color(255, 255, 255));
        manageLandlordPropertiesLabel.setText("Manage Landlord Properties");
        add(manageLandlordPropertiesLabel);
        manageLandlordPropertiesLabel.setBounds(90, 110, 320, 29);

        propertyList.setBackground(new java.awt.Color(0, 0, 0));
        propertyList.setForeground(new java.awt.Color(255, 255, 255));
        propertyList.setModel(propertyListModel);
        propertyList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (!evt.getValueIsAdjusting()) {
                    displayChoices();
                }
            }
        });

        jScrollPane1.setViewportView(propertyList);

        add(jScrollPane1);
        jScrollPane1.setBounds(60, 160, 450, 200);

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
        dashboardButton.setBounds(680, 20, 50, 40);

        // revalidate, repaint, then pack frame
        revalidate();
        repaint();
        view.pack();
    }

    /**
     * Instantiate choices for property manipulation
     */
    public void displayChoices() {
        changePropertyStateLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        changePropertyStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        changePropertyStateLabel.setText("Change Property State");
        add(changePropertyStateLabel);
        changePropertyStateLabel.setBounds(560, 140, 150, 20);

        changeStateComboBox.setBackground(new java.awt.Color(255, 255, 255));
        changeStateComboBox.setForeground(java.awt.Color.black);
        changeStateComboBox
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inactive", "Active", "Rented" }));
        /*
         * changeStateComboBox.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(changeStateComboBox);
        changeStateComboBox.setBounds(570, 170, 120, 20);

        changeStateButton.setBackground(new java.awt.Color(255, 255, 255));
        changeStateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        changeStateButton.setForeground(new java.awt.Color(0, 0, 0));
        changeStateButton.setText("Change State");
        /*
         * changeStateButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(changeStateButton);
        changeStateButton.setBounds(550, 200, 160, 40);

        deletePropertyListingLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deletePropertyListingLabel.setForeground(new java.awt.Color(255, 255, 255));
        deletePropertyListingLabel.setText("Delete Property Listing");
        add(deletePropertyListingLabel);
        deletePropertyListingLabel.setBounds(560, 260, 140, 20);

        deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(0, 0, 0));
        deleteButton.setText("Delete");
        /*
         * deleteButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(deleteButton);
        deleteButton.setBounds(570, 290, 120, 40);

        // revalidate and repaint
        revalidate();
        repaint();
    }

    // getter methods

    /**
     * changePropertyStateLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getChangePropertyStateLabel() {
        return changePropertyStateLabel;
    }

    /**
     * changeStateButton getter method
     * 
     * @return JButton
     */
    public javax.swing.JButton getChangeStateButton() {
        return changeStateButton;
    }

    /**
     * changeStateComboBox getter method
     * 
     * @return JComboBox<String>
     */
    public javax.swing.JComboBox<String> getChangeStateComboBox() {
        return changeStateComboBox;
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
     * dashboardButton getter method
     * 
     * @return JButton
     */
    public javax.swing.JButton getDashboardButton() {
        return dashboardButton;
    }

    /**
     * deleteButton getter method
     * 
     * @return JButton
     */
    public javax.swing.JButton getDeleteButton() {
        return deleteButton;
    }

    /**
     * deletePropertyListingLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getDeletePropertyListingLabel() {
        return deletePropertyListingLabel;
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
     * manageLandlordPropertiesLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getManageLandlordPropertiesLabel() {
        return manageLandlordPropertiesLabel;
    }

    /**
     * propertyList getter method
     * 
     * @return JList<Property>
     */
    public javax.swing.JList<Property> getPropertyList() {
        return propertyList;
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
     * propertyListModel getter method
     * 
     * @return DefaultListMode<Property>
     */
    public DefaultListModel<Property> getPropertyListModel() {
        return propertyListModel;
    }
}
