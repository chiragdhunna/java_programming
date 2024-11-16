import java.io.*;

class CustomerS implements Serializable {
    String custID;
    String name;
    String phoneNumber;
    static int id;

    CustomerS() {

    }

    CustomerS(String n, String ph) {
        this.name = n;
        this.phoneNumber = ph;
        this.custID = id + "";
        id++;
    }

    @Override
    public String toString() {
        return "Customer Name : " + this.name + "\nCustomer ID : " + this.custID + "\nPhone Number : "
                + this.phoneNumber;
    }
}

public class SearializeACustomer {
    public static void main(String[] args) throws Exception {
        // Challenge 1

        // Write the contents of the list

        /*
         * FileOutputStream fos = new FileOutputStream(
         * "/Users/chiragdhunna/Desktop/Docs/java_programming/21. Java IO Streams/challenge1.txt"
         * );
         * DataOutputStream dos = new DataOutputStream(fos);
         * Float list[] = { 1.2f, 3.45f, 6.78f, 9.01f, 2.34f };
         * dos.writeInt(list.length);
         * for (float x : list) {
         * dos.writeFloat(x);
         * }
         * dos.close();
         * fos.close();
         */

        // Read the contents of the list

        /*
         * FileInputStream fis = new FileInputStream(
         * "/Users/chiragdhunna/Desktop/Docs/java_programming/21. Java IO Streams/challenge1.txt"
         * );
         * DataInputStream dis = new DataInputStream(fis);
         * int n = dis.readInt();
         * for (int i = 0; i < n; i++) {
         * System.out.println(dis.readFloat());
         * }
         * dis.close();
         * fis.close();
         */

        // Challenge 2

        // Writing the objects

        /*
         * CustomerS customer1 = new CustomerS("John Doe", "555-1234");
         * CustomerS customer2 = new CustomerS("Jane Smith", "555-5678");
         * CustomerS customer3 = new CustomerS("Alice Johnson", "555-9876");
         * CustomerS customer4 = new CustomerS("Bob Brown", "555-6543");
         * CustomerS customer5 = new CustomerS("Charlie White", "555-4321");
         * CustomerS list[] = { customer1, customer2, customer3, customer4, customer5 };
         * 
         * FileOutputStream fos = new FileOutputStream(
         * "/Users/chiragdhunna/Desktop/Docs/java_programming/21. Java IO Streams/challenge2.txt"
         * );
         * ObjectOutputStream oos = new ObjectOutputStream(fos);
         * oos.writeInt(5);
         * for (CustomerS x : list) {
         * oos.writeObject(x);
         * }
         * 
         * oos.close();
         * fos.close();
         */

        // Reading the objects

        FileInputStream fis = new FileInputStream(
                "/Users/chiragdhunna/Desktop/Docs/java_programming/21. Java IO Streams/challenge2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int n = ois.readInt();
        for (int i = 0; i < n; i++) {
            CustomerS customer = (CustomerS) ois.readObject();
            System.out.println(customer.toString());
        }

        ois.close();
        fis.close();
    }
}
