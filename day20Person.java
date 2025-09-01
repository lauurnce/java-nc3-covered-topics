/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.methods.day20;


public class Person {
    
    static String firstName; 
    String lastName;
    
    public static void a(){ //static method
        Person p = new Person();
        p.b(); // invoking instance method via instantiation if it is invoke in static method 
    }
    
    public void b(){  //instance method
         System.out.println(lastName); //no need to make an object since instance variable to instance method
         
    }
    
    public static void c(){
        a(); //direct call since it is static method invoke to static method 
    }
    
}
