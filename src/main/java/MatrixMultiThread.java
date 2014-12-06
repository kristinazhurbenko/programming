/**
 * Created by 1 on 06.12.2014.
 */
import java.io.*;
import java.util.*;

/**
 *
 * @author Ryan Davis
 *
 * Multi Thread
 * This program will read a matrix from a data file, transpose it, and then
 * multiply them.  The program will output the time it took to multiply the
 * matrices.
 */
public class MatrixMultiThread {
    Scanner scan;
    static int[][] matrix1;
    static int[][] matrix2;
    static int[][] result;
    static int row, column;

    private static myThread[] threadPool;

    public static void main(String[] args){
        MatrixMultiThread matrixMultiThread = new MatrixMultiThread();
        matrixMultiThread.create();
        matrixMultiThread.display();
        matrixMultiThread.multiply();

    }
    void create() {

        scan = new Scanner(System.in);

        System.out.println("Matrix Division");

        // First Matrix Creation..
        System.out.println("\nEnter number of rows & columns");
        row = Integer.parseInt(scan.nextLine());
        column = Integer.parseInt(scan.nextLine());

        matrix1 = new int[row][column];
        matrix2 = new int[row][column];
        result = new int[row][column];

        System.out.println("Enter the data for first matrix :");

        for(int i=0; i<row; i++) {

            for(int j=0; j<column; j++) {

                matrix1[i][j] = scan.nextInt();
            }
        }

        // Second Matrix Creation..
        System.out.println("Enter the data for second matrix :");

        for(int i=0; i<row; i++) {

            for(int j=0; j<column; j++) {

                matrix2[i][j] = scan.nextInt();
            }
        }
    }

    void display() {

        System.out.println("\nThe First Matrix is :");

        for(int i=0; i<row; i++) {

            for(int j=0; j<column; j++) {

                System.out.print("\t" + matrix1[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n\nThe Second Matrix is :");

        for(int i=0; i<row; i++) {

            for(int j=0; j<column; j++) {

                System.out.print("\t" + matrix2[i][j]);
            }
            System.out.println();
        }
    }



    void multiply(){

        threadPool = new myThread[row];

        long start = System.nanoTime();//computation begins

        for(int i=0; i<row; i++) {
            threadPool[i] = new myThread(i);
            threadPool[i].start();
        }
        for(int i=0; i<row; i++){
            try{
                threadPool[i].join();
            }catch (InterruptedException e){
                //thread was interrupted
            }
        }

        System.out.println("\n\nThe Multiplication is :");

        for(int i=0; i<row; i++) {

            for(int j=0; j<column; j++) {

                System.out.print("\t" + result[i][j]);
            }
            System.out.println();
        }
        long end = System.nanoTime();//computation ends
        double time = (end-start)/1000000.0;

        System.out.println("\n Multiplication took " + time + " milliseconds.");
    }

    private static class myThread extends Thread{
        int index;

        myThread(int index){
            this.index = index;
        }

        public void run(){
            for(int i=0; i<row; i++){
                for(int j=0; j<column; j++){
                    result[i][j] = matrix1[i][j] * matrix2[i][j];
                }
            }
        }

    }
}

