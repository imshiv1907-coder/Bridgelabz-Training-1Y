package com.gla.ObjectsAndClasses.Level1;

public class AreaOfCircle {
    double radius;

        // Constructor
        void Circle(double radius) {
            this.radius = radius;
        }


        double calculateArea() {
            return Math.PI * radius * radius;
        }


        double calculateCircumference() {
            return 2 * Math.PI * radius;
        }

        void displayDetails() {
            System.out.println("Circle Details:");
            System.out.println("Radius          : " + radius);
            System.out.println("Area            : " + calculateArea());
            System.out.println("Circumference   : " + calculateCircumference());
        }


        public static void main(String[] args) {
            // Creating Circle object
            char Circle ;
            Circle c1 = new Circle(7.0);

            // Displaying area and circumference
            c1.displayDetails();
        }

}
