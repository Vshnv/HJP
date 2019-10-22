/*
 * Created by JFormDesigner on Wed Oct 23 03:38:31 IST 2019
 */

package project.codewick.forms.patient.interfaces;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Anfaas qureshi
 */
public class Bappnt extends JFrame {
    public Bappnt() {
        initComponents();
    }
    public static

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Anfaas qureshi
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        comboBox1 = new JComboBox();
        comboBox2 = new JComboBox();
        button1 = new JButton();
        label4 = new JLabel();
        textField1 = new JTextField();

        //======== this ========
        setTitle("BOOKING APPOINTMENT");
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Book your Appointment");

        //---- label2 ----
        label2.setText("Select Doctor");

        //---- label3 ----
        label3.setText("Select Timings");

        //---- button1 ----
        button1.setText("Confirm");

        //---- label4 ----
        label4.setText("Select Date");

        //---- textField1 ----
        textField1.setText("Enter Date");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label1)
                            .addContainerGap(243, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                    .addGap(144, 144, 144)
                                    .addComponent(button1)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                    .addComponent(label2)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label3)
                                        .addComponent(label4))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                            .addGap(22, 22, 22))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(46, 46, 46)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(50, 50, 50)
                    .addComponent(button1)
                    .addGap(32, 32, 32))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Anfaas qureshi
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton button1;
    private JLabel label4;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
