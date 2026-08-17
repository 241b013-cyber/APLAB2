import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input Matrix A
            System.out.print("Enter rows and columns of Matrix A: ");
            int rowsA = sc.nextInt();
            int colsA = sc.nextInt();
            int[][] A = new int[rowsA][colsA];
            System.out.println("Enter elements of Matrix A:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsA; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            // Input Matrix B
            System.out.print("Enter rows and columns of Matrix B: ");
            int rowsB = sc.nextInt();
            int colsB = sc.nextInt();
            int[][] B = new int[rowsB][colsB];
            System.out.println("Enter elements of Matrix B:");
            for (int i = 0; i < rowsB; i++) {
                for (int j = 0; j < colsB; j++) {
                    B[i][j] = sc.nextInt();
                }
            }

            // Dimension check
            if (colsA != rowsB) {
                throw new MatrixMismatchException("Matrix dimensions incompatible for multiplication");
            }

            // Result matrix
            int[][] result = new int[rowsA][colsB];

            // Multiplication
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        result[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            // Print result
            System.out.println("Resultant Matrix:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }

        } catch (MatrixMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
