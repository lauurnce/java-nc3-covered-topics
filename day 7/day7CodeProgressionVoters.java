
package com.joysis.day7;

import java.util.Scanner;
public class codeprogressionVoters {
    
    
    public static void main(String[] args) {
        System.out.println("---Age Classification---");
        System.out.println("18 above : National Election");
        System.out.println("15 - 17 : SK Election");
        System.out.println("14 below : Not Eligible");
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        if (age >= 0 && age <= 100){
            if (age <= 100) {
               System.out.println("National Election"); 
            } else if (age <= 17) {
               System.out.println("SK Election");
            } else if (age <= 14 ) {
               System.out.println("Not Eligible");
            } else {
               System.out.println("Invalid");
            }
        }  else {
            System.out.println("Invalid Age Input. Age must be greater than 0");
        }
        
        scanner.close();
    }
}
