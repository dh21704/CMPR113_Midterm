/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midterm;

/**
 *
 * @author danielhernandez
 */
public class Ship {
    String ship;
    String year;
    
    Ship(String ship, String year)
    {
        this.ship = ship;
        this.year = year;
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
    
    //accessor
    String getShip()
    {
        return ship;
    }
    
    String getYear()
    {
        return year;
    }
    
    public String toString()
    {
        return "\nShip: " + ship +
                "\nYear: " + year;
    }
    
    
}
