import java.io.*;

class StudentS implements Serializable {
    int rollNumber;
    String name;
    String dept;

    void printStudent() {
        System.out.println(
                "Name : " + name + "\nRoll Number : " + rollNumber + "\nDept : " + dept);
    }
}

public class Searialisation {
    public static void main(String[] args) throws Exception {

        // Writing the file using ObjectOutputStream

        /*
         * FileOutputStream fos = new FileOutputStream(
         * "/Users/chiragdhunna/Desktop/Docs/java_programming/21. Java IO Streams/seariliasationDemo.txt"
         * );
         * ObjectOutputStream oos = new ObjectOutputStream(fos);
         * 
         * StudentS studentS = new StudentS();
         * studentS.name = "Chirag";
         * studentS.rollNumber = 89;
         * studentS.dept = "CSE";
         * oos.writeObject(studentS);
         * oos.close();
         * fos.close();
         */

        // Reading the file using ObjectOutputStream

        FileInputStream fis = new FileInputStream(
                "/Users/chiragdhunna/Desktop/Docs/java_programming/21. Java IO Streams/seariliasationDemo.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        StudentS studentS = (StudentS) ois.readObject();
        studentS.printStudent();
        ois.close();
        fis.close();
    }
}
