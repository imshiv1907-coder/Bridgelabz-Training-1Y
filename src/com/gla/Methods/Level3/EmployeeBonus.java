package com.gla.Methods.Level3;
import java.util.Arrays;

public class EmployeeBonus {

        public static int[][] generateEmployeeData(int numEmployees) {
            int[][] data = new int[numEmployees][2]; // Column 0 = salary, Column 1 = years of service

            for (int i = 0; i < numEmployees; i++) {
                // Salary: random 5-digit value 10000 - 99999
                int salary = 10000 + (int)(Math.random() * 90000);
                // Years of service: random value 1 - 10
                int yearsOfService = 1 + (int)(Math.random() * 10);
                data[i][0] = salary;
                data[i][1] = yearsOfService;
            }
            return data;
        }

        // c. Calculate bonus and new salary
        public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
            int numEmployees = employeeData.length;
            double[][] result = new double[numEmployees][2]; // Column 0 = bonus, Column 1 = new salary

            for (int i = 0; i < numEmployees; i++) {
                int salary = employeeData[i][0];
                int years = employeeData[i][1];

                double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
                double newSalary = salary + bonus;

                result[i][0] = bonus;
                result[i][1] = newSalary;
            }
            return result;
        }

        // d. Calculate totals and display table
        public static void displayEmployeeBonusTable(int[][] employeeData, double[][] bonusData) {
            double totalOldSalary = 0;
            double totalNewSalary = 0;
            double totalBonus = 0;

            System.out.println("Emp No | Old Salary | Years | Bonus   | New Salary");
            System.out.println("---------------------------------------------------");

            for (int i = 0; i < employeeData.length; i++) {
                int oldSalary = employeeData[i][0];
                int years = employeeData[i][1];
                double bonus = bonusData[i][0];
                double newSalary = bonusData[i][1];

                totalOldSalary += oldSalary;
                totalNewSalary += newSalary;
                totalBonus += bonus;

                System.out.printf("%6d | %10d | %5d | %7.2f | %10.2f%n",
                        i+1, oldSalary, years, bonus, newSalary);
            }

            System.out.println("---------------------------------------------------");
            System.out.printf("Totals | %10.2f |       | %7.2f | %10.2f%n",
                    totalOldSalary, totalBonus, totalNewSalary);
        }

        public static void main(String[] args) {
            int numEmployees = 10;

            // Step 1: Generate employee salary and years of service
            int[][] employeeData = generateEmployeeData(numEmployees);

            // Step 2: Calculate bonus and new salary
            double[][] bonusData = calculateBonusAndNewSalary(employeeData);

            // Step 3: Display results
            displayEmployeeBonusTable(employeeData, bonusData);
        }


}
