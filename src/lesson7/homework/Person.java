package lesson7.homework;

import java.text.Format;
import java.util.Formatter;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return fullName != null ? fullName.equals(person.fullName) : person.fullName == null;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return String.format("Person{fullName='%s', age=%d}", fullName, age);
    }
}
