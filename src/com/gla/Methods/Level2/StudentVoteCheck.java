package com.gla.Methods.Level2;
import java.util.Scanner;

public class StudentVoteCheck {

        public boolean canStudentVote(int age) {
            if (age < 0) {
                // Invalid age
                return false;
            } else if (age >= 18) {
                // Eligible to vote
                return true;
            } else {
                // Not eligible
                return false;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            StudentVoteChecker checker = new  StudentVoteChecker();

            // Array to store ages of 10 students
            int[] ages = new int[10];

            // Take input for 10 students
            for (int i = 0; i < ages.length; i++) {
                System.out.print("Enter age of student " + (i + 1) + ": ");
                ages[i] = scanner.nextInt();
            }

            System.out.println("\nVoting Eligibility Results:");
            // Check voting eligibility for each student
            for (int i = 0; i < ages.length; i++) {
                boolean canVote = checker.canStudentVote(ages[i]);
                if (canVote) {
                    System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") can vote.");
                } else {
                    System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") cannot vote.");
                }
            }


        }

}
