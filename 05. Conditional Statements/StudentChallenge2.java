/*
 * 1. Find radix of a number given in a string
 * 2. Find a given year is a leap year
 */

import java.util.Scanner;

public class StudentChallenge2 {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        
        if(num.matches("[01]*")){
            System.out.println("It is Binary");
        }else if(num.matches("[0-9]*")){
            System.out.println("It is Decimal");
        }else if(num.matches("[0-9A-F]*")){
            System.out.println("It is Hexa Decimal");
        }else if(num.matches("[0-7]*")){
            System.out.println("It is Octal");
        }else {
            System.out.println("Number is Invalid");
        }

        System.out.print("Enter the Year : ");
        int year = scan.nextInt();

        if(year%100!=0){
            if(year%4 == 0) System.out.println("Leap Year");
            else System.out.println("Not a Leap Year");
        }else{
            if(year%400 == 0)System.out.println("Leap Year");
            else System.out.println("Not a Leap Year");
        }

        scan.close();
    }
}
