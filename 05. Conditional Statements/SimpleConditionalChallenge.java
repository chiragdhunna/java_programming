/*
 * 1. Find a number is odd or even
 * 2. Find person is young or not
 * 3. Find Grade for Given Marks
 */

import java.util.Scanner;

public class SimpleConditionalChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int num = scan.nextInt();
        if(num%2==0) System.out.println("Even");
        else System.out.println("Odd");

        System.out.print("Enter the age of the number : ");
        int age = scan.nextInt();
        if(age >= 18){
            System.out.println("Adult");
        }else{
            System.out.println("Kid");
        }

        System.out.print("Enter the marks : ");
        int marks = scan.nextInt();
        if(marks>=90){
            System.out.println("A+");
        }else if(marks>=80){
            System.out.println("B");
        }else if(marks>=70){
            System.out.println("C");
        }else if(marks>=60){
            System.out.println("D");
        }else if(marks>=50){
            System.out.println("E");
        }else{
            System.out.println("Failed");
        }

        scan.close();
    }
    
}
