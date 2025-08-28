package com.joysistvi.decisionmaking.day6;


public class IfElseIfLadderStatementThursday {
    public static void main(String[] args) {
        /* syntax: 
        if(condition 1) {    
                  statement 1; //executes when condition 1 is true   
        }   else if(condition 2) {  
                statement 2; //executes when condition 2 is true   
        }   else {  
                statement 2; //executes when all the conditions are false   
        }                   */
        
        int choice = 3;
        if(choice == 1) {    
            System.out.println("Go+");      
        }   else if(choice == 2) {  
            System.out.println("SuperGo99"); 
        }   else if (choice == 3) {
            System.out.println("GoEXTRA");
        }   else if (choice == 4) {
            System.out.println("ALLNET");
        }   else { 
            System.out.println("Invalid Input");    
        }
    }
}
