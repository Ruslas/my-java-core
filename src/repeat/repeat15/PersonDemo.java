package repeat.repeat15;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("Greg");
        Person student = new Student("Kil", 4.5);
        Student student1 = new Student("Hog", 3.9);

        person.printInfo();
        student.printInfo();
        student1.printInfo();
    }
}
