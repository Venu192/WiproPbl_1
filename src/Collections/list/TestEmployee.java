package Collections.list;

public class TestEmployee {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101, "Sajid", "sajid@gmail.com", "Male", 45000);

        db.addEmployee(e1);

        e1.getEmployeeDetails();

        System.out.println();

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(101);
    }
}
