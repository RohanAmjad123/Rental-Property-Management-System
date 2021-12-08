package presentation.guicomponents;

import javax.swing.*;

/**
 * Class DashboardGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @version 1.0
 */
public class DashboardGUI extends JPanel {
    private Frontend view;

    public DashboardGUI(Frontend view) {
        // assign view reference
        this.view = view;
    }
}
