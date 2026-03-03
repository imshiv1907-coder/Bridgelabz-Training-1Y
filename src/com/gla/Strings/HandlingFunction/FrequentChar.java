package com.gla.Strings.HandlingFunction;
import java.util.Scanner;

public class FrequentChar {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Convert string to lowercase to ignore case (optional)
            input = input.toLowerCase();

            int[] freq = new int[256]; // ASCII character frequency

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                freq[ch]++;
            }

            // Find the character with the maximum frequency
            int max = -1;
            char mostFrequent = ' ';

            for (int i = 0; i < input.length(); i++) {
                if (freq[input.charAt(i)] > max) {
                    max = freq[input.charAt(i)];
                    mostFrequent = input.charAt(i);
                }
            }

            System.out.println("The most frequent character is: '" + mostFrequent + "' with frequency: " + max);

            scanner.close();
        }

}
