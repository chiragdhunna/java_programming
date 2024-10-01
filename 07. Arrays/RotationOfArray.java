/**
 * 1. Rotating a Array
 * 2. Inserting a Element in the array
 * 3. Deleting a index in the Array
 */

public class RotationOfArray {
    public static void main(String[] args) {
        int arr[] = {5,9,6,10,12,7,3,5,4,2};

        // Before Rotating Right Side
        for(int x : arr){
            System.out.print((x++)+" ");
        }

        // Shifting Right Side
        int lastElement = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
        System.out.println();

        // After Rotating Right Side
        for(int x : arr){
            System.out.print((x++)+" ");
        }

        System.out.println();


        int A[] = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;

        // Before Insertion

        for(int y : A){
            System.out.print((y++)+" ");
        }
        System.out.println();

        int x = 15;
        int index = 2;
        int currentLength = 5;

        for(int i=currentLength+1; i>index; i--){
            A[i] = A[i-1];
        }

        A[index] = x;

        // After Insertion

        for(int y : A){
            System.out.print((y++)+" ");
        }
        System.out.println();
    }
}
