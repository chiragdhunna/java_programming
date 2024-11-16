import java.io.*;

public class FileClass {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/chiragdhunna/Desktop/Docs/java_programming");
        // List all the files in the path of file
        /*
         * String[] listOfFiles = file.list();
         * for (String x : listOfFiles) {
         * System.out.println(x);
         * }
         */

        File[] listOfFiles = file.listFiles();
        for (File x : listOfFiles) {
            System.out.println(x.getName());
        }

    }
}