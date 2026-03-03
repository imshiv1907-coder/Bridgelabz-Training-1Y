package com.gla.Strings.BuiltInProb;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmatic {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Define date format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Take input from user
            System.out.print("Enter a date (yyyy-MM-dd): ");
            String inputDate = scanner.nextLine();

            // Convert String to LocalDate
            LocalDate date = LocalDate.parse(inputDate, formatter);

            // Perform operations
            LocalDate result = date
                    .plusDays(7)
                    .plusMonths(1)
                    .plusYears(2)
                    .minusWeeks(3);

            // Display results
            System.out.println("Original Date: " + date);
            System.out.println("After adding 7 days, 1 month, 2 years and subtracting 3 weeks:");
            System.out.println("Final Date: " + result);

            scanner.close();
        }


}
