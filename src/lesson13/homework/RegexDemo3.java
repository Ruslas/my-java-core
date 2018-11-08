package lesson13.homework;

import java.util.Arrays;

public class RegexDemo3 {
    public static void main(String[] args) {
        String str = "Anyone who reads Old and Middle English literary texts will be " +
                "familiar with the mid-brown volumes of the EETS, with the symbol of " +
                "Alfred's jewel embossed on the front cover.";
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(MinDifferentSymbolsWord(str));
    }

    private static String MinDifferentSymbolsWord(String str) {
        String[] words = str.split(" ");
        int minLength = 999;
        String minWord = "";
        for (String word : words) {
            StringBuilder unique = new StringBuilder();
            String c;
            for (int i = 0; i < word.length(); i++) {
                c = String.valueOf(word.charAt(i));
                if (unique.indexOf(c) == -1)
                    unique.append(c);
            }
            if (unique.length() < minLength){
                minLength = unique.length();
                minWord = word;
            }
        }
        return minWord;
    }
}
