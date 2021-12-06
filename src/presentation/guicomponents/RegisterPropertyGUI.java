package presentation.guicomponents;

import javax.swing.*;
import control.controllers.Controller;

/**
 * Class RegisterPropertyGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */
public class RegisterPropertyGUI extends JPanel {
    private Controller registerPropertyListener;
    private Frontend view;

    public RegisterPropertyGUI(Frontend view) {
        // assign view reference
        this.view = view;
    }

    public void setRegisterPropertyListener(Controller registerPropertyListener) {

    }

}
