
package com.joysistvi.codeprogression.day11;

public class Exercise2 {
    public static void main(String[] args) {
        int number = 5;  
        int product = 1;  

        for (int i = 1; i <= number; i++) {
            product *= i;
            System.out.println("i = " + i + ", product = " + product);
        } 
        
        System.out.println("\nFinal Product: " + product);
    }
}
