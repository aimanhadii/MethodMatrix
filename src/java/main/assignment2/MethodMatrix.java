package assignment2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MethodMatrix {

    private int [][] A;
    private int [][] B ;

    public static void main(String[] args) throws IOException {
        MethodMatrix methodMatrix = new MethodMatrix();
        methodMatrix.result(methodMatrix.multiMatrix());
        methodMatrix.writeFile(methodMatrix.multiMatrix());
    }

    public MethodMatrix() {
        this.A = new int[][]{{-9,1,3},{14,-5,7}};
        this.B = new int[][] {{1,2},{3,4},{5,6}};
    }

    public int[][] multiMatrix() {
        int [][]C = new int[2][2];

        //multiply matrices A and B and store the matrix result in C
        for(int i =0; i< 2; i++)
        {
            for(int j =0; j<2;j++)
            {
                for(int k=0; k<3; k++)
                {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public void result(int[][] C){
        for(int i =0; i<2; i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(C[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public void writeFile(int[][] C) throws IOException {
        Writer wr = new FileWriter("matrix.txt");
        for(int i =0; i<2; i++)
        {
            for(int j=0;j<2;j++)
            {
                wr.write(C[i][j]+ " ");
            }
            wr.write("\n");
        }
        wr.close();
    }
}
