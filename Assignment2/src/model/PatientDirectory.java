/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class PatientDirectory {
    private ArrayList<Patient> patientDirectory;
    
    public PatientDirectory(){
        this.patientDirectory = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    public Patient addPatient(String Name, String patientID, int age, String gender,long Cell_phone_number,String emailAddress){
    
    Patient newPatient = new Patient(Name,patientID,age,gender,Cell_phone_number, emailAddress);
    patientDirectory.add(newPatient);
    return newPatient;
    
    }
    public void deleteDetails(Patient p)
    {
    
    patientDirectory.remove(p);
    
    
    }
    
    
}
