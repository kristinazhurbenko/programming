/**
 * Created by 1 on 06.12.2014.
 */

public class MatrixMultiThreadMult {
    public static final int NUM_OF_THREADS = 9;

    public static void main(String args[]) {

        int A[][] = {{1, 4}, {2, 5}, {3, 6}};
        int B[][] = {{8, 7, 6}, {5, 4, 3}};
        MatrixMultiThreadMult matrixMultiThread = new MatrixMultiThreadMult();
        matrixMultiThread.multiply(A, B);

    }

    int[][] multiply(int arrA[][], int arrrB[][]) {

        int row;
        int col;
        int C[][] = new int[arrA.length][arrA[0].length];
        int threadcount = 0;
        Thread[] thrd = new Thread[NUM_OF_THREADS];
        try {
            for (row = 0; row < arrA.length; row++) {
                for (col = 0; col < arrA[0].length; col++) {
                    // creating thread for multiplications
                    thrd[threadcount] = new Thread(new WorkerTh(row, col, arrA, arrrB, C));
                    thrd[threadcount].start(); //thread start

                    thrd[threadcount].join(); // joining threads
                    threadcount++;
                }
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println(" A Matrix : ");
        for (row = 0; row < arrA.length; row++) {
            for (col = 0; col < arrA[0].length; col++) {
                System.out.print("  " + arrA[row][col]);
            }
            System.out.println();
        }

        System.out.println(" B Matrix : ");
        for (row = 0; row < arrrB.length; row++) {
            for (col = 0; col < arrrB[0].length; col++) {
                System.out.print("  " + arrrB[row][col]);
            }
            System.out.println();
        }

        System.out.println(" Multiplication result: ");
        for (row = 0; row < arrA.length; row++) {
            for (col = 0; col < arrA[0].length; col++) {
                System.out.print("  " + C[row][col]);
            }
            System.out.println();
        }
        return C;
    }


    class WorkerTh implements Runnable {
        private int row;
        private int col;
        private int A[][];
        private int B[][];
        private int C[][];

        public WorkerTh(int row, int col, int A[][], int B[][], int C[][]) {
            this.row = row;
            this.col = col;
            this.A = A;
            this.B = B;
            this.C = C;
        }

        @Override
        public void run() {
            for (int k = 0; k < A.length; k++) {
                C[row][col] += A[row][k] * B[k][col];
            }
        }
    }
}

