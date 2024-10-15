import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)

@Target(value=ElementType.LOCAL_VARIABLE)

@Documented
@interface MyAnno{
    String name();
    String project();
    String date();
    String version() default "13";
}

public class BuiltInAnnotations {
    public static void main(String[] args) {
        @MyAnno(name="Kasab", project="Hotel Taj", date="26/11")
        int x = 10;
    }
}
