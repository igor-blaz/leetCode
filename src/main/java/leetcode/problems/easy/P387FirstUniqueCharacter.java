package leetcode.problems.easy;

import java.util.*;

public class P387FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqCharChatGPT(String s) {
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> repeats = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            repeats.put(c, 0);
        }
        for (char c : chars) {
            int repeatCount = repeats.get(c);
            repeats.put(c, repeatCount + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            if (repeats.get(chars[i]) == 1) return i;

        }
        return -1;
    }

}
