package com.joysistvi.tentative.day24;

/**
 * ===========================================
 * 📘 Lecture: Polymorphism in Java
 * ===========================================
 *
 * 👉 Definition:
 * Polymorphism is one of the four main pillars of Object-Oriented Programming
 * (OOP), along with Encapsulation, Inheritance, and Abstraction.
 *
 * The word "polymorphism" means "many forms".
 * In Java, polymorphism allows objects of different classes to be treated
 * as objects of a common superclass.
 *
 * ===========================================
 * 🔑 Types of Polymorphism in Java:
 * 1. Compile-time Polymorphism (Method Overloading)
 *    - Achieved by having multiple methods with the same name but different
 *      parameter lists.
 *
 * 2. Runtime Polymorphism (Method Overriding)
 *    - Achieved when a subclass provides its own version of a method that
 *      is already defined in its superclass.
 *
 * ===========================================
 * 💡 Why use Polymorphism?
 * - Makes code more flexible and reusable.
 * - Allows writing general code that works on superclasses,
 *   but actually executes the subclass behavior.
 *
 * ===========================================
 * 📝 Example Scenario:
 * Imagine we have a superclass "Animal" with a method "makeSound()".
 * Each subclass (Dog, Cat) overrides "makeSound()" in its own way.
 *
 * At runtime, Java decides which version of "makeSound()" to call
 * based on the actual object type (not the reference type).
 */

class Animal {
    // Superclass method
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    // Overriding method
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}

class Cat extends Animal {
    // Overriding method
    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow! Meow!");
    }
}

public class selfStudyPolymorphism {
    public static void main(String[] args) {
        System.out.println("|========== Polymorphism in Java =========|");

        // Superclass reference but different subclass objects
        Animal myAnimal;  

        // Assign Dog object
        myAnimal = new Dog();
        myAnimal.makeSound();  // Output: The dog barks: Woof! Woof!

        // Assign Cat object
        myAnimal = new Cat();
        myAnimal.makeSound();  // Output: The cat meows: Meow! Meow!

        // Assign Animal object
        myAnimal = new Animal();
        myAnimal.makeSound();  // Output: The animal makes a sound.
    }
}
