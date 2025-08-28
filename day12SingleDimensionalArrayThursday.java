
package com.joysistvi.array.day12;


public class SingleDimensionalArrayThursday {
    public static void main(String[] args) {
        // syntax:
        // datatype[] variable = {value1, value2, ...};
        
        int[] ages = {24, 18, 18, 12, 20};
        
        
     //                0   1   2   3   4
     //  int[] ages = {24, 18, 18, 12, 20};

     // how to access values inside an array
        int age1 = ages [3]; 
        System.out.println(age1);
        
     // to determine the last value in an array
     // learn how to get length of an array
  
        System.out.println(ages.length); // will result total length of indices
                                         // result minus 1 will be the last index
                                         // or simply use (ages.length -1) to determine.
        System.out.println(ages[ages.length-1]); // it will get the value in the last index   
        System.out.println(ages); // it will print the hash or the memory location
        
        
       for (int i = 0; i < ages.length ; i++){ // it will print all the value inside the array 
           System.out.println(ages[i]);
       }
       
    // traverse an array using for-each loop/ enhanced for loop
        for(int age : ages){
            System.out.println(age);
        }
           
        String [] color ={"Black", "Blue", "Yellow"};
        
        String color1 = color[0];
        System.out.println(color1);
        
       
        
        
        
    }
}
