package lesson7.homework;

public class Person {
    private String fullName;
    private int age;

    Person() {
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println("Такой-то " + fullName + " двигается");
    }

    public void talk() {
        System.out.println("Такой-то " + fullName + " говорит");
    }

    public void printPerson() {
        System.out.println(getFullName() + " " + getAge());
    }
}
