/*
 * 1. Copying an Array
 * 2. Reverse Copying an Array
 * 3. Increasing Size of Array
 */

public class IncreaseSizeOfArray {
    public static void main(String[] args) {
        int A[] = {8,6,10,9,2,15,7,13,14,11};

        for(int x : A){
            System.out.print((x++)+" ");
        }
        System.out.println();

        // Copying a Array
        int B[] = new int[A.length];
        for(int i =0; i<A.length; i++){
            B[i] = A[i];
        }

        for(int x : B){
            System.out.print((x++)+" ");
        }
        System.out.println();

        // Reverse Copying
        for(int i =A.length-1,j=0; i>=0 && j>=0; i--,j++){
            B[i] = A[j];
        }

        for(int x : B){
            System.out.print((x++)+" ");
        }
        System.out.println();

        // Increasing size of an Array
        int C[] = new int[100];
        for(int i=0; i<B.length; i++){
            C[i] = B[i];
        }

        B = C;

        for(int x : B){
            System.out.print((x++)+" ");
        }
        System.out.println();
    }
}
