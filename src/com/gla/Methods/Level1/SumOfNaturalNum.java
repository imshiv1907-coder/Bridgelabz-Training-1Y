package com.gla.Methods.Level1;
import java.util.Scanner;

public class SumOfNaturalNum {
        public static int calculateSum(int n) {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }

            return sum;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get integer input
            System.out.print("Enter a positive integer: ");
            int n = scanner.nextInt();

            if (n < 1) {
                System.out.println("Please enter a positive integer.");
            } else {
                int result = calculateSum(n);
                System.out.println("Sum of first " + n + " natural numbers is: " + result);
            }

        }

}
