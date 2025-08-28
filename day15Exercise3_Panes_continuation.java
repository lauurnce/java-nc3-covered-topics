/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stringcontinuation.day15;


public class Exercise3_Panes_continuation {
    public static void main(String[] args) {
        String country = "Philippines";
        String vowels = "aeiou";
        System.out.println(country.charAt(0));
        System.out.println(country.charAt(country.length()-1));
        
        int count=0;
        for (int i = 0; i < country.length(); i++) {
            if (country.toLowerCase().charAt(i)== 'p'){
                count++;
            }
        }
        System.out.println(count);
        
        int counter = 0;
        for (int i = 0; i <country.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (country.charAt(i)==vowels.charAt(j)){
                    counter++;
                }
            }
            
        }
        System.out.println(counter);
    }
}
