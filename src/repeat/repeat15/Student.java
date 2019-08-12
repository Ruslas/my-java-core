package repeat.repeat15;

public class Student extends Person {
    private double grade;

    public Student(String name, double grade) {
        super(name);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public void printInfo() {
        System.out.println("Students name: " + getName() + "\nGrade: " + grade);
    }

    public void printGrade(){
        System.out.println("Grade: " + grade);
    }
}
