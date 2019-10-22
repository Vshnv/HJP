/*
 * Created by JFormDesigner on Tue Oct 22 00:36:36 IST 2019
 */

package project.codewick.forms.patient.interfaces;

import project.codewick.forms.doctor.interfaces.DoctorInterface;
import project.codewick.utils.SQL;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Vaishnav Anil Nair
 */
public class PatientInterface extends JFrame {
    public PatientInterface() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Anfaas qureshi
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();

        //======== this ========
        setTitle("Patients Interface");
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText(" Appointments");

        //---- button2 ----
        button2.setText("History");

        //---- button3 ----
        button3.setText("Book Appointment");

        //---- button4 ----
        button4.setText("Doctors Info");

        //---- button5 ----
        button5.setText("Medical Notes");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(button3, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button4, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button5, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))
                    .addGap(12, 12, 12))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button3)
                    .addContainerGap(26, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
             //   SQL.utils.insertValue("your code here for displaying data of patient","patientInfo",colmns);
                PatientInfo patient_info= PatientInfo.getInstance();
                patient_info.setVisible(true);
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Anfaas qureshi
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
