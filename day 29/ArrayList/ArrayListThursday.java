
package com.joysistvi.arraylist.day29;

import java.util.ArrayList; //importing arraylist 

public class ArrayListThursday {
    
    public static void main(String[] args) {
       ArrayList<String> cars = new ArrayList <>(); 
       
       //USE CRUD
       // C -> Create Part | add() method
       cars.add("Sportivo"); 
       cars.add("Honda Civic"); //FIFO -> First In, First Out
       cars.add("Subaru"); 
       cars.add("McQueen"); 
       cars.add("Rolls Royce"); 
       cars.add(1, "Mazda"); //(index, element) -> it will place between 'Sportivo' & 'Honda Civic'
       System.out.println(cars);
       
        
       //R -> Read Part | get() method
       cars.get(0);
       System.out.println(cars.get(0)); //-> it will print 'Sportivo'
       
       //U -> Update Part | set() method
       cars.set(3, "Subawu"); 
       System.out.println(cars.set(3, "Subawu")); //-> it will change 'Subaru' to 'Subawu'
       System.out.println(cars); //-> updated ArrayList 
       
       //D -> Delete Part | .remove() method
       cars.remove(4); //-> remove thru index
       cars.remove("McQueen"); //-> remove thru object
       System.out.println(cars.remove(4)); // -> it will print the object will be deleted
       System.out.println(cars); //-> updated ArrayList after removing index 4 and "McQueen"
       cars.clear(); //-> it will remove all the object inside the ArrayList
       System.out.println(cars); //-> it will print [], no object inside 
       
       ArrayList<Integer> firstFiveEvenNumbers = new ArrayList<>(); 
       firstFiveEvenNumbers.add(2); 
       firstFiveEvenNumbers.add(4);
       firstFiveEvenNumbers.add(6); 
       firstFiveEvenNumbers.add(8); 
       firstFiveEvenNumbers.add(10); 
       
       ArrayList<Integer> firstTenEvenNumbers = new ArrayList<>(); 
       firstTenEvenNumbers.addAll(firstFiveEvenNumbers); //-> Using .addAll() 
       firstTenEvenNumbers.add(12);
       firstTenEvenNumbers.add(14);
       firstTenEvenNumbers.add(16);
       firstTenEvenNumbers.add(18); 
       firstTenEvenNumbers.add(20); 
       
       System.out.println(firstTenEvenNumbers); //-> it will print the combined methods of 'firstFiveEvenNumbers' & 'firstTenEvenNumbers'
       System.out.println(firstTenEvenNumbers.indexOf(18)); //-> it will print the index of the object you put in parameter
       
       System.out.println(firstTenEvenNumbers.size()); //-> it will print size of the ArrayList
    }
    
}
