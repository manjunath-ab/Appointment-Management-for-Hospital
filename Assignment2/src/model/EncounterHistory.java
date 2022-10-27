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
public class EncounterHistory {
    
        private String patientID;

        public void setPatientID(String patientID) {
           this.patientID = patientID;
        }

        public String getPatientID() {
           return patientID;
        }
        private ArrayList<Encounter> encounterHistory;

        public EncounterHistory(ArrayList<Encounter> encounterHistory) {
            this.encounterHistory = encounterHistory;
        }
        

        public ArrayList<Encounter> getEncounterHistory() {
            return encounterHistory;
        }

        public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
            this.encounterHistory = encounterHistory;
        }
    
    
}
