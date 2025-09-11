
package com.joysistvi.enumtopic.day29;

public class Printer {
    
    enum Season {
    WINTER,
    SUMMER, 
    SPRING, 
    FALL
    
    
}
    //Looping an Enum
    public static void main(String[] args) {
        System.out.println("Season of the week are: ");
        
        for (Season season : Season.values()){
            System.out.println(season);
        }
    }
 
}




