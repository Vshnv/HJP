/*
 * Created by JFormDesigner on Mon Oct 21 23:57:25 IST 2019
 */

package project.codewick.forms.patient;

import project.codewick.utils.SQL;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Vaishnav Anil Nair
 */
public class ExistingPatientLogin extends JFrame {
    public ExistingPatientLogin() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        String user = textField1.getText();
        if(!SQL.utils.containsUser(user,"patientlogin")){
            label3.setText("Could not find user :: " + user);
            return;
        }
        String password = String.valueOf(passwordField1.getPassword());
        if(SQL.utils.passwordMatches(user,password,"patientlogin")){
            label3.setText("Password matched");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        passwordField1 = new JPasswordField();
        label3 = new JLabel();

        //======== this ========
        setTitle("Patient Login");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("User ID");

        //---- label2 ----
        label2.setText("Password");

        //---- button1 ----
        button1.setText("Login");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        //---- button2 ----
        button2.setText("Back");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(button1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button2))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label2)
                                .addComponent(label1))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textField1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                .addComponent(passwordField1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                .addComponent(label3, GroupLayout.Alignment.LEADING))))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(label3)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1))
                    .addGap(32, 32, 32)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button2)
                        .addComponent(button1))
                    .addContainerGap(26, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JPasswordField passwordField1;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
