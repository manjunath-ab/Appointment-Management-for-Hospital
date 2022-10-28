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
public class City {
    private ArrayList<Community> commList;
    private String cityName;

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public ArrayList<Community> getCommList() {
        return commList;
    }

    public void setCommList(ArrayList<Community> commList) {
        this.commList = commList;
    }
    

    
    
    public City(){
        this.commList = new ArrayList<>();
        //pre filling community data
        Community newCommunity= new Community();
        newCommunity.setCommunityName("Riverway");
        Hospital newHospital= new Hospital();
        Hospital newHospital1=new Hospital();
        newHospital.setHospitalName("Hospital1");
        Doctor newDoctor=new Doctor("Doc1","D1","Cardiology");
        Doctor newDoctor1=new Doctor("Doc2","D2","Neurology");
        //newDoctor.setDoctorName("Doc1");
        //newDoctor1.setDoctorName("Doc2");
        newHospital.getDoctorDirectory().add(newDoctor);
        newHospital.getDoctorDirectory().add(newDoctor1);
        newHospital1.setHospitalName("Hospital2");
        Doctor newDoctor2=new Doctor("Doc3","D3","Cardiology");
        Doctor newDoctor3=new Doctor("Doc4","D4","Urology");
        //newDoctor2.setDoctorName("Doc3");
        //newDoctor3.setDoctorName("Doc4");
        newHospital1.getDoctorDirectory().add(newDoctor2);
        newHospital1.getDoctorDirectory().add(newDoctor3);
        newCommunity.getHospitalDirectory().add(newHospital);
        newCommunity.getHospitalDirectory().add(newHospital1);
        
        
        
        
        
        Community newCommunity1=new Community();
        newCommunity1.setCommunityName("Huntington Ave");
        Hospital newHospital2= new Hospital();
        Hospital newHospital3=new Hospital();
        newHospital2.setHospitalName("Hospital3");
        Doctor newDoctor4=new Doctor("Doc5","D5","Dermatology");
        Doctor newDoctor5=new Doctor("Doc6","D6","Neurology");
        //newDoctor4.setDoctorName("Doc5");
        //newDoctor5.setDoctorName("Doc6");
        newHospital2.getDoctorDirectory().add(newDoctor4);
        newHospital2.getDoctorDirectory().add(newDoctor5);
        newHospital3.setHospitalName("Hospital4");
        Doctor newDoctor6=new Doctor("Doc7","D7","Urology");
        Doctor newDoctor7=new Doctor("Doc8","D8","Dermatology");
        //newDoctor6.setDoctorName("Doc7");
        //newDoctor7.setDoctorName("Doc8");
        newHospital3.getDoctorDirectory().add(newDoctor6);
        newHospital3.getDoctorDirectory().add(newDoctor7);
        newCommunity1.getHospitalDirectory().add(newHospital2);
        newCommunity1.getHospitalDirectory().add(newHospital3);
        
        commList.add(newCommunity);
        commList.add(newCommunity1);
    
}
}
