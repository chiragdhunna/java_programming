/*
 * 1. Find number is prime
 * 2. Find GCD of 2 Numbers
 * 3. Find Max Element in an Array
 */

public class FindPrimeNumber {

    static boolean isPrime(int num) {
        if (num == 2)
            return true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    static int gcd(int a, int b) {

        int mini = Math.min(a, b);
        int result = 1;

        for (int i = 1; i <= mini; i++) {
            if (a % i == 0 && b % i == 0)
                result = i;
        }

        return result;
    }

    static int greatestElement(int A[]) {
        int maxi = Integer.MIN_VALUE;
        for (int x : A) {
            if (x > maxi)
                maxi = x;
        }
        return maxi;
    }

    public static void main(String[] args) {
        System.out.println("Is 7 Prime? : " + isPrime(7));
        System.out.println("GCD of 6 and 3 is : " + gcd(3, 6));
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Greatest element in array A is : " + greatestElement(A));
    }
}
