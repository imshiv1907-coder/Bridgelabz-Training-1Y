package com.gla.JavaConstructors.Level1;
class Circle {
    private double radius;

    // Default constructor (calls parameterized constructor)
    public Circle() {
        this(1.0); // Default radius = 1.0
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle details
    public void displayDetails() {
        System.out.println("Radius        : " + radius);
        System.out.println("Area          : " + getArea());
        System.out.println("Circumference : " + getCircumference());
        System.out.println("---------------------------");
    }
}
public class CircleDemo { public static void main(String[] args) {

    // Using default constructor
    Circle defaultCircle = new Circle();
    defaultCircle.displayDetails();

    // Using parameterized constructor
    Circle customCircle = new Circle(5.0);
    customCircle.displayDetails();
}
}
