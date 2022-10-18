package Section02.ProgrammingProjects;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyBirthday {

    public static void main(String[] args) {

        GregorianCalendar myBirthday = new GregorianCalendar(1997,3,28);

        //The weekday of your birthday.
        System.out.println(myBirthday.get(Calendar.DAY_OF_WEEK));

        //The date that is 10,000 days from your birthday
        myBirthday.add(Calendar.DAY_OF_MONTH, 10000);
        System.out.println(myBirthday.get(Calendar.DAY_OF_MONTH));
    }
}
