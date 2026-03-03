package com.gla.InstanceAndClassVariable;

public class Course {// Course.java

        private String courseName;
        private int duration; // in weeks
        private double fee;

        // Class variable (common to all courses)
        private static String instituteName = "Default Institute";

        // Constructor
        public Course(String courseName, int duration, double fee) {
            this.courseName = courseName;
            this.duration = duration;
            this.fee = fee;
        }

        // Instance method to display course details
        public void displayCourseDetails() {
            System.out.println("Institute: " + instituteName);
            System.out.println("Course Name: " + courseName);
            System.out.println("Duration: " + duration + " weeks");
            System.out.println("Fee: $" + fee);
            System.out.println("-------------------------");
        }

        // Class method to update the institute name for all courses
        public static void updateInstituteName(String newInstituteName) {
            instituteName = newInstituteName;
            System.out.println("Institute name updated to: " + instituteName);
        }

        // Main method to test
        public static void main(String[] args) {
            // Create courses
            Course course1 = new Course("Java Programming", 8, 500.0);
            Course course2 = new Course("Web Development", 12, 700.0);

            // Display course details
            course1.displayCourseDetails();
            course2.displayCourseDetails();

            // Update institute name
            Course.updateInstituteName("Elite Tech Academy");

            // Display course details again to see updated institute name
            course1.displayCourseDetails();
            course2.displayCourseDetails();
        }
 }
