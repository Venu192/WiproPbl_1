package Collections.Project5;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Box> set = new HashSet<>();

        System.out.println("Enter the number of Box");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the Box " + i + " details");

            System.out.println("Enter Length");
            double length = sc.nextDouble();

            System.out.println("Enter Width");
            double width = sc.nextDouble();

            System.out.println("Enter Height");
            double height = sc.nextDouble();

            Box box = new Box(length, width, height);

            set.add(box);
        }

        System.out.println("Unique Boxes in the Set are");

        for (Box b : set) {

            System.out.printf(
                    "Length =%.1f Width =%.1f Height =%.1f Volume =%.2f%n",
                    b.getLength(),
                    b.getWidth(),
                    b.getHeight(),
                    b.getVolume());
        }

        sc.close();
    }
}
