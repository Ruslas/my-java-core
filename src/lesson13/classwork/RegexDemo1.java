package lesson13.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c{1,3}ab");
        Matcher matcher = pattern.matcher("cccab");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}
