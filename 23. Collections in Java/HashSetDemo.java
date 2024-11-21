import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>(10);
        HashSet<Integer> hs2 = new HashSet<>(100, 0.5f);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(60);
        hs.add(70);
        hs.add(80);

        hs1.add(50);
        hs2.add(60);
        hs1.add(70);
        hs2.add(80);

        hs.forEach(System.out::println);
        System.out.println("");
        hs1.forEach(System.out::println);
        System.out.println("");
        hs2.forEach(System.out::println);
        System.out.println("");

    }
}
