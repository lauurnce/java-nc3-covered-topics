/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.operators.day5;

/**
 *
 * @author Admin
 */
public class ArithmeticOperatorWed {
    public static void main(String[] args) {
        int number = 10;
        int number2 = 20; 
        System.out.println(number + number2);
        //if we use the (+) concatenate it will treat as string not integer
        System.out.println("The sum of two numbers is "+number+number2);
        //use parenthesis to separate them
        System.out.println("The sum of two numbers is "+(number+number2));
        /* 
        put it to another variable
        int number = 10;
        int number2 = 20;
        int sum = number + number2
        */
        int sum = number + number2;
        System.out.println(sum);
        
        // use of modulo [%]
        int number3 = 50;
        int number4 = 10;
        int number5 = 3;
        int remainder1 = number3 % number4;
        int remainder2 = number3 & number5;
        System.out.println(remainder1);
        System.out.println(remainder2);
    }
}

