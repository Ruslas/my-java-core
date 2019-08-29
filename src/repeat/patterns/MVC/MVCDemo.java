package repeat.patterns.MVC;

public class MVCDemo {
    public static void main(String[] args) {
        Schoolchild model = new Schoolchild.Builder().
                withName("Lass").
                withClassGrade('A').
                withYearOfStudying(6).
                withGrads(11, 10, 11, 9, 10, 11, 12).build();

        SchoolchildController schoolchildController =
                new SchoolchildController(model, new SchoolchildView());

        schoolchildController.updateView();

        schoolchildController.setSchoolchildGrads(10, 11, 11, 11, 12, 12);
        schoolchildController.SchoolchildToNextYear();
        schoolchildController.SchoolchildTransferToClass('B');
        schoolchildController.updateView();
    }
}
