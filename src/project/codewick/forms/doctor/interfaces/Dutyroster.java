/*
 * Created by JFormDesigner on Wed Oct 23 02:49:00 IST 2019
 */

package project.codewick.forms.doctor.interfaces;

import project.codewick.utils.SQL;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Anfaas qureshi
 */
public class Dutyroster extends JFrame {
    private Dutyroster() {
        initComponents();
    }

    String userID;
    static Dutyroster Instance;
    public static Dutyroster getInstance(String uerID){
        if(Instance == null){
            Instance = new Dutyroster();
        }
        Instance.userID = uerID;
        return Instance;
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;
    private JLabel label21;
    private JLabel label22;
    private JLabel label23;
    // JFormDesigner - End of variables declaration  //GEN-END:variables



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vaishnav Anil Nair
        ResourceBundle bundle = ResourceBundle.getBundle("project.codewick.forms.patient.interfaces.patient");
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label16 = new JLabel();
        label17 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        label20 = new JLabel();
        label21 = new JLabel();
        label22 = new JLabel();
        label23 = new JLabel();

        //======== this ========
        setTitle(bundle.getString("this.title"));
        addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                thisWindowGainedFocus(e);
            }
        });
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText(bundle.getString("label1.text_2"));

        //---- label3 ----
        label3.setText(bundle.getString("label3.text_2"));

        //---- label4 ----
        label4.setText(bundle.getString("label4.text_2"));

        //---- label5 ----
        label5.setText(bundle.getString("label5.text_2"));

        //---- label6 ----
        label6.setText(bundle.getString("label6.text_2"));

        //---- label7 ----
        label7.setText(bundle.getString("label7.text_2"));

        //---- label16 ----
        label16.setText(bundle.getString("label16.text"));

        //---- label17 ----
        label17.setText(bundle.getString("label17.text_2"));

        //---- label18 ----
        label18.setText(bundle.getString("label18.text_2"));

        //---- label19 ----
        label19.setText(bundle.getString("label19.text_2"));

        //---- label20 ----
        label20.setText(bundle.getString("label20.text_2"));

        //---- label21 ----
        label21.setText(bundle.getString("label21.text_2"));

        //---- label22 ----
        label22.setText(bundle.getString("label22.text_2"));

        //---- label23 ----
        label23.setText(bundle.getString("label23.text_2"));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label18, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addComponent(label19, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label20, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label8)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(label2))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label21, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label22, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label23, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                        .addComponent(label7, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                    .addGap(47, 47, 47))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4)
                        .addComponent(label16)
                        .addComponent(label5)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label8)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label21)
                            .addComponent(label22)
                            .addComponent(label23))
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label17)
                            .addComponent(label18)
                            .addComponent(label19)
                            .addComponent(label20)))
                    .addContainerGap(59, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private void thisWindowGainedFocus(WindowEvent e) {
        String duty = SQL.utils.getRoster(userID);
        char[] a = duty.toLowerCase().toCharArray();
        switch (a[0]){
            case 0:
                label17.setText("Morning");break;
            case 1:
                label17.setText("Evening");break;
            case 2:
                label17.setText("night");break;
            case 3:
                label17.setText("Off duty");break;
        }
        switch (a[1]){
            case 0:
                label18.setText("Morning");break;
            case 1:
                label18.setText("Evening");break;
            case 2:
                label18.setText("night");break;
            case 3:
                label18.setText("Off duty");break;
        }
        switch (a[2]){
            case 0:
                label19.setText("Morning");break;
            case 1:
                label19.setText("Evening");break;
            case 2:
                label19.setText("night");break;
            case 3:
                label19.setText("Off duty");break;
        }
        switch (a[3]){
            case 0:
                label20.setText("Morning");break;
            case 1:
                label20.setText("Evening");break;
            case 2:
                label20.setText("night");break;
            case 3:
                label20.setText("Off duty");break;
        }
        switch (a[4]){
            case 0:
                label21.setText("Morning");break;
            case 1:
                label21.setText("Evening");break;
            case 2:
                label21.setText("night");break;
            case 3:
                label21.setText("Off duty");break;
        }
        switch (a[5]){
            case 0:
                label22.setText("Morning");break;
            case 1:
                label22.setText("Evening");break;
            case 2:
                label22.setText("night");break;
            case 3:
                label22.setText("Off duty");break;
        }
        switch (a[6]){
            case 0:
                label23.setText("Morning");break;
            case 1:
                label23.setText("Evening");break;
            case 2:
                label23.setText("night");break;
            case 3:
                label23.setText("Off duty");break;
        }
    }
}
