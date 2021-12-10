package presentation.guicomponents;

import javax.swing.*;

import business.businesslogic.SearchCriteria;

/**
 * Class ManageSubscriptionsGUI: a panel to display a renters subscription with
 * an option to edit
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @version 1.0
 */
public class ManageSubscriptionsGUI extends JPanel {
    private Frontend view;

    // Variables declaration
    private javax.swing.JLabel copyrightLabel = new javax.swing.JLabel();
    private javax.swing.JButton dashboardButton = new javax.swing.JButton();
    private javax.swing.JButton editButton = new javax.swing.JButton();
    private javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    private javax.swing.JLabel manageRenterSubscriptionLabel = new javax.swing.JLabel();
    private javax.swing.JLabel rentSlowerLabel = new javax.swing.JLabel();
    private javax.swing.JList<SearchCriteria> subscriptionList = new javax.swing.JList<SearchCriteria>();

    // user subscription
    private DefaultListModel<SearchCriteria> subscriptionListModel = new DefaultListModel<SearchCriteria>();

    /**
     * ManageSubscriptionsGUI constructor, used by Frontend
     * 
     * @param view Frontend JFrame
     */
    public ManageSubscriptionsGUI(Frontend view) {
        // assign view reference
        this.view = view;
        manageSubscription();
    }

    /**
     * Update ManageSubscriptionsGUIs search criteria list model
     * 
     * @param subscription SearchCriteria updated subscription
     */
    public void updateSubscriptionView(SearchCriteria subscription) {
        // update current list model
        this.subscriptionListModel.clear();
        this.subscriptionListModel.addElement(subscription);
    }

    /**
     * Empty ManageSubscriptionsGUIs search criteria list model
     */
    public void deleteSubscription() {
        // empty the current list model
        this.subscriptionListModel.clear();
    }

    /**
     * Instantiate manage subscriptions layout
     */
    public void manageSubscription() {
        // remove all components from panel
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

        manageRenterSubscriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        manageRenterSubscriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        manageRenterSubscriptionLabel.setText("Manage Renter Subscription");
        add(manageRenterSubscriptionLabel);
        manageRenterSubscriptionLabel.setBounds(170, 110, 300, 30);

        subscriptionList.setBackground(new java.awt.Color(0, 0, 0));
        subscriptionList.setForeground(new java.awt.Color(255, 255, 255));
        subscriptionList.setModel(subscriptionListModel);

        /*
         * subscriptionList.addListSelectionListener(new ListSelectionListener() {
         * 
         * @Override
         * public void valueChanged(ListSelectionEvent evt) {
         * if (!evt.getValueIsAdjusting()) {
         * displayEdit();
         * }
         * }
         * });
         */

        jScrollPane1.setViewportView(subscriptionList);

        add(jScrollPane1);
        jScrollPane1.setBounds(60, 160, 520, 120);

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

        editButton.setBackground(new java.awt.Color(255, 255, 255));
        editButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editButton.setForeground(new java.awt.Color(0, 0, 0));
        editButton.setText("Edit");
        /*
         * editButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(editButton);
        editButton.setBounds(260, 300, 120, 40);

        revalidate();
        repaint();
        view.pack();
    }

    // getter methods

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
     * editButton getter method
     * 
     * @return JButton
     */
    public javax.swing.JButton getEditButton() {
        return editButton;
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
     * manageRenterSubscriptionLabel
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getManageRenterSubscriptionLabel() {
        return manageRenterSubscriptionLabel;
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
     * subscriptionList getter method
     * 
     * @return JList<SearchCriteria>
     */
    public javax.swing.JList<SearchCriteria> getSubscriptionList() {
        return subscriptionList;
    }

    /**
     * subscriptionListModel getter method
     * 
     * @return DefaultListModel<SearchCriteria>
     */
    public DefaultListModel<SearchCriteria> getSubscriptionListModel() {
        return subscriptionListModel;
    }
}
