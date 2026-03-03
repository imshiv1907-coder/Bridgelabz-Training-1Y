package com.gla.ObjectsAndClasses.Level2;
class Student {

    // Attributes
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Name  : " + name);
        System.out.println("Roll Number   : " + rollNumber);
        System.out.println("Marks         : " + marks);
        System.out.println("Grade         : " + calculateGrade());
        System.out.println("-----------------------------");
    }
}
public class StudentReport {
    public static void main(String[] args) {

        // Creating Student objects
        Student student1 = new Student("John", 101, 88);
        Student student2 = new Student("Emma", 102, 93);

        // Display details
        student1.displayDetails();
        student2.displayDetails();
    }
}
