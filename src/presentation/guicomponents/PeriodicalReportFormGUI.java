package presentation.guicomponents;

import javax.swing.*;

/**
 * Class PeriodicalReportFormGUI
 * 
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @version 1.0
 */
public class PeriodicalReportFormGUI extends JPanel {
    private Frontend view;

    // Variables declaration - do not modify
    private javax.swing.JLabel copyrightLabel = new javax.swing.JLabel();
    private javax.swing.JButton dashboardButton = new javax.swing.JButton();
    private javax.swing.JComboBox<String> fromDayComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel fromDayLabel = new javax.swing.JLabel();
    private javax.swing.JLabel fromLabel = new javax.swing.JLabel();
    private javax.swing.JComboBox<String> fromMonthComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel fromMonthLabel = new javax.swing.JLabel();
    private javax.swing.JComboBox<String> fromYearComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel fromYearLabel = new javax.swing.JLabel();
    private javax.swing.JButton generateButton = new javax.swing.JButton();
    private javax.swing.JLabel generateLabel = new javax.swing.JLabel();
    private javax.swing.JLabel rentSlowerLabel = new javax.swing.JLabel();
    private javax.swing.JComboBox<String> toDayComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel toDayLabel = new javax.swing.JLabel();
    private javax.swing.JLabel toLabel = new javax.swing.JLabel();
    private javax.swing.JComboBox<String> toMonthComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel toMonthLabel = new javax.swing.JLabel();
    private javax.swing.JComboBox<String> toYearComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel toYearLabel = new javax.swing.JLabel();
    // End of variables declaration

    public PeriodicalReportFormGUI(Frontend view) {
        // assign view reference
        this.view = view;
        reportForm();
    }

    public void reportForm() {
        removeAll();

        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(445, 455));
        setLayout(null);

        rentSlowerLabel.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        rentSlowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentSlowerLabel.setText("RentSlower");
        add(rentSlowerLabel);
        rentSlowerLabel.setBounds(70, 20, 290, 70);

        generateLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        generateLabel.setForeground(new java.awt.Color(255, 255, 255));
        generateLabel.setText("Generate Periodical Summary Report");
        add(generateLabel);
        generateLabel.setBounds(30, 110, 410, 30);

        generateButton.setBackground(new java.awt.Color(255, 255, 255));
        generateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        generateButton.setForeground(new java.awt.Color(0, 0, 0));
        generateButton.setText("Generate");
        /*
         * generateButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(generateButton);
        generateButton.setBounds(300, 390, 120, 40);

        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setText("© 2021 RentSlower Team");
        add(copyrightLabel);
        copyrightLabel.setBounds(20, 420, 170, 20);

        dashboardButton.setBackground(new java.awt.Color(255, 255, 255));
        dashboardButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(0, 0, 0));
        dashboardButton.setText("X");
        /*
         * dashboardButton.addActionListener(new java.awt.event.ActionListener() {
         * public void actionPerformed(java.awt.event.ActionEvent evt) {
         * 
         * }
         * });
         */
        add(dashboardButton);
        dashboardButton.setBounds(370, 20, 50, 40);

        fromMonthComboBox.setBackground(new java.awt.Color(255, 255, 255));
        fromMonthComboBox.setForeground(java.awt.Color.black);
        fromMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        add(fromMonthComboBox);
        fromMonthComboBox.setBounds(180, 230, 80, 20);

        fromDayLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fromDayLabel.setForeground(new java.awt.Color(255, 255, 255));
        fromDayLabel.setText("Day");
        add(fromDayLabel);
        fromDayLabel.setBounds(70, 200, 50, 20);

        fromMonthLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fromMonthLabel.setForeground(new java.awt.Color(255, 255, 255));
        fromMonthLabel.setText("Month");
        add(fromMonthLabel);
        fromMonthLabel.setBounds(190, 200, 50, 20);

        fromYearLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fromYearLabel.setForeground(new java.awt.Color(255, 255, 255));
        fromYearLabel.setText("Year");
        add(fromYearLabel);
        fromYearLabel.setBounds(310, 200, 50, 20);

        fromLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fromLabel.setForeground(new java.awt.Color(255, 255, 255));
        fromLabel.setText("From");
        add(fromLabel);
        fromLabel.setBounds(60, 170, 50, 20);

        fromYearComboBox.setBackground(new java.awt.Color(255, 255, 255));
        fromYearComboBox.setForeground(java.awt.Color.black);
        fromYearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021" }));
        add(fromYearComboBox);
        fromYearComboBox.setBounds(300, 230, 80, 20);

        fromDayComboBox.setBackground(new java.awt.Color(255, 255, 255));
        fromDayComboBox.setForeground(java.awt.Color.black);
        fromDayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                        "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        add(fromDayComboBox);
        fromDayComboBox.setBounds(60, 230, 80, 20);

        toMonthComboBox.setBackground(new java.awt.Color(255, 255, 255));
        toMonthComboBox.setForeground(java.awt.Color.black);
        toMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        add(toMonthComboBox);
        toMonthComboBox.setBounds(180, 330, 80, 20);

        toDayLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toDayLabel.setForeground(new java.awt.Color(255, 255, 255));
        toDayLabel.setText("Day");
        add(toDayLabel);
        toDayLabel.setBounds(70, 300, 50, 20);

        toMonthLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toMonthLabel.setForeground(new java.awt.Color(255, 255, 255));
        toMonthLabel.setText("Month");
        add(toMonthLabel);
        toMonthLabel.setBounds(190, 300, 50, 20);

        toYearLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toYearLabel.setForeground(new java.awt.Color(255, 255, 255));
        toYearLabel.setText("Year");
        add(toYearLabel);
        toYearLabel.setBounds(310, 300, 50, 20);

        toLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toLabel.setForeground(new java.awt.Color(255, 255, 255));
        toLabel.setText("To");
        add(toLabel);
        toLabel.setBounds(60, 270, 30, 20);

        toYearComboBox.setBackground(new java.awt.Color(255, 255, 255));
        toYearComboBox.setForeground(java.awt.Color.black);
        toYearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021" }));
        add(toYearComboBox);
        toYearComboBox.setBounds(300, 330, 80, 20);

        toDayComboBox.setBackground(new java.awt.Color(255, 255, 255));
        toDayComboBox.setForeground(java.awt.Color.black);
        toDayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                        "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        add(toDayComboBox);
        toDayComboBox.setBounds(60, 330, 80, 20);

        revalidate();
        repaint();
        view.pack();
    }

    // getter methods

    public javax.swing.JLabel getCopyrightLabel() {
        return copyrightLabel;
    }

    public javax.swing.JButton getDashboardButton() {
        return dashboardButton;
    }

    public javax.swing.JComboBox<String> getFromDayComboBox() {
        return fromDayComboBox;
    }

    public javax.swing.JLabel getFromDayLabel() {
        return fromDayLabel;
    }

    public javax.swing.JLabel getFromLabel() {
        return fromLabel;
    }

    public javax.swing.JComboBox<String> getFromMonthComboBox() {
        return fromMonthComboBox;
    }

    public javax.swing.JLabel getFromMonthLabel() {
        return fromMonthLabel;
    }

    public javax.swing.JComboBox<String> getFromYearComboBox() {
        return fromYearComboBox;
    }

    public javax.swing.JLabel getFromYearLabel() {
        return fromYearLabel;
    }

    public javax.swing.JButton getGenerateButton() {
        return generateButton;
    }

    public javax.swing.JLabel getGenerateLabel() {
        return generateLabel;
    }

    public javax.swing.JLabel getRentSlowerLabel() {
        return rentSlowerLabel;
    }

    public javax.swing.JComboBox<String> getToDayComboBox() {
        return toDayComboBox;
    }

    public javax.swing.JLabel getToDayLabel() {
        return toDayLabel;
    }

    public javax.swing.JLabel getToLabel() {
        return toLabel;
    }

    public javax.swing.JComboBox<String> getToMonthComboBox() {
        return toMonthComboBox;
    }

    public javax.swing.JLabel getToMonthLabel() {
        return toMonthLabel;
    }

    public javax.swing.JComboBox<String> getToYearComboBox() {
        return toYearComboBox;
    }

    public javax.swing.JLabel getToYearLabel() {
        return toYearLabel;
    }
}
