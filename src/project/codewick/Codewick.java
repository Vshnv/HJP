package project.codewick;

import project.codewick.forms.patient.ExistingPatientLogin;
import project.codewick.forms.patient.NewPatientform;
import project.codewick.utils.SQL;

import javax.swing.*;

public class Codewick {
    public static void main(String[] args){
        String[] arg = {"test","test2"};
        System.out.println(args);
        SQL.utils.setup("Vaishnav","19BCG10015","hospitalmanagement");
        NewPatientform form = new NewPatientform();
        form.setVisible(true);
        ExistingPatientLogin a = new ExistingPatientLogin();
        a.setVisible(true);
         a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
