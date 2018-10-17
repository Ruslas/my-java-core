package lesson7.homework;

public class Person {
    protected String fullName;
    protected int age;

    protected Person() {
    }

    protected Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    protected String getFullName() {
        return fullName;
    }

    protected int getAge() {
        return age;
    }

    protected void setFullName(String fullName) {
        this.fullName = fullName;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected void move() {
        System.out.println("Такой-то " + fullName + " двигается");
    }

    protected void talk() {
        System.out.println("Такой-то " + fullName + " говорит");
    }

    protected void printPerson() {
        System.out.print(getFullName() + " " + getAge() + " года");
    }
}
