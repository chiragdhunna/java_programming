import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamDemo {
    public static void main(String[] args) throws Exception {

        // Writing the file using DataOutPut Stream

        // FileOutputStream fos = new FileOutputStream("21. Java IO
        // Streams/dataStreamDemo.txt");
        // DataOutputStream dos = new DataOutputStream(fos);

        // dos.writeUTF("Chirag Dhunna");
        // dos.writeInt(34);
        // dos.writeUTF("CSE");

        // dos.close();
        // fos.close();

        // Reading the File using DataInputStream

        FileInputStream fis = new FileInputStream("21. Java IO Streams/dataStreamDemo.txt");
        DataInputStream dis = new DataInputStream(fis);

        StudentP student = new StudentP();
        student.name = dis.readUTF();
        student.rollNumber = dis.readInt();
        student.dept = dis.readUTF();

        student.printStudent();

        dis.close();
        fis.close();
    }
}
