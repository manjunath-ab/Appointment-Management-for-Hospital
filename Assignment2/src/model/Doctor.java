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
public class Doctor extends Person{
    
    
    
    
    private String special;

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getSpecial() {
        return special;
    }
    private ArrayList<Patient> patientList;
    //define an array of patient_id or names;

    public Doctor(String doctorName, String docID,int age, String gender,long Cell_phone_number,String emailAddress,String special) {
        super(doctorName,docID,age,gender,Cell_phone_number,emailAddress);
        this.special=special;
        this.patientList=new ArrayList<>();
    }

    
   
    

    
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    
    

    
    
    
    @Override
    public String toString(){
        return Name;
    }
    
    
}
