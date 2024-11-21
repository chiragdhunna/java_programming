import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        // Tree Map
        /*
         * TreeMap<Integer, String> tm = new TreeMap<>();
         * tm.put(1, "Hello");
         * tm.put(2, "Hunny");
         * tm.put(3, "Bunny");
         * tm.put(4, "Feeling");
         * tm.put(5, "Something");
         * tm.put(6, "Something");
         * tm.put(7, "Hello");
         * tm.put(8, "Honey");
         * tm.put(9, "Buney");
         * 
         * tm.forEach((x, y) -> System.out.println("[" + x + "," + y + "]"));
         */

        HashMap<Integer, String> tm = new HashMap<>();
        tm.put(1, "Hello");
        tm.put(2, "Hunny");
        tm.put(3, "Bunny");
        tm.put(4, "Feeling");
        tm.put(5, "Something");
        tm.put(6, "Something");
        tm.put(7, "Hello");
        tm.put(8, "Honey");
        tm.put(9, "Buney");

        tm.forEach((x, y) -> System.out.println("[" + x + "," + y + "]"));
    }
}
