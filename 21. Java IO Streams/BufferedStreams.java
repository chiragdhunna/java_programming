import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedStreams {
    public static void main(String[] args) {
        try (
                FileInputStream fileInputStream = new FileInputStream("21. Java IO Streams/BufferedInputTextFile.txt");
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);) {
            /*
             * int x;
             * while ((x = bufferedInputStream.read()) != -1) {
             * System.out.print((char) x);
             * }
             * System.out.printf("File : " + fileInputStream.markSupported());
             * System.out.printf("Buffer : " + bufferedInputStream.markSupported());
             */

            System.out.print((char) bufferedInputStream.read()); // T
            System.out.print((char) bufferedInputStream.read()); // h
            System.out.print((char) bufferedInputStream.read()); // i
            bufferedInputStream.mark(10);
            System.out.print((char) bufferedInputStream.read()); // s
            System.out.print((char) bufferedInputStream.read()); // ' '
            System.out.print((char) bufferedInputStream.read()); // i
            System.out.print((char) bufferedInputStream.read()); // s

            bufferedInputStream.reset();

            System.out.print((char) bufferedInputStream.read());
            System.out.print((char) bufferedInputStream.read());

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
