package tests;

import org.junit.*;
import control.controllers.*;

public class CompanyDatabaseTest {
    @Test
    public void startApp() {
        Backend b = new Backend();
        b.runApp();
    }
}
