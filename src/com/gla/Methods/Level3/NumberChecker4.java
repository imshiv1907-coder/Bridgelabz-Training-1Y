package com.gla.Methods.Level3;
import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker4 {

        public static int countDigits(int number) {
            if (number == 0) return 1;
            int count = 0;
            int n = Math.abs(number);
            while (n > 0) {
                n /= 10;
                count++;
            }
            return count;
        }

        // a. Store the digits of the number in a digits array
        public static int[] storeDigits(int number) {
            int n = Math.abs(number);
            int count = countDigits(n);
            int[] digits = new int[count];
            for (int i = count - 1; i >= 0; i--) {
                digits[i] = n % 10;
                n /= 10;
            }
            return digits;
        }

        // b. Reverse a digits array
        public static int[] reverseArray(int[] arr) {
            int[] reversed = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                reversed[i] = arr[arr.length - 1 - i];
            }
            return reversed;
        }

        // c. Compare two arrays for equality
        public static boolean arraysEqual(int[] arr1, int[] arr2) {
            if (arr1.length != arr2.length) return false;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) return false;
            }
            return true;
        }

        // d. Check if a number is a palindrome using digits array
        public static boolean isPalindrome(int[] digits) {
            int[] reversed = reverseArray(digits);
            return arraysEqual(digits, reversed);
        }

        // e. Check if a number is a duck number using digits array
        // A duck number has at least one non-zero digit
        public static boolean isDuckNumber(int[] digits) {
            for (int d : digits) {
                if (d != 0) return true;
            }
            return false;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            System.out.println("\nNumber: " + number);

            // Store digits
            int[] digits = storeDigits(number);
            System.out.println("Digits array: " + Arrays.toString(digits));

            // Reverse digits
            int[] reversedDigits = reverseArray(digits);
            System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));

            // Check palindrome
            System.out.println("Is Palindrome? " + (isPalindrome(digits) ? "Yes" : "No"));

            // Check duck number
            System.out.println("Is Duck Number? " + (isDuckNumber(digits) ? "Yes" : "No"));

            scanner.close();
        }
}
