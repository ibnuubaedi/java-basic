package Section02.ProgrammingProjects;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDatePrinter {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate inayahBirthday = LocalDate.of(1998,8,10);
        LocalDate later = today.plusDays(10);
        int year = today.getYear();
        String weekday = today.getDayOfWeek().toString();

        System.out.println(today);
        System.out.println(inayahBirthday);
        System.out.println(later);
        System.out.println(year);
        System.out.println(weekday);

        //The weekday of “Pi day”, that is, March 14, of the current year
        LocalDate piDay = LocalDate.of(2022,3,14);
        String weekPiDay = piDay.getDayOfWeek().toString();
        System.out.println(weekPiDay);

        /*
        * The date and weekday of “Programmer’s day” in the current year; that is,
          the 256th day of the year. (The number 256, or 28, is useful for some
          programming tasks.)
        */
        LocalDate date = LocalDate.of(2022,1,1);
        LocalDate programmingDay = date.plusDays(255);
        System.out.println(programmingDay);
        System.out.println(programmingDay.getDayOfWeek());

        //The date and weekday of the date that is 10,000 days earlier than today
        LocalDate oneHundredDayLater = today.minusDays(10000);
        System.out.println(oneHundredDayLater);
        System.out.println(oneHundredDayLater.getDayOfWeek());
    }

}
