package com.mycompany.timedeclaration;

import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;

public class AdministratorGUI extends javax.swing.JFrame {

    public AdministratorGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JTabbedPane();
        manageAccountsPanel = new javax.swing.JPanel();
        changeWithHintsBackgroundPanel = new javax.swing.JPanel();
        nameChangeHintLabel = new javax.swing.JLabel();
        surnameChangeHintLabel = new javax.swing.JLabel();
        passwordChangeHintLabel = new javax.swing.JLabel();
        managerChangeHintLabel = new javax.swing.JLabel();
        manageActionPanel = new javax.swing.JPanel();
        changeInputPanel = new javax.swing.JPanel();
        chooseUsernameLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        changePasswordLabel = new javax.swing.JLabel();
        userListComboBox = new javax.swing.JComboBox<>();
        changeNameField = new javax.swing.JTextField();
        changeSurnameField = new javax.swing.JTextField();
        changePasswordField = new javax.swing.JTextField();
        managerListComboBox = new javax.swing.JComboBox<>();
        newManagerLabel = new javax.swing.JLabel();
        submitChangeButton = new javax.swing.JButton();
        backChangeButton = new javax.swing.JButton();
        hiddenConfirmChangePanel = new javax.swing.JPanel();
        confirmValidChangeEmployeeLabel = new javax.swing.JLabel();
        yesChangeEmployeeButton = new javax.swing.JButton();
        noChangeEmployeeButton = new javax.swing.JButton();
        chooseManagerButton = new javax.swing.JButton();
        chooseEmployeeButton = new javax.swing.JButton();
        manageAccountsLabel = new javax.swing.JLabel();
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
        usernameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        submitButton = new javax.swing.JButton();
        surnameHint = new javax.swing.JLabel();
        usernameHint = new javax.swing.JLabel();
        passwordHint = new javax.swing.JLabel();
        nameHint = new javax.swing.JLabel();
        deleteAccountPanel = new javax.swing.JPanel();
        deleteActionPanel = new javax.swing.JPanel();
        chooseUserInputPanel = new javax.swing.JPanel();
        chooseUsernameLabel1 = new javax.swing.JLabel();
        userListComboBox1 = new javax.swing.JComboBox<>();
        deleteWarningLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        hiddenConfirmDeletePanel = new javax.swing.JPanel();
        confirmDeletelabel = new javax.swing.JLabel();
        yesDeleteButton = new javax.swing.JButton();
        noDeleteButton = new javax.swing.JButton();
        deleteManagerButton = new javax.swing.JButton();
        deleteEmployeeButton = new javax.swing.JButton();
        deleteAccountsLabel = new javax.swing.JLabel();
        checkTimesheetsPanel = new javax.swing.JPanel();
        userListScrollPanel = new javax.swing.JScrollPane();
        userListGenerateReport = new javax.swing.JList<>();
        timesheetScrollPanel = new javax.swing.JScrollPane();
        timesheetTextArea = new javax.swing.JTextArea();
        generateReportsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logOffPanel = new javax.swing.JPanel();
        confirmLogOffLabel = new javax.swing.JLabel();
        confirmLogOffButton = new javax.swing.JButton();
        fullNameWelcomeText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(25, 25, 25));

        menuPanel.setBackground(new java.awt.Color(25, 25, 25));
        menuPanel.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        menuPanel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        menuPanel.setInheritsPopupMenu(true);

        manageAccountsPanel.setBackground(new java.awt.Color(25, 25, 25));
        manageAccountsPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black));

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

        managerChangeHintLabel.setBackground(new java.awt.Color(25, 25, 25));
        managerChangeHintLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        managerChangeHintLabel.setForeground(new java.awt.Color(204, 204, 204));
        managerChangeHintLabel.setMaximumSize(new java.awt.Dimension(150, 20));
        managerChangeHintLabel.setMinimumSize(new java.awt.Dimension(150, 20));
        managerChangeHintLabel.setPreferredSize(new java.awt.Dimension(150, 25));

        manageActionPanel.setBackground(new java.awt.Color(25, 25, 25));
        manageActionPanel.setMinimumSize(new java.awt.Dimension(350, 350));
        manageActionPanel.setPreferredSize(new java.awt.Dimension(345, 280));

        changeInputPanel.setVisible(false);
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

        managerListComboBox.setBackground(new java.awt.Color(25, 25, 25));
        managerListComboBox.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        managerListComboBox.setForeground(new java.awt.Color(204, 204, 204));
        managerListComboBox.setMaximumRowCount(20);
        managerListComboBox.setModel(managers());
        managerListComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        managerListComboBox.setMinimumSize(new java.awt.Dimension(150, 25));
        managerListComboBox.setPreferredSize(new java.awt.Dimension(150, 30));
        managerListComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerListComboBoxActionPerformed(evt);
            }
        });

        newManagerLabel.setBackground(new java.awt.Color(25, 25, 25));
        newManagerLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        newManagerLabel.setForeground(new java.awt.Color(204, 204, 204));
        newManagerLabel.setText("New manager:");
        newManagerLabel.setMaximumSize(new java.awt.Dimension(150, 20));
        newManagerLabel.setMinimumSize(new java.awt.Dimension(150, 20));
        newManagerLabel.setPreferredSize(new java.awt.Dimension(150, 20));

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

        backChangeButton.setBackground(new java.awt.Color(25, 25, 25));
        backChangeButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        backChangeButton.setForeground(new java.awt.Color(204, 204, 204));
        backChangeButton.setText("back");
        backChangeButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        backChangeButton.setContentAreaFilled(false);
        backChangeButton.setPreferredSize(new java.awt.Dimension(80, 30));
        backChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backChangeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout changeInputPanelLayout = new javax.swing.GroupLayout(changeInputPanel);
        changeInputPanel.setLayout(changeInputPanelLayout);
        changeInputPanelLayout.setHorizontalGroup(
            changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeInputPanelLayout.createSequentialGroup()
                        .addGroup(changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chooseUsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changePasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userListComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeNameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeSurnameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changePasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeInputPanelLayout.createSequentialGroup()
                        .addComponent(newManagerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(managerListComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeInputPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(submitChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        changeInputPanelLayout.setVerticalGroup(
            changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userListComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseUsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeNameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeSurnameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(changePasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(managerListComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newManagerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(changeInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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
                    .addComponent(noChangeEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        chooseManagerButton.setBackground(new java.awt.Color(25, 25, 25));
        chooseManagerButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chooseManagerButton.setForeground(new java.awt.Color(204, 204, 204));
        chooseManagerButton.setText("Manager");
        chooseManagerButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        chooseManagerButton.setContentAreaFilled(false);
        chooseManagerButton.setMaximumSize(new java.awt.Dimension(80, 30));
        chooseManagerButton.setMinimumSize(new java.awt.Dimension(80, 30));
        chooseManagerButton.setPreferredSize(new java.awt.Dimension(120, 30));
        chooseManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseManagerButtonActionPerformed(evt);
            }
        });

        chooseEmployeeButton.setBackground(new java.awt.Color(25, 25, 25));
        chooseEmployeeButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chooseEmployeeButton.setForeground(new java.awt.Color(204, 204, 204));
        chooseEmployeeButton.setText("Employee");
        chooseEmployeeButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        chooseEmployeeButton.setContentAreaFilled(false);
        chooseEmployeeButton.setMaximumSize(new java.awt.Dimension(80, 30));
        chooseEmployeeButton.setMinimumSize(new java.awt.Dimension(80, 30));
        chooseEmployeeButton.setPreferredSize(new java.awt.Dimension(120, 30));
        chooseEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseEmployeeButtonActionPerformed(evt);
            }
        });

        manageAccountsLabel.setBackground(new java.awt.Color(25, 25, 25));
        manageAccountsLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        manageAccountsLabel.setForeground(new java.awt.Color(204, 204, 204));
        manageAccountsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageAccountsLabel.setText("Modify account");
        manageAccountsLabel.setMaximumSize(new java.awt.Dimension(333, 25));
        manageAccountsLabel.setMinimumSize(new java.awt.Dimension(333, 25));
        manageAccountsLabel.setPreferredSize(new java.awt.Dimension(333, 25));

        javax.swing.GroupLayout manageActionPanelLayout = new javax.swing.GroupLayout(manageActionPanel);
        manageActionPanel.setLayout(manageActionPanelLayout);
        manageActionPanelLayout.setHorizontalGroup(
            manageActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageActionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageActionPanelLayout.createSequentialGroup()
                        .addComponent(chooseEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chooseManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(manageActionPanelLayout.createSequentialGroup()
                        .addComponent(changeInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(manageActionPanelLayout.createSequentialGroup()
                .addGroup(manageActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageActionPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(hiddenConfirmChangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(manageAccountsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        manageActionPanelLayout.setVerticalGroup(
            manageActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageActionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageAccountsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hiddenConfirmChangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout changeWithHintsBackgroundPanelLayout = new javax.swing.GroupLayout(changeWithHintsBackgroundPanel);
        changeWithHintsBackgroundPanel.setLayout(changeWithHintsBackgroundPanelLayout);
        changeWithHintsBackgroundPanelLayout.setHorizontalGroup(
            changeWithHintsBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeWithHintsBackgroundPanelLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(manageActionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changeWithHintsBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeWithHintsBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(surnameChangeHintLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameChangeHintLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordChangeHintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(managerChangeHintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        changeWithHintsBackgroundPanelLayout.setVerticalGroup(
            changeWithHintsBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeWithHintsBackgroundPanelLayout.createSequentialGroup()
                .addGroup(changeWithHintsBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeWithHintsBackgroundPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(nameChangeHintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(surnameChangeHintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordChangeHintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(managerChangeHintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(changeWithHintsBackgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(manageActionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout manageAccountsPanelLayout = new javax.swing.GroupLayout(manageAccountsPanel);
        manageAccountsPanel.setLayout(manageAccountsPanelLayout);
        manageAccountsPanelLayout.setHorizontalGroup(
            manageAccountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageAccountsPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(changeWithHintsBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        manageAccountsPanelLayout.setVerticalGroup(
            manageAccountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageAccountsPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(changeWithHintsBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        menuPanel.addTab("Modify account", manageAccountsPanel);

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
                newUserButtonnewUserActionPerformed(evt);
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
        addNewEmployeeHeader.setText("Add new manager");
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
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usernameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(surnameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(0, 0, Short.MAX_VALUE)
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
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(32, 32, 32)
                .addComponent(nameHint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(surnameHint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameHint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordHint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(addEmployeeWithHintsPanelLayout.createSequentialGroup()
                .addComponent(addNewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addEmployeePanelLayout = new javax.swing.GroupLayout(addEmployeePanel);
        addEmployeePanel.setLayout(addEmployeePanelLayout);
        addEmployeePanelLayout.setHorizontalGroup(
            addEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployeePanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(addEmployeeWithHintsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addGap(111, 111, 111))
        );
        addEmployeePanelLayout.setVerticalGroup(
            addEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEmployeePanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(addEmployeeWithHintsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        menuPanel.addTab("Add new manager", addEmployeePanel);

        deleteAccountPanel.setBackground(new java.awt.Color(25, 25, 25));
        deleteAccountPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black));

        deleteActionPanel.setBackground(new java.awt.Color(25, 25, 25));
        deleteActionPanel.setMinimumSize(new java.awt.Dimension(350, 350));
        deleteActionPanel.setPreferredSize(new java.awt.Dimension(345, 280));

        chooseUserInputPanel.setVisible(false);
        chooseUserInputPanel.setBackground(new java.awt.Color(25, 25, 25));
        chooseUserInputPanel.setForeground(new java.awt.Color(204, 204, 204));

        chooseUsernameLabel1.setBackground(new java.awt.Color(25, 25, 25));
        chooseUsernameLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chooseUsernameLabel1.setForeground(new java.awt.Color(204, 204, 204));
        chooseUsernameLabel1.setText("Choose username:");
        chooseUsernameLabel1.setMaximumSize(new java.awt.Dimension(150, 20));
        chooseUsernameLabel1.setMinimumSize(new java.awt.Dimension(150, 20));
        chooseUsernameLabel1.setPreferredSize(new java.awt.Dimension(150, 20));

        userListComboBox1.setBackground(new java.awt.Color(25, 25, 25));
        userListComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        userListComboBox1.setForeground(new java.awt.Color(204, 204, 204));
        userListComboBox1.setMaximumRowCount(20);
        userListComboBox1.setModel(employees());
        userListComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        userListComboBox1.setMinimumSize(new java.awt.Dimension(150, 25));
        userListComboBox1.setPreferredSize(new java.awt.Dimension(150, 30));
        userListComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userListComboBox1ActionPerformed(evt);
            }
        });

        deleteWarningLabel.setBackground(new java.awt.Color(25, 25, 25));
        deleteWarningLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        deleteWarningLabel.setForeground(new java.awt.Color(204, 204, 204));
        deleteWarningLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteWarningLabel.setText("Move all employees before you delete the account!");
        deleteWarningLabel.setMaximumSize(new java.awt.Dimension(250, 20));
        deleteWarningLabel.setMinimumSize(new java.awt.Dimension(250, 20));
        deleteWarningLabel.setPreferredSize(new java.awt.Dimension(250, 20));

        deleteButton.setBackground(new java.awt.Color(25, 25, 25));
        deleteButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(204, 204, 204));
        deleteButton.setText("delete");
        deleteButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        deleteButton.setContentAreaFilled(false);
        deleteButton.setPreferredSize(new java.awt.Dimension(80, 30));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(25, 25, 25));
        backButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(204, 204, 204));
        backButton.setText("back");
        backButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        backButton.setContentAreaFilled(false);
        backButton.setPreferredSize(new java.awt.Dimension(80, 30));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout chooseUserInputPanelLayout = new javax.swing.GroupLayout(chooseUserInputPanel);
        chooseUserInputPanel.setLayout(chooseUserInputPanelLayout);
        chooseUserInputPanelLayout.setHorizontalGroup(
            chooseUserInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseUserInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chooseUsernameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userListComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chooseUserInputPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(chooseUserInputPanelLayout.createSequentialGroup()
                .addComponent(deleteWarningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        chooseUserInputPanelLayout.setVerticalGroup(
            chooseUserInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseUserInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chooseUserInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userListComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseUsernameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteWarningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(chooseUserInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        hiddenConfirmDeletePanel.setVisible(false);
        hiddenConfirmDeletePanel.setBackground(new java.awt.Color(25, 25, 25));
        hiddenConfirmDeletePanel.setForeground(new java.awt.Color(204, 204, 204));

        confirmDeletelabel.setBackground(new java.awt.Color(25, 25, 25));
        confirmDeletelabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        confirmDeletelabel.setForeground(new java.awt.Color(204, 204, 204));
        confirmDeletelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmDeletelabel.setText("Are you sure you want to proceed?");
        confirmDeletelabel.setMaximumSize(new java.awt.Dimension(250, 20));
        confirmDeletelabel.setMinimumSize(new java.awt.Dimension(250, 20));
        confirmDeletelabel.setPreferredSize(new java.awt.Dimension(250, 20));

        yesDeleteButton.setBackground(new java.awt.Color(25, 25, 25));
        yesDeleteButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        yesDeleteButton.setForeground(new java.awt.Color(204, 204, 204));
        yesDeleteButton.setText("yes");
        yesDeleteButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        yesDeleteButton.setContentAreaFilled(false);
        yesDeleteButton.setMaximumSize(new java.awt.Dimension(85, 25));
        yesDeleteButton.setMinimumSize(new java.awt.Dimension(85, 25));
        yesDeleteButton.setPreferredSize(new java.awt.Dimension(85, 30));
        yesDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesDeleteButtonActionPerformed(evt);
            }
        });

        noDeleteButton.setBackground(new java.awt.Color(25, 25, 25));
        noDeleteButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        noDeleteButton.setForeground(new java.awt.Color(204, 204, 204));
        noDeleteButton.setText("no");
        noDeleteButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        noDeleteButton.setContentAreaFilled(false);
        noDeleteButton.setMaximumSize(new java.awt.Dimension(85, 25));
        noDeleteButton.setMinimumSize(new java.awt.Dimension(85, 25));
        noDeleteButton.setPreferredSize(new java.awt.Dimension(85, 30));
        noDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hiddenConfirmDeletePanelLayout = new javax.swing.GroupLayout(hiddenConfirmDeletePanel);
        hiddenConfirmDeletePanel.setLayout(hiddenConfirmDeletePanelLayout);
        hiddenConfirmDeletePanelLayout.setHorizontalGroup(
            hiddenConfirmDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hiddenConfirmDeletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hiddenConfirmDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hiddenConfirmDeletePanelLayout.createSequentialGroup()
                        .addComponent(confirmDeletelabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(hiddenConfirmDeletePanelLayout.createSequentialGroup()
                        .addComponent(yesDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hiddenConfirmDeletePanelLayout.setVerticalGroup(
            hiddenConfirmDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hiddenConfirmDeletePanelLayout.createSequentialGroup()
                .addComponent(confirmDeletelabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(hiddenConfirmDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        deleteManagerButton.setBackground(new java.awt.Color(25, 25, 25));
        deleteManagerButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        deleteManagerButton.setForeground(new java.awt.Color(204, 204, 204));
        deleteManagerButton.setText("Manager");
        deleteManagerButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        deleteManagerButton.setContentAreaFilled(false);
        deleteManagerButton.setMaximumSize(new java.awt.Dimension(80, 30));
        deleteManagerButton.setMinimumSize(new java.awt.Dimension(80, 30));
        deleteManagerButton.setPreferredSize(new java.awt.Dimension(120, 30));
        deleteManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteManagerButtonActionPerformed(evt);
            }
        });

        deleteEmployeeButton.setBackground(new java.awt.Color(25, 25, 25));
        deleteEmployeeButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        deleteEmployeeButton.setForeground(new java.awt.Color(204, 204, 204));
        deleteEmployeeButton.setText("Employee");
        deleteEmployeeButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        deleteEmployeeButton.setContentAreaFilled(false);
        deleteEmployeeButton.setMaximumSize(new java.awt.Dimension(80, 30));
        deleteEmployeeButton.setMinimumSize(new java.awt.Dimension(80, 30));
        deleteEmployeeButton.setPreferredSize(new java.awt.Dimension(120, 30));
        deleteEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeButtonActionPerformed(evt);
            }
        });

        deleteAccountsLabel.setBackground(new java.awt.Color(25, 25, 25));
        deleteAccountsLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        deleteAccountsLabel.setForeground(new java.awt.Color(204, 204, 204));
        deleteAccountsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteAccountsLabel.setText("Delete account");
        deleteAccountsLabel.setMaximumSize(new java.awt.Dimension(333, 25));
        deleteAccountsLabel.setMinimumSize(new java.awt.Dimension(333, 25));
        deleteAccountsLabel.setPreferredSize(new java.awt.Dimension(333, 25));

        javax.swing.GroupLayout deleteActionPanelLayout = new javax.swing.GroupLayout(deleteActionPanel);
        deleteActionPanel.setLayout(deleteActionPanelLayout);
        deleteActionPanelLayout.setHorizontalGroup(
            deleteActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteActionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deleteActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hiddenConfirmDeletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseUserInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(deleteActionPanelLayout.createSequentialGroup()
                .addComponent(deleteAccountsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(deleteActionPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(deleteEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        deleteActionPanelLayout.setVerticalGroup(
            deleteActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteActionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteAccountsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deleteActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chooseUserInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hiddenConfirmDeletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout deleteAccountPanelLayout = new javax.swing.GroupLayout(deleteAccountPanel);
        deleteAccountPanel.setLayout(deleteAccountPanelLayout);
        deleteAccountPanelLayout.setHorizontalGroup(
            deleteAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteAccountPanelLayout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(deleteActionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );
        deleteAccountPanelLayout.setVerticalGroup(
            deleteAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteAccountPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(deleteActionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        menuPanel.addTab("Delete account", deleteAccountPanel);

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
                        .addComponent(timesheetScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)))
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
                .addContainerGap(348, Short.MAX_VALUE))
        );
        logOffPanelLayout.setVerticalGroup(
            logOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOffPanelLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(confirmLogOffLabel)
                .addGap(18, 18, 18)
                .addComponent(confirmLogOffButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        menuPanel.addTab("Log off", logOffPanel);

        fullNameWelcomeText.setBackground(new java.awt.Color(25, 25, 25));
        fullNameWelcomeText.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fullNameWelcomeText.setForeground(new java.awt.Color(204, 204, 204));
        fullNameWelcomeText.setText("Hello, Admin!");

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
                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public DefaultComboBoxModel employees()
    {
        DefaultComboBoxModel<String> employees = new DefaultComboBoxModel<>();
        for (int i = 0; i<Administrator.allEmployees.size(); i++) employees.addElement(Administrator.allEmployees.get(i).getUsername());
        return employees;
    };
    
    public DefaultComboBoxModel managers()
    {
        DefaultComboBoxModel<String> managers = new DefaultComboBoxModel<>();
        for (int i = 0; i<Administrator.allManagers.size(); i++) managers.addElement(Administrator.allManagers.get(i).getUsername());
        return managers;
    };
    
    private void userListComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userListComboBoxActionPerformed
        int index = 0;
        String selectedValue = (String) userListComboBox.getSelectedItem();
        changePasswordField.setText("");
        
        if (chooseEmployeeButton.isVisible() == true)
        {
            for(int i = 0; i<Administrator.allEmployees.size(); i++)
            if (Administrator.allEmployees.get(i).getUsername().equalsIgnoreCase(selectedValue))
            {
                index = i;
                break;
            }
            managerListComboBox.setModel(managers());
            managerListComboBoxActionPerformed(evt);
            changeNameField.setText(Administrator.allEmployees.get(index).getName());
            changeSurnameField.setText(Administrator.allEmployees.get(index).getSurname());
        }
        else if (chooseManagerButton.isVisible() == true)
        {
            for(int i = 0; i<Administrator.allManagers.size(); i++)
            if (Administrator.allManagers.get(i).getUsername().equalsIgnoreCase(selectedValue))
            {
                index = i;
                break;
            }
            changeNameField.setText(Administrator.allManagers.get(index).getName());
            changeSurnameField.setText(Administrator.allManagers.get(index).getSurname());
        }
    }//GEN-LAST:event_userListComboBoxActionPerformed

    private void submitChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitChangeButtonActionPerformed
        nameChangeHintLabel.setText("");
        surnameChangeHintLabel.setText("");
        passwordChangeHintLabel.setText("");
        managerChangeHintLabel.setText("");

        String name = changeNameField.getText();
        String surname = changeSurnameField.getText();
        String password = changePasswordField.getText();

        if (admin.validityCheck(name) == false) nameChangeHintLabel.setText("Incorrect name");
        if (admin.validityCheck(surname) == false) surnameChangeHintLabel.setText("Incorrect surname");
        if (admin.isValidPassword(password) == false) passwordChangeHintLabel.setText("Incorrect password");
        if (admin.validityCheck(name) == true && admin.validityCheck(surname) == true && admin.isValidPassword(password) == true )
        {
            changeNameField.setEditable(false);
            changeSurnameField.setEditable(false);
            changePasswordField.setEditable(false);
            userListComboBox.setEnabled(false);
            managerListComboBox.setEnabled(false);
            submitChangeButton.setVisible(false);
            backChangeButton.setVisible(false);
            hiddenConfirmChangePanel.setVisible(true);
        }
    }//GEN-LAST:event_submitChangeButtonActionPerformed

    private void yesChangeEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesChangeEmployeeButtonActionPerformed
        manageAccountsLabel.setText(changeNameField.getText() + "'s data has been changed");
        hiddenConfirmChangePanel.setVisible(false);
        submitChangeButton.setVisible(true);
        backChangeButton.setVisible(true);
        String nUsername = (String) userListComboBox.getSelectedItem();
        String nName = changeNameField.getText();
        String nSurname = changeSurnameField.getText();
        String nPassword = changePasswordField.getText();
        
        if (chooseEmployeeButton.isVisible() == true) 
        {
            String nManager = (String) managerListComboBox.getSelectedItem();
            admin.setEmployee(nUsername, nName, nSurname, nPassword, nManager);
        }
        else if (chooseManagerButton.isVisible() == true)
        {
            admin.setManager(nUsername, nName, nSurname, nPassword); 
        }
        
        changeInputPanel.setVisible(false);
        chooseEmployeeButton.setVisible(true);
        chooseManagerButton.setVisible(true);
        chooseEmployeeButton.setEnabled(true);
        chooseManagerButton.setEnabled(true);
        noChangeEmployeeButtonActionPerformed(evt);
        
    }//GEN-LAST:event_yesChangeEmployeeButtonActionPerformed

    private void noChangeEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noChangeEmployeeButtonActionPerformed
        changeNameField.setEditable(true);
        changeSurnameField.setEditable(true);
        changePasswordField.setEditable(true);
        userListComboBox.setEnabled(true);
        managerListComboBox.setEnabled(true);
        submitChangeButton.setVisible(true);
        backChangeButton.setVisible(true);
        hiddenConfirmChangePanel.setVisible(false);
    }//GEN-LAST:event_noChangeEmployeeButtonActionPerformed

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        allGoodLabel.setText("Success! Do you want to add a new user?");
        yesButton.setVisible(false);
        noButton.setVisible(false);
        newUserButton.setVisible(true);
        
        String mName = nameField.getText();
        String mSurname = surnameField.getText();
        String mUsername = usernameField.getText();
        String mPassword = passwordField.getText();
        
        admin.addManager(mName, mSurname, mUsername, mPassword);
    }//GEN-LAST:event_yesButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        nameField.setEditable(true);
        surnameField.setEditable(true);
        usernameField.setEditable(true);
        passwordField.setEditable(true);
        submitButton.setVisible(true);
        hiddenConfirmPanel.setVisible(false);
    }//GEN-LAST:event_noButtonActionPerformed

    private void newUserButtonnewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserButtonnewUserActionPerformed
        noButtonActionPerformed(evt);
        nameField.setText("");
        surnameField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        newUserButton.setVisible(false);
        yesButton.setVisible(true);
        noButton.setVisible(true);
    }//GEN-LAST:event_newUserButtonnewUserActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        nameHint.setText("");
        surnameHint.setText("");
        usernameHint.setText("");
        passwordHint.setText("");

        String name = nameField.getText();
        String surname = surnameField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (admin.validityCheck(name) == false) nameHint.setText("Incorrect name");
        if (admin.validityCheck(surname) == false) surnameHint.setText("Incorrect surname");
        if (admin.usernameCheck(username) == false) usernameHint.setText("Incorrect username");
        if (admin.isValidPassword(password) == false) passwordHint.setText("Incorrect password");

        if (admin.validityCheck(name) == true && admin.validityCheck(surname) == true && admin.usernameCheck(username) == true && admin.isValidPassword(password) == true)
        {
            nameField.setEditable(false);
            surnameField.setEditable(false);
            usernameField.setEditable(false);
            passwordField.setEditable(false);
            submitButton.setVisible(false);
            hiddenConfirmPanel.setVisible(true);

        }
    }//GEN-LAST:event_submitButtonActionPerformed
    
    private String generateReport(String[] selectedValues)
    {
        StringBuilder s = new StringBuilder(); 
        for (String selectedValue : selectedValues) {
            for (int j = 0; j<admin.allEmployees.size(); j++) 
            {
                if (selectedValue.equalsIgnoreCase(admin.allEmployees.get(j).getUsername())) 
                {
                    s.append("================================================\n\n");
                    s.append("Full name: ").append(admin.allEmployees.get(j).getName());
                    s.append(" ").append(admin.allEmployees.get(j).getSurname());
                    s.append(" | Manager username: ").append(admin.allEmployees.get(j).getTeamPlacement()).append("\n\n");
                    s.append("================================================\n\n");
                    s.append(admin.allEmployees.get(j).getTimesheet()).append("\n\n\n");
                }
            }
        }
        return s.toString();
    }

    private void generateReportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportsButtonActionPerformed
        Object[] selectedObjects = userListGenerateReport.getSelectedValues();
        String[] selectedValues = Arrays.copyOf(selectedObjects, selectedObjects.length, String[].class);

        timesheetTextArea.setText(generateReport(selectedValues));
    }//GEN-LAST:event_generateReportsButtonActionPerformed

    private void confirmLogOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmLogOffButtonActionPerformed
        LoginGUI.main();
        this.dispose();
    }//GEN-LAST:event_confirmLogOffButtonActionPerformed

    private void chooseManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseManagerButtonActionPerformed
        manageAccountsLabel.setText("Manage accounts");
        changeInputPanel.setVisible(true);
        
        newManagerLabel.setVisible(false);
        managerListComboBox.setVisible(false);
        
        chooseEmployeeButton.setVisible(false);
        chooseManagerButton.setEnabled(false);
        
        userListComboBox.setModel(managers());
        userListComboBoxActionPerformed(evt);
    }//GEN-LAST:event_chooseManagerButtonActionPerformed

    private void chooseEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseEmployeeButtonActionPerformed
        managerListComboBox.setModel(managers());
        managerListComboBoxActionPerformed(evt);
        manageAccountsLabel.setText("Manage accounts");
        changeInputPanel.setVisible(true);
        
        newManagerLabel.setVisible(true);
        managerListComboBox.setVisible(true);
        
        chooseEmployeeButton.setEnabled(false);
        chooseManagerButton.setVisible(false);
        
        userListComboBox.setModel(employees());
        userListComboBoxActionPerformed(evt);
    }//GEN-LAST:event_chooseEmployeeButtonActionPerformed

    private void managerListComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerListComboBoxActionPerformed
        int index = 0;
        String selectedValue = (String) userListComboBox.getSelectedItem();
        for(int i = 0; i<Administrator.allEmployees.size(); i++)
            if (Administrator.allEmployees.get(i).getUsername().equalsIgnoreCase(selectedValue))
            {
                index = i;
                break;
            }
        if (admin.allEmployees.get(index).getTeamPlacement().equalsIgnoreCase((String) managerListComboBox.getSelectedItem())) managerChangeHintLabel.setText("Current manager");
        else managerChangeHintLabel.setText("");
    }//GEN-LAST:event_managerListComboBoxActionPerformed

    private void backChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backChangeButtonActionPerformed
        nameChangeHintLabel.setText("");
        surnameChangeHintLabel.setText("");
        passwordChangeHintLabel.setText("");
        managerChangeHintLabel.setText("");
        hiddenConfirmChangePanel.setVisible(false);
                
        changeInputPanel.setVisible(false);
        chooseEmployeeButton.setVisible(true);
        chooseManagerButton.setVisible(true);
        chooseEmployeeButton.setEnabled(true);
        chooseManagerButton.setEnabled(true);
        noChangeEmployeeButtonActionPerformed(evt);
    }//GEN-LAST:event_backChangeButtonActionPerformed

    private void userListComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userListComboBox1ActionPerformed
        boolean canDelete = true;
        String selectedValue = (String) userListComboBox1.getSelectedItem();
        for (int i=0; i<admin.allEmployees.size(); i++)
            if (admin.allEmployees.get(i).getTeamPlacement().equalsIgnoreCase(selectedValue)) canDelete = false;
        
        if (canDelete == false)
        {
            deleteWarningLabel.setVisible(true);
            deleteButton.setVisible(false);
        }
        else
        {
            deleteWarningLabel.setVisible(false);
            deleteButton.setVisible(true);
        }   
    }//GEN-LAST:event_userListComboBox1ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        userListComboBox1.setEnabled(false);
        deleteButton.setVisible(false);
        backButton.setVisible(false);
        hiddenConfirmDeletePanel.setVisible(true);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        hiddenConfirmDeletePanel.setVisible(false);
        chooseUserInputPanel.setVisible(false);
        deleteEmployeeButton.setEnabled(true);
        deleteEmployeeButton.setVisible(true);
        deleteManagerButton.setEnabled(true);
        deleteManagerButton.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void yesDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesDeleteButtonActionPerformed
        String selectedValue = (String) userListComboBox1.getSelectedItem();
        if (deleteEmployeeButton.isVisible() == true) admin.removeEmployee(selectedValue); 
        else if (deleteManagerButton.isVisible() == true) admin.removeManager(selectedValue); 
        chooseUserInputPanel.setVisible(false);
        deleteAccountsLabel.setText("User " + selectedValue + " has been removed.");
        noDeleteButtonActionPerformed(evt);
        backButtonActionPerformed(evt);
        userListGenerateReport.setModel(employees());
    }//GEN-LAST:event_yesDeleteButtonActionPerformed

    private void noDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noDeleteButtonActionPerformed
        userListComboBox1.setEnabled(true);
        deleteButton.setVisible(true);
        backButton.setVisible(true);
        hiddenConfirmDeletePanel.setVisible(false);
    }//GEN-LAST:event_noDeleteButtonActionPerformed

    private void deleteManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteManagerButtonActionPerformed
        userListComboBox1.setModel(managers());
        deleteAccountsLabel.setText("Delete account");
        chooseUserInputPanel.setVisible(true);
        deleteEmployeeButton.setVisible(false);
        deleteManagerButton.setEnabled(false);
        userListComboBox1ActionPerformed(evt);
    }//GEN-LAST:event_deleteManagerButtonActionPerformed

    private void deleteEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeButtonActionPerformed
        userListComboBox1.setModel(employees());
        deleteAccountsLabel.setText("Delete account");
        chooseUserInputPanel.setVisible(true);
        deleteWarningLabel.setVisible(false);
        deleteEmployeeButton.setEnabled(false);
        deleteManagerButton.setVisible(false);
        
    }//GEN-LAST:event_deleteEmployeeButtonActionPerformed
    Administrator admin = new Administrator();
           
    public static void main() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdministratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addEmployeePanel;
    private javax.swing.JPanel addEmployeeWithHintsPanel;
    private javax.swing.JLabel addNewEmployeeHeader;
    private javax.swing.JPanel addNewPanel;
    private javax.swing.JLabel allGoodLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton backChangeButton;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel changeInputPanel;
    private javax.swing.JTextField changeNameField;
    private javax.swing.JTextField changePasswordField;
    private javax.swing.JLabel changePasswordLabel;
    private javax.swing.JTextField changeSurnameField;
    private javax.swing.JPanel changeWithHintsBackgroundPanel;
    private javax.swing.JPanel checkTimesheetsPanel;
    private javax.swing.JButton chooseEmployeeButton;
    private javax.swing.JButton chooseManagerButton;
    private javax.swing.JPanel chooseUserInputPanel;
    private javax.swing.JLabel chooseUsernameLabel;
    private javax.swing.JLabel chooseUsernameLabel1;
    private javax.swing.JLabel confirmDeletelabel;
    private javax.swing.JButton confirmLogOffButton;
    private javax.swing.JLabel confirmLogOffLabel;
    private javax.swing.JLabel confirmValidChangeEmployeeLabel;
    private javax.swing.JPanel deleteAccountPanel;
    private javax.swing.JLabel deleteAccountsLabel;
    private javax.swing.JPanel deleteActionPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteEmployeeButton;
    private javax.swing.JButton deleteManagerButton;
    private javax.swing.JLabel deleteWarningLabel;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel fullNameWelcomeText;
    private javax.swing.JButton generateReportsButton;
    private javax.swing.JPanel hiddenConfirmChangePanel;
    private javax.swing.JPanel hiddenConfirmDeletePanel;
    private javax.swing.JPanel hiddenConfirmPanel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JPanel logOffPanel;
    private javax.swing.JLabel manageAccountsLabel;
    private javax.swing.JPanel manageAccountsPanel;
    private javax.swing.JPanel manageActionPanel;
    private javax.swing.JLabel managerChangeHintLabel;
    private javax.swing.JComboBox<String> managerListComboBox;
    private javax.swing.JTabbedPane menuPanel;
    private javax.swing.JLabel nameChangeHintLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameHint;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel newManagerLabel;
    private javax.swing.JButton newUserButton;
    private javax.swing.JButton noButton;
    private javax.swing.JButton noChangeEmployeeButton;
    private javax.swing.JButton noDeleteButton;
    private javax.swing.JLabel passwordChangeHintLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordHint;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton submitChangeButton;
    private javax.swing.JLabel surnameChangeHintLabel;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel surnameHint;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JScrollPane timesheetScrollPanel;
    private javax.swing.JTextArea timesheetTextArea;
    private javax.swing.JComboBox<String> userListComboBox;
    private javax.swing.JComboBox<String> userListComboBox1;
    private javax.swing.JList<String> userListGenerateReport;
    private javax.swing.JScrollPane userListScrollPanel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameHint;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JButton yesButton;
    private javax.swing.JButton yesChangeEmployeeButton;
    private javax.swing.JButton yesDeleteButton;
    // End of variables declaration//GEN-END:variables
}
