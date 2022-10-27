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
public class Hospital {
    private ArrayList<Doctor> doctorDirectory;
    private String hospitalName;

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }
    public Hospital(){
        this.doctorDirectory = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public void deleteDoctor(Doctor d){
        doctorDirectory.remove(d);
        
    }
    //overrides object state
    @Override
    public String toString(){
        return hospitalName;
    }

}
