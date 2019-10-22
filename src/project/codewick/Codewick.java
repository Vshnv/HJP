package project.codewick;

import project.codewick.forms.patient.ExistingPatientLogin;
import project.codewick.utils.SQL;

import javax.swing.*;

public class Codewick {
    public static void main(String[] args){
        SQL.utils.setup("Vaishnav","19BCG10015","hospitalmanagement");
        ExistingPatientLogin a = new ExistingPatientLogin();
        a.setVisible(true);
         a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
