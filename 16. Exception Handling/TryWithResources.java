import java.io.FileInputStream;
import java.util.Scanner;

public class TryWithResources {
    
    static FileInputStream fileInputStream;
    static Scanner scanner;

    static void division() throws Exception{
        fileInputStream = new FileInputStream("/home/chiggy/Desktop/Docs/java_programming/16. Exception Handling/data.txt");
        scanner = new Scanner(fileInputStream);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            System.out.println(a/b);
            System.out.println(b/c);
        } catch (Exception e) {
            System.out.println(e.toString());
        }finally{
            fileInputStream.close();
            scanner.close();
        }

        
    }
    
    public static void main(String[] args) throws Exception{
        division();
    }
}
