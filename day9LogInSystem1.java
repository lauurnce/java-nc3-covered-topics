/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.looping.forloop;

import java.util.Scanner;

public class LogInSystem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regUsername = "Lawrence";
        String regPassword = "Ecnerwal";

        boolean isCredentialCorrect = false;
        do {
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (regUsername.equals(username) && regPassword.equals(password)) {
                System.out.println("Logged In Successfully");
                isCredentialCorrect = true;
            } else {
                System.out.println("Invalid Username or Password\n");
            }
        } while (!isCredentialCorrect);
    }
}
