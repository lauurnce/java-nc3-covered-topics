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
public class PriorityNumeric {

    public void punch(byte num) {
        System.out.println("byte");
    }

    public void punch(short num) {
        System.out.println("short");
    }

    public void punch(long num) {
        System.out.println("long");
    }

    public void punch(int num) {
        System.out.println("int");
    }

    public void punch(float num) {
        System.out.println("float");
    }

    public void punch(double num) {
        System.out.println("double");
    }

    public static void main(String[] args) {
        PriorityNumeric obj = new PriorityNumeric();
        obj.punch(0);
    }
    
//priority: int -> long -> float -> double -> Integer -> Long -> Float -> Double
//if same combination of data type in parameter, change the arrangement 
}
