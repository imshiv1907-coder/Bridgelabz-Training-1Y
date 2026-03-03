package com.gla.Methods.Level3;
import java.util.Random;

public class MatrixAdvancedOperations {

        public static double[][] createRandomMatrix(int rows, int cols) {
            double[][] matrix = new double[rows][cols];
            Random rand = new Random();
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    matrix[i][j] = rand.nextInt(10); // 0-9
            return matrix;
        }

        // b. Transpose of a matrix
        public static double[][] transpose(double[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            double[][] transposed = new double[cols][rows];
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    transposed[j][i] = matrix[i][j];
            return transposed;
        }

        // c. Determinant of 2x2 matrix
        public static double determinant2x2(double[][] matrix) {
            if (matrix.length != 2 || matrix[0].length != 2)
                throw new IllegalArgumentException("Matrix must be 2x2 for this method");
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        // d. Determinant of 3x3 matrix
        public static double determinant3x3(double[][] matrix) {
            if (matrix.length != 3 || matrix[0].length != 3)
                throw new IllegalArgumentException("Matrix must be 3x3 for this method");
            double a = matrix[0][0], b = matrix[0][1], c = matrix[0][2];
            double d = matrix[1][0], e = matrix[1][1], f = matrix[1][2];
            double g = matrix[2][0], h = matrix[2][1], i = matrix[2][2];
            return a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);
        }

        // e. Inverse of 2x2 matrix
        public static double[][] inverse2x2(double[][] matrix) {
            double det = determinant2x2(matrix);
            if (det == 0) throw new ArithmeticException("Matrix is singular, cannot find inverse");
            double[][] inv = new double[2][2];
            inv[0][0] = matrix[1][1] / det;
            inv[0][1] = -matrix[0][1] / det;
            inv[1][0] = -matrix[1][0] / det;
            inv[1][1] = matrix[0][0] / det;
            return inv;
        }

        // f. Inverse of 3x3 matrix using adjoint method
        public static double[][] inverse3x3(double[][] matrix) {
            double det = determinant3x3(matrix);
            if (det == 0) throw new ArithmeticException("Matrix is singular, cannot find inverse");

            double[][] inv = new double[3][3];

            // Compute cofactors
            inv[0][0] =  (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1]) / det;
            inv[0][1] = -(matrix[0][1]*matrix[2][2] - matrix[0][2]*matrix[2][1]) / det;
            inv[0][2] =  (matrix[0][1]*matrix[1][2] - matrix[0][2]*matrix[1][1]) / det;

            inv[1][0] = -(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0]) / det;
            inv[1][1] =  (matrix[0][0]*matrix[2][2] - matrix[0][2]*matrix[2][0]) / det;
            inv[1][2] = -(matrix[0][0]*matrix[1][2] - matrix[0][2]*matrix[1][0]) / det;

            inv[2][0] =  (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]) / det;
            inv[2][1] = -(matrix[0][0]*matrix[2][1] - matrix[0][1]*matrix[2][0]) / det;
            inv[2][2] =  (matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0]) / det;

            // Transpose the cofactor matrix to get adjoint
            return transpose(inv);
        }

        // g. Display a matrix
        public static void printMatrix(double[][] matrix) {
            for (double[] row : matrix) {
                for (double val : row)
                    System.out.printf("%8.3f", val);
                System.out.println();
            }
        }

        public static void main(String[] args) {
            // Example for 2x2 matrix
            double[][] mat2x2 = createRandomMatrix(2, 2);
            System.out.println("2x2 Matrix:");
            printMatrix(mat2x2);

            System.out.println("\nTranspose:");
            printMatrix(transpose(mat2x2));

            System.out.println("\nDeterminant: " + determinant2x2(mat2x2));

            try {
                System.out.println("\nInverse:");
                printMatrix(inverse2x2(mat2x2));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

            // Example for 3x3 matrix
            double[][] mat3x3 = createRandomMatrix(3, 3);
            System.out.println("\n3x3 Matrix:");
            printMatrix(mat3x3);

            System.out.println("\nTranspose:");
            printMatrix(transpose(mat3x3));

            System.out.println("\nDeterminant: " + determinant3x3(mat3x3));

            try {
                System.out.println("\nInverse:");
                printMatrix(inverse3x3(mat3x3));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }


}
