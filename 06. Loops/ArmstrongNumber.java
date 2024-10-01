import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int temp = num;
        double numberOfDigits = 1;
        double sum = 0;
        // Finding the number of digits in the number
        while(temp>9){
            temp = temp/10;
            numberOfDigits++;
        }

        // Finding the sum
        temp = num;
        while(temp > 9){
            double remainder = (double) temp%10;
            sum += Math.pow(remainder, numberOfDigits);
            temp = temp/10;
        }
        double remainder = (double) temp%10;
        sum += Math.pow(remainder, numberOfDigits);
        temp = temp/10;

        if(sum ==  num){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not a Armstrong Number");
        }

        scan.close();
    }
}
