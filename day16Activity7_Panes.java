package com.joysistvi.math.day16;

public class Activity7_Panes {

    public static void main(String[] args) {
        int[] lotto = new int[6];

 
        System.out.println("-------------------------------");
        System.out.println("\tLotto Generator");
        System.out.println("-------------------------------");
        
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 58) + 1;

            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < lotto.length; i++) {
            System.out.println((i + 1) + ": " + lotto[i]);
        }
    }
}
