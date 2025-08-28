
package com.joysistvi.string.day14;


public class StringClassSaturday {
    public static void main(String[] args) {
        
        String word = "java";               // String literal 
        System.out.println(word.toUpperCase());
        
        String [][] planets = {{"Mercury", "Venus", "Earth"},{"Mars", "Saturn", "Neptune"}};
        System.out.println(planets[1][0].toUpperCase().charAt(2));
//        String word2 = new String ("Java"); // String by new key word
//        System.out.println(word2);
        
//        char[] words = {'j','a','v','a'};
//        System.out.println(words);

//          using CharAt() method

        System.out.println(word.toUpperCase().charAt(2));
        
       
        

    }
}
