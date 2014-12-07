import javax.swing.*;

/**
 * Created by 1 on 06.12.2014.
 */

public class MatrixMultiThreadSub {
    public static final int NUM_OF_THREADS = 9;

    public static void main(String args[]) {

        int A[][] = {{1, 4,3}, {2, 5,6}, {3, 6,9}};
        int B[][] = {{8, 7, 4}, {5, 4, 3},{3, 6,9}};

        MatrixMultiThreadSub matrixMultiThreadSub = new MatrixMultiThreadSub();
        matrixMultiThreadSub.sub(A,B);

    }

    int[][] sub(int arrA[][], int arrB[][]) {

        int row;
        int col;
        int C[][] = new int[arrA.length][arrA[0].length];
        int threadcount = 0;
        Thread[] thrd = new Thread[NUM_OF_THREADS];
        try {
            for (row = 0; row < arrA.length; row++) {
                for (col = 0; col < arrA[0].length; col++) {
                    // creating thread for multiplications
                    thrd[threadcount] = new Thread(new WorkerTh(arrA, arrB, C));
                    thrd[threadcount].start(); //thread start

                    thrd[threadcount].join(); // joining threads
                    threadcount++;
                }

            }

        } catch (InterruptedException ie) {
        }

        System.out.println(" A Matrix : ");
        for (row = 0; row < arrA.length; row++) {
            for (col = 0; col < arrA[0].length; col++) {
                System.out.print("  " + arrA[row][col]);
            }
            System.out.println();
        }

        System.out.println(" B Matrix : ");
        for (row = 0; row < arrB.length; row++) {
            for (col = 0; col < arrB[0].length; col++) {
                System.out.print("  " + arrB[row][col]);
            }
            System.out.println();
        }

        System.out.println(" Subtraction result:");
        for (row = 0; row < arrA.length; row++) {
            for (col = 0; col < arrA[0].length; col++) {
                System.out.print("  " + C[row][col]);
            }
            System.out.println();
        }
        return C;
    }


    class WorkerTh implements Runnable {
        private int A[][];
        private int B[][];
        private int C[][];

        public WorkerTh(int A[][], int B[][], int C[][]) {
            this.A = A;
            this.B = B;
            this.C = C;
        }

        @Override
        public void run() {
            for (int i = 0; i < A.length; i++) {

                for (int j = 0; j < A[0].length; j++) {
                    C[i][j] = A[i][j] - B[i][j];
                }
            }
        }
    }
}


