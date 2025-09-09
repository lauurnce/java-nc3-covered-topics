package com.joysistvi.string.day14;

public class Exercise3_String {

    public static void main(String[] args) {
        String country = "Philippines";

        System.out.println("=================================================");
        System.out.println("\t\tDisplay");
        System.out.println("\tThe word is **"+country+"**");
        System.out.println("=================================================");

        System.out.printf("%-25s: %s%n", "First character", country.charAt(0));
        System.out.printf("%-25s: %s%n", "Last character", country.charAt(country.length() - 1));

        int letterP = 0;
        for (int i = 0; i < country.length(); i++) {
            String letter = String.valueOf(country.charAt(i));
            if (letter.equalsIgnoreCase("p")) {
                letterP++;
            }
        }
        System.out.printf("%-25s: %d%n", "Number of 'P' or 'p'", letterP);

      
        int vowels0 = 0;
        String vowels1 = "aeiou";

        for (int i = 0; i < country.length(); i++) {
            char ch = Character.toLowerCase(country.charAt(i));
            if (vowels1.indexOf(ch) != -1) {
                vowels0++;
            }
        }
        System.out.printf("%-25s: %d%n", "Total vowels", vowels0);
    }
}
