package lesson13.homework;

import java.util.Arrays;

public class RegexDemo5 {
    public static void main(String[] args) {
        String str = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554 88 7117 671 464 5789875";
        System.out.println(numericWords(str));
        System.out.println(palindromeWords(numericWords(str)));
    }

    private static String numericWords(String str) {
        StringBuffer numericWords = new StringBuffer();
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.matches("[0-9]+")) {
                numericWords.append(word).append(" ");
            }
        }
        return numericWords.toString();
    }

    private static String palindromeWords(String str) {
        StringBuilder palindromeWords = new StringBuilder();
        String[] words = str.split(" ");
        for (String word : words) {
            StringBuilder secondPart = new StringBuilder(word.substring(word.length() / 2));
            String fp;
            if (word.length() % 2 == 0) {
                fp = word.substring(0, word.length() / 2);
            } else {
                fp = word.substring(0, word.length() / 2 + 1);
            }
            String sp = secondPart.reverse().toString();
            System.out.println(fp + " - " + sp);
            if (fp.equals(sp)) {
                palindromeWords.append(word).append(" ");
            }
        }
        return palindromeWords.toString();
    }
}

