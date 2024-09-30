/*
 * 
 * Given is the mail id
 * 
 * 1. Find if the email id is on gmail
 * 2. Find username and domain name from the mail
 */

public class StudentChallenge1 {
    public static void main(String[] args) {
        String mail = "chiragdhunna2468@gmail.com";
        System.out.println("Does it contain gmail? : " + mail.contains("gmail"));
        System.out.println("Username of the mail : " + mail.substring(0, mail.indexOf("@")));
        System.out.println("domain name of the mail : " + mail.substring(mail.indexOf("@") + 1));

    }
}
