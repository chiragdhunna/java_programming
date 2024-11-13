import java.io.*;

public class ByteDemo {
    public static void main(String[] args) throws IOException {
        /*
         * byte[] b = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
         * 'n', 'o', 'p', 'q', 'r', 's', 't',
         * 'u', 'v', 'w', 'x', 'y', 'z' };
         */

        // ByteArrayInputStream bis = new ByteArrayInputStream(b);

        // Method 1

        /*
         * int byteData;
         * while ((byteData = bis.read()) != -1) {
         * System.out.print((char) byteData);
         * }
         */

        // Method 2
        /*
         * String str = new String(bis.readAllBytes());
         * System.out.println(str);
         */

        // Checking if Mark Supported
        // System.out.println(bis.markSupported());

        // bis.close();

        // Byte Array Output
        /*
         * ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
         */
        // Printing the Array Output

        /*
         * for (char x = 'a'; x < 'z'; x++) {
         * byteArrayOutputStream.write(x);
         * }
         */

        /*
         * byte b[] = byteArrayOutputStream.toByteArray();
         * for (byte x : b) {
         * System.out.print((char) x);
         * }
         */

        // Adding the data into another file
        /*
         * byteArrayOutputStream.writeTo(new
         * FileOutputStream("21. Java IO Streams/byteArrayOutputStreamData.txt"));
         */

        // CharArrayReader
        char[] b = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z' };
        CharArrayReader charArrayReader = new CharArrayReader(b);
        int x;
        while ((x = charArrayReader.read()) != -1) {
            System.out.print((char) x);
        }
    }
}