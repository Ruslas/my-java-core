package lesson12.homework;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = "Object oriented programming refers to a type of " +
                "computer programming (software design) in which programmers define not " +
                "only the data type of a data structure, but also the types of operations " +
                "(functions) that can be applied to the data structure. If you are new to " +
                "object oriented programming languages, you will need to know a few basics " +
                "before you can get started with code. ";
        System.out.println(replace(str, "Object oriented programming", "OOP"));
    }

    private static String replace(String str, String before, String after) {
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder stringBuilderLower = new StringBuilder(str.toLowerCase());
        int pos = 0;
        while ((pos = stringBuilderLower.indexOf(before.toLowerCase())) != -1) {
            stringBuilder.delete(pos, pos + before.length());
            stringBuilder.insert(pos, after);
            stringBuilderLower.delete(pos, pos + before.length());
            stringBuilderLower.insert(pos, after);
        }
        return stringBuilder.toString();
    }
}
