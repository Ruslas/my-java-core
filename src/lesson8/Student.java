package lesson8;

public class Student {
    private String firstName, lastName, group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {
        this.firstName = "Андрей";
        this.lastName = "Гнатюк";
        this.group = "НТ-17-3";
        this.averageMark = 4.5;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        if (this.getAverageMark() == 5.0) {
            return 100;
        } else {
            return 80;
        }
    }

    public void printStudent() {
        System.out.println("Имя - " + firstName + ", Фамилия - " + lastName +
                ", Группа - " + group + ", Средний бал - " + averageMark);
    }
}
