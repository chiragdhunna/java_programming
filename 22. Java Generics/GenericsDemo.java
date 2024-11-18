
// Explaination about Generic
/*
 * public class GenericsDemo {
 * public static void main(String[] args) {
 * Object obj = (String) new String("Hi");
 * System.out.println(obj);
 * }
 * }
 */

// Using Generic in list

/*
 * public class GenericsDemo {
 * public static void main(String[] args) {
 * Object obj[] = new Object[3];
 * 
 * obj[0] = "hi";
 * obj[1] = "hello";
 * obj[2] = 1;
 * for (Object x : obj) {
 * System.out.println(x);
 * }
 * }
 * }
 */

// Using template to solve the above issue

class GenericTemplate<T> {

    @SuppressWarnings("unchecked")
    T data[] = (T[]) new Object[3];

    public void setData(T data, int index) {
        this.data[index] = data;
    }

    public T getData(int index) {
        return this.data[index];
    }

    public void display() {
        for (T x : this.data) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

public class GenericsDemo<T> {

    public static void main(String[] args) {
        GenericTemplate<String> gd = new GenericTemplate<>();
        gd.setData("Hi", 0);
        gd.setData("Hello", 1);
        gd.setData("Sup", 2);
        gd.display();
        // gd.setData(123, 2); // Not Allowed
    }
}
