package com.joysistvi.encapsulation.day23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] student = new Student[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("\nStudent Information System");
            
            student[i] = new Student();
            System.out.print("Enter ID: ");
            int id = sc.nextInt(); // -> using scanner for getting the ID from user 
            student[i].setId(id);
            sc.nextLine();

            System.out.print("Enter your Full Name: ");
            String name = sc.nextLine();
            student[i].setName(name);

            System.out.print("Enter your Age: ");
            int age = sc.nextInt();
            student[i].setAge(age);;
            sc.nextLine();

            System.out.print("Enter your course: ");
            String course = sc.nextLine();
            student[i].setCourse(course);

        }
        
        System.out.println("=========== Student Records ===========");
        for (int i = 0; i < 3; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("ID: " + student[i].getId());
            System.out.println("Name: " + student[i].getName());
            System.out.println("Age: " + student[i].getAge());
            System.out.println("Course: " + student[i].getCourse());
            System.out.println("---------------------------------------");
        }

    }
}
