package com.gla.Strings.HandlingFunction;
import java.util.Scanner;

public class LargestWord {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();

            // Split the sentence into words
            String[] words = sentence.split("\\s+");

            String longestWord = "";
            int maxLength = 0;

            for (String word : words) {
                // Remove punctuation from word
                word = word.replaceAll("[^a-zA-Z]", "");

                if (word.length() > maxLength) {
                    longestWord = word;
                    maxLength = word.length();
                }
            }

            System.out.println("The longest word is: " + longestWord);

        }

}
