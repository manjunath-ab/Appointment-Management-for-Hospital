/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Encounter extends VitalSigns{
    
    private String encounterOrder;

    public String getEncounterOrder() {
        return encounterOrder;
    }

    public void setEncounterOrder(String encounterOrder) {
        this.encounterOrder = encounterOrder;
    }
    

   
    
   //need to put something else here?
    
    @Override
        public String toString(){
        return encounterOrder;
      }
    
    
    
}
