package Collections.Stream_Api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

    int empNo;
    String name;
    int age;
    String location;

    Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    @Override
    public String toString() {
        return empNo + " " + name + " " + age + " " + location;
    }
}

public class EmployeeFilter {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Sajid", 22, "Hyderabad"));
        list.add(new Employee(102, "Rahul", 24, "Pune"));
        list.add(new Employee(103, "Anitha", 23, "Chennai"));
        list.add(new Employee(104, "Suman", 25, "Pune"));
        list.add(new Employee(105, "Ravi", 21, "Delhi"));

        List<Employee> puneEmployees = list.stream()
                .filter(e -> e.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        System.out.println("Employees from Pune:");

        puneEmployees.forEach(System.out::println);
    }
}
