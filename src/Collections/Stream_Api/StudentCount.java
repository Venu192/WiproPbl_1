package Collections.Stream_Api;

import java.util.ArrayList;

class Student {

    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + mark;
    }
}

public class StudentCount {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Sajid", 80));
        list.add(new Student(2, "Rahul", 45));
        list.add(new Student(3, "Anitha", 67));
        list.add(new Student(4, "Suman", 35));
        list.add(new Student(5, "Ravi", 92));

        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Students Passed : " + count);
    }
}