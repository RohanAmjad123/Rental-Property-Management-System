package presentation.guicomponents;

import javax.swing.*;
import control.controllers.Controller;

/**
 * Class PeriodicalReportFormGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */
public class PeriodicalReportFormGUI extends JPanel {
    private Controller reportFormListener;
    private Frontend view;

    public PeriodicalReportFormGUI(Frontend view) {
        // assign view reference
        this.view = view;
    }

    public void setReportFormListener(Controller reportFormListener) {

    }
}
