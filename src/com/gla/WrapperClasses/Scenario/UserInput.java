package com.gla.WrapperClasses.Scenario;
import java.util.Scanner;

public class UserInput {

        public static boolean isValidAge(String input) {
            try {
                int age = Integer.parseInt(input);
                return age >= 18;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your age: ");
            String userInput = scanner.nextLine();

            if (isValidAge(userInput)) {
                System.out.println("Valid age. Signup allowed.");
            } else {
                System.out.println("Invalid age. Signup denied.");
            }

            scanner.close();
        }


}
