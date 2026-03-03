package com.gla.Strings.HandlingFunction;
import java.util.Scanner;

public class Toogle {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            StringBuilder toggled = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (Character.isUpperCase(ch)) {
                    toggled.append(Character.toLowerCase(ch));
                } else if (Character.isLowerCase(ch)) {
                    toggled.append(Character.toUpperCase(ch));
                } else {
                    toggled.append(ch); // Non-alphabetic characters remain unchanged
                }
            }

            System.out.println("Toggled case string: " + toggled);

        }


}
