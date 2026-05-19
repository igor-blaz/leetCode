package leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class P392IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
//
//    class Solution {
//        public boolean isSubsequence(String s, String t) {
//            int i = 0; // индекс по s
//            int j = 0; // индекс по t
//
//            while (i < s.length() && j < t.length()) {
//                if (s.charAt(i) == t.charAt(j)) {
//                    i++;
//                }
//                j++;
//            }
//
//            return i == s.length();
//        }
//    }

    public static boolean isSubsequence(String s, String t) {
        if (s.isBlank()) return true;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        List<Character> tList = new ArrayList<>();
        for (char c : tChars) {
            tList.add(c);
        }
        int trueCount = 0;
        for (char c : sChars) {
            tList = containsAfterIndex(tList, c);
            if (tList == null) {
                return false;
            }
            trueCount++;
        }

        System.out.println("TLIST " + tList);
        System.out.println(trueCount + " and sLength " + s.length());
        return trueCount == s.length();


    }

    public static List<Character> containsAfterIndex(List<Character> list,
                                                     Character character) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(character)) {
                System.out.println("Рассматриваем "+ character + " в " + list);
                System.out.println("Возвращаем " + list.subList(i+1, list.size()));
                return list.subList(i+1, list.size());
            }
        }
        return null;
    }

}
