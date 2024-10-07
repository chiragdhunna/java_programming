class Parent {
    protected int a;
    protected int b;

    Parent() {
        a = 1;
        b = 1;
        System.out.println("Parent : Non - Parameterised ");
    }

    Parent(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Parent : Parameterised ");

    }
}

class Child extends Parent {
    protected int c;

    Child() {
        c = 1;
        System.out.println("Child : Non - Parameterised");
    }

    Child(int a, int b, int c) {
        super(a, b);
        this.c = c;
        System.out.println("Child : Parameterised ");
    }
}

public class ParentChild {
    public static void main(String[] args) {
        Child child = new Child(2, 3, 4);
        System.out.println(child);
    }
}
