package com.gla.Strings.HandlingFunction;
import java.util.Scanner;

public class VowelsCounter {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            int vowels = 0;
            int consonants = 0;

            input = input.toLowerCase();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);


                if (Character.isLetter(ch)) {


                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            System.out.println("Number of Vowels: " + vowels);
            System.out.println("Number of Consonants: " + consonants);

        }

}
