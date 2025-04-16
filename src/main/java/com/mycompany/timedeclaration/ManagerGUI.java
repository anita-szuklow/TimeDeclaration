package com.mycompany.timedeclaration;

import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;

public class ManagerGUI extends javax.swing.JFrame {

    private Manager manager;
    
    public ManagerGUI() {
        initComponents();
    }
    
    public ManagerGUI(Manager manager) {
        this.manager = manager;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();
        backgroundPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JTabbedPane();
        pendingTimesheetsPanel = new javax.swing.JPanel();
        pendingTimesheetsChoosePanel = new javax.swing.JPanel();
        userListPendingTimesheetsComboBox = new javax.swing.JComboBox<>();
        checkPendingTimesheetsButton = new javax.swing.JButton();
        errorPendingTimesheetsLabel = new javax.swing.JLabel();
        hiddenPendingPanel = new javax.swing.JPanel();
        weekPendingLabel = new javax.swing.JLabel();
        firstNamePendingLabel = new javax.swing.JLabel();
        workHoursLabel = new javax.swing.JLabel();
        workHoursPendingLabel = new javax.swing.JLabel();
        sickHoursLabel = new javax.swing.JLabel();
        sickHoursPendingLabel = new javax.swing.JLabel();
        vacationLabel = new javax.swing.JLabel();
        vacationHoursPendingLabel = new javax.swing.JLabel();
        acceptPendingButton = new javax.swing.JButton();
        declinePendingButton = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 150), new java.awt.Dimension(0, 150), new java.awt.Dimension(32767, 150));
        errorPendingTimesheetsLabel1 = new javax.swing.JLabel();
        changeEmployeeDataPanel = new javax.swing.JPanel();
        changeWithHintsBackgroundPanel = new javax.swing.JPanel();
        nameChangeHintLabel = new javax.swing.JLabel();
        surnameChangeHintLabel = new javax.swing.JLabel();
        passwordChangeHintLabel = new javax.swing.JLabel();
        changeActionBacgroundPanel = new javax.swing.JPanel();
        changeEmployeeHeader = new javax.swing.JLabel();
        changeInputPanel = new javax.swing.JPanel();
        chooseUsernameLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        changePasswordLabel = new javax.swing.JLabel();
        userListComboBox = new javax.swing.JComboBox<>();
        changeNameField = new javax.swing.JTextField();
        changeSurnameField = new javax.swing.JTextField();
        changePasswordField = new javax.swing.JTextField();
        submitChangeButton = new javax.swing.JButton();
        hiddenConfirmChangePanel = new javax.swing.JPanel();
        confirmValidChangeEmployeeLabel = new javax.swing.JLabel();
        yesChangeEmployeeButton = new javax.swing.JButton();
        noChangeEmployeeButton = new javax.swing.JButton();
        errorPendingTimesheetsLabel2 = new javax.swing.JLabel();
        addEmployeePanel = new javax.swing.JPanel();
        addEmployeeWithHintsPanel = new javax.swing.JPanel();
        addNewPanel = new javax.swing.JPanel();
        hiddenConfirmPanel = new javax.swing.JPanel();
        allGoodLabel = new javax.swing.JLabel();
        yesButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        newUserButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        addNewEmployeeHeader = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        contractHoursLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        hoursSlider = new javax.swing.JSlider();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        submitButton = new javax.swing.JButton();
        surnameHint = new javax.swing.JLabel();
        usernameHint = new javax.swing.JLabel();
        passwordHint = new javax.swing.JLabel();
        nameHint = new javax.swing.JLabel();
        checkTimesheetsPanel = new javax.swing.JPanel();
        userListScrollPanel = new javax.swing.JScrollPane();
        userListGenerateReport = new javax.swing.JList<>();
        timesheetScrollPanel = new javax.swing.JScrollPane();
        timesheetTextArea = new javax.swing.JTextArea();
        generateReportsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        fullNameWelcomeText = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("jCheckBoxMenuItem4");

        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText("jCheckBoxMenuItem5");

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem6.setSelected(true);
        jCheckBoxMenuItem6.setText("jCheckBoxMenuItem6");

        jCheckBoxMenuItem7.setSelected(true);
        jCheckBoxMenuItem7.setText("jCheckBoxMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Time Declaration");
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(25, 25, 25));

        menuPanel.setBackground(new java.awt.Color(25, 25, 25));
        menuPanel.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        menuPanel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        menuPanel.setInheritsPopupMenu(true);

        pendingTimesheetsPanel.setBackground(new java.awt.Color(25, 25, 25));
        pendingTimesheetsPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black));

        if (manager.teamEmployeesArraylist.size() == 0)
        {
            pendingTimesheetsChoosePanel.setVisible(false);
            errorPendingTimesheetsLabel1.setText("NO DATA");
        }
        pendingTimesheetsChoosePanel.setBackground(new java.awt.Color(25, 25, 25));
        pendingTimesheetsChoosePanel.setForeground(new java.awt.Color(204, 204, 204));

        userListPendingTimesheetsComboBox.setBackground(new java.awt.Color(25, 25, 25));
        userListPendingTimesheetsComboBox.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        userListPendingTimesheetsComboBox.setForeground(new java.awt.Color(204, 204, 204));
        userListPendingTimesheetsComboBox.setMaximumRowCount(20);
        userListPendingTimesheetsComboBox.setModel(employees());
        userListPendingTimesheetsComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        userListPendingTimesheetsComboBox.setPreferredSize(new java.awt.Dimension(150, 25));

        checkPendingTimesheetsButton.setBackground(new java.awt.Color(25, 25, 25));
        checkPendingTimesheetsButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        checkPendingTimesheetsButton.setForeground(new java.awt.Color(204, 204, 204));
        checkPendingTimesheetsButton.setText("Check pending timesheets");
        checkPendingTimesheetsButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        checkPendingTimesheetsButton.setContentAreaFilled(false);
        checkPendingTimesheetsButton.setMaximumSize(new java.awt.Dimension(200, 25));
        checkPendingTimesheetsButton.setMinimumSize(new java.awt.Dimension(200, 25));
        checkPendingTimesheetsButton.setPreferredSize(new java.awt.Dimension(200, 25));
        checkPendingTimesheetsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPendingTimesheetsButtonActionPerformed(evt);
            }
        });

        errorPendingTimesheetsLabel.setVisible(false);
        errorPendingTimesheetsLabel.setBackground(new java.awt.Color(25, 25, 25));
        errorPendingTimesheetsLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        errorPendingTimesheetsLabel.setForeground(new java.awt.Color(204, 204, 204));
        errorPendingTimesheetsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorPendingTimesheetsLabel.setText("no pending timesheets");
        errorPendingTimesheetsLabel.setMaximumSize(new java.awt.Dimension(380, 20));
        errorPendingTimesheetsLabel.setMinimumSize(new java.awt.Dimension(380, 20));
        errorPendingTimesheetsLabel.setPreferredSize(new java.awt.Dimension(380, 20));

        hiddenPendingPanel.setVisible(false);
        hiddenPendingPanel.setBackground(new java.awt.Color(25, 25, 25));
        hiddenPendingPanel.setForeground(new java.awt.Color(204, 204, 204));

        weekPendingLabel.setBackground(new java.awt.Color(25, 25, 25));
        weekPendingLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        weekPendingLabel.setForeground(new java.awt.Color(204, 204, 204));
        weekPendingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weekPendingLabel.setText("weekNumber");
        weekPendingLabel.setMaximumSize(new java.awt.Dimension(250, 25));
        weekPendingLabel.setMinimumSize(new java.awt.Dimension(250, 25));
        weekPendingLabel.setPreferredSize(new java.awt.Dimension(250, 25));

        firstNamePendingLabel.setBackground(new java.awt.Color(25, 25, 25));
        firstNamePendingLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        firstNamePendingLabel.setForeground(new java.awt.Color(204, 204, 204));
        firstNamePendingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstNamePendingLabel.setText("firstName");
        firstNamePendingLabel.setMaximumSize(new java.awt.Dimension(250, 25));
        firstNamePendingLabel.setMinimumSize(new java.awt.Dimension(250, 25));
        firstNamePendingLabel.setPreferredSize(new java.awt.Dimension(250, 25));

        workHoursLabel.setBackground(new java.awt.Color(25, 25, 25));
        workHoursLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        workHoursLabel.setForeground(new java.awt.Color(204, 204, 204));
        workHoursLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workHoursLabel.setText("Working hours:");
        workHoursLabel.setMaximumSize(new java.awt.Dimension(100, 25));
        workHoursLabel.setMinimumSize(new java.awt.Dimension(100, 25));
        workHoursLabel.setPreferredSize(new java.awt.Dimension(100, 25));

        workHoursPendingLabel.setBackground(new java.awt.Color(25, 25, 25));
        workHoursPendingLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        workHoursPendingLabel.setForeground(new java.awt.Color(204, 204, 204));
        workHoursPendingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workHoursPendingLabel.setText("hours");
        workHoursPendingLabel.setMaximumSize(new java.awt.Dimension(36, 25));
        workHoursPendingLabel.setMinimumSize(new java.awt.Dimension(36, 25));
        workHoursPendingLabel.setPreferredSize(new java.awt.Dimension(36, 25));

        sickHoursLabel.setBackground(new java.awt.Color(25, 25, 25));
        sickHoursLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        sickHoursLabel.setForeground(new java.awt.Color(204, 204, 204));
        sickHoursLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sickHoursLabel.setText("Sick hours:");
        sickHoursLabel.setMaximumSize(new java.awt.Dimension(100, 25));
        sickHoursLabel.setMinimumSize(new java.awt.Dimension(100, 25));
        sickHoursLabel.setPreferredSize(new java.awt.Dimension(100, 25));

        sickHoursPendingLabel.setBackground(new java.awt.Color(25, 25, 25));
        sickHoursPendingLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        sickHoursPendingLabel.setForeground(new java.awt.Color(204, 204, 204));
        sickHoursPendingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sickHoursPendingLabel.setText("hours");
        sickHoursPendingLabel.setMaximumSize(new java.awt.Dimension(36, 25));
        sickHoursPendingLabel.setMinimumSize(new java.awt.Dimension(36, 25));
        sickHoursPendingLabel.setPreferredSize(new java.awt.Dimension(36, 25));

        vacationLabel.setBackground(new java.awt.Color(25, 25, 25));
        vacationLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        vacationLabel.setForeground(new java.awt.Color(204, 204, 204));
        vacationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vacationLabel.setText("Vacation hours:");
        vacationLabel.setMaximumSize(new java.awt.Dimension(110, 25));
        vacationLabel.setMinimumSize(new java.awt.Dimension(110, 25));
        vacationLabel.setPreferredSize(new java.awt.Dimension(110, 25));

        vacationHoursPendingLabel.setBackground(new java.awt.Color(25, 25, 25));
        vacationHoursPendingLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        vacationHoursPendingLabel.setForeground(new java.awt.Color(204, 204, 204));
        vacationHoursPendingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vacationHoursPendingLabel.setText("hours");
        vacationHoursPendingLabel.setMaximumSize(new java.awt.Dimension(36, 25));
        vacationHoursPendingLabel.setMinimumSize(new java.awt.Dimension(36, 25));
        vacationHoursPendingLabel.setPreferredSize(new java.awt.Dimension(36, 25));

        acceptPendingButton.setBackground(new java.awt.Color(25, 25, 25));
        acceptPendingButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        acceptPendingButton.setForeground(new java.awt.Color(204, 204, 204));
        acceptPendingButton.setText("accept");
        acceptPendingButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        acceptPendingButton.setContentAreaFilled(false);
        acceptPendingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptPendingButtonActionPerformed(evt);
            }
        });

        declinePendingButton.setBackground(new java.awt.Color(25, 25, 25));
        declinePendingButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        declinePendingButton.setForeground(new java.awt.Color(204, 204, 204));
        declinePendingButton.setText("decline");
        declinePendingButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        declinePendingButton.setContentAreaFilled(false);
        declinePendingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declinePendingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hiddenPendingPanelLayout = new javax.swing.GroupLayout(hiddenPendingPanel);
        hiddenPendingPanel.setLayout(hiddenPendingPanelLayout);
        hiddenPendingPanelLayout.setHorizontalGroup(
            hiddenPendingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hiddenPendingPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(acceptPendingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(declinePendingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(hiddenPendingPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(vacationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vacationHoursPendingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(hiddenPendingPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(sickHoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sickHoursPendingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(hiddenPendingPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(workHoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(workHoursPendingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hiddenPendingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(weekPendingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(hiddenPendingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstNamePendingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hiddenPendingPanelLayout.setVerticalGroup(
            hiddenPendingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hiddenPendingPanelLayout.createSequentialGroup()
                .addComponent(firstNamePendingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weekPendingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hiddenPendingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workHoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workHoursPendingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hiddenPendingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sickHoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sickHoursPendingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hiddenPendingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vacationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vacationHoursPendingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hiddenPendingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptPendingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(declinePendingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pendingTimesheetsChoosePanelLayout = new javax.swing.GroupLayout(pendingTimesheetsChoosePanel);
        pendingTimesheetsChoosePanel.setLayout(pendingTimesheetsChoosePanelLayout);
        pendingTimesheetsChoosePanelLayout.setHorizontalGroup(
            pendingTimesheetsChoosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingTimesheetsChoosePanelLayout.createSequentialGroup()
                .addGroup(pendingTimesheetsChoosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pendingTimesheetsChoosePanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(userListPendingTimesheetsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkPendingTimesheetsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pendingTimesheetsChoosePanelLayout.createSequentialGroup()
                        .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pendingTimesheetsChoosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorPendingTimesheetsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pendingTimesheetsChoosePanelLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(hiddenPendingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pendingTimesheetsChoosePanelLayout.setVerticalGroup(
            pendingTimesheetsChoosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingTimesheetsChoosePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pendingTimesheetsChoosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userListPendingTimesheetsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkPendingTimesheetsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorPendingTimesheetsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pendingTimesheetsChoosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pendingTimesheetsChoosePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(pendingTimesheetsChoosePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hiddenPendingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        errorPendingTimesheetsLabel.setVisible(false);
        errorPendingTimesheetsLabel1.setBackground(new java.awt.Color(25, 25, 25));
        errorPendingTimesheetsLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        errorPendingTimesheetsLabel1.setForeground(new java.awt.Color(204, 204, 204));
        errorPendingTimesheetsLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorPendingTimesheetsLabel1.setMaximumSize(new java.awt.Dimension(380, 20));
        errorPendingTimesheetsLabel1.setMinimumSize(new java.awt.Dimension(380, 20));
        errorPendingTimesheetsLabel1.setPreferredSize(new java.awt.Dimension(380, 20));

        javax.swing.GroupLayout pendingTimesheetsPanelLayout = new javax.swing.GroupLayout(pendingTimesheetsPanel);
        pendingTimesheetsPanel.setLayout(pendingTimesheetsPanelLayout);
        pendingTimesheetsPanelLayout.setHorizontalGroup(
            pendingTimesheetsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingTimesheetsPanelLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(pendingTimesheetsChoosePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(pendingTimesheetsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorPendingTimesheetsLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pendingTimesheetsPanelLayout.setVerticalGroup(
            pendingTimesheetsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingTimesheetsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorPendingTimesheetsLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(pendingTimesheetsChoosePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(80, 80, 80))
        );

        menuPanel.addTab("Pending timesheets", pendingTimesheetsPanel);

        changeEmployeeDataPanel.setBackground(new java.awt.Color(25, 25, 25));
        changeEmployeeDataPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black));

        if (manager.teamEmployeesArraylist.size() == 0)
        {
            changeWithHintsBackgroundPanel.setVisible(false);
            errorPendingTimesheetsLabel2.setText("NO DATA");
        }
        changeWithHintsBackgroundPanel.setBackground(new java.awt.Color(25, 25, 25));
        changeWithHintsBackgroundPanel.setForeground(new java.awt.Color(204, 204, 204));
        changeWithHintsBackgroundPanel.setPreferredSize(new java.awt.Dimension(655, 290));

        nameChangeHintLabel.setBackground(new java.awt.Color(25, 25, 25));
        nameChangeHintLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nameChangeHintLabel.setForeground(new java.awt.Color(204, 204, 204));
        nameChangeHintLabel.setText(" ");
        nameChangeHintLabel.setMaximumSize(new java.awt.Dimension(150, 20));
        nameChangeHintLabel.setMinimumSize(new java.awt.Dimension(150, 20));
        nameChangeHintLabel.setPreferredSize(new java.awt.Dimension(150, 25));

        surnameChangeHintLabel.setBackground(new java.awt.Color(25, 25, 25));
        surnameChangeHintLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        surnameChangeHintLabel.setForeground(new java.awt.Color(204, 204, 204));
        surnameChangeHintLabel.setMaximumSize(new java.awt.Dimension(150, 20));
        surnameChangeHintLabel.setMinimumSize(new java.awt.Dimension(150, 20));
        surnameChangeHintLabel.setPreferredSize(new java.awt.Dimension(150, 25));

        passwordChangeHintLabel.setBackground(new java.awt.Color(25, 25, 25));
        passwordChangeHintLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passwordChangeHintLabel.setForeground(new java.awt.Color(204, 204, 204));
        passwordChangeHintLabel.setMaximumSize(new java.awt.Dimension(150, 20));
        passwordChangeHintLabel.setMinimumSize(new java.awt.Dimension(150, 20));
        passwordChangeHintLabel.setPreferredSize(new java.awt.Dimension(150, 25));

        changeActionBacgroundPanel.setBackground(new java.awt.Color(25, 25, 25));
        changeActionBacgroundPanel.setMinimumSize(new java.awt.Dimension(350, 350));
        changeActionBacgroundPanel.setPreferredSize(new java.awt.Dimension(345, 280));

        changeEmployeeHeader.setBackground(new java.awt.Color(25, 25, 25));
        changeEmployeeHeader.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        changeEmployeeHeader.setForeground(new java.awt.Color(204, 204, 204));
        changeEmployeeHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changeEmployeeHeader.setText("Change employee data");
        changeEmployeeHeader.setMaximumSize(new java.awt.Dimension(333, 25));
        changeEmployeeHeader.setMinimumSize(new java.awt.Dimension(333, 25));
        changeEmployeeHeader.setPreferredSize(new java.awt.Dimension(333, 25));

        changeInputPanel.setBackground(new java.awt.Color(25, 25, 25));
        changeInputPanel.setForeground(new java.awt.Color(204, 204, 204));

        chooseUsernameLabel.setBackground(new java.awt.Color(25, 25, 25));
        chooseUsernameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chooseUsernameLabel.setForeground(new java.awt.Color(204, 204, 204));
        chooseUsernameLabel.setText("Choose username:");
        chooseUsernameLabel.setMaximumSize(new java.awt.Dimension(150, 20));
        chooseUsernameLabel.setMinimumSize(new java.awt.Dimension(150, 20));
        chooseUsernameLabel.setPreferredSize(new java.awt.Dimension(150, 20));

        firstNameLabel.setBackground(new java.awt.Color(25, 25, 25));
        firstNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(204, 204, 204));
        firstNameLabel.setText("First name:");
        firstNameLabel.setMaximumSize(new java.awt.Dimension(150, 20));
        firstNameLabel.setMinimumSize(new java.awt.Dimension(150, 20));
        firstNameLabel.setPreferredSize(new java.awt.Dimension(150, 20));

        lastNameLabel.setBackground(new java.awt.Color(25, 25, 25));
        lastNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(204, 204, 204));
        lastNameLabel.setText("Last name:");
        lastNameLabel.setMaximumSize(new java.awt.Dimension(150, 20));
        lastNameLabel.setMinimumSize(new java.awt.Dimension(150, 20));
        lastNameLabel.setPreferredSize(new java.awt.Dimension(150, 20));

        changePasswordLabel.setBackground(new java.awt.Color(25, 25, 25));
        changePasswordLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        changePasswordLabel.setForeground(new java.awt.Color(204, 204, 204));
        changePasswordLabel.setText("Password:");
        changePasswordLabel.setMaximumSize(new java.awt.Dimension(150, 20));
        changePasswordLabel.setMinimumSize(new java.awt.Dimension(150, 20));
        changePasswordLabel.setPreferredSize(new java.awt.Dimension(150, 20));

        userListComboBox.setBackground(new java.awt.Color(25, 25, 25));
        userListComboBox.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        userListComboBox.setForeground(new java.awt.Color(204, 204, 204));
        userListComboBox.setMaximumRowCount(20);
        userListComboBox.setModel(employees());
        userListComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        userListComboBox.setMinimumSize(new java.awt.Dimension(150, 25));
        userListComboBox.setPreferredSize(new java.awt.Dimension(150, 30));
        userListComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userListComboBoxActionPerformed(evt);
            }
        });

        changeNameField.setBackground(new java.awt.Color(25, 25, 25));
        changeNameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        changeNameField.setForeground(new java.awt.Color(204, 204, 204));
        changeNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        changeNameField.setToolTipText("Requirements: 1-20 characters [a-z], first letter uppercase, rest lowercase");
        changeNameField.setMinimumSize(new java.awt.Dimension(150, 25));
        changeNameField.setPreferredSize(new java.awt.Dimension(150, 30));
        changeNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeNameFieldActionPerformed(evt);
            }
        });

        changeSurnameField.setBackground(new java.awt.Color(25, 25, 25));
        changeSurnameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        changeSurnameField.setForeground(new java.awt.Color(204, 204, 204));
        changeSurnameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        changeSurnameField.setToolTipText("Requirements: 1-20 characters [a-z], first letter uppercase, rest lowercase");
        changeSurnameField.setMinimumSize(new java.awt.Dimension(150, 25));
        changeSurnameField.setPreferredSize(new java.awt.Dimension(150, 30));

        changePasswordField.setBackground(new java.awt.Color(25, 25, 25));
        changePasswordField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        changePasswordField.setForeground(new java.awt.Color(204, 204, 204));
        changePasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        changePasswordField.setToolTipText("Requirements: 8-20 characters, at least 1 capital letter, 1 lowercase letter, 1 number, no symbols");
        changePasswordField.setMinimumSize(new java.awt.Dimension(150, 25));
        changePasswordField.setPreferredSize(new java.awt.Dimension(150, 30));

        javax.swing.GroupLayout changeInputPanelLayout = new javax.swing.GroupLayout(changeInputPanel);
        changeInputPanel.setLayout(changeInputPanelLayout);
        changeInputPanelLayout.setHorizontalGroup(
            changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chooseUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeInputPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(userListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(changeNameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changeSurnameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changePasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        changeInputPanelLayout.setVerticalGroup(
            changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeNameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeSurnameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(changePasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        submitChangeButton.setBackground(new java.awt.Color(25, 25, 25));
        submitChangeButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        submitChangeButton.setForeground(new java.awt.Color(204, 204, 204));
        submitChangeButton.setText("submit");
        submitChangeButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        submitChangeButton.setContentAreaFilled(false);
        submitChangeButton.setPreferredSize(new java.awt.Dimension(80, 30));
        submitChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitChangeButtonActionPerformed(evt);
            }
        });

        hiddenConfirmChangePanel.setVisible(false);
        hiddenConfirmChangePanel.setBackground(new java.awt.Color(25, 25, 25));
        hiddenConfirmChangePanel.setForeground(new java.awt.Color(204, 204, 204));

        confirmValidChangeEmployeeLabel.setBackground(new java.awt.Color(25, 25, 25));
        confirmValidChangeEmployeeLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        confirmValidChangeEmployeeLabel.setForeground(new java.awt.Color(204, 204, 204));
        confirmValidChangeEmployeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmValidChangeEmployeeLabel.setText("All good! Do you want to proceed?");
        confirmValidChangeEmployeeLabel.setMaximumSize(new java.awt.Dimension(250, 20));
        confirmValidChangeEmployeeLabel.setMinimumSize(new java.awt.Dimension(250, 20));
        confirmValidChangeEmployeeLabel.setPreferredSize(new java.awt.Dimension(250, 20));

        yesChangeEmployeeButton.setBackground(new java.awt.Color(25, 25, 25));
        yesChangeEmployeeButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        yesChangeEmployeeButton.setForeground(new java.awt.Color(204, 204, 204));
        yesChangeEmployeeButton.setText("yes");
        yesChangeEmployeeButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        yesChangeEmployeeButton.setContentAreaFilled(false);
        yesChangeEmployeeButton.setMaximumSize(new java.awt.Dimension(85, 25));
        yesChangeEmployeeButton.setMinimumSize(new java.awt.Dimension(85, 25));
        yesChangeEmployeeButton.setPreferredSize(new java.awt.Dimension(85, 30));
        yesChangeEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesChangeEmployeeButtonActionPerformed(evt);
            }
        });

        noChangeEmployeeButton.setBackground(new java.awt.Color(25, 25, 25));
        noChangeEmployeeButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        noChangeEmployeeButton.setForeground(new java.awt.Color(204, 204, 204));
        noChangeEmployeeButton.setText("no");
        noChangeEmployeeButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        noChangeEmployeeButton.setContentAreaFilled(false);
        noChangeEmployeeButton.setMaximumSize(new java.awt.Dimension(85, 25));
        noChangeEmployeeButton.setMinimumSize(new java.awt.Dimension(85, 25));
        noChangeEmployeeButton.setPreferredSize(new java.awt.Dimension(85, 30));
        noChangeEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noChangeEmployeeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hiddenConfirmChangePanelLayout = new javax.swing.GroupLayout(hiddenConfirmChangePanel);
        hiddenConfirmChangePanel.setLayout(hiddenConfirmChangePanelLayout);
        hiddenConfirmChangePanelLayout.setHorizontalGroup(
            hiddenConfirmChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hiddenConfirmChangePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hiddenConfirmChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hiddenConfirmChangePanelLayout.createSequentialGroup()
                        .addComponent(confirmValidChangeEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(hiddenConfirmChangePanelLayout.createSequentialGroup()
                        .addComponent(yesChangeEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noChangeEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hiddenConfirmChangePanelLayout.setVerticalGroup(
            hiddenConfirmChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hiddenConfirmChangePanelLayout.createSequentialGroup()
                .addComponent(confirmValidChangeEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hiddenConfirmChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesChangeEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noChangeEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout changeActionBacgroundPanelLayout = new javax.swing.GroupLayout(changeActionBacgroundPanel);
        changeActionBacgroundPanel.setLayout(changeActionBacgroundPanelLayout);
        changeActionBacgroundPanelLayout.setHorizontalGroup(
            changeActionBacgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeActionBacgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(changeActionBacgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(changeEmployeeHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hiddenConfirmChangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        changeActionBacgroundPanelLayout.setVerticalGroup(
            changeActionBacgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeActionBacgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(changeEmployeeHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hiddenConfirmChangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout changeWithHintsBackgroundPanelLayout = new javax.swing.GroupLayout(changeWithHintsBackgroundPanel);
        changeWithHintsBackgroundPanel.setLayout(changeWithHintsBackgroundPanelLayout);
        changeWithHintsBackgroundPanelLayout.setHorizontalGroup(
            changeWithHintsBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeWithHintsBackgroundPanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(changeActionBacgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changeWithHintsBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(surnameChangeHintLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameChangeHintLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordChangeHintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        changeWithHintsBackgroundPanelLayout.setVerticalGroup(
            changeWithHintsBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeWithHintsBackgroundPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changeActionBacgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(changeWithHintsBackgroundPanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(nameChangeHintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(surnameChangeHintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordChangeHintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        errorPendingTimesheetsLabel.setVisible(false);
        errorPendingTimesheetsLabel2.setBackground(new java.awt.Color(25, 25, 25));
        errorPendingTimesheetsLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        errorPendingTimesheetsLabel2.setForeground(new java.awt.Color(204, 204, 204));
        errorPendingTimesheetsLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorPendingTimesheetsLabel2.setMaximumSize(new java.awt.Dimension(380, 20));
        errorPendingTimesheetsLabel2.setMinimumSize(new java.awt.Dimension(380, 20));
        errorPendingTimesheetsLabel2.setPreferredSize(new java.awt.Dimension(380, 20));

        javax.swing.GroupLayout changeEmployeeDataPanelLayout = new javax.swing.GroupLayout(changeEmployeeDataPanel);
        changeEmployeeDataPanel.setLayout(changeEmployeeDataPanelLayout);
        changeEmployeeDataPanelLayout.setHorizontalGroup(
            changeEmployeeDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeEmployeeDataPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(changeWithHintsBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(changeEmployeeDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorPendingTimesheetsLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        changeEmployeeDataPanelLayout.setVerticalGroup(
            changeEmployeeDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeEmployeeDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorPendingTimesheetsLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(changeWithHintsBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        menuPanel.addTab("Change employee data", changeEmployeeDataPanel);

        addEmployeePanel.setBackground(new java.awt.Color(25, 25, 25));
        addEmployeePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black));

        addEmployeeWithHintsPanel.setBackground(new java.awt.Color(25, 25, 25));
        addEmployeeWithHintsPanel.setForeground(new java.awt.Color(204, 204, 204));
        addEmployeeWithHintsPanel.setPreferredSize(new java.awt.Dimension(500, 345));

        addNewPanel.setBackground(new java.awt.Color(25, 25, 25));

        hiddenConfirmPanel.setVisible(false);
        hiddenConfirmPanel.setBackground(new java.awt.Color(25, 25, 25));
        hiddenConfirmPanel.setForeground(new java.awt.Color(204, 204, 204));

        allGoodLabel.setBackground(new java.awt.Color(25, 25, 25));
        allGoodLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        allGoodLabel.setForeground(new java.awt.Color(204, 204, 204));
        allGoodLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allGoodLabel.setText("All good! Do you want to proceed?");

        yesButton.setBackground(new java.awt.Color(25, 25, 25));
        yesButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        yesButton.setForeground(new java.awt.Color(204, 204, 204));
        yesButton.setText("yes");
        yesButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        yesButton.setContentAreaFilled(false);
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });

        noButton.setBackground(new java.awt.Color(25, 25, 25));
        noButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        noButton.setForeground(new java.awt.Color(204, 204, 204));
        noButton.setText("no");
        noButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        noButton.setContentAreaFilled(false);
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

        newUserButton.setVisible(false);
        newUserButton.setBackground(new java.awt.Color(25, 25, 25));
        newUserButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        newUserButton.setForeground(new java.awt.Color(204, 204, 204));
        newUserButton.setText("new user");
        newUserButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        newUserButton.setContentAreaFilled(false);
        newUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hiddenConfirmPanelLayout = new javax.swing.GroupLayout(hiddenConfirmPanel);
        hiddenConfirmPanel.setLayout(hiddenConfirmPanelLayout);
        hiddenConfirmPanelLayout.setHorizontalGroup(
            hiddenConfirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hiddenConfirmPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hiddenConfirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hiddenConfirmPanelLayout.createSequentialGroup()
                        .addComponent(allGoodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(hiddenConfirmPanelLayout.createSequentialGroup()
                        .addComponent(yesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        hiddenConfirmPanelLayout.setVerticalGroup(
            hiddenConfirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hiddenConfirmPanelLayout.createSequentialGroup()
                .addComponent(allGoodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hiddenConfirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(yesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(25, 25, 25));

        addNewEmployeeHeader.setBackground(new java.awt.Color(25, 25, 25));
        addNewEmployeeHeader.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addNewEmployeeHeader.setForeground(new java.awt.Color(204, 204, 204));
        addNewEmployeeHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addNewEmployeeHeader.setText("Add new employee");
        addNewEmployeeHeader.setMaximumSize(new java.awt.Dimension(300, 25));
        addNewEmployeeHeader.setMinimumSize(new java.awt.Dimension(300, 25));
        addNewEmployeeHeader.setPreferredSize(new java.awt.Dimension(300, 25));

        inputPanel.setBackground(new java.awt.Color(25, 25, 25));
        inputPanel.setForeground(new java.awt.Color(204, 204, 204));
        inputPanel.setPreferredSize(new java.awt.Dimension(300, 190));

        nameLabel.setBackground(new java.awt.Color(25, 25, 25));
        nameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel.setText("First name:");
        nameLabel.setMaximumSize(new java.awt.Dimension(120, 20));
        nameLabel.setMinimumSize(new java.awt.Dimension(120, 20));
        nameLabel.setPreferredSize(new java.awt.Dimension(120, 20));

        surnameLabel.setBackground(new java.awt.Color(25, 25, 25));
        surnameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        surnameLabel.setForeground(new java.awt.Color(204, 204, 204));
        surnameLabel.setText("Last name:");
        surnameLabel.setMaximumSize(new java.awt.Dimension(120, 20));
        surnameLabel.setMinimumSize(new java.awt.Dimension(120, 20));
        surnameLabel.setPreferredSize(new java.awt.Dimension(120, 20));

        passwordLabel.setBackground(new java.awt.Color(25, 25, 25));
        passwordLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(204, 204, 204));
        passwordLabel.setText("Password:");
        passwordLabel.setMaximumSize(new java.awt.Dimension(120, 20));
        passwordLabel.setMinimumSize(new java.awt.Dimension(120, 20));
        passwordLabel.setPreferredSize(new java.awt.Dimension(120, 20));

        contractHoursLabel.setBackground(new java.awt.Color(25, 25, 25));
        contractHoursLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        contractHoursLabel.setForeground(new java.awt.Color(204, 204, 204));
        contractHoursLabel.setText("Contract hours");
        contractHoursLabel.setMaximumSize(new java.awt.Dimension(120, 20));
        contractHoursLabel.setMinimumSize(new java.awt.Dimension(120, 20));
        contractHoursLabel.setPreferredSize(new java.awt.Dimension(120, 20));

        usernameLabel.setBackground(new java.awt.Color(25, 25, 25));
        usernameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(204, 204, 204));
        usernameLabel.setText("Username:");
        usernameLabel.setMaximumSize(new java.awt.Dimension(120, 20));
        usernameLabel.setMinimumSize(new java.awt.Dimension(120, 20));
        usernameLabel.setPreferredSize(new java.awt.Dimension(120, 20));

        nameField.setBackground(new java.awt.Color(25, 25, 25));
        nameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nameField.setForeground(new java.awt.Color(204, 204, 204));
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField.setToolTipText("Requirements: 1-20 characters [a-z], first letter uppercase, rest lowercase");
        nameField.setMinimumSize(new java.awt.Dimension(150, 25));
        nameField.setPreferredSize(new java.awt.Dimension(150, 30));

        surnameField.setBackground(new java.awt.Color(25, 25, 25));
        surnameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        surnameField.setForeground(new java.awt.Color(204, 204, 204));
        surnameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        surnameField.setToolTipText("Requirements: 1-20 characters [a-z], first letter uppercase, rest lowercase");
        surnameField.setMinimumSize(new java.awt.Dimension(150, 25));
        surnameField.setPreferredSize(new java.awt.Dimension(150, 30));

        usernameField.setBackground(new java.awt.Color(25, 25, 25));
        usernameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(204, 204, 204));
        usernameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameField.setToolTipText("Requirements: must be unique for whole system, 1-15 characters [a-z, A-Z, 0-9], no symbols!");
        usernameField.setMinimumSize(new java.awt.Dimension(150, 25));
        usernameField.setPreferredSize(new java.awt.Dimension(150, 30));

        passwordField.setBackground(new java.awt.Color(25, 25, 25));
        passwordField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(204, 204, 204));
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setToolTipText("Requirements: 8-20 characters, at least 1 capital letter, 1 lowercase letter, 1 number, no symbols");
        passwordField.setMinimumSize(new java.awt.Dimension(150, 25));
        passwordField.setPreferredSize(new java.awt.Dimension(150, 30));

        hoursSlider.setBackground(new java.awt.Color(25, 25, 25));
        hoursSlider.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        hoursSlider.setForeground(new java.awt.Color(204, 204, 204));
        hoursSlider.setMajorTickSpacing(10);
        hoursSlider.setMaximum(40);
        hoursSlider.setMinimum(10);
        hoursSlider.setMinorTickSpacing(10);
        hoursSlider.setPaintLabels(true);
        hoursSlider.setSnapToTicks(true);
        hoursSlider.setMaximumSize(new java.awt.Dimension(200, 40));
        hoursSlider.setMinimumSize(new java.awt.Dimension(200, 40));
        hoursSlider.setPreferredSize(new java.awt.Dimension(200, 40));

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contractHoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usernameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(surnameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hoursSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hoursSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contractHoursLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        submitButton.setBackground(new java.awt.Color(25, 25, 25));
        submitButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        submitButton.setForeground(new java.awt.Color(204, 204, 204));
        submitButton.setText("submit");
        submitButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        submitButton.setContentAreaFilled(false);
        submitButton.setPreferredSize(new java.awt.Dimension(85, 30));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(submitButton, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addNewEmployeeHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(addNewEmployeeHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout addNewPanelLayout = new javax.swing.GroupLayout(addNewPanel);
        addNewPanel.setLayout(addNewPanelLayout);
        addNewPanelLayout.setHorizontalGroup(
            addNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hiddenConfirmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addNewPanelLayout.setVerticalGroup(
            addNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hiddenConfirmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        surnameHint.setBackground(new java.awt.Color(25, 25, 25));
        surnameHint.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        surnameHint.setForeground(new java.awt.Color(204, 204, 204));
        surnameHint.setMaximumSize(new java.awt.Dimension(150, 20));
        surnameHint.setMinimumSize(new java.awt.Dimension(150, 20));
        surnameHint.setPreferredSize(new java.awt.Dimension(150, 25));

        usernameHint.setBackground(new java.awt.Color(25, 25, 25));
        usernameHint.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usernameHint.setForeground(new java.awt.Color(204, 204, 204));
        usernameHint.setMaximumSize(new java.awt.Dimension(150, 20));
        usernameHint.setMinimumSize(new java.awt.Dimension(150, 20));
        usernameHint.setPreferredSize(new java.awt.Dimension(150, 25));

        passwordHint.setBackground(new java.awt.Color(25, 25, 25));
        passwordHint.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passwordHint.setForeground(new java.awt.Color(204, 204, 204));
        passwordHint.setMaximumSize(new java.awt.Dimension(150, 20));
        passwordHint.setMinimumSize(new java.awt.Dimension(150, 20));
        passwordHint.setPreferredSize(new java.awt.Dimension(150, 25));

        nameHint.setBackground(new java.awt.Color(25, 25, 25));
        nameHint.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nameHint.setForeground(new java.awt.Color(204, 204, 204));
        nameHint.setText(" ");
        nameHint.setMaximumSize(new java.awt.Dimension(150, 20));
        nameHint.setMinimumSize(new java.awt.Dimension(150, 20));
        nameHint.setPreferredSize(new java.awt.Dimension(150, 25));

        javax.swing.GroupLayout addEmployeeWithHintsPanelLayout = new javax.swing.GroupLayout(addEmployeeWithHintsPanel);
        addEmployeeWithHintsPanel.setLayout(addEmployeeWithHintsPanelLayout);
        addEmployeeWithHintsPanelLayout.setHorizontalGroup(
            addEmployeeWithHintsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEmployeeWithHintsPanelLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(addNewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addEmployeeWithHintsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameHint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnameHint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameHint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordHint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        addEmployeeWithHintsPanelLayout.setVerticalGroup(
            addEmployeeWithHintsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployeeWithHintsPanelLayout.createSequentialGroup()
                .addGroup(addEmployeeWithHintsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addNewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addEmployeeWithHintsPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(nameHint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(surnameHint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usernameHint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordHint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addEmployeePanelLayout = new javax.swing.GroupLayout(addEmployeePanel);
        addEmployeePanel.setLayout(addEmployeePanelLayout);
        addEmployeePanelLayout.setHorizontalGroup(
            addEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployeePanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(addEmployeeWithHintsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 631, Short.MAX_VALUE)
                .addGap(128, 128, 128))
        );
        addEmployeePanelLayout.setVerticalGroup(
            addEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployeePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(addEmployeeWithHintsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        menuPanel.addTab("Add new employee", addEmployeePanel);

        checkTimesheetsPanel.setBackground(new java.awt.Color(25, 25, 25));
        checkTimesheetsPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black));

        userListGenerateReport.setBackground(new java.awt.Color(25, 25, 25));
        userListGenerateReport.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        userListGenerateReport.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        userListGenerateReport.setForeground(new java.awt.Color(204, 204, 204));
        userListGenerateReport.setModel(employees());
        userListGenerateReport.setSelectionForeground(new java.awt.Color(204, 204, 204));
        userListScrollPanel.setViewportView(userListGenerateReport);

        //reportScrollPanel.setVisible(false);

        timesheetTextArea.setBackground(new java.awt.Color(25, 25, 25));
        timesheetTextArea.setColumns(20);
        timesheetTextArea.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        timesheetTextArea.setForeground(new java.awt.Color(204, 204, 204));
        timesheetTextArea.setRows(5);
        timesheetTextArea.setBorder(null);
        timesheetTextArea.setCaretColor(new java.awt.Color(204, 204, 204));
        timesheetTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        timesheetScrollPanel.setViewportView(timesheetTextArea);

        generateReportsButton.setBackground(new java.awt.Color(25, 25, 25));
        generateReportsButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        generateReportsButton.setForeground(new java.awt.Color(204, 204, 204));
        generateReportsButton.setText("Generate reports");
        generateReportsButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        generateReportsButton.setContentAreaFilled(false);
        generateReportsButton.setMaximumSize(new java.awt.Dimension(120, 25));
        generateReportsButton.setMinimumSize(new java.awt.Dimension(120, 25));
        generateReportsButton.setPreferredSize(new java.awt.Dimension(140, 25));
        generateReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportsButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(25, 25, 25));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hint: hold CTRL to select multiple users");

        javax.swing.GroupLayout checkTimesheetsPanelLayout = new javax.swing.GroupLayout(checkTimesheetsPanel);
        checkTimesheetsPanel.setLayout(checkTimesheetsPanelLayout);
        checkTimesheetsPanelLayout.setHorizontalGroup(
            checkTimesheetsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkTimesheetsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(checkTimesheetsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(checkTimesheetsPanelLayout.createSequentialGroup()
                        .addGroup(checkTimesheetsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(generateReportsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userListScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timesheetScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)))
                .addContainerGap())
        );
        checkTimesheetsPanelLayout.setVerticalGroup(
            checkTimesheetsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkTimesheetsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(checkTimesheetsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(timesheetScrollPanel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, checkTimesheetsPanelLayout.createSequentialGroup()
                        .addComponent(generateReportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userListScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPanel.addTab("Generate reports", checkTimesheetsPanel);

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
                .addGap(225, 225, 225)
                .addGroup(changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(changePasswordValuesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changePasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wrongPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        changePasswordPanelLayout.setVerticalGroup(
            changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordPanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(changePasswordValuesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(changePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wrongPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logOffPanelLayout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addGroup(logOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(confirmLogOffButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmLogOffLabel))
                .addContainerGap(316, Short.MAX_VALUE))
        );
        logOffPanelLayout.setVerticalGroup(
            logOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOffPanelLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(confirmLogOffLabel)
                .addGap(18, 18, 18)
                .addComponent(confirmLogOffButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        menuPanel.addTab("Log off", logOffPanel);

        fullNameWelcomeText.setBackground(new java.awt.Color(25, 25, 25));
        fullNameWelcomeText.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fullNameWelcomeText.setForeground(new java.awt.Color(204, 204, 204));
        fullNameWelcomeText.setText("Hello, " + manager.getName() + " " + manager.getSurname() + "!");

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(fullNameWelcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(fullNameWelcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuPanel))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
        if (oldPasswordTry.equals(manager.getPassword()))
        {
            if (newPasswordTry.equals(newPasswordTryCheck))
            {
                if (manager.isValidPassword(newPasswordTry) == true)
                {
                    manager.changePassword(newPasswordTry);
                    wrongPasswordTextField.setText("Your new password is set");
                }
                else wrongPasswordTextField.setText("Your password doesn't meet the requirements.");
            }
            else wrongPasswordTextField.setText("Your old or new password is incorrect");
        }
        else wrongPasswordTextField.setText("Your old or new password is incorrect");
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void newUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserActionPerformed
        noButtonActionPerformed(evt);
        nameField.setText("");
        surnameField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        newUserButton.setVisible(false);
        yesButton.setVisible(true);
        noButton.setVisible(true);
    }//GEN-LAST:event_newUserActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        nameField.setEditable(true);
        surnameField.setEditable(true);
        usernameField.setEditable(true);
        passwordField.setEditable(true);
        hoursSlider.setEnabled(true);
        submitButton.setVisible(true);
        hiddenConfirmPanel.setVisible(false);
    }//GEN-LAST:event_noButtonActionPerformed

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        allGoodLabel.setText("Success! Do you want to add a new user?");
        yesButton.setVisible(false);
        noButton.setVisible(false);
        newUserButton.setVisible(true);
        if (manager.teamEmployeesArraylist.size() == 0) 
        {
            pendingTimesheetsChoosePanel.setVisible(true);
            errorPendingTimesheetsLabel1.setText("");
        }
        if (manager.teamEmployeesArraylist.size() == 0)
        {
            changeWithHintsBackgroundPanel.setVisible(true);
            errorPendingTimesheetsLabel2.setText("");
        }
        String newName = nameField.getText();
        String newSurname = surnameField.getText();
        String newUsername = usernameField.getText();
        String newPassword = passwordField.getText();
        int newHours = hoursSlider.getValue();
        manager.addEmployee(newName, newSurname, newUsername, newPassword, newHours);
        userListGenerateReport.setModel(employees());
    }//GEN-LAST:event_yesButtonActionPerformed

    private void noChangeEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noChangeEmployeeButtonActionPerformed
        changeNameField.setEditable(true);
        changeSurnameField.setEditable(true);
        changePasswordField.setEditable(true);
        userListComboBox.setEnabled(true);
        submitChangeButton.setVisible(true);
        hiddenConfirmChangePanel.setVisible(false);
    }//GEN-LAST:event_noChangeEmployeeButtonActionPerformed

    private void yesChangeEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesChangeEmployeeButtonActionPerformed
        changeEmployeeHeader.setText(changeNameField.getText() + "'s data has been changed");
        hiddenConfirmChangePanel.setVisible(false);
        submitChangeButton.setVisible(true);
        noChangeEmployeeButtonActionPerformed(evt);
        
        String nName = changeNameField.getText();
        String nSurname = changeSurnameField.getText();
        String nPassword = changePasswordField.getText();
        int index = 0;
        String selectedValue = (String) userListComboBox.getSelectedItem();
        for(int i = 0; i<manager.teamEmployeesArraylist.size(); i++)
        if (manager.teamEmployeesArraylist.get(i).getUsername().equalsIgnoreCase(selectedValue)) { index = i; break;}
        
        manager.setEmployee(index, nName, nSurname, nPassword);
    }//GEN-LAST:event_yesChangeEmployeeButtonActionPerformed

    private void submitChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitChangeButtonActionPerformed

        nameChangeHintLabel.setText("");
        surnameChangeHintLabel.setText("");
        passwordChangeHintLabel.setText("");

        String name = changeNameField.getText();
        String surname = changeSurnameField.getText();
        String password = changePasswordField.getText();

        if (manager.validityCheck(name) == false) nameChangeHintLabel.setText("Incorrect name");
        if (manager.validityCheck(surname) == false) surnameChangeHintLabel.setText("Incorrect surname");
        if (manager.isValidPassword(password) == false) passwordChangeHintLabel.setText("Incorrect password");
        if (manager.validityCheck(name) == true && manager.validityCheck(surname) == true && manager.isValidPassword(password) == true )
        {
            changeNameField.setEditable(false);
            changeSurnameField.setEditable(false);
            changePasswordField.setEditable(false);
            userListComboBox.setEnabled(false);
            submitChangeButton.setVisible(false);
            hiddenConfirmChangePanel.setVisible(true);
        }

    }//GEN-LAST:event_submitChangeButtonActionPerformed

    private void changeNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNameFieldActionPerformed
    }//GEN-LAST:event_changeNameFieldActionPerformed

    private void userListComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userListComboBoxActionPerformed
        int index = 0;
        String selectedValue = (String) userListComboBox.getSelectedItem();
        changeEmployeeHeader.setText("Change employee data");
        changePasswordField.setText("");
        
        for(int i = 0; i<manager.teamEmployeesArraylist.size(); i++)
        if (manager.teamEmployeesArraylist.get(i).getUsername().equalsIgnoreCase(selectedValue))
        {
            index = i;
            break;
        }
        changeNameField.setText(manager.teamEmployeesArraylist.get(index).getName());
        changeSurnameField.setText(manager.teamEmployeesArraylist.get(index).getSurname());
    }//GEN-LAST:event_userListComboBoxActionPerformed

    private void declinePendingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declinePendingButtonActionPerformed
        String username = (String) userListPendingTimesheetsComboBox.getSelectedItem();
        String currentWeek = weekPendingLabel.getText();
        int currentIndex = 0;
        int nextIndex = 0;
        int userIndex = 0;
        boolean isPending = false;

        for (int i=0; i<manager.teamEmployeesArraylist.size(); i++) if (username.equalsIgnoreCase(manager.teamEmployeesArraylist.get(i).getUsername())) userIndex = i;

        for (int i=0; i<14 ; i++)
        if (currentWeek.equalsIgnoreCase(manager.teamEmployeesArraylist.get(userIndex).workTimeArraylist.workTimeByWeeks.get(i).getDescription()))
        currentIndex = i;

        for (int i=0; i<manager.teamEmployeesArraylist.size(); i++) if (username.equalsIgnoreCase(manager.teamEmployeesArraylist.get(i).getUsername())) userIndex = i;
        currentIndex++;

        for (int j=currentIndex; j<14; j++)
        if (manager.teamEmployeesArraylist.get(userIndex).workTimeArraylist.workTimeByWeeks.get(j).getAccepted() == false &&
            manager.teamEmployeesArraylist.get(userIndex).workTimeArraylist.workTimeByWeeks.get(j).isEntered() == true)
        {
            isPending = true; nextIndex = j;
            break;
        }

        if (currentIndex == 14 || isPending == false)
        {
            checkPendingTimesheetsButtonActionPerformed(evt);
        }
        else pendingTimesheet(userIndex, nextIndex);
    }//GEN-LAST:event_declinePendingButtonActionPerformed

    private void acceptPendingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptPendingButtonActionPerformed
        String username = (String) userListPendingTimesheetsComboBox.getSelectedItem();
        String currentWeek = weekPendingLabel.getText();
        int userIndex = 0;

        for (int i=0; i<manager.teamEmployeesArraylist.size(); i++) if (username.equalsIgnoreCase(manager.teamEmployeesArraylist.get(i).getUsername())) userIndex = i;

        for (int i=0; i<14 ; i++)
        if (currentWeek.equalsIgnoreCase(manager.teamEmployeesArraylist.get(userIndex).workTimeArraylist.workTimeByWeeks.get(i).getDescription()))
        manager.teamEmployeesArraylist.get(userIndex).workTimeArraylist.workTimeByWeeks.get(i).setAccepted(true);
        Database.exportDb();
        declinePendingButtonActionPerformed(evt);
    }//GEN-LAST:event_acceptPendingButtonActionPerformed

    private void checkPendingTimesheetsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPendingTimesheetsButtonActionPerformed
  
        if (userListPendingTimesheetsComboBox.isEnabled() == true)
        {
            String username = (String) userListPendingTimesheetsComboBox.getSelectedItem();
            int userIndex = 0;
            int currentIndex = 0;
            boolean isPending = false;

            for (int i=0; i<manager.teamEmployeesArraylist.size(); i++) 
                if (username.equalsIgnoreCase(manager.teamEmployeesArraylist.get(i).getUsername())) 
                    userIndex = i;

            for (int j=0; j<14; j++)
            if (manager.teamEmployeesArraylist.get(userIndex).workTimeArraylist.workTimeByWeeks.get(j).getAccepted() == false &&
                manager.teamEmployeesArraylist.get(userIndex).workTimeArraylist.workTimeByWeeks.get(j).isEntered() == true)
            {
                isPending = true; currentIndex = j;
                break;
            }

            if (isPending == false)
            {
                errorPendingTimesheetsLabel.setVisible(true);
                hiddenPendingPanel.setVisible(false);
                userListPendingTimesheetsComboBox.setEnabled(true);
            }
            else pendingTimesheet(userIndex, currentIndex);
        }

        else
        {
            errorPendingTimesheetsLabel.setVisible(false);
            hiddenPendingPanel.setVisible(false);
            userListPendingTimesheetsComboBox.setEnabled(true);
            checkPendingTimesheetsButton.setText("Check pending timesheets");
        }
    }//GEN-LAST:event_checkPendingTimesheetsButtonActionPerformed

    private void confirmLogOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmLogOffButtonActionPerformed
        LoginGUI.main();
        this.dispose();
    }//GEN-LAST:event_confirmLogOffButtonActionPerformed

    private void generateReportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportsButtonActionPerformed

        Object[] selectedObjects = userListGenerateReport.getSelectedValues();
        String[] selectedValues = Arrays.copyOf(selectedObjects, selectedObjects.length, String[].class);
        
        timesheetTextArea.setText(generateReport(selectedValues));      
    }//GEN-LAST:event_generateReportsButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        nameHint.setText("");
        surnameHint.setText("");
        usernameHint.setText("");
        passwordHint.setText("");

        String name = nameField.getText();
        String surname = surnameField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (manager.validityCheck(name) == false) nameHint.setText("Incorrect name");
        if (manager.validityCheck(surname) == false) surnameHint.setText("Incorrect surname");
        if (manager.usernameCheck(username) == false) usernameHint.setText("Incorrect username");
        if (manager.isValidPassword(password) == false) passwordHint.setText("Incorrect password");

        if (manager.validityCheck(name) == true && manager.validityCheck(surname) == true && manager.usernameCheck(username) == true && manager.isValidPassword(password) == true)
        {
            nameField.setEditable(false);
            surnameField.setEditable(false);
            usernameField.setEditable(false);
            passwordField.setEditable(false);
            hoursSlider.setEnabled(false);
            submitButton.setVisible(false);
            hiddenConfirmPanel.setVisible(true);

        }
        userListGenerateReport.setModel(employees());
    }//GEN-LAST:event_submitButtonActionPerformed

    private String generateReport(String[] selectedValues){
        StringBuilder s = new StringBuilder(); 
        for (String selectedValue : selectedValues) {
            for (int j = 0; j<manager.teamEmployeesArraylist.size(); j++) 
            {
                if (selectedValue.equalsIgnoreCase(manager.teamEmployeesArraylist.get(j).getUsername())) 
                {
                    s.append("================================================\n\n");
                    s.append("Full name: ").append(manager.teamEmployeesArraylist.get(j).getName());
                    s.append(" ").append(manager.teamEmployeesArraylist.get(j).getSurname()).append("\n\n");
                    s.append(manager.teamEmployeesArraylist.get(j).getTimesheet()).append("\n\n\n");
                }
            }
        }
        return s.toString();
    }
    
    void pendingTimesheet(int userIndex, int currentIndex){
        errorPendingTimesheetsLabel.setVisible(false);
        hiddenPendingPanel.setVisible(true);
        userListPendingTimesheetsComboBox.setEnabled(false);
        checkPendingTimesheetsButton.setText("Change user");
        firstNamePendingLabel.setText(manager.teamEmployeesArraylist.get(userIndex).getName() + " " + manager.teamEmployeesArraylist.get(userIndex).getSurname());
        weekPendingLabel.setText(manager.teamEmployeesArraylist.get(userIndex).workTimeArraylist.workTimeByWeeks.get(currentIndex).getDescription());
        workHoursPendingLabel.setText(String.valueOf(manager.teamEmployeesArraylist.get(userIndex).workTimeArraylist.workTimeByWeeks.get(currentIndex).getDeclaredHours()));
        sickHoursPendingLabel.setText(String.valueOf(manager.teamEmployeesArraylist.get(userIndex).workTimeArraylist.workTimeByWeeks.get(currentIndex).getDeclaredSickTime()));
        vacationHoursPendingLabel.setText(String.valueOf(manager.teamEmployeesArraylist.get(userIndex).workTimeArraylist.workTimeByWeeks.get(currentIndex).getDeclaredVacation()));
        
        for (int i = currentIndex; i<14; i++) 
            if (manager.teamEmployeesArraylist.get(userIndex).workTimeArraylist.workTimeByWeeks.get(i).getAccepted() == false) break;
        
    }
        
    public DefaultComboBoxModel employees(){
        DefaultComboBoxModel<String> employees = new DefaultComboBoxModel<>();
        for (int i = 0; i<manager.teamEmployeesArraylist.size(); i++) 
        {
            employees.addElement(manager.teamEmployeesArraylist.get(i).getUsername());
        }
        return employees;
    };

    public static void main(Manager manager) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new ManagerGUI(manager).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptPendingButton;
    private javax.swing.JPanel addEmployeePanel;
    private javax.swing.JPanel addEmployeeWithHintsPanel;
    private javax.swing.JLabel addNewEmployeeHeader;
    private javax.swing.JPanel addNewPanel;
    private javax.swing.JLabel allGoodLabel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel changeActionBacgroundPanel;
    private javax.swing.JPanel changeEmployeeDataPanel;
    private javax.swing.JLabel changeEmployeeHeader;
    private javax.swing.JPanel changeInputPanel;
    private javax.swing.JTextField changeNameField;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JTextField changePasswordField;
    private javax.swing.JLabel changePasswordLabel;
    private javax.swing.JPanel changePasswordPanel;
    private javax.swing.JPanel changePasswordValuesPanel;
    private javax.swing.JTextField changeSurnameField;
    private javax.swing.JPanel changeWithHintsBackgroundPanel;
    private javax.swing.JButton checkPendingTimesheetsButton;
    private javax.swing.JPanel checkTimesheetsPanel;
    private javax.swing.JLabel chooseUsernameLabel;
    private javax.swing.JButton confirmLogOffButton;
    private javax.swing.JLabel confirmLogOffLabel;
    private javax.swing.JLabel confirmValidChangeEmployeeLabel;
    private javax.swing.JLabel contractHoursLabel;
    private javax.swing.JButton declinePendingButton;
    private javax.swing.JLabel errorPendingTimesheetsLabel;
    private javax.swing.JLabel errorPendingTimesheetsLabel1;
    private javax.swing.JLabel errorPendingTimesheetsLabel2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel firstNamePendingLabel;
    private javax.swing.JLabel fullNameWelcomeText;
    private javax.swing.JButton generateReportsButton;
    private javax.swing.JPanel hiddenConfirmChangePanel;
    private javax.swing.JPanel hiddenConfirmPanel;
    private javax.swing.JPanel hiddenPendingPanel;
    private javax.swing.JSlider hoursSlider;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JPanel logOffPanel;
    private javax.swing.JTabbedPane menuPanel;
    private javax.swing.JLabel nameChangeHintLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameHint;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel newPassword2Label;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JPasswordField newPasswordFieldCheck;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JButton newUserButton;
    private javax.swing.JButton noButton;
    private javax.swing.JButton noChangeEmployeeButton;
    private javax.swing.JPasswordField oldPasswordField;
    private javax.swing.JLabel oldPaswordLabel;
    private javax.swing.JLabel passwordChangeHintLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordHint;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel pendingTimesheetsChoosePanel;
    private javax.swing.JPanel pendingTimesheetsPanel;
    private javax.swing.JLabel sickHoursLabel;
    private javax.swing.JLabel sickHoursPendingLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton submitChangeButton;
    private javax.swing.JLabel surnameChangeHintLabel;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel surnameHint;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JScrollPane timesheetScrollPanel;
    private javax.swing.JTextArea timesheetTextArea;
    private javax.swing.JComboBox<String> userListComboBox;
    private javax.swing.JList<String> userListGenerateReport;
    private javax.swing.JComboBox<String> userListPendingTimesheetsComboBox;
    private javax.swing.JScrollPane userListScrollPanel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameHint;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel vacationHoursPendingLabel;
    private javax.swing.JLabel vacationLabel;
    private javax.swing.JLabel weekPendingLabel;
    private javax.swing.JLabel workHoursLabel;
    private javax.swing.JLabel workHoursPendingLabel;
    private javax.swing.JLabel wrongPasswordTextField;
    private javax.swing.JButton yesButton;
    private javax.swing.JButton yesChangeEmployeeButton;
    // End of variables declaration//GEN-END:variables
}
