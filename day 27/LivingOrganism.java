/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.polymorphism.day27;

/**
 *
 * @author Admin
 */
public abstract class LivingOrganism {
    String word; 
    String name;
    
    public void eat(){}
    public static void walk(){}
    
    //non access modifier: final, static 
    //final class cannot be inherited and overriden 
    
}
