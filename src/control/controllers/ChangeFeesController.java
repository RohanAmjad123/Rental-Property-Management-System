
package control.controllers;

import presentation.guicomponents.*;
import datasource.companydatabase.*;
import business.businesslogic.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * Class ChangeFeesController
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.2
 */
public class ChangeFeesController implements Controller, ActionListener {

	private Frontend view;
	private CompanyDatabase model;

	/**
	 * Initializes the values of Frontend and CompantDatabase
	 * Placing Action Listners to the buttons of our GUI so that if a
	 * button is pressed it will cause an action
	 * 
	 * @param view
	 * @param model
	 */

	public ChangeFeesController(Frontend view, CompanyDatabase model) {
		this.view = view;
		this.model = model;

		view.getChangeFees().getDashboardButton().addActionListener(this);
		view.getChangeFees().getUpdateButton().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.getChangeFees().getDashboardButton()) {
			view.dashboard();
			view.getDashboard().loggedInManager();

		}
		else if (e.getSource() == view.getChangeFees().getUpdateButton()) {
			int feeAmount = 0;
			int feePeriod = 0;

			try {
				String feeAmountString = view.getChangeFees().getFeeAmountComboBox().getSelectedItem().toString();
				String feePeriodString = view.getChangeFees().getFeePeriodComboBox().getSelectedItem().toString();

				feeAmount = Integer.parseInt(feeAmountString);
				feePeriod = Integer.parseInt(feePeriodString);
			} 
			catch (NullPointerException exception) {
				exception.printStackTrace();
			}
			catch (NumberFormatException exception) {
				exception.printStackTrace();
			}

			Fee fee = new Fee(feePeriod, feeAmount);

			try {
				model.setFee(fee);

				view.dashboard();
				view.getDashboard().loggedInManager();
			} 
			catch (SQLException exception) {
				exception.printStackTrace();
			}
		}
	}

}
