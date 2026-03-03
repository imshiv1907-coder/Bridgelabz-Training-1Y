package com.gla.Methods.Level1;
import java.util.Scanner;

public class ChocoDistribution {

        public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {

            int chocolatesPerChild = numberOfChocolates / numberOfChildren;
            int remainingChocolates = numberOfChocolates % numberOfChildren;

            return new int[]{chocolatesPerChild, remainingChocolates};
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Get user input
            System.out.print("Enter the number of chocolates: ");
            int numberOfChocolates = scanner.nextInt();

            System.out.print("Enter the number of children: ");
            int numberOfChildren = scanner.nextInt();

            // Check division by zero
            if (numberOfChildren == 0) {
                System.out.println("Number of children cannot be zero.");
            } else {
                int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

                System.out.println("Each child will get: " + result[0] + " chocolates");
                System.out.println("Remaining chocolates: " + result[1]);
            }

        }


}
