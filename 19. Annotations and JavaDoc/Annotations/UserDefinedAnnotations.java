
@interface MyAnno{
    String name();
    String project();
    String date();
    String version() default "13";
}

@MyAnno(name="Kasab", project="Hotel Taj", date="26/11")
public class UserDefinedAnnotations {
    public static void main(String[] args) {
        
    }
}
