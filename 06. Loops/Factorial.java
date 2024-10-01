// Printing Factorial of a number using While Loop
// Find Sum of N numbers
// Display Multiplication Table

public class Factorial {
    public static void main(String[] args) {

        // Factorial

        int n = 5;
        int factorial = 1;
        int i = 1;
        while(i<=n){
            factorial = factorial*i;
            i++;
        }
        System.out.println("Factorial is :" + factorial);

        // Sum of n numbers
        int sum = 0;
        i = 1;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("Sum is : " + sum);

        // Displaying Multiplication Table
        i = 1;
        while(i<=10){
            System.out.println(n+" * "+i+" = "+(i*n));
            i++;
        }
        
    }
}
