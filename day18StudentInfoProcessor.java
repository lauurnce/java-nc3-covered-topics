package com.joysistvi.methods.day18;

import java.util.Scanner;

public class StudentInfoProcessor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your course name: ");
        String course = scanner.nextLine();
        System.out.print("Enter your student number: ");
        long number = scanner.nextLong();

        System.out.println("\n");
        System.out.println("=======================================================================");
        System.out.println("\t\t\tProcessed Students Information");
        System.out.println("=======================================================================");
        String format = "%-45s: %s%n";
        System.out.printf(format, "Trimmed name", name.trim());
        System.out.printf(format, "Course Name (uppercase)", course.toUpperCase());
        System.out.printf(format, "Course Name (lowercase)", course.toLowerCase());
        System.out.printf(format, "First Letter of Student's Name", name.trim().charAt(0));
        System.out.printf(format, "Number of Characters in Student's Name", name.trim().length());
        System.out.printf(format, "Is course entered contains 'Java'", course.contains("Java"));
        System.out.printf(format, "Is the name entered starts with letter 'A'?", name.startsWith("A"));
        System.out.printf(format, "Is the course entered ends with 'ing'?", course.endsWith("ing"));
        System.out.printf(format, "Course entered is converted into", course.replace(course, "Python"));
        System.out.printf(format, "Student's number displayed in string", String.valueOf(number));
    }
}
