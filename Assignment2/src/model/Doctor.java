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
public class Doctor {
    
    
    private String doctorName;
    private String docID;
    private String special;

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getSpecial() {
        return special;
    }
    private ArrayList<Patient> patientList;
    //define an array of patient_id or names;

    public Doctor(String doctorName, String docID,String special) {
        this.doctorName = doctorName;
        this.docID = docID;
        this.special=special;
        this.patientList=new ArrayList<>();
    }

    
    public void setDocID(String docID) {
        this.docID = docID;
    }

    public String getDocID() {
        return docID;
    }
    
    

    
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    
    

    
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    @Override
    public String toString(){
        return doctorName;
    }
    
    
}
