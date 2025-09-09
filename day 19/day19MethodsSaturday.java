
package com.joysistvi.methods.day19;


public class MethodsSaturday {
    public static void main (String [] args){
        printName("Lawrence");
        printName("Librado");
        printName("Panes");
    }
    
    public static void printName(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + ":" + name);
        }
        
    }
       
}
