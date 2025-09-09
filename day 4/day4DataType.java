
package com.joysistvi.data_type.day4; //package name


public class DataType { //class
    
    static boolean rage; //checking default value of boolean
    public static void main(String[] args){//main method
        boolean status = true; 
        byte sibling = 4;
        short age = 20;
        int cm = 169;
        int birth = 2005;
        long phone = 9652482080L;
        float height = 1.69f;
        double gpa = 1.33;
        char initial = 'L';
        String name = "Lawrence";
        
        System.out.println("Hello! My name is "+name);
        System.out.println("My initial is "+initial);
        System.out.println("I am "+age+"years old with "+sibling+" siblings.");
        System.out.println("My phone number is 0" +phone);
        System.out.println("I am "+height+" meters tall ( "+cm+"cm ).");
        System.out.println("My GPA is " +gpa);
        System.out.println("Student status:" +status);
        System.out.println("I was born in " +birth);
        System.out.println("Are you an irregular student? "+rage);
        
    }
    
}


