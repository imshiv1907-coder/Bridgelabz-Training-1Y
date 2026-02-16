package com.gla.Methods.Level3;
import java.util.Scanner;

public class LineDistanceCalculator {

        public static double euclideanDistance(double x1, double y1, double x2, double y2) {
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            return distance;
        }

        // c. Find equation of line y = m*x + b
        public static double[] lineEquation(double x1, double y1, double x2, double y2) {
            double m; // slope
            double b; // y-intercept

            if (x2 - x1 == 0) {
                // Vertical line case, slope is infinite
                m = Double.POSITIVE_INFINITY;
                b = Double.NaN; // y-intercept undefined
            } else {
                m = (y2 - y1) / (x2 - x1);
                b = y1 - m * x1;
            }

            return new double[]{m, b};
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input points
            System.out.print("Enter x1 y1: ");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();

            System.out.print("Enter x2 y2: ");
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();

            // Calculate Euclidean distance
            double distance = euclideanDistance(x1, y1, x2, y2);
            System.out.printf("Euclidean distance between the points: %.4f%n", distance);

            // Calculate line equation
            double[] equation = lineEquation(x1, y1, x2, y2);
            double slope = equation[0];
            double intercept = equation[1];

            if (Double.isInfinite(slope)) {
                System.out.println("The line is vertical: x = " + x1);
            } else {
                System.out.printf("Equation of the line: y = %.4fx + %.4f%n", slope, intercept);
            }

            scanner.close();
        }

}
