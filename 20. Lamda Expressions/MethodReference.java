interface MyLambdaMR {

    public void display(String str);
}

public class MethodReference {
    public static void main(String[] args) {
        MyLambdaMR ml = System.out::println;
        ml.display("Hello");
    }
}
