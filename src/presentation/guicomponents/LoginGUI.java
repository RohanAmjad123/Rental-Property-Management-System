package presentation.guicomponents;

import javax.swing.*;

/**
 * Class LoginGUI: a panel to display a login view, includes user choice layout,
 * login layout, success and error page
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @version 1.0
 */
public class LoginGUI extends JPanel {
    private Frontend view;

    // Variables declaration
    private javax.swing.JLabel copyrightLabel = new javax.swing.JLabel();
    private javax.swing.JButton dashboardButton = new javax.swing.JButton();
    private javax.swing.JButton landlordButton = new javax.swing.JButton();
    private javax.swing.JLabel landlordLabel = new javax.swing.JLabel();
    private javax.swing.JButton managerButton = new javax.swing.JButton();
    private javax.swing.JLabel managerLabel = new javax.swing.JLabel();
    private javax.swing.JLabel rentSlowerLabel = new javax.swing.JLabel();
    private javax.swing.JButton renterButton = new javax.swing.JButton();
    private javax.swing.JLabel renterLabel = new javax.swing.JLabel();
    private javax.swing.JLabel userChoiceLabel = new javax.swing.JLabel();

    private javax.swing.JLabel emailLabel = new javax.swing.JLabel();
    private javax.swing.JTextField emailText = new javax.swing.JTextField();
    private javax.swing.JButton loginButton = new javax.swing.JButton();
    private javax.swing.JLabel passwordLabel = new javax.swing.JLabel();
    private javax.swing.JPasswordField passwordText = new javax.swing.JPasswordField();
    private javax.swing.JLabel userLoginLabel = new javax.swing.JLabel();

    private javax.swing.JButton finishButton = new javax.swing.JButton();
    private javax.swing.JLabel loginSuccessfulLabel = new javax.swing.JLabel();

    private javax.swing.JLabel loginUnsuccessfulLabel = new javax.swing.JLabel();
    private javax.swing.JButton tryAgainButton = new javax.swing.JButton();

    /**
     * LoginGUI constructor, used by Frontend
     * 
     * @param view Frontend JFrame
     */
    public LoginGUI(Frontend view) {
        // assign view reference
        this.view = view;
        userChoice();
    }

    /**
     * Instantiate user choice layout
     */
    public void userChoice() {
        // remove all components from panel
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(436, 491));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(70, 20, 290, 70);

        managerLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        managerLabel.setForeground(new java.awt.Color(255, 255, 255));
        managerLabel.setText("Login as a Manager");
        add(managerLabel);
        managerLabel.setBounds(160, 340, 130, 20);

        userChoiceLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userChoiceLabel.setForeground(new java.awt.Color(255, 255, 255));
        userChoiceLabel.setText("Choose a user");
        add(userChoiceLabel);
        userChoiceLabel.setBounds(140, 100, 160, 30);

        renterLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        renterLabel.setForeground(new java.awt.Color(255, 255, 255));
        renterLabel.setText("Login as a Renter");
        add(renterLabel);
        renterLabel.setBounds(160, 160, 120, 20);

        landlordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        landlordLabel.setForeground(new java.awt.Color(255, 255, 255));
        landlordLabel.setText("Login as a Landlord");
        add(landlordLabel);
        landlordLabel.setBounds(160, 250, 130, 20);

        landlordButton.setBackground(new java.awt.Color(255, 255, 255));
        landlordButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        landlordButton.setForeground(new java.awt.Color(0, 0, 0));
        landlordButton.setText("Landlord");
        landlordButton.setActionCommand("Manager");
        /*
         * landlordButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
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
        renterButton.setText("Renter");
        /*
         * renterButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(renterButton);
        renterButton.setBounds(150, 190, 140, 50);

        managerButton.setBackground(new java.awt.Color(255, 255, 255));
        managerButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        managerButton.setForeground(new java.awt.Color(0, 0, 0));
        managerButton.setText("Manager");
        /*
         * managerButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(managerButton);
        managerButton.setBounds(150, 370, 140, 50);

        // revalidate, repaint, then pack frame
        revalidate();
        repaint();
        view.pack();
    }

    /**
     * Instantiate user login layout
     */
    public void userLogin() {
        // remove all components from panel
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(436, 491));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(70, 20, 290, 70);

        userLoginLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userLoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLoginLabel.setText("User Login");
        add(userLoginLabel);
        userLoginLabel.setBounds(150, 110, 150, 30);

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
        loginButton.setBounds(280, 420, 120, 40);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 460, 170, 20);

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");
        add(emailLabel);
        emailLabel.setBounds(70, 160, 80, 20);

        emailText.setBackground(java.awt.Color.black);
        emailText.setForeground(new java.awt.Color(255, 255, 255));
        /*
         * emailText.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(emailText);
        emailText.setBounds(60, 190, 270, 18);

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

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");
        add(passwordLabel);
        passwordLabel.setBounds(70, 240, 80, 20);

        passwordText.setBackground(java.awt.Color.black);
        passwordText.setForeground(new java.awt.Color(255, 255, 255));
        add(passwordText);
        passwordText.setBounds(60, 270, 270, 20);

        // revalidate, repaint, then pack frame
        revalidate();
        repaint();
        view.pack();
    }

    /**
     * Instantiate success page layout
     */
    public void successPage() {
        // remove all components from panel
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(436, 491));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(90, 20, 290, 70);

        loginSuccessfulLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginSuccessfulLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginSuccessfulLabel.setText("Login Successful!");
        add(loginSuccessfulLabel);
        loginSuccessfulLabel.setBounds(130, 170, 230, 40);

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

        // revalidate, repaint, then pack frame
        revalidate();
        repaint();
        view.pack();
    }

    /**
     * Instantiate error page layout
     */
    public void errorPage() {
        // remove all components from panel
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(436, 491));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(90, 20, 290, 70);

        loginUnsuccessfulLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginUnsuccessfulLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginUnsuccessfulLabel.setText("Login Unsuccessful!");
        add(loginUnsuccessfulLabel);
        loginUnsuccessfulLabel.setBounds(110, 180, 230, 40);

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

        // revalidate, repaint, then pack frame
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
     * landlordButton getter method
     * 
     * @return JButton
     */
    public javax.swing.JButton getLandlordButton() {
        return landlordButton;
    }

    /**
     * landlordLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getLandlordLabel() {
        return landlordLabel;
    }

    /**
     * managerButton getter method
     * 
     * @return JButton
     */
    public javax.swing.JButton getManagerButton() {
        return managerButton;
    }

    /**
     * managerLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getManagerLabel() {
        return managerLabel;
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
     * renterButton getter method
     * 
     * @return JButton
     */
    public javax.swing.JButton getRenterButton() {
        return renterButton;
    }

    /**
     * renterLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getRenterLabel() {
        return renterLabel;
    }

    /**
     * userChoiceLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getUserChoiceLabel() {
        return userChoiceLabel;
    }

    /**
     * emailLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getEmailLabel() {
        return emailLabel;
    }

    /**
     * emailText getter method
     * 
     * @return JTextField
     */
    public javax.swing.JTextField getEmailText() {
        return emailText;
    }

    /**
     * loginButton getter method
     * 
     * @return JButton
     */
    public javax.swing.JButton getLoginButton() {
        return loginButton;
    }

    /**
     * passwordLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getPasswordLabel() {
        return passwordLabel;
    }

    /**
     * passwordText getter method
     * 
     * @return JPasswordField
     */
    public javax.swing.JPasswordField getPasswordText() {
        return passwordText;
    }

    /**
     * userLoginLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getUserLoginLabel() {
        return userLoginLabel;
    }

    /**
     * finishButton getter method
     * 
     * @return JButton
     */
    public javax.swing.JButton getFinishButton() {
        return finishButton;
    }

    /**
     * loginSuccessfulLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getLoginSuccessfulLabel() {
        return loginSuccessfulLabel;
    }

    /**
     * loginUnsuccessfulLabel getter method
     * 
     * @return JLabel
     */
    public javax.swing.JLabel getLoginUnsuccessfulLabel() {
        return loginUnsuccessfulLabel;
    }

    /**
     * tryAgainButton getter method
     * 
     * @return JButton
     */
    public javax.swing.JButton getTryAgainButton() {
        return tryAgainButton;
    }
}
