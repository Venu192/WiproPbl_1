package Collections.list.employeVector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employer> v = new Vector<>();

        v.add(new Employer(101, "Sajid", 45000));
        v.add(new Employer(102, "Rahul", 38000));
        v.add(new Employer(103, "Anitha", 50000));

        System.out.println("Using Iterator");

        Iterator<Employer> it = v.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());
        }

        System.out.println();

        System.out.println("Using Enumeration");

        Enumeration<Employer> e = v.elements();

        while (e.hasMoreElements()) {

            System.out.println(e.nextElement());
        }
    }
}
