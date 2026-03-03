package com.gla.AccessModifiers;

public class Student {

        public int rollNumber;

        // Protected member
        protected String name;

        // Private member
        private double CGPA;

        // Constructor
        public Student(int rollNumber, String name, double CGPA) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.CGPA = CGPA;
        }

        // Public method to access CGPA
        public double getCGPA() {
            return CGPA;
        }

        // Public method to modify CGPA
        public void setCGPA(double CGPA) {
            if (CGPA >= 0.0 && CGPA <= 10.0) { // Validate CGPA
                this.CGPA = CGPA;
            } else {
                System.out.println("Invalid CGPA. Must be between 0.0 and 10.0.");
            }
        }

        // Display student details
        public void displayStudentDetails() {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("CGPA: " + CGPA);
            System.out.println("------------------------");
        }
    }

    // Subclass
    class PostgraduateStudent extends Student {

        private String specialization;

        // Constructor
        public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
            super(rollNumber, name, CGPA);
            this.specialization = specialization;
        }

        // Method to display Postgraduate student details
        public void displayPostgraduateDetails() {
            // Accessing protected member 'name' from subclass
            System.out.println("Postgraduate Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber); // Public member accessible
            System.out.println("Specialization: " + specialization);
            System.out.println("CGPA: " + getCGPA()); // Access private member via public method
            System.out.println("------------------------");
        }
    }

    // Main class to test
    class UniversityManagementSystem {
        public static void main(String[] args) {
            Student s1 = new Student(101, "Alice", 9.2);
            Student s2 = new Student(102, "Bob", 8.5);

            s1.displayStudentDetails();
            s2.displayStudentDetails();

            // Modify CGPA
            s2.setCGPA(8.9);
            System.out.println("After updating CGPA of Bob:");
            s2.displayStudentDetails();

            // Create Postgraduate student
            PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Charlie", 9.5, "Data Science");
            pgStudent.displayPostgraduateDetails();
        }

}
