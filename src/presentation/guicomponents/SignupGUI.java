package presentation.guicomponents;

import javax.swing.*;

/**
 * Class SignupGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */
public class SignupGUI extends JPanel {
    private Frontend view;

    // Variables declaration - do not modify
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
    // End of variables declaration

    // Variables declaration - do not modify
    private javax.swing.JLabel emailLabel = new javax.swing.JLabel();
    private javax.swing.JTextField emailText = new javax.swing.JTextField();
    private javax.swing.JLabel firstNameLabel = new javax.swing.JLabel();
    private javax.swing.JTextField firstNameText = new javax.swing.JTextField();
    private javax.swing.JLabel lastNameLabel = new javax.swing.JLabel();
    private javax.swing.JTextField lastNameText = new javax.swing.JTextField();
    private javax.swing.JLabel passwordLabel = new javax.swing.JLabel();
    private javax.swing.JPasswordField passwordText = new javax.swing.JPasswordField();
    private javax.swing.JLabel renterSignupLabel = new javax.swing.JLabel();
    private javax.swing.JButton signupButton = new javax.swing.JButton();
    // End of variables declaration

    // Variables declaration - do not modify
    private javax.swing.JLabel managerKeyLabel = new javax.swing.JLabel();
    private javax.swing.JPasswordField managerKeyText = new javax.swing.JPasswordField();
    private javax.swing.JLabel managerSignupLabel = new javax.swing.JLabel();
    // End of variables declaration

    // Variables declaration - do not modify
    private javax.swing.JLabel landordSignupLabel = new javax.swing.JLabel();
    // End of variables declaration

    // Variables declaration - do not modify
    private javax.swing.JButton finishButton = new javax.swing.JButton();
    private javax.swing.JLabel signupSuccessfulLabel = new javax.swing.JLabel();
    // End of variables declaration

    // Variables declaration - do not modify
    private javax.swing.JLabel signupUnsuccessfulLabel = new javax.swing.JLabel();
    private javax.swing.JButton tryAgainButton = new javax.swing.JButton();
    // End of variables declaration

    public SignupGUI(Frontend view) {
        // assign view reference
        this.view = view;
        userChoice();
    }

    public void userChoice() {
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
        managerLabel.setText("Signup as a Manager");
        add(managerLabel);
        managerLabel.setBounds(160, 340, 130, 20);

        userChoiceLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userChoiceLabel.setForeground(new java.awt.Color(255, 255, 255));
        userChoiceLabel.setText("Choose a user");
        add(userChoiceLabel);
        userChoiceLabel.setBounds(140, 100, 160, 30);

        renterLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        renterLabel.setForeground(new java.awt.Color(255, 255, 255));
        renterLabel.setText("Signup as a Renter");
        add(renterLabel);
        renterLabel.setBounds(160, 160, 120, 20);

        landlordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        landlordLabel.setForeground(new java.awt.Color(255, 255, 255));
        landlordLabel.setText("Signup as a Landlord");
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

        revalidate();
        repaint();
        view.pack();
    }

