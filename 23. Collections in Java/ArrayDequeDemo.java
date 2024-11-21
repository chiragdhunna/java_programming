import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq1 = new ArrayDeque<>();
        ArrayDeque<Integer> dq2 = new ArrayDeque<>(List.of(10, 20, 30, 40, 50));
        dq1.offerLast(60);
        dq1.offerLast(70);
        dq1.offerLast(80);
        dq1.addAll(dq2);

        dq1.offerFirst(610);
        dq1.offerFirst(270);
        dq1.offerFirst(980);
        for (int x : dq1)
            System.out.println(x);

        // Using For Each Loop
        dq1.forEach(n -> System.out.println(n));

        // Different Way of using For Each Lopp
        dq1.forEach(System.out::println);
    }
}
