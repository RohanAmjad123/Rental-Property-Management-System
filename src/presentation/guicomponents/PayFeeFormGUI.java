package presentation.guicomponents;

import javax.swing.*;
import business.businesslogic.Fee;

/**
 * Class PayFeeFormGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @version 1.0
 */
public class PayFeeFormGUI extends JPanel {
    private Frontend view;

    // Variables declaration - do not modify
    private javax.swing.JLabel copyrightLabel = new javax.swing.JLabel();
    private javax.swing.JLabel creditCardNumberLabel = new javax.swing.JLabel();
    private javax.swing.JTextField creditCardNumberText = new javax.swing.JTextField();
    private javax.swing.JButton dashboardButton = new javax.swing.JButton();
    private javax.swing.JLabel expirationMonthLabel = new javax.swing.JLabel();
    private javax.swing.JTextField expirationMonthText = new javax.swing.JTextField();
    private javax.swing.JLabel expirationYearLabel = new javax.swing.JLabel();
    private javax.swing.JTextField expirationYearText = new javax.swing.JTextField();
    private javax.swing.JLabel feeAmountLabel = new javax.swing.JLabel();
    private javax.swing.JLabel feeAmountValueLabel = new javax.swing.JLabel();
    private javax.swing.JLabel feePeriodLabel = new javax.swing.JLabel();
    private javax.swing.JLabel feePeriodValueLabel = new javax.swing.JLabel();
    private javax.swing.JLabel firstNameLabel = new javax.swing.JLabel();
    private javax.swing.JTextField firstNameText = new javax.swing.JTextField();
    private javax.swing.JLabel lastNameLabel = new javax.swing.JLabel();
    private javax.swing.JTextField lastNameText = new javax.swing.JTextField();
    private javax.swing.JButton payFeeButton = new javax.swing.JButton();
    private javax.swing.JLabel payPropertyActivationFeeLabel = new javax.swing.JLabel();
    private javax.swing.JLabel rentSlowerLabel = new javax.swing.JLabel();
    private javax.swing.JLabel securityCodeLabel = new javax.swing.JLabel();
    private javax.swing.JTextField securityCodeText = new javax.swing.JTextField();
    // End of variables declaration

    // Variables declaration - do not modify
    private javax.swing.JButton finishButton = new javax.swing.JButton();
    private javax.swing.JLabel paymentSuccessfulLabel = new javax.swing.JLabel();
    // End of variables declaration

    // Variables declaration - do not modify
    private javax.swing.JLabel paymentUnsuccessfulLabel = new javax.swing.JLabel();
    private javax.swing.JButton tryAgainButton = new javax.swing.JButton();
    // End of variables declaration

    // current fee object
    private Fee currentFee = new Fee();

    public PayFeeFormGUI(Frontend view) {
        // assign view reference
        this.view = view;
        currentFee.setFeeAmound(1000);
        currentFee.setFeePeriod(60);
        payFeeForm();
    }

    // update current fee
    public void updateFee(Fee updatedFee) {
        this.currentFee = updatedFee;
    }

