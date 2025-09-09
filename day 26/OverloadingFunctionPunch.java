/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.polymorphism.day26;

/**
 *
 * @author Admin
 */
public class OverloadingFunctionPunch {
    
    //non-parameterized method
    public void punch(){
        System.out.println("Punch 1x");
    }
    
    public void punch(int noOfPunch){
        System.out.println("Punch 2x");
    }
    
    public void punch(int noOfPunch, String animation){
        System.out.println("Punch 2x");
    } 
    
    public void punch(String animation, int noOfPunch){ //change the order of parameter 
        System.out.println("Punch 2x");
    } 
    
    
    public static void main(String[] args) {
        OverloadingFunctionPunch p = new OverloadingFunctionPunch(); 
        p.punch(10, "wow");
    }
}
