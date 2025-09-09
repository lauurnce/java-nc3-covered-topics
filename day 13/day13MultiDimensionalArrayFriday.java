
package com.joysistvi.array1.day13;


public class MultiDimensionalArrayFriday {
    public static void main(String[] args) {
        
        //syntax:
        int[][] numbers = {{2,4,6,8,10}, {1, 3, 5, 7, 9}, {1, 2, 3, 7}}; 
        
        String[][] planets = {
            {"Mercury", "Venus", "Earth", "Mars"}, 
            {"Neptune", "Jupiter", "Saturn", "Uranus"},
            {"Pluto", "Namek"}
        };
        // traversing values of multidimensional array
        //using nested for loop / for each loop
        
        
        // traversing using nested for loop
        for (int i = 0; i < planets.length; i++) {           // outer loop -> rows (outer array)
            for (int j = 0; j < planets[i].length; j++){      // inner loop -> columns (inner array)
                System.out.println(planets[i][j]);
            }
            System.out.println("");
        }
        
        // traversing using nested for-each loop 
        for (String[] rows : planets) {         //need to be also an array since the value transversing is also array 
            for (String columns : rows) {       // no need to put [] since we already access the values of inner array 
                System.out.println(columns);
            }
            System.out.println("");
        }
      
    }
}
