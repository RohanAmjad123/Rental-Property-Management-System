package control.controllers;

import presentation.guicomponents.*;
import datasource.companydatabase.*;
import business.businesslogic.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * Class PeriodicalSummaryReportController
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */
public class PeriodicalSummaryReportController implements Controller, ActionListener {
    Frontend view;
    CompanyDatabase model;

    public PeriodicalSummaryReportController(Frontend view, CompanyDatabase model) {
        this.view = view;
        this.model = model;

        view.getPeriodicalReportForm().getGenerateButton().addActionListener(this);
        view.getPeriodicalReportForm().getDashboardButton().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getPeriodicalReportForm().getGenerateButton()) {
            String fromDay = "";
            String fromMonth = "";
            String fromYear = "";
            String toDay = "";
            String toMonth = "";
            String toYear = "";

            try {
                fromDay = view.getPeriodicalReportForm().getFromDayComboBox().getSelectedItem().toString();
                fromMonth = view.getPeriodicalReportForm().getFromMonthComboBox().getSelectedItem().toString();
                fromYear = view.getPeriodicalReportForm().getFromYearComboBox().getSelectedItem().toString();
                toDay = view.getPeriodicalReportForm().getToDayComboBox().getSelectedItem().toString();
                toMonth = view.getPeriodicalReportForm().getToMonthComboBox().getSelectedItem().toString();
                toYear = view.getPeriodicalReportForm().getToYearComboBox().getSelectedItem().toString();                
            }
            catch (NullPointerException exception) {
                exception.printStackTrace();
            }

            DateModel from = new DateModel(fromYear, fromMonth, fromDay);
            DateModel to = new DateModel(toYear, toMonth, toDay);

            try {
                model.getPeriodicalSummary(from, to);
            }
            catch (SQLException exception) {
                exception.printStackTrace();
            }

            view.dashboard();
            view.getDashboard().loggedInManager();

        }
        else if (e.getSource() == view.getPeriodicalReportForm().getDashboardButton()) {
            view.dashboard();
            view.getDashboard().loggedInManager();
        }
    }
}
