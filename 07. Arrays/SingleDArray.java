public class SingleDArray {
    public static void main(String[] args) {
        int A[] = {1,2,3};
        int B[] = new int[3];
        for(int i=0; i<3; i++){
            System.out.print(A[i]+" ");
            B[i] = A[3-i-1];
        }

        System.out.println();

        for(int i:B){
            System.out.print((i++)+" ");
        }

        System.out.println();
    }
}
