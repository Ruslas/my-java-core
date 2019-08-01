package repeat.repeat11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollactionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> input = null; List<Integer> output = null;
        output = process(input);
    }

    private static <E extends Number> List<E> process(List<E> nums){
        List<E> n = new ArrayList<>();
        Iterator numsIterator = nums.iterator();
        while (numsIterator.hasNext()){
            Object o = numsIterator.next();
            if (o instanceof Number) {
                n.add((E) o);
            }
        }
        return n;
    }
}
