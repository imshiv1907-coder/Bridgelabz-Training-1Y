package com.gla.Methods.Level3;
import java.util.Scanner;

public class NumberChecker5 {

        public static boolean isPrime(int number) {
            if (number <= 1) return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) return false;
            }
            return true;
        }

        // b. Check if a number is a neon number
        public static boolean isNeonNumber(int number) {
            int square = number * number;
            int sum = 0;
            while (square > 0) {
                sum += square % 10;
                square /= 10;
            }
            return sum == number;
        }

        // c. Check if a number is a spy number
        public static boolean isSpyNumber(int number) {
            int sum = 0;
            int product = 1;
            int n = number;
            while (n > 0) {
                int digit = n % 10;
                sum += digit;
                product *= digit;
                n /= 10;
            }
            return sum == product;
        }

        // d. Check if a number is automorphic
        public static boolean isAutomorphicNumber(int number) {
            int square = number * number;
            String numStr = String.valueOf(number);
            String squareStr = String.valueOf(square);
            return squareStr.endsWith(numStr);
        }

        // e. Check if a number is buzz number
        public static boolean isBuzzNumber(int number) {
            return number % 7 == 0 || number % 10 == 7;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            System.out.println("\nNumber: " + number);

            // Check prime
            System.out.println("Is Prime Number? " + (isPrime(number) ? "Yes" : "No"));

            // Check neon number
            System.out.println("Is Neon Number? " + (isNeonNumber(number) ? "Yes" : "No"));

            // Check spy number
            System.out.println("Is Spy Number? " + (isSpyNumber(number) ? "Yes" : "No"));

            // Check automorphic number
            System.out.println("Is Automorphic Number? " + (isAutomorphicNumber(number) ? "Yes" : "No"));

            // Check buzz number
            System.out.println("Is Buzz Number? " + (isBuzzNumber(number) ? "Yes" : "No"));

            scanner.close();
        }


}
