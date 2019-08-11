package repeat.repeat13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static repeat.repeat13.UserNameException.*;

public class UserNameValidate {
    public static String validate(String userName) throws UserNameException{
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(userName);
        if (userName.length() < 5){
            throw new UserNameException(TOO_SHORT_MASSAGE);
        } else if (!userName.matches("[A-Za-z0-9]+|[А-Яа-я0-9]+")){
            throw new UserNameException(FORBIDDEN_SYMBOL_MASSAGE);
        } else if (matcher.lookingAt()){
            throw new UserNameException(STARTS_WITH_DIGIT_MASSAGE);
        }
        return userName;
    }
}
