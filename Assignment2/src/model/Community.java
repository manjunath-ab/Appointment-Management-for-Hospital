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
public class Community {
    
    private ArrayList<Hospital> hospitalDirectory;
    private String communityName;

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunityName() {
        return communityName;
    }
    public Community(){
        this.hospitalDirectory = new ArrayList<>();
        
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }
    public Hospital addNewHospital(){
        Hospital newHospital= new Hospital();
        hospitalDirectory.add(newHospital);
        return newHospital;
        
    }
    public void deleteHospital(Hospital h){
        hospitalDirectory.remove(h);
        
    }
    //overrides object state
    @Override
    public String toString(){
        return communityName;
    }
    
    
    
}
