package repeat.patterns.MVC;

public class Schoolchild {
    private String name;
    private int[] grads;
    private char classGrade;
    private int yearOfStudying;

    public String getName() {
        return name;
    }

    public int[] getGrads() {
        return grads;
    }

    public char getClassGrade() {
        return classGrade;
    }

    public int getYearOfStudying() {
        return yearOfStudying;
    }

    public void toNextYear(){
        this.yearOfStudying++;
    }

    public void transferToClass(char classGrade){
        this.classGrade = classGrade;
    }

    public void setGrads(int[] grads) {
        this.grads = grads;
    }

    public static class Builder {
        private Schoolchild newSchoolchild;

        public Builder() {
            this.newSchoolchild = new Schoolchild();
        }

        public Builder withName(String name) {
            newSchoolchild.name = name;
            return this;
        }

        public Builder withGrads(int... grads) {
            newSchoolchild.grads = grads;
            return this;
        }

        public Builder withClassGrade(char classGrade) {
            if (classGrade >= 'A' && classGrade <= 'F')
                newSchoolchild.classGrade = classGrade;
            else System.out.println("ClassGradeError!!!");
            return this;
        }

        public Builder withYearOfStudying(int yearOfStudying) {
            if (yearOfStudying > 0 && yearOfStudying <= 12)
                newSchoolchild.yearOfStudying = yearOfStudying;
            else System.out.println("YearOfStudyingError");
            return this;
        }

        public Schoolchild build(){
            return this.newSchoolchild;
        }
    }
}
