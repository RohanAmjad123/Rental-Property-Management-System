package control.controllers;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import presentation.guicomponents.*;
import datasource.companydatabase.*;
import business.businesslogic.*;
import business.usermodels.*;
import java.util.ArrayList;
import java.util.Properties;

import java.time.LocalDate;
import java.sql.SQLException;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/**
 * Class PropertyController
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */
public class PropertyController implements Controller, ActionListener {
    private Frontend view;
    private CompanyDatabase model;

    public PropertyController(Frontend view, CompanyDatabase model) {
        this.view = view;
        this.model = model;

        view.getPropertyView().getBackButton().addActionListener(this);
        view.getPropertyView().getSendEmailButton().addActionListener(this);
        view.getManageManagerProperties().getDeleteButton().addActionListener(this);
        view.getManageLandlordProperties().getDeleteButton().addActionListener(this);
        view.getManageManagerProperties().getDashboardButton().addActionListener(this);
        view.getManageLandlordProperties().getDashboardButton().addActionListener(this);
        view.getManageManagerProperties().getChangeStateButton().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getPropertyView().getBackButton()) {
            ArrayList<Property> activeProperties = new ArrayList<Property>();

            try {
                activeProperties = model.getStateProperties("active");
                view.getDashboard().updatePropertiesView(activeProperties);
            }
            catch (SQLException exception) {
                exception.printStackTrace();
            }

            User u = SingletonLogin.getInstance().getCurrentUser();

            if (u.getUserType().equals("renter")) {
                view.dashboard();
                view.getDashboard().loggedInRenter();
            }
            else if (u.getUserType().equals("landlord")) {
                view.dashboard();
                view.getDashboard().loggedInLandlord();
            }
            else if (u.getUserType().equals("manager")) {
                view.dashboard();
                view.getDashboard().loggedInManager();
            }
            else {
                view.dashboard();
                view.getDashboard().signedOut();
            }
        }
        else if (e.getSource() == view.getPropertyView().getSendEmailButton()) {
            String to = view.getPropertyView().getPropertyToBeViewed().getLandlordID();
            String from;
            User u = SingletonLogin.getInstance().getCurrentUser();

            if (u.getUserType().equals("renter") || u.getUserType().equals("landlord") || u.getUserType().equals("manager")) {
                from = u.getEmail();
            }
            else {
                from = "comapany@mail.com";
            }

            // MAIL SERVICE IMPLEMENTATION

            // sending mail from local host
            String host = "localhost";

            // System properties
            Properties properties = System.getProperties();

            // setup mail server using properties
            properties.setProperty("mail.smtp.host", host);

            // session object
            Session session = Session.getDefaultInstance(properties);

            try {
                // Mime Message Object
                MimeMessage message = new MimeMessage(session);

                // set From header field
                message.setFrom(new InternetAddress(from));

                // set To header field
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

                // set Email subject line
                message.setSubject("Email from RentSlower regarding your property");

                // set Email text from JTextArea
                message.setText(view.getPropertyView().getEmailLandlordTextArea().getText());

                // send email
                Transport.send(message);

                // display success
                view.getPropertyView().getEmailLandlordTextArea().setText("Email successfully sent!");
            }
            catch (NullPointerException evt) {
                evt.printStackTrace();
                view.getPropertyView().getEmailLandlordTextArea().setText("Email error! Could not send Email!");
            }
            catch (MessagingException evt) {
                evt.printStackTrace();
                view.getPropertyView().getEmailLandlordTextArea().setText("Email error! Could not send Email!");
            }
        }
        else if (e.getSource() == view.getManageManagerProperties().getDeleteButton()) {
            String postalCode = view.getManageManagerProperties().getPropertyList().getSelectedValue().getAddress().getPostalCode();

            try {
                model.deleteProperty(postalCode);

                ArrayList<Property> updatedProperties = new ArrayList<Property>();

                updatedProperties = model.getAllProperties();

                view.getManageManagerProperties().updatePropertiesView(updatedProperties);
                view.getManageManagerProperties().manageProperties();
            }
            catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
        else if (e.getSource() == view.getManageLandlordProperties().getDeleteButton()) {
            String postalCode = view.getManageLandlordProperties().getPropertyList().getSelectedValue().getAddress().getPostalCode();

            try {
                model.deleteProperty(postalCode);

                ArrayList<Property> updatedProperties = new ArrayList<Property>();

                updatedProperties = model.getProperties(SingletonLogin.getInstance().getCurrentUser().getEmail());

                view.getManageLandlordProperties().updatePropertiesView(updatedProperties);
                view.getManageLandlordProperties().manageProperties();
            }
            catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
        else if (e.getSource() == view.getManageManagerProperties().getDashboardButton()) {
            view.dashboard();
            view.getDashboard().loggedInManager();
        }
        else if (e.getSource() == view.getManageLandlordProperties().getDashboardButton()) {
            view.dashboard();
            view.getDashboard().loggedInLandlord();
        }
        else if (e.getSource() == view.getManageManagerProperties().getChangeStateButton()) {
            Property p = view.getManageManagerProperties().getPropertyList().getSelectedValue();
            String state = view.getManageManagerProperties().getChangeStateComboBox().getSelectedItem().toString();

            if (p.getState().equals("inactive") && state.equals("Active")) {
                try {
                    Fee f = model.getFee();

                    LocalDate d = LocalDate.now();
                    d = d.plusDays(f.getFeePeriod());
                    String day = String.valueOf(d.getDayOfMonth());
                    String month = String.valueOf(d.getMonthValue());
                    String year = String.valueOf(d.getYear());
                    DateModel feeExpiry = new DateModel(year, month, day);
                    
                    p.setFeeExpiry(feeExpiry);
                    p.setFeeAmount(f.getFeeAmount());
                    p.setState(state);

                    model.updateProperty(p);

                    ArrayList<Property> updatedProperties = new ArrayList<Property>();

                    updatedProperties = model.getAllProperties();

                    view.getManageManagerProperties().updatePropertiesView(updatedProperties);
                    view.getManageManagerProperties().manageProperties();
                }
                catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }

        }
    }
}
