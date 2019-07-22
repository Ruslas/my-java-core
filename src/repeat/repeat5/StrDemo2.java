package repeat.repeat5;

public class StrDemo2 {
    public static void main(String[] args) {
        String str = "Object-oriented programming is a programming " +
                "language model organized around objects rather than " +
                "\"actions\" and data rather than logic. " +
                "Object-oriented programming blabla. " +
                "Object-oriented programming bla";
        String before = "Object-oriented programming";
        String after = "OOP";

        System.out.println(replaceWith(str, before, after));
    }

    public static String replaceWith(String str, String before, String after) {
        int index = 0;
        boolean replace = false;
        while (index != -1){
            index = str.indexOf(before, index);
            if (index > -1 && replace) {
                str = str.substring(0, index) + after + str.substring(index + before.length());
                index += after.length();
                replace = false;
            } else if (index > -1 && !replace) {
                replace = true;
                index += before.length();
            }
        }
        return str;
    }
}
