/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.abstraction.day28;

/**
 *
 * @author Admin
 */
public interface Animal {
    
    //static constants
    //default: public, static, final -> public static final double PI =3.14 -> double PI = 3.14;
    public static final double PI = 3.14; 
    int MAX_USERS = 100; 
    String USERNAME = "root"; 
    String PASSWORD = ""; 
    
    //abstract methods
    //default: public, abstract -> public abstract void eat(); -> void eat(); 
    public abstract void eat(); 
    void walk(); 
    void jump(); 
    void makeSound(String sound); 
    void crawl(); 
}
