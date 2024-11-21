import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

class AccountMD implements Serializable {
    int accountNumber;
    String name;
    int balance;

    AccountMD() {
    }

    AccountMD(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0;

    }

    public String toString() {
        return "Name : " + this.name + " , Account Number : " + this.accountNumber + " , Balance : " + this.balance
                + "\n";
    }
}

/*
 * Menu Options
 * 1. Create Account
 * 2. Delete Account
 * 3. View Account
 * 4. View All Account
 * 5. Save Account
 * 6. Exit
 */

/// Accounts should be saved in a file named Accounts.txt
/// When the program is run again all the accounts from the Accounts.txt files
/// should come from this saved file to a hashed map
/// Hashed Map should be able to save all the details and delete and do
/// other operations too...

public class MenuDrivenProgramAccounts {

    public static int counter = 0;

    public static void createAccount(HashMap<Integer, AccountMD> hm, Scanner sc) {

        System.out.println("Enter the Name Please : ");
        String name = sc.nextLine();
        AccountMD customer = new AccountMD(name, counter);
        counter++;
        hm.put(customer.accountNumber, customer);
        System.out.println("Account Created Successfully");
        System.out.println("Your Account Number is : " + customer.accountNumber);

    }

    public static void deleteAccount(HashMap<Integer, AccountMD> hm, Scanner sc) {

        System.out.println("Enter the Account Number Please : ");
        int accountNumber = sc.nextInt();
        hm.remove(accountNumber);
        System.out.println("Account Deleted Successfully");

    }

    public static void viewAccount(HashMap<Integer, AccountMD> hm, Scanner sc) {
        System.out.println("Enter the Account Number Please");

        int accountNumber = sc.nextInt();
        if (hm.containsKey(accountNumber)) {
            System.out.println(hm.get(accountNumber));
        } else {
            System.out.println("Account Number Does Not Exist");
        }

    }

    public static void viewAllAccount(HashMap<Integer, AccountMD> hm) {
        System.out.println(hm);
    }

    public static void saveAccount(HashMap<Integer, AccountMD> hm) throws Exception {
        try {

            FileOutputStream fo = new FileOutputStream(
                    "/Users/chiragdhunna/Desktop/Docs/java_programming/23. Collections in Java/AccountMD.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeInt(hm.size());
            for (AccountMD x : hm.values()) {
                System.out.println("Saving " + x);
                oos.writeObject(x);
            }
            System.out.println("Accounts Saved Successfully");

            oos.close();
            fo.close();
        } catch (Exception e) {
            System.out.println("Exception in saveAccount : " + e);
        }
    }

    public static void exit(HashMap<Integer, AccountMD> hm) throws Exception {
        try {
            FileOutputStream fo = new FileOutputStream(
                    "/Users/chiragdhunna/Desktop/Docs/java_programming/23. Collections in Java/AccountMD.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeInt(hm.size());
            for (AccountMD x : hm.values()) {
                System.out.println("Saving " + x);
                oos.writeObject(x);
            }
            System.out.println("Accounts Saved Successfully");

            oos.close();
            fo.close();
        } catch (Exception e) {
            System.out.println("Exception in saveAccount : " + e);
        }
    }

    public static void loadFromAccountMD(HashMap<Integer, AccountMD> hm) throws Exception {
        try {

            FileInputStream fis = new FileInputStream(
                    "/Users/chiragdhunna/Desktop/Docs/java_programming/23. Collections in Java/AccountMD.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int size = ois.readInt();
            for (int i = 0; i < size; i++) {
                AccountMD account = (AccountMD) ois.readObject();
                System.out.println(account);
                hm.put(account.accountNumber, account);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Exception in loading from AccountMD File : " + e);
        }

    }

    public static void main(String[] args) throws Exception {
        HashMap<Integer, AccountMD> hm = new HashMap<>();
        loadFromAccountMD(hm);
        System.out.println("Welcome, Please Select one of the Option Below : ");

        System.out.println("1. Create Account");
        System.out.println("2. Delete Account");
        System.out.println("3. View Account");
        System.out.println("4. View All Account");
        System.out.println("5. Save Account");
        System.out.println("6. Exit");

        while (true) {
            System.out.println("Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    createAccount(hm, sc);
                    break;
                case 2:
                    deleteAccount(hm, sc);
                    break;
                case 3:
                    viewAccount(hm, sc);
                    break;
                case 4:
                    viewAllAccount(hm);
                    break;
                case 5:
                    saveAccount(hm);
                    break;
                case 6:
                    exit(hm);
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    viewAllAccount(hm);
                    break;
            }
        }

    }
}
