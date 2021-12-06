package tests;

import static org.junit.Assert.*;
import org.junit.*;
import datasource.companydatabase.*;
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
}
