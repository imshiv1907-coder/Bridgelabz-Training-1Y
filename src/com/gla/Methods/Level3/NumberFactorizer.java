package com.gla.Methods.Level3;
import java.util.Scanner;
import java.util.Arrays;
public class NumberFactorizer {


        public static int[] findFactors(int number) {
            int count = 0;
            // first loop: count factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) count++;
            }

            int[] factors = new int[count];
            int index = 0;
            // second loop: store factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    factors[index++] = i;
                }
            }
            return factors;
        }

        // b. Find greatest factor using factors array
        public static int greatestFactor(int[] factors) {
            return factors[factors.length - 1]; // last element is the greatest
        }

        // c. Find sum of factors
        public static int sumOfFactors(int[] factors) {
            int sum = 0;
            for (int f : factors) sum += f;
            return sum;
        }

        // d. Find product of factors
        public static long productOfFactors(int[] factors) {
            long product = 1;
            for (int f : factors) product *= f;
            return product;
        }

        // e. Find product of cubes of factors
        public static long productOfCubesOfFactors(int[] factors) {
            long product = 1;
            for (int f : factors) product *= Math.pow(f, 3);
            return product;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int[] factors = findFactors(number);
            System.out.println("Factors: " + Arrays.toString(factors));

            System.out.println("Greatest Factor: " + greatestFactor(factors));
            System.out.println("Sum of Factors: " + sumOfFactors(factors));
            System.out.println("Product of Factors: " + productOfFactors(factors));
            System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(factors));

            scanner.close();
        }


}
