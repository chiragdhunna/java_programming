/*
 * 1. Overloaded Method to calculate Area
 * 2. Overloaded Method to reverse a int or array
 * 3. Overloaded Method to validate name and age
 */

public class OverloadValidateMethod {

    static double area(double l, double b) {
        return l * b;
    }

    static double area(int r) {
        return Math.round(Math.PI * r * r);
    }

    static int reverse(int num) {
        int reversedNumber = 0;
        while (num > 0) {
            reversedNumber = (10 * reversedNumber) + (num % 10);
            num = num / 10;
        }

        return reversedNumber;
    }

    static int[] reverse(int A[]) {
        int B[] = new int[A.length];
        for (int i = A.length - 1, j = 0; i >= 0 && j < A.length; i--, j++) {
            B[j] = A[i];
        }
        return B;
    }

    static void printArray(int A[]) {
        for (int x : A) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }

    static boolean validate(int age) {
        return age >= 3 && age <= 15;
    }

    public static void main(String[] args) {
        System.out.println("Area of Rectangle with length 10 and breadth 20 is : " +
                area(10, 20));
        System.out.println("Area of circle with radius 20 is : " + area(20));
        System.out.println("Reverse of number 734 is : " + reverse(734));
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("A before reverse is ");
        printArray(A);
        System.out.println("A after reverse is ");
        A = reverse(A);
        printArray(A);
        System.out.println("Chirag1 is a validate Name ? : " + validate("Chirag1"));
        System.out.println("5 is a validate age : " + validate(5));
    }
}
