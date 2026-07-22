package Collections.Functional_Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {

    int id;
    String name;
    String location;
    double salary;

    Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class EmployeeLocation {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Sajid", "Hyderabad", 35000));
        list.add(new Employee(102, "Rahul", "Pune", 40000));
        list.add(new Employee(103, "Anitha", "Chennai", 38000));
        list.add(new Employee(104, "Suman", "Delhi", 42000));
        list.add(new Employee(105, "Ravi", "Bangalore", 39000));

        Function<Employee, String> function = e -> e.location;

        List<String> locations = list.stream()
                .map(function)
                .collect(Collectors.toList());

        System.out.println(locations);
    }
}
