package IO_Streams.Project;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    try {

                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Employee Age: ");
                        int age = sc.nextInt();

                        System.out.print("Enter Employee Salary: ");
                        double salary = sc.nextDouble();

                        Employee emp = new Employee(id, name, age, salary);

                        File file = new File("employee.dat");

                        ArrayList<Employee> list = new ArrayList<>();

                        if (file.exists()) {
                            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                                list = (ArrayList<Employee>) ois.readObject();
                            } catch (Exception e) {
                            }
                        }

                        list.add(emp);

                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
                        oos.writeObject(list);
                        oos.close();

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    break;

                case 2:

                    try {

                        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.dat"));

                        ArrayList<Employee> list = (ArrayList<Employee>) ois.readObject();

                        System.out.println("-----Report-----");

                        for (Employee e : list)
                            System.out.println(e);

                        System.out.println("-----End of Report-----");

                        ois.close();

                    } catch (Exception e) {
                        System.out.println("No Records Found");
                    }

                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
