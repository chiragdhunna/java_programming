/*
 * 1. Find if a Number is Binary or not
 * 2. Find if a Number is Hexa-Decimal or not
 * 3. Find if the Date format (dd/mm/yy) 
 * 
 */

public class ConversionToBinaryChallenge {
    public static void main(String[] args) {
        int binaryNumber = 10110001;
        String binaryConverted = String.valueOf(binaryNumber);
        System.out.println(binaryNumber + " is binary " + binaryConverted.matches("[01]*"));
        System.out.println(binaryNumber + " is Hexa Decimal " + binaryConverted.matches("[0-9A-F]*"));

        String date = "01/12/2001";

        System.out.println(date + " is in date format " + date.matches("[0-3][0-9]/(0[0-9]|1[0-2])/[0-9]{4}"));
    }
}
