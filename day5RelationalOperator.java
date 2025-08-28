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
public class RelationalOperator {
    public static void main(String[] args) {
    /*  
        Return Value: True / False
        CATEGORIES:
        Comparisons: < > <= >=
        Relational: == !=
        */
    
    byte num = 10;
    byte num2 = 20; 
    byte num3 = 20;
    
    boolean isTrue = num > num2;
    boolean isTrue1 = num == num2;
    boolean isTrue2 = num2 == num3;
    boolean isTrue3 = num != num2;
        /*System.out.println(isTrue);
        System.out.println(isTrue1);
        System.out.println(isTrue2);
        System.out.println(isTrue3); */
        System.out.println("may bading ba sa GC namin? "+isTrue3);
    }
}
