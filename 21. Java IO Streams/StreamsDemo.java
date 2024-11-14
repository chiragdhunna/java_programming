import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {

        // Creating a File Name Text.txt and adding in it.

        try (FileOutputStream fileOutputStream = new FileOutputStream("21. Java IO Streams/Text.txt")) {
            String data = "Hello , this is sample data";
            fileOutputStream.write(data.getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a File named Text.txt
        try (FileInputStream fileInputStream = new FileInputStream("21. Java IO Streams/Text.txt")) {
            // byte[] byteData = new byte[fileInputStream.available()];
            // fileInputStream.read(byteData);
            // String data = new String(byteData);
            // System.out.println(data);

            // Other Method
            int byteData;
            do {
                byteData = fileInputStream.read();
                if (byteData != -1)
                    System.out.print((char) byteData);
            } while (byteData != -1);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

        // Same, FileReader is same as FileInputStream
        try (FileReader fileInputStream = new FileReader("21. Java IO Streams/Text.txt")) {
            int byteData;
            do {
                byteData = fileInputStream.read();
                if (byteData != -1)
                    System.out.print((char) byteData);
            } while (byteData != -1);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
    }
}