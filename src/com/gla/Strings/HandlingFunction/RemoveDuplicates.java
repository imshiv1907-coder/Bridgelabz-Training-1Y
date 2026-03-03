package com.gla.Strings.HandlingFunction;
import java.util.Scanner;

public class RemoveDuplicates {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                // Add character only if not already present
                if (result.indexOf(String.valueOf(ch)) == -1) {
                    result.append(ch);
                }
            }

            System.out.println("String after removing duplicates: " + result);

        }

}
