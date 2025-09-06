/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysitvi.inheritance.day25;


//Child Class / Sub Class
public class Car extends Vehicle {
    public void displaySpecs() {
         Car car = new Car(); 
         car.brand = "Izusu Sportivo"; 
         car.countOfWheels = 4; 
         car.color = "Midnight Blue"; 
         
         
         System.out.println("Car Specification");
         System.out.println(car.brand);
    }
   
}
