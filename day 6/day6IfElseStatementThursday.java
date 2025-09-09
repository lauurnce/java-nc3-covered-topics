
package com.joysistvi.decisionmaking.day6;

public class IfElseStatementThursday {
    public static void main(String[] args) {
        // if-else statement
        /*syntax: 
        if(condition) {    
              statement 1; //executes when condition is true   
        }  else{  
              statement 2; //executes when condition is false   
        }
        */
        
        int number1 = 11;
        String result1 = ""; 
        if(number1 % 2 == 0) {    
              result1 = "Even"; 
        }  else{  
              result1 = "Odd";
        }
        System.out.println(result1);
        
        /* if(condition 1) {    
statement 1; //executes when condition 1 is true   
}  
else if(condition 2) {  
statement 2; //executes when condition 2 is true   
}  
else {  
statement 2; //executes when all the conditions are false   
}  */
        
    }
}
