/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midterm;

/**
 *
 * @author danielhernandez
 */
public class CruiseShip extends Ship{
    
    int maxPassengers;
    
    
    CruiseShip(int passengers, String ship, String year)
    {
        super(ship, year);
        maxPassengers = passengers;
    }
    
    //mutator
    void setShip(String ship)
    {
        this.ship = ship;
    }
    
    void setYear(String year)
    {
        this.year = year;
    }
    
    void setMaxPassengers(int p)
    {
        maxPassengers = p;
    }
    
    //accessor
    String getShip()
    {
        return ship;
    }
    
    String getYear()
    {
        return year;
    }
    
    int getPassengers()
    {
        return maxPassengers;
    }
    
    public String toString()
    {
        return "\nShip: " + ship + 
                "\nMax Passengers: " + maxPassengers;
    }
}
