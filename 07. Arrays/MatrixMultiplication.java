/*
 * 1. Adding 2 matrices
 * 2. Multiplying 2 matrices
 * 3. Sorting array of Strings
 */

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,5,2},{6,8,4},{3,9,7}};
        int C[][] = new int[3][];

        // Adding 2 Matrices
        for(int i=0; i<3; i++){
            C[i] = new int[3];
        }

        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for(int x[] : C){
            for(int y : x){
                System.out.print((y++)+" ");
            }
            System.out.println();
        }

        System.out.println();

        int D[][]={{3,5,9},{7,6,2},{4,3,5}};
        int E[][]={{1,0,0},{0,1,0},{0,0,1}};
        

        // Multiplying 2 matrices
        int F[][] = new int[3][];

        for(int i=0; i<3; i++){
            F[i] = new int[3];
        }

        for(int i=0; i<D.length; i++){
            for(int j=0; j<D[0].length; j++){
                for(int k=0; k<3; k++){
                    F[i][j] += D[i][k] + E[k][j];
                }
            }
        }

        for(int x[] : F){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }

        System.out.println();

        // Sorting array of Strings
        String arr[]={"java","python","pascal","smalltalk","ada","basic"};
        Arrays.sort(arr);
        for(String x : arr){
            System.out.println(x);
        }
    }
}
