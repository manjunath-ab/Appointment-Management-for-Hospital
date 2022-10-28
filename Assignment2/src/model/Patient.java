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
    private String communityName;
    int houseNumber;

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    
    private ArrayList<Encounter> encounterHistory;

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    
    
    public Patient(String Name, String patientID, int age, String gender,long Cell_phone_number,String emailAddress ) {
        super(Name, patientID, age, gender,Cell_phone_number,emailAddress);
        
        this.encounterHistory = new ArrayList<>();
        
        
    }

    
    
    
    @Override
    public String toString(){
        return Name;
    }
    
   
}
