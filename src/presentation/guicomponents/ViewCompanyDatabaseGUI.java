package presentation.guicomponents;

import java.util.ArrayList;
import javax.swing.*;
import business.businesslogic.Property;
import business.usermodels.User;

/**
 * Class ViewCompanyDatabaseGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @version 1.0
 */
public class ViewCompanyDatabaseGUI extends JPanel {
    private Frontend view;

    // Variables declaration - do not modify
    private javax.swing.JLabel chooseInformationLabel = new javax.swing.JLabel();
    private javax.swing.JLabel copyrightLabel = new javax.swing.JLabel();
    private javax.swing.JButton dashboardButton = new javax.swing.JButton();
    private javax.swing.JButton landlordButton = new javax.swing.JButton();
    private javax.swing.JLabel landlordLabel = new javax.swing.JLabel();
    private javax.swing.JButton propertyButton = new javax.swing.JButton();
    private javax.swing.JLabel propertyLabel = new javax.swing.JLabel();
    private javax.swing.JLabel rentSlowerLabel = new javax.swing.JLabel();
    private javax.swing.JButton renterButton = new javax.swing.JButton();
    private javax.swing.JLabel renterLabel = new javax.swing.JLabel();
    // End of variables declaration

    // Variables declaration - do not modify
    private javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    private javax.swing.JLabel renterInformationLabel = new javax.swing.JLabel();
    private javax.swing.JList<User> renterList = new javax.swing.JList<User>();
    // End of variables declaration

    // all renters
    private DefaultListModel<User> renterListModel = new DefaultListModel<User>();

    // Variables declaration - do not modify
    private javax.swing.JLabel landlordInformationLabel = new javax.swing.JLabel();
    private javax.swing.JList<User> landlordList = new javax.swing.JList<User>();
    // End of variables declaration

    // all landlords
    private DefaultListModel<User> landlordListModel = new DefaultListModel<User>();

    // Variables declaration - do not modify
    private javax.swing.JLabel propertyInformationLabel = new javax.swing.JLabel();
    private javax.swing.JList<Property> propertyList = new javax.swing.JList<Property>();
    // End of variables declaration

    // all properties
    private DefaultListModel<Property> propertyListModel = new DefaultListModel<Property>();

    public ViewCompanyDatabaseGUI(Frontend view) {
        // assign view reference
        this.view = view;
        chooseInformation();
    }

    // update Renter list model
    public void updateRentersView(ArrayList<User> updatedRenterListModel) {
        this.renterListModel.clear();
        for (User r : updatedRenterListModel) {
            this.renterListModel.addElement(r);
        }
    }

    // update Landlord list model
    public void updateLandlordsView(ArrayList<User> updatedLandlordListModel) {
        this.landlordListModel.clear();
        for (User l : updatedLandlordListModel) {
            this.landlordListModel.addElement(l);
        }
    }

    // update Property list model
    public void updatePropertiesView(ArrayList<Property> updatedPropertyListModel) {
        this.propertyListModel.clear();
        for (Property p : updatedPropertyListModel) {
            this.propertyListModel.addElement(p);
        }
    }

