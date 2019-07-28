package repeat.repeat10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(
                "Joy", "HU-14-1",
                3, new double[]{4, 5, 4, 5, 5}));
        students.add(new Student(
                "Boy", "HU-14-1",
                3, new double[]{3, 3, 3, 2, 3}));
        students.add(new Student(
                "Folk", "HU-14-1",
                3, new double[]{4, 3, 4, 3, 3}));
        students.add(new Student(
                "Goy", "HU-14-1",
                3, new double[]{4, 4, 4, 4, 5}));

        System.out.println(students);

        sendStudentDown(students);

        System.out.println(students);
    }

    private static void sendStudentDown(List<Student> students){
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()){
            Student currentStudent = studentIterator.next();
            if (currentStudent.getMidGrade() < 3){
                studentIterator.remove();
                System.out.println(currentStudent.getName() + " sent down");
            }
        }

    }
}
