// Defining Generic Class
/* 
class MyArray<T> {
    @SuppressWarnings("unchecked")
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        A[length] = v;
        length++;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}

public class DefiningGenericClass {
    public static void main(String[] args) {
        MyArray<Integer> ma = new MyArray<>();
        ma.append(10);
        ma.append(20);
        ma.append(30);
        ma.display();
    }
} */

// Bounds on Generic

/* class MyArray<T> {
    @SuppressWarnings("unchecked")
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        A[length] = v;
        length++;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}

// Either we Define the Type or make the MyA also Generic
class MyA extends MyArray<Integer> {

}

// Making the Extension Specific
class MyAExt<T extends Number> {
}

public class DefiningGenericClass {
    public static void main(String[] args) {
        MyArray<Integer> ma = new MyArray<>();
        ma.append(10);
        ma.append(20);
        ma.append(30);
        ma.display();

        MyA a = new MyA();
        a.append(10);
    }
} */

// Generic Methods

/* public class DefiningGenericClass {

    public static <T> void show(T[] list) {
        for (T x : list) {
            System.out.println(x);
        }
    }

    public static <T> void show1(T... list) {
        for (T x : list) {
            System.out.println(x);
        }
    }

    // Bound Type
    public static <T extends Number> void show2(T... list) {
        for (T x : list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        show(new String[] { "Hi", "Go", "Bye" });
        show1(1, 2, 3);
        show2(1, 2, 3);
    }
} */

// Using Wild cards and Lower / Upper Bounds

class MyArray<T> {
    @SuppressWarnings("unchecked")
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        A[length] = v;
        length++;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}

public class DefiningGenericClass {

    static void fun(MyArray<?> obj) { // This <?> is wildcard used to accept any type
        obj.display();
    }

    public static void main(String[] args) {
        MyArray<String> m1 = new MyArray<>();
        MyArray<Integer> m2 = new MyArray<>();
        m1.append("Hi");
        m1.append("Hello");
        m1.append("Sup");
        m2.append(10);
        m2.append(20);
        fun(m1);
        fun(m2);
    }
}