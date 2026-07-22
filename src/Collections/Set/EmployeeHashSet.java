package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Sajid");
        employees.add("Rahul");
        employees.add("Anitha");
        employees.add("Suman");

        Iterator<String> it = employees.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
