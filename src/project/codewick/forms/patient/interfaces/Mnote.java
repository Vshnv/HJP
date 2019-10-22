/*
 * Created by JFormDesigner on Wed Oct 23 03:44:14 IST 2019
 */

package project.codewick.forms.patient.interfaces;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Anfaas qureshi
 */
public class Mnote extends JFrame {
    public Mnote() {
        initComponents();
    }

    private void toggleButton1ActionPerformed(ActionEvent e) {
        setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Anfaas qureshi
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        toggleButton1 = new JToggleButton();

        //======== this ========
        setTitle("MEDICAL NOTES");
        var contentPane = getContentPane();

        //---- label2 ----
        label2.setText("Doctors Prescription");

        //---- toggleButton1 ----
        toggleButton1.setText("Close");
        toggleButton1.addActionListener(e -> toggleButton1ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(toggleButton1)
                            .addGap(143, 143, 143)
                            .addComponent(label1))
                        .addComponent(label2))
                    .addContainerGap(3, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label2)
                    .addGap(29, 29, 29)
                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)
                    .addComponent(toggleButton1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label1)
                    .addContainerGap(12, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Anfaas qureshi
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JToggleButton toggleButton1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
