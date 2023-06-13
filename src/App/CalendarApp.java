package App;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalendarApp {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        var timezone = TimeZone.getTimeZone("WIB");
        calendar.setTimeZone(timezone);

        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeZone());




    }
}
