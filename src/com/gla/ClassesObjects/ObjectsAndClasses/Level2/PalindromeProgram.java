package com.gla.ObjectsAndClasses.Level2;

// PalindromeChecker class
class PalindromeChecker {

    // Attribute
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if text is palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }

    // Method to display result
    public void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
        System.out.println("----------------------------");
    }
}

// Main class
public class PalindromeProgram {
    public static void main(String[] args) {

        // Creating objects
        PalindromeChecker obj1 = new PalindromeChecker("Madam");
        PalindromeChecker obj2 = new PalindromeChecker("Hello");

        // Display results
        obj1.displayResult();
        obj2.displayResult();
    }
}