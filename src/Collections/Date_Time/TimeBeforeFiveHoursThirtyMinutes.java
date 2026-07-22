package Collections.Date_Time;

import java.time.LocalTime;

public class TimeBeforeFiveHoursThirtyMinutes {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();

        LocalTime before = now.minusHours(5).minusMinutes(30);

        System.out.println("Current Time : " + now);

        System.out.println("5 Hours 30 Minutes Before : " + before);
    }
}
