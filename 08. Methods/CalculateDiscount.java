/*
 * 1. Maximum of numbers using varargs
 * 2. Sum of all elements using varargs
 * 3. Calculate Discount using varargs
 */

public class CalculateDiscount {

    static int max(int... num) {
        int maxi = Integer.MIN_VALUE;
        for (int x : num) {
            maxi = Math.max(maxi, x);
        }
        return maxi;
    }

    static int sum(int... num) {
        int total = 0;
        for (int x : num)
            total += x;
        return total;
    }

    static double discount(double... prices) {
        double total = 0;
        for (double x : prices)
            total += x;

        if (total == 100) {
            return total * (0.9);
        } else if (total > 500) {
            return total * (0.6);
        } else {
            return total;
        }
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1,2,3,4,5,6,7,8,9 is : " + sum(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("Max of 1,2,3,4,5,6,7,8,9 is : " + max(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("Discount on 100,100,200,100,50 is : " + discount(100, 100, 200, 100, 50));
    }
}
