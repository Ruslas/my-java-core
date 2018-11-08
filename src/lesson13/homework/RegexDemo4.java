package lesson13.homework;

public class RegexDemo4 {
    public static void main(String[] args) {
        String str = "One two three раз два три one1 two2 123 latin";
        System.out.println(latinWords(str));
        System.out.println(countLatinWords(str));
    }

    private static int countLatinWords(String str){
        int count = 0;
        String[] words = str.split(" ");
        for (String word: words){
            if (word.matches("[a-zA-z]+")){
               count++;
            }
        }
        return count;
    }

    private static String latinWords(String str){
        StringBuilder latinWords = new StringBuilder();
        String[] words = str.split(" ");
        for (String word: words){
            if (word.matches("[a-zA-z]+")){
                latinWords.append(word).append(" ");
            }
        }
        return latinWords.toString();
    }
}
