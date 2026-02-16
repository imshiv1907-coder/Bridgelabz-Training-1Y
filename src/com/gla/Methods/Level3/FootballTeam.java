package com.gla.Methods.Level3;
import java.util.Arrays;

public class FootballTeam {

        public static int[] generateRandomHeights(int n) {
            int[] heights = new int[n];
            for (int i = 0; i < n; i++) {
                heights[i] = (int) (Math.random() * 101) + 150; // 150 + (0-100) => 150-250
            }
            return heights;
        }

        // Method to calculate sum of array elements
        public static int sum(int[] arr) {
            int total = 0;
            for (int h : arr) {
                total += h;
            }
            return total;
        }

        // Method to calculate mean height
        public static double meanHeight(int[] heights) {
            int total = sum(heights);
            return (double) total / heights.length;
        }

        // Method to find shortest height
        public static int shortestHeight(int[] heights) {
            int min = heights[0];
            for (int h : heights) {
                if (h < min) min = h;
            }
            return min;
        }

        // Method to find tallest height
        public static int tallestHeight(int[] heights) {
            int max = heights[0];
            for (int h : heights) {
                if (h > max) max = h;
            }
            return max;
        }

        public static void main(String[] args) {
            int teamSize = 11;

            // Generate random heights
            int[] heights = generateRandomHeights(teamSize);
            System.out.println("Heights of football players (in cm): " + Arrays.toString(heights));

            // Compute statistics
            double mean = meanHeight(heights);
            int shortest = shortestHeight(heights);
            int tallest = tallestHeight(heights);

            // Display results
            System.out.printf("\nMean Height: %.2f cm\n", mean);
            System.out.println("Shortest Height: " + shortest + " cm");
            System.out.println("Tallest Height: " + tallest + " cm");
        }


}
