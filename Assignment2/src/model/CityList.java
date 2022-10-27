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
public class CityList {
    private ArrayList<City>  cityList;
    
    public CityList() {
        this.cityList = new ArrayList<City>();
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    public City addCity(){
    
    City newCity = new City();
    cityList.add(newCity);
    return newCity;
    
    }
    public void deleteCity(City e)
    {
    
    cityList.remove(e);
    
    
    }
    
}
