

package com.mycompany.midterm;


public class Midterm {

    public static void main(String[] args) {
        
        Ship[] ships;
        
        ships = new Ship[4];
        
        ships[0] = new Ship("HMS Victory", "1765");
        ships[1] = new Ship("USS Constitution", "1797");
        ships[2] = new CruiseShip(1778, "MS Queen Elizabeth 2", "1967");
        ships[3] = new CargoShip("Maersk Triple E", "2013", 18000);
        
        for (Ship i : ships)
        {
            System.out.println(i);
        }
       
       
    }
}
