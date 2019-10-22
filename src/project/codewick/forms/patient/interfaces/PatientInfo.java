/*
 * Created by JFormDesigner on Wed Oct 23 02:11:39 IST 2019
 */

package project.codewick.forms.patient.interfaces;

import project.codewick.forms.MainScreen;
import project.codewick.forms.doctor.interfaces.DoctorInterface;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Anfaas qureshi
 */
public class PatientInfo extends JFrame {
    private PatientInfo() {
        initComponents();
    }
    static PatientInfo instance;
    public static PatientInfo getInstance(){
        if(instance == null)instance = new PatientInfo();
        return instance;
    }
    private void toggleButton1ActionPerformed(ActionEvent e) {

    }

    private void toggleButton1MouseClicked(MouseEvent e) {
        setVisible(false);
        DoctorInterface d =  DoctorInterface.getInstance();
        d.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Anfaas qureshi
        label9 = new JLabel();
        comboBox1 = new JComboBox();
        label17 = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        label20 = new JLabel();
        label21 = new JLabel();
        label22 = new JLabel();
        label23 = new JLabel();
        label24 = new JLabel();
        toggleButton1 = new JToggleButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label9 ----
        label9.setText("User ID");

        //---- label17 ----
        label17.setText("text");

        //---- label1 ----
        label1.setText("Name");

        //---- label2 ----
        label2.setText("Age");

        //---- label3 ----
        label3.setText("Sex");

        //---- label4 ----
        label4.setText("Nationality");

        //---- label5 ----
        label5.setText("DOB");

        //---- label6 ----
        label6.setText("Phone no.");

        //---- label7 ----
        label7.setText("Email Address");

        //---- label8 ----
        label8.setText("Locality Address");

        //---- label18 ----
        label18.setText("text");

        //---- label19 ----
        label19.setText("text");

        //---- label20 ----
        label20.setText("text");

        //---- label21 ----
        label21.setText("text");

        //---- label22 ----
        label22.setText("text");

        //---- label23 ----
        label23.setText("text");

        //---- label24 ----
        label24.setText("text");

        //---- toggleButton1 ----
        toggleButton1.setText("BACK");
        toggleButton1.addActionListener(e -> {
			toggleButton1ActionPerformed(e);
			toggleButton1ActionPerformed(e);
			toggleButton1ActionPerformed(e);
			toggleButton1ActionPerformed(e);
		});
        toggleButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                toggleButton1MouseClicked(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(label9)
                                .addGap(18, 18, 18)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(label1)
                                .addGap(89, 89, 89)
                                .addComponent(label17, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(label18, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(label3)
                                .addGap(103, 103, 103)
                                .addComponent(label19, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(label4)
                                .addGap(53, 53, 53)
                                .addComponent(label20, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(label21, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(label6)
                                .addGap(60, 60, 60)
                                .addComponent(label22, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(label7)
                                .addGap(33, 33, 33)
                                .addComponent(label23, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(label8)
                                .addGap(18, 18, 18)
                                .addComponent(label24, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(toggleButton1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 458, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(label9))
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addComponent(label1)
                            .addComponent(label17))
                        .addGap(18, 18, 18)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addComponent(label2)
                            .addComponent(label18))
                        .addGap(18, 18, 18)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addComponent(label3)
                            .addComponent(label19))
                        .addGap(18, 18, 18)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addComponent(label4)
                            .addComponent(label20))
                        .addGap(18, 18, 18)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addComponent(label5)
                            .addComponent(label21))
                        .addGap(18, 18, 18)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addComponent(label6)
                            .addComponent(label22))
                        .addGap(18, 18, 18)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addComponent(label7)
                            .addComponent(label23))
                        .addGap(12, 12, 12)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addComponent(label8)
                            .addComponent(label24))
                        .addGap(41, 41, 41)
                        .addComponent(toggleButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 441, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Anfaas qureshi
    private JLabel label9;
    private JComboBox comboBox1;
    private JLabel label17;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;
    private JLabel label21;
    private JLabel label22;
    private JLabel label23;
    private JLabel label24;
    private JToggleButton toggleButton1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
