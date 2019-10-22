/*
 * Created by JFormDesigner on Mon Oct 21 23:15:31 IST 2019
 */

package project.codewick.forms;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Vaishnav Anil Nair
 */
public class MainScreen extends JFrame {
    public MainScreen() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
        button1 = new JButton();
        button2 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button13 = new JButton();
        button14 = new JButton();

        //======== this ========
        setTitle("Login Selection");
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setText("New patient");

        //---- button2 ----
        button2.setText("Existing patient");

        //---- button9 ----
        button9.setText("Admin Login");

        //---- button10 ----
        button10.setText("Doctor's Login");

        //---- button13 ----
        button13.setText("Exit");

        //---- button14 ----
        button14.setText("Staff Login");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(button10, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button14, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(button9, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button13, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button10, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button13, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button14, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button9, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(31, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
    private JButton button1;
    private JButton button2;
    private JButton button9;
    private JButton button10;
    private JButton button13;
    private JButton button14;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
