package com.gla.AccessModifiers;

public class Employee {

        public String employeeID;

        // Protected member
        protected String department;

        // Private member
        private double salary;

        // Constructor
        public Employee(String employeeID, String department, double salary) {
            this.employeeID = employeeID;
            this.department = department;
            this.salary = salary;
        }

        // Public method to get salary
        public double getSalary() {
            return salary;
        }

        // Public method to modify salary
        public void setSalary(double newSalary) {
            if (newSalary >= 0) {
                this.salary = newSalary;
                System.out.println("Salary updated to $" + salary);
            } else {
                System.out.println("Invalid salary.");
            }
        }

        // Display employee details
        public void displayEmployeeDetails() {
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Department: " + department);
            System.out.println("Salary: $" + salary);
            System.out.println("------------------------");
        }
    

    // Subclass
    class Manager extends Employee {
        private String teamName;

        // Constructor
        public Manager(String employeeID, String department, double salary, String teamName) {
            super(employeeID, department, salary);
            this.teamName = teamName;
        }

        // Display manager details
        public void displayManagerDetails() {
            // Accessing public and protected members
            System.out.println("Manager Employee ID: " + employeeID); // public
            System.out.println("Department: " + department);         // protected
            System.out.println("Salary: $" + getSalary());           // private via public getter
            System.out.println("Team Name: " + teamName);
            System.out.println("------------------------");
        }
    }

    // Main class to test
    class EmployeeManagementSystem {
        public static void main(String[] args) {
            // Regular employee
            Employee emp1 = new Employee("E1001", "IT", 60000.0);
            emp1.displayEmployeeDetails();

            // Modify salary
            emp1.setSalary(65000.0);
            emp1.displayEmployeeDetails();

            // Manager
            Manager mgr = new Manager("M2001", "IT", 90000.0, "Development Team");
            mgr.displayManagerDetails();

            // Modify manager's salary
            mgr.setSalary(95000.0);
            mgr.displayManagerDetails();
        }
    }
}
