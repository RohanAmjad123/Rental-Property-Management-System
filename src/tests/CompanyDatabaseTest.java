package tests;

import static org.junit.Assert.*;
import org.junit.*;
import datasource.companydatabase.*;
import business.usermodels.*;
import java.sql.*;

public class CompanyDatabaseTest {
    @Test
    public void getConnection() {
        CompanyDatabase db = new CompanyDatabase("database", "jdbc:mysql://localhost:3306/Rental_Property_Management_System", "root", "Samina1139@");
    }
    @Test
    public void userAlreadyExists() {
        CompanyDatabase db = new CompanyDatabase("database", "jdbc:mysql://localhost:3306/Rental_Property_Management_System", "root", "Samina1139@");
        db.validSignup("janedoe@gmail.com", "123", "blah", "blah", "manager");
    }
    @Test
    public void successfulLogin() {
        CompanyDatabase db = new CompanyDatabase("database", "jdbc:mysql://localhost:3306/Rental_Property_Management_System", "root", "Samina1139@");
        User expected = new User("janedoe@gmail.com", "123", "blah", "blah", 4, "manager");
        User actual = db.login("janedoe@gmail.com", "123", "manager");
        assertEquals(expected.getEmail(), actual.getEmail());
        assertEquals(expected.getPassword(), actual.getPassword());
        assertEquals(expected.getFirstName(), actual.getFirstName());
        assertEquals(expected.getLastName(), actual.getLastName());
        assertEquals(expected.getUserID(), actual.getUserID());
        assertEquals(expected.getUserType(), actual.getUserType());
    }
    @Test
    public void failedLogin() {
        CompanyDatabase db = new CompanyDatabase("databaseget", "jdbc:mysql://localhost:3306/Rental_Property_Management_System", "root", "Samina1139@");
        User expected = new User("janedoe@gmail.com", "123", "blah", "blah", 4, "manager");
        User actual = db.login("janedoe@gmail.com", "wrongpass", "manager");
    }
}
