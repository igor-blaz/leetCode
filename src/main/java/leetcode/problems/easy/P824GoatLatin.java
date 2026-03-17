package leetcode.problems.easy;

public class P824GoatLatin {
    public static void main(String[] args) {
        String s = "I speak Goat Latin";
        String answer = toGoatLatin(s);
        System.out.println(answer);
    }

    public static String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            StringBuilder goatString = goatization(words[i], i);
            sb.append(goatString);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public static boolean isVowel(char c) {
        switch (c) {
            case 'a', 'e', 'i', 'o', 'u',
                 'A', 'E', 'I', 'O', 'U' -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }

    public static StringBuilder goatization(String word, int wordIndex) {
        char c = word.charAt(0);

        StringBuilder stringBuilder = new StringBuilder(word);

        if (!isVowel(c)) {
            char nonVowel = stringBuilder.charAt(0);
            stringBuilder.deleteCharAt(0);
            stringBuilder.append(nonVowel);
        }
        return maaaaaaaMaker(stringBuilder, wordIndex);
    }

    public static StringBuilder maaaaaaaMaker(StringBuilder stringBuilder,
                                              int wordIndex) {
        stringBuilder.append("maa");
        while (wordIndex != 0) {
            stringBuilder.append("a");
            wordIndex--;
        }
        return stringBuilder;
    }
}
