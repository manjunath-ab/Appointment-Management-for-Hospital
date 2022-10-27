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
public class Patient extends Person{
    String address;
    
    private ArrayList<Encounter> encounterHistory;

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    
    
    public Patient(String Name, String patientID, int age, String gender,long Cell_phone_number,String emailAddress ) {
        super(Name, patientID, age, gender,Cell_phone_number,emailAddress);
        this.address = address;
        this.encounterHistory = new ArrayList<>();
        
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
        
    
    //define vital signs class
    //house class

    public String getAddress() {
        return address;
    }
    @Override
    public String toString(){
        return patientID;
    }
    
   
}
