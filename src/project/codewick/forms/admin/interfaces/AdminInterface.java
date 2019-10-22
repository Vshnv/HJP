/*
 * Created by JFormDesigner on Tue Oct 22 01:00:11 IST 2019
 */

package project.codewick.forms.admin.interfaces;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Vaishnav Anil Nair
 */
public class AdminInterface extends JFrame {
    public AdminInterface() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
        this2 = new JFrame();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this2 ========
        {
            this2.setTitle("Administrator's Interface");
            Container this2ContentPane = this2.getContentPane();

            //---- button1 ----
            button1.setText("Doctor Records");

            //---- button2 ----
            button2.setText("Patient Records");

            //---- button3 ----
            button3.setText("Table View");

            GroupLayout this2ContentPaneLayout = new GroupLayout(this2ContentPane);
            this2ContentPane.setLayout(this2ContentPaneLayout);
            this2ContentPaneLayout.setHorizontalGroup(
                this2ContentPaneLayout.createParallelGroup()
                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            this2ContentPaneLayout.setVerticalGroup(
                this2ContentPaneLayout.createParallelGroup()
                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(17, Short.MAX_VALUE))
            );
            this2.pack();
            this2.setLocationRelativeTo(this2.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
    private JFrame this2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
