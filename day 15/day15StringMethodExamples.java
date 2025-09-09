/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.stringcontinuation.day15;

import java.util.Scanner;

public class StringMethodExamples {

    public static void main(String[] args) {
        String word = "Hello java ";
//        
//        Scanner scanner = new Scanner(System.in);
//        String word = "Hello Lawrence Panes";
//        System.out.print("Enter String to find:");
//        String stringToFind = scanner.nextLine();
//
////        System.out.println(word.contains("a")); // it will give boolean result 
////        System.out.println(word.startsWith("Ja")); // also give boolean result
////        System.out.println(word.endsWith("a")); 
////        
////        System.out.println(word.indexOf("a")); //it will result to index of the first occured character
////        System.out.println(word.indexOf("a", 2)); // it will skip and start from index 2
////        System.out.println(word.indexOf("a", word.indexOf("a")+1)); //same with 2nd example
////        System.out.println(word.indexOf(stringToFind, word.indexOf(stringToFind) + 1));
//        System.out.println(word.isEmpty()); // it will give boolean result if true pr false 
//        System.out.println(word.trim()); //will remove spaces before and after the string word
//        
//        //.replace -> it convert the value of a String midway without changing the initialized value 
//        String gender = "male";
//        System.out.println(gender.replace(gender, "Female")); 
//        
//        //.toCharArray() -> in convert the string into array
//        char[] arrGender = gender.toCharArray(); 
//        for (int i = 0; i < arrGender.length; i++) {
//            System.out.print(arrGender[i]);
//        }
//        
//        // it will get the first letter of the input 
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("\nEnter your gender: ");
//        char gender3 = scanner.nextLine().trim().charAt(0); 
//        
//        System.out.println(gender3);

        //.valueOf -> from primitive it changes it to string
        // it is also called "PARSING", converting primitive data type to string or vice versa
        //example 1: integer to string
        int num = 20;
        String newNumber = String.valueOf(num);
        System.out.println(newNumber.contains("a"));

        //example 2: string to integer 
        String number1 = "45";
        int newNumber1 = Integer.valueOf(num);
        System.out.println(newNumber1 * newNumber1);
        
        //CASTING -> changing data type to other primitive data type 
        // downcasting and upcasting
        
        int num3 = 10;
        double newNum3 = num3; // downcasting
        
        double num4 = 10;
        
        int newNum4 = (int) num4; // upcasting
       
        double num2 = 10; 
        
        int newNumber2 = (int) num2;
        System.out.println(newNumber2);
        

    }
}
