package com.gla.Methods.Level3;
import java.util.Scanner;

public class StudentScorecard {

        public static int[][] generateScores(int numStudents) {
            int[][] scores = new int[numStudents][3]; // Columns: 0=Physics, 1=Chemistry, 2=Maths
            for (int i = 0; i < numStudents; i++) {
                for (int j = 0; j < 3; j++) {
                    scores[i][j] = 10 + (int)(Math.random() * 91); // 10-100
                }
            }
            return scores;
        }

        // c. Calculate total, average, percentage for each student
        public static double[][] calculateTotalAvgPercentage(int[][] scores) {
            int numStudents = scores.length;
            double[][] result = new double[numStudents][3]; // Columns: 0=Total, 1=Average, 2=Percentage

            for (int i = 0; i < numStudents; i++) {
                int total = scores[i][0] + scores[i][1] + scores[i][2];
                double average = total / 3.0;
                double percentage = (total / 300.0) * 100;

                // Round to 2 decimal places
                average = Math.round(average * 100.0) / 100.0;
                percentage = Math.round(percentage * 100.0) / 100.0;

                result[i][0] = total;
                result[i][1] = average;
                result[i][2] = percentage;
            }
            return result;
        }

        // d. Display scorecard in tabular format
        public static void displayScorecard(int[][] scores, double[][] results) {
            System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
            for (int i = 0; i < scores.length; i++) {
                System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f%n",
                        i + 1, scores[i][0], scores[i][1], scores[i][2],
                        (int)results[i][0], results[i][1], results[i][2]);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter number of students: ");
            int numStudents = scanner.nextInt();

            // Step 1: Generate random scores
            int[][] scores = generateScores(numStudents);

            // Step 2: Calculate total, average, percentage
            double[][] results = calculateTotalAvgPercentage(scores);

            // Step 3: Display the scorecard
            displayScorecard(scores, results);

            scanner.close();
        }


}
