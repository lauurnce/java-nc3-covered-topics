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
public class UnaryOperatorWed {
    public static void main(String[] args) {
     // negating an expression (using negative sign [-])
        byte number = 100;
        int newNumber = -number;
        
        System.out.println(number);
        System.out.println(newNumber);
        
     // inverting the value of a boolean (using exclamation point [!])
        boolean isTrue = false;
        System.out.println(isTrue);
        System.out.println(!isTrue);
        
     // incrementing / decrementing a value by one
     /* 
     Categories: 
     Post & Pre-increment 
     Post & Pre-decrement
     */
        int numbers = 1;
        
        System.out.println(numbers++);
        System.out.println(numbers);
    }
    
    
    
}
