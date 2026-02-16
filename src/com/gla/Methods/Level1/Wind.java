package com.gla.Methods.Level1;
import java.util.Scanner;

public class Wind {

        public static double calculateWindChill(double temperature, double windSpeed) {

            double windChill = 35.74
                    + 0.6215 * temperature
                    + (0.4275 * temperature - 35.75)
                    * Math.pow(windSpeed, 0.16);

            return windChill;
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Get user input
            System.out.print("Enter temperature (in Fahrenheit): ");
            double temperature = scanner.nextDouble();

            System.out.print("Enter wind speed (in mph): ");
            double windSpeed = scanner.nextDouble();

            double result = calculateWindChill(temperature, windSpeed);

            System.out.println("Wind Chill Temperature: " + result);

            scanner.close();
        }


}
