
package com.joysistvi.arraylist.day30;

import java.util.HashSet;
import java.util.Random;


  
public class HashSetFriday {
    
    public static void main(String[] args) {
        HashSet<Integer> lottoNumbers = new HashSet<>();
        Random random = new Random();
        
        while(lottoNumbers.size() < 6){
            
            int randomNumber = random.nextInt(58) + 1;
            lottoNumbers.add(randomNumber);
        }
        
        System.out.println("Generated Lotto Numbers: ");   
        lottoNumbers.forEach(System.out::println);
    }
}
