package com.gla.Methods.Level2;
import java.util.Scanner;

public class BMICal {

        public static void calculateBMI(double[][] data) {
            for (int i = 0; i < data.length; i++) {
                double weight = data[i][0];          // Weight in kg
                double heightCm = data[i][1];        // Height in cm
                double heightM = heightCm / 100.0;   // Convert cm to meters
                double bmi = weight / (heightM * heightM);
                data[i][2] = bmi;                    // Store BMI in 3rd column
            }
        }

        // Method to determine BMI status based on BMI value
        public static String[] determineBMIStatus(double[][] data) {
            String[] status = new String[data.length];
            for (int i = 0; i < data.length; i++) {
                double bmi = data[i][2];
                if (bmi < 18.5) {
                    status[i] = "Underweight";
                } else if (bmi >= 18.5 && bmi < 25) {
                    status[i] = "Normal weight";
                } else if (bmi >= 25 && bmi < 30) {
                    status[i] = "Overweight";
                } else {
                    status[i] = "Obese";
                }
            }
            return status;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int members = 10;
            double[][] data = new double[members][3]; // weight, height, BMI

            // Input weight and height for 10 members
            for (int i = 0; i < members; i++) {
                System.out.println("Enter details for member " + (i + 1) + ":");
                System.out.print("Weight (kg): ");
                data[i][0] = scanner.nextDouble();
                System.out.print("Height (cm): ");
                data[i][1] = scanner.nextDouble();
            }

            // Calculate BMI
            calculateBMI(data);

            // Determine BMI status
            String[] status = determineBMIStatus(data);

            // Display results
            System.out.println("\nMember\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
            System.out.println("--------------------------------------------------------------");
            for (int i = 0; i < members; i++) {
                System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                        i + 1, data[i][0], data[i][1], data[i][2], status[i]);
            }

            scanner.close();
        }

}
