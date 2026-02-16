package com.gla.Methods.Level3;
import java.util.Arrays;

public class NumberCheck {

        public static int countDigits(int number) {
            if (number == 0) return 1;
            int count = 0;
            int n = Math.abs(number);
            while (n > 0) {
                n /= 10;
                count++;
            }
            return count;
        }

        // a. Store digits in an array
        public static int[] storeDigits(int number) {
            int n = Math.abs(number);
            int count = countDigits(n);
            int[] digits = new int[count];
            for (int i = count - 1; i >= 0; i--) {
                digits[i] = n % 10;
                n /= 10;
            }
            return digits;
        }

        // b. Sum of digits
        public static int sumOfDigits(int[] digits) {
            int sum = 0;
            for (int d : digits) sum += d;
            return sum;
        }

        // c. Sum of squares of digits
        public static int sumOfSquaresOfDigits(int[] digits) {
            int sum = 0;
            for (int d : digits) sum += Math.pow(d, 2);
            return sum;
        }

        // d. Check if number is a Harshad number
        public static boolean isHarshadNumber(int number, int[] digits) {
            int sum = sumOfDigits(digits);
            if (sum == 0) return false; // avoid division by zero
            return number % sum == 0;
        }

        // e. Find frequency of each digit
        public static int[][] digitFrequency(int[] digits) {
            int[][] freq = new int[10][2]; // column 0: digit, column 1: frequency
            for (int i = 0; i < 10; i++) freq[i][0] = i; // store digit
            for (int d : digits) freq[d][1]++; // increment frequency
            return freq;
        }

        public static void main(String[] args) {
            int number = 1729; // example number; can be replaced by user input

            System.out.println("Number: " + number);

            // Store digits
            int[] digits = storeDigits(number);
            System.out.println("Digits array: " + Arrays.toString(digits));

            // Sum of digits
            int sumDigits = sumOfDigits(digits);
            System.out.println("Sum of digits: " + sumDigits);

            // Sum of squares of digits
            int sumSquares = sumOfSquaresOfDigits(digits);
            System.out.println("Sum of squares of digits: " + sumSquares);

            // Check Harshad number
            System.out.println("Is Harshad Number? " + (isHarshadNumber(number, digits) ? "Yes" : "No"));

            // Frequency of digits
            int[][] freq = digitFrequency(digits);
            System.out.println("\nDigit Frequencies:");
            System.out.println("Digit | Frequency");
            for (int i = 0; i < freq.length; i++) {
                if (freq[i][1] > 0) { // only print digits that appear
                    System.out.println("  " + freq[i][0] + "   |    " + freq[i][1]);
                }
            }
        }


}
