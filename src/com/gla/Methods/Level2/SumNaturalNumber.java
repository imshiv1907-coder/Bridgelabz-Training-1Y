package com.gla.Methods.Level2;

import java.util.Scanner;
public class SumNaturalNumber {
        public static int sumRecursive(int n) {
            if (n == 1) {
                return 1; // Base case
            } else {
                return n + sumRecursive(n - 1);
            }
        }

        // Method to calculate sum using formula n*(n+1)/2
        public static int sumFormula(int n) {
            return n * (n + 1) / 2;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get user input
            System.out.print("Enter a natural number: ");
            int n = scanner.nextInt();

            // Check if valid natural number
            if (n < 1) {
                System.out.println("Please enter a positive natural number.");
            } else {
                // Calculate sum recursively
                int sumRec = sumRecursive(n);

                // Calculate sum using formula
                int sumForm = sumFormula(n);

                // Display both results
                System.out.println("Sum using recursion: " + sumRec);
                System.out.println("Sum using formula: " + sumForm);

                // Compare results
                if (sumRec == sumForm) {
                    System.out.println("Both methods give the same result. ✅");
                } else {
                    System.out.println("There is a mismatch. ❌");
                }
            }

            scanner.close();
        }


}
