package presentation.guicomponents;

import javax.swing.*;
import control.controllers.Controller;

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
    private Controller signupListener;
    private Frontend view;

    // Variables declaration - do not modify                     
    private javax.swing.JLabel copyrightLabel;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JButton landlordButton;
    private javax.swing.JLabel landlordLabel;
    private javax.swing.JButton managerButton;
    private javax.swing.JLabel managerLabel;
    private javax.swing.JLabel rentSlowerLabel;
    private javax.swing.JButton renterButton;
    private javax.swing.JLabel renterLabel;
    private javax.swing.JLabel userChoiceLabel;
    // End of variables declaration 

    // Variables declaration - do not modify                     
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel renterSignupLabel;
    private javax.swing.JButton signupButton;
    // End of variables declaration 

    public SignupGUI(Frontend view) {
        // assign view reference
        this.view = view;
        userChoice();
    }

    public void setSignupListener(Controller signupListener) {

    }

    private void userChoice() {
        rentSlowerLabel = new javax.swing.JLabel();
        managerLabel = new javax.swing.JLabel();
        userChoiceLabel = new javax.swing.JLabel();
        renterLabel = new javax.swing.JLabel();
        landlordLabel = new javax.swing.JLabel();
        landlordButton = new javax.swing.JButton();
        dashboardButton = new javax.swing.JButton();
        copyrightLabel = new javax.swing.JLabel();
        renterButton = new javax.swing.JButton();
        managerButton = new javax.swing.JButton();

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
        landlordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });
        add(landlordButton);
        landlordButton.setBounds(150, 280, 140, 50);

        dashboardButton.setBackground(new java.awt.Color(255, 255, 255));
        dashboardButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(0, 0, 0));
        dashboardButton.setText("X");
        dashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
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
        renterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });
        add(renterButton);
        renterButton.setBounds(150, 190, 140, 50);

        managerButton.setBackground(new java.awt.Color(255, 255, 255));
        managerButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        managerButton.setForeground(new java.awt.Color(0, 0, 0));
        managerButton.setText("Manager");
        managerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        add(managerButton);
        managerButton.setBounds(150, 370, 140, 50);
    }

    private void renterSignup() {
        rentSlowerLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        renterSignupLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        signupButton = new javax.swing.JButton();
        copyrightLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        dashboardButton = new javax.swing.JButton();

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
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
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
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        add(emailText);
        emailText.setBounds(50, 300, 270, 18);

        firstNameText.setBackground(java.awt.Color.black);
        firstNameText.setForeground(new java.awt.Color(255, 255, 255));
        firstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        add(firstNameText);
        firstNameText.setBounds(50, 180, 270, 18);

        lastNameText.setBackground(java.awt.Color.black);
        lastNameText.setForeground(new java.awt.Color(255, 255, 255));
        lastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
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
        dashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        add(dashboardButton);
        dashboardButton.setBounds(370, 20, 50, 40);
    }

    

}
