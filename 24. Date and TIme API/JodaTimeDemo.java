
import java.time.*;

public class JodaTimeDemo {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld.ofEpochDay(1));

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.getHour());
    }
}
