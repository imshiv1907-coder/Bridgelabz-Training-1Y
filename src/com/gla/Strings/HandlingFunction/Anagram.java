package com.gla.Strings.HandlingFunction;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input two strings
            System.out.print("Enter the first string: ");
            String str1 = scanner.nextLine();

            System.out.print("Enter the second string: ");
            String str2 = scanner.nextLine();

            // Remove spaces and convert to lowercase for uniformity
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            if (areAnagrams(str1, str2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are NOT anagrams.");
            }

            scanner.close();
        }

        public static boolean areAnagrams(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }

            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        }


}
