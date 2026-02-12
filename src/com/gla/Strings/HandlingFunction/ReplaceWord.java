package com.gla.Strings.HandlingFunction;
import java.util.Scanner;

public class ReplaceWord {

        public static String replaceWord(String sentence, String oldWord, String newWord) {
            return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the sentence
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();

            // Input the word to replace
            System.out.print("Enter the word to replace: ");
            String oldWord = scanner.next();

            // Input the new word
            System.out.print("Enter the new word: ");
            String newWord = scanner.next();

            // Replace the word
            String updatedSentence = replaceWord(sentence, oldWord, newWord);

            // Output the result
            System.out.println("Updated sentence: " + updatedSentence);

            scanner.close();
        }
    }

}
