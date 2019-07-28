package repeat.repeat10;

import repeat.repeat9.Box;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperationsDemo {
    public static void main(String[] args) {
        Set<String> firstSet = new HashSet<>();
        Set<String> secondSet = new HashSet<>();
        Set<Integer> thirdSet = new HashSet<>();
        Set<String> fourthSet = new TreeSet<>();
        Set<Box> fifthSet = new HashSet<>();
        firstSet.add("A");
        firstSet.add("B");
        firstSet.add("C");
        firstSet.add("D");
        firstSet.add("E");
        secondSet.add("F");
        secondSet.add("G");
        secondSet.add("H");
        secondSet.add("I");
        secondSet.add("A");
        secondSet.add("B");
        thirdSet.add(45);
        thirdSet.add(34);
        fourthSet.add("X");
        fourthSet.add("Y");
        fourthSet.add("Z");
        fifthSet.add(new Box(4, 5, 6, 7));
        fifthSet.add(new Box(2, 1, 8, 2));

        System.out.println(intersect(firstSet, secondSet));
        System.out.println(union(firstSet, secondSet, fourthSet, fifthSet, thirdSet));


    }

    private static Set union (Set<?>... sets){
        Set resultSet = new HashSet();
        for (Set set: sets){
            resultSet.addAll(set);
        }
        return resultSet;
    }

    private static Set intersect(Set<?>... sets){
        Set resultSet = new HashSet(sets[0]);
        for (Set set: sets){
            resultSet.retainAll(set);
        }
        return resultSet;
    }

}
