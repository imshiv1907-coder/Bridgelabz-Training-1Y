package com.gla.Methods.Level1;
import java.util.Scanner;

public class SICal {

        public static double calculateSimpleInterest(double principal, double rate, double time) {
            return (principal * rate * time) / 100;
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Taking user input
            System.out.print("Enter Principal amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter Rate of Interest: ");
            double rate = scanner.nextDouble();

            System.out.print("Enter Time (in years): ");
            double time = scanner.nextDouble();

            // Method call
            double simpleInterest = calculateSimpleInterest(principal, rate, time);

            // Output
            System.out.println("The Simple Interest is " + simpleInterest +
                    " for Principal " + principal +
                    ", Rate of Interest " + rate +
                    " and Time " + time);


        }


}
