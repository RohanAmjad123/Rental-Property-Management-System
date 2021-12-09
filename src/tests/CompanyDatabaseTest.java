package tests;

import static org.junit.Assert.*;
import org.junit.*;
import datasource.companydatabase.*;
import java.sql.*;
import control.controllers.*;

public class CompanyDatabaseTest {
    @Test
    public void startApp() {
        Backend b = new Backend();
        b.runApp();
    }
}
