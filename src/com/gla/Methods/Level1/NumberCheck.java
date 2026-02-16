package com.gla.Methods.Level1;
import java.util.Scanner;

public class NumberCheck {

        public static int checkNumber(int number) {
            if (number > 0) {
                return 1;     // Positive
            } else if (number < 0) {
                return -1;    // Negative
            } else {
                return 0;     // Zero
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get integer input
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            // Call method
            int result = checkNumber(number);

            // Display result
            if (result == 1) {
                System.out.println("The number is Positive.");
            } else if (result == -1) {
                System.out.println("The number is Negative.");
            } else {
                System.out.println("The number is Zero.");
            }


        }


}
