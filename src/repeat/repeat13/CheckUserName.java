package repeat.repeat13;

public class CheckUserName {
    public static void main(String[] args) {
        String userName = "";

        try {
            userName = UserNameValidate.validate("Barashek007");
        } catch (UserNameException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(userName);
    }
}
