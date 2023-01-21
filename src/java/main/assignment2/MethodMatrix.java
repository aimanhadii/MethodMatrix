package assignment2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MethodMatrix {


    public static void main(String[] args) throws IOException {
        int[][] A = new int[][]{{-9, 1, 3}, {14, -5, 7}};
        int[][] B = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        int[][] C = new int[2][2];

        C = multiMatrix(A, B);
        result(C);
        writeFile(C);
    }

    public static int[][] multiMatrix(int[][] A, int[][] B) {
        int[][] C = new int[2][2];

        //multiply matrices A and B and store the matrix result in C
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public static void result(int[][] C) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void writeFile(int[][] C) throws IOException {
        Writer wr = null;

        wr = new FileWriter("matrix.txt");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                wr.write(C[i][j] + " ");
            }
            wr.write("\n");
        }
        wr.close();

    }
}
