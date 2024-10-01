/*
 * 1. Display name of a day based on number
 * 2. Display name of a month based on number
 * 3. Display type of website
 */

 import java.util.Scanner;

public class StudentChallenge4 {
    public static void main(String[] args) {
        System.out.print("Enter the day number : " );
        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();
        scan.nextLine();

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        
            default:
                System.out.println("Invalid Day");
                break;
        }

        System.out.print("Enter the Month number : " );
        int month = scan.nextInt();

        switch (month) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
        
            default:
                System.out.println("Invalid Month");
                break;
        }

        scan.close();
    }
}
