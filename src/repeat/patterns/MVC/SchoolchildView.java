package repeat.patterns.MVC;

import java.util.Arrays;

public class SchoolchildView {
    public void printSchoolchildIfo(String name,
                                    int[] grads,
                                    char classGrade,
                                    int yearOfStudying) {
        System.out.println("Schoolchild " + name +
                "\nGrads: " + Arrays.toString(grads) +
                "\nClass: " + yearOfStudying + "-" + classGrade);
    }
}