    private void payFeeForm() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(482, 701));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(70, 20, 290, 70);

        feeAmountValueLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        feeAmountValueLabel.setForeground(new java.awt.Color(255, 255, 255));
        feeAmountValueLabel.setText(String.valueOf(currentFee.getFeeAmount()));
        add(feeAmountValueLabel);
        feeAmountValueLabel.setBounds(60, 220, 150, 40);

        payFeeButton.setBackground(new java.awt.Color(255, 255, 255));
        payFeeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        payFeeButton.setForeground(new java.awt.Color(0, 0, 0));
        payFeeButton.setText("Pay Fee");
        /*
         * payFeeButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(payFeeButton);
        payFeeButton.setBounds(340, 640, 120, 40);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 670, 170, 20);

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name");
        add(firstNameLabel);
        firstNameLabel.setBounds(70, 300, 80, 20);

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

        firstNameText.setBackground(java.awt.Color.black);
        firstNameText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * firstNameText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(firstNameText);
        firstNameText.setBounds(60, 330, 140, 20);

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name");
        add(lastNameLabel);
        lastNameLabel.setBounds(240, 300, 80, 20);

        lastNameText.setBackground(java.awt.Color.black);
        lastNameText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * lastNameText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(lastNameText);
        lastNameText.setBounds(230, 330, 140, 20);

        creditCardNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        creditCardNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        creditCardNumberLabel.setText("Credit Card Number");
        add(creditCardNumberLabel);
        creditCardNumberLabel.setBounds(70, 380, 130, 20);

        creditCardNumberText.setBackground(java.awt.Color.black);
        creditCardNumberText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * creditCardNumberText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(creditCardNumberText);
        creditCardNumberText.setBounds(60, 410, 310, 20);

        securityCodeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        securityCodeLabel.setForeground(new java.awt.Color(255, 255, 255));
        securityCodeLabel.setText("Security Code");
        add(securityCodeLabel);
        securityCodeLabel.setBounds(70, 460, 90, 20);

        securityCodeText.setBackground(java.awt.Color.black);
        securityCodeText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * securityCodeText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(securityCodeText);
        securityCodeText.setBounds(60, 490, 140, 20);

        expirationMonthLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        expirationMonthLabel.setForeground(new java.awt.Color(255, 255, 255));
        expirationMonthLabel.setText("Expiration Month (1-12)");
        add(expirationMonthLabel);
        expirationMonthLabel.setBounds(70, 540, 150, 20);

        expirationMonthText.setBackground(java.awt.Color.black);
        expirationMonthText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * expirationMonthText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(expirationMonthText);
        expirationMonthText.setBounds(60, 570, 140, 20);

        expirationYearLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        expirationYearLabel.setForeground(new java.awt.Color(255, 255, 255));
        expirationYearLabel.setText("Expiration Year (xxxx)");
        add(expirationYearLabel);
        expirationYearLabel.setBounds(260, 540, 150, 20);

        expirationYearText.setBackground(java.awt.Color.black);
        expirationYearText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * expirationYearText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(expirationYearText);
        expirationYearText.setBounds(250, 570, 140, 20);

        payPropertyActivationFeeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        payPropertyActivationFeeLabel.setForeground(new java.awt.Color(255, 255, 255));
        payPropertyActivationFeeLabel.setText("Pay Property Activation Fee");
        add(payPropertyActivationFeeLabel);
        payPropertyActivationFeeLabel.setBounds(90, 110, 310, 30);

        feeAmountLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        feeAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        feeAmountLabel.setText("Fee Amount ($)");
        add(feeAmountLabel);
        feeAmountLabel.setBounds(50, 180, 170, 40);

        feePeriodValueLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        feePeriodValueLabel.setForeground(new java.awt.Color(255, 255, 255));
        feePeriodValueLabel.setText(String.valueOf(currentFee.getFeePeriod()));
        add(feePeriodValueLabel);
        feePeriodValueLabel.setBounds(260, 220, 160, 40);

        feePeriodLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        feePeriodLabel.setForeground(new java.awt.Color(255, 255, 255));
        feePeriodLabel.setText("Fee Period (Days)");
        add(feePeriodLabel);
        feePeriodLabel.setBounds(250, 180, 200, 40);

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

        paymentSuccessfulLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        paymentSuccessfulLabel.setForeground(new java.awt.Color(255, 255, 255));
        paymentSuccessfulLabel.setText("Payment Successful!");
        add(paymentSuccessfulLabel);
        paymentSuccessfulLabel.setBounds(110, 180, 230, 40);

        finishButton.setBackground(new java.awt.Color(255, 255, 255));
        finishButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        finishButton.setForeground(new java.awt.Color(0, 0, 0));
        finishButton.setText("Finish");
        /*
         * finishButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * })
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

        rentSlowerLabel = new javax.swing.JLabel();
        paymentUnsuccessfulLabel = new javax.swing.JLabel();
        tryAgainButton = new javax.swing.JButton();
        copyrightLabel = new javax.swing.JLabel();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(436, 491));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(90, 20, 290, 70);

        paymentUnsuccessfulLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        paymentUnsuccessfulLabel.setForeground(new java.awt.Color(255, 255, 255));
        paymentUnsuccessfulLabel.setText("Payment Unsuccessful!");
        add(paymentUnsuccessfulLabel);
        paymentUnsuccessfulLabel.setBounds(100, 180, 260, 40);

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

    // getter method
    
    public javax.swing.JLabel getCopyrightLabel() {
        return copyrightLabel;
    }

    public javax.swing.JLabel getCreditCardNumberLabel() {
        return creditCardNumberLabel;
    }

    public javax.swing.JTextField getCreditCardNumberText() {
        return creditCardNumberText;
    }

    public javax.swing.JButton getDashboardButton() {
        return dashboardButton;
    }

    public javax.swing.JLabel getExpirationMonthLabel() {
        return expirationMonthLabel;
    }

    public javax.swing.JTextField getExpirationMonthText() {
        return expirationMonthText;
    }

    public javax.swing.JLabel getExpirationYearLabel() {
        return expirationYearLabel;
    }

    public javax.swing.JTextField getExpirationYearText() {
        return expirationYearText;
    }

    public javax.swing.JLabel getFeeAmountLabel() {
        return feeAmountLabel;
    }

    public javax.swing.JLabel getFeeAmountValueLabel() {
        return feeAmountValueLabel;
    }

    public javax.swing.JLabel getFeePeriodLabel() {
        return feePeriodLabel;
    }

    public javax.swing.JLabel getFeePeriodValueLabel() {
        return feePeriodValueLabel;
    }

    public javax.swing.JLabel getFirstNameLabel() {
        return firstNameLabel;
    }

    public javax.swing.JTextField getFirstNameText() {
        return firstNameText;
    }

    public javax.swing.JLabel getLastNameLabel() {
        return lastNameLabel;
    }

    public javax.swing.JTextField getLastNameText() {
        return lastNameText;
    }

    public javax.swing.JButton getPayFeeButton() {
        return payFeeButton;
    }

    public javax.swing.JLabel getPayPropertyActivationFeeLabel() {
        return payPropertyActivationFeeLabel;
    }

    public javax.swing.JLabel getRentSlowerLabel() {
        return rentSlowerLabel;
    }

    public javax.swing.JLabel getSecurityCodeLabel() {
        return securityCodeLabel;
    }

    public javax.swing.JTextField getSecurityCodeText() {
        return securityCodeText;
    }

    public javax.swing.JButton getFinishButton() {
        return finishButton;
    }

    public javax.swing.JLabel getPaymentSuccessfulLabel() {
        return paymentSuccessfulLabel;
    }

    public javax.swing.JLabel getPaymentUnsuccessfulLabel() {
        return paymentUnsuccessfulLabel;
    }

    public javax.swing.JButton getTryAgainButton() {
        return tryAgainButton;
    }

    public Fee getCurrentFee() {
        return currentFee;
    }
}
