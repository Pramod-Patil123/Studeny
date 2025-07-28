package MyFirstJavaProject;

import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " - " + marks;
    }
}

public class SortStudentsByMarks {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pramod", 85));
        students.add(new Student("Amit", 92));
        students.add(new Student("Riya", 76));
        students.add(new Student("Nisha", 89));

        students.sort(Comparator.comparingInt(s -> s.marks));

        System.out.println("Sorted Students by Marks:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
