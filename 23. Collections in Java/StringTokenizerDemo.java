import java.io.*;
import java.util.*;

public class StringTokenizerDemo {
    public static void main(String[] args) throws Exception {
        try ( // Tokenising a String
        /*
         * String data = "name=Vijay;address=delhi;country=india;dept=cse";
         * 
         * StringTokenizer stk = new StringTokenizer(data, "=;");
         * 
         * while (stk.hasMoreTokens()) {
         * System.out.println(stk.nextToken());
         * }
         */
        // Tokenising from a File
        /*
         * FileInputStream fis = new FileInputStream(
         * "/Users/chiragdhunna/Desktop/Docs/java_programming/23. Collections in Java/StringTokenizerDataDemo.txt"
         * );
         * byte[] data = new byte[fis.available()];
         * fis.read(data);
         * String str = new String(data);
         * StringTokenizer stk = new StringTokenizer(str);
         * while (stk.hasMoreTokens()) {
         * System.out.println(stk.nextToken());
         * }
         */
        // Tokenising from a File with numbers in a list of number
                FileInputStream fis = new FileInputStream(
                        "/Users/chiragdhunna/Desktop/Docs/java_programming/23. Collections in Java/StringTokenizerNumbersDemo.txt")) {
            byte[] data = new byte[fis.available()];
            fis.read(data);
            String str = new String(data);
            StringTokenizer stk = new StringTokenizer(str, ",");
            ArrayList<Integer> arr = new ArrayList<>();
            while (stk.hasMoreTokens()) {
                arr.add(Integer.valueOf(stk.nextToken()));
            }
            
            for (int x : arr) {
                System.out.println(x);
            }
        }

    }
}
