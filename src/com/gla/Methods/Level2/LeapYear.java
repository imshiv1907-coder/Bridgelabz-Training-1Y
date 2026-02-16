package com.gla.Methods.Level2;

import java.util.Scanner;
public class LeapYear {
        public static boolean isLeapYear(int year) {

            // Only valid for Gregorian calendar
            if (year < 1582) {
                return false;
            }

            // Leap year conditions
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get user input
            System.out.print("Enter a year (>= 1582): ");
            int year = scanner.nextInt();

            if (year < 1582) {
                System.out.println("Year must be 1582 or later (Gregorian calendar).");
            } else {
                if (isLeapYear(year)) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is NOT a Leap Year.");
                }
            }

        }

}
