package com.gla.Methods.Level3;
import java.util.Arrays;

public class NumberChecker {

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

        // b. Method to store digits in an array
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

        // c. Check if number is a duck number
        // A duck number has at least one non-zero digit
        public static boolean isDuckNumber(int[] digits) {
            for (int digit : digits) {
                if (digit != 0) return true;
            }
            return false;
        }

        // d. Check if number is an Armstrong number
        public static boolean isArmstrongNumber(int[] digits) {
            int n = digits.length;
            int sum = 0;
            for (int digit : digits) {
                sum += Math.pow(digit, n);
            }
            int number = 0;
            for (int digit : digits) {
                number = number * 10 + digit;
            }
            return sum == number;
        }

        // e. Find largest and second largest digit
        public static int[] findLargestAndSecondLargest(int[] digits) {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            for (int digit : digits) {
                if (digit > largest) {
                    secondLargest = largest;
                    largest = digit;
                } else if (digit > secondLargest && digit != largest) {
                    secondLargest = digit;
                }
            }
            return new int[]{largest, secondLargest};
        }

        // f. Find smallest and second smallest digit
        public static int[] findSmallestAndSecondSmallest(int[] digits) {
            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;
            for (int digit : digits) {
                if (digit < smallest) {
                    secondSmallest = smallest;
                    smallest = digit;
                } else if (digit < secondSmallest && digit != smallest) {
                    secondSmallest = digit;
                }
            }
            return new int[]{smallest, secondSmallest};
        }

        public static void main(String[] args) {
            int number = 153; // You can change the number or take user input

            System.out.println("Number: " + number);

            // Count digits
            int count = countDigits(number);
            System.out.println("Number of digits: " + count);

            // Store digits
            int[] digits = storeDigits(number);
            System.out.println("Digits array: " + Arrays.toString(digits));

            // Check duck number
            System.out.println("Is Duck Number? " + (isDuckNumber(digits) ? "Yes" : "No"));

            // Check Armstrong number
            System.out.println("Is Armstrong Number? " + (isArmstrongNumber(digits) ? "Yes" : "No"));

            // Largest and second largest
            int[] largestPair = findLargestAndSecondLargest(digits);
            System.out.println("Largest Digit: " + largestPair[0] + ", Second Largest: " + largestPair[1]);

            // Smallest and second smallest
            int[] smallestPair = findSmallestAndSecondSmallest(digits);
            System.out.println("Smallest Digit: " + smallestPair[0] + ", Second Smallest: " + smallestPair[1]);
        }

}
