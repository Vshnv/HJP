/*
 * Created by JFormDesigner on Tue Oct 22 00:28:52 IST 2019
 */

package project.codewick.forms.doctor.interfaces;

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
        patient_info1 p =patient_info1.getInstance();
        p.setVisible(true);
        setVisible(false);
    }

    private void initComponents() {
        Button btn =new Button();

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Anfaas qureshi
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        test = new JTextField();

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

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
                        .addComponent(test, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(144, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                    .addGap(56, 56, 56)
                    .addComponent(test, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                        //SQL.utils.insertValue("your code here for displaying data of patient","patientInfo",colmns);
                    patient_info1.getInstance().setVisible(true);
                    setVisible(false);
            }
        });
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                test.setText("Welcome  Javatpoint.");
            }
        });
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                test.setText("Welcome to .");
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Anfaas qureshi
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JTextField test;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
