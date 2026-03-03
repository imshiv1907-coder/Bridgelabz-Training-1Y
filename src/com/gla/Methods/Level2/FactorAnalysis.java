package com.gla.Methods.Level2;
import java.util.Scanner;

public class FactorAnalysis {

        public static int[] findFactors(int number) {
            int count = 0;

            // First loop to count number of factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }

            // Initialize array with count
            int[] factors = new int[count];
            int index = 0;

            // Second loop to store factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    factors[index] = i;
                    index++;
                }
            }

            return factors;
        }

        // Method to calculate sum of factors
        public static int sumOfFactors(int[] factors) {
            int sum = 0;
            for (int factor : factors) {
                sum += factor;
            }
            return sum;
        }

        // Method to calculate product of factors
        public static int productOfFactors(int[] factors) {
            int product = 1;
            for (int factor : factors) {
                product *= factor;
            }
            return product;
        }

        // Method to calculate sum of squares of factors
        public static int sumOfSquares(int[] factors) {
            int sumSq = 0;
            for (int factor : factors) {
                sumSq += Math.pow(factor, 2);
            }
            return sumSq;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Find factors
            int[] factors = findFactors(number);

            // Display factors
            System.out.print("Factors: ");
            for (int factor : factors) {
                System.out.print(factor + " ");
            }
            System.out.println();

            // Calculate and display sum
            int sum = sumOfFactors(factors);
            System.out.println("Sum of factors: " + sum);

            // Calculate and display sum of squares
            int sumSq = sumOfSquares(factors);
            System.out.println("Sum of squares of factors: " + sumSq);

            // Calculate and display product
            int product = productOfFactors(factors);
            System.out.println("Product of factors: " + product);

            scanner.close();
        }


}
