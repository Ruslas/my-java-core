package lesson12.homework;

public class StringDemo3 {
    public static void main(String[] args) {
        String[] strs = {"apparent",
                "apparently",
                "appeal",
                "appear",
                "appearance",
                "appreciate",
                "approach",
                "approval",
                "characteristic"};
        for (String str : strs) {
            System.out.println(getTwoMiddleChar(str));
        }
    }

    private static String getTwoMiddleChar(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.substring((stringBuilder.length() / 2 - 1), (stringBuilder.length() / 2 + 1)).toString();
    }
}
