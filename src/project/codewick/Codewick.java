package project.codewick;

import project.codewick.forms.MainScreen;
import project.codewick.forms.doctor.interfaces.DoctorInterface;
import project.codewick.forms.patient.ExistingPatientLogin;
import project.codewick.forms.patient.interfaces.PatientInfo;
import project.codewick.forms.patient.interfaces.PatientInterface;
import project.codewick.forms.patient.interfaces.patient_info1;

import javax.swing.*;

public class Codewick {
    public  static void insert()
    {

    }

    public static void main(String[] args){
    insert();
     //   SQL.utils.setup("Vaishnav","19BCG10015","hospitalmanagement");
        //ExistingPatientLogin a = new ExistingPatientLogin();
        PatientInfo doc = PatientInfo.getInstance();
        //a.setVisible(false);
        //doc.setVisible(true);
        DoctorInterface d = DoctorInterface.getInstance();
        d.setVisible(true);


        //a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

}
