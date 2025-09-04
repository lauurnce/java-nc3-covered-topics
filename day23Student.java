/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.encapsulation.day23;

/**
 *
 * @author Admin
 */
public class Student {
   
    // data members
    int id; 
    String name; 
    String address; 
    int age; 
    String course; 
    
    // mutator method /setter
    public void setId(int id){
        this.id = id;
    }
    
    // accessor method / getter 
    public int getId (){
        return id; // return -> to get any data member 
    }       
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age; 
    }
    
    public void setCourse(String course){
        this.course = course;
    }
    
    public String getCourse(){
        return course; 
    }
}

/*
    TO MAKE A FULLY ENCAPSULATED CLASS: 
    1. privitize all the data members -> data hiding
    2. use setter and getter methods to set and get data -> data validation
    */