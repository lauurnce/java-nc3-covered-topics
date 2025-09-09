
package com.joysistvi.oopintro.day16;

public class main {
    
    public static void main(String[] args) {
        // Class Instantiation
        // ClassName object = new ClassName(); -> syntax 
        Laptop laptop = new Laptop();
        laptop.brand ="Hp";
        laptop.color = "Gray";
        laptop.processor = "i8";
        laptop.ramInGb = 16; 
        laptop.toCreateApplications();
        laptop.toEditVideos();
        
        
        
        Laptop laptop2  = new Laptop();
        laptop2.brand = "Acer";
        laptop2.color = "Red"; 
        laptop2.ramInGb = 8;
        laptop2.processor = "i5";
        laptop2.toEditVideos();
        
        
        Laptop laptop3 = new Laptop();
        laptop3.brand = "ROG";
        laptop3.color = "White"; 
        laptop3.ramInGb = 36;
        laptop3.processor = "i5";
        laptop3.toEditVideos();
        laptop3.toWatchVideos();
        laptop3.toCreateApplications();
    }
}
