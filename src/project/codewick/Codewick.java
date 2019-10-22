package project.codewick;

import project.codewick.forms.MainScreen;
import project.codewick.forms.doctor.interfaces.DoctorInterface;
import project.codewick.forms.patient.ExistingPatientLogin;
import project.codewick.forms.patient.interfaces.AppointmentsPatients;
import project.codewick.forms.patient.interfaces.PatientInterface;
import project.codewick.forms.patient.interfaces.patient_info1;
import project.codewick.utils.SQL;

import javax.swing.*;

public class Codewick {


    public static void main(String[] args){
        SQL.utils.setup("Vaishnav","19BCG10015","hospitalmanagement");
        AppointmentsPatients ap = new AppointmentsPatients("VITuser");
        ap.setVisible(true);
        ap.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