    public void chooseInformation() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(436, 491));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(70, 20, 290, 70);

        propertyLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        propertyLabel.setForeground(new java.awt.Color(255, 255, 255));
        propertyLabel.setText("View all Properties");
        add(propertyLabel);
        propertyLabel.setBounds(160, 340, 130, 20);

        chooseInformationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        chooseInformationLabel.setForeground(new java.awt.Color(255, 255, 255));
        chooseInformationLabel.setText("Choose information to view");
        add(chooseInformationLabel);
        chooseInformationLabel.setBounds(70, 100, 300, 30);

        renterLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        renterLabel.setForeground(new java.awt.Color(255, 255, 255));
        renterLabel.setText("View all Renters");
        add(renterLabel);
        renterLabel.setBounds(170, 160, 100, 20);

        landlordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        landlordLabel.setForeground(new java.awt.Color(255, 255, 255));
        landlordLabel.setText("View all Landlords");
        add(landlordLabel);
        landlordLabel.setBounds(160, 250, 120, 20);

        landlordButton.setBackground(new java.awt.Color(255, 255, 255));
        landlordButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        landlordButton.setForeground(new java.awt.Color(0, 0, 0));
        landlordButton.setText("Landlords");
        landlordButton.setActionCommand("Manager");
        /*
         * landlordButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * landlordInformation();
         * }
         * });
         */
        add(landlordButton);
        landlordButton.setBounds(150, 280, 140, 50);

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
        dashboardButton.setBounds(370, 20, 50, 40);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 460, 170, 20);

        renterButton.setBackground(new java.awt.Color(255, 255, 255));
        renterButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        renterButton.setForeground(new java.awt.Color(0, 0, 0));
        renterButton.setText("Renters");
        /*
         * renterButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * renterInformation();
         * }
         * });
         */
        add(renterButton);
        renterButton.setBounds(150, 190, 140, 50);

        propertyButton.setBackground(new java.awt.Color(255, 255, 255));
        propertyButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        propertyButton.setForeground(new java.awt.Color(0, 0, 0));
        propertyButton.setText("Properties");
        /*
         * propertyButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * propertyInformation();
         * }
         * });
         */
        add(propertyButton);
        propertyButton.setBounds(150, 370, 140, 50);

        revalidate();
        repaint();
        view.pack();
    }

    public void renterInformation() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(530, 496));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(70, 20, 290, 70);

        renterInformationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        renterInformationLabel.setForeground(new java.awt.Color(255, 255, 255));
        renterInformationLabel.setText("Renters");
        add(renterInformationLabel);
        renterInformationLabel.setBounds(220, 110, 90, 30);

        dashboardButton.setBackground(new java.awt.Color(255, 255, 255));
        dashboardButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(0, 0, 0));
        dashboardButton.setText("X");
        /*
         * dashboardButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * chooseInformation();
         * }
         * });
         */
        add(dashboardButton);
        dashboardButton.setBounds(460, 20, 50, 40);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 460, 170, 20);

        renterList.setBackground(new java.awt.Color(0, 0, 0));
        renterList.setForeground(new java.awt.Color(255, 255, 255));
        renterList.setModel(renterListModel);

        jScrollPane1.setViewportView(renterList);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 160, 450, 270);

        revalidate();
        repaint();
        view.pack();
    }

    public void landlordInformation() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(530, 496));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(70, 20, 290, 70);

        landlordInformationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        landlordInformationLabel.setForeground(new java.awt.Color(255, 255, 255));
        landlordInformationLabel.setText("Landlords");
        add(landlordInformationLabel);
        landlordInformationLabel.setBounds(210, 110, 110, 30);

        dashboardButton.setBackground(new java.awt.Color(255, 255, 255));
        dashboardButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(0, 0, 0));
        dashboardButton.setText("X");
        /*
         * dashboardButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * chooseInformation();
         * }
         * });
         */
        add(dashboardButton);
        dashboardButton.setBounds(460, 20, 50, 40);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 460, 170, 20);

        landlordList.setBackground(new java.awt.Color(0, 0, 0));
        landlordList.setForeground(new java.awt.Color(255, 255, 255));
        landlordList.setModel(landlordListModel);

        jScrollPane1.setViewportView(landlordList);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 160, 450, 270);

        revalidate();
        repaint();
        view.pack();
    }

    public void propertyInformation() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(530, 496));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(70, 20, 290, 70);

        propertyInformationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        propertyInformationLabel.setForeground(new java.awt.Color(255, 255, 255));
        propertyInformationLabel.setText("Properties");
        add(propertyInformationLabel);
        propertyInformationLabel.setBounds(210, 110, 120, 29);

        dashboardButton.setBackground(new java.awt.Color(255, 255, 255));
        dashboardButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(0, 0, 0));
        dashboardButton.setText("X");
        /*
         * dashboardButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * chooseInformation();
         * }
         * });
         */
        add(dashboardButton);
        dashboardButton.setBounds(460, 20, 50, 40);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 460, 170, 20);

        propertyList.setBackground(new java.awt.Color(0, 0, 0));
        propertyList.setForeground(new java.awt.Color(255, 255, 255));
        propertyList.setModel(propertyListModel);

        jScrollPane1.setViewportView(propertyList);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 160, 450, 270);

        revalidate();
        repaint();
        view.pack();
    }

    // getter methods

    public javax.swing.JLabel getChooseInformationLabel() {
        return chooseInformationLabel;
    }

    public javax.swing.JLabel getCopyrightLabel() {
        return copyrightLabel;
    }

    public javax.swing.JButton getDashboardButton() {
        return dashboardButton;
    }

    public javax.swing.JButton getLandlordButton() {
        return landlordButton;
    }

    public javax.swing.JLabel getLandlordLabel() {
        return landlordLabel;
    }

    public javax.swing.JButton getPropertyButton() {
        return propertyButton;
    }

    public javax.swing.JLabel getPropertyLabel() {
        return propertyLabel;
    }

    public javax.swing.JLabel getRentSlowerLabel() {
        return rentSlowerLabel;
    }

    public javax.swing.JButton getRenterButton() {
        return renterButton;
    }

    public javax.swing.JLabel getRenterLabel() {
        return renterLabel;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public javax.swing.JLabel getRenterInformationLabel() {
        return renterInformationLabel;
    }

    public javax.swing.JList<User> getRenterList() {
        return renterList;
    }

    public DefaultListModel<User> getRenterListModel() {
        return renterListModel;
    }

    public javax.swing.JLabel getLandlordInformationLabel() {
        return landlordInformationLabel;
    }

    public javax.swing.JList<User> getLandlordList() {
        return landlordList;
    }

    public DefaultListModel<User> getLandlordListModel() {
        return landlordListModel;
    }

    public javax.swing.JLabel getPropertyInformationLabel() {
        return propertyInformationLabel;
    }

    public javax.swing.JList<Property> getPropertyList() {
        return propertyList;
    }

    public DefaultListModel<Property> getPropertyListModel() {
        return propertyListModel;
    }
}
