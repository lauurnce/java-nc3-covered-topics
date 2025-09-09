package com.joysistvi.codeprogression.day11;

public class Exercise3 {

    public static void main(String[] args) {
        int sum = 0;
        int terms = 5;
        int commonDifference = 5;
        int startValue = 1;
        
        

        for (int i = 1; i <= terms; i++) {
            sum += startValue;
            System.out.print(startValue);

            if (i < terms) {
                System.out.print(" + ");
            }

            startValue += commonDifference;
        }
        System.out.print(" = " + sum);

    }
}
