package repeat.patterns.MVC;

public class SchoolchildController {
    private Schoolchild model;
    private SchoolchildView view;

    public SchoolchildController(Schoolchild model, SchoolchildView view) {
        this.model = model;
        this.view = view;
    }

    public String getSchoolchildName() {
        return model.getName();
    }

    public int[] getSchoolchildGrads() {
        return model.getGrads();
    }

    public char getSchoolchildClassGrade() {
        return model.getClassGrade();
    }

    public int getSchoolchildYearOfStudying() {
        return model.getYearOfStudying();
    }

    public void setSchoolchildGrads(int... grads) {
        model.setGrads(grads);
    }

    public void SchoolchildToNextYear() {
        model.toNextYear();
    }

    public void SchoolchildTransferToClass(char classGrade) {
        model.transferToClass(classGrade);
    }

    public void updateView() {
        view.printSchoolchildIfo(
                model.getName(),
                model.getGrads(),
                model.getClassGrade(),
                model.getYearOfStudying());
    }
}
