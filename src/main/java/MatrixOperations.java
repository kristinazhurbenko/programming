/**
 * Created by 1 on 02.12.2014.
 */
import javax.swing.*;

public class MatrixOperations {

    int row, column;

    int[][] add(int[][] matrix1, int[][] matrix2) {
        row = matrix1.length;
        column = matrix1[0].length;

        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("\n\nThe Sum is :");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("\t" + result[i][j]);
            }
            System.out.println();
        }
        return result;
    }

    int[][] sub(int[][] matrix1, int[][] matrix2) {
        row = matrix1.length;
        column = matrix1[0].length;

        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("\n\nThe Subtraction is :");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("\t" + result[i][j]);
            }
            System.out.println();
        }
        return result;
    }

    int[][] multi(int[][] matrix1, int[][] matrix2) {
        row = matrix1.length;
        column = matrix1[0].length;

        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                result[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        System.out.println("\n\nThe Multiplication is :");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("\t" + result[i][j]);
            }
            System.out.println();
        }
        return result;
    }

    int[][] div(int[][] matrix1, int[][] matrix2) {
        row = matrix1.length;
        column = matrix1[0].length;

        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                try {
                    result[i][j] = matrix1[i][j] / matrix2[i][j];
                } catch (ArithmeticException e) {
                    System.out.println("\n\nThe Division to zero is not allowed!");
                    JOptionPane.showMessageDialog(null, "The Division to zero is not allowed!");
                }

            }
        }

        System.out.println("\n\nThe Division is :");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("\t" + result[i][j]);
            }
            System.out.println();
        }
        return result;
    }
}
