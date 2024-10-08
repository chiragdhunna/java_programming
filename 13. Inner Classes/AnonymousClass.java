abstract class AnonymousAbstractClass{
    abstract void display();
}

public class AnonymousClass {
    
    public static void meth(){
        AnonymousAbstractClass anonymousAbstractClass = new AnonymousAbstractClass() {
            @Override
            void display() {
                System.out.println("Display from anonymous Class");
            }
        };

        anonymousAbstractClass.display();
    }

    public static void main(String[] args) {
        meth();
    }
}
