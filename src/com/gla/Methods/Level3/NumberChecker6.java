package com.gla.Methods.Level3;
import java.util.Scanner;

public class NumberChecker6 {

        public static int sumOfProperDivisors(int number) {
            int sum = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) sum += i;
            }
            return sum;
        }

        // a. Check if a number is perfect
        public static boolean isPerfectNumber(int number) {
            if (number <= 0) return false;
            return sumOfProperDivisors(number) == number;
        }

        // b. Check if a number is abundant
        public static boolean isAbundantNumber(int number) {
            if (number <= 0) return false;
            return sumOfProperDivisors(number) > number;
        }

        // c. Check if a number is deficient
        public static boolean isDeficientNumber(int number) {
            if (number <= 0) return false;
            return sumOfProperDivisors(number) < number;
        }

        // Helper method: factorial of a digit
        public static int factorial(int n) {
            int fact = 1;
            for (int i = 2; i <= n; i++) fact *= i;
            return fact;
        }

        // d. Check if a number is a strong number
        public static boolean isStrongNumber(int number) {
            int n = number;
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += factorial(digit);
                n /= 10;
            }
            return sum == number;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            System.out.println("\nNumber: " + number);

            System.out.println("Is Perfect Number? " + (isPerfectNumber(number) ? "Yes" : "No"));
            System.out.println("Is Abundant Number? " + (isAbundantNumber(number) ? "Yes" : "No"));
            System.out.println("Is Deficient Number? " + (isDeficientNumber(number) ? "Yes" : "No"));
            System.out.println("Is Strong Number? " + (isStrongNumber(number) ? "Yes" : "No"));

            scanner.close();
        }

}
