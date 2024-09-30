import java.util.Scanner;

class QuadraticEquation {

    static void quadraticSolution(int a, int b, int c){
        double x1 = (-b + Math.sqrt(((-4)*(a)*(c)) + Math.pow(b, 2)))/(2*a);
        double x2 = (-b - Math.sqrt(((-4)*(a)*(c)) + Math.pow(b, 2)))/(2*a);

        System.out.println("The solution to your equation is " + x1 + " and " + x2);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the second degree constant : ");
        int a = sc.nextInt();
        System.out.print("Please enter the first degree constant : ");
        int b = sc.nextInt();
        System.out.print("Please enter the constant : ");
        int c = sc.nextInt();
        sc.close();

        quadraticSolution(a,b,c);
    }
}
