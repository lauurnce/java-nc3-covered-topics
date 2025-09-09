package com.joysis.day7;

import java.util.Scanner;

public class codeprogressionLoad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dial *143# to proceed to Load Registration");
        System.out.print("Enter numbers:");
        String dial = scanner.nextLine();

        if (dial.equals("*143#")) {
            System.out.println("\n\tLoad Registration");
            System.out.println("[1] Go+");
            System.out.println("[2] SuperGo99");
            System.out.println("[3] GoEXTRA");
            System.out.println("[4] ALLNET");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("[1] Go+99");
                System.out.println("[2] G+129");
                int choiceGoPlus = scanner.nextInt();

                if (choiceGoPlus == 1) {
                    System.out.println("Get 8GB for all sites");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Back");
                    System.out.println("[3] Exit");
                    choiceGoPlus = scanner.nextInt();

                    if (choiceGoPlus == 1) {
                        System.out.println("You are already subscribed to Go+99");
                    } else {
                        
                    }
                } else {

                }
            } else  {
                
                
            }
        } else {
        }

    }
}
