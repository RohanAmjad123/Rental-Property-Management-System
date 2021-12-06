package presentation.guicomponents;

import javax.swing.*;
import control.controllers.Controller;

/**
 * Class DashboardGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */
public class DashboardGUI extends JPanel {
    private Controller dashboardListener;
    private Frontend view;

    public DashboardGUI(Frontend view) {
        // assign view reference
        this.view = view;
    }

    public void setDashboardListener(Controller dashboardListener) {

    }
}
