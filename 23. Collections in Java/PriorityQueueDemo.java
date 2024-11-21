import java.util.*;

class MyComparator implements Comparator<Integer> {

    public int compare(Integer a, Integer b) {
        if (a < b) {
            return 1;
        } else if (a > b) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {

        // Lower Number Having Higher Priority

        /*
         * PriorityQueue<Integer> pq1 = new PriorityQueue<>();
         * PriorityQueue<Integer> pq2 = new PriorityQueue<>(List.of(10, 20, 30, 40,
         * 50));
         * pq1.add(60);
         * pq1.add(70);
         * pq1.add(80);
         * pq1.addAll(pq2);
         * 
         * pq1.add(610);
         * pq1.add(270);
         * pq1.add(980);
         * 
         * // Different Way of using For Each Lopp
         * // pq1.forEach(System.out::println);
         * 
         * // Peeking the Top Most Element
         * System.out.println(pq1.peek());
         */

        // Higher Number Having Higher Priority

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(new MyComparator());
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(List.of(10, 20, 30, 40, 50));
        pq1.add(60);
        pq1.add(70);
        pq1.add(80);
        pq1.addAll(pq2);

        pq1.add(610);
        pq1.add(270);
        pq1.add(980);

        // Different Way of using For Each Lopp
        // pq1.forEach(System.out::println);

        // Peeking the Top Most Element
        System.out.println(pq1.peek());

    }
}
