/*
 * Created by JFormDesigner on Wed Oct 23 03:38:31 IST 2019
 */

package project.codewick.forms.patient.interfaces;

import java.awt.event.*;
import project.codewick.utils.SQL;

import java.beans.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Anfaas qureshi
 */
public class Bappnt extends JFrame {
    public Bappnt(String userID) {
        initComponents();
        this.userID = userID;
    }
    String userID;
    private void comboBox2PropertyChange(PropertyChangeEvent e) {
        SQL.utils.fillComboDoctors(comboBox1,"doctors");
    }

    private void button1MouseClicked(MouseEvent e) {
        String date = textField2.getText();
        int timing = 0;
        switch (((String)comboBox2.getSelectedItem()).toLowerCase()){
            case "morning":
                timing= 0;
                break;
            case "evening":
                timing = 1;
                break;
            case "night":
                timing = 2;
                break;

        }
        String named = String.valueOf(comboBox1.getSelectedItem());
        SQL.utils.insertValue("appointments",new String[]{userID,date, String.valueOf(timing),named});
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox<>();
        button1 = new JButton();
        label5 = new JLabel();
        textField2 = new JTextField();

        //======== this ========
        setTitle("BOOKING APPOINTMENT");
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Book your Appointment");

        //---- label2 ----
        label2.setText("Select Doctor");

        //---- label3 ----
        label3.setText("Select Timings");

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "- "
        }));

        //---- comboBox2 ----
        comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
            "Morning",
            "Evening",
            "Night"
        }));
        comboBox2.addPropertyChangeListener("selectedItem", e -> comboBox2PropertyChange(e));

        //---- button1 ----
        button1.setText("Confirm");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        //---- label5 ----
        label5.setText("Select Date");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label1)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label5)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label3)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(144, 144, 144)
                                    .addComponent(button1))
                                .addComponent(label2))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2))
                    .addGap(66, 66, 66)
                    .addComponent(button1)
                    .addGap(21, 21, 21))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JButton button1;
    private JLabel label5;
    private JTextField textField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
