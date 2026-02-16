package com.gla.Methods.Level1;
import java.util.Scanner;

public class HandshakeCal {


        // Method to calculate maximum handshakes
        public static int calculateHandshakes(int numberOfStudents) {
            return (numberOfStudents * (numberOfStudents - 1)) / 2;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get integer input
            System.out.print("Enter the number of students: ");
            int numberOfStudents = scanner.nextInt();

            // Calculate handshakes
            int handshakes = calculateHandshakes(numberOfStudents);

            // Display result
            System.out.println("Maximum number of possible handshakes: " + handshakes);


        }


}
