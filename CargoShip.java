/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midterm;

/**
 *
 * @author danielhernandez
 */
public class CargoShip extends Ship{
    
    int capacity;
    
    CargoShip(String ship, String year, int capacity)
    {
        super(ship, year);
        this.capacity = capacity;
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
    
    void setCapacity(int c)
    {
        capacity = c;
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
    
    int getCapacity()
    {
        return capacity;
    }
    
    public String toString()
    {
        return "\nShip: " + ship +
                "\nCapacity: " + capacity;
    }
}
