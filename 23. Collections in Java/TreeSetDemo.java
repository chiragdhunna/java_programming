/* import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(50);
        ts.add(60);
        ts.add(70);
        ts.add(80);
        ts.add(80);
        ts.add(80);
        ts.add(80);

        ts.forEach(System.out::println);
    }
}
 */

// Comparable

import java.util.TreeSet;

class Point implements Comparable<Point> {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point p) {
        if (this.x < p.x) {
            return -1;
        } else if (this.x > p.x) {
            return 1;
        } else if (this.y < p.y) {
            return -1;
        } else if (this.y > p.y) {
            return 1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "x : " + this.x + " , y : " + this.y;
    }

}

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1, 1));
        ts.add(new Point(5, 5));
        ts.add(new Point(5, 2));

        System.out.println(ts);
    }
}
