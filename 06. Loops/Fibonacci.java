public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int first = 0, second = 1;
        System.out.print(first+" , "+second);
        int i = 2;
        while(i<n){
            int temp = second;
            second = first + second;
            first = temp;
            System.out.print(" , "+ second);
            i++;
        }
    }
}
