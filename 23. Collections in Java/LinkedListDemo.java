import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(10, 20, 30, 40, 50));
        ll1.add(60);
        ll1.add(70);
        ll1.add(80);
        ll1.addAll(ll2);
        // for(int x : ll1)
        // System.out.println(x);

        // Using For Each Loop
        ll1.forEach(n -> System.out.println(n));

        // Different Way of using For Each Lopp
        ll1.forEach(System.out::println);
    }
}
