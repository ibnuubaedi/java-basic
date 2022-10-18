package Section02.ProgrammingProjects;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarPrinter {

    public static void main(String[] args) {

        GregorianCalendar cal = new GregorianCalendar();
        GregorianCalendar inayahBirthday = new GregorianCalendar(1998, Calendar.OCTOBER, 8);
        cal.add(Calendar.DAY_OF_MONTH, 10);

        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int weekDay = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(year);
        System.out.println(weekDay);

    }

}
