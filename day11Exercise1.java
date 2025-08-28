
package com.joysistvi.codeprogression.day11;

public class Exercise1 {
    public static void main(String[] args) {
        
        int number = 5;
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }

        System.out.println("Final Sum: " + sum);

    }
}
