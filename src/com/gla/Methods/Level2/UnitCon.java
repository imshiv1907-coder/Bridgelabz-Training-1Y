package com.gla.Methods.Level2;
import java.util.Scanner;

public class UnitCon {

        public static double convertYardsToFeet(double yards) {
            double yards2feet = 3;
            return yards * yards2feet;
        }

        // b. Convert feet to yards
        public static double convertFeetToYards(double feet) {
            double feet2yards = 0.333333;
            return feet * feet2yards;
        }

        // c. Convert meters to inches
        public static double convertMetersToInches(double meters) {
            double meters2inches = 39.3701;
            return meters * meters2inches;
        }

        // d. Convert inches to meters
        public static double convertInchesToMeters(double inches) {
            double inches2meters = 0.0254;
            return inches * inches2meters;
        }

        // e. Convert inches to centimeters
        public static double convertInchesToCentimeters(double inches) {
            double inches2cm = 2.54;
            return inches * inches2cm;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Example usage
            System.out.print("Enter yards to convert to feet: ");
            double yards = scanner.nextDouble();
            System.out.println("Feet: " + convertYardsToFeet(yards));

            System.out.print("Enter feet to convert to yards: ");
            double feet = scanner.nextDouble();
            System.out.println("Yards: " + convertFeetToYards(feet));

            System.out.print("Enter meters to convert to inches: ");
            double meters = scanner.nextDouble();
            System.out.println("Inches: " + convertMetersToInches(meters));

            System.out.print("Enter inches to convert to meters: ");
            double inches = scanner.nextDouble();
            System.out.println("Meters: " + convertInchesToMeters(inches));

            System.out.print("Enter inches to convert to centimeters: ");
            inches = scanner.nextDouble();
            System.out.println("Centimeters: " + convertInchesToCentimeters(inches));


        }

}
