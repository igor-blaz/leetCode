package leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class P409LongestPalindrome {
    public static void main(String[] args) {
        String s = "aBba";
        int answer = longestPalindromeChatGPT(s);
        System.out.println(answer);
    }

    public static int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        if (chars.length == 1) return 1;

        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int answer = 0;
        for (Integer i : map.values()) {

            if (i % 2 == 0) {
                answer += i;
            } else {
                answer += i - 1;
            }

        }
        if (answer!= chars.length) {
            answer += 1;
        }
        return answer;
    }

    public static  int longestPalindromeChatGPT(String s) {

        int[] freq = new int[128];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int answer = 0;

        for (int count : freq) {
            answer += (count / 2) * 2;
            if (answer % 2 == 0 && count % 2 == 1) {
                answer++;
            }
        }

        return answer;
    }
}
