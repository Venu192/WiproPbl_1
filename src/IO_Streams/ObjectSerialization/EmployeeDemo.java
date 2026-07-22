package IO_Streams.ObjectSerialization;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeDemo {

    public static void main(String[] args) {

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            Employee emp = new Employee(
                    "Sajid",
                    sdf.parse("15/08/2005"),
                    "AI & DS",
                    "Software Engineer",
                    65000
            );

            // Serialization
            FileOutputStream fos = new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
            fos.close();

            System.out.println("Object Serialized Successfully.");

            // Deserialization
            FileInputStream fis = new FileInputStream("data");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee e = (Employee) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("\nEmployee Details");
            System.out.println("----------------------");
            System.out.println("Name        : " + e.getName());
            System.out.println("DOB         : " + sdf.format(e.getDateOfBirth()));
            System.out.println("Department  : " + e.getDepartment());
            System.out.println("Designation : " + e.getDesignation());
            System.out.println("Salary      : " + e.getSalary());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
