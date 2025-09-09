package com.joysistvi.codeprogression.day11;

public class Exercise4 {

    public static void main(String[] args) {
        long sum = 0;
        long product = 1;
        int terms = 10;
        int commonDifference = 5;     
        int startValue = 1;
        int current = startValue;
        
        System.out.print("Sum: ");
        for (int i = 1; i <= terms; i++) {
            sum += current;
            System.out.print(current);
            if (i < terms) {
                System.out.print(" + ");
            }
            current += commonDifference; 
        }
        System.out.println(" = " + sum);
        current = startValue;
        
        System.out.print("Product: ");
        for (int i = 1; i <= terms; i++) {
            product *= current;
            System.out.print(current);
            if (i < terms) {
                System.out.print(" * ");
            }
            current += commonDifference;
        }
        System.out.println(" = " + product);
    }
}
