package lesson8;

public class Aspirant extends Student {
    @Override
    public int getScholarship() {
        if (this.getAverageMark() == 5.0) {
            return 200;
        } else {
            return 180;
        }
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }
}
