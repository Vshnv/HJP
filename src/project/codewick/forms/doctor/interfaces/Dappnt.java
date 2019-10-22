/*
 * Created by JFormDesigner on Wed Oct 23 03:26:28 IST 2019
 */

package project.codewick.forms.doctor.interfaces;

import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;

/**
 * @author Anfaas qureshi
 */
public class Dappnt extends JFrame {
    public Dappnt() {
        initComponents();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Anfaas qureshi
        ResourceBundle bundle = ResourceBundle.getBundle("project.codewick.forms.patient.interfaces.patient");
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setTitle(bundle.getString("this.title_2"));
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText(bundle.getString("label1.text_3"));

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null},
                    {null, null},
                    {null, null},
                },
                new String[] {
                    "Date", "Presence"
                }
            ));
            scrollPane1.setViewportView(table1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE))
                    .addGap(124, 124, 124))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Anfaas qureshi
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
