package com.gla.Methods.Level1;
import java.util.Scanner;

public class QuatientRem {

        public static int[] findRemainderAndQuotient(int number, int divisor) {

            int quotient = number / divisor;
            int remainder = number % divisor;

            return new int[]{quotient, remainder};
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Take user input
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            // Check division by zero
            if (divisor == 0) {
                System.out.println("Division by zero is not allowed.");
            } else {
                int[] result = findRemainderAndQuotient(number, divisor);

                System.out.println("Quotient: " + result[0]);
                System.out.println("Remainder: " + result[1]);
            }


        }


}
