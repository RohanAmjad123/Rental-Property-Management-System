package presentation.guicomponents;

import javax.swing.*;
import control.controllers.Controller;

/**
 * Class ViewCompanyDatabaseGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */
public class ViewCompanyDatabaseGUI extends JPanel {
    private Controller viewDatabaseListener;
    private Frontend view;

    public ViewCompanyDatabaseGUI(Frontend view) {
        // assign view reference
        this.view = view;
    }

    public void setViewDatabaseListener(Controller viewDatabaseListener) {

    }
}
