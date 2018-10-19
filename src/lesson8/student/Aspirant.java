package lesson8.student;

public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        if (this.getAverageMark() == 5.0) {
            return 200;
        } else {
            return 180;
        }
    }

    @Override
    public void printStudent() {
        System.out.println("Имя - " + getFirstName() + ", Фамилия - " + getLastName() +
                ", Группа - " + getGroup() + ", Средний бал - " + getAverageMark() +
                ", Научная работа - " + getScientificWork());
    }
}
