package com.gla.Strings.HandlingFunction;
import java.util.Scanner;

public class StringCompare {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter String 1: ");
            String str1 = scanner.nextLine();

            System.out.print("Enter String 2: ");
            String str2 = scanner.nextLine();

            int minLength = Math.min(str1.length(), str2.length());
            boolean differenceFound = false;

            for (int i = 0; i < minLength; i++) {
                char ch1 = str1.charAt(i);
                char ch2 = str2.charAt(i);

                if (ch1 != ch2) {
                    if (ch1 < ch2) {
                        System.out.println("\"" + str1 + "\" comes BEFORE \"" + str2 + "\" lexicographically.");
                    } else {
                        System.out.println("\"" + str1 + "\" comes AFTER \"" + str2 + "\" lexicographically.");
                    }
                    differenceFound = true;
                    break;
                }
            }

            // If all characters are equal in the common length
            if (!differenceFound) {
                if (str1.length() == str2.length()) {
                    System.out.println("Both strings are EQUAL lexicographically.");
                } else if (str1.length() < str2.length()) {
                    System.out.println("\"" + str1 + "\" comes BEFORE \"" + str2 + "\" lexicographically.");
                } else {
                    System.out.println("\"" + str1 + "\" comes AFTER \"" + str2 + "\" lexicographically.");
                }
            }
        }
}
