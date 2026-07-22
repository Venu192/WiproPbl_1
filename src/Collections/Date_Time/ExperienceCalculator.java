package Collections.Date_Time;

import java.time.LocalDate;
import java.time.Period;

public class ExperienceCalculator {

    public static void main(String[] args) {

        // Change this joining date if needed
        LocalDate joiningDate = LocalDate.of(2022, 1, 15);

        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("Experience");

        System.out.println("Years  : " + experience.getYears());

        System.out.println("Months : " + experience.getMonths());

        System.out.println("Days   : " + experience.getDays());
    }
}
