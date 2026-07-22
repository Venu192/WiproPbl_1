package Oops_Inheritence.Optional_Class;

import java.util.Optional;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee emp = null;

        try {

            Employee employee = Optional.ofNullable(emp)
                    .orElseThrow(() ->
                            new InvalidEmployeeException("Employee is null"));

            System.out.println(employee.getName());

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}
