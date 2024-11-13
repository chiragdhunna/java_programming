import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class CopyAFile {
    public static void main(String[] args) {
        // try (FileInputStream fileInputStream = new FileInputStream("21. Java IO
        // Streams/Text.txt");
        // FileOutputStream fileOutputStream = new FileOutputStream("21. Java IO
        // Streams/CopiedText.txt");) {
        // byte[] byteData = new byte[fileInputStream.available()];
        // fileInputStream.read(byteData);
        // String fileData = new String(byteData);

        // fileOutputStream.write(fileData.toLowerCase().getBytes());
        // fileInputStream.close();
        // fileOutputStream.close();
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

        // Other Method using SequenceInputStream

        try (FileInputStream fileInputStream1 = new FileInputStream("21. Java IO Streams/Source1.txt");
                FileInputStream fileInputStream2 = new FileInputStream("21. Java IO Streams/Source2.txt");
                FileOutputStream fileOutputStream = new FileOutputStream("21. Java IO Streams/Destination.txt");
                SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1,
                        fileInputStream2);) {

            int byteData;
            while ((byteData = sequenceInputStream.read()) != -1) {
                fileOutputStream.write(byteData);
            }
            fileInputStream1.close();
            fileInputStream2.close();
            fileOutputStream.close();
            sequenceInputStream.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
