/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.methods.day22A;

/* 
    Accessing Class 
    1. thru ClassName (speciic class)
    2. thru * (all) 
    3. thru fully qualified name (specified class)
*/

/*
    Use cases of Access Modifier/Specifier
    -> Class -> Methods/Variable 
*/


public class A {
    
    static String name; // variable
    
    public static void printName(){ // method
        System.out.println(name);
    }
    
    public static void main(String[] args) {
        System.out.println(name);
        printName(); 
        
    }
    
    public static void sum(){
        name = "winter"; //invoking public variable 
        printName(); //invoking public method
    }
}


