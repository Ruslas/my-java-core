package repeat.repeat10;

import java.util.Arrays;

public class Student {
    private String name;
    private String group;
    private int year;
    private double[] grades;
    private double midGrade;

    public Student() {
    }

    public Student(String name, String group, int year, double[] grades) {
        this.name = name;
        this.group = group;
        this.year = year;
        this.grades = grades;
        this.midGrade = computeMidGrade(grades);
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double getMidGrade() {
        return midGrade;
    }

    public void setMidGrade(double midGrade) {
        this.midGrade = computeMidGrade(this.grades);
    }

    private double computeMidGrade(double... grades){
        double sum = 0;
        for (double grade: grades){
            sum += grade;
        }
        return sum/grades.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (year != student.year) return false;
        if (Double.compare(student.midGrade, midGrade) != 0) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (group != null ? !group.equals(student.group) : student.group != null) return false;
        return Arrays.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (group != null ? group.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + Arrays.hashCode(grades);
        temp = Double.doubleToLongBits(midGrade);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", year=" + year +
                ", grades=" + Arrays.toString(grades) +
                ", midGrade=" + midGrade +
                '}';
    }
}
