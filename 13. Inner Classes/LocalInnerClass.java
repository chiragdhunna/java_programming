public class LocalInnerClass {
    public static void display(){
        class Inner{
            int x = 23;

            void display(){
                System.out.println(x);
            }
        }

        Inner inner = new Inner();
        inner.display();
    }

    public static void main(String[] args) {
        display();
    }
    
}
