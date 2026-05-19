package leetcode.problems.easy;

import java.util.HashSet;
import java.util.Set;

public class P804UniqueMorseCode {
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (String s : words) {
            set.add(convert(s));
        }
        return set.size();
    }

    public static String convert(String word) {
        String[] morseAlphabet = {".-", "-...", "-.-."
                , "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-"
                , ".--", "-..-", "-.--", "--.."};
        char[] chars = word.toCharArray();
        String[] converted = new String[chars.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(morseAlphabet[chars[i] - 'a']);

        }

        System.out.println(sb.toString());
        return sb.toString();
    }

}
