package Java_Fundamentals.Flow_Controls;
import java.util.Scanner;
public class InterestPercent {
    public static void main(String[] args) {

        String gender = args[0];
        int age = Integer.parseInt(args[1]);

        if (gender.equals("Female")) {
            if (age >= 1 && age <= 58) {
                System.out.println("Interest = 8.2%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Interest = 9.2%");
            }
        } else if (gender.equals("Male")) {
            if (age >= 1 && age <= 58) {
                System.out.println("Interest = 8.4%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Interest = 10.5%");
            }
        }
    }
}

