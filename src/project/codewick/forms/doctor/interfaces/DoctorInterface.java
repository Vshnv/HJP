/*
 * Created by JFormDesigner on Tue Oct 22 00:28:52 IST 2019
 */

package project.codewick.forms.doctor.interfaces;

import project.codewick.forms.patient.interfaces.PatientInfo;
import project.codewick.forms.patient.interfaces.patient_info1;
import project.codewick.utils.SQL;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Vaishnav Anil Nair
 */
public class DoctorInterface extends JFrame {
    String[] colmns;
    private DoctorInterface() {
        initComponents();
    }
    static DoctorInterface instance;
    public static  DoctorInterface getInstance(){
        if(instance == null)instance = new DoctorInterface();
        return instance;
    }
    private void button1ActionPerformed(ActionEvent e) {
        PatientInfo p = PatientInfo.getInstance();
        p.setVisible(true);
        setVisible(false);
    }

    private void button3ActionPerformed(ActionEvent e) {
        Dutyroster r = Dutyroster.Instance;
        r.setVisible(true);
        setVisible(false);
    }

    private void initComponents() {
        Button btn =new Button();

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setTitle("Medical Practitioners interface");
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText("Patient Records");
        button1.addActionListener(e -> {
			button1ActionPerformed(e);
			button1ActionPerformed(e);
			button1ActionPerformed(e);
			button1ActionPerformed(e);
			button1ActionPerformed(e);
			button1ActionPerformed(e);
			button1ActionPerformed(e);
			button1ActionPerformed(e);
			button1ActionPerformed(e);
		});

        //---- button2 ----
        button2.setText("Appointments");

        //---- button3 ----
        button3.setText("Duty Roster");
        button3.addActionListener(e -> {
			button3ActionPerformed(e);
			button3ActionPerformed(e);
		});

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(28, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                        //SQL.utils.insertValue("your code here for displaying data of patient","patientInfo",colmns);
                    PatientInfo.getInstance().setVisible(true);
                    setVisible(false);
            }
        });

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
