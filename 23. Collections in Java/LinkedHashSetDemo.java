import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(10);
        lhs.add(1);
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(4);
        lhs.add(5);
        lhs.add(1);

        lhs.forEach(System.out::println);

    }
}
