package lesson16.homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Gosha", "KZ-15-1", 3, 4, 5, 3, 2, 4, 5);
        Student s2 = new Student("Kola", "KT-16-2", 2, 3, 5, 2, 2, 4, 4);
        Student s3 = new Student("Mexa", "KKG-14-7", 4, 2, 2, 3, 3, 4, 3);
        Student s4 = new Student("Petr", "GHR-15-3", 3, 4, 4, 3, 2, 4, 3);
        Student s5 = new Student("Lupin", "HOG-13-4", 5, 4, 3, 3, 1, 4, 5);
        Student s6 = new Student("Hagu", "KPT-15-1", 3, 1, 2, 3, 4, 5, 4);
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        System.out.println(students);
        students.removeIf(student -> !student.toNextYear());
        System.out.println(students);
        Student.printStudents(students, 4);
    }
}
