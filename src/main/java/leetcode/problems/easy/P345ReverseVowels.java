package leetcode.problems.easy;

import java.util.*;

public class P345ReverseVowels {
    public static void main(String[] args) {
        String string = "oggy";
        String answer = reverseVowels(string);
        System.out.println(answer);
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        List<Character> foundChars = new ArrayList<>();
        List<Integer> foundIndexes = new ArrayList<>();
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y');
        for (int i = 0; i < chars.length; i++) {
            if (vowels.contains(chars[i])) {
                foundChars.add(chars[i]);
                foundIndexes.add(i);
            }
        }
        List<Integer> reversed = foundIndexes.reversed();
        for (Character character : foundChars) {
            chars[reversed.getFirst()] = character;
            reversed.removeFirst();
        }

        return new String(chars);
    }


}
