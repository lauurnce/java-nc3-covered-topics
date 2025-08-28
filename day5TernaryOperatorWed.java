
package com.joysistvi.operators.day5;

/**
 * ternary operator is a one liner code that serve as alternative for if-else.
 * ? - 'then' is the block of code that will proceed if the condition is true.
 * : - 'else' if the block of code is false
 * 
 * syntax: 
 * [data type] [variable name] = [condition] ? [result if true] : [if false];
 * example:
 * String result = number % 2 == 0 ? "Even" : "Odd";
 */
public class TernaryOperatorWed {
    public static void main(String[] args) {
        //identify if the number is odd or even
        
        int number = 3; 
        String result = number % 2 == 0 ? "Even" : "Odd";
        System.out.println(result);
        
    }
}
