
import java.util.*;

public class CalendarDemo {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2024));

        TimeZone tz = gc.getTimeZone();
        System.out.println(tz.getID());
    }
}
