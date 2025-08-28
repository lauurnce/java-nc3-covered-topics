/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.array1.day13;

import java.util.Scanner;

public class ContinuationOfMultiDimensionalArrayFriday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter number of rows: ");
        int noOfRows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int noOfColumns = scanner.nextInt();
        scanner.nextLine();
        String[][] colors = new String[noOfRows][noOfColumns];
        
        
//        colors[0][0] = "Blue";
//        colors[0][1] = "Black";
//        colors[0][2] = "Pink";
//        colors[0][3] = "Purple";
//        colors[1][0] = "White";
//        colors[1][1] = "Yellow";
//        colors[1][2] = "Violet";
//        colors[1][3] = "Cyan";
        
        System.out.println("\nPrinting all the colors");
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.print("Enter color ["+ i + "][" + j + "]:");
                colors[i][j] = scanner.nextLine();
            }
            System.out.println("");
        }
        
        System.out.println("\nPrinting all the colors:");
        for (String[] rows : colors) {
            for (String columns : rows) {
                System.out.println(columns);
            }
            System.out.println("");
        }
        
    }
}
