import java.io.*;

class StudentP {
    int rollNumber;
    String name;
    String dept;

    void printStudent() {
        System.out.println(
                "Name : " + name + "\nRoll Number : " + rollNumber + "\nDept : " + dept);
    }
}

public class PrintStreamDemo {
    public static void main(String[] args) throws Exception {

        // Wrting in the File using PrintStream

        // FileOutputStream fos = new FileOutputStream(
        // "/Users/chiragdhunna/Desktop/Docs/java_programming/21. Java IO
        // Streams/printStreamDemo.txt");
        // PrintStream ps = new PrintStream(fos);
        // StudentP student = new StudentP();
        // student.name = "Chirag";
        // student.rollNumber = 10;
        // student.dept = "CSE";
        // ps.println(student.name);
        // ps.println(student.rollNumber);
        // ps.println(student.dept);
        // ps.close();
        // fos.close();

        // Reading the File using Buffered Stream

        FileInputStream fis = new FileInputStream(
                "/Users/chiragdhunna/Desktop/Docs/java_programming/21. Java IO Streams/printStreamDemo.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        StudentP student = new StudentP();
        student.name = br.readLine();
        student.rollNumber = Integer.parseInt(br.readLine());
        student.dept = br.readLine();
        System.out.println(
                "Name : " + student.name + "\nRoll Number : " + student.rollNumber + "\nDept : " + student.dept);
        fis.close();
    }
}
