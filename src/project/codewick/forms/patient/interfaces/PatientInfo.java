/*
 * Created by JFormDesigner on Wed Oct 23 02:11:39 IST 2019
 */

package project.codewick.forms.patient.interfaces;

import java.beans.*;
import project.codewick.forms.MainScreen;
import project.codewick.forms.doctor.interfaces.DoctorInterface;
import project.codewick.utils.SQL;

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

    private void thisWindowGainedFocus(WindowEvent e) {
        SQL.utils.addPatientCombo(comboBox1);
    }

    private void comboBox1PropertyChange(PropertyChangeEvent e) {
        String name = String.valueOf(comboBox1.getSelectedItem());
        String[] data = SQL.utils.getPatientData(name);
        label17.setText(data[0]);
        label18.setText(data[1]);
        label19.setText(data[2]);
        label20.setText(data[3]);
        label21.setText(data[4]);
        label22.setText(data[5]);
        label23.setText(data[6]);
        label24.setText(data[7]);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
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
        addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                thisWindowGainedFocus(e);
            }
        });
        var contentPane = getContentPane();

        //---- label9 ----
        label9.setText("User ID");

        //---- comboBox1 ----
        comboBox1.addPropertyChangeListener("selectedItem", e -> comboBox1PropertyChange(e));

        //---- label17 ----
        label17.setText("-");

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
        label18.setText("-");

        //---- label19 ----
        label19.setText("--");

        //---- label20 ----
        label20.setText("--");

        //---- label21 ----
        label21.setText("-");

        //---- label22 ----
        label22.setText("-");

        //---- label23 ----
        label23.setText("-");

        //---- label24 ----
        label24.setText("-");

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
                                .addGap(93, 93, 93)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addComponent(label1)
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addComponent(label3)
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
                                .addComponent(toggleButton1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(64, 64, 64)
                                .addComponent(label21, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(label9))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label18, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label17, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label19, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label20, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(164, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(label1)
                        .addGap(18, 18, 18)
                        .addComponent(label2)
                        .addGap(18, 18, 18)
                        .addComponent(label3)
                        .addGap(18, 18, 18)
                        .addComponent(label4)
                        .addGap(18, 18, 18)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addComponent(label21)
                            .addComponent(label5))
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
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(label9)
                    .addGap(31, 31, 31)
                    .addComponent(label17)
                    .addGap(18, 18, 18)
                    .addComponent(label18)
                    .addGap(18, 18, 18)
                    .addComponent(label19)
                    .addGap(18, 18, 18)
                    .addComponent(label20)
                    .addContainerGap(232, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
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
