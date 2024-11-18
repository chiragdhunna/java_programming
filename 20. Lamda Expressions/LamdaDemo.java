
interface MyLambdaLD {
    public void display();
}

public class LamdaDemo {
    public static void main(String[] args) {
        MyLambdaLD m = () -> {
            System.out.println("Hello World");
        };

        m.display();
    }

}
