package Section02.ProgrammingProjects;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class OneHunderedDay {

    public static void main(String[] args) {

        //The date and weekday that is 100 days from today
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DAY_OF_MONTH, 100);

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(day+"-"+month+"-"+year+"("+weekday+")");

    }

}
