package repeat.repeat5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrLatianDemo {
    public static void main(String[] args) {
        String stringPattern = "[a-zA-Z]+\\s+";
        String text = "One two three раз два три one1 be  two2 123";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(),
                    matcher.end()));
        }

    }
}
