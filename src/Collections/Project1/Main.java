package Collections.Project1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeSet<Employee> employees = new TreeSet<>();

        System.out.println("Enter the Number of Employees");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter Employee " + i + " Details:");

            System.out.println("Enter the Firstname");
            String firstName = sc.nextLine();

            System.out.println("Enter the Lastname");
            String lastName = sc.nextLine();

            System.out.println("Enter the Mobile");
            long mobile = Long.parseLong(sc.nextLine());

            System.out.println("Enter the Email");
            String email = sc.nextLine();

            System.out.println("Enter the Address");
            String address = sc.nextLine();

            employees.add(new Employee(firstName, lastName, mobile, email, address));
        }

        System.out.println("\nEmployee List:\n");

        System.out.printf("%-15s %-15s %-15s %-30s %-15s%n",
                "FirstName", "SecondName", "MobileNumber", "Email", "Address");

        for (Employee e : employees) {
            System.out.printf("%-15s %-15s %-15d %-30s %-15s%n",
                    e.getFirstName(),
                    e.getLastName(),
                    e.getMobileNumber(),
                    e.getEmail(),
                    e.getAddress());
        }

        sc.close();
    }
}
