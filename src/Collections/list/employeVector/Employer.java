package Collections.list.employeVector;

public class Employer {

    int empId;
    String empName;
    float salary;

    Employer(int empId, String empName, float salary) {

        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public String toString() {

        return empId + "  " + empName + "  " + salary;
    }
}
