
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
// ZonedDateTime zdt = ZonedDateTime.now();

        // DateTimeFormatter dtf = DateTimeFormatter.ISO_TIME;
        // dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");
        // System.out.println(dtf);
        // System.out.println(zdt.format(dtf));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.get(ChronoField.DAY_OF_YEAR));
    }
}
