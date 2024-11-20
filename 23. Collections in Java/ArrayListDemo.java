
import java.util.*;


public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(List.of(10,20,30,40,50));
        list1.add(60);
        list1.add(70);
        list1.add(80);
        list1.addAll(list2);
        // for(int x : list1)
        //     System.out.println(x);

        // Using For Each Loop
        list1.forEach(n->System.out.println(n));
        
        // Different Way of using For Each Lopp
        list1.forEach(System.out::println);
    }
}
