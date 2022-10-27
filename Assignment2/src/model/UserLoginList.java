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
public class UserLoginList {
    private static  ArrayList<UserLogin>  userLoginList;

    public UserLoginList() {
        UserLoginList.userLoginList = new ArrayList<>();
    }

    
    

    public ArrayList<UserLogin> getUserLoginList() {
        return userLoginList;
    }

    public void setUserLoginList(ArrayList<UserLogin> userLoginList) {
        UserLoginList.userLoginList = userLoginList;
    }
    public UserLogin addUser(){
    
    UserLogin newUser = new UserLogin();
    userLoginList.add(newUser);
    return newUser;
    
    }
    
    
}
