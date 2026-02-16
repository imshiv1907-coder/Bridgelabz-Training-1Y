package com.gla.Methods.Level2;
import java.util.Scanner;

public class NumberAnylazer {

        public static boolean isPositive(int number) {
            return number >= 0;
        }

        // Method to check whether number is even
        public static boolean isEven(int number) {
            return number % 2 == 0;
        }

        // Method to compare two numbers
        // Returns 1 if num1 > num2, 0 if equal, -1 if num1 < num2
        public static int compare(int num1, int num2) {
            if (num1 > num2) return 1;
            else if (num1 == num2) return 0;
            else return -1;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] numbers = new int[5];

            // Take user input
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            System.out.println("\nAnalysis of numbers:");

            // Loop through array and check positive/negative and even/odd
            for (int i = 0; i < numbers.length; i++) {
                int num = numbers[i];
                if (isPositive(num)) {
                    System.out.print(num + " is positive");
                    if (isEven(num)) {
                        System.out.println(" and even.");
                    } else {
                        System.out.println(" and odd.");
                    }
                } else {
                    System.out.println(num + " is negative.");
                }
            }

            // Compare first and last elements
            int comparison = compare(numbers[0], numbers[numbers.length - 1]);
            System.out.print("\nComparison of first and last elements: ");
            if (comparison == 1) {
                System.out.println(numbers[0] + " is greater than " + numbers[numbers.length - 1]);
            } else if (comparison == 0) {
                System.out.println(numbers[0] + " is equal to " + numbers[numbers.length - 1]);
            } else {
                System.out.println(numbers[0] + " is less than " + numbers[numbers.length - 1]);
            }

            scanner.close();
        }

}
