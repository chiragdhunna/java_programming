import java.util.*;

abstract class OldClass{

    public void display(){

    }


}

class NewClass extends OldClass{

    @Override
    public void display(){
        System.out.println("Hello");
    }

    @Deprecated
    public void show(){
        System.out.println("Hi");
    }
}

// SafeVarargs

class My<T>{

    @SafeVarargs
    private void show(T...args){
        for(T x : args){
            System.out.println(x);
        }
    }
}

@FunctionalInterface
interface Moi{
    public void show();
}

public class AnnotationsDemo {
    static List l;
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        nc.show();

        // l.add(10);
    }
}
