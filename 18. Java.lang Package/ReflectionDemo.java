
import java.lang.reflect.*;

class My{
    private int a;
    protected  int b;
    public int c;
    int d;

    public My(){}

    public My(int x, int y){}

    public void display(String s1, String s2){}

    public int show(int x, int y){return 0;}
}

public class ReflectionDemo {
    public static void main(String[] args) {
        Class c = My.class;
        
        System.out.println(c.getName());

        for(Field x : c.getDeclaredFields()){
            System.out.println(x);
        }
    }
}
