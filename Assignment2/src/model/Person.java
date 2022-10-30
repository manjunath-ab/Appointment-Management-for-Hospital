/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Person extends House {
    //set id for sys,community admin
    //maybe password too .
    public String Name;
    public String personID; // patient ID is set to string as it can contain characters and numbers 
    public int  age ;
    public String gender;  
    public String contactInfo ;
    public long  Cell_phone_number ;
    public String emailAddress; 
    public Person(String Name,String personID,int age,String gender,long Cell_phone_number,String emailAddress) {
        this.Name = Name;
        this.personID = personID;
        this.age = age;
        this.gender = gender;
        this.Cell_phone_number = Cell_phone_number;
        this.emailAddress = emailAddress;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }
    

   

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setCell_phone_number(long Cell_phone_number) {
        this.Cell_phone_number = Cell_phone_number;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return Name;
    }



    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public long getCell_phone_number() {
        return Cell_phone_number;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    
}
