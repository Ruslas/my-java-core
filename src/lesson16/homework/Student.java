package lesson16.homework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class Student {
    private String name;
    private String group;
    private int yearOfStudying;
    private double[] marks;

    public Student(String name, String group, int yearOfStudying, double... marks) {
        this.name = name;
        this.group = group;
        if (yearOfStudying > 0 && yearOfStudying <= 6) {
            this.yearOfStudying = yearOfStudying;
        }
        this.marks = marks;
    }

    public Student(String name, String group, int yearOfStudying) {
        this.name = name;
        this.group = group;
        if (yearOfStudying > 0 && yearOfStudying <= 6) {
            this.yearOfStudying = yearOfStudying;
        }
    }

    public double averageMark() {
        double av = 0;
        for (int i = 0; i < marks.length; i++) {
            av += marks[i];
        }
        return av / marks.length;
    }

    public boolean toNextYear() {
        if (yearOfStudying > 0 && yearOfStudying <= 6 && this.averageMark() >= 3) {
            yearOfStudying++;
            return true;
        } else if (yearOfStudying > 6 && this.averageMark() >= 3) {
            System.out.println("Congratulations " + name + " on the release");
            return false;
        } else {
            System.out.println("Go to school, " + this.getName());
            return false;
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student s = iter.next();
            if (s.getYearOfStudying() == course) {
                System.out.println(s);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getYearOfStudying() {
        return yearOfStudying;
    }

    public void setYearOfStudying(int yearOfStudying) {
        if (yearOfStudying > 0 && yearOfStudying <= 6) {
            this.yearOfStudying = yearOfStudying;
        }
    }

    public double[] getMarks() {
        return marks;
    }

    public void setMarks(double... marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (yearOfStudying != student.yearOfStudying) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (group != null ? !group.equals(student.group) : student.group != null) return false;
        return Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (group != null ? group.hashCode() : 0);
        result = 31 * result + yearOfStudying;
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", yearOfStudying=" + yearOfStudying +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
