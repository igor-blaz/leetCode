package leetcode.problems.easy;

import java.util.*;

public class P290WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        boolean answer = wordPattern(pattern, s);
        System.out.println(answer);
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        Map<Character, String> dictionary = new HashMap<>(words.length);
        for (int i = 0; i < words.length; i++) {
            dictionary.put(pattern.charAt(i), words[i]);
        }
        Set<String> values = new HashSet<>(dictionary.values());
        if(values.size()!= dictionary.size())return false;
        String[] check = new String[words.length];
        char[] patternChars = pattern.toCharArray();
        for (int i = 0; i < words.length; i++) {
            String string = dictionary.get(patternChars[i]);
            check[i] = string;
        }
        System.out.println("dictionary " + dictionary);
        System.out.println("check " + Arrays.toString(check));
        System.out.println("words " + Arrays.toString(words));

        return Arrays.equals(check, words);
    }
}
