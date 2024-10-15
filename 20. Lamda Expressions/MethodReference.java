interface  MyLambda{

    public void display(String str);
}

public class MethodReference {
    public static void main(String[] args) {
        MyLambda ml = System.out::println;
        ml.display("Hello");
    }
}
