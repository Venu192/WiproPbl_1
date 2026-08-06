package milest1;
package com.wipro.task;

import com.wipro.task.exceptions.*;

public class StudentService {

    public String findGrade(Student student)
            throws NullStudentException,
                   NullNameException,
                   NullMarksArrayException {

        if (student == null)
            throw new NullStudentException();

        if (student.getName() == null)
            throw new NullNameException();

        if (student.getMarks() == null)
            throw new NullMarksArrayException();

        int total = 0;

        for (int mark : student.getMarks()) {
            total += mark;
        }

        double average = (double) total / student.getMarks().length;

        if (average >= 80)
            return "A";
        else if (average >= 60)
            return "B";
        else if (average >= 40)
            return "C";
        else if (average >= 20)
            return "D";
        else
            return "F";
    }

    public int findNumberOfNullNames(Student[] students) {

        int count = 0;

        for (Student s : students) {
            if (s != null && s.getName() == null)
                count++;
        }

        return count;
    }

    public int findNumberOfNullObjects(Student[] students) {

        int count = 0;

        for (Student s : students) {
            if (s == null)
                count++;
        }

        return count;
    }

    public int findNumberOfNullMarks(Student[] students) {

        int count = 0;

        for (Student s : students) {
            if (s != null && s.getMarks() == null)
                count++;
        }

        return count;
    }
}
