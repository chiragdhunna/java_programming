import java.util.Arrays;
import java.util.Comparator;

class MyArrrayCustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer x, Integer y) {
        if (x < y) {
            return 1;
        } else if (x > y) {
            return -1;
        } else {
            return 0;
        }
    }

}

public class ComparatorDemo {
    public static void main(String[] args) {
        Integer a[] = { 2, 4, 6, 8, 1, 3, 5, 7 };
        Integer b[] = { 2, 4, 6, 8, 1, 3, 5, };

        Arrays.sort(a, new MyArrrayCustomComparator());
        for (int x : a) {
            System.out.println(x);
        }

    }
}
