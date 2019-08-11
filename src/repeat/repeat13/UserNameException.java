package repeat.repeat13;

public class UserNameException extends Exception {
    public static final String TOO_SHORT_MASSAGE = "Имя слишком короткое!";
    public static final String FORBIDDEN_SYMBOL_MASSAGE =
            "Имя должно состоть только из латинских ИЛИ русских букв алфавита!";
    public static final String STARTS_WITH_DIGIT_MASSAGE = "Имя не должно начинаться с цифр!";

    public UserNameException(String message) {
        super(message);
    }
}
