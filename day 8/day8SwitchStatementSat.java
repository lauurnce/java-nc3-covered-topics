package com.joysis.day7;

import java.util.Scanner;

public class SwitchStatementSat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //switch
        //mga pwede: BSIL & String
        //mga bawal: boolean, float, double | example: age range since bawal boolean
        
       
        System.out.println("Dial *143# to proceed to Load Registration");
        System.out.print("Enter numbers:");
        String dial = scanner.nextLine();

        if (dial.equals("*143#")) {
            System.out.println("\n\tLoad Registration");
            System.out.println("[1] Go+");
            System.out.println("[2] SuperGo99");
            System.out.println("[3] GoEXTRA");
            System.out.println("[4] ALLNET");
            String choice = scanner.nextLine();

            switch (choice){
                case "1": 
                    //block of code if case 1 is true
                    System.out.println("Get 8GB for all sites");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Back");
                    System.out.println("[3] Exit");
                    break;
                case "2":
                    System.out.println("Get 7GB for all sites");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Back");
                    System.out.println("[3] Exit");
                    break;
                case "3": 
                    System.out.println("Get 9GB for all sites");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Back");
                    System.out.println("[3] Exit");
                    break;

            }
            
            } else  {
                
                
            }
        } 

    }

