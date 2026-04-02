package com.gla.WrapperClasses.Basic;
import java.util.Scanner;

public class CharacterWrapper {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            int letters = 0;
            int digits = 0;
            int specialChars = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (Character.isLetter(ch)) {
                    letters++;
                } else if (Character.isDigit(ch)) {
                    digits++;
                } else if (!Character.isWhitespace(ch)) {
                    specialChars++;
                }
            }


            System.out.println("Total Letters: " + letters);
            System.out.println("Total Digits: " + digits);
            System.out.println("Total Special Characters: " + specialChars);

            scanner.close();

    }

}
