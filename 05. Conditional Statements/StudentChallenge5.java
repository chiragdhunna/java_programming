// Menu Driven Program for Arthmetic Operations

import java.util.Scanner;

public class StudentChallenge5 {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. ADD");
        System.out.println("2. SUB");
        System.out.println("3. MUL");
        System.out.println("4. DIV");
        System.out.print("Enter 2 numbers : ");
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.nextLine();

        System.out.println("");
        System.out.print("Enter the operation in words : ");

        String operation = scan.nextLine();

        switch (operation) {
            case "ADD":
                System.out.println("Result is : "+ (num1+num2) );
                break;
            case "SUB":
                System.out.println("Result is : "+ (num1-num2) );
                break;
            case "MUL":
                System.out.println("Result is : "+ (num1*num2) );
                break;
            case "DIV":
                try{
                    System.out.println("Result is : "+ (num1/num2) );
                }catch(ArithmeticException e){
                    System.out.println("Error ");
                }
                break;
        
            default:
                System.out.println("Invalid Operation");
                break;
        }

        scan.close();
    }
}
