package com.mycompany.timedeclaration;

public class LoginGUI extends javax.swing.JFrame {
    public int thisIndex;
    public LoginGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginGuiBackgroundPanel = new javax.swing.JPanel();
        loginGuiBorderPanel = new javax.swing.JPanel();
        loginGuiLayoutPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        logInInputPanel = new javax.swing.JPanel();
        userTypeLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userTypeComboBox = new javax.swing.JComboBox<>();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        logInButton = new javax.swing.JButton();
        logInInfoLabel = new javax.swing.JLabel();
        createdByLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Time Declaration");
        setBackground(new java.awt.Color(25, 25, 25));
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));

        loginGuiBackgroundPanel.setBackground(new java.awt.Color(25, 25, 25));
        loginGuiBackgroundPanel.setPreferredSize(new java.awt.Dimension(900, 500));

        loginGuiBorderPanel.setBackground(new java.awt.Color(25, 25, 25));
        loginGuiBorderPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginGuiBorderPanel.setPreferredSize(new java.awt.Dimension(540, 340));

        loginGuiLayoutPanel.setBackground(new java.awt.Color(25, 25, 25));
        loginGuiLayoutPanel.setForeground(new java.awt.Color(204, 204, 204));
        loginGuiLayoutPanel.setPreferredSize(new java.awt.Dimension(500, 300));

        welcomeLabel.setBackground(new java.awt.Color(25, 25, 25));
        welcomeLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(204, 204, 204));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome to Time Declaration");

        logInInputPanel.setBackground(new java.awt.Color(25, 25, 25));

        userTypeLabel.setBackground(new java.awt.Color(25, 25, 25));
        userTypeLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        userTypeLabel.setForeground(new java.awt.Color(204, 204, 204));
        userTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userTypeLabel.setText("User type");
        userTypeLabel.setPreferredSize(new java.awt.Dimension(100, 20));

        usernameLabel.setBackground(new java.awt.Color(25, 25, 25));
        usernameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(204, 204, 204));
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usernameLabel.setText("Username");
        usernameLabel.setPreferredSize(new java.awt.Dimension(100, 20));

        passwordLabel.setBackground(new java.awt.Color(25, 25, 25));
        passwordLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(204, 204, 204));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordLabel.setText("Password");

        userTypeComboBox.setBackground(new java.awt.Color(25, 25, 25));
        userTypeComboBox.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        userTypeComboBox.setForeground(new java.awt.Color(204, 204, 204));
        userTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Manager", "Administrator" }));
        userTypeComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        userTypeComboBox.setMinimumSize(new java.awt.Dimension(100, 25));
        userTypeComboBox.setPreferredSize(new java.awt.Dimension(200, 25));

        usernameTextField.setBackground(new java.awt.Color(25, 25, 25));
        usernameTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(204, 204, 204));
        usernameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        usernameTextField.setCaretColor(new java.awt.Color(204, 204, 204));
        usernameTextField.setPreferredSize(new java.awt.Dimension(64, 20));

        passwordTextField.setBackground(new java.awt.Color(25, 25, 25));
        passwordTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(204, 204, 204));
        passwordTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        passwordTextField.setCaretColor(new java.awt.Color(204, 204, 204));
        passwordTextField.setPreferredSize(new java.awt.Dimension(64, 20));

        javax.swing.GroupLayout logInInputPanelLayout = new javax.swing.GroupLayout(logInInputPanel);
        logInInputPanel.setLayout(logInInputPanelLayout);
        logInInputPanelLayout.setHorizontalGroup(
            logInInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logInInputPanelLayout.createSequentialGroup()
                .addGroup(logInInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(logInInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userTypeComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        logInInputPanelLayout.setVerticalGroup(
            logInInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logInInputPanelLayout.createSequentialGroup()
                .addGroup(logInInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userTypeComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(logInInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(logInInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userTypeComboBox.getAccessibleContext().setAccessibleName("");

        logInButton.setBackground(new java.awt.Color(25, 25, 25));
        logInButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        logInButton.setForeground(new java.awt.Color(204, 204, 204));
        logInButton.setText("log in");
        logInButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        logInButton.setContentAreaFilled(false);
        logInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        logInInfoLabel.setBackground(new java.awt.Color(25, 25, 25));
        logInInfoLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        logInInfoLabel.setForeground(new java.awt.Color(153, 153, 153));
        logInInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logInInfoLabel.setText(" ");
        logInInfoLabel.setMaximumSize(new java.awt.Dimension(500, 20));
        logInInfoLabel.setMinimumSize(new java.awt.Dimension(500, 20));
        logInInfoLabel.setPreferredSize(new java.awt.Dimension(500, 20));

        createdByLabel.setBackground(new java.awt.Color(25, 25, 25));
        createdByLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        createdByLabel.setForeground(new java.awt.Color(51, 51, 51));
        createdByLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createdByLabel.setText("created by Anita Szukłow and Anna Piecha");
        createdByLabel.setMaximumSize(new java.awt.Dimension(250, 20));
        createdByLabel.setMinimumSize(new java.awt.Dimension(250, 20));
        createdByLabel.setPreferredSize(new java.awt.Dimension(250, 20));

        javax.swing.GroupLayout loginGuiLayoutPanelLayout = new javax.swing.GroupLayout(loginGuiLayoutPanel);
        loginGuiLayoutPanel.setLayout(loginGuiLayoutPanelLayout);
        loginGuiLayoutPanelLayout.setHorizontalGroup(
            loginGuiLayoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginGuiLayoutPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(loginGuiLayoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logInInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logInInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginGuiLayoutPanelLayout.createSequentialGroup()
                .addComponent(createdByLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginGuiLayoutPanelLayout.createSequentialGroup()
                .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginGuiLayoutPanelLayout.setVerticalGroup(
            loginGuiLayoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginGuiLayoutPanelLayout.createSequentialGroup()
                .addComponent(welcomeLabel)
                .addGap(40, 40, 40)
                .addComponent(logInInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logInInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createdByLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout loginGuiBorderPanelLayout = new javax.swing.GroupLayout(loginGuiBorderPanel);
        loginGuiBorderPanel.setLayout(loginGuiBorderPanelLayout);
        loginGuiBorderPanelLayout.setHorizontalGroup(
            loginGuiBorderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginGuiBorderPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(loginGuiLayoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        loginGuiBorderPanelLayout.setVerticalGroup(
            loginGuiBorderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginGuiBorderPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(loginGuiLayoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout loginGuiBackgroundPanelLayout = new javax.swing.GroupLayout(loginGuiBackgroundPanel);
        loginGuiBackgroundPanel.setLayout(loginGuiBackgroundPanelLayout);
        loginGuiBackgroundPanelLayout.setHorizontalGroup(
            loginGuiBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginGuiBackgroundPanelLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(loginGuiBorderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addGap(180, 180, 180))
        );
        loginGuiBackgroundPanelLayout.setVerticalGroup(
            loginGuiBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginGuiBackgroundPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(loginGuiBorderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 342, Short.MAX_VALUE)
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginGuiBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginGuiBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        logInInfoLabel.setText(" ");
        int userTypeTry = userTypeComboBox.getSelectedIndex();
        String usernameTry = usernameTextField.getText();
        char[] passwordTry1 = passwordTextField.getPassword();
        String passwordTry = new String(passwordTry1);
        switch(userTypeTry)
        {
            case 0: // pierwsza pozycja w menu rozwijanym Employee
            {
                for (Employee e : User.allEmployees)
                {
                    if(usernameTry.equals(e.getUsername())) // tu dorzucić w tym ifie password try
                    {
                        thisIndex = User.allEmployees.indexOf(e);
                        if (passwordTry.equals(User.allEmployees.get(thisIndex).getPassword()))
                        {
                            EmployeeGUI.main(User.allEmployees.get(thisIndex));
                            this.dispose();
                            break;

                        }
                        else { logInInfoLabel.setText(User.allEmployees.get(thisIndex).getName() + ", you entered wrong password"); }
                    }
                }
                if (logInInfoLabel.getText().equals(" ")) logInInfoLabel.setText("Incorrect username and/or password");
            } break;
            case 1: // Manager w menu
            {
                for (Manager e : User.allManagers)
                {
                    if(usernameTry.equals(e.getUsername())) 
                    {
                        thisIndex = User.allManagers.indexOf(e);
                        if (passwordTry.equals(User.allManagers.get(thisIndex).getPassword()))
                        {
                            ManagerGUI.main(User.allManagers.get(thisIndex));
                            this.dispose();
                            break;
                        } else { logInInfoLabel.setText(User.allManagers.get(thisIndex).getName() + ", you entered wrong password"); }
                    }
                }
                if (logInInfoLabel.getText().equals(" ")) logInInfoLabel.setText("Incorrect username and/or password");
            } break;
            case 2:
            {
                if(usernameTry.equals("admin") && (passwordTry.equals("admin123")))
                {
                    AdministratorGUI.main();
                    this.dispose();
                    break;
                }
            }
        }
    }//GEN-LAST:event_logInButtonActionPerformed

    public static void main() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createdByLabel;
    private javax.swing.JButton logInButton;
    private javax.swing.JLabel logInInfoLabel;
    private javax.swing.JPanel logInInputPanel;
    private javax.swing.JPanel loginGuiBackgroundPanel;
    private javax.swing.JPanel loginGuiBorderPanel;
    private javax.swing.JPanel loginGuiLayoutPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JComboBox<String> userTypeComboBox;
    private javax.swing.JLabel userTypeLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
