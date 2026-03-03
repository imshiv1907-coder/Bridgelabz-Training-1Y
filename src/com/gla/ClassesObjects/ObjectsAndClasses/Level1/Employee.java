package com.gla.ObjectsAndClasses.Level1;

public class Employee {
        String name;
        int id;
        double salary;

        // Constructor
        Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        void displayDetails() {
            System.out.println("Employee Details:");
            System.out.println("Name   : " + name);
            System.out.println("ID     : " + id);
            System.out.println("Salary : " + salary);
        }

        // Main method
        public static void main(String[] args) {
            // Creating an Employee object
            Employee emp1 = new Employee("John Doe", 101, 50000.0);

            // Displaying employee details
            emp1.displayDetails();
        }


}
