
package com.joysistvi.math.day16;

import java.util.Random;
public class MathClassWednesday {
    public static void main(String[] args) {
        /*
        instance
        static
        */
        
        Random random = new Random(); 
        System.out.println(random.nextInt(5)+1);
        
////        System.out.println(Math.pow(10, 5)); // first num -> constant, second num -> exponent
////        System.out.println(Math.random());
//        System.out.println("Lotto:");
//        for (int i = 0; i < 10; i++) {
//            int randomNumber = (int)(Math.random()*58) + 1;
//            System.out.println(i+1+": " + randomNumber);
//        }
//        

        /* 
        Bingo Simulator 
        B = 1 -15 
        I = 16- 30
        N = 31 - 45
        G = 46 - 60 
        O = 61 - 75 
        */ 
        // tips 
        // to remove duplicates: use array for storage, nested loop, decision (IF)
//        int roll = (int) (Math.random()*75) + 1;
//        String letter;
//        
//        if (roll < 16){
//            letter = "B";
//        } else if (roll < 31){
//            letter = "I";
//        } else if (roll < 46){
//            letter = "N";
//        } else if (roll < 61) {
//            letter = "G";
//        } else {
//            letter = "O"; 
//        }
//        System.out.println("Sa letrang " + letter + ": " + roll);
        
    }
    
    
}
