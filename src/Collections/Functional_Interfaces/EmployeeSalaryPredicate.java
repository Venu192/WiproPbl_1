package Collections.Functional_Interfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

class EmployeeSalary {

    private int id;
    private String name;
    private double salary;

    EmployeeSalary(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeSalaryPredicate {

    public static void main(String[] args) {

        ArrayList<EmployeeSalary> list = new ArrayList<>();

        list.add(new EmployeeSalary(101, "Sajid", 9000));
        list.add(new EmployeeSalary(102, "Rahul", 18000));
        list.add(new EmployeeSalary(103, "Anitha", 8500));
        list.add(new EmployeeSalary(104, "Suman", 25000));
        list.add(new EmployeeSalary(105, "Ravi", 9500));

        Predicate<EmployeeSalary> salaryCheck = e -> e.getSalary() < 10000;

        System.out.println("Employees having salary less than 10000:");

        list.stream()
                .filter(salaryCheck)
                .forEach(e -> System.out.println(e.getName()));
    }
}
