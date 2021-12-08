package presentation.guicomponents;

import javax.swing.*;

/**
 * Class ChangeFeesGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @version 1.0
 */
public class ChangeFeesGUI extends JPanel {
    private Frontend view;

    // Variables declaration - do not modify
    private javax.swing.JLabel changeFeesLabel = new javax.swing.JLabel();
    private javax.swing.JLabel copyrightLabel = new javax.swing.JLabel();
    private javax.swing.JButton dashboardButton = new javax.swing.JButton();
    private javax.swing.JComboBox<String> feeAmountComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel feeAmountLabel = new javax.swing.JLabel();
    private javax.swing.JComboBox<String> feePeriodComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel feePeriodLabel = new javax.swing.JLabel();
    private javax.swing.JLabel rentSlowerLabel = new javax.swing.JLabel();
    private javax.swing.JButton updateButton = new javax.swing.JButton();
    // End of variables declaration

    public ChangeFeesGUI(Frontend view) {
        // assign view reference
        this.view = view;
        changeFeesForm();
    }

    public void changeFeesForm() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(445, 399));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(70, 20, 290, 70);

        changeFeesLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        changeFeesLabel.setForeground(new java.awt.Color(255, 255, 255));
        changeFeesLabel.setText("Change Fees");
        add(changeFeesLabel);
        changeFeesLabel.setBounds(150, 110, 150, 30);

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
        updateButton.setBounds(290, 330, 120, 40);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 370, 170, 20);

        feeAmountLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        feeAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        feeAmountLabel.setText("Fee Amount ($)");
        add(feeAmountLabel);
        feeAmountLabel.setBounds(100, 190, 110, 20);

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

        feePeriodLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        feePeriodLabel.setForeground(new java.awt.Color(255, 255, 255));
        feePeriodLabel.setText("Fee Period (Days)");
        add(feePeriodLabel);
        feePeriodLabel.setBounds(100, 250, 110, 20);

        feePeriodComboBox.setBackground(new java.awt.Color(255, 255, 255));
        feePeriodComboBox.setForeground(java.awt.Color.black);
        feePeriodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "60", "90" }));
        add(feePeriodComboBox);
        feePeriodComboBox.setBounds(240, 250, 80, 20);

        feeAmountComboBox.setBackground(new java.awt.Color(255, 255, 255));
        feeAmountComboBox.setForeground(java.awt.Color.black);
        feeAmountComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15", "30", "45", "60" }));
        add(feeAmountComboBox);
        feeAmountComboBox.setBounds(240, 190, 80, 20);

        revalidate();
        repaint();
        view.pack();
    }

    // getter methods

    public javax.swing.JLabel getChangeFeesLabel() {
        return changeFeesLabel;
    }

    public javax.swing.JLabel getCopyrightLabel() {
        return copyrightLabel;
    }

    public javax.swing.JButton getDashboardButton() {
        return dashboardButton;
    }

    public javax.swing.JComboBox<String> getFeeAmountComboBox() {
        return feeAmountComboBox;
    }

    public javax.swing.JLabel getFeeAmountLabel() {
        return feeAmountLabel;
    }

    public javax.swing.JComboBox<String> getFeePeriodComboBox() {
        return feePeriodComboBox;
    }

    public javax.swing.JLabel getFeePeriodLabel() {
        return feePeriodLabel;
    }

    public javax.swing.JLabel getRentSlowerLabel() {
        return rentSlowerLabel;
    }

    public javax.swing.JButton getUpdateButton() {
        return updateButton;
    }
}
