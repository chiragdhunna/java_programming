package Introduction;
import java.util.*;
public class ReadingFromKeyboard {
     public static void main(String args[]){
        Scanner s  = new Scanner(System.in);
        int x;
        x = s.nextInt();
        System.out.println("My First Program " + x);
        s.close();
     }
}
