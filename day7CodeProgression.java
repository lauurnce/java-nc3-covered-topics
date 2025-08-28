
package com.joysis.day7;

import java.util.Scanner;
public class codeprogression{
 
    public static void main(String[] args) {
        
       /* 
        Age: 0 - 2 Category: Baby+
        Age: 3 - 12 Category: Child
        Age: 13 - 19 Category: Teenager
        Age: 20 - 29 Category: Young Adult
        Age: 30 - 59 Category: Adult
        Age: 60 - 100 Category: Senior
        */
        
       // code progression
       // industry coding standard
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Categories:  Baby |  Child  | Teenager | Young Adult |   Adult   |  Senior");
        System.out.println("  Age:      0 - 2 |  3 - 12 | 13 - 19  |   20 - 29   |  30 - 59  |  60 - 100 ");
        System.out.println("");
        System.out.print("Input your Age: "); 
        int age = scanner.nextInt();
        
        String result = "";
        String eligibility = "";
        
        if (age <= 2) {
            result = "Baby";
        }  else if (age <= 12) {
            result = "Child";
        }  else if (age <=19) {
            result = "Teenager";
        }  else if (age <= 29) {
            result = "Young Adult";
        }  else if (age <= 59) {
            result = "Adult";
        }   else if (age <= 100 || age > 100) {
            result = "Senior";
            if (age <= 70){
                eligibility = "Not eligible to pension";
            } else {
                eligibility = "Eligible to pension";
            }
        }  else {
            result = "Invalid input";
        }
        
        System.out.println("Age: " +age+ "  Category: " +result);
        System.out.println("Eligibility: " +eligibility);
    
        
        // 60 - 100 senior 
        // 60 - 70 not eligible to pension
        // 70 - 100 eligible to pension 
        
    }
}
