package lesson12.classwork;

import java.util.Arrays;

/**
 * Created by student on 04.11.2018.
 */
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "ewref ewrqjvljwrq t3thtrjmytj ytutrutr y5y";
        System.out.println(getLastCharInStr(str1));
        String str2 = "I like Java Java Java Java sfsffw Java Java!!!";
        int pos = 0;
        String substring = "Java";
        int[] index = getAllSubstring(str2, pos, substring);

        System.out.println(Arrays.toString(index));

        System.out.println("Welcome to Kharkiv!!!".substring(11, 18));
        System.out.println("Hello".replace('l', 'w'));

        int a = 5, b = 56;
        String str4 = append(a, b);
        System.out.println(replaceDelIns(str4));
        System.out.println(replace(str4, "=", " равно "));
    }

    private static String replaceDelIns(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        int pos = 0;
        while ((pos = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.deleteCharAt(pos);
            stringBuilder.insert(pos, " равно ");
        }
        return stringBuilder.toString();
    }

    private static String replace(String str, String before, String after) {
        StringBuilder stringBuilder = new StringBuilder(str);
        int pos = 0;
        while ((pos = stringBuilder.indexOf(before)) != -1) {
            stringBuilder.replace(pos, pos + before.length(), after);
        }
        return stringBuilder.toString();
    }

    private static String append(int a, int b) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a).append('+').append(b).append('=').append(a + b).append("\n");
        stringBuilder.append(a).append('-').append(b).append('=').append(a - b).append("\n");
        stringBuilder.append(a).append('*').append(b).append('=').append(a * b).append("\n");
        return stringBuilder.toString();
    }

    private static int[] getAllSubstring(String str2, int pos, String substring) {
        int i = 0;
        int[] index = new int[str2.length() / substring.length()];
        while (pos < str2.length()) {
            index[i] = str2.indexOf(substring, pos);
            if (index[i] > 0) {
                pos = index[i] + substring.length();
                i++;
            } else break;
        }
        return index;
    }

    private static char getLastCharInStr(String str) {
        return str.charAt(str.length() - 1);
    }
}
