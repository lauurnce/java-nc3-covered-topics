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
public class LogicalOperatorWed {
    public static void main(String[] args) {
          // Logical && [AND]
          // Logical || [OR]
          
          //return value: boolean [true/false]
          //compound conditional statement 
          
          //age: 1-17 -> not voter
        int age = 12;
        boolean isVoter = (age >= 1 && age <= 17);
        System.out.println(isVoter);
        
        /* 
        logical AND [&&] & OR [||] operator doesn't check the second 
        condition if the first condition is false.
       
        bitwise AND [&] $ OR [|] operator always checks both conditions
        whether first condition is true or false.
        */


        int choice = 2;
        boolean isOOP = choice == 1 & choice == 2 & choice == 3;
        System.out.println(isOOP);
    }
}
