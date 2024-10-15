interface ParameterisedLambda{
    public void display(String str);
}

public class ParametersLambda {
    public static void main(String[] args) {
        ParameterisedLambda m = (s) -> {
            System.out.println("Hello " + s);
        };

        m.display("Mia");
    } 
}
