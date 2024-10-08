class Outer{
    int x = 10;

    class Inner{
        int y = 20;

        public void innerDisplay(){
            System.out.println(x+" "+y);
        }
    }

    public void outerDisplay(){
        Inner inner = new Inner();
        inner.innerDisplay();
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerDisplay(); 

        Outer.Inner outtInner = new Outer().new Inner();
        outtInner.innerDisplay();
    }
}
