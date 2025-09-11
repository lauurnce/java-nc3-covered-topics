/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.enumtopic.day29;

import java.util.Scanner; 

public class Main {
    
    enum DAY {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a day: ");
        String day = scanner.nextLine().trim().toUpperCase();
        DAY enumDay = DAY.valueOf(day);
        
        switch (enumDay){ 
            case SUNDAY:
                System.out.println("Linggo naaa");
                break;
            case MONDAY:
                System.out.println("First Day of the Week");
                break;
            case TUESDAY:
                System.out.println("Second Day");
                break; 
            case WEDNESDAY: 
                System.out.println("miyerkulesss");
                break; 
            case THURSDAY: 
                System.out.println("Huwebesss");
                break; 
            case FRIDAY: 
                System.out.println("Biyernesss");
                break;
            case SATURDAY:
                System.out.println("Sabadooo");
                break; 
            default: 
                System.out.println("What day?");
        }
        
        //loop thru an Enum 
        
        
    }
}
