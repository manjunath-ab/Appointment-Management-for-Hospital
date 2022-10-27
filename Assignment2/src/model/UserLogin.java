/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class UserLogin {
    String userType;
    String uid;
    String userName;
    String pass;

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUserType() {
        return userType;
    }

    public String getUid() {
        return uid;
    }

    public String getUserName() {
        return userName;
    }

    public String getPass() {
        return pass;
    }
    
    
}
