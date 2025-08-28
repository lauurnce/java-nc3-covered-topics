
package com.joysistvi.looping.forloop;

public class WhileLoopMonday {
    public static void main(String[] args) {
        
        /*
        syntax:
        while (condition){      
        //code to be executed     
        Increment / decrement statement    
        }      
        */
        
        int count = 0; //counter variable
        while (count <10){
            System.out.println(count + 1 +" Lawrence");
            count++;
        }
        
        //infinite loop
        int count1 = 0;
        
        String color = "White";
        while(color.equals("White")){ //flag
            ++count;
            System.out.println(count + ":" + color);
        }
        
        
        
       
        
        
        
    }
}
