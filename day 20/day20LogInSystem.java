
package com.joysistvi.methods.day20;

import java.util.Scanner; 

public class LogInSystem {
    
    
    public static void main(String[] args) {
        loginRegForm();
    }
    public static boolean login (String username, String password) {
        String regUsername = "admin";
        String regPassword = "admin"; 
        
        return (regUsername.equals(username)&& regPassword.equals(password));
    }
    
    public static void loginRegForm(){
        Scanner sc = new Scanner(System.in); 
        
        boolean credential = false; 

    }
}
