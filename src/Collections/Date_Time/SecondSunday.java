package Collections.Date_Time;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SecondSunday {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now().plusMonths(1).withDayOfMonth(1);

        while (date.getDayOfWeek() != DayOfWeek.SUNDAY) {
            date = date.plusDays(1);
        }

        LocalDate secondSunday = date.plusWeeks(1);

        System.out.println("Second Sunday of Next Month : " + secondSunday);
    }
}
