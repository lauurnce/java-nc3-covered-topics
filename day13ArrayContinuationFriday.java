
package com.joysistvi.array1.day13;

import java.util.Scanner;

public class ArrayContinuationFriday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String[] fruits = new String[5];
//        fruits[0] = "Banana";
//        fruits[1] = "Apple";
//        fruits[2] = "Avocado";
//        fruits[3] = "Kiwi";
//        fruits[4] = "Mango";
        
        for (int i = 0; i < fruits.length; i++) {
            System.out.print("Enter fruits[" + i + "]: ");
            fruits[i] = scanner.nextLine();
        }
        
        
        
//        for (String fruit : fruits) {  //traverse the value using for-each loop 
//            System.out.println(fruit);
//        }
//        
//        for (int i = 0; i < fruits.length; i++){ //printing all the values using for loop
//            System.out.println(fruits[i]);
//        }
        
        
        
    }
}
