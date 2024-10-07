abstract class SuperAbstract{
    SuperAbstract(){
        System.out.println("Super");
    }

    public void method1(){
        System.out.println("Super Method 1");
    }

    abstract public void method2();
}

class Sub extends SuperAbstract{
    Sub(){
        System.out.println("Super");
    }

    public void method2(){
        System.out.println("Sub Method 2");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        SuperAbstract s = new Sub();
        s.method1();
    }    
}
