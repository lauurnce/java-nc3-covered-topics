
package com.joysistvi.polymorphism.day27;


public class Human extends LivingOrganism {
    
    String name = "Lawrence"; 
    
    public void displayName(){ 
        name = "Ecnerwal"; 
    }
    
    // static constant
    public static final double PI = 3.14; 
    
    @Override
    public void eat(){
        System.out.println("Eating..");
    }
    
    
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
    }
    
    //inheritance = object to object 
    //default protected public 
    //bawal ioverride: private, static, final 
    
    
}
