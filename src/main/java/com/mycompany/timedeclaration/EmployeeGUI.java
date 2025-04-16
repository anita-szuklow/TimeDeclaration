package com.mycompany.timedeclaration;

import static java.lang.Integer.parseInt;

public class EmployeeGUI extends javax.swing.JFrame {

    private Employee employee;

    public EmployeeGUI() {
        initComponents();
    }
    public EmployeeGUI(Employee employee) {
        this.employee = employee;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JTabbedPane();
        addTimesheetPanel = new javax.swing.JPanel();
        valuesAddTimesheetPanel = new javax.swing.JPanel();
        weekAddTimesheetPanel = new javax.swing.JPanel();
        weekComboBox = new javax.swing.JComboBox<>();
        weekLabel = new javax.swing.JLabel();
        hoursAddTimesheetPanel = new javax.swing.JPanel();
        workHoursLabel = new javax.swing.JLabel();
        sickTimeLabel = new javax.swing.JLabel();
        holidayHoursLabel = new javax.swing.JLabel();
        workHoursTextField = new javax.swing.JTextField();
        sickTimeTextField = new javax.swing.JTextField();
        holidayHoursTextField = new javax.swing.JTextField();
        submitTimesheetButton = new javax.swing.JButton();
        successAddTimesheetField = new javax.swing.JLabel();
        hiddenPanelAddTimesheet = new javax.swing.JLayeredPane();
        infoTimesheetHeaderLabel = new javax.swing.JLabel();
        infoTimesheet1Label = new javax.swing.JLabel();
        infoTimesheet2Label = new javax.swing.JLabel();
        infoTimesheet3Label = new javax.swing.JLabel();
        confirmHiddenButton = new javax.swing.JButton();
        cancelHiddenButton = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        timesheetSummaryPanel = new javax.swing.JPanel();
        timesheetScrollPanel = new javax.swing.JScrollPane();
        timesheetTextArea = new javax.swing.JTextArea();
        changePasswordPanel = new javax.swing.JPanel();
        changePasswordValuesPanel = new javax.swing.JPanel();
        oldPasswordField = new javax.swing.JPasswordField();
        newPasswordField = new javax.swing.JPasswordField();
        newPasswordFieldCheck = new javax.swing.JPasswordField();
        oldPaswordLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        newPassword2Label = new javax.swing.JLabel();
        changePasswordButton = new javax.swing.JButton();
        wrongPasswordTextField = new javax.swing.JLabel();
        logOffPanel = new javax.swing.JPanel();
        confirmLogOffLabel = new javax.swing.JLabel();
        confirmLogOffButton = new javax.swing.JButton();
        fullname = new javax.swing.JLabel();
        contractTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Time Declaration");
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(25, 25, 25));
        backgroundPanel.setForeground(new java.awt.Color(204, 204, 204));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(920, 520));

        menuPanel.setBackground(new java.awt.Color(25, 25, 25));
        menuPanel.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        menuPanel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        menuPanel.setInheritsPopupMenu(true);
        menuPanel.setPreferredSize(new java.awt.Dimension(800, 450));

        addTimesheetPanel.setBackground(new java.awt.Color(25, 25, 25));
        addTimesheetPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addTimesheetPanel.setPreferredSize(new java.awt.Dimension(572, 400));

        valuesAddTimesheetPanel.setBackground(new java.awt.Color(25, 25, 25));
        valuesAddTimesheetPanel.setPreferredSize(new java.awt.Dimension(400, 200));

        weekAddTimesheetPanel.setBackground(new java.awt.Color(25, 25, 25));
        weekAddTimesheetPanel.setForeground(new java.awt.Color(204, 204, 204));

        weekComboBox.setBackground(new java.awt.Color(25, 25, 25));
        weekComboBox.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        weekComboBox.setForeground(new java.awt.Color(204, 204, 204));
        weekComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "27.11.2023-3.12.2023", "4.12.2023-10.12.2023", "11.12.2023-17.12.2023", "18.12.2023-24.12.2023", "25.12.2023-31.12.2023", "1.01.2024-7.01.2024", "8.01.2024-14.01.2024", "15.01.2024-21.01.2024", "22.01.2024-28.01.2024", "29.01.2024-4.02.2024", "5.02.2024-11.02.2024", "12.02.2024-18.02.2024", "19.02.2024-25.02.2024", "26.02.2024-1.03.2024" }));
        weekComboBox.setActionCommand("");
        weekComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        weekComboBox.setMinimumSize(new java.awt.Dimension(150, 20));
        weekComboBox.setPreferredSize(new java.awt.Dimension(250, 25));

        weekLabel.setBackground(new java.awt.Color(25, 25, 25));
        weekLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        weekLabel.setForeground(new java.awt.Color(204, 204, 204));
        weekLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weekLabel.setText("Week:");

        javax.swing.GroupLayout weekAddTimesheetPanelLayout = new javax.swing.GroupLayout(weekAddTimesheetPanel);
        weekAddTimesheetPanel.setLayout(weekAddTimesheetPanelLayout);
        weekAddTimesheetPanelLayout.setHorizontalGroup(
            weekAddTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, weekAddTimesheetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(weekLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(weekComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        weekAddTimesheetPanelLayout.setVerticalGroup(
            weekAddTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weekAddTimesheetPanelLayout.createSequentialGroup()
                .addGroup(weekAddTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weekComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weekLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        weekComboBox.getAccessibleContext().setAccessibleName("");
        weekLabel.getAccessibleContext().setAccessibleName("");

        hoursAddTimesheetPanel.setBackground(new java.awt.Color(25, 25, 25));
        hoursAddTimesheetPanel.setForeground(new java.awt.Color(204, 204, 204));
        hoursAddTimesheetPanel.setPreferredSize(new java.awt.Dimension(400, 60));

        workHoursLabel.setBackground(new java.awt.Color(25, 25, 25));
        workHoursLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        workHoursLabel.setForeground(new java.awt.Color(204, 204, 204));
        workHoursLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workHoursLabel.setText("Working hours:");
        workHoursLabel.setPreferredSize(new java.awt.Dimension(100, 20));

        sickTimeLabel.setBackground(new java.awt.Color(25, 25, 25));
        sickTimeLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        sickTimeLabel.setForeground(new java.awt.Color(204, 204, 204));
        sickTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sickTimeLabel.setText("Sick hours:");
        sickTimeLabel.setPreferredSize(new java.awt.Dimension(100, 20));

        holidayHoursLabel.setBackground(new java.awt.Color(25, 25, 25));
        holidayHoursLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        holidayHoursLabel.setForeground(new java.awt.Color(204, 204, 204));
        holidayHoursLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        holidayHoursLabel.setText("Holidays hours:");
        holidayHoursLabel.setMaximumSize(new java.awt.Dimension(100, 20));
        holidayHoursLabel.setMinimumSize(new java.awt.Dimension(100, 20));
        holidayHoursLabel.setPreferredSize(new java.awt.Dimension(100, 20));

        workHoursTextField.setBackground(new java.awt.Color(25, 25, 25));
        workHoursTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        workHoursTextField.setForeground(new java.awt.Color(204, 204, 204));
        workHoursTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workHoursTextField.setText("0");
        workHoursTextField.setActionCommand("");
        workHoursTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        workHoursTextField.setPreferredSize(new java.awt.Dimension(110, 25));

        sickTimeTextField.setBackground(new java.awt.Color(25, 25, 25));
        sickTimeTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        sickTimeTextField.setForeground(new java.awt.Color(204, 204, 204));
        sickTimeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sickTimeTextField.setText("0");
        sickTimeTextField.setActionCommand("");
        sickTimeTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        sickTimeTextField.setPreferredSize(new java.awt.Dimension(110, 25));

        holidayHoursTextField.setBackground(new java.awt.Color(25, 25, 25));
        holidayHoursTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        holidayHoursTextField.setForeground(new java.awt.Color(204, 204, 204));
        holidayHoursTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        holidayHoursTextField.setText("0");
        holidayHoursTextField.setActionCommand("");
        holidayHoursTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        holidayHoursTextField.setMinimumSize(new java.awt.Dimension(110, 19));
        holidayHoursTextField.setPreferredSize(new java.awt.Dimension(110, 25));

        javax.swing.GroupLayout hoursAddTimesheetPanelLayout = new javax.swing.GroupLayout(hoursAddTimesheetPanel);
        hoursAddTimesheetPanel.setLayout(hoursAddTimesheetPanelLayout);
        hoursAddTimesheetPanelLayout.setHorizontalGroup(
            hoursAddTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hoursAddTimesheetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hoursAddTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(workHoursLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workHoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(hoursAddTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sickTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sickTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(hoursAddTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(holidayHoursLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(holidayHoursTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        hoursAddTimesheetPanelLayout.setVerticalGroup(
            hoursAddTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hoursAddTimesheetPanelLayout.createSequentialGroup()
                .addGroup(hoursAddTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workHoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(holidayHoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sickTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hoursAddTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workHoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sickTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(holidayHoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        workHoursLabel.getAccessibleContext().setAccessibleName("");
        sickTimeLabel.getAccessibleContext().setAccessibleName("");
        holidayHoursLabel.getAccessibleContext().setAccessibleName("");
        workHoursTextField.getAccessibleContext().setAccessibleName("");
        sickTimeTextField.getAccessibleContext().setAccessibleName("");
        holidayHoursTextField.getAccessibleContext().setAccessibleName("");

        submitTimesheetButton.setBackground(new java.awt.Color(25, 25, 25));
        submitTimesheetButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        submitTimesheetButton.setForeground(new java.awt.Color(204, 204, 204));
        submitTimesheetButton.setText("submit timesheet");
        submitTimesheetButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        submitTimesheetButton.setContentAreaFilled(false);
        submitTimesheetButton.setPreferredSize(new java.awt.Dimension(150, 25));
        submitTimesheetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitTimesheetButtonActionPerformed(evt);
            }
        });

        successAddTimesheetField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        successAddTimesheetField.setForeground(new java.awt.Color(204, 204, 204));
        successAddTimesheetField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        successAddTimesheetField.setPreferredSize(new java.awt.Dimension(400, 25));

        javax.swing.GroupLayout valuesAddTimesheetPanelLayout = new javax.swing.GroupLayout(valuesAddTimesheetPanel);
        valuesAddTimesheetPanel.setLayout(valuesAddTimesheetPanelLayout);
        valuesAddTimesheetPanelLayout.setHorizontalGroup(
            valuesAddTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valuesAddTimesheetPanelLayout.createSequentialGroup()
                .addGroup(valuesAddTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(weekAddTimesheetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoursAddTimesheetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitTimesheetButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(successAddTimesheetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        valuesAddTimesheetPanelLayout.setVerticalGroup(
            valuesAddTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valuesAddTimesheetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(weekAddTimesheetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hoursAddTimesheetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitTimesheetButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(successAddTimesheetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        hiddenPanelAddTimesheet.setVisible(false);
        hiddenPanelAddTimesheet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hiddenPanelAddTimesheet.setPreferredSize(new java.awt.Dimension(450, 180));

        infoTimesheetHeaderLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        infoTimesheetHeaderLabel.setForeground(new java.awt.Color(204, 204, 204));
        infoTimesheetHeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoTimesheetHeaderLabel.setText(timesheetInfoValidity());
        infoTimesheetHeaderLabel.setPreferredSize(new java.awt.Dimension(450, 20));

        infoTimesheet1Label.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        infoTimesheet1Label.setForeground(new java.awt.Color(204, 204, 204));
        infoTimesheet1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoTimesheet1Label.setText(timesheetInfoValidity());
        infoTimesheet1Label.setPreferredSize(new java.awt.Dimension(450, 20));

        infoTimesheet2Label.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        infoTimesheet2Label.setForeground(new java.awt.Color(204, 204, 204));
        infoTimesheet2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoTimesheet2Label.setText(timesheetInfoValidity());
        infoTimesheet2Label.setPreferredSize(new java.awt.Dimension(450, 20));

        infoTimesheet3Label.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        infoTimesheet3Label.setForeground(new java.awt.Color(204, 204, 204));
        infoTimesheet3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoTimesheet3Label.setText(timesheetInfoValidity());
        infoTimesheet3Label.setPreferredSize(new java.awt.Dimension(450, 20));

        confirmHiddenButton.setBackground(new java.awt.Color(25, 25, 25));
        confirmHiddenButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        confirmHiddenButton.setForeground(new java.awt.Color(204, 204, 204));
        confirmHiddenButton.setText("confirm");
        confirmHiddenButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        confirmHiddenButton.setContentAreaFilled(false);
        confirmHiddenButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        confirmHiddenButton.setPreferredSize(new java.awt.Dimension(150, 25));
        confirmHiddenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmHiddenButtonActionPerformed(evt);
            }
        });

        cancelHiddenButton.setBackground(new java.awt.Color(25, 25, 25));
        cancelHiddenButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cancelHiddenButton.setForeground(new java.awt.Color(204, 204, 204));
        cancelHiddenButton.setText("cancel");
        cancelHiddenButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        cancelHiddenButton.setContentAreaFilled(false);
        cancelHiddenButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelHiddenButton.setPreferredSize(new java.awt.Dimension(150, 25));
        cancelHiddenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelHiddenButtonActionPerformed(evt);
            }
        });

        hiddenPanelAddTimesheet.setLayer(infoTimesheetHeaderLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hiddenPanelAddTimesheet.setLayer(infoTimesheet1Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hiddenPanelAddTimesheet.setLayer(infoTimesheet2Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hiddenPanelAddTimesheet.setLayer(infoTimesheet3Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hiddenPanelAddTimesheet.setLayer(confirmHiddenButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        hiddenPanelAddTimesheet.setLayer(cancelHiddenButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout hiddenPanelAddTimesheetLayout = new javax.swing.GroupLayout(hiddenPanelAddTimesheet);
        hiddenPanelAddTimesheet.setLayout(hiddenPanelAddTimesheetLayout);
        hiddenPanelAddTimesheetLayout.setHorizontalGroup(
            hiddenPanelAddTimesheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hiddenPanelAddTimesheetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hiddenPanelAddTimesheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(hiddenPanelAddTimesheetLayout.createSequentialGroup()
                        .addComponent(confirmHiddenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelHiddenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(infoTimesheet3Label, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, hiddenPanelAddTimesheetLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(infoTimesheet2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, hiddenPanelAddTimesheetLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(infoTimesheet1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, hiddenPanelAddTimesheetLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(infoTimesheetHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        hiddenPanelAddTimesheetLayout.setVerticalGroup(
            hiddenPanelAddTimesheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hiddenPanelAddTimesheetLayout.createSequentialGroup()
                .addComponent(infoTimesheetHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infoTimesheet1Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoTimesheet2Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoTimesheet3Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(hiddenPanelAddTimesheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmHiddenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelHiddenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout addTimesheetPanelLayout = new javax.swing.GroupLayout(addTimesheetPanel);
        addTimesheetPanel.setLayout(addTimesheetPanelLayout);
        addTimesheetPanelLayout.setHorizontalGroup(
            addTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addTimesheetPanelLayout.createSequentialGroup()
                .addGroup(addTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addTimesheetPanelLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valuesAddTimesheetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addTimesheetPanelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(hiddenPanelAddTimesheet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        addTimesheetPanelLayout.setVerticalGroup(
            addTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addTimesheetPanelLayout.createSequentialGroup()
                .addGroup(addTimesheetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addTimesheetPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(valuesAddTimesheetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addTimesheetPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hiddenPanelAddTimesheet, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );

        menuPanel.addTab("Add timesheet", addTimesheetPanel);

        timesheetSummaryPanel.setBackground(new java.awt.Color(25, 25, 25));
        timesheetSummaryPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black));
        timesheetSummaryPanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                timesheetSummaryPanelFocusGained(evt);
            }
        });

        //reportScrollPanel.setVisible(false);

        timesheetTextArea.setBackground(new java.awt.Color(25, 25, 25));
        timesheetTextArea.setColumns(20);
        timesheetTextArea.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        timesheetTextArea.setForeground(new java.awt.Color(204, 204, 204));
        timesheetTextArea.setRows(5);
        timesheetTextArea.setText(employee.getTimesheet());
        timesheetTextArea.setBorder(null);
        timesheetTextArea.setCaretColor(new java.awt.Color(204, 204, 204));
        timesheetTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        timesheetScrollPanel.setViewportView(timesheetTextArea);

        javax.swing.GroupLayout timesheetSummaryPanelLayout = new javax.swing.GroupLayout(timesheetSummaryPanel);
        timesheetSummaryPanel.setLayout(timesheetSummaryPanelLayout);
        timesheetSummaryPanelLayout.setHorizontalGroup(
            timesheetSummaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(timesheetScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
        );
        timesheetSummaryPanelLayout.setVerticalGroup(
            timesheetSummaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(timesheetScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );

        menuPanel.addTab("Timesheet summary", timesheetSummaryPanel);

        changePasswordPanel.setBackground(new java.awt.Color(25, 25, 25));
        changePasswordPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black));

        changePasswordValuesPanel.setBackground(new java.awt.Color(25, 25, 25));
        changePasswordValuesPanel.setForeground(new java.awt.Color(204, 204, 204));

        oldPasswordField.setBackground(new java.awt.Color(25, 25, 25));
        oldPasswordField.setForeground(new java.awt.Color(204, 204, 204));
        oldPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        oldPasswordField.setPreferredSize(new java.awt.Dimension(200, 25));

        newPasswordField.setBackground(new java.awt.Color(25, 25, 25));
        newPasswordField.setForeground(new java.awt.Color(204, 204, 204));
        newPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newPasswordField.setToolTipText("Requirements: 8-20 characters, at least 1 capital letter, 1 lowercase letter, 1 number, no symbols");
        newPasswordField.setPreferredSize(new java.awt.Dimension(200, 25));

        newPasswordFieldCheck.setBackground(new java.awt.Color(25, 25, 25));
        newPasswordFieldCheck.setForeground(new java.awt.Color(204, 204, 204));
        newPasswordFieldCheck.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newPasswordFieldCheck.setPreferredSize(new java.awt.Dimension(200, 25));

        oldPaswordLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        oldPaswordLabel.setForeground(new java.awt.Color(204, 204, 204));
        oldPaswordLabel.setText("Enter old password");
        oldPaswordLabel.setMaximumSize(new java.awt.Dimension(150, 20));
        oldPaswordLabel.setMinimumSize(new java.awt.Dimension(150, 20));
        oldPaswordLabel.setPreferredSize(new java.awt.Dimension(150, 20));

        newPasswordLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        newPasswordLabel.setForeground(new java.awt.Color(204, 204, 204));
        newPasswordLabel.setText("Enter new password");
        newPasswordLabel.setMaximumSize(new java.awt.Dimension(150, 20));
        newPasswordLabel.setMinimumSize(new java.awt.Dimension(150, 20));
        newPasswordLabel.setPreferredSize(new java.awt.Dimension(150, 20));

        newPassword2Label.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        newPassword2Label.setForeground(new java.awt.Color(204, 204, 204));
        newPassword2Label.setText("Confirm new password");
        newPassword2Label.setMaximumSize(new java.awt.Dimension(150, 20));
        newPassword2Label.setMinimumSize(new java.awt.Dimension(150, 20));
        newPassword2Label.setPreferredSize(new java.awt.Dimension(150, 20));

        javax.swing.GroupLayout changePasswordValuesPanelLayout = new javax.swing.GroupLayout(changePasswordValuesPanel);
        changePasswordValuesPanel.setLayout(changePasswordValuesPanelLayout);
        changePasswordValuesPanelLayout.setHorizontalGroup(
            changePasswordValuesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordValuesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(changePasswordValuesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oldPaswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newPassword2Label, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(changePasswordValuesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oldPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPasswordFieldCheck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        changePasswordValuesPanelLayout.setVerticalGroup(
            changePasswordValuesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordValuesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(changePasswordValuesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldPaswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(changePasswordValuesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(changePasswordValuesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswordFieldCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPassword2Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        changePasswordButton.setBackground(new java.awt.Color(25, 25, 25));
        changePasswordButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        changePasswordButton.setForeground(new java.awt.Color(204, 204, 204));
        changePasswordButton.setText("Change password");
        changePasswordButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        changePasswordButton.setContentAreaFilled(false);
        changePasswordButton.setMaximumSize(new java.awt.Dimension(400, 20));
        changePasswordButton.setMinimumSize(new java.awt.Dimension(400, 20));
        changePasswordButton.setPreferredSize(new java.awt.Dimension(400, 25));
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });

        wrongPasswordTextField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        wrongPasswordTextField.setForeground(new java.awt.Color(204, 204, 204));
        wrongPasswordTextField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wrongPasswordTextField.setText(" ");
        wrongPasswordTextField.setMaximumSize(new java.awt.Dimension(150, 20));
        wrongPasswordTextField.setMinimumSize(new java.awt.Dimension(150, 20));
        wrongPasswordTextField.setPreferredSize(new java.awt.Dimension(150, 20));

        javax.swing.GroupLayout changePasswordPanelLayout = new javax.swing.GroupLayout(changePasswordPanel);
        changePasswordPanel.setLayout(changePasswordPanelLayout);
        changePasswordPanelLayout.setHorizontalGroup(
            changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordPanelLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(changePasswordValuesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changePasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wrongPasswordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        changePasswordPanelLayout.setVerticalGroup(
            changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordPanelLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(changePasswordValuesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(changePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wrongPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        menuPanel.addTab("Change password", changePasswordPanel);

        logOffPanel.setBackground(new java.awt.Color(25, 25, 25));
        logOffPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black));

        confirmLogOffLabel.setBackground(new java.awt.Color(25, 25, 25));
        confirmLogOffLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        confirmLogOffLabel.setForeground(new java.awt.Color(204, 204, 204));
        confirmLogOffLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmLogOffLabel.setText("Are you sure you want to log off?");

        confirmLogOffButton.setBackground(new java.awt.Color(25, 25, 25));
        confirmLogOffButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        confirmLogOffButton.setForeground(new java.awt.Color(204, 204, 204));
        confirmLogOffButton.setText("Confirm");
        confirmLogOffButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        confirmLogOffButton.setContentAreaFilled(false);
        confirmLogOffButton.setPreferredSize(new java.awt.Dimension(100, 25));
        confirmLogOffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmLogOffButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logOffPanelLayout = new javax.swing.GroupLayout(logOffPanel);
        logOffPanel.setLayout(logOffPanelLayout);
        logOffPanelLayout.setHorizontalGroup(
            logOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOffPanelLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addGroup(logOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(confirmLogOffButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmLogOffLabel))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        logOffPanelLayout.setVerticalGroup(
            logOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOffPanelLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(confirmLogOffLabel)
                .addGap(18, 18, 18)
                .addComponent(confirmLogOffButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        menuPanel.addTab("Log off", logOffPanel);

        fullname.setBackground(new java.awt.Color(25, 25, 25));
        fullname.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fullname.setForeground(new java.awt.Color(204, 204, 204));
        fullname.setText("Hello, " + employee.getName() + " " + employee.getSurname() + "!");
        fullname.setPreferredSize(new java.awt.Dimension(150, 20));

        contractTime.setBackground(new java.awt.Color(25, 25, 25));
        contractTime.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        contractTime.setForeground(new java.awt.Color(204, 204, 204));
        contractTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        contractTime.setText("Due hours: " + employee.getContractTime() + ", vacation used: " + employee.workTimeArraylist.getVacationUsed() + ", vacation allowed: " + employee.workTimeArraylist.getVacationAllowed() );
        contractTime.setPreferredSize(new java.awt.Dimension(350, 20));

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contractTime, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contractTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        char[] oldPasswordTry1 = oldPasswordField.getPassword();
        String oldPasswordTry = new String(oldPasswordTry1);
        char[] newPasswordTry1 = newPasswordField.getPassword();
        String newPasswordTry = new String(newPasswordTry1);
        char[] newPasswordTry1Check = newPasswordFieldCheck.getPassword();
        String newPasswordTryCheck = new String(newPasswordTry1Check);
        if (oldPasswordTry.equals(employee.getPassword()))
        {
            if (newPasswordTry.equals(newPasswordTryCheck))
            {
                if (employee.isValidPassword(newPasswordTry) == true)
                {
                    employee.changePassword(newPasswordTry);
                    wrongPasswordTextField.setText("Your new password is set");
                }
                else wrongPasswordTextField.setText("Your password doesn't meet the requirements.");
            }       
            else wrongPasswordTextField.setText("Your old or new password is incorrect");
        }
        else wrongPasswordTextField.setText("Your old or new password is incorrect");
        
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void confirmLogOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmLogOffButtonActionPerformed
        LoginGUI.main();
        this.dispose();
    }//GEN-LAST:event_confirmLogOffButtonActionPerformed

    private void timesheetSummaryPanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_timesheetSummaryPanelFocusGained
        timesheetTextArea.setText(employee.getTimesheet());
    }//GEN-LAST:event_timesheetSummaryPanelFocusGained

    private void cancelHiddenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelHiddenButtonActionPerformed
        hiddenPanelAddTimesheet.setVisible(false);
        workHoursTextField.setEditable(true);
        workHoursTextField.setEditable(true);
        sickTimeTextField.setEditable(true);
        holidayHoursTextField.setEditable(true);
        submitTimesheetButton.setVisible(true);
        weekComboBox.setEnabled(true);
    }//GEN-LAST:event_cancelHiddenButtonActionPerformed

    private void confirmHiddenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmHiddenButtonActionPerformed
        int weekNumber = weekComboBox.getSelectedIndex();
        int workHours = parseInt(workHoursTextField.getText());
        int sickHours = parseInt(sickTimeTextField.getText());
        int holidayHours = parseInt(holidayHoursTextField.getText());
        employee.addTimesheet(weekNumber, workHours, sickHours, holidayHours);
        contractTime.setText("Due hours: " + employee.getContractTime() + ", vacation used: " + employee.workTimeArraylist.getVacationUsed() + ", vacation allowed: " + employee.workTimeArraylist.getVacationAllowed() );
        successAddTimesheetField.setText("Timesheet added successfully!");
        timesheetTextArea.setText(employee.getTimesheet());
        cancelHiddenButtonActionPerformed(evt);
    }//GEN-LAST:event_confirmHiddenButtonActionPerformed

    private void submitTimesheetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitTimesheetButtonActionPerformed
        hiddenPanelAddTimesheet.setVisible(true);
        weekComboBox.setEnabled(false);
        workHoursTextField.setEditable(false);
        workHoursTextField.setEditable(false);
        sickTimeTextField.setEditable(false);
        holidayHoursTextField.setEditable(false);
        infoTimesheetHeaderLabel.setText(timesheetInfoValidity());
        timesheetTextValidity();
        submitTimesheetButton.setVisible(false);
        successAddTimesheetField.setText("");
    }//GEN-LAST:event_submitTimesheetButtonActionPerformed

    private String timesheetInfoValidity()
    {
        int weekNumber = weekComboBox.getSelectedIndex();        
        int workHours = parseInt(workHoursTextField.getText());
        int sickHours = parseInt(sickTimeTextField.getText());
        int holidayHours = parseInt(holidayHoursTextField.getText());
        if (employee.workTimeArraylist.workTimeByWeeks.get(weekNumber).getAccepted() == true) return "Error";
        else if (holidayHours > employee.workTimeArraylist.getVacationAllowed()) return "Error";
        else if (workHours + sickHours + holidayHours != employee.getContractTime()) return "Error";
        else if (employee.workTimeArraylist.workTimeByWeeks.get(weekNumber).isEntered() == true ) return "Info";
        else return "Confirm timesheet";
    }
    
    private void timesheetTextValidity()
    {
        int weekNumber = weekComboBox.getSelectedIndex();        
        int workHours = parseInt(workHoursTextField.getText());
        int sickHours = parseInt(sickTimeTextField.getText());
        int holidayHours = parseInt(holidayHoursTextField.getText());
        
        if (employee.workTimeArraylist.workTimeByWeeks.get(weekNumber).getAccepted() == true) 
        {
            confirmHiddenButton.setVisible(false);
            infoTimesheet1Label.setText("Timesheet has been already accepted by your manager.");
            infoTimesheet2Label.setText("You can't make any changes.");
            infoTimesheet3Label.setText("");
        }
        else if (workHours + sickHours + holidayHours != employee.getContractTime())
        {
            confirmHiddenButton.setVisible(false);
            infoTimesheet1Label.setText("");
            infoTimesheet2Label.setText("You entered incorrect amount of time.");
            infoTimesheet3Label.setText("");
        }
        else if (holidayHours > employee.workTimeArraylist.getVacationAllowed()) 
        {
            confirmHiddenButton.setVisible(false);
            infoTimesheet1Label.setText("");
            infoTimesheet2Label.setText("You don't have enough holiday hours.");
            infoTimesheet3Label.setText("");
        }
        else if (employee.workTimeArraylist.workTimeByWeeks.get(weekNumber).isEntered() == true ) 
        {
            confirmHiddenButton.setVisible(true);
            infoTimesheet1Label.setText("Timesheet has been already submitted. Previous data:");
            infoTimesheet2Label.setText(employee.workTimeArraylist.workTimeByWeeks.get(weekNumber).getDeclaredHours() + " work hours, " 
                    + employee.workTimeArraylist.workTimeByWeeks.get(weekNumber).getDeclaredSickTime() + " sick hours, " 
                    + employee.workTimeArraylist.workTimeByWeeks.get(weekNumber).getDeclaredVacation() + " vacation hours.");
            infoTimesheet3Label.setText("Do you want to submit new values?");
        }
            
        else 
        {
            confirmHiddenButton.setVisible(true);
            infoTimesheet1Label.setText("");
            infoTimesheet2Label.setText("Do you want to submit entered data?");
            infoTimesheet3Label.setText("");
        }
    }

    public static void main(Employee employee) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeGUI(employee).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addTimesheetPanel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton cancelHiddenButton;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JPanel changePasswordPanel;
    private javax.swing.JPanel changePasswordValuesPanel;
    private javax.swing.JButton confirmHiddenButton;
    private javax.swing.JButton confirmLogOffButton;
    private javax.swing.JLabel confirmLogOffLabel;
    private javax.swing.JLabel contractTime;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JLabel fullname;
    private javax.swing.JLayeredPane hiddenPanelAddTimesheet;
    private javax.swing.JLabel holidayHoursLabel;
    private javax.swing.JTextField holidayHoursTextField;
    private javax.swing.JPanel hoursAddTimesheetPanel;
    private javax.swing.JLabel infoTimesheet1Label;
    private javax.swing.JLabel infoTimesheet2Label;
    private javax.swing.JLabel infoTimesheet3Label;
    private javax.swing.JLabel infoTimesheetHeaderLabel;
    private javax.swing.JPanel logOffPanel;
    private javax.swing.JTabbedPane menuPanel;
    private javax.swing.JLabel newPassword2Label;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JPasswordField newPasswordFieldCheck;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JPasswordField oldPasswordField;
    private javax.swing.JLabel oldPaswordLabel;
    private javax.swing.JLabel sickTimeLabel;
    private javax.swing.JTextField sickTimeTextField;
    private javax.swing.JButton submitTimesheetButton;
    private javax.swing.JLabel successAddTimesheetField;
    private javax.swing.JScrollPane timesheetScrollPanel;
    private javax.swing.JPanel timesheetSummaryPanel;
    private javax.swing.JTextArea timesheetTextArea;
    private javax.swing.JPanel valuesAddTimesheetPanel;
    private javax.swing.JPanel weekAddTimesheetPanel;
    private javax.swing.JComboBox<String> weekComboBox;
    private javax.swing.JLabel weekLabel;
    private javax.swing.JLabel workHoursLabel;
    private javax.swing.JTextField workHoursTextField;
    private javax.swing.JLabel wrongPasswordTextField;
    // End of variables declaration//GEN-END:variables
}
