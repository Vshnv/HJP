/*
 * Created by JFormDesigner on Wed Oct 23 03:15:09 IST 2019
 */

package project.codewick.forms.patient.interfaces;

import java.beans.*;
import project.codewick.utils.SQL;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Vaishnav Anil Nair
 */
public class DoctorInfo extends JFrame {
    public DoctorInfo() {
        initComponents();
    }

    private void thisWindowGainedFocus(WindowEvent e) {
        SQL.utils.fillComboDoctors(comboBox1,"doctors");
    }

    private void comboBox1PropertyChange(PropertyChangeEvent e) {
        String s = (String) comboBox1.getSelectedItem();
        String name =  s;
        String sp = SQL.utils.getDoctorSpecialization(s);
        label4.setText(name);label5.setText(sp);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
        label1 = new JLabel();
        comboBox1 = new JComboBox();
        label2 = new JLabel();
        label3 = new JLabel();
        button1 = new JButton();
        label4 = new JLabel();
        label5 = new JLabel();

        //======== this ========
        setTitle("Doctors info");
        addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                thisWindowGainedFocus(e);
            }
        });
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Select Doctor :");

        //---- comboBox1 ----
        comboBox1.addPropertyChangeListener("selectedItem", e -> comboBox1PropertyChange(e));

        //---- label2 ----
        label2.setText("Name :");

        //---- label3 ----
        label3.setText("Specializations :");

        //---- button1 ----
        button1.setText("Check Duty Roster");

        //---- label4 ----
        label4.setText("-");

        //---- label5 ----
        label5.setText("-");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(comboBox1, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(label2)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label4))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label3)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label5))
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 8, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(label4))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(label3)
                        .addComponent(label5))
                    .addGap(18, 18, 18)
                    .addComponent(button1)
                    .addContainerGap(33, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
    private JLabel label1;
    private JComboBox comboBox1;
    private JLabel label2;
    private JLabel label3;
    private JButton button1;
    private JLabel label4;
    private JLabel label5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
