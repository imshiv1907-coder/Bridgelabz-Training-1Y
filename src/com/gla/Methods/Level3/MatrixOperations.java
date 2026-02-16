package com.gla.Methods.Level3;
import java.util.Random;

public class MatrixOperations {

        public static int[][] createRandomMatrix(int rows, int cols) {
            int[][] matrix = new int[rows][cols];
            Random rand = new Random();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = rand.nextInt(10); // Random numbers 0-9
                }
            }
            return matrix;
        }

        // b. Add two matrices
        public static int[][] addMatrices(int[][] A, int[][] B) {
            int rows = A.length;
            int cols = A[0].length;
            int[][] sum = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sum[i][j] = A[i][j] + B[i][j];
                }
            }
            return sum;
        }

        // c. Subtract two matrices
        public static int[][] subtractMatrices(int[][] A, int[][] B) {
            int rows = A.length;
            int cols = A[0].length;
            int[][] diff = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    diff[i][j] = A[i][j] - B[i][j];
                }
            }
            return diff;
        }

        // d. Multiply two matrices
        public static int[][] multiplyMatrices(int[][] A, int[][] B) {
            int rowsA = A.length;
            int colsA = A[0].length;
            int rowsB = B.length;
            int colsB = B[0].length;

            if (colsA != rowsB) {
                throw new IllegalArgumentException("Matrix multiplication not possible: columns of A != rows of B");
            }

            int[][] product = new int[rowsA][colsB];
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        product[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            return product;
        }

        // Utility method to print a matrix
        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int val : row) {
                    System.out.printf("%4d", val);
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            // Define matrix sizes
            int rows = 3;
            int cols = 3;

            // Step 1: Generate two random matrices
            int[][] matrixA = createRandomMatrix(rows, cols);
            int[][] matrixB = createRandomMatrix(rows, cols);

            System.out.println("Matrix A:");
            printMatrix(matrixA);

            System.out.println("\nMatrix B:");
            printMatrix(matrixB);

            // Step 2: Add matrices
            int[][] sum = addMatrices(matrixA, matrixB);
            System.out.println("\nA + B:");
            printMatrix(sum);

            // Step 3: Subtract matrices
            int[][] diff = subtractMatrices(matrixA, matrixB);
            System.out.println("\nA - B:");
            printMatrix(diff);

            // Step 4: Multiply matrices
            int[][] product = multiplyMatrices(matrixA, matrixB);
            System.out.println("\nA * B:");
            printMatrix(product);
        }


}
