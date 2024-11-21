
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class OtherDateTimeClassesDemo {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        OffsetDateTime offset = OffsetDateTime.now();
        System.out.println(offset);

        MonthDay md = MonthDay.now();
        System.out.println(md);
    }
}
