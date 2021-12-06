package presentation.guicomponents;

import javax.swing.*;
import control.controllers.Controller;

/**
 * Class ManageLandlordPropertiesGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */
public class ManageLandlordPropertiesGUI extends JPanel {
    private Controller propertyListener;
    private Frontend view;

    public ManageLandlordPropertiesGUI(Frontend view) {
        // assign view reference
        this.view = view;
    }

    public void setPropertyListener(Controller propertyListener) {

    }
}
