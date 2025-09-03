package com.joysistvi.methods.day21;

import java.util.Scanner;

public class Activity10_Methods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==============================");
            System.out.println("\t MAIN MENU");
            System.out.println("==============================");
            System.out.println("1. Check Odd or Even");
            System.out.println("2. Print your name 50 times");
            System.out.println("3. Get Square Root");
            System.out.println("4. Get Power of a Number");
            System.out.println("5. Get Random Number (1-100)");
            System.out.println("6. Get Area of Circle");
            System.out.println("7. Check if Eligible to Vote");
            System.out.println("8. Get Length of Word");
            System.out.println("9. Reverse a Word");
            System.out.println("10. Print Full Name and Age");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    System.out.println("Result: " + oddOrEven(num));
                    break;

                case 2:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    names(name);
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double numSq = scanner.nextDouble();
                    System.out.println("Square Root: " + square(numSq));
                    break;
                case 4:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exp = scanner.nextDouble();
                    System.out.println("Result: " + power(base, exp));
                    break;
                case 5:
                    System.out.println("Random Number: " + randomNumber());
                    break;
                case 6:
                    System.out.print("Enter radius: ");
                    double r = scanner.nextDouble();
                    System.out.println("Area of Circle: " + areaOfCircle(r));
                    break;
                case 7:
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.println(checkVoter(age));
                    break;
                case 8:
                    System.out.print("Enter a word: ");
                    String word = scanner.nextLine();
                    System.out.println("Length: " + length(word));
                    break;
                case 9:
                    System.out.print("Enter a word: ");
                    String reverse = scanner.nextLine();
                    System.out.println("Reversed: " + reverseWord(reverse));
                    break;
                case 10:
                    System.out.print("Enter full name: ");
                    String Name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int Age = scanner.nextInt();
                    printNameAndAge(Name, Age);
                    break;
                case 0:
                    System.out.println("Thank you for using this program!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
    
    public static String oddOrEven(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static void names(String name) {
        for (int i = 0; i < 50; i++) {
            System.out.println((i + 1) + ". " + name);
        }
    }

    public static double square(double num) {
        return Math.sqrt(num);
    }

    public static double power(double constant, double exponent) {
        return Math.pow(constant, exponent);
    }

    public static int randomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static String checkVoter(int age) {
        return (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
    }

    public static int length(String word) {
        return word.length();
    }

    public static String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public static void printNameAndAge(String Name, int age) {
        System.out.println("Full Name: " + Name);
        System.out.println("Age: " + age);
    }

}
