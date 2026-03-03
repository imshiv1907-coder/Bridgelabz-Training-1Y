package com.gla.Methods.Level2;
import java.util.Scanner;

public class UnitConverter {
    public static double convertKmToMiles(double km) {
            double km2miles = 0.621371;
            return km * km2miles;
        }

        // b. Convert miles to kilometers
        public static double convertMilesToKm(double miles) {
            double miles2km = 1.60934;
            return miles * miles2km;
        }

        // c. Convert meters to feet
        public static double convertMetersToFeet(double meters) {
            double meters2feet = 3.28084;
            return meters * meters2feet;
        }

        // d. Convert feet to meters
        public static double convertFeetToMeters(double feet) {
            double feet2meters = 0.3048;
            return feet * feet2meters;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Example usage
            System.out.print("Enter kilometers to convert to miles: ");
            double km = scanner.nextDouble();
            System.out.println("Miles: " + convertKmToMiles(km));

            System.out.print("Enter miles to convert to kilometers: ");
            double miles = scanner.nextDouble();
            System.out.println("Kilometers: " + convertMilesToKm(miles));

            System.out.print("Enter meters to convert to feet: ");
            double meters = scanner.nextDouble();
            System.out.println("Feet: " + convertMetersToFeet(meters));

            System.out.print("Enter feet to convert to meters: ");
            double feet = scanner.nextDouble();
            System.out.println("Meters: " + convertFeetToMeters(feet));

        }

}
