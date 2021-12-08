package presentation.guicomponents;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import business.businesslogic.Property;

/**
 * Class ManageManagerPropertiesGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @version 1.0
 */
public class ManageManagerPropertiesGUI extends JPanel {
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
    private javax.swing.JLabel manageAllPropertiesLabel = new javax.swing.JLabel();
    private javax.swing.JList<Property> propertyList = new javax.swing.JList<Property>();
    private javax.swing.JLabel rentSlowerLabel = new javax.swing.JLabel();
    // End of variables declaration

    // all properties
    private DefaultListModel<Property> propertyListModel = new DefaultListModel<Property>();

    public ManageManagerPropertiesGUI(Frontend view) {
        // assign view reference
        this.view = view;
        ArrayList<Property> list = new ArrayList<Property>();
        list.add(new Property());
        list.add(new Property());
        updatePropertiesView(list);
        manageProperties();
    }

    // update Property list model
    public void updatePropertiesView(ArrayList<Property> updatedPropertyListModel) {
        this.propertyListModel.clear();
        for (Property p : updatedPropertyListModel) {
            this.propertyListModel.addElement(p);
        }
    }

    public void manageProperties() {
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
        copyrightLabel.setBounds(20, 390, 170, 20);

        manageAllPropertiesLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        manageAllPropertiesLabel.setForeground(new java.awt.Color(255, 255, 255));
        manageAllPropertiesLabel.setText("Manage All Properties");
        add(manageAllPropertiesLabel);
        manageAllPropertiesLabel.setBounds(120, 110, 240, 29);

        propertyList.setBackground(new java.awt.Color(0, 0, 0));
        propertyList.setForeground(new java.awt.Color(255, 255, 255));
        propertyList.setModel(propertyListModel);
        propertyList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
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

        revalidate();
        repaint();
        view.pack();
    }

    public void displayChoices() {
        changePropertyStateLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        changePropertyStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        changePropertyStateLabel.setText("Change Property State");
        add(changePropertyStateLabel);
        changePropertyStateLabel.setBounds(560, 140, 150, 20);

        changeStateComboBox.setBackground(new java.awt.Color(255, 255, 255));
        changeStateComboBox.setForeground(java.awt.Color.black);
        changeStateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Inactive", "Active", "Rented", "Suspended", "Cancelled" }));
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

        revalidate();
        repaint();
    }

    public javax.swing.JLabel getChangePropertyStateLabel() {
        return changePropertyStateLabel;
    }

    public javax.swing.JButton getChangeStateButton() {
        return changeStateButton;
    }

    public javax.swing.JComboBox<String> getChangeStateComboBox() {
        return changeStateComboBox;
    }

    public javax.swing.JLabel getCopyrightLabel() {
        return copyrightLabel;
    }

    public javax.swing.JButton getDashboardButton() {
        return dashboardButton;
    }

    public javax.swing.JButton getDeleteButton() {
        return deleteButton;
    }

    public javax.swing.JLabel getDeletePropertyListingLabel() {
        return deletePropertyListingLabel;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public javax.swing.JLabel getManageAllPropertiesLabel() {
        return manageAllPropertiesLabel;
    }

    public javax.swing.JList<Property> getPropertyList() {
        return propertyList;
    }

    public javax.swing.JLabel getRentSlowerLabel() {
        return rentSlowerLabel;
    }

    public DefaultListModel<Property> getPropertyListModel() {
        return propertyListModel;
    }
}
