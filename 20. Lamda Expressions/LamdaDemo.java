
interface MyLambda{
    public void display();
}

public class LamdaDemo {
    public static void main(String[] args) {
        MyLambda m = () -> {
            System.out.println("Hello World");
        };

        m.display();
    }  

}

