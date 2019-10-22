/*
 * Created by JFormDesigner on Tue Oct 22 23:57:38 IST 2019
 */

package project.codewick.forms.patient.interfaces;

import java.awt.event.*;

import project.codewick.forms.MainScreen;
import project.codewick.forms.patient.NewPatientform;
import project.codewick.utils.SQL;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author Anfaas qureshi
 */
public class patient_info1 extends JFrame {
    private patient_info1() {
        initComponents();
    }
    static patient_info1 instance;
    public static  patient_info1 getInstance(){
        if(instance == null)instance = new patient_info1();
        return instance;
    }
    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void toggleButton1ActionPerformed(ActionEvent e) {
       // patient_info1 p= new patient_info1();
       // p.setVisible(false);
       setVisible(false);
       MainScreen m =  MainScreen.getInstance();
      m.setVisible(true);



    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
        ResourceBundle bundle = ResourceBundle.getBundle("project.codewick.forms.patient.interfaces.patient");
        this2 = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label17 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        label20 = new JLabel();
        label21 = new JLabel();
        label22 = new JLabel();
        label23 = new JLabel();
        label24 = new JLabel();
        comboBox1 = new JComboBox();
        toggleButton1 = new JToggleButton();

        //======== this2 ========
        {
            this2.setTitle(bundle.getString("this2.title"));
            var this2ContentPane = this2.getContentPane();

            //---- label1 ----
            label1.setText(bundle.getString("label1.text"));

            //---- label2 ----
            label2.setText(bundle.getString("label2.text"));

            //---- label3 ----
            label3.setText(bundle.getString("label3.text"));

            //---- label4 ----
            label4.setText(bundle.getString("label4.text"));

            //---- label5 ----
            label5.setText(bundle.getString("label5.text"));

            //---- label6 ----
            label6.setText(bundle.getString("label6.text"));

            //---- label7 ----
            label7.setText(bundle.getString("label7.text"));

            //---- label8 ----
            label8.setText(bundle.getString("label8.text"));

            //---- label9 ----
            label9.setText(bundle.getString("label9.text"));

            //---- label17 ----
            label17.setText(bundle.getString("label17.text"));

            //---- label18 ----
            label18.setText(bundle.getString("label18.text"));

            //---- label19 ----
            label19.setText(bundle.getString("label19.text"));

            //---- label20 ----
            label20.setText(bundle.getString("label20.text"));

            //---- label21 ----
            label21.setText(bundle.getString("label21.text"));

            //---- label22 ----
            label22.setText(bundle.getString("label22.text"));

            //---- label23 ----
            label23.setText(bundle.getString("label23.text"));

            //---- label24 ----
            label24.setText(bundle.getString("label24.text"));

            //---- toggleButton1 ----
            toggleButton1.setText(bundle.getString("toggleButton1.text"));
            toggleButton1.addActionListener(e -> {
			toggleButton1ActionPerformed(e);
			toggleButton1ActionPerformed(e);
			toggleButton1ActionPerformed(e);
			toggleButton1ActionPerformed(e);
		});

            GroupLayout this2ContentPaneLayout = new GroupLayout(this2ContentPane);
            this2ContentPane.setLayout(this2ContentPaneLayout);
            this2ContentPaneLayout.setHorizontalGroup(
                this2ContentPaneLayout.createParallelGroup()
                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                .addGap(0, 38, Short.MAX_VALUE)
                                .addComponent(label9)
                                .addGap(18, 18, 18)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(209, 209, 209))
                            .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                .addGroup(this2ContentPaneLayout.createParallelGroup()
                                    .addComponent(label3)
                                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label6)
                                            .addComponent(label4)
                                            .addComponent(label7)
                                            .addComponent(label8)))
                                    .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label1, GroupLayout.Alignment.LEADING)))
                                .addGap(18, 18, 18)
                                .addGroup(this2ContentPaneLayout.createParallelGroup()
                                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                                            .addComponent(label23, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                            .addComponent(label24, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label22, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label21, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                                        .addGap(18, 18, 18))
                                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(label20, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(label19, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(label18, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(label17, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                        .addContainerGap(129, Short.MAX_VALUE))))))
                    .addGroup(GroupLayout.Alignment.TRAILING, this2ContentPaneLayout.createSequentialGroup()
                        .addContainerGap(167, Short.MAX_VALUE)
                        .addComponent(toggleButton1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))
            );
            this2ContentPaneLayout.setVerticalGroup(
                this2ContentPaneLayout.createParallelGroup()
                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label9)
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(label17))
                        .addGap(18, 18, 18)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(label18))
                        .addGap(18, 18, 18)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(label19))
                        .addGap(18, 18, 18)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(label20))
                        .addGap(18, 18, 18)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(label21))
                        .addGap(18, 18, 18)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label6)
                            .addComponent(label22))
                        .addGap(18, 18, 18)
                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                            .addComponent(label7)
                            .addComponent(label23, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label8)
                            .addComponent(label24))
                        .addGap(47, 47, 47)
                        .addComponent(toggleButton1)
                        .addContainerGap(149, Short.MAX_VALUE))
            );
            this2.pack();
            this2.setLocationRelativeTo(this2.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
    private JFrame this2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;
    private JLabel label21;
    private JLabel label22;
    private JLabel label23;
    private JLabel label24;
    private JComboBox comboBox1;
    private JToggleButton toggleButton1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
