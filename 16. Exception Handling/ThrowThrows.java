class NegativeDimensionException extends Exception{

    @Override
    public String toString(){
        return "Dimensions must not be negative";
    }
}

public class ThrowThrows {
    
    static void meth3(int a, int b) throws NegativeDimensionException {
        System.out.println(meth2(a,b));
    }

    static int meth2(int a,int b) throws NegativeDimensionException{
        if(a<0 || b<0){
            throw new NegativeDimensionException();
        }
        return a*b;
    }

    static void meth1(int a, int b) throws NegativeDimensionException {
        meth3(a,b);
    }

    public static void main(String[] args) {
        try {
            meth1(-10,20);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
