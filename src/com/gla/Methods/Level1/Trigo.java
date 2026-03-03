package com.gla.Methods.Level1;
import java.util.Scanner;

public class Trigo {

        public static double[] calculateTrigonometricFunctions(double angle) {

            // Convert degrees to radians
            double radians = Math.toRadians(angle);

            double sine = Math.sin(radians);
            double cosine = Math.cos(radians);
            double tangent = Math.tan(radians);

            return new double[]{sine, cosine, tangent};
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Get user input
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();

            double[] result = calculateTrigonometricFunctions(angle);

            System.out.println("Sine: " + result[0]);
            System.out.println("Cosine: " + result[1]);
            System.out.println("Tangent: " + result[2]);

            scanner.close();
        }

}
