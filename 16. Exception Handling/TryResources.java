
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResources {
    static String readLineFromFile() throws IOException{
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/chiggy/Desktop/Docs/java_programming/16. Exception Handling/data.txt"))){
            return bufferedReader.readLine();
        }
    }

    public static void main(String[] args) {
        try {
            String line = readLineFromFile();
            System.out.println("The content of the file is: " + line);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
