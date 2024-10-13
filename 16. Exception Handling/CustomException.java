class MyCustomException extends Exception{
    
    @Override
   public String toString(){
        return "My Custom Exception";
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            throw new MyCustomException();
        } catch (MyCustomException e) {
            System.out.println(e.toString());
        }
    }
    
}
