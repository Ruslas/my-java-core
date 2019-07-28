package repeat.repeat10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.split(",");
        Set<Integer> numbers = new HashSet<>();
        for (String s: strs){
            numbers.add(Integer.parseInt(s.trim()));
        }

        numbers.forEach((s) -> System.out.print(s + ", "));
    }
}
