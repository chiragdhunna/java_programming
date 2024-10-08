

public class StaticInnerClass {

    static int x = 10;
    int y = 20;

    static class InnerStaticClass{
        void display(){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        StaticInnerClass.InnerStaticClass innerStaticClass = new StaticInnerClass.InnerStaticClass();
        innerStaticClass.display();
    }
}
