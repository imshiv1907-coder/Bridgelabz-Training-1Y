package com.gla.Methods.Level3;
import java.util.Scanner;

public class CollinearPoint {

        public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
            // To avoid division by zero, use cross multiplication
            int slope1Num = y2 - y1;
            int slope1Den = x2 - x1;

            int slope2Num = y3 - y2;
            int slope2Den = x3 - x2;

            int slope3Num = y3 - y1;
            int slope3Den = x3 - x1;

            // Check if slope1 == slope2 == slope3 using cross multiplication
            boolean collinear = (slope1Num * slope2Den == slope2Num * slope1Den) &&
                    (slope1Num * slope3Den == slope3Num * slope1Den);
            return collinear;
        }

        // b. Check collinear using area of triangle formula
        public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
            double area = 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
            return area == 0;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input points
            System.out.print("Enter x1 y1: ");
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();

            System.out.print("Enter x2 y2: ");
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            System.out.print("Enter x3 y3: ");
            int x3 = scanner.nextInt();
            int y3 = scanner.nextInt();

            // Check using slope method
            if (areCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
                System.out.println("The points are collinear (slope method).");
            } else {
                System.out.println("The points are NOT collinear (slope method).");
            }

            // Check using area method
            if (areCollinearByArea(x1, y1, x2, y2, x3, y3)) {
                System.out.println("The points are collinear (area method).");
            } else {
                System.out.println("The points are NOT collinear (area method).");
            }

            scanner.close();
        }

}
