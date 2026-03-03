package com.gla.Strings.HandlingFunction;
import java.util.Scanner;

public class RemoveChar {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the string
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            // Input the character to remove
            System.out.print("Enter the character to remove: ");
            char charToRemove = scanner.next().charAt(0);

            // Remove the character
            String resultString = inputString.replace(Character.toString(charToRemove), "");

            // Output the result
            System.out.println("Resulting string: " + resultString);

            scanner.close();
        }


}
