package com.gla.Methods.Level2;
import java.util.Scanner;

public class FriendAnaylizer {

        public static int findYoungest(int[] ages) {
            int youngestIndex = 0;
            for (int i = 1; i < ages.length; i++) {
                if (ages[i] < ages[youngestIndex]) {
                    youngestIndex = i;
                }
            }
            return youngestIndex;
        }

        // Method to find the index of the tallest friend
        public static int findTallest(double[] heights) {
            int tallestIndex = 0;
            for (int i = 1; i < heights.length; i++) {
                if (heights[i] > heights[tallestIndex]) {
                    tallestIndex = i;
                }
            }
            return tallestIndex;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] friends = {"Amar", "Akbar", "Anthony"};

            int[] ages = new int[3];
            double[] heights = new double[3];

            // Input ages and heights
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter age of " + friends[i] + ": ");
                ages[i] = scanner.nextInt();

                System.out.print("Enter height (in cm) of " + friends[i] + ": ");
                heights[i] = scanner.nextDouble();
            }

            // Find youngest
            int youngestIndex = findYoungest(ages);
            System.out.println("\nThe youngest friend is: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");

            // Find tallest
            int tallestIndex = findTallest(heights);
            System.out.println("The tallest friend is: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");


        }


}
