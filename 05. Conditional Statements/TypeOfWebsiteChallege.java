/*
 * 1. Display name of a day based on number
 * 2. Find type of website and the protocol used
 */

import java.util.Scanner;

public class TypeOfWebsiteChallege {
    public static void main(String[] args) {
        System.out.print("Enter the day number : ");
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        scan.nextLine();
        while(day>=7){
            day = day/7;
        }

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
                System.out.println("Satday");
                break;
        
            default:
                System.out.println("Sunday");
                break;
        }

        System.out.print("Enter the website url : ");
        String url = scan.nextLine();
        if(url.matches(".*http.*")){
            System.out.println("Hyper Text Transfer Protocol");
        }else if(url.matches(".*ftp.*")){
            System.out.println("File Transfer Protol");
        }

        if(url.matches(".*\\.com")){
            System.out.println("Commercial");
        }else if(url.matches(".*\\.org")){
            System.out.println("Organisation");
        }else if(url.matches(".*\\.net")){
            System.out.println("Network");
        }

        scan.close();
    }
}
