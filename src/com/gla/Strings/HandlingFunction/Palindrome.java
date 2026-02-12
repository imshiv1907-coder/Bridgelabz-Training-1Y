package com.gla.Strings.HandlingFunction;
import java.util.Scanner;

public class Palindrome {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            input = input.toLowerCase();
            boolean isPalindrome = true;
            int start = 0;
            int end = input.length() - 1;
            while (start < end) {
                if (input.charAt(start) != input.charAt(end)) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }
            if (isPalindrome) {
                System.out.println("The string is a Palindrome.");
            } else {
                System.out.println("The string is NOT a Palindrome.");
            }
        }
}
