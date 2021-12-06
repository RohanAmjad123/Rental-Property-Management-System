package presentation.guicomponents;

import javax.swing.*;
import control.controllers.Controller;

/**
 * Class SignupGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */
public class SignupGUI extends JPanel {
    private Controller signupListener;
    private Frontend view;

    public SignupGUI(Frontend view) {
        // assign view reference
        this.view = view;
    }

    public void setSignupListener(Controller signupListener) {

    }
}
