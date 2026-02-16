package com.gla.Methods.Level2;
import java.util.Scanner;

public class UnitCon2 {

        public static double convertFahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }

        public static double convertCelsiusToFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }

        // Weight conversions
        public static double convertPoundsToKilograms(double pounds) {
            double pounds2kilograms = 0.453592;
            return pounds * pounds2kilograms;
        }

        public static double convertKilogramsToPounds(double kilograms) {
            double kilograms2pounds = 2.20462;
            return kilograms * kilograms2pounds;
        }

        // Volume conversions
        public static double convertGallonsToLiters(double gallons) {
            double gallons2liters = 3.78541;
            return gallons * gallons2liters;
        }

        public static double convertLitersToGallons(double liters) {
            double liters2gallons = 0.264172;
            return liters * liters2gallons;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Temperature examples
            System.out.print("Enter Fahrenheit to convert to Celsius: ");
            double fahrenheit = scanner.nextDouble();
            System.out.println("Celsius: " + convertFahrenheitToCelsius(fahrenheit));

            System.out.print("Enter Celsius to convert to Fahrenheit: ");
            double celsius = scanner.nextDouble();
            System.out.println("Fahrenheit: " + convertCelsiusToFahrenheit(celsius));

            // Weight examples
            System.out.print("Enter pounds to convert to kilograms: ");
            double pounds = scanner.nextDouble();
            System.out.println("Kilograms: " + convertPoundsToKilograms(pounds));

            System.out.print("Enter kilograms to convert to pounds: ");
            double kilograms = scanner.nextDouble();
            System.out.println("Pounds: " + convertKilogramsToPounds(kilograms));

            // Volume examples
            System.out.print("Enter gallons to convert to liters: ");
            double gallons = scanner.nextDouble();
            System.out.println("Liters: " + convertGallonsToLiters(gallons));

            System.out.print("Enter liters to convert to gallons: ");
            double liters = scanner.nextDouble();
            System.out.println("Gallons: " + convertLitersToGallons(liters));

        }

}
