package com.fcih.swing.hotel.ui.login;

import com.fcih.swing.hotel.controller.LoginController;
import com.fcih.swing.hotel.factory.ControllerFactory;
import com.fcih.swing.hotel.ui.Drawable;
import com.fcih.swing.hotel.ui.admin.AdminUI;
import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.FontUIResource;

public final class LoginUI extends JFrame implements Drawable {

    PlaceHolder holder;
    private JLabel codeIconLabel;
    private JTextField codeTextField;
    private JPanel containerPanel;
    private JLabel dukeWelcomeLabel;
    private JSeparator leftRightPanelSeparator;
    private JButton loginButton;
    private JPasswordField passwordField;
    private JLabel passwordIconLabel;
    private JPanel registrationPanel;
    private LoginController loginController;

    public LoginUI() {
        initComponents();
        draw();
    }

    @Override
    public void initComponents() {

        containerPanel = new JPanel();
        dukeWelcomeLabel = new JLabel();
        leftRightPanelSeparator = new JSeparator();
        registrationPanel = new JPanel();
        codeTextField = new JTextField();
        codeIconLabel = new JLabel();
        passwordIconLabel = new JLabel();
        loginButton = new JButton();
        passwordField = new JPasswordField();

        holder = new PlaceHolder(codeTextField, Color.GRAY, Color.BLACK, "Please Enter Your Code", true, "Tahoma", 20);
        holder = new PlaceHolder(passwordField, Color.GRAY, Color.BLACK, "Please Enter Your Password", true, "Tahoma", 20);

        loginController = ControllerFactory.getLoginController();
    }

    @Override
    public void draw() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(1092, 529));
        setLocationRelativeTo(null);

        prepareComponent();

        GroupLayout registrationPanelLayout = new GroupLayout(registrationPanel);
        registrationPanel.setLayout(registrationPanelLayout);
        registrationPanelLayout.setHorizontalGroup(
                registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(codeIconLabel, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordIconLabel, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(codeTextField, GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                                .addComponent(passwordField))
                        .addGap(0, 20, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, registrationPanelLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
        );
        registrationPanelLayout.setVerticalGroup(
                registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(codeIconLabel, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                .addComponent(codeTextField, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordIconLabel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordField))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
        );
        

        GroupLayout containerPanelLayout = new GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
                containerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(containerPanelLayout.createSequentialGroup()
                        .addComponent(dukeWelcomeLabel)
                        .addGap(20, 20, 20)
                        .addComponent(leftRightPanelSeparator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(registrationPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
        );
        containerPanelLayout.setVerticalGroup(
                containerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(dukeWelcomeLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addComponent(leftRightPanelSeparator, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                .addComponent(registrationPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(containerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(containerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void prepareComponent() {
        prepareContainerPanelComponent();

        prepareLogoLabelComponent();

        prepareLeftRightPanelSeparatorComponent();

        prepareRightPanelComponent();
    }

    private void prepareContainerPanelComponent() {
        containerPanel.setBackground(new Color(255, 255, 255));
    }

    private void prepareLogoLabelComponent() {
        dukeWelcomeLabel.setBackground(new Color(255, 255, 255));
        dukeWelcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        dukeWelcomeLabel.setIcon(new ImageIcon(getClass().getResource("/resources/imgs/0.png")));
    }

    private void prepareLeftRightPanelSeparatorComponent() {
        leftRightPanelSeparator.setBackground(new Color(102, 102, 102));
        leftRightPanelSeparator.setForeground(new Color(102, 102, 102));
        leftRightPanelSeparator.setOrientation(SwingConstants.VERTICAL);
        leftRightPanelSeparator.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED), BorderFactory.createBevelBorder(BevelBorder.RAISED)));
    }

    private void prepareRightPanelComponent() {
        registrationPanel.setBackground(new Color(255, 255, 255));

        codeTextField.setBackground(new Color(245, 245, 245));
        codeTextField.setFont(new Font("Tahoma", 1, 18));
        codeTextField.setHorizontalAlignment(JTextField.CENTER);
        codeTextField.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED), BorderFactory.createBevelBorder(BevelBorder.LOWERED, new Color(245, 245, 245), new Color(245, 245, 245), new Color(245, 245, 245), new Color(245, 245, 245))), BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(245, 245, 245), new Color(245, 245, 245), new Color(245, 245, 245), new Color(245, 245, 245)), BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(245, 245, 245), new Color(245, 245, 245), new Color(245, 245, 245), new Color(245, 245, 245)))));

        codeIconLabel.setIcon(new ImageIcon(getClass().getResource("/resources/imgs/Username.jpg")));

        passwordIconLabel.setIcon(new ImageIcon(getClass().getResource("/resources/imgs/Passwod.png")));

        loginButton.setIcon(new ImageIcon(getClass().getResource("/resources/imgs/Login.png")));
        loginButton.setBorder(null);
        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        passwordField.setBackground(new Color(245, 245, 245));
        passwordField.setFont(new Font("Tahoma", 1, 18));
        passwordField.setHorizontalAlignment(JTextField.CENTER);
    }

    private void loginButtonActionPerformed(ActionEvent evt) {
        if (loginController.login(this.codeTextField.getText(), new String(this.passwordField.getPassword()))) {
            this.setVisible(false);
            AdminUI.run();
        } else {
            displayErrorDialog();
        }
    }

    private void displayErrorDialog() {
        JLabel label = new JLabel("Code or password is incorrect !!!");
        label.setFont(new Font("Tahoma", Font.BOLD, 18));
        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 18)));
        UIManager.put("OptionPane.okButtonText", "Return to login page");
        JOptionPane.showMessageDialog(this, label, "Error Message", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String args[]) {
        LoginUI lf = new LoginUI();
        lf.setVisible(true);
        try {
            int i = 0;
            while (true) {
                Thread.sleep(2000);
                lf.dukeWelcomeLabel.setIcon(new ImageIcon(lf.getClass().getResource("/resources/imgs/" + i + ".png")));
                i = (i + 1) % 7;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