    public void renterSignup() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(436, 491));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(70, 20, 290, 70);

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");
        add(passwordLabel);
        passwordLabel.setBounds(60, 330, 80, 20);

        renterSignupLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        renterSignupLabel.setForeground(new java.awt.Color(255, 255, 255));
        renterSignupLabel.setText("Renter Signup");
        add(renterSignupLabel);
        renterSignupLabel.setBounds(130, 100, 180, 30);

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name");
        add(firstNameLabel);
        firstNameLabel.setBounds(60, 150, 120, 20);

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name");
        add(lastNameLabel);
        lastNameLabel.setBounds(60, 210, 130, 20);

        signupButton.setBackground(new java.awt.Color(255, 255, 255));
        signupButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signupButton.setForeground(new java.awt.Color(0, 0, 0));
        signupButton.setText("Signup");
        /*
         * signupButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(signupButton);
        signupButton.setBounds(280, 420, 120, 40);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 460, 170, 20);

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");
        add(emailLabel);
        emailLabel.setBounds(60, 270, 80, 20);

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
        emailText.setBounds(50, 300, 270, 18);

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
        firstNameText.setBounds(50, 180, 270, 18);

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
        lastNameText.setBounds(50, 240, 270, 18);

        passwordText.setBackground(java.awt.Color.black);
        passwordText.setForeground(new java.awt.Color(255, 255, 255));
        add(passwordText);
        passwordText.setBounds(50, 360, 270, 20);

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

        revalidate();
        repaint();
        view.pack();
    }

    public void landlordSignup() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(436, 491));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(70, 20, 290, 70);

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");
        add(passwordLabel);
        passwordLabel.setBounds(60, 330, 80, 20);

        landordSignupLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        landordSignupLabel.setForeground(new java.awt.Color(255, 255, 255));
        landordSignupLabel.setText("Landlord Signup");
        add(landordSignupLabel);
        landordSignupLabel.setBounds(130, 100, 180, 30);

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name");
        add(firstNameLabel);
        firstNameLabel.setBounds(60, 150, 120, 20);

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name");
        add(lastNameLabel);
        lastNameLabel.setBounds(60, 210, 130, 20);

        signupButton.setBackground(new java.awt.Color(255, 255, 255));
        signupButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signupButton.setForeground(new java.awt.Color(0, 0, 0));
        signupButton.setText("Signup");
        /*
         * signupButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(signupButton);
        signupButton.setBounds(280, 420, 120, 40);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 460, 170, 20);

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");
        add(emailLabel);
        emailLabel.setBounds(60, 270, 80, 20);

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
        emailText.setBounds(50, 300, 270, 18);

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
        firstNameText.setBounds(50, 180, 270, 18);

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
        lastNameText.setBounds(50, 240, 270, 18);

        passwordText.setBackground(java.awt.Color.black);
        passwordText.setForeground(new java.awt.Color(255, 255, 255));
        add(passwordText);
        passwordText.setBounds(50, 360, 270, 20);

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

        revalidate();
        repaint();
        view.pack();
    }

    public void managerSignup() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(436, 491));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(70, 20, 290, 70);

        managerKeyLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        managerKeyLabel.setForeground(new java.awt.Color(255, 255, 255));
        managerKeyLabel.setText("Manager Key");
        add(managerKeyLabel);
        managerKeyLabel.setBounds(60, 380, 80, 20);

        managerSignupLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        managerSignupLabel.setForeground(new java.awt.Color(255, 255, 255));
        managerSignupLabel.setText("Manager Signup");
        add(managerSignupLabel);
        managerSignupLabel.setBounds(130, 90, 180, 30);

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name");
        add(firstNameLabel);
        firstNameLabel.setBounds(60, 140, 120, 20);

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name");
        add(lastNameLabel);
        lastNameLabel.setBounds(60, 200, 130, 20);

        signupButton.setBackground(new java.awt.Color(255, 255, 255));
        signupButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signupButton.setForeground(new java.awt.Color(0, 0, 0));
        signupButton.setText("Signup");
        /*
         * signupButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(signupButton);
        signupButton.setBounds(280, 420, 120, 40);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 460, 170, 20);

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");
        add(emailLabel);
        emailLabel.setBounds(60, 260, 80, 20);

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
        emailText.setBounds(50, 290, 270, 18);

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
        firstNameText.setBounds(50, 170, 270, 18);

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
        lastNameText.setBounds(50, 230, 270, 18);

        managerKeyText.setBackground(java.awt.Color.black);
        managerKeyText.setForeground(new java.awt.Color(255, 255, 255));
        add(managerKeyText);
        managerKeyText.setBounds(50, 410, 170, 20);

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
        passwordLabel.setBounds(60, 320, 80, 20);

        passwordText.setBackground(java.awt.Color.black);
        passwordText.setForeground(new java.awt.Color(255, 255, 255));
        add(passwordText);
        passwordText.setBounds(50, 350, 270, 20);

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

        signupSuccessfulLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        signupSuccessfulLabel.setForeground(new java.awt.Color(255, 255, 255));
        signupSuccessfulLabel.setText("Signup Successful! ");
        add(signupSuccessfulLabel);
        signupSuccessfulLabel.setBounds(120, 170, 210, 40);

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

        signupUnsuccessfulLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        signupUnsuccessfulLabel.setForeground(new java.awt.Color(255, 255, 255));
        signupUnsuccessfulLabel.setText("Signup Unsuccessful!");
        add(signupUnsuccessfulLabel);
        signupUnsuccessfulLabel.setBounds(110, 170, 230, 40);

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

    public javax.swing.JButton getManagerButton() {
        return managerButton;
    }

    public javax.swing.JLabel getManagerLabel() {
        return managerLabel;
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

    public javax.swing.JLabel getUserChoiceLabel() {
        return userChoiceLabel;
    }

    public javax.swing.JLabel getEmailLabel() {
        return emailLabel;
    }

    public javax.swing.JTextField getEmailText() {
        return emailText;
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

    public javax.swing.JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public javax.swing.JPasswordField getPasswordText() {
        return passwordText;
    }

    public javax.swing.JLabel getRenterSignupLabel() {
        return renterSignupLabel;
    }

    public javax.swing.JButton getSignupButton() {
        return signupButton;
    }

    public javax.swing.JLabel getManagerKeyLabel() {
        return managerKeyLabel;
    }

    public javax.swing.JPasswordField getManagerKeyText() {
        return managerKeyText;
    }

    public javax.swing.JLabel getManagerSignupLabel() {
        return managerSignupLabel;
    }

    public javax.swing.JLabel getLandordSignupLabel() {
        return landordSignupLabel;
    }

    public javax.swing.JButton getFinishButton() {
        return finishButton;
    }

    public javax.swing.JLabel getSignupSuccessfulLabel() {
        return signupSuccessfulLabel;
    }

    public javax.swing.JLabel getSignupUnsuccessfulLabel() {
        return signupUnsuccessfulLabel;
    }

    public javax.swing.JButton getTryAgainButton() {
        return tryAgainButton;
    }
}
