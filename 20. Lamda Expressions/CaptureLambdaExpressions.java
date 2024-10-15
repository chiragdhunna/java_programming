interface  MyLambda{
    public void display();
}

class UseLamda{
    public void callLamda(MyLambda ml){
        ml.display();
    }
}

class Demo{

    int temp = 10;

    public void method1(){
        // MyLambda ml = () -> {
        //     System.out.println("Hi");
        //     System.out.println("Bye " + (temp++));
        // };

        // ml.display();

        UseLamda ul = new UseLamda();
        ul.callLamda(()->{System.out.println("Or Bhai!!!");});
    }
}

public class CaptureLambdaExpressions {
    public static void main(String[] args) {
        Demo dm = new Demo();
        dm.method1();
    }
}
