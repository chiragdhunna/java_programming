class Super {
    public int a;

    Super() {
        System.out.println("Super : Non - Parameterised Constructor");
    }

    Super(int a) {
        System.out.println("Super : Parameterised Constructor");
    }

    public void display() {
        System.out.println("Super : Display");
    }
}

class Sub extends Super {
    public int b;

    Sub() {
        System.out.println("Sub : Non - Parameterised Constructor");
    }

    Sub(int a) {
        System.out.println("Sub : Parameterised Constructor");
    }

    @Override
    public void display() {
        System.out.println("Sub : Display");
    }
}

public class SuperSubClass {
    public static void main(String[] args) {
        Super super1 = new Super();
        super1.display();

        Sub sub = new Sub();
        sub.display();
    }
}
